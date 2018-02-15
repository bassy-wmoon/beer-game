package com.example.demo.service;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Beer;
import com.example.demo.model.BeerPhoto;
import com.example.demo.model.Brewery;
import com.example.demo.repository.BeerPhotoRepository;
import com.example.demo.repository.BeerRepository;
import com.example.demo.repository.BreweryRepository;

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
	
	public List<BeerPhoto> selectShuffledBeerPhotos() {
		List<BeerPhoto> list = beerPhotoRepository.selectAll();
		Collections.shuffle(list);
		return list;
	}

	public List<Brewery> selectAllBreweries() {
		return breweryRepository.selectAll();
	}

	public List<Beer> selectAllBeers() {
		return beerRepository.selectAll();
	}
	
	public List<Beer> selectBeersByBrewery(int breweryId) {
		return beerRepository.selectByBrewery(breweryId);
	}
}
