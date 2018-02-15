package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BeerPhoto;
import com.example.demo.repository.BeerPhotoRepository;

@Service
public class BelgianBeerService {

	private BeerPhotoRepository beerPhotoRepository;
	
	@Autowired
	public BelgianBeerService(BeerPhotoRepository beerPhotoRepository) {
		this.beerPhotoRepository = beerPhotoRepository;
	}
	
	public BeerPhoto selectOne() {
		return beerPhotoRepository.selectOne();
	}
}
