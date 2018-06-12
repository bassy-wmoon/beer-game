package io.github.bassy.wmoon.controller.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.bassy.wmoon.model.Beer;
import io.github.bassy.wmoon.model.BeerPhoto;
import io.github.bassy.wmoon.model.BelgianBeer;
import io.github.bassy.wmoon.service.BelgianBeerService;

@RestController
@RequestMapping(path="/api")
public class BelgianBeerRestController {

	private BelgianBeerService belgianBeerService;

	public BelgianBeerRestController(BelgianBeerService belgianBeerService) {
		this.belgianBeerService = belgianBeerService;
	}
	
	@GetMapping(path="/brewery/{breweryId}")
	public List<Beer> findBeersbyBrewery(@PathVariable int breweryId) {
		return belgianBeerService.selectBeersByBrewery(breweryId);
	}
	
	@GetMapping(path="/beerPhoto/shuffle")
	public List<BeerPhoto> getShuffledPhoto() {
		return belgianBeerService.selectShuffledBeerPhotos();
	}
	
	@GetMapping(path="/belgianBeer/brewery/{breweryId}/beer/{beerId}/photo/{photoId}")
	public BelgianBeer answer(@PathVariable int breweryId, @PathVariable int beerId, @PathVariable int photoId) {
		return belgianBeerService.selectBeerByCondition(breweryId, beerId, photoId);
	}
}
