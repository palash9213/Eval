package com.example.library_management.service;

import java.util.List;

import com.example.library_management.model.Admin;

import net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition.Optional;

public interface AdminService {
	public List<Admin> getAllmovie();
	public String insertmovie(Admin a);
	public String deletemovie(Admin a);
	

}
