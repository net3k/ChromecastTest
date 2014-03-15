package com.net3k.chromecasttest;

import com.google.sample.castcompanionlibrary.cast.DataCastManager;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;

public class MainActivity extends ActionBarActivity
{
	private static DataCastManager mCastManager = null;

	@Override
	protected void onCreate( Bundle savedInstanceState )
	{
		super.onCreate( savedInstanceState );
		if ( null == mCastManager )
		{
			mCastManager = DataCastManager.initialize( this, "34A10ECA" );
		}

		mCastManager.setContext( this );
	}

	@Override
	public boolean onCreateOptionsMenu( Menu menu )
	{
		super.onCreateOptionsMenu( menu );
		getMenuInflater().inflate( R.menu.main, menu );
		mCastManager.addMediaRouterButton( menu, R.id.media_route_menu_item );
		return true;
	}
}
