package com.example.dolce;

import java.io.IOException;
import java.io.Serializable;
import org.json.JSONObject;
import java.util.ArrayList; 

import com.example.workoutlog.R;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Workout extends Activity 
{
	
	DolceBase db;
	Button saveButton;
	
	private Spinner upperPull_spinner, upperPush_spinner, lowerPush_spinner, lowerPull_spinner;
	
	public String upperPushSelected, upperPullSelected, lowerPushSelected, lowerPullSelected;
	
	
	private ArrayAdapter<CharSequence> upperPull_adapter, upperPush_adapter, lowerPush_adapter, lowerPull_adapter;
	
	private ArrayList<String> selections;//to be checked before writing data. 
	
	//ArrayList<String> entries= new ArrayList<String>(R.array.upperPulls);
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_workout);
		
		saveButton= (Button)findViewById(R.id.saveBtn);
		
		selections= new ArrayList<String>();
	
		
		loadUpperPushes();
		loadUpperPulls();
		
		loadLowerPushes();
		
		loadLowerPulls();
		
		setListeners();
		
		
		
	}
	
	private void loadUpperPushes()
	{
		upperPush_spinner= (Spinner)findViewById(R.id.upperPushSpinner);
		
		upperPush_adapter= ArrayAdapter.createFromResource(this, R.array.upperPush, android.R.layout.simple_spinner_item);
		
		upperPush_adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
		
		upperPush_spinner.setAdapter(upperPush_adapter);
		
	}
	
	private void loadUpperPulls()
	{
		
		upperPull_spinner= (Spinner)findViewById(R.id.upperPullSpinner);
		
		upperPull_adapter= ArrayAdapter.createFromResource(this, R.array.upperPulls, android.R.layout.simple_spinner_item);
		
		upperPull_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		upperPull_spinner.setAdapter(upperPull_adapter);
		
	}
	
	
	private void loadLowerPushes()
	{
		lowerPush_spinner= (Spinner)findViewById(R.id.lowerPushSpinner);
		
		lowerPush_adapter= ArrayAdapter.createFromResource(this, R.array.lowerPush, android.R.layout.simple_spinner_item);
		
		lowerPush_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		lowerPush_spinner.setAdapter(lowerPush_adapter);
		
	}
	
	private void loadLowerPulls()
	{
		lowerPull_spinner= (Spinner)findViewById(R.id.lowerPullSpinner);
		
		lowerPull_adapter= ArrayAdapter.createFromResource(this, R.array.lowerPulls, android.R.layout.simple_spinner_item);
		
		lowerPull_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		lowerPull_spinner.setAdapter(lowerPull_adapter);
		
		
		
	}
	
	
	
	private void setListeners()
	{
		
		
		upperPush_spinner.setOnItemSelectedListener(new OnItemSelectedListener() 
		{

		      

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				
				
				
					if(upperPush_spinner.getSelectedItemPosition()!=0)//make sure they don't select the first one
					{
						upperPushSelected= upperPush_spinner.getSelectedItem().toString();
						selections.add(upperPushSelected);
					}
					else
					{
					
						upperPushSelected= null;
						
					}
				
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				
				
			}
	    });
		
		upperPull_spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

		      

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) 
			{
				
				
				if(!(upperPull_spinner.getSelectedItemPosition()!=0))
				{
					upperPullSelected= upperPull_spinner.getSelectedItem().toString();
					selections.add(upperPullSelected);
				}
				else
				{
				
					upperPullSelected= null;
				}
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				
				
			}
	    });
		
		lowerPush_spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

		      

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				
				if(!(lowerPush_spinner.getSelectedItemPosition()!=0))
				{
					lowerPushSelected= lowerPush_spinner.getSelectedItem().toString();
					selections.add(lowerPushSelected);
				}
				else
				{
				
					lowerPushSelected= null;
				}
				
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				
				
			}
	    });
		
		lowerPull_spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

		      

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				
				if(!(lowerPull_spinner.getSelectedItemPosition()!=0))
				{
					lowerPullSelected= lowerPull_spinner.getSelectedItem().toString();
					selections.add(lowerPullSelected);
				}
				else
				{
				
					lowerPullSelected= null;
				}
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				
				
			}
	    });
		
		saveButton.setOnClickListener(new View.OnClickListener()  {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				for(String s: selections)
				{
					try 
					{
						db.storeExercise(s);
					} 
					catch (IOException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		
		
		
	}
	
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.workout, menu);
		return true;
	}

}
