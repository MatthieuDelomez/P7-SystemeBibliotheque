/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblio.bibliotheque;

import java.util.concurrent.ThreadLocalRandom;
import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService(serviceName = "biblio")
public class BibliothequeService {
    
    String homme = "homme";
    String femme ="femme";
    String nom = "nom";
    String prenom = "prenom";
    String login = "login";
    String password = "password";
    String email = "email";
    
    
    
    @WebMethod
    public String CreerUser (String nom ,String prenom, String sexe, String login, String password, String email ){
        
        return "Notre bibliotheque vous souhaite la Bienvenue" + prenom + nom ;
    }
    
    
    
    @WebMethod
    public int clientId(String login, String password ){
           
        /*
        Insérer le client dans la base de données et retourner son id unique
        */
        return ThreadLocalRandom.current().nextInt(1,900);
    }
    
    
    
    @WebMethod
    public String commanderLivre(Integer clientId){
        
          /*
        Insérer la commande dans la base de données et retouner un message de validation
        */
        return "Merci!  Votre commande pour le client : " + clientId + " est validée";

        
    }
    
}
