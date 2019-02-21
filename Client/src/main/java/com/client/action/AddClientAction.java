
package com.client.action;

import com.biblio.BibliothequeServices;
import com.biblio.BibliothequeServicesService;
import com.biblio.ClientResponse;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.interceptor.SessionAware;


public class AddClientAction extends ActionSupport implements SessionAware {
    
    
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
                      
                       // ----- Eléments Struts
                      private Map<String, Object> session;
                      
                      

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


    
   @Override
    public void setSession(Map<String, Object> pSession) {
    this.session = pSession;
    }
    
    

   //=========Methodes=============

   
    /*
    Méthode pour ajouter un nouveau client.
    return vResult
    */
    public String doAddClient(){
        
    String vResult = ActionSupport.INPUT;

    ClientResponse clientResponse = new ClientResponse();
    
    
    clientResponse.setRefclient(refClient);
    clientResponse.setRefbibliotheque(refBibliotheque);
    clientResponse.setNom(nom);
    clientResponse.setPrenom(prenom);
    clientResponse.setSexe(sexe);
    clientResponse.setPseudo(pseudo);
    clientResponse.setMotpasse(motPasse);
    clientResponse.setAdresse(adresse);
    clientResponse.setEmail(email);
    clientResponse.setCodepostal(codePostal);


    
       /*
        Bloc Try qui va remplir les condtions d'enregistrement 
        d'un nouveau client.
      */   
        try{
            
        if (StringUtils.isAllEmpty(pseudo)) {
            if(StringUtils.isAllEmpty(motPasse)) {
                if(StringUtils.isAllEmpty(email)){
                    
                    vResult = ActionSupport.INPUT;
                }
            }
        }
           
                
        else {   
        port.addClient(refBibliotheque, nom, prenom,sexe,pseudo,motPasse, adresse, email, codePostal);    

        this.session.put("user", vResult);
        
        vResult = ActionSupport.SUCCESS; 

        }
        
        } catch(Exception pe) {
            this.addActionError("Veuillez remplir tout les champs correctement");            
        
        }
  
            return vResult;
            
        }
    
    
    /*
    Méthode Execute qui va servir à récupérer 
    une liste de client à afficher dans la vue.  [Côté employé]
    return SUCCESS
    */
    @Override
    public String execute () {

        
        listClient = new ArrayList();
        listClientResponse = port.listClient();

        
        return SUCCESS;
        
    }
    
    

    
    }

    