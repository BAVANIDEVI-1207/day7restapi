package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.Model;
import com.example.project.service.Carservice;

@RestController
public class Controller {

	@Autowired
	Carservice ser;
	@PostMapping("addcar")
	public Model carinfo(@RequestBody Model c) { 
		return ser.cardetails(c);
	}
	@PostMapping("addnacar")
	public List<Model>carinfo(@RequestBody List<Model>c){
		return (List<Model>) ser.car(c);
		
	}
	@GetMapping("dispcar")
	public List<Model> getinfo(){
		return ser.show();
	}
	@GetMapping("owner/{owners}")
	public List<Model>getownerinfo(@PathVariable int owners){
		return ser.showowner(owners);
	}
	@GetMapping("address/{adress}")
	public List<Model>getaddressinfo(@PathVariable String address){
		return ser.showaddress(address);
	}
	@GetMapping("owner/{owners}")
	public List<Model>getowntypeinfo(@PathVariable int owners,String carType){
		return ser.showowntype(owners,carType);
	}
}
