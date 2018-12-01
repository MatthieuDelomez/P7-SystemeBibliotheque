/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

/**
 *
 * @author Ben Gourion
 */
public class GestionProjetAction extends ActionSupport {
    
    //===================Attributs=======================
   //================== Element en sortie===============
    private Integer id;

   //================== Element en sortie===============
 /*   private List<Projet> listProjet;
    private Projet projet;
    
   */ 
    //==================Getters & Setters===============

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
/*
    
    public List<Projet> getListProjet() {
        return listProjet;
    }

    public void setListProjet(List<Projet> listProjet) {
        this.listProjet = listProjet;
    }
    

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }
    
    
    
    */
    
    
    
}
