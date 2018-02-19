package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.BelgianBeer;

@Mapper
@Repository
public interface BelgianBeerRepository {

    BelgianBeer selectOne(@Param("breweryId")int breweryId, @Param("beerId")int beerId, @Param("photoId")int photoId);
}
