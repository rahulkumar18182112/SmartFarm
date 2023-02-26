package com.example.smartfarm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Profile extends AppCompatActivity {
ImageButton cross;
Button Invite,chat,changePassword,feedback,Logout1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        cross=(ImageButton) findViewById(R.id.cross);
        Invite=findViewById(R.id.Invite);
        chat=findViewById(R.id.chat);
        changePassword=findViewById(R.id.changePassword);
        feedback=findViewById(R.id.feedback);
        Logout1=findViewById(R.id.Logout1);
        cross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cross=new Intent(Profile.this,MainActivity.class);
                startActivity(cross);
            }
        });
Invite.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent invite= new Intent(Intent.ACTION_SEND);
invite.setType("text/plain");
invite.putExtra(Intent.EXTRA_TEXT,"hyy guys you can download this App which is very useful for the good cultivation via link and don't forget to enter the Promocode Rahukalll you will get 1000 rs in your wallet");
startActivity(Intent.createChooser(invite,"share via"));
    }
});
Logout1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(Profile.this, "Logging Off", Toast.LENGTH_SHORT).show();

    }
});
chat.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(Profile.this, "our chat bot is coming Soon", Toast.LENGTH_SHORT).show();
    }
});
changePassword.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent change=new Intent(Profile.this,ForgetPassword.class);
        startActivity(change);
    }
});
feedback.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent feedback= new Intent(Profile.this,Contact_us.class);
        startActivity(feedback);
    }
});




        }
}