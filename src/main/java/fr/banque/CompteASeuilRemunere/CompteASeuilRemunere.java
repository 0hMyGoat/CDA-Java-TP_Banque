package fr.banque.CompteASeuilRemunere;

import fr.banque.BanqueException.BanqueException;
import fr.banque.CompteLimitable.CompteLimitable;
import fr.banque.CompteRemunere.CompteRemunere;

public class CompteASeuilRemunere extends CompteRemunere implements CompteLimitable  {
    protected double seuil;

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
        } else if (this.getSolde() - unMontant < this.getSeuil()) {
            throw new BanqueException("Le montant à retirer est supérieur au solde");
        } else if (unMontant < 0) {
            throw new BanqueException("Le montant à retirer est négatif");
        } else if (this.getSolde() - unMontant < 0) {
            throw new BanqueException("Il ne reste pas assez de thunasse dans le compte");
        }
    }

}
