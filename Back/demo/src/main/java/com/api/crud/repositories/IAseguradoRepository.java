package com.api.crud.repositories;

import com.api.crud.models.AseguradosModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IAseguradoRepository extends JpaRepository<AseguradosModels, Long> {
    AseguradosModels findByTipoIdentificacionAndNroIdentificacion(Long tp, Long num);
}
