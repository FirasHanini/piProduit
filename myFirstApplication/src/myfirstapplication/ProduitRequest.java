/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstapplication;

/**
 *
 * @author Utilisateur 2
 */
public class ProduitRequest {
    private int id;
    private String nom;
    private float prix;

    public ProduitRequest(int id,String nom, float prix) {
        this.id=id;
        this.nom = nom;
        this.prix = prix;
    }

    public ProduitRequest() {
    }
    
    public int getId() {
        return id;
    }

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

    public void setId(int id) {
        this.id = id;
    }
    
}
