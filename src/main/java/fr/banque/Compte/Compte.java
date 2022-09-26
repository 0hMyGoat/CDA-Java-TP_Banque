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

    public void ajouter(double unMontant) {
        this.solde += unMontant;
    }

    public void retirer(double unMontant) {
        this.setSolde(solde -= unMontant);
    }

    public String toString() {
        return "Compte [numero=" + numero + ", solde=" + solde + "]";
    }

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
