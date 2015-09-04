package com.example.jgfjhg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;
import android.graphics.Bitmap;
import android.opengl.GLUtils;

class CurrieBlocka {

static String TextureName = "CurrieBlock1.mtl";

static int Vertices = 176;

static int VertTexts = 138;

static int Normals = 108;

static int Faces = 164;

static int FacesB = 0;

static int SmoothGroups = 11;

static float VertArray[] = new float[]{
 1.690873f, 4.111471f, 4.007287f,
 2.619374f, 1.735353f, 2.401156f,
 1.378824f, 4.804517f, 2.767507f,
 2.308053f, 2.430638f, 1.158915f,
 0.661207f, 5.150879f, 1.602289f,
 1.005930f, 5.592844f, -0.220118f,
 -1.369243f, 4.956103f, 1.270400f,
 -0.955789f, 5.750703f, -0.418322f,
 -0.281389f, 5.020296f, 1.271042f,
 0.501957f, 5.121925f, 0.602810f,
 -0.061100f, 5.199140f, -0.004293f,
 -0.194491f, 5.814814f, 1.816811f,
 0.875394f, 6.030708f, 0.767396f,
 -0.201405f, 6.391808f, -0.328138f,
 -0.163662f, 6.919507f, 1.793072f,
 0.691473f, 6.940430f, 0.930514f,
 -0.188802f, 7.288216f, 0.042143f,
 -0.182828f, 6.971563f, 0.720903f,
 0.254346f, 6.804271f, 0.382374f,
 -0.194854f, 6.527606f, 0.048152f,
 -0.187110f, 7.656961f, 0.481410f,
 0.431338f, 7.264068f, -0.013594f,
 -0.185810f, 6.867494f, -0.488109f,
 -0.190819f, 7.911013f, 0.000185f,
 0.248218f, 7.603796f, -0.288058f,
 -0.186127f, 7.350626f, -0.684931f,
 -0.153661f, 2.733941f, 0.634494f,
 0.454714f, 2.249215f, -0.513925f,
 -1.222502f, 0.000165f, 1.332232f,
 1.067572f, 0.000182f, -0.957823f,
 -0.454269f, 4.257531f, 1.452956f,
 0.226181f, 5.254929f, -0.416132f,
 -0.268738f, 5.188962f, 1.206779f,
 -0.061058f, 5.575469f, -0.014252f,
 0.410744f, 5.400030f, 0.688991f,
 0.102454f, 5.321515f, 0.952959f,
 0.272561f, 5.491986f, 0.282691f,
 0.514818f, 2.657945f, 0.870768f,
 0.976903f, 2.476673f, 0.555921f,
 1.486753f, 0.000165f, 1.332478f,
 0.132190f, -0.000159f, 1.960327f,
 0.857352f, 2.289111f, -0.080913f,
 1.695563f, -0.000164f, 0.396978f,
 0.450230f, 4.435063f, 1.509959f,
 1.262665f, 5.044170f, 0.921905f,
 1.139294f, 5.201319f, 0.189767f,
 1.653991f, 2.952625f, 2.534879f,
 1.487297f, 3.642039f, 1.390732f,
 1.347584f, 3.919732f, 1.674416f,
 1.514138f, 3.230425f, 2.818091f,
 0.803785f, 4.518085f, 0.333108f,
 0.663732f, 4.447760f, 0.716957f,
 1.601199f, 4.104336f, 1.906423f,
 1.867031f, 3.277846f, 3.344057f,
 0.512402f, 4.938777f, 0.994904f,
 1.894970f, 4.147587f, 1.685829f,
 2.399295f, 3.475322f, 3.002689f,
 1.375554f, 5.072762f, 0.951921f,
 2.033019f, 3.870841f, 1.407063f,
 2.539169f, 3.197522f, 2.719401f,
 1.551843f, 4.925668f, 0.562657f,
 1.884999f, 3.539255f, 1.330953f,
 2.152586f, 2.710629f, 2.765747f,
 0.791307f, 5.250280f, 0.229407f,
 -0.632611f, 2.698901f, 0.057921f,
 -1.850553f, -0.000160f, -0.022530f,
 -1.222759f, 0.000165f, -1.377033f,
 -0.586058f, 2.543162f, -0.616953f,
 -0.287188f, -0.000163f, -1.585893f,
 -0.067663f, 2.348165f, -0.733469f,
 -1.426812f, 5.045000f, -0.058571f,
 -1.260767f, 4.434583f, 0.886160f,
 -0.861484f, 5.228361f, -0.533410f,
 -0.751227f, 5.392913f, 0.543088f,
 -0.541947f, 5.317665f, 0.839864f,
 -0.367602f, 5.503428f, 0.142161f,
 -2.102265f, 3.249183f, -0.876629f,
 -2.191570f, 3.483902f, -0.538198f,
 -1.227790f, 4.069339f, -1.026564f,
 -1.058702f, 3.925336f, -1.391809f,
 -0.840394f, 4.446076f, 0.167974f,
 -0.695645f, 4.520820f, -0.218749f,
 -2.810416f, 3.587306f, -0.438175f,
 -1.579490f, 4.200266f, -1.065207f,
 -0.903574f, 4.935049f, 0.483322f,
 -2.879974f, 3.900283f, -1.018034f,
 -1.597129f, 4.418573f, -1.321445f,
 -1.517187f, 5.048038f, -0.177682f,
 -2.791471f, 3.666374f, -1.355360f,
 -1.401612f, 4.262527f, -1.736844f,
 -1.251661f, 5.350677f, -0.368824f,
 -2.629193f, 3.109017f, -1.128153f,
 -1.285785f, 3.907712f, -1.739608f,
 -0.621764f, 5.250849f, -0.284708f,
 -0.813694f, 5.104124f, 0.456986f,
 -1.239238f, 6.030245f, 0.798408f,
 -1.049388f, 6.940365f, 0.961437f,
 -0.631140f, 6.804369f, 0.398595f,
 -0.817937f, 7.265599f, 0.010675f,
 -0.639417f, 7.607984f, -0.267425f,
 -1.644732f, 1.576873f, 0.183273f,
 -1.313923f, 1.387884f, 1.242298f,
 -0.364072f, 1.411305f, 1.848484f,
 0.648547f, 1.329277f, 1.610231f,
 0.668377f, 1.048622f, 0.764954f,
 0.131153f, 0.960713f, -0.130994f,
 -0.738646f, 1.170014f, -0.650639f,
 -1.417990f, 1.504560f, -0.533270f,
 1.653991f, 2.952625f, 2.534879f,
 1.653991f, 2.952625f, 2.534879f,
 1.487297f, 3.642039f, 1.390732f,
 1.487297f, 3.642039f, 1.390732f,
 0.803785f, 4.518085f, 0.333108f,
 0.803785f, 4.518085f, 0.333108f,
 2.152586f, 2.710629f, 2.765747f,
 2.152586f, 2.710629f, 2.765747f,
 0.131153f, 0.960713f, -0.130994f,
 0.131153f, 0.960713f, -0.130994f,
 0.454714f, 2.249215f, -0.513925f,
 -1.313923f, 1.387884f, 1.242298f,
 -1.313923f, 1.387884f, 1.242298f,
 -0.153661f, 2.733941f, 0.634494f,
 -0.153661f, 2.733941f, 0.634494f,
 -0.454269f, 4.257531f, 1.452956f,
 -0.454269f, 4.257531f, 1.452956f,
 0.454714f, 2.249215f, -0.513925f,
 0.226181f, 5.254929f, -0.416132f,
 0.226181f, 5.254929f, -0.416132f,
 -0.454269f, 4.257531f, 1.452956f,
 -0.268738f, 5.188962f, 1.206779f,
 -0.268738f, 5.188962f, 1.206779f,
 0.226181f, 5.254929f, -0.416132f,
 0.226181f, 5.254929f, -0.416132f,
 -0.061058f, 5.575469f, -0.014252f,
 -2.102265f, 3.249183f, -0.876629f,
 -2.102265f, 3.249183f, -0.876629f,
 -1.058702f, 3.925336f, -1.391809f,
 -0.695645f, 4.520820f, -0.218749f,
 -0.695645f, 4.520820f, -0.218749f,
 -1.058702f, 3.925336f, -1.391809f,
 -2.629193f, 3.109017f, -1.128153f,
 -2.629193f, 3.109017f, -1.128153f,
 -0.194491f, 5.814814f, 1.816811f,
 -0.281389f, 5.020296f, 1.271042f,
 -0.281389f, 5.020296f, 1.271042f,
 -0.201405f, 6.391808f, -0.328138f,
 -0.061100f, 5.199140f, -0.004293f,
 -0.061100f, 5.199140f, -0.004293f,
 -0.163662f, 6.919507f, 1.793072f,
 -0.194491f, 5.814814f, 1.816811f,
 -0.194491f, 5.814814f, 1.816811f,
 -0.201405f, 6.391808f, -0.328138f,
 -0.201405f, 6.391808f, -0.328138f,
 -0.188802f, 7.288216f, 0.042143f,
 -0.188802f, 7.288216f, 0.042143f,
 -0.163662f, 6.919507f, 1.793072f,
 -0.187110f, 7.656961f, 0.481410f,
 -0.187110f, 7.656961f, 0.481410f,
 -0.182828f, 6.971563f, 0.720903f,
 -0.185810f, 6.867494f, -0.488109f,
 -0.194854f, 6.527606f, 0.048152f,
 -0.194854f, 6.527606f, 0.048152f,
 -0.190819f, 7.911013f, 0.000185f,
 -0.187110f, 7.656961f, 0.481410f,
 -0.187110f, 7.656961f, 0.481410f,
 -0.186127f, 7.350626f, -0.684931f,
 -0.185810f, 6.867494f, -0.488109f,
 -0.185810f, 6.867494f, -0.488109f,
 -0.186127f, 7.350626f, -0.684931f,
 -0.190819f, 7.911013f, 0.000185f,
 -1.313923f, 1.387884f, 1.242298f,
 -1.222502f, 0.000165f, 1.332232f,
 -1.222502f, 0.000165f, 1.332232f,
 1.067572f, 0.000182f, -0.957823f,
 1.067572f, 0.000182f, -0.957823f,
 0.131153f, 0.960713f, -0.130994f,};

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
{ 0.925967f, 0.376942f, -0.022350f},
{ 0.926020f, 0.376862f, -0.021502f},
{ 0.925988f, 0.376910f, -0.022011f},
{ 0.926040f, 0.376830f, -0.021164f},
{ -0.127447f, 0.969158f, 0.210929f},
{ -0.055482f, 0.947077f, 0.316175f},
{ -0.049847f, 0.944696f, 0.324136f},
{ 0.028975f, 0.901706f, 0.431377f},
{ -0.200826f, 0.370872f, 0.906710f},
{ 0.590662f, 0.263767f, 0.762591f},
{ 0.129356f, 0.126004f, 0.983560f},
{ 0.974448f, -0.091518f, 0.205124f},
{ 0.884959f, 0.369015f, -0.284036f},
{ 0.859720f, -0.118902f, -0.496733f},
{ 0.578205f, -0.077283f, -0.812223f},
{ 0.662747f, 0.413868f, -0.624083f},
{ -0.731274f, 0.345514f, 0.588098f},
{ -0.557132f, 0.084182f, 0.826146f},
{ 0.895085f, 0.132608f, 0.425722f},
{ 0.383867f, -0.081295f, 0.919803f},
{ -0.373505f, -0.243169f, 0.895189f},
{ 0.343672f, 0.199592f, -0.917634f},
{ 0.784308f, 0.161066f, -0.599098f},
{ 0.252435f, 0.811181f, 0.527505f},
{ 0.373109f, 0.594137f, 0.712595f},
{ -0.240521f, 0.443533f, 0.863382f},
{ 0.036537f, 0.793828f, -0.607044f},
{ 0.323539f, 0.924384f, -0.202080f},
{ -0.921159f, -0.003996f, 0.389165f},
{ -0.950908f, -0.144826f, 0.273497f},
{ -0.563491f, -0.789049f, -0.244702f},
{ -0.627387f, -0.728868f, -0.274112f},
{ 0.492184f, -0.304549f, -0.815479f},
{ -0.663651f, -0.721611f, 0.197092f},
{ -0.203770f, 0.358628f, 0.910969f},
{ -0.273170f, 0.720924f, 0.636904f},
{ -0.396066f, 0.491553f, 0.775569f},
{ 0.514186f, 0.659806f, 0.547968f},
{ 0.700263f, 0.677870f, 0.223885f},
{ 0.193730f, 0.877317f, 0.439072f},
{ 0.954393f, -0.213922f, -0.208258f},
{ 0.931841f, 0.122884f, -0.341427f},
{ 0.557870f, 0.081728f, -0.825894f},
{ 0.361395f, -0.923942f, -0.125396f},
{ 0.359331f, -0.645668f, -0.673791f},
{ 0.652800f, 0.558590f, -0.511693f},
{ 0.031437f, -0.282030f, 0.958890f},
{ -0.083716f, -0.586611f, 0.805530f},
{ 0.996978f, -0.073915f, -0.023915f},
{ 0.914350f, -0.393226f, 0.096633f},
{ -0.052826f, 0.041786f, -0.997729f},
{ 0.050468f, -0.217135f, -0.974836f},
{ 0.022653f, 0.577143f, 0.816329f},
{ 0.791552f, 0.596679f, 0.131984f},
{ -0.007205f, 0.855093f, -0.518425f},
{ 0.017283f, 0.329912f, 0.943853f},
{ 0.942125f, -0.129669f, 0.309170f},
{ 0.014639f, 0.620086f, 0.784397f},
{ 0.999367f, 0.028261f, 0.021605f},
{ -0.023863f, -0.842217f, -0.538610f},
{ -0.009717f, -0.677889f, -0.735100f},
{ 0.005157f, 0.999845f, -0.016846f},
{ 0.730572f, 0.532987f, -0.426838f},
{ -0.019617f, 0.145184f, -0.989210f},
{ -0.651521f, 0.050151f, -0.756971f},
{ -0.687545f, 0.355316f, -0.633271f},
{ -0.939358f, 0.148042f, 0.309338f},
{ -0.929815f, 0.360117f, 0.075895f},
{ 0.182743f, -0.035356f, -0.982525f},
{ 0.281230f, 0.404234f, -0.870347f},
{ -0.896303f, -0.245241f, 0.369455f},
{ -0.953970f, 0.050158f, -0.295677f},
{ -0.243312f, 0.243354f, -0.938924f},
{ -0.608411f, 0.732590f, 0.305202f},
{ -0.603212f, 0.522596f, 0.602519f},
{ -0.181372f, 0.938286f, -0.294487f},
{ 0.813359f, -0.573811f, -0.095860f},
{ 0.219922f, -0.761017f, 0.610317f},
{ 0.448935f, -0.888663f, 0.093462f},
{ 0.309372f, -0.194258f, 0.930888f},
{ 0.912342f, -0.344660f, -0.221003f},
{ -0.586006f, -0.617924f, 0.524182f},
{ -0.536621f, 0.255788f, 0.804121f},
{ -0.511459f, 0.267783f, 0.816518f},
{ -0.700288f, -0.051939f, 0.711969f},
{ -0.649965f, 0.752423f, 0.106798f},
{ -0.612665f, 0.735265f, -0.289876f},
{ -0.898027f, -0.030312f, 0.438895f},
{ -0.484023f, -0.014218f, -0.874940f},
{ 0.178187f, 0.504975f, -0.844541f},
{ -0.101454f, 0.907831f, -0.406879f},
{ 0.465029f, -0.291645f, -0.835878f},
{ -0.248797f, -0.824852f, -0.507661f},
{ 0.579120f, 0.665493f, -0.470891f},
{ -0.994157f, -0.098603f, -0.043921f},
{ -0.902453f, -0.301085f, -0.308100f},
{ -0.782002f, 0.605497f, 0.147806f},
{ -0.999154f, 0.025132f, 0.032561f},
{ -0.932623f, -0.128053f, 0.337369f},
{ -0.738398f, 0.525049f, -0.423193f},
{ -0.990372f, 0.133861f, -0.035291f},
{ -0.733562f, -0.005944f, 0.679596f},
{ 0.090898f, 0.110384f, 0.989724f},
{ 0.737198f, 0.399837f, 0.544673f},
{ 0.705424f, 0.686555f, -0.176126f},
{ 0.481937f, 0.739310f, -0.470274f},
{ 0.177092f, 0.629073f, -0.756905f},
{ -0.555661f, 0.368439f, -0.745315f}};

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


//Vertices: 176  Texture Co-ords: 138  Normals: 108  Texture: CurrieBlock1.mtl Faces: 164 Smooth Groups: 11 sucess: 117 Doubles: 47 Redos needed: 68 Correct: 73