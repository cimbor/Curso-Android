package com.example.holamundo;

import android.app.Activity;
import android.os.Bundle;
import android.provider.ContactsContract.Contacts;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.d("HolaMundo","Entramos en onCreate");
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_main);
		TextView texto = new TextView(this);
        texto.setText("Hola mundo");
        texto.setTextSize(16);
		this.setContentView(texto);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
