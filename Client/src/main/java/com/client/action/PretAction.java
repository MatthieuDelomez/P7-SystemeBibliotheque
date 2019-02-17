
package com.client.action;

import java.util.List;

import com.biblio.BibliothequeServices;
import com.biblio.BibliothequeServicesService;
import com.biblio.PretResponse;
import com.opensymphony.xwork2.ActionSupport;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.commons.lang3.StringUtils;


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
    
    private static AtomicInteger genId = new AtomicInteger(1);
     
  

    //=========Getters & Setters=======
    
     public List<PretResponse> getListPretResponse() {       
        return listPretResponse;
    }
    
    public void setListPretResponse(List<PretResponse> listPretResponse) {
        this.listPretResponse = listPretResponse;
    }

    public List<String> getListPret() {
        return listPret;
    }

    public void setListPret(List<String> listPret) {
        this.listPret = listPret;
    }

    public int getRefclient() {
        return refclient;
    }

    public void setRefclient(int refclient) {
        this.refclient = refclient;
    }

    public int getRefouvrage() {
        return refouvrage;
    }

    public void setRefouvrage(int refouvrage) {
        this.refouvrage = refouvrage;
    }

    public int getRefpret() {
        return refpret;
    }

    public void setRefpret(int refpret) {
        this.refpret = refpret;
    }

    public Date getDatefinpret() {
        return datefinpret;
    }

    public void setDatefinpret(Date datefinpret) {
        this.datefinpret = datefinpret;
    }

    public Date getDatepret() {
        return datepret;
    }

    public void setDatepret(Date datepret) {
        this.datepret = datepret;
    }

    public String getDureePret() {
        return dureePret;
    }

    public void setDureePret(String dureePret) {
        this.dureePret = dureePret;
    }

    public String getNbrexemplaire() {
        return nbrexemplaire;
    }

    public void setNbrexemplaire(String nbrexemplaire) {
        this.nbrexemplaire = nbrexemplaire;
    }

    public boolean isProlonger() {
        return prolonger;
    }

    public void setProlonger(boolean prolonger) {
        this.prolonger = prolonger;
    }

    public static AtomicInteger getGenId() {
        return genId;
    }

    public static void setGenId(AtomicInteger genId) {
        PretAction.genId = genId;
    }
    
    /*
    Retourner la date du jour
    */
    public Date getTodaydate() {
        return new Date();
    }
    
    public String display() {
        return NONE;
    }



    
  //================Méthodes===================
    
    
                      @Override
                      public String execute(){
                          
                      BibliothequeServicesService bibliothequeServicesService= new BibliothequeServicesService();             
                      BibliothequeServices port =  bibliothequeServicesService.getBibliothequeServicesPort();
                      listPret = new ArrayList();
                      listPretResponse = port.listPret();                                                        
           
                       return SUCCESS ;
                      

                       }


                      
                      public String doAddPret() {
                          
                                                
                      BibliothequeServicesService bibliothequeServicesService= new BibliothequeServicesService();             
                      BibliothequeServices port =  bibliothequeServicesService.getBibliothequeServicesPort();
 
                      String vResult = ActionSupport.INPUT;

                      PretResponse pretResponse = new PretResponse();                      
                      

                      pretResponse.setRefpret(refpret);
                      pretResponse.setRefclient(refclient);
                      pretResponse.setRefouvrage(refouvrage);
                   //   pretResponse.setDatepret(datepret);
                      pretResponse.setDureePret(dureePret);
                  //    pretResponse.setDatefinpret(datefinpret);
                      pretResponse.setNbrexemplaire(nbrexemplaire);
                      pretResponse.setProlonger(prolonger);


                      try {
                          
                      if (!StringUtils.isAllEmpty(dureePret)) {
                          
                      port.addPret(refpret, refclient, refouvrage, dureePret, nbrexemplaire, prolonger);
                          
                      
                      refpret = genId.getAndIncrement();
                      

                      vResult = ActionSupport.SUCCESS;          
                      
     
                      }
                      
                      } catch (Exception pe) {
                        this.addActionError("Veuillez remplir les champs correctement");

                      }
                      
                      
                      return vResult;


                      }
                      
                      
                      
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

                      


       
    

