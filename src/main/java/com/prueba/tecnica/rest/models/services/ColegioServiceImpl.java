package com.prueba.tecnica.rest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prueba.tecnica.rest.models.dao.IColegioDao;
import com.prueba.tecnica.rest.models.entity.Colegio;
@Service
public class ColegioServiceImpl implements IColegioService {
	@Autowired
	private IColegioDao colegioDao;

	@Override
	@Transactional(readOnly = true)
	public List<Colegio> findAll() {
		return (List<Colegio>) colegioDao.findAll();
	}
}
