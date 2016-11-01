package com.example.secondactivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void start2nd(View view) {
    	Intent intent = new Intent(this, SecondActivity.class);
    	
    	/* Reutiliza la instancia existente de la actividad, en lugar de crear una nueva */
//    	intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);    	
    	
    	/* Envía un mensaje, mediante el intent, a la actividad que se llama */
//    	EditText editText = (EditText) findViewById(R.id.editText1);
//    	String message = editText.getText().toString();
//    	intent.putExtra("KEY_EXTRA_MESSAGE", message);
    	
    	startActivity(intent);
	}
	
}
