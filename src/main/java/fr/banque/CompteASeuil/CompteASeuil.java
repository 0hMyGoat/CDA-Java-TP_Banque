package fr.banque.CompteASeuil;

import fr.banque.Compte.Compte;

public class CompteASeuil extends Compte {
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

    public void retirer(double unMontant) {
        if (this.getSolde() - unMontant >= this.getSeuil()) {
            super.retirer(unMontant);
        }
    }
}
