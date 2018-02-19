package com.example.demo.model;

public class Beer {

	private int id;
	private String name;
	private String description;
	private BeerStyle beerStyle;
	private BeerPhoto beerPhoto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BeerStyle getBeerStyle() {
		return beerStyle;
	}

	public void setBeerStyle(BeerStyle beerStyle) {
		this.beerStyle = beerStyle;
	}

	public BeerPhoto getBeerPhoto() {
		return beerPhoto;
	}

	public void setBeerPhoto(BeerPhoto beerPhoto) {
		this.beerPhoto = beerPhoto;
	}
}
