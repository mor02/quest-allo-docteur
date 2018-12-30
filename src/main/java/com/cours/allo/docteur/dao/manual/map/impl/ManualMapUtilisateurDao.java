/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.allo.docteur.dao.manual.map.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.cours.allo.docteur.dao.DataSource;
import com.cours.allo.docteur.dao.IUtilisateurDao;
import com.cours.allo.docteur.dao.entities.Utilisateur;

/**
 *
 * @author ElHadji
 */
public class ManualMapUtilisateurDao extends AbstractMapDao<Utilisateur> implements IUtilisateurDao {

    private static final Log log = LogFactory.getLog(ManualMapUtilisateurDao.class);

    private ManualMapUtilisateurDao() {
        super(Utilisateur.class, DataSource.getInstance().getUtilisateursMapDataSource());
    }

    @Override
    public List<Utilisateur> findAllUtilisateurs() {
        return null;
    }

    @Override
    public Utilisateur findUtilisateurById(int idUtilisateur) {
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
		DataSource ds = DataSource.getInstance();
		Map mapUsers = ds.getUtilisateursMapDataSource();
		List<Utilisateur> usersList = new ArrayList<>();
		Set cles = mapUsers.keySet();
		Iterator it = cles.iterator();
		while (it.hasNext()) {
			Utilisateur user = (Utilisateur) it.next();
			if (nom.equals(user.getNom())) {
				usersList.add(user);
			}
		}
		return usersList;
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
