/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.allo.docteur.dao.manual.array.impl;

import com.cours.allo.docteur.dao.DataSource;
import com.cours.allo.docteur.dao.IAdresseDao;
import com.cours.allo.docteur.dao.entities.Adresse;
import com.cours.allo.docteur.dao.manual.list.impl.ManualListAdresseDao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author ElHadji
 */
public class ManualArrayAdresseDao extends AbstractArrayDao<Adresse> implements IAdresseDao {

    private static final Log log = LogFactory.getLog(ManualArrayAdresseDao.class);
    private static ManualArrayAdresseDao instance = null;

    public static ManualArrayAdresseDao getInstance() {
        if (instance == null) {
            instance = new ManualArrayAdresseDao();
        }
        return instance;
    }

    private ManualArrayAdresseDao() {
        super(Adresse.class, DataSource.getInstance().getAdressesArrayDataSource());
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
        return null;
    }

    @Override
    public List<Adresse> findAdressesByCodePostal(String codePostal) {
        return null;
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
