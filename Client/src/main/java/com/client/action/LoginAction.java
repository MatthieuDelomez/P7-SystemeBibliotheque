
package com.client.action;

import com.biblio.BibliothequeServices;
import com.biblio.BibliothequeServicesService;
import com.biblio.ClientResponse;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.interceptor.SessionAware;

/**
 * Classe [Login] qui va permettre aux Clients de se connecter.
 * 
 * 
 * @author Matthieu Delomez
 */
public class LoginAction extends ActionSupport implements SessionAware{
    
    
                      BibliothequeServicesService bibliothequeServicesService= new BibliothequeServicesService();
                      BibliothequeServices port =  bibliothequeServicesService.getBibliothequeServicesPort();
    
                      /*
                      Import des attributs qui serviront à la récupération des données via le WebService
                      */
                       
                       //=========Attributs=============
                      private String pseudo;
                      private String motPasse; 
                      
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

                      
                      //=========Méthodes============
                      

                       /**
                        * Méthode Login pour que le client puisse se connecter
                        * avec ses identifiants.
                       *
                       * @return
                       */                      
                      public String doLoginClient(){

                      String vResult = ActionSupport.INPUT;
                     
                                               
                       try {
                           
                           
                           
                     if (!StringUtils.isAllEmpty(pseudo, motPasse)) {
                         
                     ClientResponse clientresponse = port.doLoginClient(pseudo, motPasse);
                                                
                      if(clientresponse != null) {
                          
                      vResult = ActionSupport.SUCCESS;
                      
                      this.session.put("user", vResult);
                      
                      return vResult;
                                      
                       }
                      
                      
                     }
                      
                       } catch (Exception pe){
                           
                       this.addActionError("Identifiant ou mot motPasse invalide !");


                                                                  
                      }
                                                            
                      return vResult;
                         
                      }
                      
                      
                      /*
                     *  Action permettant la connexion d'un utilisateur.
                     *
                     * @return success
                      */
                      public String doLogout(){
                      return ActionSupport.SUCCESS;
                          
                      }
                      
                      
                     /**
                     *
                     * @param pSession
                     */
                     @Override
                      public void setSession(Map<String, Object> pSession) {
                      this.session = pSession;
                      }
                      
                      
                      }
