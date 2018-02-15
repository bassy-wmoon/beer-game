package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Beer;
import com.example.demo.model.BeerPhoto;
import com.example.demo.model.Brewery;
import com.example.demo.service.BelgianBeerService;

@Controller
public class BelgianBeerController {

	private BelgianBeerService belgianBeerService;

	@Autowired
	public BelgianBeerController(BelgianBeerService belgianBeerService) {
		this.belgianBeerService = belgianBeerService;
	}
	
	@GetMapping(path="/index")
	public String index(Model model) {
		
		BeerPhoto beerPhoto = belgianBeerService.selectOne();
		
		model.addAttribute("beerPhotoId", beerPhoto.getId());
		model.addAttribute("url", beerPhoto.getUrl());
		model.addAttribute("width", beerPhoto.getWidth());
		model.addAttribute("height", beerPhoto.getHeight());
		model.addAttribute("breweries", createBreweryList());
		model.addAttribute("beers", createBeerList());
		return "beer-game";
	}
	
	private List<Brewery> createBreweryList() {
		List<Brewery> list = new ArrayList<>();
		Brewery brewery = new Brewery();
		brewery.setId(1);
		brewery.setName("ヴァンスティーンベルグ醸造所");
		list.add(brewery);
		return list;	
	}
	
	private List<Beer> createBeerList() {
		List<Beer> list = new ArrayList<>();
		Beer beer = new Beer();
		beer.setId(1);
		beer.setName("セリスホワイト");
		list.add(beer);
		return list;		
	}
}
