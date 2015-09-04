package com.example.jgfjhg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;
import android.graphics.Bitmap;
import android.opengl.GLUtils;

class stage {

static String TextureName = "jostage.mtl";

static int Vertices = 48;

static int VertTexts = 48;

static int Normals = 48;

static int Faces = 24;

static int FacesB = 0;

static int SmoothGroups = 12;

static float VertArray[] = new float[]{
 -65.126930f, 0.000001f, -24.172894f,
 -65.126930f, -0.000000f, 18.352055f,
 65.126930f, 0.000001f, -24.172894f,
 65.126930f, -0.000000f, 18.352055f,
 -73.199242f, -14.334480f, -20.368340f,
 -73.199242f, 11.834661f, -20.368340f,
 73.199242f, -14.334480f, -20.368340f,
 73.199242f, 11.834661f, -20.368340f,
 -77.715614f, -3.274532f, -23.198463f,
 -77.715614f, 22.894609f, -23.198463f,
 77.335434f, -3.274532f, -23.198463f,
 77.335434f, 22.894609f, -23.198463f,
 -81.850830f, 9.833097f, -27.290499f,
 -81.850830f, 36.002239f, -27.290499f,
 81.842392f, 9.833097f, -27.290499f,
 81.842392f, 36.002239f, -27.290499f,
 87.537498f, 18.253307f, -32.947403f,
 87.537498f, 44.422451f, -32.947403f,
 -88.101883f, 18.253307f, -32.947403f,
 -88.101883f, 44.422451f, -32.947403f,
 -102.514099f, -8.285431f, -41.657768f,
 -102.514099f, 53.731033f, -41.657768f,
 101.949722f, -8.285431f, -41.657768f,
 101.949722f, 53.731033f, -41.657768f,
 -36.804447f, -1.443058f, 17.565376f,
 -36.804447f, 5.443057f, 17.565376f,
 -27.732845f, -1.443058f, 17.565376f,
 -27.732845f, 5.443057f, 17.565376f,
 -55.135456f, -1.443058f, 17.565376f,
 -55.135456f, 5.443057f, 17.565376f,
 -46.063850f, -1.443058f, 17.565376f,
 -46.063850f, 5.443057f, 17.565376f,
 15.611502f, -1.443058f, 17.565376f,
 15.611502f, 5.443057f, 17.565376f,
 24.683105f, -1.443058f, 17.565376f,
 24.683105f, 5.443057f, 17.565376f,
 41.041473f, -0.861345f, 17.565376f,
 41.041473f, 4.140890f, 17.565376f,
 50.113075f, -0.861345f, 17.565376f,
 50.113075f, 4.140890f, 17.565376f,
 -30.984386f, 60.769291f, -40.096081f,
 -64.665573f, 60.769291f, -40.096081f,
 -30.984386f, 19.899811f, -40.096081f,
 -64.665573f, 19.899811f, -40.096081f,
 56.192917f, 57.774868f, -31.761742f,
 25.394718f, 57.774868f, -31.761742f,
 56.192917f, 17.180359f, -31.761742f,
 25.394718f, 17.180359f, -31.761742f,};

static float VertArrayB[] = new float[]{};

static float[] TextArray = new float[]{
 0.847505f, 0.000000f,
 0.847505f, 0.079468f,
 0.006964f, 0.000000f,
 0.006964f, 0.079468f,
 0.845758f, 0.088873f,
 0.845758f, 0.263736f,
 0.006964f, 0.088873f,
 0.006964f, 0.263736f,
 0.844631f, 0.276966f,
 0.844631f, 0.454210f,
 0.006964f, 0.276966f,
 0.006964f, 0.454210f,
 0.844518f, 0.466446f,
 0.844518f, 0.730053f,
 0.006964f, 0.466446f,
 0.006964f, 0.730053f,
 0.845649f, 0.737167f,
 0.845649f, 0.998731f,
 0.006964f, 0.737167f,
 0.006964f, 0.998731f,
 0.996691f, 0.517248f,
 0.996691f, 1.000000f,
 0.854735f, 0.517248f,
 0.854735f, 1.000000f,
 0.925691f, 0.210899f,
 0.925691f, 0.257722f,
 0.867761f, 0.210899f,
 0.867761f, 0.257722f,
 0.991543f, 0.210899f,
 0.991543f, 0.243777f,
 0.950780f, 0.210899f,
 0.950780f, 0.243777f,
 0.930340f, 0.269285f,
 0.930340f, 0.320889f,
 0.855511f, 0.269285f,
 0.855511f, 0.320889f,
 1.000000f, 0.272581f,
 1.000000f, 0.315910f,
 0.934720f, 0.272581f,
 0.934720f, 0.315910f,
 0.849497f, 0.196520f,
 0.998825f, 0.196520f,
 0.849497f, 0.002222f,
 0.998825f, 0.002222f,
 0.849685f, 0.332310f,
 0.998223f, 0.332310f,
 0.849685f, 0.512762f,
 0.998223f, 0.512762f,};

static float[] TextArrayB = new float[]{};

static float[][] NormArray = new float[][]{
{ 0.000000f, 1.000000f, 0.000000f},
{ 0.000000f, 1.000000f, 0.000000f},
{ 0.000000f, 1.000000f, 0.000000f},
{ 0.000000f, 1.000000f, 0.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, 1.000000f},
{ 0.000000f, 0.000000f, 1.000000f},
{ 0.000000f, 0.000000f, 1.000000f},
{ 0.000000f, 0.000000f, 1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f},
{ 0.000000f, 0.000000f, -1.000000f}};

static int[] FaceArray = new int[]{
0, 1, 2,
2, 1, 3,
4, 5, 6,
6, 5, 7,
8, 9, 10,
10, 9, 11,
12, 13, 14,
14, 13, 15,
16, 17, 18,
18, 17, 19,
20, 21, 22,
22, 21, 23,
24, 25, 26,
26, 25, 27,
28, 29, 30,
30, 29, 31,
32, 33, 34,
34, 33, 35,
36, 37, 38,
38, 37, 39,
40, 42, 41,
41, 42, 43,
44, 46, 45,
45, 46, 47, };

static int[] FaceArrayB = new int[]{};

static int[] textures = new int[1];
static Bitmap ModelTexture;
private static FloatBuffer mFVertexBuffer;
private static FloatBuffer mFTextureBuffer;
private static ByteBuffer  mModel;

private static FloatBuffer mFVertexBufferB;
private static FloatBuffer mFTextureBufferB;
private static ByteBuffer  mModelB;

public static void SetupBuffers(){
byte tModel[] = new byte[FaceArray.length]; 	
for (int i = 0; i < FaceArray.length; i++){
tModel[i] = (byte) (FaceArray[i]);
}
 for (int i = 0; i < TextArray.length; i+= 2){
TextArray[i+1] = TextArray[i+1] * -1;
}
byte tModelB[] = new byte[FaceArrayB.length]; 	
for (int i = 0; i < FaceArrayB.length; i++){
tModelB[i] = (byte) (FaceArrayB[i]);
}
 for (int i = 0; i < TextArrayB.length; i+= 2){
TextArrayB[i+1] = TextArrayB[i+1] * -1;
}
ByteBuffer vbb = ByteBuffer.allocateDirect(VertArray.length * 4);
vbb.order(ByteOrder.nativeOrder());
mFVertexBuffer = vbb.asFloatBuffer();
mFVertexBuffer.put(VertArray);
mFVertexBuffer.position(0);
ByteBuffer tbb = ByteBuffer.allocateDirect(TextArray.length * 4);
tbb.order(ByteOrder.nativeOrder());
mFTextureBuffer = tbb.asFloatBuffer();
mFTextureBuffer.put(TextArray);
mFTextureBuffer.position(0);
mModel = ByteBuffer.allocateDirect(FaceArray.length);
mModel.put(tModel);
mModel.position(0);
Faces = FaceArray.length;
VertArray = null;
TextArray = null;
FaceArray = null;
ByteBuffer vBbb = ByteBuffer.allocateDirect(VertArrayB.length * 4);
vBbb.order(ByteOrder.nativeOrder());
mFVertexBufferB = vBbb.asFloatBuffer();
mFVertexBufferB.put(VertArrayB);
mFVertexBufferB.position(0);
ByteBuffer tBbb = ByteBuffer.allocateDirect(TextArrayB.length * 4);
tBbb.order(ByteOrder.nativeOrder());
mFTextureBufferB = tBbb.asFloatBuffer();
mFTextureBufferB.put(TextArrayB);
mFTextureBufferB.position(0);
mModelB = ByteBuffer.allocateDirect(FaceArrayB.length);
mModelB.put(tModelB);
mModelB.position(0);
FacesB = FaceArrayB.length;
VertArrayB = null;
TextArrayB = null;
FaceArrayB = null;
}

public static void TextureSetup(GL10 gl, Bitmap Texture){
ModelTexture = Texture;
gl.glGenTextures(1, textures, 0);
gl.glBindTexture(GL10.GL_TEXTURE_2D, textures[0]);
gl.glTexParameterf(GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_MIN_FILTER, GL10.GL_NEAREST);
gl.glTexParameterf(GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_MAG_FILTER, GL10.GL_LINEAR);
GLUtils.texImage2D(GL10.GL_TEXTURE_2D, 0, ModelTexture, 0);
ModelTexture.recycle();
}

public static void draw(GL10 gl){
gl.glAlphaFunc(gl.GL_GREATER, 0.1f);
gl.glEnable(gl.GL_ALPHA_TEST);
gl.glBindTexture(GL10.GL_TEXTURE_2D, textures[0]);
gl.glVertexPointer(3, GL11.GL_FLOAT, 0, mFVertexBuffer);
gl.glTexCoordPointer(2, GL10.GL_FLOAT, 0, mFTextureBuffer);
gl.glDrawElements( gl.GL_TRIANGLES, Faces, gl.GL_UNSIGNED_BYTE, mModel);
gl.glVertexPointer(3, GL11.GL_FLOAT, 0, mFVertexBufferB);
gl.glTexCoordPointer(2, GL10.GL_FLOAT, 0, mFTextureBufferB);
gl.glDrawElements( gl.GL_TRIANGLES, FacesB, gl.GL_UNSIGNED_BYTE, mModelB);
}

}


//Vertices: 48  Texture Co-ords: 48  Normals: 48  Texture: jostage.mtl Faces: 24 Smooth Groups: 12 sucess: 24 Doubles: 0 Redos needed: 0 Correct: 0