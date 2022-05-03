package com.example.library_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library_management.model.Admin;
import com.example.library_management.repo.AdminRepo;
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepo repo;
	

	@Override
	public String insertmovie(Admin a) {
		// TODO Auto-generated method stub
		repo.save(a);
		return "Movie Inserted";
	}

	@Override
	public String deletemovie(Admin a) {
		// TODO Auto-generated method stub
		repo.delete(a);
		return "Movie deleted";
	}

	

	@Override
	public List<Admin> getAllmovie() {
		// TODO Auto-generated method stub
		return repo.findAll() ;
	}

	
	

	

}
