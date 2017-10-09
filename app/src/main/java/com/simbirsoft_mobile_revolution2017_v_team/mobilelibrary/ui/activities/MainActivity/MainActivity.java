package com.simbirsoft_mobile_revolution2017_v_team.mobilelibrary.ui.activities.MainActivity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.simbirsoft_mobile_revolution2017_v_team.mobilelibrary.R;
import com.simbirsoft_mobile_revolution2017_v_team.mobilelibrary.ui.fragments.FavouriteBooksFragment;
import com.simbirsoft_mobile_revolution2017_v_team.mobilelibrary.ui.fragments.LibraryFragment;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new LibraryFragment(), getResources().getString(R.string.all_books));
        adapter.addFragment(new FavouriteBooksFragment(), getResources().getString(R.string.favourites));
        viewPager.setAdapter(adapter);
    }
}
