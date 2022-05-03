package com.example.library_management.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.library_management.model.Admin;

@FeignClient(name="customer")
public interface CustomerFeign {
	@GetMapping("Movie/search/movie_type")
	public List<Admin> searchByMovie_id(@PathVariable("Movie_type")String movie_type,@PathVariable("Rating")int rating);

}
