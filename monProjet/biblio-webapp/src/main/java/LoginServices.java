import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import org.projet.biblio.business.manager.UtilisateurManager;
import org.projet.biblio.model.Utilisateur;


@WebService(targetNamespace = "http://biblio.com")
public class LoginServices {
    
           @WebMethod  
           public String doLogin( @WebParam(name="pseudo") String pseudo, @WebParam(name="motPasse") String motPasse ){

            Utilisateur utilisateur = new Utilisateur();
            
            


           Utilisateur utilisateur = UtilisateurManager.getUtilisateur(utilisateur);

                                      if(utilisateur != null ){
                                      session.setAttribute("user", utilisateur);                   

                                      return "redirect:/";
                }

            return "redirect:/login";

        }
           
           
           
           
           @WebMethod  
           public String doLogout (){
             
               return null;
      

        }

	

           
           @WebMethod
           public String initLogin() {

           HttpSession session = request.getSession();

           if (session.getAttribute("user") != null) {

           return "redirect:/";

       }

       return "login";

   }
    
}
