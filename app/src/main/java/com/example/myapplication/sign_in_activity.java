package com.example.myapplication;

/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		sign_in
	 *	@date 		Friday 21st of April 2023 11:48:43 AM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	



import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;

public class sign_in_activity extends Activity {

	
	private View _bg__sign_in_ek2;
	private TextView zaloguj_si_;
	private TextView email_address;
	private TextView abel_domain_com;
	private ImageView vector;
	private TextView password;
	private EditText passwordEditText;
	private ImageView __img_eye_off;
	private Button btn_sign_in;
	private EditText emailEditText;

	@SuppressLint("MissingInflatedId")
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.sign_in);

		
		_bg__sign_in_ek2 = (View) findViewById(R.id._bg__sign_in_ek2);
		zaloguj_si_ = (TextView) findViewById(R.id.zaloguj_si_);
		email_address = (TextView) findViewById(R.id.email_address);
		emailEditText = (EditText) findViewById(R.id.emailEditText);
		abel_domain_com = (TextView) findViewById(R.id.emailEditText);
		vector = (ImageView) findViewById(R.id.vector);
		password = (TextView) findViewById(R.id.password);
		passwordEditText = (EditText) findViewById(R.id.passwordEditText);
		__img_eye_off = (ImageView) findViewById(R.id.__img_eye_off);
		btn_sign_in = (Button) findViewById(R.id.btn_sign_in);


//		btn_sign_in.setOnClickListener(new View.OnClickListener() {
//			@Override
//			public void onClick(View v) {
//				Intent intent = new Intent(sign_in_activity.this, all_restaurants_activity.class);
//				startActivity(intent);
//			}
//		});

		//custom code goes here
	
	}


	public void change_Activity(View view) {
		switch (view.getId()) {
				case R.id.btn_sign_in:
					Intent intent = new Intent(sign_in_activity.this, all_restaurants_activity.class);
					startActivity(intent);
					break;

				// code for more buttons goes here
				default:
					break;
			}
	}
}
	
	