package com.qbtrance.dj_rank;

import static org.junit.Assert.*;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import javax.naming.NamingException;

import org.junit.Test;
import org.junit.Before;

public class DjRankEJBTest {
	
	private static EJBContainer container;
	private static Context context; 
	private static DjRankEJB djRankEJB; 
	
	@Before
	public void initEJBContainer() {
		System.out.println("Iniciando contenedor embebido EJB");
		container = EJBContainer.createEJBContainer();
		context = container.getContext();	
		
	}

	@Test
	public void test() {
	
	try {
			djRankEJB = (DjRankEJB) context.lookup("java:global/classes/DjRankEJB");
			String rankMaster = djRankEJB.getRankMasterName();
			System.out.println(rankMaster);
			
		} catch (NamingException e) {
			e.printStackTrace();
		}
	
	}
}