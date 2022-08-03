package com.idat.Bodega.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.idat.Bodega.model.Bodega;
import com.idat.Bodega.service.BodegaService;

@Controller
@RequestMapping("/api/bodega/v1")
public class BodegaController {
    @Autowired
    private BodegaService service;

    @GetMapping("/listar")
    public ResponseEntity<List<Bodega>> listarC(){
        List<Bodega> con = service.listar();
        return new ResponseEntity<>(con, HttpStatus.OK);
    }
}
