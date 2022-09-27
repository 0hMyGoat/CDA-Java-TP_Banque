import fr.banque.BanqueException.BanqueException;
import fr.banque.Client.Client;
import fr.banque.Compte.Compte;
import fr.banque.CompteASeuil.CompteASeuil;
import fr.banque.CompteASeuilRemunere.CompteASeuilRemunere;
import fr.banque.CompteLimitable.CompteLimitable;
import fr.banque.CompteRemunerable.CompteRemunerable;
import fr.banque.CompteRemunere.CompteRemunere;

public class Run {
    public static void main(String[] args) {
        Compte compte1 = new CompteASeuil(1, 100, 10);
        Compte compte2 = new CompteRemunere(2, 100, 0.1);
        Compte compte3 = new CompteASeuilRemunere(3, 100, 10, 0.1);
        Client client1 = new Client("Dupont", "Jean", 25, 1, compte1, compte2, compte3);

        System.out.println(client1);

        client1.getComptes().forEach(compte -> {
            if (compte instanceof CompteRemunerable) {
                ((CompteRemunerable) compte).verserInterets();
            }
            if (compte instanceof CompteLimitable) {
                try {
                    ((CompteLimitable) compte).retirer(1000);
                } catch (BanqueException error) {
                    error.printStackTrace();
                }
            }
        });
        System.out.println(client1);
    }
}
