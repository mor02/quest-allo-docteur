
package com.cours.allo.docteur.main;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.cours.allo.docteur.dao.entities.Utilisateur;
import com.cours.allo.docteur.service.IServiceFacade;
import com.cours.allo.docteur.service.ServiceFacade;

/**
 *
 * @author elhad
 */
public class Main {

    private static final Log log = LogFactory.getLog(Main.class);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IServiceFacade serviceFacade = new ServiceFacade();
        //ManualListUtilisateurDao manualListUtilisateurDao = ManualListUtilisateurDao.getInstance();
        System.out.println("USER : >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> : ");
        List<Utilisateur> users = serviceFacade.findAllUtilisateurs();
        System.out.println(users.toString());
        System.out.println("taile : "+users.size());
        System.out.println("");
    }
}
