package com.example.skincustom;

import android.os.Bundle;

import com.quixey.skinlibrary.SkinActivity;

public class ListActivity extends SkinActivity {
	
	private static final String TAG = ListActivity.class.getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_list_view);
		
		
		
	}
	/*
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_skin_change, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	if(item.getItemId() == R.id.menu_blue){
    		Log.d(TAG,"setting red theme");
    		changeToTheme(this, THEME_BLUE);
    	}else if(item.getItemId() == R.id.menu_green){
    		Log.d(TAG,"setting red big theme");
    		changeToTheme(this, THEME_GREEN);
    	}
    	return true;
    }*/

}
