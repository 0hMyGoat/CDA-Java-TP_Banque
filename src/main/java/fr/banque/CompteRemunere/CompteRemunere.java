package fr.banque.CompteRemunere;

import fr.banque.Compte.Compte;
import fr.banque.CompteRemunerable.CompteRemunerable;

public class CompteRemunere extends Compte  implements CompteRemunerable {
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

    public void setTaux(double taux) {
        this.taux = taux;
    }

    /**
     * Ajoute les intérêts au solde du compte
     * @return le solde avec intérêts
     */
    public double calculerInterets() {
        return this.getSolde() * this.getTaux();
    }

    /**
     * Ajoute les intérêts au solde du compte
     */
    public void verserInterets() {
        this.ajouter(this.calculerInterets());
    }

    @Override
    public String toString() {
        return "CompteRemunere [taux=" + this.getTaux() + ", numero=" + this.getNumero() + ", solde=" + this.getSolde() + "]";
    }
    
}
