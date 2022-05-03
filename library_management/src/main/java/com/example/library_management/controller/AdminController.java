package com.example.library_management.controller;

import java.util.List;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.library_management.model.Admin;
import com.example.library_management.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	AdminService service;
	@GetMapping("/try")
	public String ty()
	{
		return "it's working";
	}

	@GetMapping("/all")
	public List<Admin> showAll(){
		return service.getAllmovie();
	}
	@PostMapping("/add")
	public String Insertmovie(@RequestBody Admin a)
	{
		
		return service.insertmovie(a);
	}

	@DeleteMapping("/delete")
	public String Deletemovie(@RequestBody Admin a)
	{
		return service.deletemovie(a);
	}
	
	
	
	

}
