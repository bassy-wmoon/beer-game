package io.github.bassy.wmoon.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import io.github.bassy.wmoon.model.BelgianBeer;

@Mapper
@Repository
public interface BelgianBeerRepository {

    BelgianBeer selectOne(@Param("breweryId")int breweryId, @Param("beerId")int beerId, @Param("photoId")int photoId);
}
