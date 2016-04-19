package com.example.robert.cse110lab3part2.tests;

import android.support.annotation.UiThread;
import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

import com.example.robert.cse110lab3part2.MainActivity;
import com.example.robert.cse110lab3part2.R;

/**
 * Created by Robert on 4/19/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity>
{

    MainActivity mainActivity;

    public JUnit_test()
    {

        super(MainActivity.class);

    }

    @UiThreadTest
    public void test_first() {

        mainActivity = getActivity();

        EditText text1 = (EditText) mainActivity.findViewById(R.id.editText1);
        EditText text2 = (EditText) mainActivity.findViewById(R.id.editText2);
        Button button = (Button) mainActivity.findViewById(R.id.addition);
        TextView textView = (TextView) mainActivity.findViewById(R.id.result);

        text1.setText("5");
        text2.setText("10");

        button.performClick();

        assertEquals(15, Integer.parseInt(textView.getText().toString()));

    }

}
