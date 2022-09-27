package fr.banque.CompteASeuilRemunere;

import fr.banque.CompteLimitable.CompteLimitable;
import fr.banque.CompteRemunere.CompteRemunere;

public class CompteASeuilRemunere extends CompteRemunere implements CompteLimitable  {
    private double seuil;

    public CompteASeuilRemunere() {
        super();
        this.setSeuil(0);
    }

    public CompteASeuilRemunere(int unNumero, double soldeInitial, double unSeuil, double unTaux) {
        super(unNumero, soldeInitial, unTaux);
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
