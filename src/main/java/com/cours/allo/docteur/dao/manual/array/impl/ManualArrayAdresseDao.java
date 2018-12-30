/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.allo.docteur.dao.manual.array.impl;

import com.cours.allo.docteur.dao.DataSource;
import com.cours.allo.docteur.dao.IAdresseDao;
import com.cours.allo.docteur.dao.entities.Adresse;

import java.lang.reflect.Array;
import java.util.Arrays;
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
        return Arrays.asList(DataSource.getInstance().getAdressesArrayDataSource());
    }

    @Override
    public Adresse findAdresseById(int idAdresse) {
        return null;
    }

    @Override
    public List<Adresse> findAdressesByVille(String ville) {
    	return DataSource.getInstance().getAdressesListDataSource();
    }

    @Override
    public List<Adresse> findAdressesByCodePostal(String codePostal) {
        return null;
    }

    @Override
    public Adresse createAdresse(Adresse adresse) {
    	
    	//DEBUT V1
//        //on récuppère la ds
//    	DataSource ds = DataSource.getInstance();
//    	//Pour simplifier le travail --> transformer le tableau en liste
//    	List<Adresse> adressesActuelles = Arrays.asList(ds.getAdressesArrayDataSource());
//    	//TODO Ajouter l'adresse de la meme façon pour les liste
//    	
//    	//Transformer la liste en tableau
//    	Adresse []adressesTab = (Adresse[]) adressesActuelles.toArray();
//    	
//    	//Ensuite il faut setter le nouveau tableau --> absence d'un setter !!!!
    	//FIN V1
    	
    	DataSource ds = DataSource.getInstance();
    	
    	Adresse[] tabAdresses = ds.getAdressesArrayDataSource();
    	//TODO Calcul l'idAdresse
    	Adresse[] tabAdresseFinal = new Adresse[tabAdresses.length+1];
    	tabAdresseFinal[tabAdresses.length] = adresse; 
    	//Ensuite il faut setter le nouveau tableau --> absence d'un setter !!!!
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
