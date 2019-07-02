package com.example.helloactionbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setFragment(new NewFragment());
        this.setFragment(new Searchragment());
        this.setFragment(new SettingFragment());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    // pillamos la accion de cada item del menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_new:
                Toasty.success(getApplicationContext(),"Congratulation!!",Toast.LENGTH_SHORT, true).show();
                this.setFragment(new NewFragment());
                return true;
            case R.id.action_search:
                Toasty.warning(getApplicationContext(), "Beware of the dog.", Toast.LENGTH_SHORT, true).show();
                this.setFragment(new Searchragment());
                return true;
            case R.id.action_setting:
                Toasty.info(getApplicationContext(), "Here is some info for you.", Toast.LENGTH_SHORT, true).show();
                this.setFragment(new SettingFragment());
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    private void setFragment(Fragment Mifragment) {

        FragmentManager FM = getSupportFragmentManager();
        FragmentTransaction FT = FM.beginTransaction();
        FT.replace(R.id.main_container, Mifragment);
        FT.commit();
    }

}
