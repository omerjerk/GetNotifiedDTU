package com.umair.shubham;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;

public class SplashScreeen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
		 new CountDownTimer(4000, 1000) {

		     public void onTick(long millisUntilFinished) {
		    	 setContentView(R.layout.activity_splash_screeen);
		     }

		     public void onFinish() {
		    	 finish();
		         startActivity(new Intent(SplashScreeen.this, LlActivity.class));
		     }
		  }.start();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_splash_screeen, menu);
		return true;
	}

}
