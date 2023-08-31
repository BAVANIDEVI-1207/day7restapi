package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.Model;
import com.example.project.repository.Repository;
@Service

public class Carservice {
	@Autowired
	Repository carser;
	
	public Model cardetails(Model c) {
		return carser.save(c);
	}
	
	public List<Model> car(List<Model> c){
		return(List<Model>)carser.saveAll(c);
	}
	public List<Model>show(){
		return carser.findAll();
	}
	public List<Model>showowner(int own){
		return carser.getowner(own);
	}
	public List<Model>showaddress(String add){
		return carser.getaddress(add);
	}
	
	public List<Model>showcarname(String cname){
		return carser.getcarname(cname);
	}
	
	public List<Model>showowntype(int own,String ctype){
		return carser.getowntype(own,ctype);
	}
	
	
	
	

}
