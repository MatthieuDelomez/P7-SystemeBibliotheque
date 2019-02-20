
package org.projet.biblio.model;

/**
 * JavaBean de l'application.
 * 
 *
 * @author Delomez Matthieu
 */
public class Bibliotheque {
    
    //=========Attributs=============
    
    private int refBibliotheque ;
    private String nom;
    private String adresse;
    private String ville;
    private String codePostal;
    private String description;
    

    
     //=========Getters & Setters=============
    
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
    public String getNom() {
        return nom;
    }

    /**
     *
     * @return
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     *
     * @return
     */
    public String getVille() {
        return ville;
    }

    /**
     *
     * @return
     */
    public String getCodePostal() {
        return codePostal;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
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
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @param adresse
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     *
     * @param ville
     */
    public void setVille(String ville) {
        this.ville = ville;
    }

    /**
     *
     * @param codePostal
     */
    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}
