package com.example.neeladri.jjtu.activities;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.neeladri.jjtu.R;
import com.example.neeladri.jjtu.fragments.AboutUsFragment;
import com.example.neeladri.jjtu.fragments.ActivitiesFragment;
import com.example.neeladri.jjtu.fragments.ChancellorDeskFragment;
import com.example.neeladri.jjtu.fragments.ConferencesFragment;
import com.example.neeladri.jjtu.fragments.ContactUsFragment;
import com.example.neeladri.jjtu.fragments.FollowUsFragment;
import com.example.neeladri.jjtu.fragments.GalleryFragment;
import com.example.neeladri.jjtu.fragments.NewsFragment;
import com.example.neeladri.jjtu.fragments.PhdProgramFragment;
import com.example.neeladri.jjtu.fragments.PublicationsFragment;

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
            mSelectedNavItemId = savedInstanceState.getInt(ARG_SELECTED_NAV_ITEM_ID);
        }
        navigationView.setCheckedItem(mSelectedNavItemId);
        onNavigationItemSelected(navigationView.getMenu().findItem(mSelectedNavItemId));
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
            replaceFragment(new AboutUsFragment());
        } else if (mSelectedNavItemId == R.id.nav_chancellor_desk) {
            mToolbar.setTitle(R.string.chancellor_desk);
            replaceFragment(new ChancellorDeskFragment());
        }else if (mSelectedNavItemId == R.id.nav_gallery) {
            mToolbar.setTitle(R.string.gallery);
            replaceFragment(new GalleryFragment());
        } else if (mSelectedNavItemId == R.id.nav_follow_us) {
            mToolbar.setTitle(R.string.follow_us);
            replaceFragment(new FollowUsFragment());
        } else if (mSelectedNavItemId == R.id.nav_phd_program) {
            mToolbar.setTitle(R.string.phd_program);
            replaceFragment(new PhdProgramFragment());
        } else if (mSelectedNavItemId == R.id.nav_contact_us) {
            mToolbar.setTitle(R.string.contact_us);
            replaceFragment(new ContactUsFragment());
        } else if (mSelectedNavItemId == R.id.nav_publications) {
            mToolbar.setTitle(R.string.publications);
            replaceFragment(new PublicationsFragment());
        } else if (mSelectedNavItemId == R.id.nav_conferences) {
            mToolbar.setTitle(R.string.conferences);
            replaceFragment(new ConferencesFragment());
        } else if (mSelectedNavItemId == R.id.nav_activities) {
            mToolbar.setTitle(R.string.activities);
            replaceFragment(new ActivitiesFragment());
        } else if (mSelectedNavItemId == R.id.nav_news) {
            mToolbar.setTitle(R.string.news);
            replaceFragment(new NewsFragment());
        }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(ARG_SELECTED_NAV_ITEM_ID, mSelectedNavItemId);
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.navigation_body_container, fragment);
        transaction.commit();
    }
}
