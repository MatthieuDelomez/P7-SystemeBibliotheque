
package com.client.action;

import com.biblio.BibliothequeServices;
import com.biblio.BibliothequeServicesService;
import com.biblio.UtilisateurResponse;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.interceptor.SessionAware;

/**
 * Classe [AddUserAction] qui à pour fonctionnalité
 * d'ajouter un nouveau employé.
 *
 * @author Delomez Matthieu
 */
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

    /**
     *
     * @return idutilisateur
     */
    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    /**
     *
     * @param idUtilisateur
     */
    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    /**
     *
     * @return refbibliotheque
     */
    public int getRefBibliotheque() {
        return refBibliotheque;
    }

    /**
     *
     * @param refBibliotheque
     */
    public void setRefBibliotheque(int refBibliotheque) {
        this.refBibliotheque = refBibliotheque;
    }

    /**
     *
     * @return pseudo
     */
    public String getPseudo() {
        return pseudo;
    }

    /**
     *
     * @param pseudo
     */
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    /**
     *
     * @return motpasse
     */
    public String getMotPasse() {
        return motPasse;
    }

    /**
     *
     * @param motPasse
     */
    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }

    /**
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @return prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     *
     * @param prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     *
     * @param pSession
     */
    @Override
    public void setSession(Map<String, Object> pSession) {
    this.session = pSession;
    }

    /**
     * Méthode doAddUser() pour ajouter un employé.
     * 
     *
     * @return vResult
     */
    public String doAddUser(){
        
    String vResult = ActionSupport.INPUT;
    
    UtilisateurResponse utilisateurResponse = new UtilisateurResponse();
    
    utilisateurResponse.setRefbibliotheque(refBibliotheque);
    utilisateurResponse.setPseudo(pseudo);
    utilisateurResponse.setMotpasse(motPasse);
    utilisateurResponse.setEmail(email);
    utilisateurResponse.setNom(nom);
    utilisateurResponse.setPrenom(prenom);
    
    try {
     
    if(!StringUtils.isAllEmpty( pseudo, motPasse, email)){
                
    
           port.addUser(refBibliotheque, pseudo, motPasse, email, nom, prenom);
    
           vResult = ActionSupport.SUCCESS;
           this.session.put("employe", vResult);
    
           }
        
           } catch(Exception pe) {
            this.addActionError("Veuillez remplir tout les champs correctement");
            
          
            }
  

            return vResult;
            
           }
    
           }
