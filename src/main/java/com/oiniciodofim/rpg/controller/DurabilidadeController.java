package com.oiniciodofim.rpg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.oiniciodofim.rpg.dao.DurabilidadeDAO;
import com.oiniciodofim.rpg.model.DurabilidadeModel;

@Controller
public class DurabilidadeController {
	
	@Autowired
	private DurabilidadeDAO userRepository;
	
	public List<DurabilidadeModel> lista(){
		
		return userRepository.getDurabilidadeList();
	}
	
	@RequestMapping(value = "registration/add", method = RequestMethod.GET)
    public List<DurabilidadeModel> addUser(){
		List<DurabilidadeModel> lista = lista();
    return lista;
    }
   
    }



