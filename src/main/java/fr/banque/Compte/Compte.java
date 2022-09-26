package fr.banque.Compte;

public class Compte {

    int numero;
    double solde;

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

    private void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    private void setSolde(double solde) {
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
     */
    public void retirer(double unMontant) {
        this.setSolde(solde -= unMontant);
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
        } else {
            return true;
        }
    }
    
}
