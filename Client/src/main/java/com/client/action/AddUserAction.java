
package com.client.action;

import com.biblio.BibliothequeServices;
import com.biblio.BibliothequeServicesService;
import com.biblio.UtilisateurResponse;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.interceptor.SessionAware;


public class AddUserAction extends ActionSupport implements SessionAware{
    
        
       BibliothequeServicesService bibliothequeServicesService= new BibliothequeServicesService();
       BibliothequeServices port =  bibliothequeServicesService.getBibliothequeServicesPort();


   //=========Attributs=============

                      private int idUtilisateur;
                      private int refBibliotheque;
                      
                      private String pseudo;
                      private String motPasse;
                      private String email;
                      private String nom;
                      private String prenom;
                      
                      // ----- Eléments Struts
                      private Map<String, Object> session;
                      
  //=========Getters & Setters=============

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public int getRefBibliotheque() {
        return refBibliotheque;
    }

    public void setRefBibliotheque(int refBibliotheque) {
        this.refBibliotheque = refBibliotheque;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
    
    @Override
    public void setSession(Map<String, Object> pSession) {
    this.session = pSession;
    }

    
    public String doAddUser(){
        
    String vResult = ActionSupport.INPUT;
    
    UtilisateurResponse utilisateurResponse = new UtilisateurResponse();
    
    utilisateurResponse.setIdutilisateur(idUtilisateur);
    utilisateurResponse.setRefbibliotheque(refBibliotheque);
    utilisateurResponse.setPseudo(pseudo);
    utilisateurResponse.setMotpasse(motPasse);
    utilisateurResponse.setEmail(email);
    utilisateurResponse.setNom(nom);
    utilisateurResponse.setPrenom(prenom);
    
    try {
     
    if(!StringUtils.isAllEmpty( pseudo, motPasse)){
    
    port.addUser(idUtilisateur, refBibliotheque, pseudo, motPasse, email, nom, prenom);
    
    System.out.println("test test");
    vResult = ActionSupport.SUCCESS;
    this.session.put("employe", vResult);
    
        }
        
        } catch(Exception pe) {
            this.addActionError("Veuillez remplir tout les champs correctement");
            System.out.println("Champs manquant !!");
            
        System.out.println(nom);
        System.out.println(prenom);
        System.out.println(email);
        System.out.println(pseudo);
        System.out.println(motPasse);
        System.out.println(refBibliotheque);
        System.out.println(idUtilisateur);
            
          
       }
  
    
    
            return vResult;
            
    }
    
    }
