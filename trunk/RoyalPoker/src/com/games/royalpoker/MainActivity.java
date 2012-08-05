package com.games.royalpoker;

import android.os.Bundle;
import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.Menu;
import android.view.View;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends Activity
{

	LinearLayout mLinearLayout;

	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);

		// Create a LinearLayout in which to add the ImageView
		mLinearLayout = new LinearLayout(this);

		// Instantiate an ImageView and define its properties
		ImageView i = new ImageView(this);
		i.
		i.setImageResource(R.drawable.my_image);
		i.setAdjustViewBounds(true); // set the ImageView bounds to match the Drawable's dimensions
		i.setLayoutParams(new Gallery.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));

		// Add the ImageView to the layout and set the layout as the content view
		mLinearLayout.addView(i);
		setContentView(mLinearLayout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}
