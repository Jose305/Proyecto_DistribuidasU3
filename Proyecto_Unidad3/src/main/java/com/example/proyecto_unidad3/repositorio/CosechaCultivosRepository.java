package com.example.proyecto_unidad3.repositorio;

import com.example.proyecto_unidad3.entidades.CosechaCultivos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CosechaCultivosRepository extends JpaRepository<CosechaCultivos, Long> {
}
