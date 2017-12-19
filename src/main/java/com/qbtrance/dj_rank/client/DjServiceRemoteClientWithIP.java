package com.qbtrance.dj_rank.client;

import java.util.List;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.qbtrance.dj_rank.domain.Dj;
import com.qbtrance.dj_rank.service.DjServiceRemote;

public class DjServiceRemoteClientWithIP {

	public static void main(String[] args) {

		System.out.println("Iniciando cliente");

		try {
			Properties props = new Properties();
			props.setProperty("java.naming.factory.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
			props.setProperty("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
			props.setProperty("java.naming.factory.state",
					"com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");

			// optional. Default localhost. Aqui se cambia la IP del servidor
			// donde esta Glassfish
			props.setProperty("org.omg.CORBA.ORBInitialHost", "127.0.0.1");
			// optional. Puerto por Default 3700. Solo se necesita cambiar si el
			// puerto no es 3700.
			// props.setProperty("org.omg.CORBA.ORBInitialPort", "3700");

			Context jndi = new InitialContext(props);
			
			DjServiceRemote djServiceRemote = (DjServiceRemote) jndi
					.lookup("java:global/djrank/DjServiceImpl!com.qbtrance.dj_rank.service.DjServiceRemote");

			List<Dj> djList = djServiceRemote.listDjs();

			for (Dj dj : djList) {
				System.out.println(dj);
			}

			System.out.println("Fin del cliente EJB");

		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
}
