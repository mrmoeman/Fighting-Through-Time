package com.example.jgfjhg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;
import android.graphics.Bitmap;
import android.opengl.GLUtils;

class ragnarblockc {

static String TextureName = "RagBlock3.mtl";

static int Vertices = 238;

static int VertTexts = 170;

static int Normals = 123;

static int Faces = 168;

static int FacesB = 0;

static int SmoothGroups = 16;

static float VertArray[] = new float[]{
 -0.081949f, 8.813882f, 2.651266f,
 1.748306f, 9.535870f, 3.129086f,
 1.036979f, 13.358673f, 4.841372f,
 -1.341337f, 11.408076f, 3.223032f,
 3.188428f, 8.805167f, 1.168453f,
 2.320194f, 9.534455f, 2.874811f,
 4.072515f, 13.350141f, 3.488463f,
 4.425352f, 11.397660f, 0.526400f,
 0.575110f, 9.729470f, 3.465895f,
 0.684169f, 8.437464f, 3.735874f,
 0.589232f, 6.435216f, 2.706357f,
 1.289776f, 4.705832f, 1.786925f,
 2.288693f, 8.162467f, 3.594667f,
 2.122433f, 10.500988f, 3.211085f,
 0.794292f, 8.425927f, 2.703735f,
 0.155695f, 9.794127f, 2.453949f,
 1.125549f, 10.970355f, 1.079482f,
 -0.474024f, 4.555814f, -0.967456f,
 -0.345060f, 6.060161f, 1.134211f,
 -2.771042f, 3.658973f, 0.194789f,
 -3.068529f, 3.273835f, -1.930134f,
 0.398115f, 8.869883f, 3.519295f,
 -3.172473f, 7.066719f, 3.065259f,
 2.972335f, 8.744781f, 1.977613f,
 -1.867243f, 9.997697f, -1.406944f,
 -0.980859f, 1.937270f, -2.451900f,
 0.981322f, 3.235483f, 0.608313f,
 -1.894402f, 9.176044f, 4.657614f,
 0.862066f, 11.819680f, 1.057609f,
 -1.634961f, 4.801630f, 0.312870f,
 -0.027996f, 4.497400f, -0.194629f,
 -1.369399f, 5.939482f, -2.515188f,
 -2.514482f, 5.684633f, -1.289630f,
 -2.405489f, 5.383218f, -0.117550f,
 -3.470706f, 2.750142f, -0.468370f,
 0.315628f, 1.728270f, -0.325006f,
 -0.757585f, 7.700331f, 4.451915f,
 0.672761f, 6.545326f, 3.246109f,
 0.116228f, 4.998597f, 4.073080f,
 -1.141875f, 5.597549f, 5.098688f,
 2.711628f, 6.804268f, 5.363760f,
 3.339806f, 6.072677f, 4.429816f,
 2.985787f, 5.066025f, 4.970488f,
 2.348053f, 5.791902f, 5.907842f,
 -2.262388f, 9.053967f, 2.164005f,
 -0.406895f, 9.042600f, 3.447789f,
 -2.070255f, 7.548884f, 1.632975f,
 -0.616100f, 6.966572f, 2.612033f,
 -1.342355f, 1.966653f, 0.897506f,
 -1.605431f, 3.483362f, 2.061954f,
 -2.483953f, 1.987249f, 1.190917f,
 -2.670771f, 3.141543f, 2.098932f,
 -1.026014f, -0.011795f, 0.888525f,
 -0.889340f, -0.006600f, 5.156820f,
 -2.380108f, -0.013513f, 1.051805f,
 -2.384259f, -0.006021f, 5.101852f,
 -1.501776f, 3.399550f, -1.894095f,
 -2.328656f, 3.502129f, -1.358974f,
 -2.189315f, 3.665571f, -0.563631f,
 -1.021093f, 3.295589f, -0.875325f,
 -2.216234f, 1.351916f, 2.557887f,
 -2.196542f, 0.819980f, 1.497943f,
 -1.102687f, 0.816657f, 1.261009f,
 -1.138045f, 1.511297f, 2.551704f,
 3.360916f, 9.725582f, 2.214121f,
 3.475556f, 8.435147f, 2.494153f,
 2.770588f, 6.435552f, 1.736780f,
 2.950634f, 9.019518f, -0.364559f,
 2.254118f, 10.369904f, -0.526408f,
 1.616736f, 6.284378f, -0.686717f,
 1.843530f, 3.584187f, -1.959408f,
 -0.087141f, 3.727591f, -3.777927f,
 3.968955f, 8.105881f, -1.579139f,
 1.042991f, 9.542663f, -5.033491f,
 3.650621f, 10.286919f, -3.649436f,
 1.214579f, 4.802200f, -1.329316f,
 0.259710f, 5.705953f, -2.872772f,
 1.227092f, 5.384064f, -2.213842f,
 1.400800f, 3.231602f, -3.505326f,
 2.893339f, 8.746649f, -4.480549f,
 1.585087f, 6.984772f, -4.412117f,
 1.072036f, 7.299005f, -6.151204f,
 1.922115f, 8.766182f, -6.490423f,
 3.759448f, 5.316822f, -5.477619f,
 2.758270f, 4.430939f, -5.340255f,
 2.420403f, 4.630128f, -6.482680f,
 3.429296f, 5.511030f, -6.623644f,
 1.258330f, 10.023786f, -2.846030f,
 3.171687f, 9.921541f, -1.512770f,
 1.106482f, 8.423562f, -2.887756f,
 2.628156f, 7.847767f, -2.004766f,
 1.627495f, 1.569780f, -2.527664f,
 3.324172f, 1.313904f, -1.782299f,
 2.375593f, 2.104740f, -3.207488f,
 3.618969f, 1.988608f, -2.638842f,
 0.315020f, -0.002701f, -3.881907f,
 3.499054f, -0.006620f, -1.014184f,
 1.307412f, 0.004777f, -4.815575f,
 4.421119f, -0.006527f, -2.192290f,
 -0.749730f, 3.358192f, -2.327660f,
 0.123174f, 3.506170f, -2.763560f,
 0.780803f, 3.535982f, -1.981631f,
 -0.043977f, 3.102743f, -1.298527f,
 2.493237f, 1.193038f, -3.616866f,
 1.542132f, 0.825993f, -4.373645f,
 0.656721f, 0.823523f, -3.688310f,
 2.000623f, 0.897023f, -2.718894f,
 0.896675f, 7.761154f, -10.962713f,
 1.890796f, 3.753145f, -12.154032f,
 3.699555f, 5.974088f, -1.749264f,
 4.861750f, 1.865026f, -3.046389f,
 0.519071f, 10.095664f, 3.266760f,
 6.108452f, 8.932356f, 5.078992f,
 4.039263f, 3.589162f, 7.893994f,
 -1.528663f, 4.629863f, 6.152963f,
 -1.894402f, 9.176044f, 4.657614f,
 0.862066f, 11.819680f, 1.057609f,
 0.862066f, 11.819680f, 1.057609f,
 -2.405489f, 5.383218f, -0.117550f,
 -2.405489f, 5.383218f, -0.117550f,
 -1.894402f, 9.176044f, 4.657614f,
 -3.470706f, 2.750142f, -0.468370f,
 -2.405489f, 5.383218f, -0.117550f,
 -2.405489f, 5.383218f, -0.117550f,
 -3.470706f, 2.750142f, -0.468370f,
 0.315628f, 1.728270f, -0.325006f,
 2.985787f, 5.066025f, 4.970488f,
 2.348053f, 5.791902f, 5.907842f,
 2.348053f, 5.791902f, 5.907842f,
 2.985787f, 5.066025f, 4.970488f,
 2.985787f, 5.066025f, 4.970488f,
 0.116228f, 4.998597f, 4.073080f,
 2.348053f, 5.791902f, 5.907842f,
 2.348053f, 5.791902f, 5.907842f,
 0.116228f, 4.998597f, 4.073080f,
 -2.070255f, 7.548884f, 1.632975f,
 -2.070255f, 7.548884f, 1.632975f,
 -1.342355f, 1.966653f, 0.897506f,
 -1.342355f, 1.966653f, 0.897506f,
 -1.102687f, 0.816657f, 1.261009f,
 -1.501776f, 3.399550f, -1.894095f,
 -1.342355f, 1.966653f, 0.897506f,
 -1.342355f, 1.966653f, 0.897506f,
 -2.196542f, 0.819980f, 1.497943f,
 -2.216234f, 1.351916f, 2.557887f,
 -2.216234f, 1.351916f, 2.557887f,
 -1.026014f, -0.011795f, 0.888525f,
 -1.102687f, 0.816657f, 1.261009f,
 -1.102687f, 0.816657f, 1.261009f,
 -2.196542f, 0.819980f, 1.497943f,
 -0.889340f, -0.006600f, 5.156820f,
 -1.026014f, -0.011795f, 0.888525f,
 -1.138045f, 1.511297f, 2.551704f,
 -1.138045f, 1.511297f, 2.551704f,
 -1.026014f, -0.011795f, 0.888525f,
 -1.102687f, 0.816657f, 1.261009f,
 -2.216234f, 1.351916f, 2.557887f,
 -1.138045f, 1.511297f, 2.551704f,
 -1.138045f, 1.511297f, 2.551704f,
 -0.889340f, -0.006600f, 5.156820f,
 1.289776f, 4.705832f, 1.786925f,
 2.288693f, 8.162467f, 3.594667f,
 2.288693f, 8.162467f, 3.594667f,
 2.288693f, 8.162467f, 3.594667f,
 2.288693f, 8.162467f, 3.594667f,
 2.122433f, 10.500988f, 3.211085f,
 1.125549f, 10.970355f, 1.079482f,
 1.125549f, 10.970355f, 1.079482f,
 2.122433f, 10.500988f, 3.211085f,
 1.289776f, 4.705832f, 1.786925f,
 1.289776f, 4.705832f, 1.786925f,
 -0.474024f, 4.555814f, -0.967456f,
 0.862066f, 11.819680f, 1.057609f,
 -1.867243f, 9.997697f, -1.406944f,
 -1.867243f, 9.997697f, -1.406944f,
 3.650621f, 10.286919f, -3.649436f,
 0.862066f, 11.819680f, 1.057609f,
 0.862066f, 11.819680f, 1.057609f,
 2.972335f, 8.744781f, 1.977613f,
 -1.369399f, 5.939482f, -2.515188f,
 -1.867243f, 9.997697f, -1.406944f,
 -1.867243f, 9.997697f, -1.406944f,
 -0.027996f, 4.497400f, -0.194629f,
 -0.027996f, 4.497400f, -0.194629f,
 0.981322f, 3.235483f, 0.608313f,
 3.650621f, 10.286919f, -3.649436f,
 1.227092f, 5.384064f, -2.213842f,
 1.227092f, 5.384064f, -2.213842f,
 -1.369399f, 5.939482f, -2.515188f,
 -1.369399f, 5.939482f, -2.515188f,
 -0.980859f, 1.937270f, -2.451900f,
 2.972335f, 8.744781f, 1.977613f,
 -0.027996f, 4.497400f, -0.194629f,
 -0.027996f, 4.497400f, -0.194629f,
 1.400800f, 3.231602f, -3.505326f,
 1.227092f, 5.384064f, -2.213842f,
 1.227092f, 5.384064f, -2.213842f,
 0.981322f, 3.235483f, 0.608313f,
 0.315628f, 1.728270f, -0.325006f,
 0.315628f, 1.728270f, -0.325006f,
 1.400800f, 3.231602f, -3.505326f,
 0.315628f, 1.728270f, -0.325006f,
 -0.980859f, 1.937270f, -2.451900f,
 -0.980859f, 1.937270f, -2.451900f,
 3.429296f, 5.511030f, -6.623644f,
 3.429296f, 5.511030f, -6.623644f,
 2.420403f, 4.630128f, -6.482680f,
 2.420403f, 4.630128f, -6.482680f,
 2.420403f, 4.630128f, -6.482680f,
 1.072036f, 7.299005f, -6.151204f,
 3.429296f, 5.511030f, -6.623644f,
 3.429296f, 5.511030f, -6.623644f,
 1.106482f, 8.423562f, -2.887756f,
 1.106482f, 8.423562f, -2.887756f,
 1.072036f, 7.299005f, -6.151204f,
 0.656721f, 0.823523f, -3.688310f,
 1.627495f, 1.569780f, -2.527664f,
 1.627495f, 1.569780f, -2.527664f,
 1.627495f, 1.569780f, -2.527664f,
 1.627495f, 1.569780f, -2.527664f,
 -0.749730f, 3.358192f, -2.327660f,
 2.493237f, 1.193038f, -3.616866f,
 2.493237f, 1.193038f, -3.616866f,
 1.542132f, 0.825993f, -4.373645f,
 1.542132f, 0.825993f, -4.373645f,
 0.656721f, 0.823523f, -3.688310f,
 0.656721f, 0.823523f, -3.688310f,
 0.315020f, -0.002701f, -3.881907f,
 0.656721f, 0.823523f, -3.688310f,
 0.315020f, -0.002701f, -3.881907f,
 2.000623f, 0.897023f, -2.718894f,
 2.000623f, 0.897023f, -2.718894f,
 0.315020f, -0.002701f, -3.881907f,
 3.499054f, -0.006620f, -1.014184f,
 2.493237f, 1.193038f, -3.616866f,
 2.000623f, 0.897023f, -2.718894f,
 2.000623f, 0.897023f, -2.718894f,
 3.499054f, -0.006620f, -1.014184f,};

static float VertArrayB[] = new float[]{};

static float[] TextArray = new float[]{
 0.210839f, -0.041423f,
 0.285887f, 0.101580f,
 0.176571f, 0.484642f,
 0.021531f, 0.163306f,
 0.210839f, -0.041423f,
 0.285887f, 0.101580f,
 0.176571f, 0.484642f,
 0.021531f, 0.163306f,
 0.092566f, 0.905169f,
 0.103424f, 0.808166f,
 0.093844f, 0.625832f,
 0.013347f, 0.528962f,
 0.013347f, 0.808166f,
 0.013347f, 0.941674f,
 0.192207f, 0.808166f,
 0.164310f, 0.929344f,
 0.013347f, 0.989437f,
 0.013347f, 0.412760f,
 0.165447f, 0.558111f,
 0.620875f, 0.595240f,
 0.893289f, 0.616672f,
 0.633892f, 0.833904f,
 0.846020f, 0.811014f,
 0.508256f, 0.857141f,
 0.999194f, 0.825257f,
 0.975622f, 0.556485f,
 0.551829f, 0.529642f,
 0.762511f, 0.879742f,
 0.968799f, 0.979409f,
 0.592427f, 0.672403f,
 0.542608f, 0.666950f,
 0.971098f, 0.678132f,
 0.889854f, 0.680554f,
 0.843077f, 0.676027f,
 0.846481f, 0.575682f,
 0.639777f, 0.472055f,
 0.356757f, 0.879728f,
 0.286059f, 0.832288f,
 0.480386f, 0.813107f,
 0.433271f, 0.853567f,
 0.350836f, 0.738776f,
 0.303186f, 0.720185f,
 0.320873f, 0.678150f,
 0.368114f, 0.697246f,
 0.443448f, 0.971941f,
 0.356050f, 0.998934f,
 0.503720f, 0.952628f,
 0.274924f, 0.967028f,
 0.230404f, 0.625207f,
 0.363360f, 0.611016f,
 0.276621f, 0.620714f,
 0.326923f, 0.611250f,
 0.843016f, 0.589495f,
 0.732209f, 0.478687f,
 0.806926f, 0.616705f,
 0.702961f, 0.512947f,
 0.171796f, 0.511290f,
 0.236933f, 0.493612f,
 0.323008f, 0.501337f,
 0.400130f, 0.507294f,
 0.314087f, 0.670139f,
 0.271059f, 0.699000f,
 0.224680f, 0.698634f,
 0.365599f, 0.674181f,
 0.092566f, 0.905169f,
 0.103424f, 0.808166f,
 0.093844f, 0.625832f,
 0.192207f, 0.808166f,
 0.164310f, 0.929344f,
 0.165447f, 0.558111f,
 0.620875f, 0.595240f,
 0.893289f, 0.616672f,
 0.633892f, 0.833904f,
 0.846020f, 0.811014f,
 0.762511f, 0.879742f,
 0.592427f, 0.672403f,
 0.889854f, 0.680554f,
 0.843077f, 0.676027f,
 0.846481f, 0.575682f,
 0.356757f, 0.879728f,
 0.286059f, 0.832288f,
 0.480386f, 0.813107f,
 0.433271f, 0.853567f,
 0.350836f, 0.738776f,
 0.303186f, 0.720185f,
 0.320873f, 0.678150f,
 0.368114f, 0.697246f,
 0.443448f, 0.971941f,
 0.356050f, 0.998934f,
 0.503720f, 0.952628f,
 0.274924f, 0.967028f,
 0.230404f, 0.625207f,
 0.363360f, 0.611016f,
 0.276621f, 0.620714f,
 0.326923f, 0.611250f,
 0.843016f, 0.589495f,
 0.732209f, 0.478687f,
 0.806926f, 0.616705f,
 0.702961f, 0.512947f,
 0.171796f, 0.511290f,
 0.236933f, 0.493612f,
 0.323008f, 0.501337f,
 0.400130f, 0.507294f,
 0.314087f, 0.670139f,
 0.271059f, 0.699000f,
 0.224680f, 0.698634f,
 0.365599f, 0.674181f,
 0.276795f, 0.002094f,
 0.555656f, 0.002094f,
 0.276795f, 0.471994f,
 0.555656f, 0.471994f,
 0.569079f, 0.470162f,
 0.997072f, 0.470162f,
 0.997072f, 0.002210f,
 0.569079f, 0.002210f,
 0.746989f, 0.877263f,
 0.555582f, 0.992492f,
 0.555582f, 0.992492f,
 0.661126f, 0.677823f,
 0.661126f, 0.677823f,
 0.746989f, 0.877263f,
 0.671984f, 0.579828f,
 0.661126f, 0.677823f,
 0.661126f, 0.677823f,
 0.671984f, 0.579828f,
 0.912281f, 0.487364f,
 0.440542f, 0.704543f,
 0.397521f, 0.732265f,
 0.397521f, 0.732265f,
 0.258556f, 0.708240f,
 0.258556f, 0.708240f,
 0.218498f, 0.814911f,
 0.397521f, 0.732265f,
 0.397521f, 0.732265f,
 0.218498f, 0.814911f,
 0.206379f, 0.950997f,
 0.206379f, 0.950997f,
 0.424695f, 0.637310f,
 0.424695f, 0.637310f,
 0.420018f, 0.712424f,
 0.489396f, 0.525040f,
 0.424695f, 0.637310f,
 0.424695f, 0.637310f,
 0.775316f, 0.625800f,
 0.731916f, 0.600795f,
 0.731916f, 0.600795f,
 0.817299f, 0.659726f,
 0.785650f, 0.664322f,
 0.785650f, 0.664322f,
 0.775316f, 0.625800f,
 0.773592f, 0.809902f,
 0.817299f, 0.659726f,
 0.756028f, 0.715566f,
 0.756028f, 0.715566f,
 0.817299f, 0.659726f,
 0.785650f, 0.664322f,
 0.731916f, 0.600795f,
 0.692441f, 0.608961f,
 0.692441f, 0.608961f,
 0.661792f, 0.529129f,
 0.013347f, 0.528962f,
 0.013347f, 0.808166f,
 0.013347f, 0.808166f,
 0.013347f, 0.808166f,
 0.013347f, 0.808166f,
 0.013347f, 0.941674f,
 0.013347f, 0.989437f,
 0.013347f, 0.989437f,
 0.013347f, 0.941674f,
 0.013347f, 0.528962f,
 0.013347f, 0.528962f,
 0.013347f, 0.412760f,
 0.968799f, 0.979409f,
 0.999194f, 0.825257f,
 0.999194f, 0.825257f,
 0.746989f, 0.877263f,
 0.555582f, 0.992492f,
 0.555582f, 0.992492f,
 0.508256f, 0.857141f,
 0.971098f, 0.678132f,
 0.999194f, 0.825257f,
 0.999194f, 0.825257f,
 0.542608f, 0.666950f,
 0.542608f, 0.666950f,
 0.551829f, 0.529642f,
 0.746989f, 0.877263f,
 0.661126f, 0.677823f,
 0.661126f, 0.677823f,
 0.971098f, 0.678132f,
 0.971098f, 0.678132f,
 0.975622f, 0.556485f,
 0.508256f, 0.857141f,
 0.542608f, 0.666950f,
 0.542608f, 0.666950f,
 0.671984f, 0.579828f,
 0.661126f, 0.677823f,
 0.661126f, 0.677823f,
 0.551829f, 0.529642f,
 0.639777f, 0.472055f,
 0.639777f, 0.472055f,
 0.671984f, 0.579828f,
 0.912281f, 0.487364f,
 0.975622f, 0.556485f,
 0.975622f, 0.556485f,
 0.397521f, 0.732265f,
 0.397521f, 0.732265f,
 0.440542f, 0.704543f,
 0.258556f, 0.708240f,
 0.258556f, 0.708240f,
 0.218498f, 0.814911f,
 0.397521f, 0.732265f,
 0.397521f, 0.732265f,
 0.206379f, 0.950997f,
 0.206379f, 0.950997f,
 0.218498f, 0.814911f,
 0.420018f, 0.712424f,
 0.424695f, 0.637310f,
 0.424695f, 0.637310f,
 0.424695f, 0.637310f,
 0.424695f, 0.637310f,
 0.489396f, 0.525040f,
 0.731916f, 0.600795f,
 0.731916f, 0.600795f,
 0.775316f, 0.625800f,
 0.775316f, 0.625800f,
 0.785650f, 0.664322f,
 0.785650f, 0.664322f,
 0.817299f, 0.659726f,
 0.785650f, 0.664322f,
 0.817299f, 0.659726f,
 0.756028f, 0.715566f,
 0.756028f, 0.715566f,
 0.817299f, 0.659726f,
 0.773592f, 0.809902f,
 0.731916f, 0.600795f,
 0.692441f, 0.608961f,
 0.692441f, 0.608961f,
 0.661792f, 0.529129f,};

static float[] TextArrayB = new float[]{};

static float[][] NormArray = new float[][]{
{ -0.138944f, -0.277004f, 0.950770f},
{ -0.203895f, -0.381719f, 0.901508f},
{ -0.218810f, -0.405627f, 0.887462f},
{ -0.236231f, -0.433483f, 0.869648f},
{ 0.812120f, -0.257846f, 0.523427f},
{ 0.816863f, -0.404028f, 0.411699f},
{ 0.818036f, -0.379385f, 0.432301f},
{ 0.814056f, -0.435623f, 0.384116f},
{ 0.292927f, -0.923899f, 0.246181f},
{ 0.402066f, -0.240351f, 0.883501f},
{ -0.467988f, -0.363503f, 0.805514f},
{ -0.414180f, -0.173928f, 0.893423f},
{ -0.405818f, 0.471689f, 0.782829f},
{ 0.275716f, 0.750130f, 0.601071f},
{ -0.990948f, -0.000792f, 0.134241f},
{ -0.781603f, 0.511764f, 0.356644f},
{ 0.284206f, 0.954122f, 0.094227f},
{ -0.723527f, -0.477919f, 0.498099f},
{ 0.239554f, -0.965635f, -0.100808f},
{ -0.041047f, 0.996171f, 0.077194f},
{ -0.728439f, 0.597787f, -0.334707f},
{ -0.602401f, 0.299919f, 0.739704f},
{ -0.970064f, 0.053093f, 0.236973f},
{ 0.418438f, -0.268166f, 0.867754f},
{ 0.812043f, -0.146337f, 0.564953f},
{ -0.476174f, 0.163009f, -0.864110f},
{ -0.935835f, 0.150429f, -0.318723f},
{ -0.699556f, -0.429308f, 0.571241f},
{ 0.478532f, -0.071972f, 0.875116f},
{ 0.492837f, -0.370303f, 0.787393f},
{ -0.309388f, -0.195540f, 0.930614f},
{ -0.141125f, -0.462390f, 0.875374f},
{ -0.674882f, -0.103657f, -0.730609f},
{ -0.744022f, -0.608152f, 0.276736f},
{ -0.221139f, -0.823243f, -0.522847f},
{ 0.190880f, -0.911255f, 0.364938f},
{ 0.353924f, 0.891794f, 0.281854f},
{ -0.031598f, -0.166438f, 0.985546f},
{ 0.694344f, 0.171289f, -0.698961f},
{ 0.362586f, -0.914147f, -0.181292f},
{ -0.106407f, -0.937172f, -0.332245f},
{ -0.665572f, -0.390767f, 0.635857f},
{ -0.213928f, 0.666746f, 0.713922f},
{ -0.909915f, 0.092433f, 0.404365f},
{ 0.047824f, 0.590289f, 0.805774f},
{ 0.440727f, 0.134027f, -0.887579f},
{ -0.900628f, -0.426192f, -0.085031f},
{ 0.748540f, 0.659554f, -0.068383f},
{ -0.840690f, -0.405717f, -0.358654f},
{ -0.511369f, -0.761081f, -0.399071f},
{ 0.866498f, -0.368400f, -0.336843f},
{ -0.158170f, -0.882090f, -0.443734f},
{ -0.497600f, 0.867130f, 0.021906f},
{ -0.797484f, 0.452997f, 0.398513f},
{ 0.543197f, 0.704850f, 0.456205f},
{ 0.981051f, 0.130325f, -0.143365f},
{ 0.865420f, 0.421667f, 0.270638f},
{ 0.686464f, 0.163385f, -0.708571f},
{ -0.749292f, 0.031694f, -0.661480f},
{ -0.862666f, 0.360377f, 0.354874f},
{ 0.001409f, -0.999998f, 0.001172f},
{ -0.000076f, -0.999999f, 0.001711f},
{ 0.001011f, -0.999999f, 0.001317f},
{ -0.000455f, -0.999998f, 0.001849f},
{ -0.916725f, 0.263432f, -0.300364f},
{ -0.401747f, 0.805119f, 0.436329f},
{ 0.915360f, 0.233632f, -0.327922f},
{ 0.437992f, 0.794308f, 0.420997f},
{ 0.860930f, -0.507196f, 0.039408f},
{ 0.967222f, -0.187516f, 0.171230f},
{ 0.843157f, 0.514821f, 0.155066f},
{ 0.684550f, 0.721080f, -0.106933f},
{ 0.951654f, -0.052183f, -0.302706f},
{ 0.745933f, -0.558169f, -0.363361f},
{ 0.633546f, 0.595099f, -0.494446f},
{ -0.228346f, 0.213227f, -0.949943f},
{ 0.979847f, -0.188362f, 0.066472f},
{ -0.303242f, -0.092246f, -0.948438f},
{ 0.659472f, -0.349076f, -0.665765f},
{ 0.797035f, -0.387961f, 0.462841f},
{ 0.978827f, -0.199129f, 0.047374f},
{ 0.602131f, -0.428011f, -0.673977f},
{ -0.360123f, -0.042148f, -0.931952f},
{ 0.859179f, -0.122431f, 0.496813f},
{ -0.246278f, -0.720641f, 0.648092f},
{ 0.606862f, 0.109636f, -0.787210f},
{ -0.638376f, -0.565726f, -0.521948f},
{ 0.076720f, 0.682580f, -0.726772f},
{ -0.884067f, -0.044426f, -0.465244f},
{ 0.862590f, 0.437467f, -0.254088f},
{ 0.914465f, 0.389539f, -0.109606f},
{ -0.241052f, 0.869543f, -0.431033f},
{ -0.280766f, -0.689939f, 0.667199f},
{ -0.983758f, -0.170637f, 0.055701f},
{ 0.796471f, -0.596551f, 0.098800f},
{ -0.598150f, -0.770406f, -0.220662f},
{ -0.142936f, 0.028623f, -0.989318f},
{ -0.721927f, -0.673978f, 0.156764f},
{ 0.017506f, 0.627772f, -0.778200f},
{ 0.494394f, 0.785969f, 0.371250f},
{ 0.849306f, 0.510093f, 0.135962f},
{ -0.345839f, -0.569102f, 0.746002f},
{ 0.543909f, -0.166472f, 0.822466f},
{ -0.757069f, 0.650760f, 0.057957f},
{ -0.363922f, 0.288862f, 0.885505f},
{ -0.161778f, 0.700007f, -0.695570f},
{ 0.731510f, 0.263824f, -0.628721f},
{ -0.002148f, -0.999996f, -0.001760f},
{ -0.001096f, -0.999997f, -0.002366f},
{ 0.001945f, -0.999990f, -0.004119f},
{ 0.003057f, -0.999984f, -0.004760f},
{ 0.498814f, 0.865211f, -0.050934f},
{ 0.293859f, 0.307426f, -0.905061f},
{ -0.877069f, 0.400496f, 0.265242f},
{ 0.083250f, 0.908901f, 0.408619f},
{ -0.923475f, -0.300100f, 0.239028f},
{ -0.920656f, -0.321147f, 0.221940f},
{ -0.922499f, -0.308013f, 0.232645f},
{ -0.919536f, -0.328284f, 0.216063f},
{ -0.167882f, 0.508767f, 0.844377f},
{ -0.168213f, 0.509264f, 0.844011f},
{ -0.168181f, 0.509216f, 0.844046f},
{ -0.168529f, 0.509738f, 0.843662f}};

static int[] FaceArray = new int[]{
0, 1, 3,
3, 1, 2,
4, 7, 5,
5, 7, 6,
11, 12, 10,
10, 12, 9,
9, 12, 8,
8, 12, 13,
9, 8, 14,
14, 8, 15,
13, 16, 8,
8, 16, 15,
10, 18, 11,
11, 18, 17,
9, 14, 10,
10, 14, 18,
28, 24, 27,
27, 24, 22,
115, 21, 116,
117, 21, 23,
31, 32, 24,
24, 32, 22,
27, 22, 33,
33, 22, 32,
26, 30, 19,
19, 30, 29,
29, 21, 118,
119, 21, 120,
32, 20, 33,
33, 20, 34,
25, 20, 31,
31, 20, 32,
23, 21, 30,
30, 21, 29,
121, 19, 122,
123, 19, 29,
124, 35, 19,
19, 35, 26,
20, 25, 34,
34, 25, 125,
40, 43, 41,
41, 43, 42,
126, 127, 38,
38, 128, 39,
39, 36, 44,
44, 36, 45,
41, 37, 40,
40, 37, 36,
41, 129, 37,
37, 130, 131,
39, 132, 36,
36, 133, 40,
38, 39, 46,
46, 39, 44,
37, 47, 36,
36, 47, 45,
134, 135, 37,
37, 136, 47,
50, 57, 48,
48, 57, 56,
57, 50, 58,
58, 50, 51,
51, 49, 58,
58, 49, 59,
49, 63, 137,
138, 63, 139,
62, 61, 48,
48, 61, 50,
60, 63, 51,
51, 63, 49,
51, 50, 60,
60, 50, 61,
52, 53, 54,
54, 53, 55,
140, 59, 141,
142, 59, 49,
143, 54, 144,
145, 54, 55,
146, 54, 147,
148, 54, 149,
150, 151, 152,
153, 154, 155,
156, 55, 157,
158, 55, 159,
160, 66, 161,
162, 66, 65,
65, 64, 163,
164, 64, 165,
68, 64, 67,
67, 64, 65,
68, 166, 64,
64, 167, 168,
66, 169, 69,
69, 170, 171,
69, 67, 66,
66, 67, 65,
172, 74, 173,
174, 74, 73,
175, 176, 72,
72, 177, 178,
179, 180, 76,
76, 181, 73,
76, 73, 77,
77, 73, 74,
75, 182, 70,
70, 183, 184,
185, 72, 186,
187, 72, 75,
78, 71, 77,
77, 71, 76,
76, 71, 188,
189, 71, 190,
191, 192, 72,
72, 193, 75,
194, 195, 70,
70, 196, 75,
197, 198, 70,
70, 199, 200,
201, 202, 78,
78, 203, 71,
83, 84, 86,
86, 84, 85,
82, 204, 81,
81, 205, 206,
88, 79, 87,
87, 79, 82,
79, 80, 83,
83, 80, 84,
84, 80, 207,
208, 80, 209,
82, 79, 210,
211, 79, 83,
87, 82, 89,
89, 82, 81,
88, 90, 79,
79, 90, 80,
90, 212, 80,
80, 213, 214,
99, 100, 91,
91, 100, 93,
100, 101, 93,
93, 101, 94,
102, 92, 101,
101, 92, 94,
215, 106, 216,
217, 106, 92,
93, 104, 91,
91, 104, 105,
92, 106, 94,
94, 106, 103,
94, 103, 93,
93, 103, 104,
98, 96, 97,
97, 96, 95,
92, 102, 218,
219, 102, 220,
98, 97, 221,
222, 97, 223,
224, 97, 225,
226, 97, 227,
228, 229, 230,
231, 232, 233,
234, 235, 98,
98, 236, 237,
108, 110, 107,
107, 110, 109,
111, 114, 112,
112, 114, 113, };

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


//Vertices: 238  Texture Co-ords: 170  Normals: 123  Texture: RagBlock3.mtl Faces: 168 Smooth Groups: 16 sucess: 92 Doubles: 76 Redos needed: 123 Correct: 105