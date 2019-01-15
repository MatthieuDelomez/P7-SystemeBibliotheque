
package com.client.action;

import com.biblio.BibliothequeServices;
import com.biblio.BibliothequeServicesService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;


public class GestionEmployeAction extends ActionSupport{
    
    BibliothequeServicesService bibliothequeServicesService= new BibliothequeServicesService();
    BibliothequeServices port =  bibliothequeServicesService.getBibliothequeServicesPort();
    
    private String pseudo;
    private String motPasse;
    private String email;
    private String nom;
    private String prenom;    


    
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
    
    
   //=========Méthodes============
                      
    /*
   Action permettant la connexion d'un utilisateur
   @return input / success
  */
    
    public String verifEmploye() {
    
                      String vResult = ActionSupport.INPUT;
                                               
                       try {
                           
                      if (!StringUtils.isAllEmpty(pseudo, motPasse)) {
                      port.doLogin(pseudo, motPasse);
                      vResult = ActionSupport.SUCCESS;
                                      
                       }
                      
                      
                       } catch (Exception pe){
                           
                       this.addActionError("Identifiant ou mot motPasse invalide !");
                      System.out.println("Prise en compte de la methode !!");
                                                                  
                      }
                                                            
                      return vResult;
                         
                      }
    
           }
