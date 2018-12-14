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
    
    
    private String pseudo;
    
    private String nom;
    
    private String prenom;

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
