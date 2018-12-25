package org.projet.biblio.model;


public class Document  {
    
    private int refOuvrage;
    private int refBibliotheque;
    private String nomOuvrage;
    private String quantiteTotal;



    public String getNomOuvrage() {
        return nomOuvrage;
    }

    public int getRefBibliotheque() {
        return refBibliotheque;
    }
    

    public int getRefOuvrage() {
        return refOuvrage;
    }

    public String getQuantiteTotal() {
        return quantiteTotal;
    }


    public void setNomOuvrage(String nomOuvrage) {
        this.nomOuvrage = nomOuvrage;
    }

    public void setRefBibliotheque(int refBibliotheque) {
        this.refBibliotheque = refBibliotheque;
    }

    public void setRefOuvrage(int refOuvrage) {
        this.refOuvrage = refOuvrage;
    }

    public void setQuantiteTotal(String quantiteTotal) {
        this.quantiteTotal = quantiteTotal;
    }

    

    
    
}
