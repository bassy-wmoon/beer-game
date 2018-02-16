package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
		
		List<Brewery> breweries = belgianBeerService.selectAllBreweries();		
		model.addAttribute("breweries", breweries);
		return "beer-game";
	}
}
