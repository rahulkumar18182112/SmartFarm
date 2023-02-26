package com.example.smartfarm;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        if(getSupportActionBar()!=null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("SmartFarm");
            getSupportActionBar().setSubtitle("Lets do it!!!");
        }



    }
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.toolbar_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId= item.getItemId();
        if(itemId==R.id.ContactUs){
            Intent contact=new Intent(MainActivity.this,Contact_us.class);
            startActivity(contact);
        }
        else if(itemId==R.id.profile){
            Intent profile=new Intent(this,Profile.class);
            startActivity(profile);
        }
        else if(itemId==R.id.Language){
            Intent language=new Intent(this,Language.class);
            startActivity(language);
        }
        else if(itemId==R.id.about){
            Intent about=new Intent(this,About_us.class);
            startActivity(about);
        }else if(itemId==R.id.Logout){
            Toast.makeText(this, "Logging off", Toast.LENGTH_SHORT).show();
        }else if(itemId==R.id.share){
            Intent share= new Intent(Intent.ACTION_SEND);
            share.setType("text/plain");
            share.putExtra(Intent.EXTRA_TEXT,"Gus download this amazing app and dont forget to use the code Rahukallll");
            startActivity(Intent.createChooser(share,"share via"));

        }
        return super.onOptionsItemSelected(item);
    }
}