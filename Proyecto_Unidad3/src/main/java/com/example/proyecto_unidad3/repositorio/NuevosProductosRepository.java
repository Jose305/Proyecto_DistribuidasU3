package com.example.proyecto_unidad3.repositorio;

import com.example.proyecto_unidad3.entidades.NuevosProductos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NuevosProductosRepository extends JpaRepository<NuevosProductos, Long> {

}
