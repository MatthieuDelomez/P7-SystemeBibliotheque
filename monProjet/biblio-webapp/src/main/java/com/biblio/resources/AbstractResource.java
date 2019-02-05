
package com.biblio.resources;
import org.projet.biblio.business.managerImpl.ManagerFactoryImpl;


public abstract class AbstractResource {
    

    private static ManagerFactoryImpl managerFactory;


    protected static ManagerFactoryImpl getManagerFactory() {

        return managerFactory ;

    }


    public static void setManagerFactory(ManagerFactoryImpl managerFactory) {

        AbstractResource.managerFactory = managerFactory;

    }

	

}
    

