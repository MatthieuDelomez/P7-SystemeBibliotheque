
package com.client.action;

import com.biblio.BibliothequeResponse;
import com.biblio.BibliothequeServices;
import com.biblio.BibliothequeServicesService;
import com.biblio.DocumentResponse;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;


public class RechercheAction extends ActionSupport {
    
       BibliothequeServicesService bibliothequeServicesService= new BibliothequeServicesService();
       BibliothequeServices port =  bibliothequeServicesService.getBibliothequeServicesPort();


   //=========Attributs=============
       
       private int refOuvrage;
       private int refBibliotheque;
       
       private String nomOuvrage;
       private String quantiteTotal;
       
       
   //=========Getters & Setters=============

    public int getRefOuvrage() {
        return refOuvrage;
    }

    public void setRefOuvrage(int refOuvrage) {
        this.refOuvrage = refOuvrage;
    }

    public int getRefBibliotheque() {
        return refBibliotheque;
    }

    public void setRefBibliotheque(int refBibliotheque) {
        this.refBibliotheque = refBibliotheque;
    }

    public String getNomOuvrage() {
        return nomOuvrage;
    }

    public void setNomOuvrage(String nomOuvrage) {
        this.nomOuvrage = nomOuvrage;
    }

    public String getQuantiteTotal() {
        return quantiteTotal;
    }

    public void setQuantiteTotal(String quantiteTotal) {
        this.quantiteTotal = quantiteTotal;
    }

       
    public String doSearchBook() {
        
   String vResult = ActionSupport.INPUT;
   

   
                      
                      try {
   
                       if(!StringUtils.isAllEmpty(nomOuvrage)){
       
                      port.searchBook(nomOuvrage);
    
                      vResult = ActionSupport.SUCCESS;
       
                       }
                      
                      
                       } catch (Exception pe){
                           
                       this.addActionError("Rentrez le nom comple de l'ouvrage");
                      System.out.println("Pour afficher les documents");


                                                                  
                      }
                                                            
                      return vResult;
                         
                      }
    
}
