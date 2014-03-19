package com.example.pad1;

public class Restaurant {
	private String name;
	private String country;
	private String city;
	private String locationType;
	private String location;
	//TODO: comprobar si es necesario.
	private boolean road;
	private String locationNumber;
	private String foodType;
	private String foodNationality;
	private float meanPrice;
	
	
	
	public Restaurant(String name, String country, String city,
			String locationType, String location, boolean road,
			String locationNumber, String foodType, String foodNationality,
			float meanPrice) {
		super();
		this.name = name;
		this.country = country;
		this.city = city;
		this.locationType = locationType;
		this.location = location;
		this.road = road;
		this.locationNumber = locationNumber;
		this.foodType = foodType;
		this.foodNationality = foodNationality;
		this.meanPrice = meanPrice;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLocationType() {
		return locationType;
	}
	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public boolean isRoad() {
		return road;
	}
	public void setRoad(boolean road) {
		this.road = road;
	}
	public String getLocationNumber() {
		return locationNumber;
	}
	public void setLocationNumber(String locationNumber) {
		this.locationNumber = locationNumber;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public String getFoodNationality() {
		return foodNationality;
	}
	public void setFoodNationality(String foodNationality) {
		this.foodNationality = foodNationality;
	}
	public float getMeanPrice() {
		return meanPrice;
	}
	public void setMeanPrice(float meanPrice) {
		this.meanPrice = meanPrice;
	}
	
	
}
