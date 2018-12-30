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
import com.cours.allo.docteur.exception.CustomException;

import java.util.ArrayList;
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
        return null;
    }

    @Override
	public List<Adresse> findAdressesByVille(String ville) {

		List<Adresse> listVille = null;
		if (ville != null && !ville.isEmpty()) {
			listVille = new ArrayList<Adresse>();
			List<Adresse> list = DataSource.getInstance().getAdressesListDataSource();

			for (Adresse adress : list) {
				if (ville.equals(adress.getVille())) {
					listVille.add(adress);
				}
			}
		}

		return listVille;

	}

    @Override
    public List<Adresse> findAdressesByCodePostal(String codePostal) {

    	List<Adresse> adresses = new ArrayList<Adresse>();
    	List<Utilisateur> users = DataSource.getInstance().getUtilisateursListDataSource();
    	//List<Adresse> adressesTemp = null;
    	
    	for (Utilisateur user : users) {
    		if (codePostal.equals(((Adresse) user.getAdresses()).getCodePostal())) {
    			adresses.add((Adresse) user.getAdresses());
    		}
    	}
    	
//    	for (Adresse adress : adresses) {
//    		if (codePostal.equals(adress.getCodePostal())) {
//    			adressesTemp.add(adress);
//    		}
//    	}
    	
        return adresses;
    
    }

    @Override
	public Adresse createAdresse(Adresse adresse) {
		if (adresse != null) {
			// On récupère l'instance ds
			DataSource ds = DataSource.getInstance();
			// On calcul l'id de l'adresse
			adresse.setIdAdresse(ds.getAdressesListDataSource().size() + 1);
			// on sette l'adresse dans la liste
			ds.getAdressesListDataSource().add(adresse);
		}

		return adresse;

	}

    @Override
	public Adresse updateAdresse(Adresse adresse) throws CustomException{
		if (adresse != null) {
			// On récupère l'instance ds
			DataSource ds = DataSource.getInstance();
			Adresse oldAdresse =null;
			try {
			 oldAdresse = ds.getAdressesListDataSource().get(adresse.getIdAdresse());
			}catch (IndexOutOfBoundsException e) {
				throw new CustomException("Adresse n'existe pas", 1);
			}
			if(oldAdresse!=null) {
				//On supprime l'ancienne adresse et on la remplace par la nouvelle
				ds.getAdressesListDataSource().remove(oldAdresse.getIdAdresse());
				//Incrémentation de la version
				adresse.setVersion(adresse.getVersion()+1);
				ds.getAdressesListDataSource().add(adresse);
			}
		}

		return adresse;

	}

    @Override
    public boolean deleteAdresse(Adresse adresse) {
        return false;
    }
}
