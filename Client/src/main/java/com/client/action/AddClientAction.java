
package com.client.action;

import com.biblio.BibliothequeServices;
import com.biblio.BibliothequeServicesService;
import com.biblio.ClientResponse;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;


public class AddClientAction extends ActionSupport {
    
    
       BibliothequeServicesService bibliothequeServicesService= new BibliothequeServicesService();
       BibliothequeServices port =  bibliothequeServicesService.getBibliothequeServicesPort();


   //=========Attributs=============

                      private String nom;
                      private String prenom;
                      private String sexe;
                      private String adresse;
                      private String pseudo;
                      private String motPasse;
                      private String codePostal;
                      private String email;
                      
                      private int refBibliotheque;
                      private int refClient;
                      
                      private List <String> listClient;
                      private List <ClientResponse> listClientResponse;

                      

   //=========Getters & Setters=============

    public List<String> getListClient() {
        return listClient;
    }

    public void setListClient(List<String> listClient) {
        this.listClient = listClient;
    }

    public List<ClientResponse> getListClientResponse() {
        return listClientResponse;
    }

    public void setListClientResponse(List<ClientResponse> listClientResponse) {
        this.listClientResponse = listClientResponse;
    }                 

    public int getRefBibliotheque() {
        return refBibliotheque;
    }

    public void setRefBibliotheque(int refBibliotheque) {
        this.refBibliotheque = refBibliotheque;
    }

    public int getRefClient() {
        return refClient;
    }

    public void setRefClient(int refClient) {
        this.refClient = refClient;
    }


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
    clientResponse.setMotpasse(motPasse);
    clientResponse.setNom(nom);
    clientResponse.setPrenom(prenom);
    clientResponse.setPseudo(pseudo);
    clientResponse.setRefbibliotheque(refBibliotheque);
    clientResponse.setRefclient(refClient);


    

        try{
            
        if (!StringUtils.isAllEmpty(pseudo, motPasse)) {
            
       port.addClient(refClient, refBibliotheque, nom, prenom,sexe,pseudo,motPasse, adresse, email, codePostal);    

            
        System.out.println("test test");
        vResult = ActionSupport.SUCCESS;

        }
        
        } catch(Exception pe) {
            this.addActionError("Veuillez remplir tout les champs correctement");
            System.out.println("Champs manquant !!");
            
        System.out.println(nom);
        System.out.println(prenom);
        System.out.println(sexe);
        System.out.println(adresse);
        System.out.println(email);
        System.out.println(codePostal);
        System.out.println(pseudo);
        System.out.println(motPasse);
        System.out.println(refBibliotheque);
        System.out.println(refClient);
          
       }
  
    
    
            return vResult;
            
    }
    
    
    
    public String execute () {

        
        listClient = new ArrayList();
        listClientResponse = port.listClient();

        
        return SUCCESS;
        



    }
    
    }

    