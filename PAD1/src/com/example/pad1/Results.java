package com.example.pad1;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Results extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_results);
		Bundle bundle = (Bundle)getIntent().getBundleExtra("restaurants");
		ArrayList<Restaurant> r = bundle.getParcelableArrayList("restaurants");
		TextView tv = (TextView) findViewById(R.id.resultadoArea);
		for (int i = 0; i < r.size(); i++){
			tv.setText(tv.getText()+r.get(i).getName());
		}
		Button back = (Button) findViewById(R.id.backButton);
		back.setOnClickListener(new OnClickListener() {
		
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
		getMenuInflater().inflate(R.menu.results, menu);
		return true;
	}

}
