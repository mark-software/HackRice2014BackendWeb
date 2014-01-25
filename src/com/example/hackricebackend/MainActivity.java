package com.example.hackricebackend;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseObject;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Parse.initialize(this, "Zvpn5BA4aMNleuCG5n8eEgOIhsycSaGbDisubi4H", "P9oPLKCSipwBL7jOCYAzXEUDUJ6f2BHz57zIhvJn");
		ParseObject testObject = new ParseObject("TestObject");
		testObject.put("andrew", "rice");
		testObject.saveInBackground();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}