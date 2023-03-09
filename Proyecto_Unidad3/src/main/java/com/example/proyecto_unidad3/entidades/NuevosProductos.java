package com.example.proyecto_unidad3.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "nuevos_productos")
public class NuevosProductos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_producto")
    private String nombreProducto;

    @Column(name = "cantidad")
    private int cantidad;

}
