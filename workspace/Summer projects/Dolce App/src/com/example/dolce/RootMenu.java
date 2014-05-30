package com.example.dolce;

import com.example.workoutlog.R;

import android.app.Activity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class RootMenu extends Activity
{
	private Button loggerButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
	
	    setContentView(R.layout.activity_root);
	    
	    loggerButton= (Button)findViewById(R.id.loggerButton);
	    
	    
	    loggerButton.setOnClickListener(new View.OnClickListener() 
	    {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				startActivity(new Intent(RootMenu.this, Workout.class));//would be done differently, but this is an anonymous call
				
			}
		});
	
}
	
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.workout, menu);
		return true;
	}
	
}
