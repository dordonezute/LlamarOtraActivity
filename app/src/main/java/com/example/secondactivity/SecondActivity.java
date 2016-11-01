package com.example.secondactivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		/* Recupera el mensaje enviado por la actividad que llamó a ésta */
		/* Solo se ejecuta al crearse la actividad */
//	    Intent intent = getIntent();
//	    String message = intent.getStringExtra("KEY_EXTRA_MESSAGE");
//	    Toast.makeText(this, message, Toast.LENGTH_SHORT).show();			

	}

	public void start1st(View view) {
    	Intent intent = new Intent(this, MainActivity.class);
    	
    	/* Reutiliza la instancia existente de la actividad, en lugar de crear una nueva */
//    	intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
    	
    	startActivity(intent);		
	}
	
	/* Recupera el mensaje cada vez que se (re)activa la actividad */
//	@Override
//	protected void onResume() {
//		super.onResume();
//	    Intent intent = getIntent();
//	    String message = intent.getStringExtra("KEY_EXTRA_MESSAGE");
//	    Toast.makeText(this, message, Toast.LENGTH_SHORT).show();		
//	}	

}
