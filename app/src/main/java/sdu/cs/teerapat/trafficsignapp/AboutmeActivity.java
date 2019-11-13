package sdu.cs.teerapat.trafficsignapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AboutmeActivity extends AppCompatActivity {
    TextView fbTextView, telTextView, eduTextView;
    Button backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutme);

        fbTextView = findViewById(R.id.tv_fb);
        telTextView = findViewById(R.id.tv_tel);
        eduTextView = findViewById(R.id.tv_edu);
        backButton = findViewById(R.id.button);

        fbTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fbIntent = new Intent(Intent.ACTION_VIEW);
                fbIntent.setData(Uri.parse("https://www.facebook.com/prayutofficial"));
                startActivity(fbIntent);
            }
        }); // end facebook onclick()
        telTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent telIntent = new Intent(Intent.ACTION_DIAL);
                telIntent.setData(Uri.parse("tel:0888188216"));
                startActivity(telIntent);

            }
        }); // end tel onclick()

        final Uri location = Uri.parse("http://maps.google.com/maps?z=10&q=loc:13.776965,100.510833('มหาวิทยาลัยสวนดุสิต')");

        eduTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eduIntent = new Intent(Intent.ACTION_VIEW, location);
                eduIntent.setPackage("com.google.android.apps.maps");
                startActivity(eduIntent);

            }
        }); // end education onclick()

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();


            }
        }); //end back button onclick()

    } //end oncrete() method
}//end class
