package org.projet.biblio.model;

/**
 * Implementation pour définir le mapping entre les lignes de 
 * résultats d'une requête Sql et les objets java à créer.
 * 
 *
 * @author Delomez Matthieu
 */

public class Document  {
    
    //=========Attributs=============
    
    private int refOuvrage;
    private int refBibliotheque;
    private String nomOuvrage;
    private String quantiteTotal;
    
    
    //=========Getters & Setters=============

    /**
     *
     * @return
     */
    public String getNomOuvrage() {
        return nomOuvrage;
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
     * @return
     */
    public int getRefOuvrage() {
        return refOuvrage;
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
     * @param nomOuvrage
     */
    public void setNomOuvrage(String nomOuvrage) {
        this.nomOuvrage = nomOuvrage;
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
     * @param refOuvrage
     */
    public void setRefOuvrage(int refOuvrage) {
        this.refOuvrage = refOuvrage;
    }

    /**
     *
     * @param quantiteTotal
     */
    public void setQuantiteTotal(String quantiteTotal) {
        this.quantiteTotal = quantiteTotal;
    }

    

    
    
}
