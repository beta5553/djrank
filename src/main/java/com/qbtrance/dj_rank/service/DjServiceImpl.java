package com.qbtrance.dj_rank.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import com.qbtrance.dj_rank.domain.Dj;

@Stateless
public class DjServiceImpl implements DjServiceRemote, DjServiceLocal {
	
	@Override
	public List<Dj> listDjs() {
		//static list.
		List<Dj> djList = new ArrayList<>();
		djList.add(new Dj(1,"izzi","Israel","Morales","Psychedelic Trance","USA","www.qbtrance.com","israel@qbtrance.com"));
		djList.add(new Dj(2,"Bizzare Contact","Birrazerre","Contacto","Psychedelic Trance","Israel","www.qbtrance.com","bizzare@qbtrance.com"));
		djList.add(new Dj(3,"Ultra Voice","Ultra","Voice","Psychedelic Trance","Israel","www.qbtrance.com","ultra@qbtrance.com"));
		return djList;
	}

	@Override
	public Dj getDjById(int djId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dj getDjByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registerNewDj(Dj dj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editExistingDj(Dj dj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteExisitingDJ(Dj dj) {
		// TODO Auto-generated method stub
		
	}


}
