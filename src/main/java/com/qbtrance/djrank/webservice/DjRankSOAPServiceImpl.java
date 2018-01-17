package com.qbtrance.djrank.webservice;

import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(endpointInterface = "com.qbtrance.djrank.webservice.DjRankSOAPService")
public class DjRankSOAPServiceImpl implements DjRankSOAPService {

	@Override
	public String getQbtranceInfo() {
		return "QBTRANCE B-Teamn WebServices are ruling Big time";
	}

	@Override
	public int sum(int a, int b) {
		return a+b;
	}

	@Override
	public String getDjTop10() {
		return "IZZY, THROWER, MISTICKA, ACSENSION";
	}
	
}
