/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import javassist.NotFoundException;
import org.projet.biblio.model.Document;
import webapp.WebappHelper;

/**
 *
 * @author Ben Gourion
 */
public class GestionProjetAction extends ActionSupport {
    
    //===================Attributs=======================
    
    
   //================== Element en sortie===============
    private Integer id;

   //================== Element en sortie===============
    private List<Document> listDocument;
    private Document document;
    
   
    //==================Getters & Setters===============

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    
    public List<Document> getListDocument() {
        return listDocument;
    }
    

    public Document getDocument() {
        return document;
    }


    
  //==================Méthodes===============
    
    /*
    Action listant les {@link Projet}
    @return succes
    */
    public String doList(){
        listDocument = WebappHelper.getManagerFactory().getDocumentManager().getAllDocument();
        return ActionSupport.SUCCESS;    }
    
    
     /*
    Action listant les détails d'un {@link Projet}
    @return succes / error
    */
    
    public String doDetail() {
        if (id == null) {
            this.addActionError("Vous devez indiquer un id de projet");
        } else {
            try {
                listDocument = WebappHelper.getManagerFactory().getDocumentManager().getAllDocument();
            } catch (Exception pE) {
                this.addActionError("Projet non trouvé. ID = " + id);
            }
        }

        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;


    }
}
    
    

    
    
    
    


