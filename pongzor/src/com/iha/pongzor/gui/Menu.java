package com.iha.pongzor.gui;

import com.iha.pongzor.*;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Menu extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        
        Button btnHS = (Button) findViewById(R.id.menu_btn_highscore);
        btnHS.setOnClickListener(this);        
    }

	public void onClick(View v) {
//		start highscore activity
		startActivity(new Intent(this, HighscoreActivity.class));
		
	}
}