package com.example.jgfjhg;

import android.graphics.Canvas;
import android.media.MediaPlayer;

class UIClass {

	public static MediaPlayer mp;
	
	public static MediaPlayer Malemp;
	public static MediaPlayer Femalemp;
	
	
	private static float X;
	private static float Y;
	private static int State;
	private static float Width;
	private static float Height;
	private static Canvas canvas;
	private static boolean Abutton;
	private static boolean Bbutton;
	private static int Dpad;
	
	static void SetCanvas(Canvas canvasa){
		canvas = canvasa;
	}
	
	
	static void SetWidth(float x){
		if (x > 1){
		Width = x;
		}
	}
	
	static void SetHeight(float x){
		if (x > 1){
		Height = x;
		}
	}
	
	static void SetA(Boolean A){
		Abutton = A;
	}
	
	static void SetB(Boolean B){
		Bbutton = B;
	}
	
	static void SetDpad(int d){
		Dpad = d;
	}
	
	static void SetX(float x){
		X = x;
	}
	
	static void SetY(float y){
		Y = y;
	}
	
	static void SetState(int i){
		State = i;
	}
	
	static float GetHeight(){
		return Height;
	}
	
	static float GetWidth(){
		return Width;
	}
	
	
	static float GetX(){
		return X;
	}
	
	static float GetY(){
		return Y;
	}
	
	static Canvas GetCanvas(){
		return canvas;
	}
	
	
	static int GetState(){
		return State;
	}
	
	static boolean GetB(){
		return Bbutton;
	}
	
	static boolean GetA(){
		return Abutton;
	}
	
	static int GetDpad(){
		return Dpad;
	}
	
	public static void MalePainNoise(){
		
		Malemp.start();
		
	}
	
	public static void FemalePainNoise(){
		
		Femalemp.start();
			
	}

}
