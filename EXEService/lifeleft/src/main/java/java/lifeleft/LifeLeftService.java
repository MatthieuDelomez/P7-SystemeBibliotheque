/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.lifeleft;

import java.time.Year;
import java.util.concurrent.ThreadLocalRandom;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author Ben Gourion
 */
@WebService(serviceName = "LifeLeft")
public class LifeLeftService {
    
    public static final Integer ESPERANCE_VIE_HOMMES = 79;
    public static final Integer ESPERANCE_VIE_FEMMES = 85;
    
    String homme = "homme";
    String femme = "femme";
    
    Integer evDeReference = 0;

    @WebMethod
    public String  anneeRestantesAVivre (String prenom, String sexe, Integer anneeNaissance) {

        if(sexe.equals(homme)) evDeReference = ESPERANCE_VIE_HOMMES;
        else evDeReference = ESPERANCE_VIE_FEMMES;

        Integer anneeRestantes = evDeReference -(Year.now().getValue() - anneeNaissance );

        return "Bonjour " + prenom + ", il vous reste " + anneeRestantes + " ans � vivre, profitez-en au maximum !";
    }
    
    @WebMethod
    public int creerClient(String login, String password) {
        
        /*
        Ins�rer le clien dans la base de don�es et retourner son Id
        */
        return ThreadLocalRandom.current().nextInt(100, 900);
        
           }
    
    
    @WebMethod
    public String commanderCompteARebours(Integer clientId) {
        
        /*
        Ins�rer la commande dans la base de donn�es et retourner un message de validation
        */
         return "Merci!  Votre commande pour le client :" + clientId + "de compteur de vie est valid�e";

}
    


}

