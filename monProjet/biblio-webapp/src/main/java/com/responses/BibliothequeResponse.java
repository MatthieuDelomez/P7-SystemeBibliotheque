package com.responses;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement(name = "BibliothequeResponse")
@XmlType(name = "BibliothequeResponse")
public class BibliothequeResponse {
    
    
    private int refBibliotheque;
    
    private String nom;
    private String adresse;
    private String ville;
    private String codePostal;
    private String description;
    
    

    public int getRefBibliotheque() {
        return refBibliotheque;
    }
    
    @XmlElement(name = "refbibliotheque")
    public void setRefBibliotheque(int refBibliotheque) {
        this.refBibliotheque = refBibliotheque;
    }

    public String getNom() {
        return nom;
    }
    
    @XmlElement(name = "nom")
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }
    
    @XmlElement(name = "adresse")
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }
    
    @XmlElement(name = "ville")
    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodePostal() {
        return codePostal;
    }
    
    @XmlElement(name = "codepostal")
    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getDescription() {
        return description;
    }
    
    @XmlElement(name = "description")
    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}

    

