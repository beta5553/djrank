package com.qbtrance.dj_rank.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import com.qbtrance.dj_rank.domain.Dj;

@Stateless
public class DjServiceImpl implements DjServiceRemote, DjServiceLocal {
	
	static List<Dj> djList = new ArrayList<>();
	
	@Override
	public List<Dj> listDjs()
	{
		djList.add(new Dj(1,"Izzy","Israel","Morales","Psychedelic Trance","USA","www.qbtrance.com","israel@qbtrance.com"));
		djList.add(new Dj(2,"Bizzare Contact","Birrazerre","Contacto","Psychedelic Trance","Israel","www.qbtrance.com","bizzare@qbtrance.com"));
		djList.add(new Dj(3,"Ultra Voice","Ultra","Voice","Psychedelic Trance","Israel","www.qbtrance.com","ultra@qbtrance.com"));
		return djList;
	}

	@Override
	public Dj getDjById(int djId) {
		return djList.get(djId);
	}

	@Override
	public Dj getDjByEmail(String email) {
		return null;
	}

	@Override
	public void addNewDj(Dj dj) {
		djList.add(dj);
	}

	@Override
	public void editExistingDj(Dj dj) {
		//djList.set(djList.get(dj), dj);
	}

	@Override
	public void deleteExisitingDJ(Dj dj) {
		djList.remove(dj);
	}

}
