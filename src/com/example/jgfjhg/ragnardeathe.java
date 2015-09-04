package com.example.jgfjhg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;
import android.graphics.Bitmap;
import android.opengl.GLUtils;

class ragnardeathe {

static String TextureName = "RagDeath5.mtl";

static int Vertices = 238;

static int VertTexts = 170;

static int Normals = 123;

static int Faces = 168;

static int FacesB = 0;

static int SmoothGroups = 16;

static float VertArray[] = new float[]{
 -4.292894f, 4.428056f, -11.801000f,
 -3.172134f, 5.712929f, -12.895381f,
 -5.898983f, 7.640997f, -15.508497f,
 -6.629798f, 4.842153f, -13.481867f,
 -1.053792f, 4.416249f, -13.367371f,
 -2.607955f, 5.711400f, -13.164930f,
 -2.914079f, 7.613193f, -16.935324f,
 -0.946189f, 4.699922f, -16.256321f,
 -4.364709f, 5.579480f, -12.576361f,
 -3.795479f, 5.635462f, -11.372495f,
 -2.727906f, 4.312905f, -9.894979f,
 -0.877124f, 4.877322f, -9.215254f,
 -2.258555f, 6.096221f, -11.694408f,
 -3.276348f, 6.106654f, -13.846681f,
 -4.571312f, 4.468326f, -12.215183f,
 -4.990343f, 3.257504f, -13.047328f,
 -3.794299f, 2.855198f, -14.666729f,
 -0.280825f, 3.197661f, -8.580816f,
 -2.562347f, 4.297367f, -9.790396f,
 -1.420426f, 4.268603f, -6.238310f,
 -1.437801f, 1.350188f, -6.802869f,
 -4.793968f, 4.697637f, -10.284939f,
 -6.298420f, 0.598104f, -9.527260f,
 -3.231898f, 5.680483f, -13.689193f,
 -2.529886f, -0.127165f, -12.461595f,
 0.525192f, 0.876899f, -6.305070f,
 0.343477f, 5.209105f, -5.299182f,
 -7.054657f, 3.141015f, -10.147861f,
 -4.127669f, 2.273094f, -15.243671f,
 -1.902254f, 3.628486f, -8.104156f,
 -0.391150f, 4.063950f, -8.771905f,
 -0.660806f, 1.068365f, -9.255936f,
 -2.017055f, 1.634817f, -8.416149f,
 -2.455075f, 2.724369f, -8.153611f,
 -1.990742f, 2.764247f, -5.830462f,
 0.153133f, 2.400020f, -4.960199f,
 -6.081519f, 2.269913f, -8.786239f,
 -4.332964f, 1.024547f, -8.317513f,
 -5.446135f, -0.295449f, -7.680387f,
 -6.998543f, 0.392235f, -8.003332f,
 -4.265120f, 2.115000f, -5.594894f,
 -3.235065f, 1.262988f, -5.580826f,
 -3.957295f, 0.390047f, -5.156724f,
 -4.988763f, 1.255911f, -5.158321f,
 -5.348910f, 1.585855f, -11.159298f,
 -5.798207f, 3.704196f, -11.952076f,
 -4.351144f, 2.160173f, -10.036736f,
 -4.531510f, 3.981970f, -10.229693f,
 -0.853554f, 2.684084f, -4.139877f,
 -0.973783f, 4.472767f, -3.423982f,
 -1.947496f, 3.035166f, -4.267870f,
 -2.033896f, 4.399779f, -3.777379f,
 -1.031456f, 0.553758f, -2.845388f,
 -0.889365f, 4.409967f, -0.982671f,
 -2.385308f, 0.699661f, -2.778355f,
 -2.384412f, 4.360757f, -1.006555f,
 0.109226f, 2.240210f, -6.999365f,
 -0.833790f, 2.310008f, -6.706165f,
 -0.855203f, 3.458808f, -6.693953f,
 0.151761f, 3.488919f, -6.877031f,
 -2.174481f, 2.768449f, -3.132295f,
 -2.197097f, 1.474155f, -3.323119f,
 -1.104083f, 1.259183f, -3.425323f,
 -1.098396f, 2.833533f, -2.975030f,
 -1.609295f, 5.569996f, -13.894935f,
 -1.034561f, 5.633730f, -12.683136f,
 -0.569544f, 4.312905f, -10.915490f,
 -1.283042f, 4.468301f, -14.113699f,
 -1.794415f, 3.256446f, -14.892641f,
 -0.191761f, 4.297337f, -11.167395f,
 2.522810f, 4.169421f, -7.816444f,
 2.215584f, 1.348865f, -8.599718f,
 0.105529f, 3.504195f, -15.807034f,
 2.117231f, 1.331072f, -13.176270f,
 0.894727f, 1.180593f, -15.338086f,
 0.947568f, 3.628821f, -9.748579f,
 0.791604f, 1.639008f, -10.029233f,
 1.179267f, 2.725522f, -10.251543f,
 3.103433f, 2.654983f, -7.614325f,
 3.001171f, 0.945261f, -15.366656f,
 4.435321f, 2.596321f, -15.006704f,
 4.063011f, 2.509285f, -13.196716f,
 2.956339f, 1.223817f, -13.122497f,
 6.664945f, 0.724489f, -14.461599f,
 7.245617f, 1.909181f, -14.266010f,
 6.997473f, 1.851897f, -13.097924f,
 6.413907f, 0.653693f, -13.279152f,
 0.020084f, 1.585693f, -14.258261f,
 -0.482622f, 3.597058f, -15.115385f,
 0.493471f, 2.160173f, -12.833776f,
 0.420143f, 3.988876f, -13.108656f,
 1.129207f, 2.406737f, -5.552281f,
 1.209407f, 4.313098f, -5.217920f,
 2.264262f, 2.700767f, -5.479259f,
 2.314295f, 4.162862f, -5.191941f,
 1.293161f, 0.555706f, -3.605870f,
 2.107158f, 4.409966f, -1.923150f,
 2.503187f, 0.701032f, -4.213154f,
 3.389716f, 4.360759f, -2.691206f,
 0.826049f, 2.240824f, -7.537000f,
 1.668128f, 2.318203f, -8.207045f,
 1.811819f, 3.465496f, -8.202942f,
 0.844005f, 3.481343f, -7.540188f,
 2.170028f, 2.752935f, -4.287479f,
 2.070713f, 1.473836f, -4.600408f,
 1.071864f, 1.258809f, -4.148203f,
 1.156187f, 2.849686f, -4.040751f,
 3.685037f, 1.224000f, -8.548607f,
 8.060925f, 0.769084f, -7.657961f,
 5.928734f, 1.627074f, -18.062159f,
 10.204654f, 1.419756f, -16.924019f,
 -4.122302f, 4.394300f, -9.445889f,
 -1.394635f, 4.622334f, -4.159761f,
 -5.268226f, -0.136606f, -1.886697f,
 -8.087254f, -0.291618f, -7.273231f,
 -7.054657f, 3.141015f, -10.147861f,
 -4.127669f, 2.273094f, -15.243671f,
 -4.127669f, 2.273094f, -15.243671f,
 -2.455075f, 2.724369f, -8.153611f,
 -2.455075f, 2.724369f, -8.153611f,
 -7.054657f, 3.141015f, -10.147861f,
 -1.990742f, 2.764247f, -5.830462f,
 -2.455075f, 2.724369f, -8.153611f,
 -2.455075f, 2.724369f, -8.153611f,
 -1.990742f, 2.764247f, -5.830462f,
 0.153133f, 2.400020f, -4.960199f,
 -3.957295f, 0.390047f, -5.156724f,
 -4.988763f, 1.255911f, -5.158321f,
 -4.988763f, 1.255911f, -5.158321f,
 -3.957295f, 0.390047f, -5.156724f,
 -3.957295f, 0.390047f, -5.156724f,
 -5.446135f, -0.295449f, -7.680387f,
 -4.988763f, 1.255911f, -5.158321f,
 -4.988763f, 1.255911f, -5.158321f,
 -5.446135f, -0.295449f, -7.680387f,
 -4.351144f, 2.160173f, -10.036736f,
 -4.351144f, 2.160173f, -10.036736f,
 -0.853554f, 2.684084f, -4.139877f,
 -0.853554f, 2.684084f, -4.139877f,
 -1.104083f, 1.259183f, -3.425323f,
 0.109226f, 2.240210f, -6.999365f,
 -0.853554f, 2.684084f, -4.139877f,
 -0.853554f, 2.684084f, -4.139877f,
 -2.197097f, 1.474155f, -3.323119f,
 -2.174481f, 2.768449f, -3.132295f,
 -2.174481f, 2.768449f, -3.132295f,
 -1.031456f, 0.553758f, -2.845388f,
 -1.104083f, 1.259183f, -3.425323f,
 -1.104083f, 1.259183f, -3.425323f,
 -2.197097f, 1.474155f, -3.323119f,
 -0.889365f, 4.409967f, -0.982671f,
 -1.031456f, 0.553758f, -2.845388f,
 -1.098396f, 2.833533f, -2.975030f,
 -1.098396f, 2.833533f, -2.975030f,
 -1.031456f, 0.553758f, -2.845388f,
 -1.104083f, 1.259183f, -3.425323f,
 -2.174481f, 2.768449f, -3.132295f,
 -1.098396f, 2.833533f, -2.975030f,
 -1.098396f, 2.833533f, -2.975030f,
 -0.889365f, 4.409967f, -0.982671f,
 -0.877124f, 4.877322f, -9.215254f,
 -2.258555f, 6.096221f, -11.694408f,
 -2.258555f, 6.096221f, -11.694408f,
 -2.258555f, 6.096221f, -11.694408f,
 -2.258555f, 6.096221f, -11.694408f,
 -3.276348f, 6.106654f, -13.846681f,
 -3.794299f, 2.855198f, -14.666729f,
 -3.794299f, 2.855198f, -14.666729f,
 -3.276348f, 6.106654f, -13.846681f,
 -0.877124f, 4.877322f, -9.215254f,
 -0.877124f, 4.877322f, -9.215254f,
 -0.280825f, 3.197661f, -8.580816f,
 -4.127669f, 2.273094f, -15.243671f,
 -2.529886f, -0.127165f, -12.461595f,
 -2.529886f, -0.127165f, -12.461595f,
 0.894727f, 1.180593f, -15.338086f,
 -4.127669f, 2.273094f, -15.243671f,
 -4.127669f, 2.273094f, -15.243671f,
 -3.231898f, 5.680483f, -13.689193f,
 -0.660806f, 1.068365f, -9.255936f,
 -2.529886f, -0.127165f, -12.461595f,
 -2.529886f, -0.127165f, -12.461595f,
 -0.391150f, 4.063950f, -8.771905f,
 -0.391150f, 4.063950f, -8.771905f,
 0.343477f, 5.209105f, -5.299182f,
 0.894727f, 1.180593f, -15.338086f,
 1.179267f, 2.725522f, -10.251543f,
 1.179267f, 2.725522f, -10.251543f,
 -0.660806f, 1.068365f, -9.255936f,
 -0.660806f, 1.068365f, -9.255936f,
 0.525192f, 0.876899f, -6.305070f,
 -3.231898f, 5.680483f, -13.689193f,
 -0.391150f, 4.063950f, -8.771905f,
 -0.391150f, 4.063950f, -8.771905f,
 3.103433f, 2.654983f, -7.614325f,
 1.179267f, 2.725522f, -10.251543f,
 1.179267f, 2.725522f, -10.251543f,
 0.343477f, 5.209105f, -5.299182f,
 0.153133f, 2.400020f, -4.960199f,
 0.153133f, 2.400020f, -4.960199f,
 3.103433f, 2.654983f, -7.614325f,
 0.153133f, 2.400020f, -4.960199f,
 0.525192f, 0.876899f, -6.305070f,
 0.525192f, 0.876899f, -6.305070f,
 6.413907f, 0.653693f, -13.279152f,
 6.413907f, 0.653693f, -13.279152f,
 6.997473f, 1.851897f, -13.097924f,
 6.997473f, 1.851897f, -13.097924f,
 6.997473f, 1.851897f, -13.097924f,
 4.063011f, 2.509285f, -13.196716f,
 6.413907f, 0.653693f, -13.279152f,
 6.413907f, 0.653693f, -13.279152f,
 0.493471f, 2.160173f, -12.833776f,
 0.493471f, 2.160173f, -12.833776f,
 4.063011f, 2.509285f, -13.196716f,
 1.071864f, 1.258809f, -4.148203f,
 1.129207f, 2.406737f, -5.552281f,
 1.129207f, 2.406737f, -5.552281f,
 1.129207f, 2.406737f, -5.552281f,
 1.129207f, 2.406737f, -5.552281f,
 0.826049f, 2.240824f, -7.537000f,
 2.170028f, 2.752935f, -4.287479f,
 2.170028f, 2.752935f, -4.287479f,
 2.070713f, 1.473836f, -4.600408f,
 2.070713f, 1.473836f, -4.600408f,
 1.071864f, 1.258809f, -4.148203f,
 1.071864f, 1.258809f, -4.148203f,
 1.293161f, 0.555706f, -3.605870f,
 1.071864f, 1.258809f, -4.148203f,
 1.293161f, 0.555706f, -3.605870f,
 1.156187f, 2.849686f, -4.040751f,
 1.156187f, 2.849686f, -4.040751f,
 1.293161f, 0.555706f, -3.605870f,
 2.107158f, 4.409966f, -1.923150f,
 2.170028f, 2.752935f, -4.287479f,
 1.156187f, 2.849686f, -4.040751f,
 1.156187f, 2.849686f, -4.040751f,
 2.107158f, 4.409966f, -1.923150f,};

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
{ -0.289884f, 0.754439f, 0.588888f},
{ -0.284234f, 0.660706f, 0.694751f},
{ -0.282264f, 0.638693f, 0.715820f},
{ -0.279388f, 0.609924f, 0.741576f},
{ 0.644616f, 0.758141f, 0.098453f},
{ 0.759772f, 0.616454f, 0.206714f},
{ 0.742907f, 0.642082f, 0.189263f},
{ 0.780847f, 0.580981f, 0.229650f},
{ 0.314585f, 0.713666f, 0.625873f},
{ 0.131495f, 0.941146f, 0.311374f},
{ -0.454379f, 0.594276f, 0.663608f},
{ -0.533769f, 0.593550f, 0.602320f},
{ -0.761004f, 0.594484f, -0.259733f},
{ -0.308706f, 0.675824f, -0.669300f},
{ -0.898775f, 0.180841f, 0.399374f},
{ -0.750709f, 0.319549f, -0.578207f},
{ -0.449572f, 0.340006f, -0.826003f},
{ -0.392300f, 0.230966f, 0.890368f},
{ 0.525861f, 0.457524f, 0.717037f},
{ -0.638399f, -0.295715f, -0.710633f},
{ -0.212798f, -0.962398f, -0.168843f},
{ -0.993881f, 0.110311f, -0.005644f},
{ -0.613162f, -0.742014f, 0.271011f},
{ -0.414695f, 0.893294f, 0.173360f},
{ -0.057535f, 0.962005f, -0.266901f},
{ 0.080623f, -0.990587f, 0.110623f},
{ -0.120257f, -0.862898f, 0.490862f},
{ -0.561037f, 0.086458f, 0.823264f},
{ 0.322632f, 0.760317f, 0.563761f},
{ 0.177972f, 0.983868f, -0.018170f},
{ -0.620844f, 0.712390f, 0.327189f},
{ -0.381678f, 0.834572f, 0.397256f},
{ -0.498724f, -0.811341f, 0.304960f},
{ -0.750277f, -0.085329f, 0.655594f},
{ 0.240959f, -0.870890f, 0.428357f},
{ 0.287673f, -0.216996f, 0.932822f},
{ 0.148162f, 0.974324f, 0.169534f},
{ -0.706344f, 0.106095f, 0.699872f},
{ 0.996419f, 0.061304f, -0.058239f},
{ 0.305395f, -0.871478f, 0.383744f},
{ 0.002276f, -0.984556f, -0.175055f},
{ -0.967603f, -0.251873f, -0.017476f},
{ -0.643995f, 0.726781f, 0.238873f},
{ -0.638484f, -0.709825f, -0.297469f},
{ -0.942191f, 0.328784f, 0.064638f},
{ 0.971695f, 0.107628f, -0.210297f},
{ 0.773093f, -0.607676f, -0.181818f},
{ -0.277820f, 0.805233f, 0.523847f},
{ -0.860793f, -0.295466f, -0.414409f},
{ -0.576609f, -0.809490f, -0.110675f},
{ 0.854874f, -0.496710f, 0.149899f},
{ 0.819450f, -0.456363f, 0.346747f},
{ -0.581581f, 0.678090f, -0.449398f},
{ -0.612444f, 0.787703f, -0.066605f},
{ 0.646609f, 0.676954f, 0.351610f},
{ 0.908030f, 0.372900f, 0.190859f},
{ 0.934263f, 0.353011f, -0.050365f},
{ 0.560186f, -0.423327f, -0.712029f},
{ -0.580238f, -0.332419f, -0.743520f},
{ -0.927351f, 0.341937f, -0.151982f},
{ -0.002282f, -0.434888f, 0.900482f},
{ -0.000496f, -0.435473f, 0.900202f},
{ -0.001804f, -0.435044f, 0.900407f},
{ -0.000042f, -0.435621f, 0.900130f},
{ -0.879163f, -0.166610f, -0.446445f},
{ -0.385472f, 0.709552f, -0.589871f},
{ 0.828729f, -0.293115f, -0.476752f},
{ 0.339427f, 0.719998f, -0.605303f},
{ 0.676615f, 0.734951f, -0.045151f},
{ 0.826032f, 0.561709f, -0.046411f},
{ 0.249075f, 0.612769f, -0.749984f},
{ -0.156547f, 0.401645f, -0.902316f},
{ 0.813301f, 0.250558f, -0.525131f},
{ 0.560057f, 0.821284f, 0.108758f},
{ 0.541769f, -0.540013f, -0.644105f},
{ 0.719323f, -0.692190f, -0.058726f},
{ 0.496029f, 0.604213f, -0.623604f},
{ 0.467580f, -0.881655f, 0.063672f},
{ 0.951342f, 0.211280f, -0.224297f},
{ 0.433637f, 0.874664f, -0.216614f},
{ 0.686619f, 0.724922f, 0.055159f},
{ 0.961668f, -0.061712f, 0.267182f},
{ 0.599382f, -0.777527f, -0.190243f},
{ 0.326131f, -0.634748f, -0.700524f},
{ 0.617610f, 0.596539f, -0.512542f},
{ 0.069954f, -0.815807f, 0.574078f},
{ 0.386933f, 0.596266f, 0.703385f},
{ -0.100021f, -0.792098f, 0.602143f},
{ 0.048719f, 0.803913f, 0.592748f},
{ 0.380832f, 0.569351f, -0.728565f},
{ -0.160511f, -0.424789f, -0.890949f},
{ -0.399439f, -0.798286f, -0.450764f},
{ 0.082984f, 0.693875f, -0.715298f},
{ 0.226656f, -0.103733f, 0.968435f},
{ 0.629664f, 0.776019f, 0.036298f},
{ -0.621354f, -0.767218f, 0.159045f},
{ 0.834324f, -0.538623f, -0.117431f},
{ -0.839628f, -0.539678f, -0.061424f},
{ 0.903380f, -0.394805f, -0.167431f},
{ 0.868774f, 0.386359f, -0.309771f},
{ 0.739355f, 0.670050f, 0.066237f},
{ -0.813360f, 0.576422f, -0.078632f},
{ -0.618315f, 0.767588f, 0.168804f},
{ -0.858930f, -0.420290f, -0.292569f},
{ -0.925882f, 0.300866f, 0.228524f},
{ 0.360715f, -0.516804f, -0.776401f},
{ 0.784412f, 0.388682f, -0.483348f},
{ 0.450640f, -0.433660f, 0.780297f},
{ 0.449501f, -0.434052f, 0.780735f},
{ 0.446210f, -0.435181f, 0.781994f},
{ 0.445008f, -0.435591f, 0.782450f},
{ 0.026541f, 0.745289f, -0.666213f},
{ 0.486079f, -0.172813f, -0.856658f},
{ -0.969333f, -0.223165f, 0.102915f},
{ -0.644038f, 0.724769f, -0.244797f},
{ 0.084981f, 0.992369f, 0.089346f},
{ 0.048428f, 0.996962f, 0.060999f},
{ 0.070953f, 0.994388f, 0.078473f},
{ 0.034944f, 0.998111f, 0.050529f},
{ -0.651868f, 0.693657f, 0.306444f},
{ -0.652539f, 0.689255f, 0.314834f},
{ -0.652477f, 0.689683f, 0.314025f},
{ -0.653071f, 0.685403f, 0.322059f}};

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


//Vertices: 238  Texture Co-ords: 170  Normals: 123  Texture: RagDeath5.mtl Faces: 168 Smooth Groups: 16 sucess: 92 Doubles: 76 Redos needed: 123 Correct: 105