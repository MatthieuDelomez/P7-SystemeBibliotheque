/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.responses;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author macbookpro
 */


@XmlRootElement(name = "UtilisateurResponse")
@XmlType(name = "UtilisateurResponse")
public class UtilisateurResponse {
    
    private int refBibliotheque;
    
    private int idUtilisateur;
    
    private String pseudo ;
    
    private String motPasse;
    
    private String nom;
    
    private String prenom;
    
    private String email;
    
    

    public int getIdUtilisateur() {
        return idUtilisateur;
    }
    
    @XmlElement(name = "idutilisateur")
    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }   
    
    
    public int getRefBibliotheque() {
        return refBibliotheque;
    }
    
    @XmlElement(name = "refbibliotheque")
    public void setRefBibliotheque(int refBibliotheque) {
        this.refBibliotheque = refBibliotheque;
    }

    public String getMotPasse() {
        return motPasse;
    }
    
    @XmlElement(name = "motpasse")
    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }

    public String getEmail() {
        return email;
    }
    
    @XmlElement(name = "email")
    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public String getPseudo() {
        return pseudo;
    }

    @XmlElement(name = "pseudo")
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
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
    
    
    
    
    
    
}
