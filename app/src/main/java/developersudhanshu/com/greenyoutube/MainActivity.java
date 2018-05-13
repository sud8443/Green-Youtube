package developersudhanshu.com.greenyoutube;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import developersudhanshu.com.greenyoutube.fragments.ActivityFragment;
import developersudhanshu.com.greenyoutube.fragments.HomeFragment;
import developersudhanshu.com.greenyoutube.fragments.LibraryFragment;
import developersudhanshu.com.greenyoutube.fragments.SubscriptionsFragment;
import developersudhanshu.com.greenyoutube.fragments.TrendingFragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        BottomNavigationViewHelper.removeShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        toolbar = (Toolbar) findViewById(R.id.toolbar_activity_main);

        toolbar.setTitle("YouTube");
        toolbar.setTitleTextColor(ContextCompat.getColor(this, R.color.whiteShade1));
        toolbar.setLogo(R.drawable.youtube);
        setSupportActionBar(toolbar);

        getSupportFragmentManager().beginTransaction().replace(R.id.frag_container, new HomeFragment()).commit();

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.frag_container, new HomeFragment()).commit();
                break;
            case R.id.nav_trend:
                getSupportFragmentManager().beginTransaction().replace(R.id.frag_container, new TrendingFragment()).commit();
                break;
            case R.id.nav_sub:
                getSupportFragmentManager().beginTransaction().replace(R.id.frag_container, new SubscriptionsFragment()).commit();
                break;
            case R.id.nav_activity:
                getSupportFragmentManager().beginTransaction().replace(R.id.frag_container, new ActivityFragment()).commit();
                break;
            case R.id.nav_library:
                getSupportFragmentManager().beginTransaction().replace(R.id.frag_container, new LibraryFragment()).commit();
                break;
        }
        return true;
    }
}
