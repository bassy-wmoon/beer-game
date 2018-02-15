package com.example.demo.service;

import com.example.demo.model.Beer;
import com.example.demo.model.Brewery;
import com.example.demo.repository.BeerRepository;
import com.example.demo.repository.BreweryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BeerPhoto;
import com.example.demo.repository.BeerPhotoRepository;

import java.util.List;

@Service
public class BelgianBeerService {

	private BeerPhotoRepository beerPhotoRepository;
	private BreweryRepository breweryRepository;
	private BeerRepository beerRepository;
	
	public BelgianBeerService(BeerPhotoRepository beerPhotoRepository,
							  BreweryRepository breweryRepository,
							  BeerRepository beerRepository) {
		this.beerPhotoRepository = beerPhotoRepository;
		this.breweryRepository = breweryRepository;
		this.beerRepository = beerRepository;
	}
	
	public BeerPhoto selectOne() {
		return beerPhotoRepository.selectOne();
	}

	public List<Brewery> selectAllBreweries() {
		return breweryRepository.selectAll();
	}

	public List<Beer> selectAllBeers() {
		return beerRepository.selectAll();
	}
}
