package com.example.demo.repository;

import com.example.demo.model.Brewery;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BreweryRepository {

    List<Brewery> selectAll();
}
