package com.api.crud.repositories;

import com.api.crud.models.AseguradosModels;
import com.api.crud.models.PrimasModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPrimaRepository extends JpaRepository<AseguradosModels, Long> {
    List<PrimasModels> findByEdad(int edad);
}
