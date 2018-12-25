/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.allo.docteur.dao.manual.list.impl;

import com.cours.allo.docteur.dao.DataSource;
import com.cours.allo.docteur.dao.IAdresseDao;
import com.cours.allo.docteur.dao.entities.Adresse;
import com.cours.allo.docteur.dao.entities.Utilisateur;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author ElHadji
 */
public class ManualListAdresseDao extends AbstractListDao<Adresse> implements IAdresseDao {

    private static final Log log = LogFactory.getLog(ManualListAdresseDao.class);
    private static ManualListAdresseDao instance = null;

    public static ManualListAdresseDao getInstance() {
        if (instance == null) {
            instance = new ManualListAdresseDao();
        }
        return instance;
    }

    private ManualListAdresseDao() {
        super(Adresse.class, DataSource.getInstance().getAdressesListDataSource());
    }

    @Override
    public List<Adresse> findAllAdresses() {
    	return DataSource.getInstance().getAdressesListDataSource();
    }

    @Override
    public Adresse findAdresseById(int idAdresse) {
    	List<Adresse> list = DataSource.getInstance().getAdressesListDataSource();
    	
    	for (Adresse adress : list) {
    		if ( adress.getIdAdresse() == idAdresse) {
    			return adress;
    		}
    	}
        return null;
    }

    @Override
    public List<Adresse> findAdressesByVille(String ville) {
    	List<Adresse> list = DataSource.getInstance().getAdressesListDataSource();
    	List<Adresse> listVille = null;
    	for (Adresse adress : list) {
    		if ( adress.getVille() == ville) {
    			listVille.add(adress);
    		}
    	}
        return listVille;
    }

    @Override
    public List<Adresse> findAdressesByCodePostal(String codePostal) {
    	List<Adresse> adresses = null;
    	List<Utilisateur> users = DataSource.getInstance().getUtilisateursListDataSource();
    	List<Adresse> adressesTemp = null;
    	
    	for (Utilisateur user : users) {
    		adresses.add((Adresse) user.getAdresses());
    	}
    	
    	for (Adresse adress : adresses) {
    		if (adress.getCodePostal() == codePostal) {
    			adressesTemp.add(adress);
    		}
    	}
    	
        return adresses;
    }

    @Override
    public Adresse createAdresse(Adresse adresse) {
        return null;
    }

    @Override
    public Adresse updateAdresse(Adresse adresse) {
        return null;
    }

    @Override
    public boolean deleteAdresse(Adresse adresse) {
        return false;
    }
}
