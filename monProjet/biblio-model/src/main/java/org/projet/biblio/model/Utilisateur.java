package org.projet.biblio.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.concurrent.ThreadLocalRandom;
import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService(serviceName = "biblio")
public class Utilisateur {
    
    int refClient ;
    String sexe = "sexe";
    String nom = "nom";
    String prenom = "prenom";
    String pseudo = "pseudo";
    String motPasse = "motPasse";
    String adresse = "adresse";
    String email = "email";
    String codePostal = "codePostal";

    
    public int getRefClient() {
        return refClient;
    }

    public String getSexe() {
        return sexe;
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

    public String getMotPasse() {
        return motPasse;
    }

    public String getEmail() {
        return email;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public String getAdresse() {
        return adresse;
    }
    
  
    
    public void setRefClient(int refClient) {
        this.refClient = refClient;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
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

    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    

    @WebMethod
    public String CreerUser (int refClient, String nom ,String prenom, String sexe, String pseudo, String motPasse, String email ){
        
        return "Notre bibliotheque vous souhaite la Bienvenue" + prenom + nom ;
    }
    
    
    
    @WebMethod
    public int refClient(String pseudo, String motPasse ){
           
        /*
        Ins�rer le client dans la base de donn�es et retourner son id unique
        */
        return ThreadLocalRandom.current().nextInt(1,900);
    }
    
    

        
    }
    

