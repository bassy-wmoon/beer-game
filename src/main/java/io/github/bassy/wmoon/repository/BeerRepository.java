package io.github.bassy.wmoon.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import io.github.bassy.wmoon.model.Beer;

import java.util.List;

@Mapper
@Repository
public interface BeerRepository {

    List<Beer> selectAll();
    
    List<Beer> selectByBrewery(int breweryId);
}
