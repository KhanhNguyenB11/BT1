package com.example.bt1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> list;
    private Context context;
    private ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupComponents();
    }
    public void setupComponents(){
        list = new ArrayList<String>(Arrays.asList("LinearLayout","RelativeLayout","TableActivity"));
        ListView listView = (ListView) findViewById(R.id.listview);
        context = this;
        adapter=new ArrayAdapter<String>(context,
                android.R.layout.simple_list_item_1,
                list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                itemclick(i);
            }
        });
    }
    public void itemclick(int i){
        Intent intent;
        switch (i){
            case 0:
                 intent = new Intent(this,LinearActivity.class);
                startActivity(intent);
                break;
            case 1:
                 intent = new Intent(this,RelativeActivity.class);
                startActivity(intent);
                break;
            case 2:
                 intent = new Intent(this,TableActivity.class);
                startActivity(intent);
                break;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage("NguyenTuanAnhKhanh");
        builder1.setCancelable(true);
        builder1.setNegativeButton(
                "Cancel",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert11 = builder1.create();
        alert11.show();
        return true;
    }
}