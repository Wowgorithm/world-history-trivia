package com.example.dolce;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import com.example.workoutlog.R;

//import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.content.Context;
//import javax.speech.recognition;
//import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
//import android.widget.TextView;
import java.io.*;

public class WorkoutLog extends Activity
{
	//attributes
	
	EditText exerciseField, repsBox;
	
	
	private Button newExercise, logIt;
	
	//DolceBase db;
	
	ArrayList<String> entries;
		
	ArrayList<EditText> boxes;
	
	private LinearLayout innerLinearLayout;//the layout containing the fields.
	
	private LinearLayout outerLinearLayout;//the layout containing the buttons
	
	
	
	////////////////////////////////////
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.workout_log);
		
		try 
		{
			initializeComponents();
		} 
		
		catch(FileNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		
		setListeners();
		
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.workout, menu);
		return true;
	}
	
	private void createField()//creates a new editText element. called in an button listener
	{
		
		
		EditText newExercise= new EditText(this);
		EditText newRepBox= new EditText(this);
		
		
			//the following two lines make the layout parameters for the new boxes adhere to those of the existing boxes
			LinearLayout.LayoutParams forNewExercise= (LinearLayout.LayoutParams)exerciseField.getLayoutParams();//makes the new text box(es) adhere to the same parameters as the existing 
			LinearLayout.LayoutParams forNewReps= (LinearLayout.LayoutParams)repsBox.getLayoutParams();
				
			newExercise.setHint(R.string.exercisehint);
			newRepBox.setHint(R.string.reps);
			
			
				newExercise.setLayoutParams(forNewExercise);
				newRepBox.setLayoutParams(forNewReps);
				
			
			
				innerLinearLayout.addView(newExercise);
				boxes.add(newExercise);
				Log.d(" ", " "	+boxes.size());
				innerLinearLayout.addView(newRepBox);
				
		
		
	}
	
	private void initializeComponents() throws FileNotFoundException
	{
		
		
		entries= new ArrayList<String>();
		
		boxes= new ArrayList<EditText>();
		
		exerciseField=(EditText)findViewById(R.id.exercise0);
		
		boxes.add(exerciseField);
		
		innerLinearLayout= (LinearLayout)findViewById(R.id.linearLayoutInner);//fields
		
		outerLinearLayout= (LinearLayout)findViewById(R.id.linearLayoutOuter);//buttons
		
		newExercise=(Button)findViewById(R.id.addExercise);
		
		repsBox= (EditText)findViewById(R.id.numReps0);
		
		logIt= (Button)findViewById(R.id.saveButton);
		
		
		
	}
	
	private void setListeners()
	{
		
		newExercise.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {

				createField();
			}
		});
		
		logIt.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				getEntries();
				
				try 
				{
					saveEntries();
				} 
				
				catch (IOException e)
				
				{
					e.printStackTrace();
					
				}
			}
		});
		
		
	}
	private void getEntries()
	{
		
		for(EditText e: boxes)
		{
			
			entries.add(e.getText().toString());
			
		}
		
		//Log.d(" ", entries.get(i));//debugging edittext contents retrieval
		//i++;
	}
	
	private void saveEntries() throws IOException
	{
		for(String exercise: entries)
		{	
		
		}
		
	}
	
	
	
}
