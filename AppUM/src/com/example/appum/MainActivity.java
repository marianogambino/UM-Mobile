package com.example.appum;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.asyncTask.unimoron.AsyncTaskLogin;

public class MainActivity extends ActionBarActivity {
	
	public static final String EXTRA_MESSAGE = "mensajeBienvenida";
	int notificationID = 1;
	 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
		
	}
	
	/*public void login(View v){
			
		if(editUser.getText().toString().equals("admin") && 
			     editPass.getText().toString().equals("admin"))
		 	{
					Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
				    startActivity(intent);
			}
		}*/
	
	 public void login(View view) {
	        // Do something in response to button
		EditText editUser = (EditText) findViewById( R.id.txtUser );
		EditText editPass = (EditText) findViewById( R.id.txtPass );
		String user = editUser.getText().toString();
	    String password = editPass.getText().toString();	
		String[] param = new String[2];	
	    param[0] = user;
	    param[1] = password; // en un futuro debe viajar al servicio encriptada (tip seguridad)
	    AsyncTaskLogin login = new AsyncTaskLogin( MainActivity.this );
	    login.execute(param);
	   
	 }
				
		
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}
	
	public void onClickNotification(View v){
        displayNotification();
    }
     
    protected void displayNotification(){
        Intent i = new Intent(this, NotificationActivity.class);
        i.putExtra("notificationID", notificationID);
         
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, i, 0);
        NotificationManager nm = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
         
        CharSequence ticker ="Aviso";
        CharSequence contentTitle = "Aviso Materias";
        CharSequence contentText = "Te toca cursar Calculo I";
        Notification noti = new NotificationCompat.Builder(this)
                                .setContentIntent(pendingIntent)
                                .setTicker(ticker)
                                .setContentTitle(contentTitle)
                                .setContentText(contentText)
                                .setSmallIcon(R.drawable.ic_launcher)
                                .addAction(R.drawable.ic_launcher, ticker, pendingIntent)
                                .setVibrate(new long[] {100, 250, 100, 500})
                                .build();
        nm.notify(notificationID, noti);
    }
    
      
}	
	
