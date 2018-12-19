package com.biblio;

import com.biblio.resources.AbstractResource;
import com.responses.PretResponse;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import org.projet.biblio.consumer.dao.PretDao;
import org.projet.biblio.model.Pret;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@WebService(name="PretServices") 
public class PretServices extends AbstractResource {
    
    
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
    
		/* Créer un utilisateur */
    PretDao bibliothequeDao = ctx.getBean("pretDao", PretDao.class);
    
    
    /**
     *
     * @param refOuvrage
     * @param refClient
     * @param refPret
     * @param datePret
     * @param dureePret
     * @param dateFinPret
     * @param nbrExemplaire
     * @param prolonger
     * @return
     */
           @WebMethod(operationName = "doCreatePret")
           public PretResponse doCreatePret(@WebParam(name="refouvrage") int refOuvrage,  
                                                                             @WebParam(name="refclient") int refClient,
                                                                             @WebParam(name="refpret") int refPret,
                                                                             @WebParam(name="datepret") String datePret,
                                                                             @WebParam(name="dureepret") String dureePret,
                                                                             @WebParam(name="datefinpret") String dateFinPret,
                                                                             @WebParam(name="nbrexemplaire") String nbrExemplaire,
                                                                             @WebParam(name="prolonger") boolean prolonger  ) {
               
           Pret pret = new Pret(); 
           PretResponse response = new PretResponse();
               

               pret.setRefOuvrage(refOuvrage);
               pret.setDatePret(datePret);
               pret.setDureePret(dureePret);
               pret.setDateFinPret(dateFinPret);
               pret.setNbrExemplaire(nbrExemplaire);
               pret.setProlonger(prolonger);
               pret.setRefClient(refClient);
               pret.setRefPret(refPret);

                       
                       
               response.setRefOuvrage(refOuvrage);
               response.setDatePret(datePret);
               response.setDureePret(dureePret);
               response.setDateFinPret(dateFinPret);
               response.setDureePret(nbrExemplaire);
               response.setProlonger(prolonger);
               response.setRefClient(refClient);
               response.setRefPret(refPret);

              bibliothequeDao.addPret(pret);

               
               return response;               
               
               
           }

    
}
