package com.example.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        //inflate the menu - adds items to the app bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_create_msg:
                Intent intent = new Intent(this, CreateMessageActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_sendby_msg:
                Intent intent_1;
                intent_1 = new Intent(this, SendbyMessageActivity.class);
                intent_1.putExtra(SendbyMessageActivity.EXTRA_MESSAGE,"from main activity");
                startActivity(intent_1);
                return true;
            case R.id.action_new_activity:
                Intent intent_2;
                intent_2 = new Intent(this, NewActivity.class);
                intent_2.putExtra(NewActivity.NEW_MESSAGE,"This is the new activity I have created!");
                startActivity(intent_2);
            default:
        }
        return super.onOptionsItemSelected(item);
    }
}
