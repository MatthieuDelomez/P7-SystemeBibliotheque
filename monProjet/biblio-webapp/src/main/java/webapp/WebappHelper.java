/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webapp;

import org.projet.biblio.business.manager.ManagerFactory;


/**

 * Classe de helper temporaire pour la webapp...

 */

public abstract class WebappHelper {



    private static ManagerFactory managerFactory;



    public static ManagerFactory getManagerFactory() {

        return managerFactory;

    }

    public static void setManagerFactory(ManagerFactory pManagerFactory) {

        managerFactory = pManagerFactory;

    }

}