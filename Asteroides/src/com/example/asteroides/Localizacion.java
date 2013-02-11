package com.example.asteroides;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.view.Menu;
import android.widget.TextView;

public class Localizacion extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		TextView titulo = (TextView) this.findViewById(R.id.titulo_main); 
		Typeface fuente = Typeface.createFromAsset(this.getAssets(), "gloria-hallelujah.font");
		titulo.setTypeface(fuente);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
