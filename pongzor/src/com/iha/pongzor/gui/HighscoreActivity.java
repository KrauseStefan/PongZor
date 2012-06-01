package com.iha.pongzor.gui;

import com.iha.pongzor.data.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
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

		lv.setAdapter(createSimpleAdapter(hsList));
	}

	private ListAdapter createSimpleAdapter(List<HighScore> hsList) {

		List<Map<String, String>> data = new ArrayList<Map<String, String>>();

		String[] from = {"1", "2", "3", "4"};
		int[] to = {1, 2, 3, 4};

		
		
		return new SimpleAdapter(this, data, R.layout.highscore_list_field,
				from, to);
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
