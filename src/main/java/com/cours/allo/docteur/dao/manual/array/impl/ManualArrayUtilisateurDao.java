/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.allo.docteur.dao.manual.array.impl;

import com.cours.allo.docteur.dao.IUtilisateurDao;
import com.cours.allo.docteur.dao.entities.Utilisateur;
import com.cours.allo.docteur.dao.DataSource;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author ElHadji
 */
public class ManualArrayUtilisateurDao extends AbstractArrayDao<Utilisateur> implements IUtilisateurDao {

    private static final Log log = LogFactory.getLog(ManualArrayUtilisateurDao.class);

    private ManualArrayUtilisateurDao() {
        super(Utilisateur.class, DataSource.getInstance().getUtilisateursArrayDataSource());
    }

    @Override
    public List<Utilisateur> findAllUtilisateurs() {
        return null;
    }

    @Override
    public Utilisateur findUtilisateurById(int idUtilisateur) {
        DataSource ds = DataSource.getInstance();
        Utilisateur[] usersArray = ds.getUtilisateursArrayDataSource();
        for(int i=0 ; i<usersArray.length;i++) {
        	if(usersArray[i].getIdUtilisateur() == idUtilisateur) {
        		return usersArray[i];
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
