package com.example.jgfjhg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;
import android.graphics.Bitmap;
import android.opengl.GLUtils;

class CurrieAttacka {

static String TextureName = "CurrieAttack1.mtl";

static int Vertices = 176;

static int VertTexts = 138;

static int Normals = 108;

static int Faces = 164;

static int FacesB = 0;

static int SmoothGroups = 11;

static float VertArray[] = new float[]{
 1.865174f, 4.176893f, 3.973262f,
 2.453708f, 1.659693f, 2.422700f,
 1.524086f, 4.843321f, 2.726561f,
 2.113427f, 2.328436f, 1.173561f,
 0.686662f, 5.159800f, 1.596813f,
 0.993116f, 5.579075f, -0.224792f,
 -1.329452f, 4.901532f, 1.286975f,
 -0.985600f, 5.765354f, -0.388460f,
 -0.276400f, 5.018025f, 1.269647f,
 0.503569f, 5.124413f, 0.603902f,
 -0.061183f, 5.199606f, -0.005114f,
 -0.193493f, 5.815422f, 1.816803f,
 0.875780f, 6.030321f, 0.766895f,
 -0.201411f, 6.391805f, -0.328138f,
 -0.163662f, 6.919507f, 1.793072f,
 0.691490f, 6.940410f, 0.930489f,
 -0.188974f, 7.287929f, 0.041998f,
 -0.182828f, 6.971563f, 0.720903f,
 0.254344f, 6.804245f, 0.382354f,
 -0.194854f, 6.527606f, 0.048152f,
 -0.187110f, 7.656961f, 0.481410f,
 0.431280f, 7.263878f, -0.013717f,
 -0.186575f, 6.866895f, -0.488210f,
 -0.190957f, 7.910685f, -0.000009f,
 0.247984f, 7.603316f, -0.288327f,
 -0.187138f, 7.349664f, -0.685200f,
 -0.150656f, 2.736229f, 0.629875f,
 0.454408f, 2.251054f, -0.515793f,
 -1.222502f, 0.000166f, 1.332232f,
 1.067572f, 0.000182f, -0.957822f,
 -0.453472f, 4.257350f, 1.452565f,
 0.226181f, 5.254929f, -0.416132f,
 -0.265673f, 5.187358f, 1.206110f,
 -0.061398f, 5.575467f, -0.014814f,
 0.412485f, 5.400060f, 0.688273f,
 0.103487f, 5.321523f, 0.952759f,
 0.271994f, 5.491415f, 0.282189f,
 0.515999f, 2.665870f, 0.876529f,
 0.969967f, 2.491257f, 0.571040f,
 1.486753f, 0.000165f, 1.332478f,
 0.132191f, -0.000156f, 1.960329f,
 0.853761f, 2.292992f, -0.076024f,
 1.695562f, -0.000163f, 0.396979f,
 0.450230f, 4.435063f, 1.509959f,
 1.262665f, 5.044170f, 0.921905f,
 1.136394f, 5.198999f, 0.189347f,
 1.613699f, 2.965741f, 2.565361f,
 1.423876f, 3.619058f, 1.403772f,
 1.331431f, 3.920228f, 1.682822f,
 1.521060f, 3.266989f, 2.843943f,
 0.803051f, 4.518349f, 0.333684f,
 0.663732f, 4.447760f, 0.716957f,
 1.617641f, 4.090303f, 1.887032f,
 1.915352f, 3.303383f, 3.340552f,
 0.512725f, 4.939038f, 0.994950f,
 1.896785f, 4.097112f, 1.644503f,
 2.435998f, 3.436000f, 2.952998f,
 1.407850f, 5.034643f, 0.905379f,
 1.987613f, 3.796587f, 1.370106f,
 2.528663f, 3.134753f, 2.674339f,
 1.540612f, 4.855687f, 0.512178f,
 1.805119f, 3.477296f, 1.320936f,
 2.104520f, 2.688295f, 2.771692f,
 0.791247f, 5.250252f, 0.229409f,
 -0.622104f, 2.702501f, 0.033273f,
 -1.850552f, -0.000161f, -0.022530f,
 -1.222759f, 0.000165f, -1.377033f,
 -0.577594f, 2.576134f, -0.685274f,
 -0.287188f, -0.000163f, -1.585893f,
 -0.066706f, 2.361291f, -0.756340f,
 -1.427690f, 5.044806f, -0.056684f,
 -1.259829f, 4.433747f, 0.885825f,
 -0.862627f, 5.229332f, -0.532926f,
 -0.744181f, 5.383293f, 0.546414f,
 -0.539623f, 5.315460f, 0.839700f,
 -0.366041f, 5.501823f, 0.142147f,
 -2.114543f, 3.357601f, -1.029337f,
 -2.141156f, 3.483705f, -0.628310f,
 -1.406037f, 4.331465f, -1.129287f,
 -1.320036f, 4.312898f, -1.547653f,
 -0.837517f, 4.447446f, 0.160608f,
 -0.695645f, 4.520820f, -0.218749f,
 -2.721903f, 3.448401f, -0.373081f,
 -1.768697f, 4.403456f, -1.053289f,
 -0.902061f, 4.933552f, 0.483036f,
 -2.971581f, 3.875531f, -0.813826f,
 -1.875104f, 4.670682f, -1.229140f,
 -1.579602f, 5.007244f, 0.000018f,
 -2.945671f, 3.750134f, -1.213757f,
 -1.775348f, 4.657593f, -1.703165f,
 -1.403494f, 5.389221f, -0.158597f,
 -2.668744f, 3.192096f, -1.191101f,
 -1.624494f, 4.340417f, -1.829416f,
 -0.621764f, 5.250849f, -0.284708f,
 -0.799088f, 5.089002f, 0.455400f,
 -1.238822f, 6.028121f, 0.801085f,
 -1.049345f, 6.940180f, 0.961659f,
 -0.631094f, 6.804116f, 0.398921f,
 -0.818155f, 7.264966f, 0.012087f,
 -0.639748f, 7.607407f, -0.265901f,
 -1.644560f, 1.576776f, 0.183120f,
 -1.313923f, 1.387886f, 1.242299f,
 -0.364067f, 1.411338f, 1.848508f,
 0.640073f, 1.349051f, 1.630270f,
 0.662617f, 1.054972f, 0.772895f,
 0.128636f, 0.963272f, -0.127696f,
 -0.722457f, 1.172475f, -0.683642f,
 -1.365138f, 1.490698f, -0.605731f,
 1.613699f, 2.965741f, 2.565361f,
 1.613699f, 2.965741f, 2.565361f,
 1.423876f, 3.619058f, 1.403772f,
 1.423876f, 3.619058f, 1.403772f,
 0.803051f, 4.518349f, 0.333684f,
 0.803051f, 4.518349f, 0.333684f,
 2.104520f, 2.688295f, 2.771692f,
 2.104520f, 2.688295f, 2.771692f,
 0.128636f, 0.963272f, -0.127696f,
 0.128636f, 0.963272f, -0.127696f,
 0.454408f, 2.251054f, -0.515793f,
 -1.313923f, 1.387886f, 1.242299f,
 -1.313923f, 1.387886f, 1.242299f,
 -0.150656f, 2.736229f, 0.629875f,
 -0.150656f, 2.736229f, 0.629875f,
 -0.453472f, 4.257350f, 1.452565f,
 -0.453472f, 4.257350f, 1.452565f,
 0.454408f, 2.251054f, -0.515793f,
 0.226181f, 5.254929f, -0.416132f,
 0.226181f, 5.254929f, -0.416132f,
 -0.453472f, 4.257350f, 1.452565f,
 -0.265673f, 5.187358f, 1.206110f,
 -0.265673f, 5.187358f, 1.206110f,
 0.226181f, 5.254929f, -0.416132f,
 0.226181f, 5.254929f, -0.416132f,
 -0.061398f, 5.575467f, -0.014814f,
 -2.114543f, 3.357601f, -1.029337f,
 -2.114543f, 3.357601f, -1.029337f,
 -1.320036f, 4.312898f, -1.547653f,
 -0.695645f, 4.520820f, -0.218749f,
 -0.695645f, 4.520820f, -0.218749f,
 -1.320036f, 4.312898f, -1.547653f,
 -2.668744f, 3.192096f, -1.191101f,
 -2.668744f, 3.192096f, -1.191101f,
 -0.193493f, 5.815422f, 1.816803f,
 -0.276400f, 5.018025f, 1.269647f,
 -0.276400f, 5.018025f, 1.269647f,
 -0.201411f, 6.391805f, -0.328138f,
 -0.061183f, 5.199606f, -0.005114f,
 -0.061183f, 5.199606f, -0.005114f,
 -0.163662f, 6.919507f, 1.793072f,
 -0.193493f, 5.815422f, 1.816803f,
 -0.193493f, 5.815422f, 1.816803f,
 -0.201411f, 6.391805f, -0.328138f,
 -0.201411f, 6.391805f, -0.328138f,
 -0.188974f, 7.287929f, 0.041998f,
 -0.188974f, 7.287929f, 0.041998f,
 -0.163662f, 6.919507f, 1.793072f,
 -0.187110f, 7.656961f, 0.481410f,
 -0.187110f, 7.656961f, 0.481410f,
 -0.182828f, 6.971563f, 0.720903f,
 -0.186575f, 6.866895f, -0.488210f,
 -0.194854f, 6.527606f, 0.048152f,
 -0.194854f, 6.527606f, 0.048152f,
 -0.190957f, 7.910685f, -0.000009f,
 -0.187110f, 7.656961f, 0.481410f,
 -0.187110f, 7.656961f, 0.481410f,
 -0.187138f, 7.349664f, -0.685200f,
 -0.186575f, 6.866895f, -0.488210f,
 -0.186575f, 6.866895f, -0.488210f,
 -0.187138f, 7.349664f, -0.685200f,
 -0.190957f, 7.910685f, -0.000009f,
 -1.313923f, 1.387886f, 1.242299f,
 -1.222502f, 0.000166f, 1.332232f,
 -1.222502f, 0.000166f, 1.332232f,
 1.067572f, 0.000182f, -0.957822f,
 1.067572f, 0.000182f, -0.957822f,
 0.128636f, 0.963272f, -0.127696f,};

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
{ 0.951687f, 0.288048f, -0.106397f},
{ 0.951804f, 0.287996f, -0.105487f},
{ 0.951734f, 0.288027f, -0.106033f},
{ 0.951851f, 0.287975f, -0.105124f},
{ -0.154288f, 0.968209f, 0.196894f},
{ -0.061162f, 0.942535f, 0.328461f},
{ -0.053462f, 0.939321f, 0.338849f},
{ 0.044769f, 0.884156f, 0.465042f},
{ -0.206694f, 0.366918f, 0.907000f},
{ 0.582963f, 0.256467f, 0.770960f},
{ 0.113847f, 0.129115f, 0.985073f},
{ 0.974472f, -0.092561f, 0.204540f},
{ 0.884939f, 0.370431f, -0.282248f},
{ 0.864905f, -0.119670f, -0.487461f},
{ 0.594650f, -0.079453f, -0.800049f},
{ 0.675739f, 0.413871f, -0.609991f},
{ -0.731393f, 0.347357f, 0.586862f},
{ -0.575849f, 0.093018f, 0.812247f},
{ 0.896227f, 0.133567f, 0.423010f},
{ 0.382428f, -0.079188f, 0.920586f},
{ -0.376788f, -0.247021f, 0.892755f},
{ 0.345285f, 0.203073f, -0.916264f},
{ 0.784554f, 0.158686f, -0.599411f},
{ 0.253534f, 0.811901f, 0.525868f},
{ 0.373018f, 0.593949f, 0.712799f},
{ -0.240224f, 0.444276f, 0.863082f},
{ 0.034533f, 0.792813f, -0.608485f},
{ 0.325727f, 0.923440f, -0.202881f},
{ -0.885872f, 0.098179f, 0.453422f},
{ -0.943709f, -0.022583f, 0.330004f},
{ -0.648847f, -0.742745f, -0.165309f},
{ -0.714612f, -0.668832f, -0.204921f},
{ 0.506732f, -0.303453f, -0.806932f},
{ -0.663658f, -0.718997f, 0.206403f},
{ -0.101684f, 0.413796f, 0.904673f},
{ -0.167697f, 0.768803f, 0.617106f},
{ -0.326804f, 0.521177f, 0.788399f},
{ 0.611158f, 0.631293f, 0.477447f},
{ 0.773440f, 0.618244f, 0.139871f},
{ 0.260700f, 0.882775f, 0.390824f},
{ 0.912955f, -0.310437f, -0.264845f},
{ 0.910591f, 0.020895f, -0.412781f},
{ 0.477306f, -0.006950f, -0.878710f},
{ 0.266596f, -0.957998f, -0.105671f},
{ 0.245872f, -0.706132f, -0.664022f},
{ 0.694033f, 0.565299f, -0.445821f},
{ 0.031503f, -0.281739f, 0.958974f},
{ -0.087087f, -0.588595f, 0.803723f},
{ 0.997027f, -0.073002f, -0.024653f},
{ 0.914927f, -0.392697f, 0.093263f},
{ -0.053755f, 0.041999f, -0.997671f},
{ 0.044418f, -0.217299f, -0.975094f},
{ 0.022470f, 0.577443f, 0.816122f},
{ 0.791399f, 0.596923f, 0.131795f},
{ -0.007390f, 0.855071f, -0.518458f},
{ 0.017418f, 0.329912f, 0.943851f},
{ 0.942123f, -0.129584f, 0.309211f},
{ 0.015597f, 0.620241f, 0.784257f},
{ 0.999374f, 0.028334f, 0.021184f},
{ -0.023686f, -0.842578f, -0.538054f},
{ -0.010557f, -0.678198f, -0.734803f},
{ 0.005344f, 0.999823f, -0.018064f},
{ 0.730129f, 0.532798f, -0.427829f},
{ -0.021464f, 0.144718f, -0.989240f},
{ -0.647356f, 0.052573f, -0.760373f},
{ -0.684952f, 0.355884f, -0.635757f},
{ -0.948605f, 0.145377f, 0.281096f},
{ -0.927552f, 0.368897f, 0.059682f},
{ 0.230555f, -0.032664f, -0.972511f},
{ 0.319537f, 0.388238f, -0.864388f},
{ -0.894713f, -0.252440f, 0.368461f},
{ -0.956798f, 0.051643f, -0.286132f},
{ -0.244655f, 0.256259f, -0.935134f},
{ -0.604784f, 0.734464f, 0.307896f},
{ -0.604557f, 0.525150f, 0.598939f},
{ -0.186704f, 0.939389f, -0.287560f},
{ 0.834931f, -0.367343f, -0.409817f},
{ 0.371766f, -0.879942f, 0.295789f},
{ 0.555818f, -0.790810f, -0.256294f},
{ 0.555504f, -0.356651f, 0.751143f},
{ 0.808150f, -0.423501f, -0.409316f},
{ -0.572416f, -0.655549f, 0.492540f},
{ -0.356098f, -0.042870f, 0.933465f},
{ -0.314359f, -0.033861f, 0.948700f},
{ -0.538506f, -0.058543f, 0.840585f},
{ -0.682779f, 0.576455f, 0.448902f},
{ -0.745086f, 0.663821f, 0.064715f},
{ -0.777112f, -0.266228f, 0.570281f},
{ -0.685518f, 0.113439f, -0.719164f},
{ -0.103506f, 0.717692f, -0.688625f},
{ -0.168859f, 0.967543f, -0.188011f},
{ 0.300892f, 0.036640f, -0.952954f},
{ -0.273943f, -0.707337f, -0.651637f},
{ 0.528421f, 0.696950f, -0.484800f},
{ -0.993968f, -0.101210f, -0.042239f},
{ -0.900696f, -0.309524f, -0.304862f},
{ -0.782399f, 0.605170f, 0.147040f},
{ -0.999130f, 0.024833f, 0.033516f},
{ -0.932358f, -0.128381f, 0.337974f},
{ -0.739133f, 0.524841f, -0.422166f},
{ -0.990358f, 0.133968f, -0.035268f},
{ -0.733581f, -0.005903f, 0.679577f},
{ 0.090896f, 0.110365f, 0.989726f},
{ 0.739545f, 0.396345f, 0.544044f},
{ 0.705542f, 0.686366f, -0.176386f},
{ 0.487846f, 0.736020f, -0.469341f},
{ 0.181043f, 0.612055f, -0.769813f},
{ -0.571717f, 0.347439f, -0.743254f}};

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


//Vertices: 176  Texture Co-ords: 138  Normals: 108  Texture: CurrieAttack1.mtl Faces: 164 Smooth Groups: 11 sucess: 117 Doubles: 47 Redos needed: 68 Correct: 73