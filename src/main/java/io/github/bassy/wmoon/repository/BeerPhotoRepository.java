package io.github.bassy.wmoon.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import io.github.bassy.wmoon.model.BeerPhoto;

@Mapper
@Repository
public interface BeerPhotoRepository {

	List<BeerPhoto> selectAll();
}
