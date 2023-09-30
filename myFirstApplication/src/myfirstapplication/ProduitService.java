/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstapplication;

import myfirstapplication.models.Produit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import myfirstapplication.models.ProduitVue;

/**
 *
 * @author Utilisateur 2
 */
public class ProduitService implements MyCrud {
     MyConnection conx=  MyConnection.getInstance();
     Connection myConx=conx.getConnection();

    @Override
    public int ajouterProduit(Produit p) {
        
        if(this.chercherProduit(p)!=null)
            return 0;
        
         try {
             String req ="INSERT INTO produit ( `nom`, `prix`) VALUES (?, ?);";
             PreparedStatement pS=myConx.prepareStatement(req);
             pS.setString(1, p.getNom());
             pS.setFloat(2, p.getPrix());
             int rowsAffected = pS.executeUpdate();
             
             
             
         } catch (SQLException ex) {
             Logger.getLogger(ProduitService.class.getName()).log(Level.SEVERE, null, ex);
         }
         return 1;
    }

    @Override
    public int supprimerProduit(Produit p) {
        
        Produit chercher =this.chercherProduit(p);
        if(chercher==null)
            return 0 ;
          try {
             String req ="DELETE FROM `produit` WHERE `produit`.`id` = ?;";
             PreparedStatement pS=myConx.prepareStatement(req);
             pS.setInt(1, chercher.getId());
             int rowsAffected = pS.executeUpdate();
             
             
             
         } catch (SQLException ex) {
             Logger.getLogger(ProduitService.class.getName()).log(Level.SEVERE, null, ex);
         }
        return 1;
    }

    @Override
    public Produit chercherProduit(Produit p) {
        int id=0;
        String nom="";
        float prix=(float)0;
        
        try {
            String req="SELECT * FROM `produit` WHERE `nom`=? and `prix`=?";
            PreparedStatement pS=myConx.prepareStatement(req);
            pS.setString(1, p.getNom());
            pS.setFloat(2, p.getPrix());
            ResultSet retour = pS.executeQuery();
            
            // if(retour.next()) { cree classe validation result
            
              id = retour.getInt("id"); // 
             nom = retour.getString("nom");
             prix = retour.getFloat("prix");
          
            
        } catch (SQLException ex) {
             Logger.getLogger(ProduitService.class.getName()).log(Level.SEVERE, null, ex);
         }
        return new Produit(nom,prix);
    }
    
    public ProduitVue chercherProduitVue(Produit p) {
        Produit produitTrouve= this.chercherProduit(p);
        return new ProduitVue(produitTrouve.getNom(),produitTrouve.getPrix());
    }

    @Override
    public ProduitVue updateProduit(Produit p) {
        Produit chercher =this.chercherProduit(p);
       /* if(chercher==null)  ValidtionResult */
       
       
            try {
            String req="UPDATE `produit` SET `nom` = ?, `prix` = ? WHERE `produit`.`id` = ?;";
            PreparedStatement pS=myConx.prepareStatement(req);
            pS.setString(1, p.getNom());
            pS.setFloat(2, p.getPrix());
            pS.setInt(3, chercher.getId());
            ResultSet retour = pS.executeQuery();
            
            // if(retour.next()) { cree classe validation result
            
             
          
            
        } catch (SQLException ex) {
             Logger.getLogger(ProduitService.class.getName()).log(Level.SEVERE, null, ex);
         }
            return new ProduitVue(p.getNom(),p.getPrix());
    }
    
    
     
     
    
}
