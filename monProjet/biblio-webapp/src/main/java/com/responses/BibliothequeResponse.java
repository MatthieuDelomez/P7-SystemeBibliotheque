package com.responses;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Classe Response
 *
 * @author Delomez Matthieu
 */
@XmlRootElement(name = "BibliothequeResponse")
@XmlType(name = "BibliothequeResponse")
public class BibliothequeResponse {
    
    
   //=========Attributs=============
    
    private int refBibliotheque;
    
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
     * @param refBibliotheque
     */
    @XmlElement(name = "refbibliotheque")
    public void setRefBibliotheque(int refBibliotheque) {
        this.refBibliotheque = refBibliotheque;
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
     * @param nom
     */
    @XmlElement(name = "nom")
    public void setNom(String nom) {
        this.nom = nom;
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
     * @param adresse
     */
    @XmlElement(name = "adresse")
    public void setAdresse(String adresse) {
        this.adresse = adresse;
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
     * @param ville
     */
    @XmlElement(name = "ville")
    public void setVille(String ville) {
        this.ville = ville;
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
     * @param codePostal
     */
    @XmlElement(name = "codepostal")
    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
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
     * @param description
     */
    @XmlElement(name = "description")
    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}

    

