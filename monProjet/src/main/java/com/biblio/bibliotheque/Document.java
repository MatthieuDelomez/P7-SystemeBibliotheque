/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblio.bibliotheque;

import com.biblio.interfaces.DocumentInterface;

/**
 *
 * @author Ben Gourion
 */
public class Document implements DocumentInterface, Comparable<Document>  {
    
    private String nomOuvrage;
    private int refOuvrage;
    private String quantiteTotal;
    private String nbrEmprunte;
    private String quantiteRestante;
    
   public Document(String nomOuvrage, int refOuvrage, String quantiteTotal, String nbrEmprunte, String quantiteRestante){
        this.nomOuvrage = nomOuvrage;
        this.refOuvrage = refOuvrage;
        this.quantiteTotal = quantiteTotal;
        this.nbrEmprunte = nbrEmprunte;
        this.quantiteRestante = quantiteRestante;
    }

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
    
    
    @Override
    public void edition(){
        System.out.println("Le titre du document est : " + nomOuvrage);
        System.out.println("La référence du document est : " + refOuvrage);
        System.out.println("La quantité total est de : " + quantiteTotal + "ouvrage(s)");
        System.out.println("La quantité restante est de  : " + quantiteRestante + "ouvrage(s)");
        System.out.println("Le nombre emprunté est de  : " + nbrEmprunte + "ouvrage(s)");



    }

    @Override
    public int compareTo(Document doc) {
           return refOuvrage - doc.getRefOuvrage();
    }
    
    
}
