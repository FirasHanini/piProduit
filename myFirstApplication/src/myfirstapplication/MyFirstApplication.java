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
public class MyFirstApplication {

    
            
            
    public static void main(String[] args) {
        
        Produit p = new Produit("adqdqs",(float)1212.63);
        ProduitService service = new ProduitService();
        
        service.supprimerProduit(p);
        
   
    }
    
}
