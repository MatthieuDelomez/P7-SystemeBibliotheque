package org.projet.biblio.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Client{
    
  private  int refClient ;
  private  int refBibliotheque;
  
  private  String sexe = "sexe";
  private  String nom = "nom";
  private  String prenom = "prenom";
  private  String pseudo = "pseudo";
  private  String motPasse = "motPasse";
  private  String adresse = "adresse";
  private  String email = "email";
  private  String codePostal = "codePostal";

    
    public int getRefClient() {
        return refClient;
    }

    public int getRefBibliotheque() {
        return refBibliotheque;
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

    public void setRefBibliotheque(int refBibliotheque) {
        this.refBibliotheque = refBibliotheque;
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
    

    
    

        
    }
    

