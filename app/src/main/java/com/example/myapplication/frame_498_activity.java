package com.example.myapplication;

/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		frame_498
	 *	@date 		Friday 21st of April 2023 12:02:06 PM
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
import android.widget.ImageView;
import android.widget.TextView;

public class frame_498_activity extends Activity {

	
	private View _bg__frame_498_ek2;
	private ImageView vector;
	private ImageView vector_ek1;
	private TextView your_orders_ek1;
	private ImageView __img_frame_11;
	private TextView cookie_sandwich;
	private TextView price;
	private View line_17;
	private TextView add_promo_code;
	private Button btn_apply;
	private TextView shortbread__chocolat;
	private TextView shortbread__chocolat_ek1;
	private TextView shortbread__chocolat_ek2;
	private TextView shortbread__chocolat_ek3;
	private TextView total;
	private TextView kes_1_045;
	private Button btn_add_items;
	private Button btn_payment;
	private Button btn_home;
	private Button btn_search;
	private Button btn_cart;
	private Button btn_account;

	@SuppressLint("MissingInflatedId")
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.frame_498);

		
		_bg__frame_498_ek2 = (View) findViewById(R.id._bg__frame_498_ek2);
		vector = (ImageView) findViewById(R.id.vector);
		your_orders_ek1 = (TextView) findViewById(R.id.your_orders_ek1);
		__img_frame_11 = (ImageView) findViewById(R.id.__img_frame_11);
		cookie_sandwich = (TextView) findViewById(R.id.cookie_sandwich);
		price = (TextView) findViewById(R.id.price);
		add_promo_code = (TextView) findViewById(R.id.add_promo_code);
		btn_apply = (Button) findViewById(R.id.btn_apply);
		shortbread__chocolat = (TextView) findViewById(R.id.shortbread__chocolat);
		shortbread__chocolat_ek1 = (TextView) findViewById(R.id.shortbread__chocolat_ek1);
		shortbread__chocolat_ek2 = (TextView) findViewById(R.id.shortbread__chocolat_ek2);
		shortbread__chocolat_ek3 = (TextView) findViewById(R.id.shortbread__chocolat_ek3);
		total = (TextView) findViewById(R.id.total);
		kes_1_045 = (TextView) findViewById(R.id.kes_1_045);
		btn_add_items = (Button) findViewById(R.id.btn_add_items);
		btn_payment = (Button) findViewById(R.id.btn_payment);
		btn_home = (Button) findViewById(R.id.btn_home);
		btn_search = (Button) findViewById(R.id.btn_search);
		btn_cart = (Button) findViewById(R.id.btn_cart);
		btn_account = (Button) findViewById(R.id.btn_account);
	
		
		//custom code goes here
	
	}

	public void change_Activity(View view) {
		switch (view.getId()) {
			case R.id.btn_home:
				Intent intent = new Intent(frame_498_activity.this, all_restaurants_activity.class);
				startActivity(intent);
				break;
//			case R.id.btn_search:
//				intent = new Intent(frame_498_activity.this, search_activity.class);
//				startActivity(intent);
//				break;
			case R.id.btn_cart:
				intent = new Intent(frame_498_activity.this, frame_498_activity.class);
				startActivity(intent);
				break;
//			case R.id.btn_account:
//				intent = new Intent(frame_498_activity.this, account_activity.class);
//				startActivity(intent);
//				break;

			// code for more buttons goes here
			default:
				break;
		}
	}
}
	
	