package com.example.pad1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	Log.d("Spinner", "Spinner pulsado");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button search = (Button) findViewById(R.id.searchButton);
        search.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent changeWindow = new Intent(MainActivity.this, Results.class);
				startActivity(changeWindow);
				overridePendingTransition(R.anim.left_in, R.anim.left_out);
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    
    
    
    
    /*
    Spinner countries = (Spinner) findViewById(R.id.spinnerCountries);
    Spinner cities = (Spinner) findViewById(R.id.spinnerCities);
    
    
    countries.
    
	 // Create an ArrayAdapter using the string array and a default spinner layout
	 ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
	         R.array.planets_array, android.R.layout.simple_spinner_item);
 // Specify the layout to use when the list of choices appears
 adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
 // Apply the adapter to the spinner
 spinner.setAdapter(adapter);*/
    
    
}




