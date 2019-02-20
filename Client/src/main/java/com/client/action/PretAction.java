
package com.client.action;

import java.util.List;

import com.biblio.BibliothequeServices;
import com.biblio.BibliothequeServicesService;
import com.biblio.PretResponse;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.Date;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Ben Gourion
 */
public class PretAction extends ActionSupport {
    

   //=========Attributs=============

    protected int refclient;
    protected int refouvrage;
    protected int refpret;
    protected Date datefinpret;
    protected Date datepret;
    protected String dureePret;
    protected String nbrexemplaire;
    
    protected boolean prolonger;
    
    /*
    Variable pour gérer l'incrémentation des prêts.
    */
    private List<String> listPret;
    private List<PretResponse> listPretResponse;
    
     
    //=========Getters & Setters=======

    /**
     *
     * @return listPretResponse
     */
     public List<PretResponse> getListPretResponse() {       
        return listPretResponse;
    }
    
    /**
     *
     * @param listPretResponse
     */
    public void setListPretResponse(List<PretResponse> listPretResponse) {
        this.listPretResponse = listPretResponse;
    }

    /**
     *
     * @return listPret
     */
    public List<String> getListPret() {
        return listPret;
    }

    /**
     *
     * @param listPret
     */
    public void setListPret(List<String> listPret) {
        this.listPret = listPret;
    }

    /**
     *
     * @return refClient
     */
    public int getRefclient() {
        return refclient;
    }

    /**
     *
     * @param refclient
     */
    public void setRefclient(int refclient) {
        this.refclient = refclient;
    }

    /**
     *
     * @return refOuvrage
     */
    public int getRefouvrage() {
        return refouvrage;
    }

    /**
     *
     * @param refouvrage
     */
    public void setRefouvrage(int refouvrage) {
        this.refouvrage = refouvrage;
    }

    /**
     *
     * @return refPret
     */
    public int getRefpret() {
        return refpret;
    }

    /**
     *
     * @param refpret
     */
    public void setRefpret(int refpret) {
        this.refpret = refpret;
    }

    /**
     *
     * @return datefinpret
     */
    public Date getDatefinpret() {
        return datefinpret;
    }

    /**
     *
     * @param datefinpret
     */
    public void setDatefinpret(Date datefinpret) {
        this.datefinpret = datefinpret;
    }

    /**
     *
     * @return datepret
     */
    public Date getDatepret() {
        return datepret;
    }

    /**
     *
     * @param datepret
     */
    public void setDatepret(Date datepret) {
        this.datepret = datepret;
    }

    /**
     *
     * @return
     */
    public String getDureePret() {
        return dureePret;
    }

    /**
     *
     * @param dureePret
     */
    public void setDureePret(String dureePret) {
        this.dureePret = dureePret;
    }

    /**
     *
     * @return nbrexemplaire
     */
    public String getNbrexemplaire() {
        return nbrexemplaire;
    }

    /**
     *
     * @param nbrexemplaire
     */
    public void setNbrexemplaire(String nbrexemplaire) {
        this.nbrexemplaire = nbrexemplaire;
    }

    /**
     *
     * @return isprolonger
     */
    public boolean isProlonger() {
        return prolonger;
    }

    /**
     *
     * @param prolonger
     */
    public void setProlonger(boolean prolonger) {
        this.prolonger = prolonger;
    }
    

    /**
     *Retourner la date du jour.
     * 
     * @return date
     */

    public Date getTodaydate() {
        return new Date();
    }
    
    /**
     *
     * @return
     */
    public String display() {
        return NONE;
    }



    
                     //================Méthodes===================

                     /**
                      * Méthode execute() qui va importer la liste de pret 
                      * à injecter dans le vue.
                      * 
                     *
                     * @return SUCCESS
                     */
    
    
                      @Override
                      public String execute(){
                          
                      BibliothequeServicesService bibliothequeServicesService= new BibliothequeServicesService();             
                      BibliothequeServices port =  bibliothequeServicesService.getBibliothequeServicesPort();
                      listPret = new ArrayList();
                      listPretResponse = port.listPret();                                                        
           
                       return SUCCESS ;
                      

                       }

                      /**
                      * Méthode pour ajouter un nouveau pret.
                      * 
                      * 
                      * @return vResult
                      */
                       public String doAddPret() {
                          
                                                
                      BibliothequeServicesService bibliothequeServicesService= new BibliothequeServicesService();             
                      BibliothequeServices port =  bibliothequeServicesService.getBibliothequeServicesPort();
 
                      String vResult = ActionSupport.INPUT;

                      PretResponse pretResponse = new PretResponse();                      
                      

                      pretResponse.setRefpret(refpret);
                      pretResponse.setRefclient(refclient);
                      pretResponse.setRefouvrage(refouvrage);
                      pretResponse.setDureePret(dureePret);
                      pretResponse.setNbrexemplaire(nbrexemplaire);
                      pretResponse.setProlonger(prolonger);


                      try {
                          
                      if (!StringUtils.isAllEmpty(dureePret)) {
                          
                      port.addPret(refpret, refclient, refouvrage, dureePret, nbrexemplaire, prolonger);
                          
                                           

                      vResult = ActionSupport.SUCCESS;          
                      
     
                      }
                      
                      } catch (Exception pe) {
                        this.addActionError("Veuillez remplir les champs correctement");

                      }
                      
                      
                      return vResult;


                      }
                      
                     /**
                      * Méthode delete() qui va supprimer le pret
                      * en fonction de sa référence et de sa durée.
                     *
                     * 
                     * @return
                     */
                      public String doDeletePret() {
                          
                      BibliothequeServicesService bibliothequeServicesService= new BibliothequeServicesService();             
                      BibliothequeServices port =  bibliothequeServicesService.getBibliothequeServicesPort();
                      
                      String vResult = ActionSupport.INPUT;

                      PretResponse pretResponse = new PretResponse();

                      pretResponse.setRefpret(refpret);
                      pretResponse.setDureePret(dureePret);
                      
                      try {
                          
                      if (!StringUtils.isAllEmpty(dureePret)) {
                          
                      
                     port.deletePret(dureePret, refpret);
                      
                      vResult = ActionSupport.SUCCESS;          
                      
     
                      }
                      
                      } catch (Exception pe) {
                        this.addActionError("Veuillez remplir les champs correctement");

                      }
                      
                      
                      return vResult;
                          
                      }


                      }

                      


       
    

