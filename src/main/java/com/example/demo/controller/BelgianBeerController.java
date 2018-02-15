package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Beer;
import com.example.demo.model.Brewery;

@Controller
public class BeerGameController {

	@GetMapping(path="/index")
	public String index(Model model) {
		model.addAttribute("url", "http://www.deliriumcafe.jp/img/item/contents/1336445566228254.jpg");
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
