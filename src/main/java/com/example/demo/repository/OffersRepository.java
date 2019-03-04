package com.example.demo.repository;
import java.util.List;

import com.example.demo.Offers;
import org.springframework.data.repository.CrudRepository;


public interface OffersRepository extends CrudRepository <Offers>{
    List<Offers> findAll();
}
