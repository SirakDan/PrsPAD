package com.example.pad1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class MainActivity extends Activity /*implements OnSeekBarChangeListener */{

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
        
        
        //-----------PRICE SEEK BAR----------------------------------------------------------------------------
        
        SeekBar priceBar = (SeekBar) findViewById(R.id.priceBar);        
       
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
				
			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
        	
        });
        
        //----------------------------------------------------------------------------------------------------
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}




