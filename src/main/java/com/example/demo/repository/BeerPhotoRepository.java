package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.model.BeerPhoto;

@Mapper
@Repository
public interface BeerPhotoRepository {

	BeerPhoto selectOne();
	
	List<BeerPhoto> selectAll();
}
