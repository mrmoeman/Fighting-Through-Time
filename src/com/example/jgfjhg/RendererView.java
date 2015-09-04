package com.example.jgfjhg;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLSurfaceView;
import android.view.View;

import java.lang.Math;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Random;

class RendererView implements GLSurfaceView.Renderer 
{
	Bitmap JoannaTexture;
	Bitmap LuchadorTexture;
	Bitmap RagnarTexture;
	Bitmap LilHoodTexture;
	Bitmap CurrieTexture;
	Bitmap PhaTexture;
	
	Bitmap StageOneTexture;
	
	Bitmap AButton;
	Bitmap BButton;
	Bitmap DPad;
	
	Bitmap Health;
	
	Bitmap CharSelA;
	Bitmap CharSelB;
	
	View MyView;
	
	int timer = 0;
	
	Button ABut;
	Button BBut;
	Dpad DPadBut;
	HealthBar Player;
	HealthBar Enemy;
	
	Boolean CharSelected = false;
	
	Overlay CrSlA = new Overlay(-20);
	Overlay CrSlB = new Overlay(0);
	
	Character Selected = Character.Joanna;
	Character ESelected = Character.Ragnar;
	
	Random Rnd = new Random();
	int temp;
	int SelectionCountdown = 0;
	
	
	float tempwidth;
	
	Gamestate State = Gamestate.CharacterSelect;
	
	private boolean mTranslucentBackground;
	boolean TextureLoaded = false;
	FightView CurrentFight = new FightView(Selected, ESelected);
	
	
    public RendererView(boolean useTranslucentBackground, GLSurfaceView view) 
    {	
    	
    	MyView = view;
    	
    	mTranslucentBackground = useTranslucentBackground;	
    	
    	RagnarTexture =BitmapFactory.decodeResource(view.getResources(),R.drawable.ragnar);
    	JoannaTexture =BitmapFactory.decodeResource(view.getResources(),R.drawable.joanna);
    	LuchadorTexture =BitmapFactory.decodeResource(view.getResources(),R.drawable.luchador);
    	LilHoodTexture =BitmapFactory.decodeResource(view.getResources(),R.drawable.lilhood);
    	CurrieTexture =BitmapFactory.decodeResource(view.getResources(),R.drawable.currie);
    	PhaTexture =BitmapFactory.decodeResource(view.getResources(),R.drawable.phatext);
    	StageOneTexture =BitmapFactory.decodeResource(view.getResources(),R.drawable.stageone);
    	AButton =BitmapFactory.decodeResource(view.getResources(),R.drawable.abut);
    	BButton =BitmapFactory.decodeResource(view.getResources(),R.drawable.bbut);
    	DPad =BitmapFactory.decodeResource(view.getResources(),R.drawable.dpad);
    	Health =BitmapFactory.decodeResource(view.getResources(),R.drawable.colour);
    	
    	CharSelA =BitmapFactory.decodeResource(view.getResources(),R.drawable.charsela);
    	CharSelB =BitmapFactory.decodeResource(view.getResources(),R.drawable.charselb);
    	
    	
    	ABut = new Button(800-80, 80f, 70f, 70f);
    	BBut = new Button(800, 80f, 70f, 70f);
    	DPadBut = new Dpad(110f, 110f, 100f, 100f);
    	
    	Player = new HealthBar(10, 470, 300, 40);
    	Enemy = new HealthBar(790, 470, 300, 40);
    }
    

	
	public void onDrawFrame(GL10 gl) {
		gl.glClearColor(0.0f,0.5f,0.5f,1.0f);
        gl.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);

        gl.glMatrixMode(GL11.GL_MODELVIEW);

        gl.glEnableClientState(GL11.GL_VERTEX_ARRAY);
        gl.glEnableClientState(GL11.GL_COLOR_ARRAY);
        gl.glEnableClientState(GL10.GL_TEXTURE_COORD_ARRAY);
        gl.glEnable(GL10.GL_TEXTURE_2D);
        //these two lines fix transparency hiding objects behind it, by forcing the program not to draw pixels with alpha values below 0.1f
        gl.glAlphaFunc(gl.GL_GREATER, 0.1f);		//IMPORTANT
        gl.glEnable(gl.GL_ALPHA_TEST);				//IMPORTANT
        
        if (TextureLoaded == false){
        	
        	ragnarattacka.SetupBuffers();
        	ragnarattacka.TextureSetup(gl, RagnarTexture);
        	ragnarattackb.SetupBuffers();
        	ragnarattackb.TextureSetup(gl, RagnarTexture);
        	ragnarattackc.SetupBuffers();
        	ragnarattackc.TextureSetup(gl, RagnarTexture);
        	ragnarattackd.SetupBuffers();
        	ragnarattackd.TextureSetup(gl, RagnarTexture);
        	ragnarattacke.SetupBuffers();
        	ragnarattacke.TextureSetup(gl, RagnarTexture);
        	ragnarattackf.SetupBuffers();
        	ragnarattackf.TextureSetup(gl, RagnarTexture);       	
        	ragnarblocka.SetupBuffers();
        	ragnarblocka.TextureSetup(gl, RagnarTexture);
        	ragnarblockb.SetupBuffers();
        	ragnarblockb.TextureSetup(gl, RagnarTexture);
        	ragnarblockc.SetupBuffers();
        	ragnarblockc.TextureSetup(gl, RagnarTexture);
        	ragnarblockd.SetupBuffers();
        	ragnarblockd.TextureSetup(gl, RagnarTexture);
        	ragnarblocke.SetupBuffers();
        	ragnarblocke.TextureSetup(gl, RagnarTexture);
        	ragnarblockf.SetupBuffers();
        	ragnarblockf.TextureSetup(gl, RagnarTexture);
        	ragnardeatha.SetupBuffers();
        	ragnardeatha.TextureSetup(gl, RagnarTexture);
        	ragnardeathb.SetupBuffers();
        	ragnardeathb.TextureSetup(gl, RagnarTexture);
        	ragnardeathc.SetupBuffers();
        	ragnardeathc.TextureSetup(gl, RagnarTexture);
        	ragnardeathd.SetupBuffers();
        	ragnardeathd.TextureSetup(gl, RagnarTexture);
        	ragnardeathe.SetupBuffers();
        	ragnardeathe.TextureSetup(gl, RagnarTexture);
        	ragnardeathf.SetupBuffers();
        	ragnardeathf.TextureSetup(gl, RagnarTexture);
        	ragnarwalka.SetupBuffers();
        	ragnarwalka.TextureSetup(gl, RagnarTexture);
        	ragnarwalkb.SetupBuffers();
        	ragnarwalkb.TextureSetup(gl, RagnarTexture);
        	ragnarwalkc.SetupBuffers();
        	ragnarwalkc.TextureSetup(gl, RagnarTexture);
        	ragnarwalkd.SetupBuffers();
        	ragnarwalkd.TextureSetup(gl, RagnarTexture);
        	ragnarwalke.SetupBuffers();
        	ragnarwalke.TextureSetup(gl, RagnarTexture);
        	ragnarwalkf.SetupBuffers();
        	ragnarwalkf.TextureSetup(gl, RagnarTexture);
        	ragnarhit.SetupBuffers();
        	ragnarhit.TextureSetup(gl, RagnarTexture);
        	ragnaridlea.SetupBuffers();
        	ragnaridlea.TextureSetup(gl, RagnarTexture);
        	ragnaridleb.SetupBuffers();
        	ragnaridleb.TextureSetup(gl, RagnarTexture);
        	
        	luchador.SetupBuffers();
        	luchador.TextureSetup(gl, LuchadorTexture);
        	luchwalka.SetupBuffers();
        	luchwalka.TextureSetup(gl, LuchadorTexture);
        	luchwalkb.SetupBuffers();
        	luchwalkb.TextureSetup(gl, LuchadorTexture);
        	luchwalkc.SetupBuffers();
        	luchwalkc.TextureSetup(gl, LuchadorTexture);
        	luchwalkd.SetupBuffers();
        	luchwalkd.TextureSetup(gl, LuchadorTexture);
        	luchwalke.SetupBuffers();
        	luchwalke.TextureSetup(gl, LuchadorTexture);
        	luchwalkf.SetupBuffers();
        	luchwalkf.TextureSetup(gl, LuchadorTexture);
        	luchblocka.SetupBuffers();
        	luchblocka.TextureSetup(gl, LuchadorTexture);
        	luchblockb.SetupBuffers();
        	luchblockb.TextureSetup(gl, LuchadorTexture);
        	luchblockc.SetupBuffers();
        	luchblockc.TextureSetup(gl, LuchadorTexture);
        	luchblockd.SetupBuffers();
        	luchblockd.TextureSetup(gl, LuchadorTexture);
        	luchblocke.SetupBuffers();
        	luchblocke.TextureSetup(gl, LuchadorTexture);
        	luchblockf.SetupBuffers();
        	luchblockf.TextureSetup(gl, LuchadorTexture);
        	luchattacka.SetupBuffers();
        	luchattacka.TextureSetup(gl, LuchadorTexture);
        	luchattackb.SetupBuffers();
        	luchattackb.TextureSetup(gl, LuchadorTexture);
        	luchattackc.SetupBuffers();
        	luchattackc.TextureSetup(gl, LuchadorTexture);
        	luchattackd.SetupBuffers();
        	luchattackd.TextureSetup(gl, LuchadorTexture);
        	luchattacke.SetupBuffers();
        	luchattacke.TextureSetup(gl, LuchadorTexture);
        	luchattackf.SetupBuffers();
        	luchattackf.TextureSetup(gl, LuchadorTexture);
        	luchdeatha.SetupBuffers();
        	luchdeatha.TextureSetup(gl, LuchadorTexture);
        	luchdeathb.SetupBuffers();
        	luchdeathb.TextureSetup(gl, LuchadorTexture);
        	luchdeathc.SetupBuffers();
        	luchdeathc.TextureSetup(gl, LuchadorTexture);
        	luchdeathd.SetupBuffers();
        	luchdeathd.TextureSetup(gl, LuchadorTexture);
        	luchdeathe.SetupBuffers();
        	luchdeathe.TextureSetup(gl, LuchadorTexture);
        	luchdeathf.SetupBuffers();
        	luchdeathf.TextureSetup(gl, LuchadorTexture);
        	luchhurt.SetupBuffers();
        	luchhurt.TextureSetup(gl, LuchadorTexture);
        	luchidlea.SetupBuffers();
        	luchidlea.TextureSetup(gl, LuchadorTexture);
        	luchidleb.SetupBuffers();
        	luchidleb.TextureSetup(gl, LuchadorTexture);
        	

        	
        	
        	//joanna.SetupBuffers();
        	//joanna.TextureSetup(gl, JoannaTexture);
        	joannaruna.SetupBuffers();
        	joannaruna.TextureSetup(gl, JoannaTexture);
        	joannarunb.SetupBuffers();
        	joannarunb.TextureSetup(gl, JoannaTexture);
        	joannarunc.SetupBuffers();
        	joannarunc.TextureSetup(gl, JoannaTexture);
        	joannarund.SetupBuffers();
        	joannarund.TextureSetup(gl, JoannaTexture);
        	joannarune.SetupBuffers();
        	joannarune.TextureSetup(gl, JoannaTexture);
        	joannarunf.SetupBuffers();
        	joannarunf.TextureSetup(gl, JoannaTexture);
        	joannaidlea.SetupBuffers();
        	joannaidlea.TextureSetup(gl, JoannaTexture);
        	joannaidleb.SetupBuffers();
        	joannaidleb.TextureSetup(gl, JoannaTexture);
        	joannaattacka.SetupBuffers();
        	joannaattacka.TextureSetup(gl, JoannaTexture);
        	joannaattackb.SetupBuffers();
        	joannaattackb.TextureSetup(gl, JoannaTexture);
        	joannaattackc.SetupBuffers();
        	joannaattackc.TextureSetup(gl, JoannaTexture);
        	joannaattackd.SetupBuffers();
        	joannaattackd.TextureSetup(gl, JoannaTexture);
        	joannaattacke.SetupBuffers();
        	joannaattacke.TextureSetup(gl, JoannaTexture);
        	joannaattackf.SetupBuffers();
        	joannaattackf.TextureSetup(gl, JoannaTexture);
        	joannablocka.SetupBuffers();
        	joannablocka.TextureSetup(gl, JoannaTexture);
        	joannablockb.SetupBuffers();
        	joannablockb.TextureSetup(gl, JoannaTexture);
        	joannablockc.SetupBuffers();
        	joannablockc.TextureSetup(gl, JoannaTexture);
        	joannablockd.SetupBuffers();
        	joannablockd.TextureSetup(gl, JoannaTexture);
        	joannablocke.SetupBuffers();
        	joannablocke.TextureSetup(gl, JoannaTexture);
        	joannablockf.SetupBuffers();
        	joannablockf.TextureSetup(gl, JoannaTexture);
        	joannadeatha.SetupBuffers();
        	joannadeatha.TextureSetup(gl, JoannaTexture);
        	joannadeathb.SetupBuffers();
        	joannadeathb.TextureSetup(gl, JoannaTexture);
        	joannadeathc.SetupBuffers();
        	joannadeathc.TextureSetup(gl, JoannaTexture);
        	joannadeathd.SetupBuffers();
        	joannadeathd.TextureSetup(gl, JoannaTexture);
        	joannadeathe.SetupBuffers();
        	joannadeathe.TextureSetup(gl, JoannaTexture);
        	joannadeathf.SetupBuffers();
        	joannadeathf.TextureSetup(gl, JoannaTexture);
        	joannahit.SetupBuffers();
        	joannahit.TextureSetup(gl, JoannaTexture);
        	
        	
        	lilhood.SetupBuffers();
        	lilhood.TextureSetup(gl, LilHoodTexture);
        	lilhoodwalka.SetupBuffers();
        	lilhoodwalka.TextureSetup(gl, LilHoodTexture);
        	lilhoodwalkb.SetupBuffers();
        	lilhoodwalkb.TextureSetup(gl, LilHoodTexture);
        	lilhoodwalkc.SetupBuffers();
        	lilhoodwalkc.TextureSetup(gl, LilHoodTexture);
        	lilhoodwalkd.SetupBuffers();
        	lilhoodwalkd.TextureSetup(gl, LilHoodTexture);
        	lilhoodwalke.SetupBuffers();
        	lilhoodwalke.TextureSetup(gl, LilHoodTexture);
        	lilhoodwalkf.SetupBuffers();
        	lilhoodwalkf.TextureSetup(gl, LilHoodTexture);
        	lilhoodblocka.SetupBuffers();
        	lilhoodblocka.TextureSetup(gl, LilHoodTexture);
        	lilhoodblockb.SetupBuffers();
        	lilhoodblockb.TextureSetup(gl, LilHoodTexture);
        	lilhoodblockc.SetupBuffers();
        	lilhoodblockc.TextureSetup(gl, LilHoodTexture);
        	lilhoodblockd.SetupBuffers();
        	lilhoodblockd.TextureSetup(gl, LilHoodTexture);
        	lilhoodblocke.SetupBuffers();
        	lilhoodblocke.TextureSetup(gl, LilHoodTexture);
        	lilhoodblockf.SetupBuffers();
        	lilhoodblockf.TextureSetup(gl, LilHoodTexture);
        	lilhoodattacka.SetupBuffers();
        	lilhoodattacka.TextureSetup(gl, LilHoodTexture);
        	lilhoodattackb.SetupBuffers();
        	lilhoodattackb.TextureSetup(gl, LilHoodTexture);
        	lilhoodattackc.SetupBuffers();
        	lilhoodattackc.TextureSetup(gl, LilHoodTexture);
        	lilhoodattackd.SetupBuffers();
        	lilhoodattackd.TextureSetup(gl, LilHoodTexture);
        	lilhoodattacke.SetupBuffers();
        	lilhoodattacke.TextureSetup(gl, LilHoodTexture);
        	lilhoodattackf.SetupBuffers();
        	lilhoodattackf.TextureSetup(gl, LilHoodTexture);
        	lilhooddeatha.SetupBuffers();
        	lilhooddeatha.TextureSetup(gl, LilHoodTexture);
        	lilhooddeathb.SetupBuffers();
        	lilhooddeathb.TextureSetup(gl, LilHoodTexture);
        	lilhooddeathc.SetupBuffers();
        	lilhooddeathc.TextureSetup(gl, LilHoodTexture);
        	lilhooddeathd.SetupBuffers();
        	lilhooddeathd.TextureSetup(gl, LilHoodTexture);
        	lilhooddeathe.SetupBuffers();
        	lilhooddeathe.TextureSetup(gl, LilHoodTexture);
        	lilhooddeathf.SetupBuffers();
        	lilhooddeathf.TextureSetup(gl, LilHoodTexture);
        	lilhoodhurt.SetupBuffers();
        	lilhoodhurt.TextureSetup(gl, LilHoodTexture);
        	lilhoodidlea.SetupBuffers();
        	lilhoodidlea.TextureSetup(gl, LilHoodTexture);
        	lilhoodidleb.SetupBuffers();
        	lilhoodidleb.TextureSetup(gl, LilHoodTexture);
        	
        	CurrieAttacka.SetupBuffers();
        	CurrieAttacka.TextureSetup(gl, CurrieTexture);
        	CurrieAttackb.SetupBuffers();
        	CurrieAttackb.TextureSetup(gl, CurrieTexture);
        	CurrieAttackc.SetupBuffers();
        	CurrieAttackc.TextureSetup(gl, CurrieTexture);
        	CurrieAttackd.SetupBuffers();
        	CurrieAttackd.TextureSetup(gl, CurrieTexture);
        	CurrieAttacke.SetupBuffers();
        	CurrieAttacke.TextureSetup(gl, CurrieTexture);
        	CurrieAttackf.SetupBuffers();
        	CurrieAttackf.TextureSetup(gl, CurrieTexture);
        	CurrieIdlea.SetupBuffers();
        	CurrieIdlea.TextureSetup(gl, CurrieTexture);
        	CurrieIdleb.SetupBuffers();
        	CurrieIdleb.TextureSetup(gl, CurrieTexture);
        	CurrieWalka.SetupBuffers();
        	CurrieWalka.TextureSetup(gl, CurrieTexture);
        	CurrieWalkb.SetupBuffers();
        	CurrieWalkb.TextureSetup(gl, CurrieTexture);
        	CurrieWalkc.SetupBuffers();
        	CurrieWalkc.TextureSetup(gl, CurrieTexture);
        	CurrieWalkd.SetupBuffers();
        	CurrieWalkd.TextureSetup(gl, CurrieTexture);
        	CurrieWalke.SetupBuffers();
        	CurrieWalke.TextureSetup(gl, CurrieTexture);
        	CurrieWalkf.SetupBuffers();
        	CurrieWalkf.TextureSetup(gl, CurrieTexture);
        	CurrieDeatha.SetupBuffers();
        	CurrieDeatha.TextureSetup(gl, CurrieTexture);
        	CurrieDeathb.SetupBuffers();
        	CurrieDeathb.TextureSetup(gl, CurrieTexture);
        	CurrieDeathc.SetupBuffers();
        	CurrieDeathc.TextureSetup(gl, CurrieTexture);
        	CurrieDeathd.SetupBuffers();
        	CurrieDeathd.TextureSetup(gl, CurrieTexture);
        	CurrieDeathe.SetupBuffers();
        	CurrieDeathe.TextureSetup(gl, CurrieTexture);
        	CurrieDeathf.SetupBuffers();
        	CurrieDeathf.TextureSetup(gl, CurrieTexture);
        	CurrieBlocka.SetupBuffers();
        	CurrieBlocka.TextureSetup(gl, CurrieTexture);
        	CurrieBlockb.SetupBuffers();
        	CurrieBlockb.TextureSetup(gl, CurrieTexture);
        	CurrieBlockc.SetupBuffers();
        	CurrieBlockc.TextureSetup(gl, CurrieTexture);
        	CurrieBlockd.SetupBuffers();
        	CurrieBlockd.TextureSetup(gl, CurrieTexture);
        	CurrieBlocke.SetupBuffers();
        	CurrieBlocke.TextureSetup(gl, CurrieTexture);
        	CurrieBlockf.SetupBuffers();
        	CurrieBlockf.TextureSetup(gl, CurrieTexture);
        	CurrieHurt.SetupBuffers();
        	CurrieHurt.TextureSetup(gl, CurrieTexture);
        	
        	
        	phawalka.SetupBuffers();
        	phawalka.TextureSetup(gl, PhaTexture);
        	phawalkb.SetupBuffers();
        	phawalkb.TextureSetup(gl, PhaTexture);
        	phawalkc.SetupBuffers();
        	phawalkc.TextureSetup(gl, PhaTexture);
        	phawalkd.SetupBuffers();
        	phawalkd.TextureSetup(gl, PhaTexture);
        	phawalke.SetupBuffers();
        	phawalke.TextureSetup(gl, PhaTexture);
        	phawalkf.SetupBuffers();
        	phawalkf.TextureSetup(gl, PhaTexture);
        	phablocka.SetupBuffers();
        	phablocka.TextureSetup(gl, PhaTexture);
        	phablockb.SetupBuffers();
        	phablockb.TextureSetup(gl, PhaTexture);
        	phablockc.SetupBuffers();
        	phablockc.TextureSetup(gl, PhaTexture);
        	phablockd.SetupBuffers();
        	phablockd.TextureSetup(gl, PhaTexture);
        	phablocke.SetupBuffers();
        	phablocke.TextureSetup(gl, PhaTexture);
        	phablockf.SetupBuffers();
        	phablockf.TextureSetup(gl, PhaTexture);
        	phaattacka.SetupBuffers();
        	phaattacka.TextureSetup(gl, PhaTexture);
        	phaattackb.SetupBuffers();
        	phaattackb.TextureSetup(gl, PhaTexture);
        	phaattackc.SetupBuffers();
        	phaattackc.TextureSetup(gl, PhaTexture);
        	phaattackd.SetupBuffers();
        	phaattackd.TextureSetup(gl, PhaTexture);
        	phaattacke.SetupBuffers();
        	phaattacke.TextureSetup(gl, PhaTexture);
        	phaattackf.SetupBuffers();
        	phaattackf.TextureSetup(gl, PhaTexture);
        	phadeatha.SetupBuffers();
        	phadeatha.TextureSetup(gl, PhaTexture);
        	phadeathb.SetupBuffers();
        	phadeathb.TextureSetup(gl, PhaTexture);
        	phadeathc.SetupBuffers();
        	phadeathc.TextureSetup(gl, PhaTexture);
        	phadeathd.SetupBuffers();
        	phadeathd.TextureSetup(gl, PhaTexture);
        	phadeathe.SetupBuffers();
        	phadeathe.TextureSetup(gl, PhaTexture);
        	phadeathf.SetupBuffers();
        	phadeathf.TextureSetup(gl, PhaTexture);
        	phahurt.SetupBuffers();
        	phahurt.TextureSetup(gl, PhaTexture);
        	phaidlea.SetupBuffers();
        	phaidlea.TextureSetup(gl, PhaTexture);
        	phaidleb.SetupBuffers();
        	phaidleb.TextureSetup(gl, PhaTexture);
        	
        	
        	stage.SetupBuffers();
        	stage.TextureSetup(gl, StageOneTexture);
        	
        	ABut.TextureSetup(gl, AButton);
        	BBut.TextureSetup(gl, BButton);
        	DPadBut.TextureSetup(gl, DPad);
        	Player.TextureSetup(gl, Health);
        	Enemy.TextureSetup(gl, Health);
        	
        	CrSlA.TextureSetup(gl, CharSelA);
        	CrSlB.TextureSetup(gl, CharSelB);
        	
        	TextureLoaded = true;
        }
       
        if (State == Gamestate.Fight){
        	
        if (CurrentFight.GetReset() == true){
        	State = Gamestate.CharacterSelect;
        	ESelected = Character.Ragnar;
        	Selected = Character.Joanna;
        	CurrentFight = new FightView(Selected, ESelected);
        	PlayerCharacter.reset();
        	EnemyCharacter.reset();   	
        }
        
        //UIClass.loopmusic();
        
        CurrentFight.Update();
        CurrentFight.DrawFightScene(gl);
        
        
        ABut.draw(gl);
        BBut.draw(gl);
        DPadBut.draw(gl);
        
        Player.Health(PlayerCharacter.health, 2);
        Enemy.Health(EnemyCharacter.health, 1);
        Player.draw(gl);
        Enemy.draw(gl);
        
        UIClass.SetA(ABut.CheckPress());
        UIClass.SetB(BBut.CheckPress());
        UIClass.SetDpad(DPadBut.CheckPress());
        }
        
        
        if (State == Gamestate.CharacterSelect){
        	
        	CrSlA.draw(gl);
        	
        	
        	if (UIClass.GetState() >0 && CharSelected == false){
    			if (UIClass.GetX() > 240 && UIClass.GetX() < 240 + 107){
    				if (UIClass.GetY() > 83 && UIClass.GetY() < 83 + 107){
    					
    					Selected = Character.LilRedRidingHood;
    					
    				}
    			}
    			
    			if (UIClass.GetX() > 240 && UIClass.GetX() < 240 + 107){
    				if (UIClass.GetY() > 190 && UIClass.GetY() < 190 + 107){
    					
    					Selected = Character.Luchador;
    					
    				}
    			}
    			
    			if (UIClass.GetX() > 240 && UIClass.GetX() < 240 + 107){
    				if (UIClass.GetY() > 297 && UIClass.GetY() < 297 + 107){
    					
    					Selected = Character.Pharaoh;
    					
    				}
    			}
    			
    			
    			if (UIClass.GetX() > 453 && UIClass.GetX() < 453 + 107){
    				if (UIClass.GetY() > 83 && UIClass.GetY() < 83 + 107){
    					
    					Selected = Character.Ragnar;
    					
    				}
    			}
    			
    			if (UIClass.GetX() > 453 && UIClass.GetX() < 453 + 107){
    				if (UIClass.GetY() > 190 && UIClass.GetY() < 190 + 107){
    					
    					Selected = Character.Joanna;
    					
    				}
    			}
    			
    			if (UIClass.GetX() > 453 && UIClass.GetX() < 453 + 107){
    				if (UIClass.GetY() > 297 && UIClass.GetY() < 297 + 107){
    					
    					Selected = Character.Granny;
    					
    				}
    			}
    			
    			
    			
    			if (UIClass.GetX() > 348 && UIClass.GetX() < 348 + 107){
    				if (UIClass.GetY() > 83 && UIClass.GetY() < 83 + 107){
    					
    					temp = Rnd.nextInt(6);
    					if (temp == 0){
    						Selected = Character.Granny;
    					}
    					if (temp == 1){
    						Selected = Character.Joanna;
    					}
    					if (temp == 2){
    						Selected = Character.Ragnar;
    					}
    					if (temp == 3){
    						Selected = Character.Luchador;
    					}
    					if (temp == 4){
    						Selected = Character.Pharaoh;
    					}
    					if (temp == 5){
    						Selected = Character.LilRedRidingHood;
    					}
    					
    					
    				}
    			}
    			
    			
    			
    			if (UIClass.GetX() > 348 && UIClass.GetX() < 348 + 107){
    				if (UIClass.GetY() > 190 && UIClass.GetY() < 190 + 107){
    					
    					CharSelected = true;
    					
    				}
    			}
    			
    		}
        	
        	if (SelectionCountdown == 1){
        		
        		temp = Rnd.nextInt(6);
				if (temp == 0){
					ESelected = Character.Granny;
				}
				if (temp == 1){
					ESelected = Character.Joanna;
				}
				if (temp == 2){
					ESelected = Character.Ragnar;
				}
				if (temp == 3){
					ESelected = Character.Luchador;
				}
				if (temp == 4){
					ESelected = Character.Pharaoh;
				}
				if (temp == 5){
					ESelected = Character.LilRedRidingHood;
				}
        		
        	}
        	
        	if (CharSelected == true){
        		
        		SelectionCountdown ++;
        		
        	}
        	
        	
        	if (SelectionCountdown > 15){
        		
        		State = Gamestate.Fight;
        		SelectionCountdown = 0;
        		CharSelected = false;
        		
        		CurrentFight = new FightView(Selected, ESelected);
            	PlayerCharacter.reset();
            	EnemyCharacter.reset();
        		
        	}
        	
        	
        	timer ++;
        	if (timer > 1){
        		timer = 0;
        	}
        	
        	gl.glLoadIdentity();
			gl.glTranslatef(-3f, -1.5f, -15.0f);
			gl.glRotatef(45, 0.0f, 1.0f, 0.0f);
			gl.glScalef(0.2f, 0.2f, 0.2f);

			
			if (Selected == Character.Joanna){
				if (timer == 0){
					joannaidlea.draw(gl);
				}
				if (timer == 1){
					joannaidleb.draw(gl);
				}
			}
			if (Selected == Character.Luchador){
				if (timer == 0){
					luchidlea.draw(gl);
				}
				if (timer == 1){
					luchidleb.draw(gl);
				}
			}
			if (Selected == Character.Ragnar){
				if (timer == 0){
					ragnaridlea.draw(gl);
				}
				if (timer == 1){
					ragnaridleb.draw(gl);
				}
			}
			if (Selected == Character.LilRedRidingHood){
				if (timer == 0){
					lilhoodidlea.draw(gl);
				}
				if (timer == 1){
					lilhoodidleb.draw(gl);
				}
			}
			if (Selected == Character.Pharaoh){
				if (timer == 0){
					phaidlea.draw(gl);
				}
				if (timer == 1){
					phaidleb.draw(gl);
				}
			}
			if (Selected == Character.Granny){
				if (timer == 0){
					CurrieIdlea.draw(gl);
				}
				if (timer == 1){
					CurrieIdleb.draw(gl);
				}
			}
			
			gl.glLoadIdentity();
			gl.glTranslatef(3f, -1.5f, -15.0f);
			gl.glRotatef(-45, 0.0f, 1.0f, 0.0f);
			gl.glScalef(0.2f, 0.2f, 0.2f);

			
			if (ESelected == Character.Joanna){
				if (timer == 0){
					joannaidlea.draw(gl);
				}
				if (timer == 1){
					joannaidleb.draw(gl);
				}
			}
			if (ESelected == Character.Luchador){
				if (timer == 0){
					luchidlea.draw(gl);
				}
				if (timer == 1){
					luchidleb.draw(gl);
				}
			}
			if (ESelected == Character.Ragnar){
				if (timer == 0){
					ragnaridlea.draw(gl);
				}
				if (timer == 1){
					ragnaridleb.draw(gl);
				}
			}
			if (ESelected == Character.LilRedRidingHood){
				if (timer == 0){
					lilhoodidlea.draw(gl);
				}
				if (timer == 1){
					lilhoodidleb.draw(gl);
				}
			}
			if (ESelected == Character.Pharaoh){
				if (timer == 0){
					phaidlea.draw(gl);
				}
				if (timer == 1){
					phaidleb.draw(gl);
				}
			}
			if (ESelected == Character.Granny){
				if (timer == 0){
					CurrieIdlea.draw(gl);
				}
				if (timer == 1){
					CurrieIdleb.draw(gl);
				}
			}
			
			CrSlB.draw(gl);
        }
        
	}
	

	
	public void onSurfaceChanged(GL10 gl, int width, int height) {
		
		gl.glViewport(0, 0, width, height);
		
		UIClass.SetHeight(height);
		UIClass.SetWidth(width);

        float aspectRatio;
        float zNear =0.1f;
        float zFar =1000f;
        float fieldOfView = 30.0f/57.3f;                                                                       
        float size;
        	
        gl.glEnable(GL10.GL_NORMALIZE);
        	
        aspectRatio=(float)width/(float)height;                       
    	    	
        gl.glMatrixMode(GL10.GL_PROJECTION);                                  
        	
        size = zNear * (float)(Math.tan((double)(fieldOfView/2.0f)));   

        gl.glFrustumf(-size, size, -size /aspectRatio,                    
                               size /aspectRatio, zNear, zFar);
        	
        gl.glMatrixMode(GL10.GL_MODELVIEW);      
		
	}

	
	public void onSurfaceCreated(GL10 gl, EGLConfig config) {
		gl.glDisable(GL11.GL_DITHER);

        gl.glHint(GL11.GL_PERSPECTIVE_CORRECTION_HINT,GL11.GL_FASTEST);
        

        if (mTranslucentBackground) 
        {
             gl.glClearColor(1,0,0,0);
        } 
        else 
        {
             gl.glClearColor(1,1,1,1);
        }
        
        gl.glShadeModel(GL11.GL_SMOOTH);
        gl.glEnable(GL11.GL_DEPTH_TEST);
		
	}
    
    
}
    
