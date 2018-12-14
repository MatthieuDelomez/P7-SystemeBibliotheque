package com.biblio;

import com.biblio.resources.AbstractResource;
import com.responses.PretResponse;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import org.projet.biblio.business.manager.PretManager;
import org.projet.biblio.model.Pret;


@WebService(name="PretServices") 
public class PretServices extends AbstractResource {
    
    
           private PretManager pretManager = getManagerFactory().getPretManager();

    
           @WebMethod(operationName = "doCreatePret")
           public PretResponse doCreatePret(@WebParam(name="refouvrage") int refOuvrage,  
                                                                             @WebParam(name="datepret") String datePret,
                                                                             @WebParam(name="dureepret") String dureePret,
                                                                             @WebParam(name="datefinpret") String dateFinPret,
                                                                             @WebParam(name="nbrexemplaire") String nbrExemplaire,
                                                                             @WebParam(name="prolonger") boolean prolonger  ) {
               
           Pret pret = new Pret(); 
           PretResponse response = new PretResponse();
               

               response.setRefOuvrage(1);
               response.setDatePret("datepret");
               response.setDureePret("dureepret");
               response.setDateFinPret("datefinpret");
               response.setDureePret("nbrexemplaire");
               response.setProlonger(false);

               pretManager.addPret(pret);

               
               return response;               
               
               
           }

    
}
