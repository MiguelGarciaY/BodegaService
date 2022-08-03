package com.idat.Bodega.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.Bodega.model.Bodega;
import com.idat.Bodega.repository.BodegaRepository;

@Service
public class BodegaServiceImpl implements BodegaService{
	
    @Autowired
    private BodegaRepository repository;

	@Override
	public List<Bodega> listar() {
		 return repository.findAll();
	}

	@Override
	public Bodega porId(Integer id_bodega) {
		return repository.findById(id_bodega).orElse(null);
	}

	@Override
	public void guardar(Bodega bodega) {
		repository.save(bodega);
		
	}

	@Override
	public void eliminar(Integer id_bodega) {
		repository.deleteById(id_bodega);		
	}

	@Override
	public void actualizar(Bodega bodega) {
		repository.saveAndFlush(bodega);
		
	}

}
