
package com.client.action;

import com.biblio.BibliothequeServices;
import com.biblio.BibliothequeServicesService;
import com.biblio.DocumentResponse;
import com.opensymphony.xwork2.ActionSupport;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.commons.lang3.StringUtils;


public class AddDocumentAction extends ActionSupport {
    
      BibliothequeServicesService bibliothequeServicesService= new BibliothequeServicesService();
      BibliothequeServices port =  bibliothequeServicesService.getBibliothequeServicesPort();


       //=========Attributs=============
    
       private int refOuvrage;
       private int refBibliotheque;
       
       private String nomOuvrage;
       private String quantiteTotal;
       
       //=========Elements Struts=============
       
       
       
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


    
    
    
    //=========Methodes=============
    
    public String doAddDocument() {
        
        String vResult = ActionSupport.INPUT;
        
        DocumentResponse documentResponse = new DocumentResponse();
        
        documentResponse.setRefbibliotheque(refBibliotheque);
        documentResponse.setNomouvrage(nomOuvrage);
        documentResponse.setQuantitetotal(quantiteTotal);
        
        
        try {
            
        if(!StringUtils.isAllEmpty(nomOuvrage, quantiteTotal)) {
                   
            
        
        port.addDocument( refBibliotheque, nomOuvrage, quantiteTotal);
        
        vResult = ActionSupport.SUCCESS;
        
        }
        
        } catch (Exception pe) {
        
        this.addActionError("Veuillez remplir tout les champs correctement");
        
        }
        
        return vResult;
        
    }


    
    }
