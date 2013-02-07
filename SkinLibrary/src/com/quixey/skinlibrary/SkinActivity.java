package com.quixey.skinlibrary;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

public class SkinActivity extends Activity {
	
protected static int sTheme = 0;
	
	public static final  int THEME_DEFAULT = 0;
	public static final int THEME_BLUE = 1;
	public static final int THEME_GREEN = 2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	        /*if(sTheme == THEME_BLUE){
	        	setTheme(R.style.Theme_Blue);
	        }else if(sTheme == THEME_GREEN){
	        	setTheme(R.style.Theme_Green);
	        }else{
	        	setTheme(R.style.Theme_Blue);
	        }*/
		setTheme(R.style.Theme_Blue);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_skin, menu);
		return true;
	}

	/**
	 * Set the theme of the Activity, and restart it by creating a new Activity
	 * of the same type.
	 */
	public static void changeToTheme(Activity activity, int theme)
	{
		sTheme = theme;
		activity.finish();

		activity.startActivity(new Intent(activity, activity.getClass()));
	}

	/** Set the theme of the activity, according to the configuration. */
	public static void onActivityCreateSetTheme(Activity activity)
	{
		switch (sTheme)
		{
		default:
		case THEME_DEFAULT:
			break;
		case THEME_BLUE:
			activity.setTheme(R.style.Theme_Blue);
			break;
		case THEME_GREEN:
			activity.setTheme(R.style.Theme_Green);
			break;
		}
	}
}
