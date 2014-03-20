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
		restaurantList = new ArrayList<Restaurant>();
		restaurantList.add(new Restaurant("Restaurante Quico",
				"Espa�a", "Madrid", "Calle", "Falsa", true,
				123, "Tradicional", "Espa�ola", (float) 10.0));
		restaurantList.add(new Restaurant("La Colmena",
				"Espa�a", "Pamplona", "Calle", "Tercio", true,
				13, "Creativa", "Japonesa", (float) 30.0));
	}
	// El primero es el que viene de la interfaz, es el que puede estar vac�o
	public boolean comparaTodosAtribs(Restaurant r1, Restaurant r2){
		boolean iguales = false;
		if(r1.getName().equalsIgnoreCase(r2.getName()) || r1.getName().equalsIgnoreCase(""))
			if(r1.getCountry().equalsIgnoreCase(r2.getCountry()) || r1.getCountry().equalsIgnoreCase(""))
				if(r1.getCity().equalsIgnoreCase(r2.getCity()) || r1.getCity().equalsIgnoreCase(""))
					if(r1.getLocationType().equalsIgnoreCase(r2.getLocationType()) || r1.getLocationType().equalsIgnoreCase(""))
						if(r1.getLocation().equalsIgnoreCase(r2.getLocation()) || r1.getLocation().equalsIgnoreCase(""))
							if((r1.getLocationNumber()<=r2.getLocationNumber()+10 && r1.getLocationNumber()>=r2.getLocationNumber()-10)|| (r1.hasNumber()==r2.hasNumber()&& !r1.hasNumber()) || r1.getLocationNumber()==-1)
								if(r1.getFoodType().equalsIgnoreCase(r2.getFoodType()) || r1.getFoodType().equalsIgnoreCase(""))
									if(r1.getFoodNationality().equalsIgnoreCase(r2.getFoodNationality()) || r1.getFoodNationality().equalsIgnoreCase(""))
										if((r1.getMeanPrice()<r2.getMeanPrice()+20&&r1.getMeanPrice()>r2.getMeanPrice()-20) || r1.getMeanPrice()==-1)
											iguales = true;
	
		return iguales;
	}
	
	public ArrayList<Restaurant> buscaRestaurante(Restaurant r){
		ArrayList<Restaurant> retorno = new ArrayList<Restaurant>();
		for(int i = 0; i < restaurantList.size(); i++){
			if(comparaTodosAtribs(r, restaurantList.get(i)))
				retorno.add(restaurantList.get(i));
		}
		return retorno;
	}
}
