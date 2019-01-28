
package com.client.action;

import com.biblio.BibliothequeServices;
import com.biblio.BibliothequeServicesService;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.interceptor.SessionAware;


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

                      
                      //=========Méthodes============
                      

                       /**
                       *
                       * @return
                       */                      
                      public String doLoginClient(){

                      String vResult = ActionSupport.INPUT;
                                               
                       try {
                           
                      if (!StringUtils.isAllEmpty(pseudo, motPasse)) {
                          
                                port.doLoginClient(pseudo, motPasse);
                      
                          
                      vResult = ActionSupport.SUCCESS;
                      
                      this.session.put("user", vResult);
                                      
                       }
                      
                      
                       } catch (Exception pe){
                           
                       this.addActionError("Identifiant ou mot motPasse invalide !");
                      System.out.println("Prise en compte de la methode !!");


                                                                  
                      }
                                                            
                      return vResult;
                         
                      }
                      
                      
                      /*
                      Action permettant la connexion d'un utilisateur
                      @return success
                      */
                      public String doLogout(){
                      return ActionSupport.SUCCESS;
                          
                      }
                      
                      @Override
                      public void setSession(Map<String, Object> pSession) {
                      this.session = pSession;
                      }
                      
                      
                      }
