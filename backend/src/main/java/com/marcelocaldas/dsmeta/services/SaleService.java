package com.marcelocaldas.dsmeta.services;

import com.marcelocaldas.dsmeta.entities.Sale;
import com.marcelocaldas.dsmeta.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SaleService {
    @Autowired
    private SaleRepository repository;


    public List<Sale> findSales(){
        return repository.findAll();
    }
}