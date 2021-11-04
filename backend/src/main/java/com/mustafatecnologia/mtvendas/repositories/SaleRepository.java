package com.mustafatecnologia.mtvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mustafatecnologia.mtvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
