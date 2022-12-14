package fr.banque.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.Hashtable;

import fr.banque.Compte.Compte;

public class Client {
    protected String nom;
    protected String prenom;
    protected int age;
    protected int numero;
    protected Map<Integer, Compte> comptes;

    public Client() {
        this.setNom("");
        this.setPrenom("");
        this.setAge(0);
        this.setNumero(0);
        this.comptes = new Hashtable<Integer, Compte>();
    }

    public Client(String nom, String prenom, int age, int numero, Compte ...comptes) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setAge(age);
        this.setNumero(numero);
        this.setComptes(comptes);
    }

    public String getNom() {
        return nom;
    }

    private void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    protected void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    public int getNumero() {
        return numero;
    }

    protected void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Compte> getComptes() {
        return new ArrayList<Compte>(this.comptes.values());
    }

    protected void setComptes(Compte ...comptes) {
        this.comptes = new Hashtable<Integer, Compte>();
        Arrays.asList(comptes).forEach(compte -> this.comptes.put(compte.getNumero(), compte));
    }

    /**
     * Ajoute un compte à la liste des comptes du client
     * @param unCompte Compte à ajouter
     */
    public void ajouterCompte(Compte unCompte) {
        this.comptes.put(unCompte.getNumero(), unCompte);
        // Exercice 9 : Pas besoin de lever une exception car le tableau est dynamique
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj.getClass() != this.getClass()) {
            return false;
        } else if (this.getNumero() != ((Client) obj).getNumero()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Client [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", numero=" + numero + ", comptes=" + comptes + "]";
    }

}
