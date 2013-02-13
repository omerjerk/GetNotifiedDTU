package com.umair.shubham;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.provider.CalendarContract.Events;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public class SplashScreen extends Activity {

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
    	getActionBar().hide();
	    
	    new CountDownTimer(3000, 1000)
		{
		    @Override
			public void onTick(long millisUntilFinished) {
 
			    setContentView(R.layout.activity_splash_screen);
			}
			@Override
			public void onFinish() {
				getActionBar().show();
				setContentView(R.layout.main);
				
			}

		}.start();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.activity_splash_screen, menu);
	    return true;
	}
	
	public void eventsActivity(View v){
		startActivity(new Intent(SplashScreen.this, EventsActivity.class));
	}

}
