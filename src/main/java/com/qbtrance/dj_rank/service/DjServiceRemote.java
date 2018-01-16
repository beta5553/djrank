package com.qbtrance.dj_rank.service;

import java.util.List;

import javax.ejb.Remote;

import com.qbtrance.dj_rank.domain.Dj;

@Remote
public interface DjServiceRemote {
	
	public List<Dj> listDjs();
	public Dj getDjById(int djId);
	public Dj getDjByEmail(String email);
	public void addNewDj(Dj dj);
	public void editExistingDj(Dj dj);
	public void deleteExisitingDJ(Dj dj);
	
}
