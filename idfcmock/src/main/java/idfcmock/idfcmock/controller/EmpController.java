package idfcmock.idfcmock.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import idfcmock.idfcmock.dao.Empdao;
import idfcmock.idfcmock.dto.Empdto;

@Controller
public class EmpController {
	
	@Autowired
	Empdao empdao;

	@PostMapping("/inserted")
	public void insert(@RequestBody Empdto empdto) {
		empdao.insert(empdto);	
	}
	
	
	@DeleteMapping("/delete")
	public String remove(@RequestBody Empdto empdto) {
		String msg=empdao.remove(empdto.getEmp_id());
		return msg;
	}
	@GetMapping("/fetched")
	public Empdto fetch(@RequestBody Empdto empdto) {
		int id=empdto.getEmp_id();
		Empdto msg=empdao.fetch(id);
		return msg;
	}
} 
