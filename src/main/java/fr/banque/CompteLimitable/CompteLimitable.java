package fr.banque.CompteLimitable;
import fr.banque.BanqueException.BanqueException;

public interface CompteLimitable {
    /**
     * Retire un montant du solde du compte dans la limite du seuil
     * @param unMontant Montant à retirer
     * @throws BanqueException Si le montant à retirer est supérieur au solde
     */
    public void retirer(double unMontant) throws BanqueException;
    // L'exercice demande de mettre les getters et setters dans l'interface
    // mais je ne vois pas l'intérêt <3
}
