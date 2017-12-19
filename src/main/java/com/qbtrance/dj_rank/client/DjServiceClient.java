package com.qbtrance.dj_rank.client;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.qbtrance.dj_rank.domain.Dj;
import com.qbtrance.dj_rank.service.DjServiceRemote;

public class DjServiceClient {
	
	public static void main (String [] args) {
		
		System.out.println("Iniciando cliente");
		
		try {
			Context jndi = new InitialContext();
			DjServiceRemote djServiceRemote = 
					(DjServiceRemote) jndi.lookup("java:global/djrank/DjServiceImpl!com.qbtrance.dj_rank.service.DjServiceRemote");
			
			List<Dj> djList = djServiceRemote.listDjs();
			
			for (Dj dj: djList){
				System.out.println(dj);
			}
			
			 System.out.println("Fin del cliente EJB");
			
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
}
