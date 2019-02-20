
package com.biblio.resources;
import org.projet.biblio.business.managerImpl.ManagerFactoryImpl;

/**
 *
 * @author Delomez Matthieu
 */
public abstract class AbstractResource {
    

    private static ManagerFactoryImpl managerFactory;

    /**
     *
     * @return
     */
    protected static ManagerFactoryImpl getManagerFactory() {

        return managerFactory ;

    }

    /**
     *
     * @param managerFactory
     */
    public static void setManagerFactory(ManagerFactoryImpl managerFactory) {

        AbstractResource.managerFactory = managerFactory;

    }

	

}
    

