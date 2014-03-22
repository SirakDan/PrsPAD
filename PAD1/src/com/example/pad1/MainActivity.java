package com.example.pad1;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class MainActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	    	Log.d("Spinner", "Spinner pulsado");
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	        Button search = (Button) findViewById(R.id.searchButton);
	        SeekBar priceBar = (SeekBar) findViewById(R.id.priceBar);
	        
	        search.setOnClickListener(new OnClickListener() {
			
					@Override
					public void onClick(View v) {
							Intent changeWindow = new Intent(MainActivity.this, Results.class);
							
							overridePendingTransition(R.anim.left_in, R.anim.left_out);
							// Los filtros de la interfaz.
							EditText restaurantName = (EditText) findViewById(R.id.nameText);
							String restaurantNameValue = restaurantName.getText().toString();
							
							EditText country = (EditText) findViewById(R.id.countryText);
							String countryValue = country.getText().toString();
				
							EditText city = (EditText) findViewById(R.id.cityText);
							String cityValue = city.getText().toString();
							
							EditText street = (EditText) findViewById(R.id.streetText);
							String streetValue = street.getText().toString();
							
							Spinner streetType = (Spinner) findViewById(R.id.tipeOfRoadSinner);
							String streetTypeValue;
							if(streetType.getSelectedItemPosition() == 0){
								streetTypeValue = "";
							}else{
								streetTypeValue = streetType.getSelectedItem().toString();
							}
				
							EditText streetNumber = (EditText) findViewById(R.id.numberText);
							int streetNumberValue;
							if(!streetNumber.getText().toString().equals("")){
								streetNumberValue = Integer.parseInt(streetNumber.getText().toString());
							}else{
								streetNumberValue = -1;
							}
				
							CheckBox noNumber = (CheckBox) findViewById(R.id.noNumberCheckbox);
							Boolean noNumberValue = noNumber.isChecked();
							
							Spinner type = (Spinner) findViewById(R.id.typesSpinner); // Creativa | Tradicional.
							String typeValue;
							if(type.getSelectedItemPosition() == 0){
								typeValue = "";
							}else{
								typeValue = type.getSelectedItem().toString();
							}
				
							Spinner nationality = (Spinner) findViewById(R.id.nationalitiesSpinner);
							String nationalityValue;
							if(nationality.getSelectedItemPosition() == 0){
								nationalityValue = "";
							}else{
								nationalityValue = nationality.getSelectedItem().toString();
							}
							/*
							EditText price = (EditText) findViewById(R.id.priceText);
							float priceValue;
							if(!price.getText().toString().equals("")){
								priceValue = Float.parseFloat(price.getText().toString());
							}else{
								priceValue = -1;
							}*/
							//EditText price = (EditText) findViewById(R.id.priceText);
							float priceValue;
							if(priceBar.getProgress() != 0){
								priceValue = priceBar.getProgress();
							}else{
								priceValue = -1;
							}
				

							//Log.v("Hola !!!!!!!!!!!!", Integer.toString(streetType.getSelectedItemPosition()));
							Restaurant r = new Restaurant(restaurantNameValue
														, countryValue
														, cityValue
														, streetTypeValue
														, streetValue
														, noNumberValue
														, streetNumberValue
														, typeValue
														, nationalityValue
														, priceValue);
				
							RestaurantFinder restFindr = new RestaurantFinder();
							restFindr.iniciaRestaurantes();
							ArrayList<Restaurant> restaurants = restFindr.buscaRestaurante(r);
							Bundle b = new Bundle();
							b.putParcelableArrayList("restaurants", (ArrayList<? extends Parcelable>) restaurants);
							changeWindow.putExtra("restaurants", b);
							startActivity(changeWindow);
				
				
					}//end of onClick
					
	        });//end of search.setOnClickListener
        
        
	        //-----------PRICE SEEK BAR----------------------------------------------------------------------------    
	       
	        priceBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

		            TextView priceText = (TextView) findViewById(R.id.priceTextView2);
		            String auxPrice = getResources().getString(R.string.price);
		            String anyPrice = getResources().getString(R.string.priceText);

        	
					@Override
					public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
						
							if(progress == 0)
								priceText.setText(anyPrice);
							else
								priceText.setText("" + auxPrice + " " + progress + "€");
						
					}//end of onProgressChanged

					@Override
					public void onStartTrackingTouch(SeekBar seekBar) {
							// TODO Auto-generated method stub
						
					}//end of onStartTrackingTouch

					@Override
					public void onStopTrackingTouch(SeekBar seekBar) {
							// TODO Auto-generated method stub
						
					}//end of onStopTrackingTouch
        	
					
	        });//end of proceBar.setOnSeekBarChangeListener
        
	        //----------------------------------------------------------------------------------------------------
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}




