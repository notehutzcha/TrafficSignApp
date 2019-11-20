package sdu.cs.teerapat.trafficsignapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    TextView titleTextView, detailTextView ;
    Button backButton ;
    ImageView iconImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        titleTextView = findViewById(R.id.tvTitle);
        detailTextView = findViewById(R.id.tvDetail);
        iconImageView = findViewById(R.id.imvIcon);
        backButton = findViewById(R.id.btBack);

        // รับค่าข้อมูล จาก Intent
        titleTextView.setText(getIntent().getStringExtra("Title"));
        detailTextView.setText(getIntent().getStringExtra("Detail"));
        iconImageView.setImageResource(getIntent().getIntExtra("Icon", R.drawable.traffic_01));

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }// end oncrete() method
}//end class
