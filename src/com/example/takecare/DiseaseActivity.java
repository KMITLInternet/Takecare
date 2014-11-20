package com.example.takecare;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.app.ListActivity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;

public class DiseaseActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Resources res = getResources();
		String[] disease_array = res.getStringArray(R.array.disease_array);
		this.setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_disease, R.id.label, disease_array));
		ListView lv = getListView();
		lv.setOnItemClickListener(new OnItemClickListener() {
	          public void onItemClick(AdapterView<?> parent, View view,
	              int position, long id) {
	               
	              // selected item 
	              String disease = ((TextView) view).getText().toString();
	               
	              // Launching new Activity on selecting single List Item
	              Intent i = new Intent(getApplicationContext(), Disease_Detail.class);
	              // sending data to new activity
	              i.putExtra("disease", disease);
	              startActivity(i);
	             
	          }
	        });
	}
	


}
