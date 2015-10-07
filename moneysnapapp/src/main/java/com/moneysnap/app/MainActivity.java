package com.moneysnap.app;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Display;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.melnykov.fab.FloatingActionButton;

public class MainActivity extends Activity {
    FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        ListView listView = (ListView) findViewById(android.R.id.list);
//        fab.attachToListView(listView);
        setContentView(R.layout.activity_main);
//        fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setType(FloatingActionButton.TYPE_MINI);
//        fab.show();
//        Display display = getWindowManager().getDefaultDisplay();
//        fab.layout();
    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                System.out.println("haha");
//            }
//        });
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        fab.setOnClickListener(null);
//    }
}
