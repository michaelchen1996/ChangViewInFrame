package com.example.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
//import android.widget.TextView;

public class MainActivity extends Activity {

	private LinearLayout ll1, ll2;
	private Button btn1, btn2;
//	private TextView tv1, tv2;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ll1 = (LinearLayout) findViewById(R.id.linearLayout1);
        ll2 = (LinearLayout) findViewById(R.id.linearLayout2);
//        ll1.setVisibility(View.VISIBLE);
//        ll2.setVisibility(View.GONE);
        
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				ll1.setVisibility(View.GONE);
				ll2.setVisibility(View.VISIBLE);
			}
		});
        btn2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				ll1.setVisibility(View.VISIBLE);
		        ll2.setVisibility(View.GONE);
			}
		});
    }
}
