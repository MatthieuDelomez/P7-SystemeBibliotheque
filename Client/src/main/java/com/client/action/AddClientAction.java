
package com.client.action;

import com.biblio.ClientResponse;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;


public class AddClientAction extends ActionSupport {


   //=========Attributs=============

                      private String nom;
                      private String prenom;
                      private String sexe;
                      private String adresse;
                      private String pseudo;
                      private String motPasse;
                      private String codePostal;
                      private String email;

                      

   //=========Getters & Setters=============





    public String getNom() {
        return nom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }


    public String getPrenom() {
        return prenom;
    }


    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    public String getSexe() {
        return sexe;
    }


    public void setSexe(String sexe) {
        this.sexe = sexe;
    }


    public String getAdresse() {
        return adresse;
    }


    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


    public String getPseudo() {
        return pseudo;
    }


    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }


    public String getMotPasse() {
        return motPasse;
    }


    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }


    public String getCodePostal() {
        return codePostal;
    }


    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }
    
   
    
    public String doAddClient(){
        
    String vResult = ActionSupport.INPUT;
    
    
    ClientResponse clientResponse = new ClientResponse();
    
    clientResponse.setAdresse(adresse);
    clientResponse.setCodepostal(codePostal);
    clientResponse.setEmail(email);
    clientResponse.setMotPasse(motPasse);
    clientResponse.setNom(nom);
    clientResponse.setPrenom(prenom);
    clientResponse.setPseudo(pseudo);
    clientResponse.setSexe(sexe);
    
    
    
        
        try{
            
        if (!StringUtils.isAllEmpty(pseudo, motPasse)) {
            
        System.out.println("test test");
        vResult = ActionSupport.SUCCESS;

        }
        
        } catch(Exception pe) {
            this.addActionError("Veuillez remplir tout les champs correctement");
            System.out.println("Champs manquant !!");
          
       }
  
    
    
            return vResult;
            
    }
    
    }

    