package com.example.smartfarm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Contact_us extends AppCompatActivity {
Button submitFeedback,care,Email, twitter,facebook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

submitFeedback=findViewById(R.id.submitFeedback);
        care =findViewById(R.id.care);
        Email=findViewById(R.id.Email);
        twitter=findViewById(R.id.twitter);
        facebook=findViewById(R.id.facebook);

        submitFeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Contact_us.this, "Thanks for Your Valuable Feedback", Toast.LENGTH_LONG).show();
            }
        });

care.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent care=new Intent(Intent.ACTION_DIAL);
        care.setData(Uri.parse("+917503617457"));
        startActivity(care);
    }
});

Email.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent email= new Intent(Intent.ACTION_SEND);
        email.setType("message/rfc822");
        email.putExtra(Intent.EXTRA_SUBJECT,"Help");
        email.putExtra(Intent.EXTRA_TEXT,"Write your problem here");
        email.putExtra(Intent.EXTRA_EMAIL,new String[]{"rahulkumar7503617457@gmail.com","rahulkumar43701@gmail.com"});
        startActivity(Intent.createChooser(email,"email via"));
    }
});

// for linking a link to the button we have to use goLink attributes
// it will show error so we have to create a method of it using alt+enter
facebook.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        goLink("https://www.facebook.com/profile.php?id=100007475319298&mibextid=ZbWKwL");
    }
});

twitter.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        goLink("https://twitter.com/rahulkumar1_8?t=849wm0xXUd1tT6n_R5YKgg&s=09");
    }
});

    }


    private void goLink(String s) {
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}