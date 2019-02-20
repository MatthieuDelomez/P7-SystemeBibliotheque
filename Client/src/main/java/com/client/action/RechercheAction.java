
package com.client.action;

import com.biblio.BibliothequeServices;
import com.biblio.BibliothequeServicesService;
import com.biblio.DocumentResponse;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe [RechercheAction] qui va servir à générer une liste d'ouvrages dans la vue.
 * Recherche qui s'effectuera via le nom du document.
 * 
 *
 * @author Matthieu Delomez
 */
public class RechercheAction extends ActionSupport {
    


   //=========Attributs=============
       
       private int refOuvrage;
       private int refBibliotheque;
       
       private String nomOuvrage;
       private String quantiteTotal;
       
       private List <String> listDocument;
       private List <DocumentResponse> listDocumentResponse;
       
       
   //=========Getters & Setters=============

    /**
     *
     * @return refouvrage
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
     * @return refbibliotheque
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
     * @return nomouvrage
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
     * @return quantitetotal
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

    /**
     *
     * @return listdocument
     */
    public List<String> getListDocument() {
        return listDocument;
    }

    /**
     *
     * @param listDocument
     */
    public void setListDocument(List<String> listDocument) {
        this.listDocument = listDocument;
    }

    /**
     *
     * @return listdocumentresponse
     */
    public List<DocumentResponse> getListDocumentResponse() {
        return listDocumentResponse;
    }

    /**
     *
     * @param listDocumentResponse
     */
    public void setListDocumentResponse(List<DocumentResponse> listDocumentResponse) {
        this.listDocumentResponse = listDocumentResponse;
    }
    
    
    
   //=========Methodes=============

    
    /**
     *Méthode execute() qui va importer une liste de document
     * en fonction de la recherche effectuée. 
     * 
     * 
     * @return SUCCESS
     */
    @Override
    public String execute() {
        
        BibliothequeServicesService bibliothequeServicesService= new BibliothequeServicesService();
        BibliothequeServices port =  bibliothequeServicesService.getBibliothequeServicesPort();
        
        
        listDocument = new ArrayList ();
        listDocumentResponse = port.listDocument(nomOuvrage);
        

        
        return SUCCESS;
                         
        }  
        }
