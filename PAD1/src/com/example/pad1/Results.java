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
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Results extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_results);
		Bundle bundle = (Bundle)getIntent().getBundleExtra("restaurants");
		
		// Cogemos los restaurantes que cumplen con las restricciones.
		final ArrayList<Restaurant> r = bundle.getParcelableArrayList("restaurants");
		
		//Creamos un array de Cadenas y metemos los nombres.
		String[] restaurantsNames;
		if(r.size() > 0){
			restaurantsNames = new String[r.size()];
			for(int i = 0; i < r.size();i++){
				restaurantsNames[i] = r.get(i).getName();
			}
		}else{
			restaurantsNames = new String[1];
			restaurantsNames[0] = "No se han encontrado coincidencias con la base de datos.";
		}
		
		// Metemos en un listView los que hemos encontrado.
		ListView listView = (ListView) findViewById(R.id.restauranteslistView);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, restaurantsNames);
		listView.setAdapter(adapter);
		
		Button back = (Button) findViewById(R.id.backButton);
		back.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
				finish();
				overridePendingTransition(R.anim.right_in, R.anim.right_out);
			}
		});
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				Log.d("Click en ", r.get(arg2).getName());
				Intent i = new Intent(Results.this, Description.class);
				i.putExtra("restaurante", (Parcelable)r.get(arg2));
				startActivity(i);
				overridePendingTransition(R.anim.left_in, R.anim.left_out);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.results, menu);
		return true;
	}

}
