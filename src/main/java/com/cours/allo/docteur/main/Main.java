/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.allo.docteur.main;

import com.cours.allo.docteur.dao.manual.list.impl.ManualListUtilisateurDao;
import com.cours.allo.docteur.service.IServiceFacade;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

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
        IServiceFacade serviceFacade = null;
        ManualListUtilisateurDao manualListUtilisateurDao = ManualListUtilisateurDao.getInstance();
        System.out.println("USER : >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> : ");
        System.out.println(manualListUtilisateurDao.findAllUtilisateurs());
        System.out.println("");
        System.out.println("User by ID : >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> : ");
        System.out.println(manualListUtilisateurDao.findUtilisateurById(15));
        System.out.println("");
    }
}
