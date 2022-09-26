package fr.banque.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import fr.banque.Compte.Compte;

public class Client {
    private String nom;
    private String prenom;
    private int age;
    private int numero;
    private ArrayList<Compte> comptes;

    public Client() {
        this.setNom("");
        this.setPrenom("");
        this.setAge(0);
        this.setNumero(0);
        this.comptes = new ArrayList<Compte>();
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

    private void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public int getNumero() {
        return numero;
    }

    private void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Compte> getComptes() {
        return comptes;
    }

    private void setComptes(Compte ...comptes) {
        this.comptes = new ArrayList<Compte>(Arrays.asList(comptes));
    }

    public void ajouterCompte(Compte unCompte) {
        this.comptes.add(unCompte);
    }
    
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Client client = (Client) obj;
        return (this.nom == client.nom && this.prenom == client.prenom && this.age == client.age && this.numero == client.numero && this.comptes == client.comptes);
    }

    public String toString() {
        return "Client [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", numero=" + numero + ", comptes=" + comptes + "]";
    }

}