package com.appank.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listview);
        String[]values = new String[]
                {      "Item Clik 0",
                        "Item Clik 1",
                        "Item Clik 2",
                        "Item Clik 3",
                        "Item Clik 4",
                        "Item Clik 5",
                };
        final ArrayAdapter<String> adapter= new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1, android.R.id.text1,values);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Toast.makeText(getApplicationContext(), "Item Clik 0",Toast.LENGTH_LONG).show();
                }
                else if (position==1){
                    Toast.makeText(getApplicationContext(), "Item Clik 1",Toast.LENGTH_LONG).show();
                }
                else if (position==2){
                    Toast.makeText(getApplicationContext(), "Item Clik 2",Toast.LENGTH_LONG).show();
                }
                if (position==3){
                    Toast.makeText(getApplicationContext(), "Item Clik 3",Toast.LENGTH_LONG).show();
                }
                else if (position==4){
                    Toast.makeText(getApplicationContext(), "Item Clik 4",Toast.LENGTH_LONG).show();
                }
                else if (position==5){
                    Toast.makeText(getApplicationContext(), "Item Clik 5",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}