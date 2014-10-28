package com.example.appum;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class WelcomeActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView( R.layout.activity_welcome );
		
		if (savedInstanceState == null) {
	        getSupportFragmentManager().beginTransaction()
	                .add( R.id.container , new PlaceholderFragment() )
	                .commit();
	    }
		
	   
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.welcome, menu);
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

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
//			View rootView = inflater.inflate(R.layout.fragment_welcome,
//					container, false);
			
			RelativeLayout fl = (RelativeLayout ) inflater.inflate(R.layout.fragment_welcome,
						container, false);
			 
			Intent intent = getActivity().getIntent();
			String mensaje = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
			
			
			TextView textView2 = (TextView) fl.findViewById( R.id.textView2 );
			textView2.setTextSize(40);
			textView2.setText("HOLA");
			
			// Create the text view
		   TextView textView = (TextView) fl.findViewById( R.id.mensajeBienvenida );
		   textView.setTextSize(30);
		   textView.setText(mensaje);
			
			return fl;
		}
	}

}
