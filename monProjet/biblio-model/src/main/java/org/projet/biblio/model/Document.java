package org.projet.biblio.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Ben Gourion
 */
public class Document  {
    
    private String nomOuvrage;
    private int refOuvrage;
    private String quantiteTotal;
    private String nbrEmprunte;
    private String quantiteRestante;


    public String getNomOuvrage() {
        return nomOuvrage;
    }

    public int getRefOuvrage() {
        return refOuvrage;
    }

    public String getQuantiteTotal() {
        return quantiteTotal;
    }

    public String getNbrEmprunte() {
        return nbrEmprunte;
    }

    public String getQuantiteRestante() {
        return quantiteRestante;
    }

    public void setNomOuvrage(String nomOuvrage) {
        this.nomOuvrage = nomOuvrage;
    }

    public void setRefOuvrage(int refOuvrage) {
        this.refOuvrage = refOuvrage;
    }

    public void setQuantiteTotal(String quantiteTotal) {
        this.quantiteTotal = quantiteTotal;
    }

    public void setNbrEmprunte(String nbrEmprunte) {
        this.nbrEmprunte = nbrEmprunte;
    }

    public void setQuantiteRestante(String quantiteRestante) {
        this.quantiteRestante = quantiteRestante;
    }
    
    

    
    
}
