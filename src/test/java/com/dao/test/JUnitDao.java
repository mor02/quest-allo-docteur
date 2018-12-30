package com.dao.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitDao {

    private static final Log log = LogFactory.getLog(JUnitDao.class);

    JUnitQuestAlloDocteurList junitQuestList = new JUnitQuestAlloDocteurList();
    @BeforeClass
    public static void init() throws Exception {
    	JUnitQuestAlloDocteurList.init();
    }
    
    @Test
    public void testAll() {
    	junitQuestList.testFindAllUtilisateur();
    	junitQuestList.testFinUtilisateurById();
    }

    @AfterClass
    public static void terminate() throws Exception {

    }
}
