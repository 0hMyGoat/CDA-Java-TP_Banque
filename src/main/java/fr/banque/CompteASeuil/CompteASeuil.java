package fr.banque.CompteASeuil;

import fr.banque.BanqueException.BanqueException;
import fr.banque.Compte.Compte;
import fr.banque.CompteLimitable.CompteLimitable;

public class CompteASeuil extends Compte implements CompteLimitable {
    protected double seuil;

    public CompteASeuil() {
        super();
        this.setSeuil(0);
    }

    public CompteASeuil(int unNumero, double soldeInitial, double unSeuil) {
        super(unNumero, soldeInitial);
        this.setSeuil(unSeuil);
    }

    public double getSeuil() {
        return seuil;
    }

    protected void setSeuil(double seuil) {
        this.seuil = seuil;
    }

    /**
     * Retire un montant du solde du compte dans la limite du seuil
     * @throws BanqueException
     */
    @Override
    public void retirer(double unMontant) throws BanqueException {
        if (this.getSolde() - unMontant >= this.getSeuil()) {
            super.retirer(unMontant);
        }
    }
}
