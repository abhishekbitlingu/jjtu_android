package com.example.neeladri.jjtu.activities;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.neeladri.jjtu.R;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private static final String ARG_TOOLBAR_TITLE = "toolbar_title";
    private static final String ARG_SELECTED_NAV_ITEM_ID = "selected_nav_item_id";
    private Toolbar mToolbar;
    private int mSelectedNavItemId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = findViewById(R.id.toolbar);
        mToolbar.setTitle(R.string.about_us);
        setSupportActionBar(mToolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, mToolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        mSelectedNavItemId = R.id.nav_about_us;

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        if (savedInstanceState != null) {
            mToolbar.setTitle(savedInstanceState.getCharSequence(ARG_TOOLBAR_TITLE));
            mSelectedNavItemId = savedInstanceState.getInt(ARG_SELECTED_NAV_ITEM_ID);
        }
        navigationView.setCheckedItem(mSelectedNavItemId);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        mSelectedNavItemId = item.getItemId();
        if (mSelectedNavItemId == R.id.nav_about_us) {
            mToolbar.setTitle(R.string.about_us);
        } else if (mSelectedNavItemId == R.id.nav_gallery) {
            mToolbar.setTitle(R.string.gallery);
        } else if (mSelectedNavItemId == R.id.nav_follow_us) {
            mToolbar.setTitle(R.string.follow_us);
        } else if (mSelectedNavItemId == R.id.nav_phd_program) {
            mToolbar.setTitle(R.string.phd_program);
        } else if (mSelectedNavItemId == R.id.nav_contact_us) {
            mToolbar.setTitle(R.string.contact_us);
        } else if (mSelectedNavItemId == R.id.nav_publications) {
            mToolbar.setTitle(R.string.publications);
        } else if (mSelectedNavItemId == R.id.nav_conferences) {
            mToolbar.setTitle(R.string.conferences);
        } else if (mSelectedNavItemId == R.id.nav_activities) {
            mToolbar.setTitle(R.string.activities);
        } else if (mSelectedNavItemId == R.id.nav_news) {
            mToolbar.setTitle(R.string.news);
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putCharSequence(ARG_TOOLBAR_TITLE, mToolbar.getTitle());
        outState.putInt(ARG_SELECTED_NAV_ITEM_ID, mSelectedNavItemId);
    }
}
