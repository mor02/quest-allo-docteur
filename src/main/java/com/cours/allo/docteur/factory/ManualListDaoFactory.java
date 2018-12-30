/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.allo.docteur.factory;

import com.cours.allo.docteur.dao.IAdresseDao;
import com.cours.allo.docteur.dao.IUtilisateurDao;
import com.cours.allo.docteur.dao.manual.list.impl.ManualListAdresseDao;
import com.cours.allo.docteur.dao.manual.list.impl.ManualListUtilisateurDao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author ElHadji
 */
public class ManualListDaoFactory extends AbstractDaoFactory {

    private static final Log log = LogFactory.getLog(ManualListDaoFactory.class);
    private IUtilisateurDao utilisateurDao = null;
    private IAdresseDao adresseDao = null;
    private  static ManualListDaoFactory instance = null;

    public static ManualListDaoFactory getInstance() {
        if (instance == null) {
            instance = new ManualListDaoFactory();
        }
        return instance;
    }

    private ManualListDaoFactory() {
        log.debug("--> ************ Initialisation de " + ManualListDaoFactory.class.getSimpleName() + " ************");
        adresseDao = ManualListAdresseDao.getInstance();
        utilisateurDao = ManualListUtilisateurDao.getInstance();
    }

    @Override
    public IUtilisateurDao getUtilisateurDao() {
        return utilisateurDao;
    }

    @Override
    public IAdresseDao getAdresseDao() {
        return adresseDao;
    }
}
