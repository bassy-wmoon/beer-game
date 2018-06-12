package io.github.bassy.wmoon.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import io.github.bassy.wmoon.model.Brewery;

import java.util.List;

@Mapper
@Repository
public interface BreweryRepository {

    List<Brewery> selectAll();
}
