package com.example.jgfjhg;

import javax.microedition.khronos.opengles.GL10;

class PlayerCharacter {
	
	static int PlayerCharacter = 1;
	static float X = -3.0f;
	static float Y = -2.1f;
	static int animation = 0;
	static int anitimer = 0;
	static int direction = 1;
	static int anistate = 1; //1 - idle   2 - walk    3 - attack
	static boolean runon = false;
	static boolean attackon = false;
	static boolean blockon = false;
	static boolean deathon = false;
	static boolean hiton = false;
	
	static int jumptimer = 0;
	static float base = -2.1f;
	
	static float OldX;
	static float OldY;
	
	//stats
	static float health = 100;
	static float healthold = health;
	static int strength = 5;
	static int blockpercent = 15;
	static int speed = 3;
	static float range = 2;
	
	//collision stuff
	static float colwidth = 4;
	static float colheigth = 8;
	
	static void Setup(int character){
		
		PlayerCharacter = character;
		health = 100;
		healthold = health;
		
		if (PlayerCharacter == 1){ //joanna
			//stats
			strength = 5;
			blockpercent = 50;
			speed = 3;
			range = 2;
			//collision stuff
			colwidth = 1.3f;
			colheigth = 8;
		}
		if (PlayerCharacter == 2){ //ragnar
			//stats
			strength = 10;
			blockpercent = 50;
			speed = 3;
			range = 2;
			//collision stuff
			colwidth = 4;
			colheigth = 8;
		}
		if (PlayerCharacter == 3){ //luchador
			//stats
			strength = 10;
			blockpercent = 50;
			speed = 3;
			range = 2;
			//collision stuff
			colwidth = 4;
			colheigth = 8;
		}
		if (PlayerCharacter == 4){ //lilhood
			//stats
			strength = 5;
			blockpercent = 50;
			speed = 3;
			range = 2;
			//collision stuff
			colwidth = 4;
			colheigth = 8;
		}
		
	}
	
	static void Update(){
		
		if(health < 0){
			health = 0;
		}
		
		OldX = X;
		OldY = Y;
		
		if (runon == true && attackon == false && blockon == false && deathon == false){
			X += 0.14f * direction;
		}
		
		if (GetDistance() < (colwidth/2 + EnemyCharacter.colwidth/2) && (Y - EnemyCharacter.Y) < 0.5){
			X = OldX;
			Y = OldY;
		}
		
		
		if(UIClass.GetDpad()==1 && Y == base && deathon == false){
			jumptimer = 20;
		}
		
		if(UIClass.GetDpad()==3 && deathon == false){
			//X += 0.1f;
			direction = 1;
			anistate = 2;
			runon = true;
			attackon = false;
		}
		else if(UIClass.GetDpad()==2 && deathon == false){
			//X -= 0.1f;
			direction = -1;
			anistate = 2;
			runon = true;
			attackon = false;
			blockon = false;
		}
		else if(UIClass.GetA()==true && blockon == false && deathon == false){
			anistate = 3;
			attackon = true;
			runon = false;
			blockon = false;
		}
		else if(UIClass.GetB()==true && attackon == false && deathon == false){
			anistate = 4;
			blockon = true;
			attackon = false;
			runon = false;
		}
		else{
			if (runon == false && attackon == false && blockon == false && deathon == false){
				anistate = 1;
			}
		}
		
	
		

		//jumping
		if (jumptimer > 0){
			Y+= 0.1f;
			jumptimer--;
		}
		else if (Y > base){
			Y-= 0.1f;
		}
		if (Y < base){
			Y = base;
		}
		
		//animtaion stuff
		animation++;
		
		if (anistate == 1){
			if (animation > 2){
			animation = 1;
			}
		}
		
		if (anistate == 2){
			if (animation > 6){
				runon = false;
				animation = 1;
			}
		}
		
		if (anistate == 3){
			if (animation > 6){
				attackon = false;
				animation = 1;
			}
		}
		if (anistate == 4){
			if (animation > 6){
				blockon = false;
				animation = 1;
			}
		}
		
		
		if (healthold != health && blockon == false){
			hiton = true;
			anistate = 6;
			animation = 1;
		}
		
		if (hiton  == true && deathon == false && blockon == false){
			attackon = false;
			runon = false;
			
			if (animation > 1){
				hiton = false;
				animation = 1;
			}
		}
		
		healthold = health;
		
		//damage enemy
		if (attackon== true && animation == 4){
			if (EnemyCharacter.blockon == false){
				EnemyCharacter.health -= strength;
			}
			else{
				EnemyCharacter.health -= (strength - strength * EnemyCharacter.blockpercent/100);
			}
			if(EnemyCharacter.Character == 2 || EnemyCharacter.Character == 2){
				if(EnemyCharacter.health > 0){
					UIClass.MalePainNoise();
				}
				
			}
			else{
				if(EnemyCharacter.health > 0){
					UIClass.FemalePainNoise();
				}
			}
		}
		
		//death
		if (health <= 0){
			if (deathon == false){
				animation = 1; 
			}
			deathon = true;
			anistate = 5;
			
		}
		
	}
	
	static int WhichDirection(){
		
		if (X > EnemyCharacter.X){
			return -1;
		}
		else{
			return 1;
		}
		
	}
	
	static float GetDistance(){
		if (X > EnemyCharacter.X){
			return (X- EnemyCharacter.X);
		}
		else{
			return (EnemyCharacter.X - X);
		}
	}
	
	
	static void PlayerDraw(GL10 gl){
		
		
		 gl.glLoadIdentity();
	     gl.glTranslatef(X, Y, -15.0f);
	     
	     if (direction == 1){
	     gl.glRotatef(90, 0.0f, 1.0f, 0.0f);
	     }
	     if (direction == -1){
		     gl.glRotatef(-90, 0.0f, 1.0f, 0.0f);
		     }
	     
	     gl.glScalef(0.2f, 0.2f, 0.2f);
		
		if (PlayerCharacter == 1){
			if (animation == 0){
		     joanna.draw(gl);
			}
			
			if (anistate == 1){
				if (animation == 1){
				     joannaidlea.draw(gl);
				}
				if (animation == 2){
				     joannaidleb.draw(gl);
				}
			
			}
			
			if (anistate == 2){
				if (animation == 1){
			     	joannaruna.draw(gl);
				}
				if (animation == 2){
			     	joannarunb.draw(gl);
				}
				if (animation == 3){
			     	joannarunc.draw(gl);
				}
				if (animation == 4){
			     	joannarund.draw(gl);
				}
				if (animation == 5){
					joannarune.draw(gl);
				}
				if (animation == 6){
					joannarunf.draw(gl);
				}
			}
			
			
			
			
			if (anistate == 3){
				if (animation == 1){
			     	joannaattackf.draw(gl);
				}
				if (animation == 2){
					joannaattacka.draw(gl);
				}
				if (animation == 3){
					joannaattackb.draw(gl);
				}
				if (animation == 4){
					joannaattackc.draw(gl);
				}
				if (animation == 5){
					joannaattackd.draw(gl);
				}
				if (animation == 6){
					joannaattacke.draw(gl);
				}
			}
			
			if (anistate == 4){
				if (animation == 1){
			     	joannablocka.draw(gl);
				}
				if (animation == 2){
					joannablockb.draw(gl);
				}
				if (animation == 3){
					joannablockc.draw(gl);
				}
				if (animation == 4){
					joannablockd.draw(gl);
				}
				if (animation == 5){
					joannablocke.draw(gl);
				}
				if (animation == 6){
					joannablockf.draw(gl);
				}
			}
			
			if (anistate == 5){
				if (animation == 1){
			     	joannadeatha.draw(gl);
				}
				if (animation == 2){
					joannadeathb.draw(gl);
				}
				if (animation == 3){
					joannadeathc.draw(gl);
				}
				if (animation == 4){
					joannadeathd.draw(gl);
				}
				if (animation == 5){
					joannadeathe.draw(gl);
				}
				if (animation >= 6){
					joannadeathf.draw(gl);
				}
			}
			
			if (anistate == 6){
				if (animation == 1){
					joannahit.draw(gl);
				}
			}
			
		}
		
		if (PlayerCharacter == 2){
			if (animation == 0){
		     ragnar.draw(gl);
			}
			
			if (anistate == 1){
				if (animation == 1){
				     ragnaridlea.draw(gl);
				}
				if (animation == 2){
					ragnaridleb.draw(gl);
				}
			
			}
			
			if (anistate == 2){
				if (animation == 1){
			     	ragnarwalka.draw(gl);
				}
				if (animation == 2){
					ragnarwalkb.draw(gl);
				}
				if (animation == 3){
					ragnarwalkc.draw(gl);
				}
				if (animation == 4){
					ragnarwalkd.draw(gl);
				}
				if (animation == 5){
					ragnarwalke.draw(gl);
				}
				if (animation == 6){
					ragnarwalkf.draw(gl);
				}
			}
			
			
			
			
			if (anistate == 3){
				if (animation == 1){
					ragnarattacka.draw(gl);
				}
				if (animation == 2){
					ragnarattackb.draw(gl);
				}
				if (animation == 3){
					ragnarattackc.draw(gl);
				}
				if (animation == 4){
					ragnarattackd.draw(gl);
				}
				if (animation == 5){
					ragnarattacke.draw(gl);
				}
				if (animation == 6){
					ragnarattackf.draw(gl);
				}
			}
			
			if (anistate == 4){
				if (animation == 1){
					ragnarblocka.draw(gl);
				}
				if (animation == 2){
					ragnarblockb.draw(gl);
				}
				if (animation == 3){
					ragnarblockc.draw(gl);
				}
				if (animation == 4){
					ragnarblockd.draw(gl);
				}
				if (animation == 5){
					ragnarblocke.draw(gl);
				}
				if (animation == 6){
					ragnarblockf.draw(gl);
				}
			}
			
			if (anistate == 5){
				if (animation == 1){
					ragnardeatha.draw(gl);
				}
				if (animation == 2){
					ragnardeathb.draw(gl);
				}
				if (animation == 3){
					ragnardeathc.draw(gl);
				}
				if (animation == 4){
					ragnardeathd.draw(gl);
				}
				if (animation == 5){
					ragnardeathe.draw(gl);
				}
				if (animation >= 6){
					ragnardeathf.draw(gl);
				}
			}
			
			if (anistate == 6){
				if (animation == 1){
					ragnarhit.draw(gl);
				}
			}
			
		}
		
		if (PlayerCharacter == 3){
			if (anistate == 1){
				if (animation == 1){
				     luchidlea.draw(gl);
				}
				if (animation == 2){
					luchidleb.draw(gl);
				}
			
			}
			
			if (anistate == 2){
				if (animation == 1){
			     	luchwalka.draw(gl);
				}
				if (animation == 2){
					luchwalkb.draw(gl);
				}
				if (animation == 3){
					luchwalkc.draw(gl);
				}
				if (animation == 4){
					luchwalkd.draw(gl);
				}
				if (animation == 5){
					luchwalke.draw(gl);
				}
				if (animation == 6){
					luchwalkf.draw(gl);
				}
			}
			
			
			
			
			if (anistate == 3){
				if (animation == 1){
					luchattacka.draw(gl);
				}
				if (animation == 2){
					luchattackb.draw(gl);
				}
				if (animation == 3){
					luchattackc.draw(gl);
				}
				if (animation == 4){
					luchattackd.draw(gl);
				}
				if (animation == 5){
					luchattacke.draw(gl);
				}
				if (animation == 6){
					luchattackf.draw(gl);
				}
			}
			
			if (anistate == 4){
				if (animation == 1){
					luchblocka.draw(gl);
				}
				if (animation == 2){
					luchblockb.draw(gl);
				}
				if (animation == 3){
					luchblockc.draw(gl);
				}
				if (animation == 4){
					luchblockd.draw(gl);
				}
				if (animation == 5){
					luchblocke.draw(gl);
				}
				if (animation == 6){
					luchblockf.draw(gl);
				}
			}
			
			if (anistate == 5){
				if (animation == 1){
					luchdeatha.draw(gl);
				}
				if (animation == 2){
					luchdeathb.draw(gl);
				}
				if (animation == 3){
					luchdeathc.draw(gl);
				}
				if (animation == 4){
					luchdeathd.draw(gl);
				}
				if (animation == 5){
					luchdeathe.draw(gl);
				}
				if (animation >= 6){
					luchdeathf.draw(gl);
				}
			}
			
			if (anistate == 6){
				if (animation == 1){
					luchhurt.draw(gl);
				}
			}
		}
		
		if (PlayerCharacter == 4){
			if (anistate == 1){
				if (animation == 1){
				     lilhoodidlea.draw(gl);
				}
				if (animation == 2){
					lilhoodidleb.draw(gl);
				}
			
			}
			
			if (anistate == 2){
				if (animation == 1){
			     	lilhoodwalka.draw(gl);
				}
				if (animation == 2){
					lilhoodwalkb.draw(gl);
				}
				if (animation == 3){
					lilhoodwalkc.draw(gl);
				}
				if (animation == 4){
					lilhoodwalkd.draw(gl);
				}
				if (animation == 5){
					lilhoodwalke.draw(gl);
				}
				if (animation == 6){
					lilhoodwalkf.draw(gl);
				}
			}
			
			
			
			
			if (anistate == 3){
				if (animation == 1){
					lilhoodattacka.draw(gl);
				}
				if (animation == 2){
					lilhoodattackb.draw(gl);
				}
				if (animation == 3){
					lilhoodattackc.draw(gl);
				}
				if (animation == 4){
					lilhoodattackd.draw(gl);
				}
				if (animation == 5){
					lilhoodattacke.draw(gl);
				}
				if (animation == 6){
					lilhoodattackf.draw(gl);
				}
			}
			
			if (anistate == 4){
				if (animation == 1){
					lilhoodblocka.draw(gl);
				}
				if (animation == 2){
					lilhoodblockb.draw(gl);
				}
				if (animation == 3){
					lilhoodblockc.draw(gl);
				}
				if (animation == 4){
					lilhoodblockd.draw(gl);
				}
				if (animation == 5){
					lilhoodblocke.draw(gl);
				}
				if (animation == 6){
					lilhoodblockf.draw(gl);
				}
			}
			
			if (anistate == 5){
				if (animation == 1){
					lilhooddeatha.draw(gl);
				}
				if (animation == 2){
					lilhooddeathb.draw(gl);
				}
				if (animation == 3){
					lilhooddeathc.draw(gl);
				}
				if (animation == 4){
					lilhooddeathd.draw(gl);
				}
				if (animation == 5){
					lilhooddeathe.draw(gl);
				}
				if (animation >= 6){
					lilhooddeathf.draw(gl);
				}
			}
			
			if (anistate == 6){
				if (animation == 1){
					lilhoodhurt.draw(gl);
				}
			}
		}
		
		if(PlayerCharacter == 5){
			
			
			
			if (anistate == 1){
				if (animation == 1){
				     CurrieIdlea.draw(gl);
				}
				if (animation == 2){
				     CurrieIdleb.draw(gl);
				}
			
			}
			
			if (anistate == 2){
				if (animation == 1){
			     	CurrieWalka.draw(gl);
				}
				if (animation == 2){
					CurrieWalkb.draw(gl);
				}
				if (animation == 3){
					CurrieWalkc.draw(gl);
				}
				if (animation == 4){
					CurrieWalkd.draw(gl);
				}
				if (animation == 5){
					CurrieWalke.draw(gl);
				}
				if (animation == 6){
					CurrieWalkf.draw(gl);
				}
			}
			
			
			
			
			if (anistate == 3){
				if (animation == 1){
			     	CurrieAttacka.draw(gl);
				}
				if (animation == 2){
					CurrieAttackb.draw(gl);
				}
				if (animation == 3){
					CurrieAttackc.draw(gl);
				}
				if (animation == 4){
					CurrieAttackd.draw(gl);
				}
				if (animation == 5){
					CurrieAttacke.draw(gl);
				}
				if (animation == 6){
					CurrieAttackf.draw(gl);
				}
			}
			
			if (anistate == 4){
				if (animation == 1){
			     	CurrieBlocka.draw(gl);
				}
				if (animation == 2){
					CurrieBlockb.draw(gl);
				}
				if (animation == 3){
					CurrieBlockc.draw(gl);
				}
				if (animation == 4){
					CurrieBlockd.draw(gl);
				}
				if (animation == 5){
					CurrieBlocke.draw(gl);
				}
				if (animation == 6){
					CurrieBlockf.draw(gl);
				}
			}
			
			if (anistate == 5){
				if (animation == 1){
			     	CurrieDeatha.draw(gl);
				}
				if (animation == 2){
					CurrieDeathb.draw(gl);
				}
				if (animation == 3){
					CurrieDeathc.draw(gl);
				}
				if (animation == 4){
					CurrieDeathd.draw(gl);
				}
				if (animation == 5){
					CurrieDeathe.draw(gl);
				}
				if (animation >= 6){
					CurrieDeathf.draw(gl);
				}
			}
			
			if (anistate == 6){
				if (animation == 1){
					CurrieHurt.draw(gl);
				}
			}
			
			
		}
		
		if (PlayerCharacter == 6){
			
			if (anistate == 1){
				if (animation == 1){
				     phaidlea.draw(gl);
				}
				if (animation == 2){
					phaidleb.draw(gl);
				}
			
			}
			
			if (anistate == 2){
				if (animation == 1){
			     	phawalka.draw(gl);
				}
				if (animation == 2){
					phawalkb.draw(gl);
				}
				if (animation == 3){
					phawalkc.draw(gl);
				}
				if (animation == 4){
					phawalkd.draw(gl);
				}
				if (animation == 5){
					phawalke.draw(gl);
				}
				if (animation == 6){
					phawalkf.draw(gl);
				}
			}
			
			
			
			
			if (anistate == 3){
				if (animation == 1){
					phaattacka.draw(gl);
				}
				if (animation == 2){
					phaattackb.draw(gl);
				}
				if (animation == 3){
					phaattackc.draw(gl);
				}
				if (animation == 4){
					phaattackd.draw(gl);
				}
				if (animation == 5){
					phaattacke.draw(gl);
				}
				if (animation == 6){
					phaattackf.draw(gl);
				}
			}
			
			if (anistate == 4){
				if (animation == 1){
					phablocka.draw(gl);
				}
				if (animation == 2){
					phablockb.draw(gl);
				}
				if (animation == 3){
					phablockc.draw(gl);
				}
				if (animation == 4){
					phablockd.draw(gl);
				}
				if (animation == 5){
					phablocke.draw(gl);
				}
				if (animation == 6){
					phablockf.draw(gl);
				}
			}
			
			if (anistate == 5){
				if (animation == 1){
					phadeatha.draw(gl);
				}
				if (animation == 2){
					phadeathb.draw(gl);
				}
				if (animation == 3){
					phadeathc.draw(gl);
				}
				if (animation == 4){
					phadeathd.draw(gl);
				}
				if (animation == 5){
					phadeathe.draw(gl);
				}
				if (animation >= 6){
					phadeathf.draw(gl);
				}
			}
			
			if (anistate == 6){
				if (animation == 1){
					phahurt.draw(gl);
				}
			}
			
		}
		
		
	}
	
	static void reset(){
		
		PlayerCharacter = 2;
		X = -3.0f;
		Y = -2.1f;
		animation = 0;
		anitimer = 0;
		direction = 1;
		anistate = 1; //1 - idle   2 - walk    3 - attack  4 - block  5 - death  
		runon = false;
		attackon = false;
		blockon = false;
		deathon = false;
		
	}

}
