package com.api.crud.services;

import com.api.crud.entity.LiquidacionEntity;
import com.api.crud.entity.PolizaEntity;
import com.api.crud.models.AseguradosModels;
import com.api.crud.repositories.IAseguradoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AseguradoService {
    @Autowired
    IAseguradoRepository aseguradoRepository;

    public ArrayList<AseguradosModels> getAsegurado()
    {
        return (ArrayList<AseguradosModels>) aseguradoRepository.findAll() ;
    }

}
