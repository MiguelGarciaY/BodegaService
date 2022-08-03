package com.idat.Bodega.service;

import java.util.List;

import com.idat.Bodega.model.Bodega;

public interface BodegaService {
    List<Bodega> listar();
    Bodega porId(Integer id_alumno);
    void guardar(Bodega alumno);
    void eliminar(Integer id_alumno);
    void actualizar(Bodega alumno);
}
