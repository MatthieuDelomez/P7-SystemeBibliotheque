
package com.client.action;

import com.biblio.BibliothequeServices;
import com.biblio.BibliothequeServicesService;
import com.biblio.UtilisateurResponse;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.interceptor.SessionAware;

/**
 * Classe [GestionEmployeAction] qui va permettre aux employés de se connecter.
 * 
 *
 * @author Delomez Matthieu
 */
public class GestionEmployeAction extends ActionSupport implements SessionAware {
    
   //=========Attributs=============

    
    BibliothequeServicesService bibliothequeServicesService= new BibliothequeServicesService();
    BibliothequeServices port =  bibliothequeServicesService.getBibliothequeServicesPort();
    
    private String pseudo;
    private String motPasse;
    private String email;
    private String nom;
    private String prenom;    
    
    
    // ----- Eléments Struts
    private Map<String, Object> session;

    
   //=========Getters & Setters=======

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
    
    
                     //=========Méthodes============

                      /**
                      * Méthode verifEmploye() qui va permettre
                      * aux employés de se connecter avec leurs identifiants.
                      *
                      * @return
                      */

    
                      public String verifEmploye() {
    
                      String vResult = ActionSupport.INPUT;
                                               
                       try {
                           
                      if (!StringUtils.isAllEmpty(pseudo, motPasse)) {
                          
                      UtilisateurResponse utilisateurResponse = port.doLogin(pseudo, motPasse);
                          
                     if(utilisateurResponse != null){
                      
                      vResult = ActionSupport.SUCCESS;
                      
                     // Interceptors [Employé]
                      this.session.put("employe", vResult);
                      
                      return vResult;
                                      
                      }
                     
                      }
                      
                      
                       } catch (Exception pe){
                           
                       this.addActionError("Identifiant ou mot motPasse invalide !");
                                                                  
                      }
                                                            
                      return vResult;
                         
                      }
    
           }
