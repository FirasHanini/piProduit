/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstapplication.models;

/**
 *
 * @author Utilisateur 2
 */
public class ProduitVue {
    private String nom;
    private float prix;

   

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public ProduitVue(String nom, float prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public ProduitVue() {
    }
    
    
}
