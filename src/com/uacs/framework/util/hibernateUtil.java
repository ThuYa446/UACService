package com.uacs.framework.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.nirvasoft.util.ReadFile;

import password.DESedeEncryption;

/*
 * @Author: Thu Ya Oo
 * @Date:	13th July 2020
 */
public class hibernateUtil {

	public static String driver;
	public static String url;
	public static String username;
	public static String passwordEnc;
	public static String passwordDec;
	static DESedeEncryption myEncryptor;
	
	public static EntityManager getEntityManager() {
		EntityManager entityManager = null;
		String conStatus = "";
		try {
			myEncryptor = new DESedeEncryption();
			ArrayList<String>  dbConList;
			dbConList = ReadFile.readConnection(System.getenv("uacs")+"/data/"+ "ConnectionConfig.txt");
			if(dbConList.size()>0){
				driver = dbConList.get(0).split("Driver:")[1];
				url = dbConList.get(1).split("URL:")[1];
				username = dbConList.get(2).split("UserName:")[1];
				passwordEnc = dbConList.get(3).split("Password:")[1];
				passwordDec = myEncryptor.decrypt(passwordEnc);
			}
			
			//get the Database Connection Properties
			Map<String,Object> configOverrides = new HashMap<String,Object>();
			configOverrides.put("javax.persistence.jdbc.driver", driver);
			configOverrides.put("javax.persistence.jdbc.url", url);
			configOverrides.put("javax.persistence.jdbc.user", username);
			configOverrides.put("javax.persistence.jdbc.password", passwordDec);
			
			//Create EntityManagerFactory
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("UACService", configOverrides);
			entityManager = entityManagerFactory.createEntityManager();
			conStatus = "Connection Opened!";
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
			conStatus = "Connection can not be opened!";
		}
		System.out.println(conStatus);
		return entityManager;
	}
	
	public static void closeConnection(EntityManager entityManager){
		String conStatus = "";
		try{
			if(entityManager!= null && entityManager.isOpen()) {
				try{
					entityManager.getTransaction().commit();
					conStatus = "Connection Closed by commit!";
				}catch(Exception e){
					entityManager.getTransaction().rollback();
					conStatus = "Connection Closed by rollBack!";
				}
				entityManager.clear();
				entityManager.close();
			}else{
				conStatus = "Connection Closed Already!";
			}
				
		}catch(Exception e){
			e.getMessage();
			conStatus = "Connection can not be closed!";	
		}
		System.out.println(conStatus);
	}
	
}
