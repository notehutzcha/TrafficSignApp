package sdu.cs.teerapat.trafficsignapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Button moreButton , aboutButton ;
    ListView listView ;
    String[] titleStrings, detailStrings, subStrings ;
    int[] ints = new int[]{R.drawable.traffic_01, R.drawable.traffic_02, R.drawable.traffic_03, R.drawable.traffic_04, R.drawable.traffic_05,
            R.drawable.traffic_06, R.drawable.traffic_07, R.drawable.traffic_08, R.drawable.traffic_09, R.drawable.traffic_10, R.drawable.traffic_11, R.drawable.traffic_12,
            R.drawable.traffic_13, R.drawable.traffic_14, R.drawable.traffic_15, R.drawable.traffic_16, R.drawable.traffic_17, R.drawable.traffic_18, R.drawable.traffic_19,
            R.drawable.traffic_20 };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moreButton = findViewById(R.id.btn_more);
        aboutButton = findViewById(R.id.btn_about);
        listView = findViewById(R.id.listview);

        // get ค่า ข้อมูลจาก DB (my_context.xml)
        titleStrings = getResources().getStringArray(R.array.title);
        detailStrings = getResources().getStringArray(R.array.detail);

        //substring detail 20 char
        subStrings = new String[detailStrings.length];
        for (int i=0; i<detailStrings.length; i++){
            subStrings[i] = detailStrings[i].substring(0, 20)+"...";
        }

        //นำข้อมูลไปแสดงบน listview
        MyAdapter myAdapter = new MyAdapter(MainActivity.this, ints, titleStrings, subStrings);
        listView.setAdapter(myAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, Detail.class);
                intent.putExtra("Icon",ints[i]);
                intent.putExtra("Title",titleStrings[i]);
                intent.putExtra("Detail",detailStrings[i]);
                startActivity(intent);
            }
        });


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
                Intent aboutIntent = new Intent(MainActivity.this,AboutmeActivity.class);
                startActivity(aboutIntent);
            }
        });
    } // oncrete method
} //end class
