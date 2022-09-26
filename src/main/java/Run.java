import fr.banque.Compte.Compte;
import fr.banque.Client.Client;

public class Run {
    public static void main(String[] args) {
        Compte compte1 = new Compte(1, 100);
        Compte compte2 = new Compte(2, 200);
        Client client1 = new Client("Dupont", "Jean", 25, 1, compte1, compte2);

        System.out.println(client1);
        
        Compte compte3 = new Compte(3, 300);
        client1.ajouterCompte(compte3);
        System.out.println(client1);
    }
}
