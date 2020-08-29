package com.uacs.test.Main;

import javax.persistence.EntityManager;

import com.uacs.framework.mgr.KeyGenerateMgr;
import com.uacs.framework.util.hibernateUtil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager entityManager = hibernateUtil.getEntityManager();
		long sysKey = KeyGenerateMgr.generateSysKey("Employee", 1, entityManager);
		hibernateUtil.closeConnection(entityManager);
		System.out.print(sysKey);

	}

}
