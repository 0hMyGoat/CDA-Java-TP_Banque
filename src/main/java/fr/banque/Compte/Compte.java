package fr.banque.Compte;

import fr.banque.BanqueException.BanqueException;

public class Compte {

    private int numero;
    private double solde;

    public Compte(){
        this.setNumero(0);
        this.setSolde(0);
    }

    public Compte(int unNumero, double soldeInitial) {
        this.setNumero(unNumero);
        this.setSolde(soldeInitial);
    }

    public int getNumero() {
        return numero;
    }

    protected void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    protected void setSolde(double solde) {
        this.solde = solde;
    }

    /**
     * Ajoute un montant au solde du compte
     * @param unMontant thunasse à ajouter
     */
    public void ajouter(double unMontant) {
        this.solde += unMontant;
    }

    /**
     * Retire un montant du solde du compte
     * @param unMontant Thunasse à retirer
     * @throws BanqueException
     */
    public void retirer(double unMontant) throws BanqueException {
        if (this.getSolde() - unMontant >= 0) {
            this.solde -= unMontant;
        } else {
            throw new BanqueException("Solde insuffisant");
        }
    }

    @Override
    public String toString() {
        return "Compte [numero=" + numero + ", solde=" + solde + "]";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj.getClass() != this.getClass()) {
            return false;
        } else if (((Compte) obj).getNumero() == this.getNumero()) {
            return true;
        } else {
            return false;
        }
    }
    
}
