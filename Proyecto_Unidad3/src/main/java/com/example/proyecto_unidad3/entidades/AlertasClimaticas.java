package com.example.proyecto_unidad3.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "alertas_climaticas")
public class AlertasClimaticas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_alerta")
    private LocalDate fechaAlerta;

    @Column(name = "tipo_alerta")
    private String tipoAlerta;

    @Column(name = "descripcion")
    private String descripcion;

}
