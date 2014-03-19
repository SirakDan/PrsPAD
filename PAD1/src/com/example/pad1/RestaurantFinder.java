package com.example.pad1;

import java.util.ArrayList;

public class RestaurantFinder {
	
	private ArrayList<Restaurant> restaurantList;
	
	/*
	 * 	private String name;
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
	 */

	public void iniciaRestaurantes(){
		restaurantList = new ArrayList();
		restaurantList.add(new Restaurant("Restaurante Quico",
				"España", "Madrid", "Calle", "Falsa", false,
				123, "Tradicional", "Española", (float) 10.0));
		restaurantList.add(new Restaurant("La Colmena",
				"España", "Pamplona", "Calle", "Tercio", true,
				13, "Creativa", "Japonesa", (float) 30.0));
	}
}
