/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstapplication;

import myfirstapplication.models.Produit;
import myfirstapplication.models.ProduitVue;

/**
 *
 * @author Utilisateur 2
 */
public interface MyCrud {
    
    public int ajouterProduit(Produit p);
    public int supprimerProduit(Produit p);
    public Produit chercherProduit (Produit p);
    public ProduitVue updateProduit (Produit p);
    
}
