package com.dao.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeNoException;

import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cours.allo.docteur.dao.entities.Adresse;
import com.cours.allo.docteur.dao.entities.Utilisateur;
import com.cours.allo.docteur.exception.CustomException;
import com.cours.allo.docteur.service.IServiceFacade;
import com.cours.allo.docteur.service.ServiceFacade;

public class JUnitQuestAlloDocteurList extends JUnitQuestAlloDocteur {

    private static final Log log = LogFactory.getLog(JUnitQuestAlloDocteurList.class);
    static IServiceFacade serviceFacade =null;
    
    @BeforeClass
    public static void init() throws Exception {
    	
    	 serviceFacade = new ServiceFacade();
    }
    
    @Test
    public void testFindAllUtilisateur() {
    	List<Utilisateur> listUsers = serviceFacade.findAllUtilisateurs();
    	assertEquals(listUsers.size(), 28);
    }
    
    @Test
    public void testFinUtilisateurById() {
    	Utilisateur user = serviceFacade.findUtilisateurById(1);
    	assertEquals(user.getNom(), "Cantin");
    	assertEquals(user.getPrenom(), "Jerome");
    	assertNotNull("Attention adresse null", user.getAdresses());
    }
    
    @Test
    public void testUpdateAdresse() {
    	Adresse newAdresse = new Adresse();
    	newAdresse.setIdAdresse(11000);
    	try {
    		serviceFacade.updateAdresse(newAdresse);
    	}catch(CustomException e) {
    		assertTrue(true);
    	}
    	
    }
}
