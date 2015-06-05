package com.ronakmakwana.navigationdrawerexample;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity
        implements NavigationDrawerCallbacks {

    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private NavigationDrawerFragment mNavigationDrawerFragment;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mToolbar = (Toolbar) findViewById(R.id.toolbar_actionbar);
        setSupportActionBar(mToolbar);

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getFragmentManager().findFragmentById(R.id.fragment_drawer);

        // Set up the drawer.
        mNavigationDrawerFragment.setup(R.id.fragment_drawer, (DrawerLayout) findViewById(R.id.drawer), mToolbar);
        // populate the navigation drawer
        mNavigationDrawerFragment.setUserData("Swapnil Parmar", "swapnil@crawded.com", BitmapFactory.decodeResource(getResources(), R.drawable.avatar));
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments


    if (position == 0) {
        Toast.makeText(this, "TimeLine", Toast.LENGTH_SHORT).show();
    }
    if(position == 1) {
        Toast.makeText(this, "Top Trending", Toast.LENGTH_SHORT).show();
    }
     if(position == 2) {
        Toast.makeText(this, "Who to Follow", Toast.LENGTH_SHORT).show();
    }
    if (position == 3) {
        Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show();
    }
    if (position == 4) {
        Toast.makeText(this, "Invite Friends", Toast.LENGTH_SHORT).show();
    }
     if (position == 5) {
        Toast.makeText(this, "Change Password", Toast.LENGTH_SHORT).show();
    }
     if (position == 6) {
        Toast.makeText(this, "My Interest", Toast.LENGTH_SHORT).show();
    }
     if(position == 7) {
        Toast.makeText(this, "Log Out", Toast.LENGTH_SHORT).show();
    }
 }

    @Override
    public void onBackPressed() {
        if (mNavigationDrawerFragment.isDrawerOpen())
            mNavigationDrawerFragment.closeDrawer();
        else
            super.onBackPressed();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

       /* MenuItem fav;
        fav = menu.add("Log Out");
        fav.setIcon(R.drawable.ic_menu_logout);*/

        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.

            getMenuInflater().inflate(R.menu.main, menu);
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

            return super.onOptionsItemSelected(item);
        }


}
