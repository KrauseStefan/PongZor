package com.iha.pongzor.gui;

import com.iha.pongzor.data.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.iha.pongzor.*;

public class HighscoreActivity extends Activity {

	private List<Map<String, String>> hsData;

	/**
	 * @see android.app.Activity#onCreate(Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.highscore);

		List<HighScore> hsList = createDummyData();

		ListView lv = (ListView) findViewById(R.id.highscore_list);

		lv.setAdapter(createAdapter(hsList));
	}

	private ListAdapter createAdapter(List<HighScore> hsList) {


		ArrayAdapter<HighScore> arryAdapter = new ArrayAdapter<HighScore>(this, 0) {
			@Override
			public View getView (int position, View convertView, ViewGroup parent){
				
				View v = getLayoutInflater().inflate(R.layout.highscore_list_field, null);
				
				return v;
			}
		};
		
		
		return arryAdapter;
	}

	private List<HighScore> createDummyData() {
		ArrayList<HighScore> hsList = new ArrayList<HighScore>();

		Date d = new Date(2012, 5, 31);
		hsList.add(new HighScore(6000, 420, d));
		hsList.add(new HighScore(9999, 130, d));
		hsList.add(new HighScore(1337, 1, d));
		hsList.add(new HighScore(2156, 180, d));
		hsList.add(new HighScore(88888, 580, d));
		hsList.add(new HighScore(123456, 730, d));
		hsList.add(new HighScore(1, 10, d));
		hsList.add(new HighScore(89, 20, d));

		return hsList;
	}
}
