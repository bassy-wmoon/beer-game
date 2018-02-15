package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.BeerPhoto;
import com.example.demo.model.Brewery;
import com.example.demo.service.BelgianBeerService;

@Controller
public class BelgianBeerController {

	private BelgianBeerService belgianBeerService;

	public BelgianBeerController(BelgianBeerService belgianBeerService) {
		this.belgianBeerService = belgianBeerService;
	}
	
	@GetMapping(path="/index")
	public String index(Model model) {
		
		BeerPhoto beerPhoto = belgianBeerService.selectOne();
		List<Brewery> breweries = belgianBeerService.selectAllBreweries();
		
		model.addAttribute("beerPhotoId", beerPhoto.getId());
		model.addAttribute("url", beerPhoto.getUrl());
		model.addAttribute("width", beerPhoto.getWidth());
		model.addAttribute("height", beerPhoto.getHeight());
		model.addAttribute("breweries", breweries);
		return "beer-game";
	}
}
