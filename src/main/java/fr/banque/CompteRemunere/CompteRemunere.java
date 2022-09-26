package fr.banque.CompteRemunere;

import fr.banque.Compte.Compte;

public class CompteRemunere extends Compte {
    private double taux;

    public CompteRemunere() {
        super();
        this.setTaux(0);
    }

    public CompteRemunere(int unNumero, double soldeInitial, double unTaux) {
        super(unNumero, soldeInitial);
        this.setTaux(unTaux);
    }

    public double getTaux() {
        return taux;
    }

    private void setTaux(double taux) {
        this.taux = taux;
    }

    public double calculerInterets() {
        return this.getSolde() * this.getTaux();
    }

    public void verserInterets() {
        this.ajouter(this.calculerInterets());
    }

    public String toString() {
        return "CompteRemunere [taux=" + this.getTaux() + ", numero=" + this.getNumero() + ", solde=" + this.getSolde() + "]";
    }
    
}
