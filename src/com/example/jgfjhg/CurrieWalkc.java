package com.example.jgfjhg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;
import android.graphics.Bitmap;
import android.opengl.GLUtils;

class CurrieWalkc {

static String TextureName = "CurrieWalk3.mtl";

static int Vertices = 176;

static int VertTexts = 138;

static int Normals = 108;

static int Faces = 164;

static int FacesB = 0;

static int SmoothGroups = 11;

static float VertArray[] = new float[]{
 3.146240f, 4.495993f, 3.106989f,
 3.100459f, 1.976508f, 1.451655f,
 2.413936f, 5.179181f, 2.053269f,
 2.368613f, 2.661545f, 0.396755f,
 1.158196f, 5.528290f, 1.447116f,
 1.136134f, 5.974168f, -0.390048f,
 -0.915940f, 5.295838f, 1.544187f,
 -0.840881f, 6.182012f, -0.214392f,
 0.133539f, 5.401487f, 1.318775f,
 0.785677f, 5.510273f, 0.512972f,
 0.118019f, 5.601360f, 0.007257f,
 0.129481f, 6.176740f, 1.870291f,
 1.186627f, 6.418976f, 0.838996f,
 0.135656f, 6.813355f, -0.260737f,
 0.123550f, 7.278601f, 1.875386f,
 0.998833f, 7.324339f, 1.033743f,
 0.133463f, 7.697764f, 0.133564f,
 0.129625f, 7.362095f, 0.805052f,
 0.574405f, 7.204516f, 0.471596f,
 0.133516f, 6.938070f, 0.119469f,
 0.130870f, 8.054227f, 0.585735f,
 0.758803f, 7.675306f, 0.091660f,
 0.134819f, 7.291512f, -0.411179f,
 0.133665f, 8.321584f, 0.110185f,
 0.577801f, 8.022408f, -0.179266f,
 0.135703f, 7.779613f, -0.594796f,
 0.198840f, 3.096861f, 0.756558f,
 -0.139489f, 2.784124f, -0.650406f,
 0.640920f, 0.000164f, 1.763466f,
 -0.410233f, 0.000178f, -1.299849f,
 0.104641f, 4.650684f, 1.538639f,
 0.125009f, 5.644358f, -0.451710f,
 0.134656f, 5.571735f, 1.255508f,
 0.122087f, 5.977479f, 0.002685f,
 0.719074f, 5.786758f, 0.617458f,
 0.465082f, 5.706800f, 0.930911f,
 0.447382f, 5.882066f, 0.195898f,
 0.829461f, 3.081271f, 0.434334f,
 0.933232f, 2.978750f, -0.108841f,
 1.831376f, 0.000165f, -0.670229f,
 1.800284f, -0.000155f, 0.822445f,
 0.448693f, 2.827147f, -0.610686f,
 1.082702f, -0.000153f, -1.268810f,
 0.977083f, 4.805855f, 1.281231f,
 1.552828f, 5.398940f, 0.448381f,
 1.186887f, 5.562159f, -0.196004f,
 2.394864f, 3.301148f, 1.874598f,
 1.833696f, 3.966984f, 0.848059f,
 1.850574f, 4.268384f, 1.141284f,
 2.411407f, 3.602637f, 2.167429f,
 0.905693f, 4.888691f, 0.055126f,
 0.904993f, 4.818835f, 0.463166f,
 2.193776f, 4.430009f, 1.233965f,
 2.953273f, 3.625877f, 2.498058f,
 0.871437f, 5.311750f, 0.775302f,
 2.372483f, 4.431676f, 0.910098f,
 3.312003f, 3.748389f, 1.954745f,
 1.683173f, 5.385972f, 0.382927f,
 2.355757f, 4.130870f, 0.622130f,
 3.295456f, 3.446908f, 1.661791f,
 1.667969f, 5.206558f, -0.031605f,
 2.159437f, 3.816498f, 0.639370f,
 2.919496f, 3.010313f, 1.900007f,
 0.877376f, 5.621345f, -0.040006f,
 -0.555954f, 3.065854f, 0.629797f,
 -0.852022f, -0.000163f, 1.732484f,
 -1.793007f, 0.000165f, 0.573459f,
 -0.974389f, 3.008576f, -0.069737f,
 -1.569616f, -0.000164f, -0.358750f,
 -0.668409f, 2.850869f, -0.442381f,
 -1.309025f, 5.472341f, 0.455228f,
 -0.842815f, 4.850740f, 1.283479f,
 -0.937739f, 5.646257f, -0.186775f,
 -0.454038f, 5.782149f, 0.687502f,
 -0.197030f, 5.708492f, 0.946216f,
 -0.207826f, 5.900340f, 0.255448f,
 -2.331560f, 3.809282f, -0.217415f,
 -2.215037f, 3.933220f, 0.167068f,
 -1.675831f, 4.766173f, -0.557919f,
 -1.739507f, 4.748420f, -0.980315f,
 -0.695407f, 4.859108f, 0.457566f,
 -0.690987f, 4.931713f, 0.052201f,
 -2.673220f, 3.910391f, 0.606560f,
 -1.988234f, 4.846457f, -0.361656f,
 -0.632815f, 5.344440f, 0.781222f,
 -3.048340f, 4.346573f, 0.277822f,
 -2.141843f, 5.117415f, -0.490574f,
 -1.433062f, 5.438128f, 0.560843f,
 -3.164794f, 4.223369f, -0.106382f,
 -2.211611f, 5.105247f, -0.970312f,
 -1.312624f, 5.816768f, 0.350591f,
 -2.911255f, 3.658564f, -0.179330f,
 -2.121510f, 4.785356f, -1.140167f,
 -0.625779f, 5.660153f, -0.036538f,
 -0.531299f, 5.490885f, 0.603252f,
 -0.926251f, 6.417679f, 0.841854f,
 -0.741942f, 7.324160f, 1.024931f,
 -0.310995f, 7.204411f, 0.468496f,
 -0.490256f, 7.676448f, 0.092187f,
 -0.306256f, 8.026713f, -0.172617f,
 -0.564026f, 1.600974f, 1.617549f,
 0.554789f, 1.497926f, 1.702671f,
 1.462140f, 1.561103f, 1.038155f,
 1.492542f, 1.556099f, 0.259327f,
 0.886541f, 1.296517f, -0.379511f,
 -0.139526f, 1.186303f, -0.391182f,
 -0.993201f, 1.317531f, 0.136372f,
 -1.269312f, 1.570628f, 0.760766f,
 2.394864f, 3.301148f, 1.874598f,
 2.394864f, 3.301148f, 1.874598f,
 1.833696f, 3.966984f, 0.848059f,
 1.833696f, 3.966984f, 0.848059f,
 0.905693f, 4.888691f, 0.055126f,
 0.905693f, 4.888691f, 0.055126f,
 2.919496f, 3.010313f, 1.900007f,
 2.919496f, 3.010313f, 1.900007f,
 -0.139526f, 1.186303f, -0.391182f,
 -0.139526f, 1.186303f, -0.391182f,
 -0.139489f, 2.784124f, -0.650406f,
 0.554789f, 1.497926f, 1.702671f,
 0.554789f, 1.497926f, 1.702671f,
 0.198840f, 3.096861f, 0.756558f,
 0.198840f, 3.096861f, 0.756558f,
 0.104641f, 4.650684f, 1.538639f,
 0.104641f, 4.650684f, 1.538639f,
 -0.139489f, 2.784124f, -0.650406f,
 0.125009f, 5.644358f, -0.451710f,
 0.125009f, 5.644358f, -0.451710f,
 0.104641f, 4.650684f, 1.538639f,
 0.134656f, 5.571735f, 1.255508f,
 0.134656f, 5.571735f, 1.255508f,
 0.125009f, 5.644358f, -0.451710f,
 0.125009f, 5.644358f, -0.451710f,
 0.122087f, 5.977479f, 0.002685f,
 -2.331560f, 3.809282f, -0.217415f,
 -2.331560f, 3.809282f, -0.217415f,
 -1.739507f, 4.748420f, -0.980315f,
 -0.690987f, 4.931713f, 0.052201f,
 -0.690987f, 4.931713f, 0.052201f,
 -1.739507f, 4.748420f, -0.980315f,
 -2.911255f, 3.658564f, -0.179330f,
 -2.911255f, 3.658564f, -0.179330f,
 0.129481f, 6.176740f, 1.870291f,
 0.133539f, 5.401487f, 1.318775f,
 0.133539f, 5.401487f, 1.318775f,
 0.135656f, 6.813355f, -0.260737f,
 0.118019f, 5.601360f, 0.007257f,
 0.118019f, 5.601360f, 0.007257f,
 0.123550f, 7.278601f, 1.875386f,
 0.129481f, 6.176740f, 1.870291f,
 0.129481f, 6.176740f, 1.870291f,
 0.135656f, 6.813355f, -0.260737f,
 0.135656f, 6.813355f, -0.260737f,
 0.133463f, 7.697764f, 0.133564f,
 0.133463f, 7.697764f, 0.133564f,
 0.123550f, 7.278601f, 1.875386f,
 0.130870f, 8.054227f, 0.585735f,
 0.130870f, 8.054227f, 0.585735f,
 0.129625f, 7.362095f, 0.805052f,
 0.134819f, 7.291512f, -0.411179f,
 0.133516f, 6.938070f, 0.119469f,
 0.133516f, 6.938070f, 0.119469f,
 0.133665f, 8.321584f, 0.110185f,
 0.130870f, 8.054227f, 0.585735f,
 0.130870f, 8.054227f, 0.585735f,
 0.135703f, 7.779613f, -0.594796f,
 0.134819f, 7.291512f, -0.411179f,
 0.134819f, 7.291512f, -0.411179f,
 0.135703f, 7.779613f, -0.594796f,
 0.133665f, 8.321584f, 0.110185f,
 0.554789f, 1.497926f, 1.702671f,
 0.640920f, 0.000164f, 1.763466f,
 0.640920f, 0.000164f, 1.763466f,
 -0.410233f, 0.000178f, -1.299849f,
 -0.410233f, 0.000178f, -1.299849f,
 -0.139526f, 1.186303f, -0.391182f,};

static float VertArrayB[] = new float[]{};

static float[] TextArray = new float[]{
 0.375318f, 0.765676f,
 0.726555f, 0.762717f,
 0.377036f, 0.969692f,
 0.728274f, 0.966733f,
 0.751372f, 0.748217f,
 0.983685f, 0.748217f,
 0.751372f, 0.980530f,
 0.983685f, 0.980530f,
 0.058710f, 0.738044f,
 0.188314f, 0.734887f,
 0.298759f, 0.731781f,
 0.012084f, 0.850170f,
 0.178645f, 0.832921f,
 0.349294f, 0.881601f,
 0.055351f, 0.984595f,
 0.176141f, 0.925991f,
 0.293720f, 0.997210f,
 0.872342f, 0.403154f,
 0.924498f, 0.397358f,
 0.984533f, 0.402409f,
 0.860112f, 0.467764f,
 0.930985f, 0.444975f,
 0.995345f, 0.462955f,
 0.884231f, 0.506639f,
 0.927176f, 0.482453f,
 0.975989f, 0.504915f,
 0.559083f, 0.419261f,
 0.854419f, 0.422899f,
 0.437548f, 0.046585f,
 0.993325f, 0.069860f,
 0.542471f, 0.638121f,
 0.858956f, 0.685943f,
 0.609025f, 0.737908f,
 0.820745f, 0.740206f,
 0.726012f, 0.731222f,
 0.663006f, 0.736147f,
 0.774517f, 0.737078f,
 0.640628f, 0.408432f,
 0.731389f, 0.404769f,
 0.747247f, 0.006134f,
 0.590414f, 0.010997f,
 0.792625f, 0.411168f,
 0.845019f, 0.023161f,
 0.623727f, 0.626072f,
 0.715423f, 0.645094f,
 0.772830f, 0.657102f,
 0.060226f, 0.152330f,
 0.062324f, 0.359205f,
 0.128458f, 0.361265f,
 0.122794f, 0.145753f,
 0.057239f, 0.548531f,
 0.120907f, 0.563080f,
 0.184346f, 0.334298f,
 0.174400f, 0.059940f,
 0.194282f, 0.653636f,
 0.244613f, 0.345557f,
 0.234830f, 0.122695f,
 0.244885f, 0.547684f,
 0.315355f, 0.343710f,
 0.291114f, 0.133239f,
 0.302843f, 0.546952f,
 0.375118f, 0.328689f,
 0.347131f, 0.062291f,
 0.362179f, 0.641571f,
 0.640628f, 0.408432f,
 0.590414f, 0.010997f,
 0.747247f, 0.006134f,
 0.731389f, 0.404769f,
 0.845019f, 0.023161f,
 0.792625f, 0.411168f,
 0.715423f, 0.645094f,
 0.623727f, 0.626072f,
 0.772830f, 0.657102f,
 0.726012f, 0.731222f,
 0.663006f, 0.736147f,
 0.774517f, 0.737078f,
 0.060226f, 0.152330f,
 0.122794f, 0.145753f,
 0.128458f, 0.361265f,
 0.062324f, 0.359205f,
 0.120907f, 0.563080f,
 0.057239f, 0.548531f,
 0.174400f, 0.059940f,
 0.184346f, 0.334298f,
 0.194282f, 0.653636f,
 0.234830f, 0.122695f,
 0.244613f, 0.345557f,
 0.244885f, 0.547684f,
 0.291114f, 0.133239f,
 0.315355f, 0.343710f,
 0.302843f, 0.546952f,
 0.347131f, 0.062291f,
 0.375118f, 0.328689f,
 0.362179f, 0.641571f,
 0.188314f, 0.734887f,
 0.178645f, 0.832921f,
 0.176141f, 0.925991f,
 0.924498f, 0.397358f,
 0.930985f, 0.444975f,
 0.927176f, 0.482453f,
 0.615686f, 0.211026f,
 0.498717f, 0.234153f,
 0.615686f, 0.211026f,
 0.739266f, 0.206767f,
 0.818649f, 0.218445f,
 0.923414f, 0.247544f,
 0.818649f, 0.218445f,
 0.739266f, 0.206767f,
 0.422822f, 0.123268f,
 0.422822f, 0.123268f,
 0.430455f, 0.354593f,
 0.430455f, 0.354593f,
 0.448956f, 0.557990f,
 0.448956f, 0.557990f,
 0.033925f, 0.060990f,
 0.033925f, 0.060990f,
 0.923414f, 0.247544f,
 0.923414f, 0.247544f,
 0.854419f, 0.422899f,
 0.498717f, 0.234153f,
 0.498717f, 0.234153f,
 0.559083f, 0.419261f,
 0.559083f, 0.419261f,
 0.542471f, 0.638121f,
 0.542471f, 0.638121f,
 0.854419f, 0.422899f,
 0.858956f, 0.685943f,
 0.858956f, 0.685943f,
 0.542471f, 0.638121f,
 0.609025f, 0.737908f,
 0.609025f, 0.737908f,
 0.858956f, 0.685943f,
 0.858956f, 0.685943f,
 0.820745f, 0.740206f,
 0.422822f, 0.123268f,
 0.422822f, 0.123268f,
 0.430455f, 0.354593f,
 0.448956f, 0.557990f,
 0.448956f, 0.557990f,
 0.430455f, 0.354593f,
 0.033925f, 0.060990f,
 0.033925f, 0.060990f,
 0.012084f, 0.850170f,
 0.058710f, 0.738044f,
 0.058710f, 0.738044f,
 0.349294f, 0.881601f,
 0.298759f, 0.731781f,
 0.298759f, 0.731781f,
 0.055351f, 0.984595f,
 0.012084f, 0.850170f,
 0.012084f, 0.850170f,
 0.349294f, 0.881601f,
 0.349294f, 0.881601f,
 0.293720f, 0.997210f,
 0.293720f, 0.997210f,
 0.055351f, 0.984595f,
 0.860112f, 0.467764f,
 0.860112f, 0.467764f,
 0.872342f, 0.403154f,
 0.995345f, 0.462955f,
 0.984533f, 0.402409f,
 0.984533f, 0.402409f,
 0.884231f, 0.506639f,
 0.860112f, 0.467764f,
 0.860112f, 0.467764f,
 0.975989f, 0.504915f,
 0.995345f, 0.462955f,
 0.995345f, 0.462955f,
 0.975989f, 0.504915f,
 0.884231f, 0.506639f,
 0.498717f, 0.234153f,
 0.437548f, 0.046585f,
 0.437548f, 0.046585f,
 0.993325f, 0.069860f,
 0.993325f, 0.069860f,
 0.923414f, 0.247544f,};

static float[] TextArrayB = new float[]{};

static float[][] NormArray = new float[][]{
{ 0.863811f, 0.265589f, -0.428127f},
{ 0.864158f, 0.265537f, -0.427458f},
{ 0.863950f, 0.265568f, -0.427860f},
{ 0.864297f, 0.265517f, -0.427191f},
{ -0.097326f, 0.966907f, 0.235836f},
{ 0.013353f, 0.939061f, 0.343492f},
{ 0.021528f, 0.936083f, 0.351121f},
{ 0.132841f, 0.882820f, 0.450536f},
{ 0.795042f, 0.291757f, 0.531776f},
{ 0.898870f, 0.314333f, -0.305333f},
{ 0.779002f, 0.129418f, 0.613520f},
{ 0.915126f, -0.018049f, -0.402764f},
{ 0.308524f, 0.342428f, -0.887443f},
{ 0.355107f, -0.009255f, -0.934780f},
{ -0.154187f, -0.010490f, -0.987986f},
{ -0.247638f, 0.299632f, -0.921356f},
{ 0.257994f, 0.291095f, 0.921251f},
{ 0.138398f, 0.068253f, 0.988022f},
{ 0.995016f, 0.036917f, 0.092634f},
{ 0.691340f, -0.200398f, 0.694183f},
{ 0.006639f, -0.219422f, 0.975608f},
{ 0.001080f, 0.210819f, -0.977525f},
{ 0.557746f, 0.190967f, -0.807745f},
{ 0.472955f, 0.767797f, 0.432206f},
{ 0.519894f, 0.549699f, 0.653867f},
{ 0.021021f, 0.440518f, 0.897498f},
{ -0.053112f, 0.805191f, -0.590633f},
{ 0.285243f, 0.912274f, -0.293926f},
{ -0.673023f, 0.116813f, 0.730339f},
{ -0.772757f, -0.001481f, 0.634700f},
{ -0.684759f, -0.725453f, 0.069454f},
{ -0.758251f, -0.649660f, 0.054749f},
{ 0.190473f, -0.310057f, -0.931442f},
{ -0.570107f, -0.704005f, 0.423503f},
{ 0.226243f, 0.409924f, 0.883616f},
{ 0.074614f, 0.768402f, 0.635603f},
{ -0.022162f, 0.523427f, 0.851782f},
{ 0.753906f, 0.612822f, 0.236800f},
{ 0.789844f, 0.598026f, -0.136055f},
{ 0.401626f, 0.873356f, 0.275584f},
{ 0.757916f, -0.330889f, -0.562207f},
{ 0.713096f, 0.001237f, -0.701065f},
{ 0.145473f, -0.012536f, -0.989283f},
{ 0.189527f, -0.963493f, -0.189108f},
{ -0.015605f, -0.707307f, -0.706734f},
{ 0.512487f, 0.551207f, -0.658428f},
{ -0.000047f, -0.298965f, 0.954264f},
{ 0.024097f, -0.603416f, 0.797063f},
{ 0.995584f, -0.088492f, -0.031323f},
{ 0.923326f, -0.354014f, -0.148805f},
{ 0.005593f, 0.082920f, -0.996541f},
{ -0.025062f, -0.180377f, -0.983278f},
{ -0.005896f, 0.555871f, 0.831248f},
{ 0.785342f, 0.597545f, 0.161795f},
{ 0.002425f, 0.869517f, -0.493898f},
{ -0.003721f, 0.302074f, 0.953277f},
{ 0.935463f, -0.137655f, 0.325516f},
{ 0.001706f, 0.598414f, 0.801185f},
{ 0.999113f, 0.026845f, 0.032443f},
{ 0.000467f, -0.829093f, -0.559110f},
{ -0.002339f, -0.658885f, -0.752240f},
{ 0.006520f, 0.999913f, 0.011434f},
{ 0.735357f, 0.540316f, -0.409035f},
{ -0.005759f, 0.172314f, -0.985025f},
{ -0.994176f, -0.015142f, -0.106703f},
{ -0.909348f, 0.288331f, 0.299920f},
{ -0.592480f, 0.062400f, 0.803165f},
{ -0.378382f, 0.322958f, 0.867482f},
{ -0.521259f, -0.019736f, -0.853170f},
{ -0.681674f, 0.256961f, -0.685049f},
{ -0.705378f, -0.120703f, 0.698479f},
{ -0.987216f, 0.146164f, 0.063569f},
{ -0.527802f, 0.238747f, -0.815123f},
{ -0.424726f, 0.780849f, 0.458129f},
{ -0.437673f, 0.594681f, 0.674387f},
{ -0.238039f, 0.942548f, -0.234396f},
{ 0.633104f, -0.385386f, -0.671310f},
{ 0.428253f, -0.890911f, 0.151254f},
{ 0.413706f, -0.802372f, -0.430170f},
{ 0.770786f, -0.375290f, 0.514826f},
{ 0.606943f, -0.440399f, -0.661566f},
{ -0.384542f, -0.644551f, 0.660819f},
{ -0.013965f, -0.041050f, 0.999059f},
{ 0.030339f, -0.032843f, 0.999000f},
{ -0.217775f, -0.051039f, 0.974664f},
{ -0.471896f, 0.589811f, 0.655315f},
{ -0.660216f, 0.681438f, 0.315843f},
{ -0.539875f, -0.250957f, 0.803465f},
{ -0.887966f, 0.135247f, -0.439572f},
{ -0.315978f, 0.724885f, -0.612127f},
{ -0.198549f, 0.972683f, -0.120279f},
{ -0.044357f, 0.035597f, -0.998381f},
{ -0.498882f, -0.695975f, -0.516465f},
{ 0.346929f, 0.687134f, -0.638347f},
{ -0.996094f, -0.077722f, -0.041905f},
{ -0.924333f, -0.371827f, -0.085752f},
{ -0.787847f, 0.596972f, 0.151401f},
{ -0.999417f, 0.025652f, 0.022535f},
{ -0.939389f, -0.138748f, 0.313525f},
{ -0.733984f, 0.541601f, -0.409800f},
{ -0.465913f, 0.146444f, 0.872628f},
{ 0.313985f, 0.055505f, 0.947804f},
{ 0.913010f, 0.145065f, 0.381273f},
{ 0.796696f, 0.430231f, -0.424473f},
{ 0.217823f, 0.569283f, -0.792761f},
{ -0.247552f, 0.576229f, -0.778896f},
{ -0.698173f, 0.462408f, -0.546565f},
{ -0.928674f, 0.281322f, 0.241709f}};

static int[] FaceArray = new int[]{
0, 1, 2,
2, 1, 3,
4, 5, 6,
6, 5, 7,
102, 103, 37,
37, 103, 38,
103, 104, 38,
38, 104, 41,
27, 41, 105,
105, 41, 104,
102, 37, 101,
101, 37, 26,
44, 43, 38,
38, 43, 37,
43, 30, 37,
37, 30, 26,
27, 31, 41,
41, 31, 45,
41, 45, 38,
38, 45, 44,
44, 34, 43,
43, 34, 35,
35, 32, 43,
43, 32, 30,
33, 36, 31,
31, 36, 45,
36, 34, 45,
45, 34, 44,
49, 48, 46,
46, 48, 47,
47, 48, 50,
50, 48, 51,
53, 52, 49,
49, 52, 48,
48, 52, 51,
51, 52, 54,
53, 56, 52,
52, 56, 55,
55, 57, 52,
52, 57, 54,
56, 59, 55,
55, 59, 58,
58, 60, 55,
55, 60, 57,
62, 61, 59,
59, 61, 58,
58, 61, 60,
60, 61, 63,
62, 108, 61,
61, 109, 110,
111, 112, 61,
61, 113, 63,
63, 54, 60,
60, 54, 57,
59, 56, 62,
62, 56, 53,
53, 49, 114,
115, 49, 46,
11, 8, 12,
12, 8, 9,
13, 12, 10,
10, 12, 9,
14, 11, 15,
15, 11, 12,
12, 13, 15,
15, 13, 16,
16, 14, 15,
17, 18, 20,
20, 18, 21,
18, 19, 21,
21, 19, 22,
23, 20, 24,
24, 20, 21,
21, 22, 24,
24, 22, 25,
25, 23, 24,
67, 107, 64,
64, 107, 100,
69, 106, 67,
67, 106, 107,
106, 69, 116,
117, 69, 118,
100, 119, 64,
64, 120, 121,
64, 71, 67,
67, 71, 70,
122, 123, 64,
64, 124, 71,
125, 69, 126,
127, 69, 72,
69, 67, 72,
72, 67, 70,
70, 71, 73,
73, 71, 74,
128, 129, 71,
71, 130, 74,
72, 75, 131,
132, 75, 133,
70, 73, 72,
72, 73, 75,
79, 78, 76,
76, 78, 77,
79, 81, 78,
78, 81, 80,
78, 83, 77,
77, 83, 82,
78, 80, 83,
83, 80, 84,
82, 83, 85,
85, 83, 86,
84, 87, 83,
83, 87, 86,
85, 86, 88,
88, 86, 89,
87, 90, 86,
86, 90, 89,
89, 92, 88,
88, 92, 91,
89, 90, 92,
92, 90, 93,
91, 92, 134,
135, 92, 136,
93, 137, 92,
92, 138, 139,
93, 90, 84,
84, 90, 87,
88, 91, 85,
85, 91, 82,
76, 77, 140,
141, 77, 82,
142, 95, 143,
144, 95, 94,
145, 146, 95,
95, 147, 94,
148, 96, 149,
150, 96, 95,
95, 96, 151,
152, 96, 153,
154, 96, 155,
98, 97, 156,
157, 97, 158,
159, 160, 98,
98, 161, 97,
162, 99, 163,
164, 99, 98,
165, 166, 99,
99, 167, 98,
168, 99, 169,
65, 28, 100,
100, 28, 170,
40, 102, 171,
172, 102, 101,
103, 102, 39,
39, 102, 40,
104, 103, 42,
42, 103, 39,
105, 104, 29,
29, 104, 42,
68, 106, 173,
174, 106, 175,
106, 68, 107,
107, 68, 66,
107, 66, 100,
100, 66, 65, };

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


//Vertices: 176  Texture Co-ords: 138  Normals: 108  Texture: CurrieWalk3.mtl Faces: 164 Smooth Groups: 11 sucess: 117 Doubles: 47 Redos needed: 68 Correct: 73