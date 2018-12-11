/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controllers;

import com.opensymphony.xwork2.ActionSupport;
import javax.jws.WebService;

/**
 *
 * @author Ben Gourion
 */
@WebService
public class ClientGestion extends ActionSupport {
    
    private int refClient;
    
    private String nom = "nom";
    private String prenom = "prenom";
    private String pseudo = "pseudo";
    private String email ="email";
    private String motPasse = "motpasse";
    private String adresse = "adresse";
    private String codePostal = "codepostal";
    private String sexe = "sexe";

    public int getRefClient() {
        return refClient;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getPseudo() {
        return pseudo;
    }

    public String getEmail() {
        return email;
    }

    public String getMotPasse() {
        return motPasse;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public String getSexe() {
        return sexe;
    }

    public void setRefClient(int refClient) {
        this.refClient = refClient;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
    
    
      
  //==================Méthodes===============
    
    /*
    Action qui servira à créer le client les {@link Projet}
    @return succes
    
    @WebMethod
    public String doCreateClient(String nom, String prenom, String pseudo, String email, String motPasse, String adresse){
    }
    
    
     */
        
        
    
    
    
}
