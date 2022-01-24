package com.prueba.tecnica.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.tecnica.rest.models.entity.Colegio;
import com.prueba.tecnica.rest.models.services.IColegioService;

@RestController
@RequestMapping("/api")
public class ColegioRestController {

	@Autowired
	private IColegioService colegioService;

	@GetMapping("colegios")
	public List<Colegio> index() {
		return colegioService.findAll();
	}
}
