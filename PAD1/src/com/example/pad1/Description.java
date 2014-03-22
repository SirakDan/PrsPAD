package com.example.pad1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Description extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_description);
		Restaurant r = (Restaurant)getIntent().getParcelableExtra("restaurante");
		TextView tv = (TextView) findViewById(R.id.descriptionTextArea);
		String texto = "";
		texto+="Nombre: " + r.getName() + "\n";
		texto+="País: " + r.getCountry() + "\n";
		texto+="Ciudad: " + r.getCity() + "\n";
		texto+=r.getLocationType() + ": " + r.getLocation() + " " + r.getLocationNumber() + "\n";
		texto+="Tipo: " + r.getFoodType() + "\n";
		texto+="Nacionalidad: " + r.getFoodNationality() + "\n";
		texto+="Precio: " + r.getMeanPrice() + "\n";
		tv.setText(texto);
		
		Button b = (Button) findViewById(R.id.backButtonDesc);
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
				overridePendingTransition(R.anim.right_in, R.anim.right_out);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.description, menu);
		return true;
	}

}
