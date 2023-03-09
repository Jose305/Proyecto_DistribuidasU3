package com.example.proyecto_unidad3.repositorio;

import com.example.proyecto_unidad3.entidades.Tienda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TiendaRepository extends JpaRepository<Tienda, Long> {
}
