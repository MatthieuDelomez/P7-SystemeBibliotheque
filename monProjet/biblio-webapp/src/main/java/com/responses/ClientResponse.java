
package com.responses;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ClientResponse")
@XmlType(name = "ClientResponse")
public class ClientResponse {
    
    
    private int refClient;
    private int refBibliotheque;
    
    private String nom;
    private String prenom;
    private String sexe;
    private String pseudo;
    private String motPasse;
    private String adresse;
    private String email;
    private String codePostal;
        
    

    public int getRefClient() {
        return refClient;
    }
    
    @XmlElement(name = "refclient")
    public void setRefClient(int refClient) {
        this.refClient = refClient;
    }

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

    public String getPrenom() {
        return prenom;
    }
    
    @XmlElement(name = "prenom")
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }
    
    @XmlElement(name = "sexe")
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getPseudo() {
        return pseudo;
    }
    
    @XmlElement(name = "pseudo")
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getMotPasse() {
        return motPasse;
    }
    
    @XmlElement(name = "motpasse")
    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }

    public String getAdresse() {
        return adresse;
    }
    
    @XmlElement(name = "adresse")
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }
    
    @XmlElement(name = "email")
    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodePostal() {
        return codePostal;
    }
    
    @XmlElement(name = "codepostal")
    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }
    
    
    
}
