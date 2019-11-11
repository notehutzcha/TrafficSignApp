package sdu.cs.teerapat.trafficsignapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AboutmeActivity extends AppCompatActivity {
    TextView fbTextView , telTextView;
    Button backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutme);

        fbTextView = findViewById(R.id.tv_fb);
        telTextView = findViewById(R.id.tv_tel);
        backButton = findViewById(R.id.button);

        fbTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fbIntent = new Intent(Intent.ACTION_VIEW);
                fbIntent.setData(Uri.parse("https://www.facebook.com/prayutofficial"));
                startActivity(fbIntent);
            }
        });
        telTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent telIntent = new Intent(Intent.ACTION_DIAL);
                telIntent.setData(Uri.parse("tel:0888188216"));
                startActivity(telIntent);

            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent backIntent = new Intent();
            }
        });

    } //end oncrete() method
}//end class
