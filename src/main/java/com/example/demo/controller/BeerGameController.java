package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BeerGameController {

	@GetMapping(path="/index")
	public String index(Model model) {
		model.addAttribute("url", "http://www.deliriumcafe.jp/img/item/contents/1336445566228254.jpg");
		model.addAttribute("breweries", createBreweryList());
		model.addAttribute("beers", createBeerList());
		return "beer-game";
	}
	
	private List<String> createBreweryList() {
		List<String> list = new ArrayList<>();
		list.add("ヴァンスティーンベルグ醸造所");
		return list;		
	}
	
	private List<String> createBeerList() {
		List<String> list = new ArrayList<>();
		list.add("セリスホワイト");
		return list;		
	}
}
