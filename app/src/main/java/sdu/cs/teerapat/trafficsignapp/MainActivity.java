package sdu.cs.teerapat.trafficsignapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button moreButton , aboutButton ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moreButton = findViewById(R.id.btn_more);
        aboutButton = findViewById(R.id.btn_about);

        moreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moreIntent = new Intent(Intent.ACTION_VIEW);
                moreIntent.setData(Uri.parse("https://www.dlt.go.th/th/"));
                startActivity(moreIntent);
            }
        });
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent aboutIntent = new Intent();
            }
        });
    } // oncrete method
} //end class
