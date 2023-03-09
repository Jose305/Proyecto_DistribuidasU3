package com.example.proyecto_unidad3.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "siembra_cultivos")
public class SiembraCultivos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_siembra")
    private LocalDate fechaSiembra;

    @Column(name = "tipo_cultivo")
    private String tipoCultivo;

    @Column(name = "cantidad_siembra")
    private int cantidadSiembra;


}
