package com.example.demo.controller.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Beer;
import com.example.demo.service.BelgianBeerService;

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
}
