package com.example.myapplication;

/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		all_restaurants
	 *	@date 		Friday 05th of May 2023 10:58:26 AM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

public class all_restaurants_activity extends Activity {

	
	private View _bg__all_restaurants_ek2;
	private TextView deliver_to;
	private TextView athi_river;
	private ImageView __img_chevron_down;
	private ImageView __img_sliders_horizontal;
	private ImageView __img_frame_93;
	private ImageView __img_frame_98;
	private ImageView vector;
	private ImageView vector_ek1;
	private TextView home_ek1;
	private ImageView vector_ek2;
	private ImageView vector_ek3;
	private TextView search_ek1;
	private ImageView vector_ek4;
	private ImageView vector_ek5;
	private ImageView vector_ek6;
	private ImageView vector_ek7;
	private ImageView vector_ek8;
	private TextView orders;
	private ImageView vector_ek9;
	private ImageView vector_ek10;
	private TextView account;
	private Button btn_home;
	private Button btn_search;
	private Button btn_cart;
	private Button btn_account;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.all_restaurants);

		
		_bg__all_restaurants_ek2 = (View) findViewById(R.id._bg__all_restaurants_ek2);
		athi_river = (TextView) findViewById(R.id.athi_river);
		__img_chevron_down = (ImageView) findViewById(R.id.__img_chevron_down);
		__img_sliders_horizontal = (ImageView) findViewById(R.id.__img_sliders_horizontal);
		btn_home = (Button) findViewById(R.id.btn_home);
		btn_search = (Button) findViewById(R.id.btn_search);
		btn_cart = (Button) findViewById(R.id.btn_cart);
		btn_account = (Button) findViewById(R.id.btn_account);
	
		
		//custom code goes here
	
	}

	public void change_Activity(View view) {
		switch (view.getId()) {
			case R.id.btn_home:
				Intent intent = new Intent(all_restaurants_activity.this, all_restaurants_activity.class);
				startActivity(intent);
				break;
//			case R.id.btn_search:
//				intent = new Intent(all_restaurants_activity.this, search_activity.class);
//				startActivity(intent);
//				break;
			case R.id.btn_cart:
				intent = new Intent(all_restaurants_activity.this, frame_498_activity.class);
				startActivity(intent);
				break;
//			case R.id.btn_account:
//				intent = new Intent(all_restaurants_activity.this, account_activity.class);
//				startActivity(intent);
//				break;

			// code for more buttons goes here
			default:
				break;
		}
	}
}
	
	