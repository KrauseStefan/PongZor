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
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

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

		ArrayAdapter<HighScore> arryAdapter = new ArrayAdapter<HighScore>(this,
				0) {

			@Override
			public View getView(int position, View convertView, ViewGroup parent) {

				HighScore hs = this.getItem(position);

				View v = getLayoutInflater().inflate(
						R.layout.highscore_list_field, null);
				TextView twName = (TextView) findViewById(R.id.HighScore_playerName);
				TextView twScore = (TextView) findViewById(R.id.HighScore_playerScore);

				twName.setText(hs.getName());
				twScore.setText(hs.getScore());
				return v;
			}
		};

		return arryAdapter;
	}

	private List<HighScore> createDummyData() {
		ArrayList<HighScore> hsList = new ArrayList<HighScore>();

		Date d = new Date(2012, 5, 31);
		hsList.add(new HighScore("Hans", 6000, 420, d));
		hsList.add(new HighScore("Lars", 9999, 130, d));
		hsList.add(new HighScore("Linux Thorvaldsen", 1337, 1, d));
		hsList.add(new HighScore("Signe", 2156, 180, d));
		hsList.add(new HighScore("Børge", 88888, 580, d));
		hsList.add(new HighScore("Tina", 123456, 730, d));
		hsList.add(new HighScore("Anette", 1, 10, d));
		hsList.add(new HighScore("Frans", 89, 20, d));

		return hsList;
	}
}
