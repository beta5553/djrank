package com.qbtrance.dj_rank;

import static org.junit.Assert.*;

import java.util.List;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.NamingException;

import org.junit.Before;
import org.junit.Test;

import com.qbtrance.dj_rank.domain.Dj;
import com.qbtrance.dj_rank.service.DjServiceLocal;

public class DjServiceLocalTest {
	
	private DjServiceLocal djServiceLocal;
	
	@Before
	public void inicilizarContenedor()  {
		System.out.println("Starting DjServiceLocal Test - Init EJBContainer");
		EJBContainer container = EJBContainer.createEJBContainer();
		
		try {
			djServiceLocal = (DjServiceLocal) container.getContext().lookup("java:global/classes/DjServiceImpl!com.qbtrance.dj_rank.service.DjServiceLocal");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test()
	{
		System.out.println("Starting DjServiceLocal Test");
		assertTrue(djServiceLocal != null);
		
		djServiceLocal.addNewDj(new Dj(4,"Cygnus X1", "Israel", "Morales", "Psychedelic Trance", "Mexico", "www.cx1.com","cx1@qbtrance.com"));
		
		assertNotNull(djServiceLocal);
		assertEquals(4, djServiceLocal.listDjs().size());
		
		listDjs(djServiceLocal.listDjs());
		
		System.out.println("Done testing DjServiceLocal - completed");
	}
	
	private void listDjs(List<Dj> djList) {
		for (Dj dj: djList) {
			System.out.println(dj);
		}
	}
	
}