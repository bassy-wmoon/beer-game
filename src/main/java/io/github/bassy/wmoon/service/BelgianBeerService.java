package io.github.bassy.wmoon.service;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import io.github.bassy.wmoon.model.Beer;
import io.github.bassy.wmoon.model.BeerPhoto;
import io.github.bassy.wmoon.model.BelgianBeer;
import io.github.bassy.wmoon.model.Brewery;
import io.github.bassy.wmoon.repository.BeerPhotoRepository;
import io.github.bassy.wmoon.repository.BeerRepository;
import io.github.bassy.wmoon.repository.BelgianBeerRepository;
import io.github.bassy.wmoon.repository.BreweryRepository;

@Service
public class BelgianBeerService {

	private BeerPhotoRepository beerPhotoRepository;
	private BreweryRepository breweryRepository;
	private BeerRepository beerRepository;
	private BelgianBeerRepository belgianBeerRepository;
	
	public BelgianBeerService(BeerPhotoRepository beerPhotoRepository,
							  BreweryRepository breweryRepository,
							  BeerRepository beerRepository,
							  BelgianBeerRepository belgianBeerRepository) {
		this.beerPhotoRepository = beerPhotoRepository;
		this.breweryRepository = breweryRepository;
		this.beerRepository = beerRepository;
		this.belgianBeerRepository = belgianBeerRepository;
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
	
	public BelgianBeer selectBeerByCondition(int breweryId, int beerId, int photoId) {
		return belgianBeerRepository.selectOne(breweryId, beerId, photoId);
	}
}
