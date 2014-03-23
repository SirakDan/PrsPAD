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
		texto+=getResources().getString(R.string.resName) + ": " + r.getName() + "\n";
		texto+=getResources().getString(R.string.country)+ ": " + r.getCountry() + "\n";
		texto+=getResources().getString(R.string.city) + ": " + r.getCity() + "\n";
		texto+=r.getLocationType() + ": " + r.getLocation() + " " + r.getLocationNumber() + "\n";
		texto+=getResources().getString(R.string.type) + ": " + r.getFoodType() + "\n";
		texto+=getResources().getString(R.string.nationality) + ": " + r.getFoodNationality() + "\n";
		texto+=getResources().getString(R.string.price) + ": " + r.getMeanPrice() + "\n";
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
