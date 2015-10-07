package com.moneysnap.app;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import com.melnykov.fab.FloatingActionButton;
import com.moneysnap.helper.MainEditText;
import com.moneysnap.helper.RobotoFontHelper;

import static com.moneysnap.helper.KeyboardHelper.hideKeyboard;

public class MainActivity extends Activity {
    private FloatingActionButton fab;
    private RelativeLayout rootRelativeLayout;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        ListView listView = (ListView) findViewById(android.R.id.list);
//        fab.attachToListView(listView);
        Typeface typeface = Typeface.createFromAsset(getAssets(), RobotoFontHelper.ROBOTO_THIN.getResourcesPath());
        setContentView(R.layout.activity_main);
        rootRelativeLayout =  (RelativeLayout) findViewById(R.id.main);
        editText = (EditText) findViewById(R.id.editText);
        editText.setTypeface(typeface);
//        editText.getBackground().setColorFilter(Color.BLUE, PorterDuff.Mode.SRC_ATOP);
//        fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setType(FloatingActionButton.TYPE_MINI);
//        fab.show();
//        Display display = getWindowManager().getDefaultDisplay();
//        fab.layout();
    }

    @Override
    protected void onResume() {
        super.onResume();
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (!hasFocus) {
                    hideKeyboard(view);
                }
            }
        });

        rootRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.isFocused()) {
                    editText.clearFocus();
                }
            }
        });
//        relativeLayout.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                if (editText.isFocused()) {
//                    editText.clearFocus();
//                    InputMethodManager imm = (InputMethodManager) view.getContext()
//                            .getSystemService(Context.INPUT_METHOD_SERVICE);
//                    imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
//                }
//                return false;
//            }
//        });
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                System.out.println("haha");
//            }
//        });
    }
//
    @Override
    protected void onPause() {
        super.onPause();
        rootRelativeLayout.setOnClickListener(null);
        editText.setOnFocusChangeListener(null);
//        fab.setOnClickListener(null);
    }
}
