package com.prueba.tecnica.rest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.prueba.tecnica.rest.models.entity.Colegio;

public interface IColegioDao extends CrudRepository<Colegio,Long> {

}
