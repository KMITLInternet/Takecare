package com.example.takecare;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class Disease_Detail extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_disease__detail);
		
		Resources res = getResources();
		String[] disease_array = res.getStringArray(R.array.disease_array);
		String[] cause_array = res.getStringArray(R.array.cause_array);
		String[] symptom_array = res.getStringArray(R.array.symptom_array);
        
		Intent intent = getIntent();
        // getting attached intent data
        String position = intent.getStringExtra("position");
        int pos = Integer.parseInt(position);
        // displaying selected product name
        
        TextView txtDisease_name = (TextView) findViewById(R.id.disease_name);
        txtDisease_name.setText(disease_array[pos]);
        
        TextView txtCause = (TextView) findViewById(R.id.Cause);
        txtCause.setText(cause_array[pos]);
        
        TextView txtSymptom = (TextView) findViewById(R.id.Symptom);
        txtSymptom.setText(symptom_array[pos]);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.disease__detail, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
