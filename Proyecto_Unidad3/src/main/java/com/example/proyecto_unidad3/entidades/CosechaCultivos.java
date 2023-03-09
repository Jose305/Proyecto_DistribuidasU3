package com.example.proyecto_unidad3.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "cosecha_cultivos")
public class CosechaCultivos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_cosecha")
    private LocalDate fechaCosecha;

    @Column(name = "tipo_cultivo")
    private String tipoCultivo;

    @Column(name = "cantidad_cosechada")
    private int cantidadCosechada;

}
