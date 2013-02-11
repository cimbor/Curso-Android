package org.example.masvistas;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MasVistasActivity extends Activity {
	private EditText entrada;
	private TextView salida; 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		entrada = (EditText) this.findViewById(R.id.entrada);
		salida = (TextView) this.findViewById(R.id.salida);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void sePulsa(View view) {
		Context contexto = getApplicationContext();

		Toast textoFlotante = Toast.makeText(contexto, "Pulsado",
				Toast.LENGTH_SHORT);
		textoFlotante.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
		salida.setText(String.valueOf(Float.parseFloat(entrada.getText().toString())*2.0));
		textoFlotante.show();
	}

	public void sePulsa0(View view) {

		this.entrada.setText(entrada.getText() + (String)view.getTag());
	}
}
