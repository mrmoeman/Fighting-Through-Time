package com.example.jgfjhg;

import javax.microedition.khronos.opengles.GL10;

import android.view.MotionEvent;


public class FightView {
	
	float x = -3.0f;
	boolean setup = false;
	boolean countdown = false;
	int timer;
	boolean reset = false;
	int play;
	int eplay;
	
	public FightView(Character player, Character eplayer){
		if (player == Character.Joanna){
			play = 1;
		}
		if (player == Character.Ragnar){
			play = 2;
		}
		if (player == Character.Luchador){
			play = 3;
		}
		if (player == Character.LilRedRidingHood){
			play = 4;
		}
		if (player == Character.Granny){
			play = 5;
		}
		if (player == Character.Pharaoh){
			play = 6;
		}
		
		if (eplayer == Character.Joanna){
			eplay = 1;
		}
		if (eplayer == Character.Ragnar){
			eplay = 2;
		}
		if (eplayer == Character.Luchador){
			eplay = 3;
		}
		if (eplayer == Character.LilRedRidingHood){
			eplay = 4;
		}
		if (eplayer == Character.Granny){
			eplay = 5;
		}
		if (eplayer == Character.Pharaoh){
			eplay = 6;
		}
		
	}

	public void Update(){
		if (setup == false){
			PlayerCharacter.Setup(play);
			EnemyCharacter.Setup(eplay);
			setup = true;
		}
		
		PlayerCharacter.Update();
		EnemyCharacter.Update();
		
		if (EnemyCharacter.health == 0 || PlayerCharacter.health == 0){
			countdown = true;
		}
		if (countdown == true){
			timer++;
		}
		if (timer > 12){
			reset = true;
		}
		
	}
	
	public boolean GetReset(){
		
		return reset;
		
	}



	public void DrawFightScene(GL10 gl){
		
		PlayerCharacter.PlayerDraw(gl);
		
		EnemyCharacter.PlayerDraw(gl);
		
		
		gl.glLoadIdentity();
	    gl.glTranslatef(0.0f,-2.2f, -15.0f);
	    gl.glScalef(0.1f, 0.1f, 0.1f);
	    
		stage.draw(gl);
		
	}
	
	
}