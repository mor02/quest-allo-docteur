/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.allo.docteur.dao.manual.list.impl;

import com.cours.allo.docteur.dao.DataSource;
import com.cours.allo.docteur.dao.IUtilisateurDao;
import com.cours.allo.docteur.dao.entities.Utilisateur;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author ElHadji
 */
public class ManualListUtilisateurDao extends AbstractListDao<Utilisateur> implements IUtilisateurDao {

    private static final Log log = LogFactory.getLog(ManualListUtilisateurDao.class);

    private static ManualListUtilisateurDao instance = null;

    public static ManualListUtilisateurDao getInstance() {
        if (instance == null) {
            instance = new ManualListUtilisateurDao();
        }
        return instance;
    }
    
    private ManualListUtilisateurDao() {
        super(Utilisateur.class, DataSource.getInstance().getUtilisateursListDataSource());
    }

    @Override
    public List<Utilisateur> findAllUtilisateurs() {
    	return DataSource.getInstance().getUtilisateursListDataSource();
    }

    @Override
    public Utilisateur findUtilisateurById(int idUtilisateur) {
    	List<Utilisateur> list = DataSource.getInstance().getUtilisateursListDataSource();
    	
    	for (Utilisateur utilisateur : list) {
    		if ( utilisateur.getIdUtilisateur() == idUtilisateur) {
    			return utilisateur;
    		}
    	}
        return null;
    
    }

    @Override
    public List<Utilisateur> findUtilisateurByIdentifiant(String identifiant) {
        return null;
    }

    @Override
    public List<Utilisateur> findUtilisateursByPrenom(String prenom) {
        return null;
    }

    @Override
    public List<Utilisateur> findUtilisateursByNom(String nom) {
        return null;
    }

    @Override
    public List<Utilisateur> findUtilisateursByCodePostal(String codePostal) {
        return null;
    }

    @Override
    public Utilisateur createUtilisateur(Utilisateur user) {
        return null;
    }

    @Override
    public Utilisateur updateUtilisateur(Utilisateur user) {
        return null;
    }

    @Override
    public boolean deleteUtilisateur(Utilisateur user) {
        return false;
    }
}
