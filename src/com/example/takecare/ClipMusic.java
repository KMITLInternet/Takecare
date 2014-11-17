package com.example.takecare;



import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class ClipMusic extends Activity {
	ImageView imgPlay,imgPause ;
	MediaPlayer mdPlay ;
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clipmusic);
        
        imgPlay = (ImageView)findViewById(R.id.playBtnn);
        imgPause = (ImageView)findViewById(R.id.pauseeBtn);
        imgPlay.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        	    mdPlay = MediaPlayer.create(getBaseContext(), R.raw.pleng);
 		        mdPlay.start();
        	}
        });
        imgPause.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		
 		        mdPlay.stop();
        	}
        });

    }
        
    }


