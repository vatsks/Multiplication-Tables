package com.example.multiplicationtables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;int timestable;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final SeekBar seekBar=findViewById(R.id.seekBar);
        listView=findViewById(R.id.listView);
        seekBar.setMax(20);
        seekBar.setProgress(10);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                    int min=1;

                    if(progress<min){
                        timestable=min;
                    }
                    else {
                        timestable=progress;

                    }
                Log.i("info",Integer.toString(timestable));

                ArrayList<String> arrayList=new ArrayList<>();

                for (int j=1;j<=10;j++){

                    arrayList.add(Integer.toString(j*timestable));
                }
                ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arrayList);
                listView.setAdapter(arrayAdapter);


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}