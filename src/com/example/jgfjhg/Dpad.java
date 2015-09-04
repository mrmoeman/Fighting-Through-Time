package com.example.jgfjhg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;

import android.graphics.Bitmap;
import android.opengl.GLUtils;

public class Dpad {

	int[] textures = new int[1];
	Bitmap ModelTexture;
	float X;
	float Y;
	float Width;
	float Height;
	private FloatBuffer mFVertexBuffer;
	private FloatBuffer mFTextureBuffer;
	private ByteBuffer  mIndexBuffer;
	
	public Dpad(float x, float y, float wid, float hei){
		X = x;
		Y = y;
		Width = wid;
		Height = hei;
		
		float vertices[] = 
	        {
	            X, Y,
	            X - Width, Y,
	            X,  Y - Height,
	            X - Width,  Y - Height
	        }; 
		
		float Textures[] = 
	        {
	            1, 0,
	            0, 0,
	            1,  1,
	            0,  1
	        }; 
		
		byte indices[] = 
	        {
	            0, 3, 1,
	            0, 2, 3
	        };
		
		 ByteBuffer vbb = ByteBuffer.allocateDirect(vertices.length * 4);
	        vbb.order(ByteOrder.nativeOrder());
	        mFVertexBuffer = vbb.asFloatBuffer();
	        mFVertexBuffer.put(vertices);
	        mFVertexBuffer.position(0);
	        
	        ByteBuffer tbb = ByteBuffer.allocateDirect(Textures.length * 4);
	        tbb.order(ByteOrder.nativeOrder());
	        mFTextureBuffer = tbb.asFloatBuffer();
	        mFTextureBuffer.put(Textures);
	        mFTextureBuffer.position(0);
	        

	        mIndexBuffer = ByteBuffer.allocateDirect(indices.length);
	        mIndexBuffer.put(indices);
	        mIndexBuffer.position(0);
		
		
	}
	
	
	
	public void TextureSetup(GL10 gl, Bitmap Texture){
		ModelTexture = Texture;
		gl.glGenTextures(1, textures, 0);
		gl.glBindTexture(GL10.GL_TEXTURE_2D, textures[0]);
		gl.glTexParameterf(GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_MIN_FILTER, GL10.GL_NEAREST);
		gl.glTexParameterf(GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_MAG_FILTER, GL10.GL_LINEAR);
		GLUtils.texImage2D(GL10.GL_TEXTURE_2D, 0, ModelTexture, 0);
		ModelTexture.recycle();
	}
	
	
	public int CheckPress(){
		if (UIClass.GetState() >0){
			if (UIClass.GetX() >X - Width && UIClass.GetX() <X){
				if (480 - UIClass.GetY() >Y - Height && 480 - UIClass.GetY() <Y){
					
					if (Angle() < 45){
						return 1; // up
					}
					if (Angle() > 135){
						return 4; // down
					}
					if (Angle() < 135 && Angle() > 45){
						if (UIClass.GetX() > X-Width/2){
							return 3; // right
						}
						if (UIClass.GetX() < X-Width/2){
							return 2; // left
						}
					}
					
					
				}
			}
		}
		return 0;
	}
	
	private double Angle(){
		
		//A(x - width/2 , y - height / 2  )  - centre
		//B(x - width/2 , y) - top point
		//C( UICLASS.GETX() , 480-UICLASS.GETY() ) - click point
		// BC^2 = AB^2 + AC^2 - 2 AB * AC cosA
		//cosA = (A^2 - B^2 - C^2) / -2BC
		
		double AB =  Math.sqrt(0 + ((Height/2) * (Height/2)) );  
		double BC =  Math.sqrt( (     ((UIClass.GetX()) - (X - Width/2))   *  ((UIClass.GetX()) - (X - Width/2)))    + (  ((480 - UIClass.GetY()) -  Y)  *((480 - UIClass.GetY()) - Y) ));
		double AC =  Math.sqrt((((UIClass.GetX()) - (X - Width/2))*((UIClass.GetX()) - (X - Width/2))) + (((480 - UIClass.GetY()) - (Y - Height / 2))*((480 - UIClass.GetY()) - (Y - Height / 2))));
		
		float cos = (float) (((BC * BC) - (AB * AB) - (AC * AC)) / (-2 * AB * AC)) ;
		
		float ang = (float) Math.toDegrees(Math.acos(cos));
		
		return ang;
	}
	
	
	
	public void draw(GL10 gl)
    {
		switchToOrtho(gl);
		
		gl.glDisable(gl.GL_DEPTH_TEST);
		gl.glEnable(gl.GL_ALPHA_TEST);
		gl.glBindTexture(GL10.GL_TEXTURE_2D, textures[0]);
        gl.glFrontFace(GL11.GL_CW);
        gl.glTexCoordPointer(2, GL10.GL_FLOAT, 0, mFTextureBuffer);
        gl.glVertexPointer(2, GL11.GL_FLOAT, 0, mFVertexBuffer);
        gl.glDrawElements(GL11.GL_TRIANGLES, 6, GL11.GL_UNSIGNED_BYTE, mIndexBuffer);
        gl.glFrontFace(GL11.GL_CCW);
        gl.glEnable(gl.GL_DEPTH_TEST);
        
        switchBackToFrustum(gl);
    }
	
	public void switchToOrtho(GL10 gl) {
		gl.glDisable(gl.GL_DEPTH_TEST);
		gl.glMatrixMode(gl.GL_PROJECTION);
		gl.glPushMatrix();
		gl.glLoadIdentity();
		gl.glOrthof(0, UIClass.GetWidth(), 0, UIClass.GetHeight(), -5, 1);           
		gl.glMatrixMode(gl.GL_MODELVIEW);    
		gl.glLoadIdentity();
	}

	public void switchBackToFrustum(GL10 gl) {
		gl.glEnable(gl.GL_DEPTH_TEST);
		gl.glMatrixMode(gl.GL_PROJECTION);
		gl.glPopMatrix();
		gl.glMatrixMode(gl.GL_MODELVIEW);
	}

}
