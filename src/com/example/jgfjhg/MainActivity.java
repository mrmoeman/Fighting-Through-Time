package com.example.jgfjhg;

import android.app.Activity;
import android.graphics.Canvas;
import android.media.MediaPlayer;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.WindowManager;


public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);        
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
     		GLSurfaceView view = new GLSurfaceView(this);
     		
       		view.setRenderer(new RendererView(true, view));
       		setContentView(view);
       		
       		UIClass.mp = MediaPlayer.create(getApplicationContext(), R.drawable.musictheme);
       		UIClass.mp.start();
       		UIClass.mp.setLooping(true);
       		UIClass.mp.setVolume(0.1f, 0.1f);
       		
       		UIClass.Malemp = MediaPlayer.create(getApplicationContext(), R.drawable.malepain);
       		
       		UIClass.Femalemp = MediaPlayer.create(getApplicationContext(), R.drawable.femalepain);
       		
       		
    }
    
    @Override
    public boolean onTouchEvent(MotionEvent e) {

        UIClass.SetX(e.getX());
        UIClass.SetY(e.getY());
        if (e.getAction() == MotionEvent.ACTION_DOWN){
        	UIClass.SetState(1);
        }
        if (e.getAction() == MotionEvent.ACTION_UP){
        	UIClass.SetState(0);
        }
        if (e.getAction() == MotionEvent.ACTION_MOVE){
        	UIClass.SetState(2);
        }
        
        return true;
    }
    
    
}
