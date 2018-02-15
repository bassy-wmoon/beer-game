package com.example.demo.repository;

import com.example.demo.model.Beer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BeerRepository {

    List<Beer> selectAll();
    
    List<Beer> selectByBrewery(int breweryId);
}
