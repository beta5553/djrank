package com.qbtrance.djrank.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface DjRankSOAPService {
	
	@WebMethod
	public String getQbtranceInfo();
	
	@WebMethod
	public int sum(int a, int b);
	
	@WebMethod 
	String getDjTop10();
	
}