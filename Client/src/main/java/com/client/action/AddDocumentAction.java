
package com.client.action;

import com.biblio.BibliothequeServices;
import com.biblio.BibliothequeServicesService;
import com.biblio.DocumentResponse;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Ben Gourion
 */
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

    /**
     *
     * @return
     */

    public int getRefOuvrage() {
        return refOuvrage;
    }

    /**
     *
     * @param refOuvrage
     */
    public void setRefOuvrage(int refOuvrage) {
        this.refOuvrage = refOuvrage;
    }

    /**
     *
     * @return
     */
    public int getRefBibliotheque() {
        return refBibliotheque;
    }

    /**
     *
     * @param refBibliotheque
     */
    public void setRefBibliotheque(int refBibliotheque) {
        this.refBibliotheque = refBibliotheque;
    }

    /**
     *
     * @return
     */
    public String getNomOuvrage() {
        return nomOuvrage;
    }

    /**
     *
     * @param nomOuvrage
     */
    public void setNomOuvrage(String nomOuvrage) {
        this.nomOuvrage = nomOuvrage;
    }

    /**
     *
     * @return
     */
    public String getQuantiteTotal() {
        return quantiteTotal;
    }

    /**
     *
     * @param quantiteTotal
     */
    public void setQuantiteTotal(String quantiteTotal) {
        this.quantiteTotal = quantiteTotal;
    }


    
    //=========Methodes=============
    
    
    /*
    Méthode pour ajouter un nouveau document.
    return vResult
    */

    /**
     *
     * @return
     */

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
