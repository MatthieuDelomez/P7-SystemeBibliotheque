
package com.client.action;

import com.biblio.BibliothequeServices;
import com.biblio.BibliothequeServicesService;
import com.biblio.DocumentResponse;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;


public class RechercheAction extends ActionSupport {
    
       


   //=========Attributs=============
       
       private int refOuvrage;
       private int refBibliotheque;
       
       private String nomOuvrage;
       private String quantiteTotal;
       
       private List <String> listDocument;
       private List <DocumentResponse> listDocumentResponse;
       
       
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

    public List<String> getListDocument() {
        return listDocument;
    }

    public void setListDocument(List<String> listDocument) {
        this.listDocument = listDocument;
    }

    public List<DocumentResponse> getListDocumentResponse() {
        return listDocumentResponse;
    }

    public void setListDocumentResponse(List<DocumentResponse> listDocumentResponse) {
        this.listDocumentResponse = listDocumentResponse;
    }
    
    

       
    @Override
    public String execute() {
        
        BibliothequeServicesService bibliothequeServicesService= new BibliothequeServicesService();
        BibliothequeServices port =  bibliothequeServicesService.getBibliothequeServicesPort();
        
        
        listDocument = new ArrayList ();
        listDocumentResponse = port.listDocument(nomOuvrage);
        

        
        return SUCCESS;
                         
        }  
        }
