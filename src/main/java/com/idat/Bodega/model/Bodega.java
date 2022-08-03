package com.idat.Bodega.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Bodega {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_bodega;
    private String descripcion;
}
