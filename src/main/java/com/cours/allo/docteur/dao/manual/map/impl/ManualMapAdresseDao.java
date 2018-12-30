/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.allo.docteur.dao.manual.map.impl;

import com.cours.allo.docteur.dao.DataSource;
import com.cours.allo.docteur.dao.IAdresseDao;
import com.cours.allo.docteur.dao.entities.Adresse;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author ElHadji
 */
public class ManualMapAdresseDao extends AbstractMapDao<Adresse> implements IAdresseDao {

    private static final Log log = LogFactory.getLog(ManualMapAdresseDao.class);

    private ManualMapAdresseDao() {
        super(Adresse.class, DataSource.getInstance().getAdressesMapDataSource());
    }

    @Override
    public List<Adresse> findAllAdresses() {
        return null;
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
        DataSource ds = DataSource.getInstance();
        //TODO : Rajouter le calcul de l'idAdresse ainsi que la gestion des exceptions
        ds.getAdressesMapDataSource().put(adresse.getIdAdresse(), adresse);
        
        
        return adresse;
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
