package fr.banque.CompteASeuil;

import fr.banque.Compte.Compte;
import fr.banque.CompteLimitable.CompteLimitable;

public class CompteASeuil extends Compte implements CompteLimitable {
    private double seuil;

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

    private void setSeuil(double seuil) {
        this.seuil = seuil;
    }

    /**
     * Retire un montant du solde du compte dans la limite du seuil
     */
    @Override
    public void retirer(double unMontant) {
        if (this.getSolde() - unMontant >= this.getSeuil()) {
            super.retirer(unMontant);
        }
    }
}
