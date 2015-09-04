package com.example.jgfjhg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;
import android.graphics.Bitmap;
import android.opengl.GLUtils;

class CurrieAttackd {

static String TextureName = "CurrieAttack4.mtl";

static int Vertices = 176;

static int VertTexts = 138;

static int Normals = 108;

static int Faces = 164;

static int FacesB = 0;

static int SmoothGroups = 11;

static float VertArray[] = new float[]{
 2.416839f, 6.990986f, -0.572048f,
 1.386986f, 7.061298f, -3.401622f,
 1.381979f, 6.024738f, -0.243437f,
 0.347239f, 6.090374f, -3.068801f,
 1.520670f, 5.078362f, 1.024154f,
 0.860973f, 5.548534f, -0.413570f,
 -0.328144f, 4.876492f, 1.725642f,
 -0.790152f, 5.739083f, 0.071733f,
 0.523774f, 5.006927f, 1.197015f,
 0.936944f, 5.039996f, 0.325326f,
 0.152675f, 5.192132f, 0.010144f,
 0.381741f, 5.802663f, 1.782971f,
 1.394402f, 6.025997f, 0.772239f,
 0.369365f, 6.393866f, -0.358860f,
 0.323099f, 6.921116f, 1.762147f,
 1.211703f, 6.941841f, 0.934242f,
 0.354056f, 7.281603f, 0.024669f,
 0.346597f, 6.973454f, 0.690078f,
 0.795964f, 6.805591f, 0.369416f,
 0.361345f, 6.529673f, 0.017264f,
 0.351842f, 7.658915f, 0.450783f,
 0.983269f, 7.263268f, -0.017040f,
 0.348825f, 6.855401f, -0.494999f,
 0.356434f, 7.904908f, -0.017329f,
 0.800511f, 7.598501f, -0.291701f,
 0.348229f, 7.334181f, -0.682585f,
 0.287396f, 2.740064f, 0.593791f,
 -0.045561f, 2.254394f, -0.650830f,
 -1.222456f, 0.000167f, 1.332250f,
 1.067523f, 0.000185f, -0.957857f,
 0.907600f, 4.267899f, 1.254096f,
 -0.412464f, 5.244646f, -0.246470f,
 0.499386f, 5.180579f, 1.140690f,
 0.158379f, 5.557850f, 0.009296f,
 0.865713f, 5.359287f, 0.452725f,
 0.705563f, 5.321185f, 0.749497f,
 0.433425f, 5.458786f, 0.115045f,
 0.972575f, 2.716880f, 0.182223f,
 1.092985f, 2.714465f, -0.643334f,
 1.486753f, 0.000165f, 1.332478f,
 0.132437f, -0.000125f, 1.960231f,
 0.564583f, 2.344551f, -0.709868f,
 1.695597f, -0.000131f, 0.396743f,
 1.404628f, 4.495776f, 0.508231f,
 1.274265f, 5.128608f, -0.471256f,
 0.562772f, 5.255225f, -0.702825f,
 1.624547f, 6.251291f, -2.100665f,
 0.591430f, 5.457075f, -1.763773f,
 0.871351f, 5.523686f, -1.426685f,
 1.836922f, 6.266303f, -1.737926f,
 0.564801f, 4.564819f, -0.396727f,
 0.827316f, 4.495819f, -0.075984f,
 0.875365f, 5.871596f, -1.278285f,
 2.054626f, 6.841608f, -1.578255f,
 0.970013f, 4.982577f, 0.210343f,
 0.538243f, 5.960867f, -1.247029f,
 1.443465f, 7.095613f, -1.552337f,
 0.766620f, 5.434349f, -0.112614f,
 0.247865f, 5.910672f, -1.601874f,
 1.230837f, 7.080330f, -1.915087f,
 0.355534f, 5.245993f, -0.103792f,
 0.367128f, 5.767379f, -1.924100f,
 1.621028f, 6.810682f, -2.319050f,
 0.429335f, 5.288537f, -0.407555f,
 -0.479247f, 2.699259f, 0.514149f,
 -1.850536f, -0.000161f, -0.022503f,
 -1.222759f, 0.000165f, -1.377033f,
 -0.937727f, 2.565704f, -0.012092f,
 -0.287193f, -0.000163f, -1.585889f,
 -0.605987f, 2.359011f, -0.449790f,
 -0.923598f, 4.959242f, 1.355203f,
 0.004330f, 4.386423f, 1.667516f,
 -1.059544f, 5.158749f, 0.632115f,
 -0.192825f, 5.366108f, 0.786010f,
 0.114445f, 5.305931f, 0.959949f,
 -0.142609f, 5.480562f, 0.375038f,
 -2.019892f, 3.210065f, 1.405787f,
 -1.693981f, 3.346517f, 1.635336f,
 -1.800607f, 4.216137f, 0.773668f,
 -2.117240f, 4.189539f, 0.487720f,
 -0.408716f, 4.400544f, 0.936633f,
 -0.667611f, 4.469599f, 0.626365f,
 -1.764146f, 3.288566f, 2.264155f,
 -1.921590f, 4.271423f, 1.126524f,
 -0.188296f, 4.891849f, 1.170270f,
 -2.292312f, 3.688645f, 2.269777f,
 -2.140824f, 4.527361f, 1.137316f,
 -0.949070f, 4.915487f, 1.513953f,
 -2.617691f, 3.552824f, 2.041754f,
 -2.498496f, 4.505139f, 0.812284f,
 -1.017263f, 5.301219f, 1.293406f,
 -2.429645f, 3.010961f, 1.797556f,
 -2.514917f, 4.192635f, 0.608905f,
 -0.725505f, 5.200184f, 0.551232f,
 -0.266969f, 5.069704f, 0.752491f,
 -0.702645f, 6.028989f, 0.749022f,
 -0.527746f, 6.941953f, 0.897508f,
 -0.088729f, 6.805998f, 0.352638f,
 -0.262896f, 7.266768f, -0.036957f,
 -0.076204f, 7.609365f, -0.309463f,
 -1.052746f, 1.571874f, 1.355781f,
 -0.066006f, 1.385293f, 1.864784f,
 1.032601f, 1.412650f, 1.614243f,
 1.538722f, 1.782225f, 0.513116f,
 1.114295f, 1.194765f, 0.269034f,
 0.291793f, 0.996923f, -0.076370f,
 -0.702243f, 1.167081f, -0.092022f,
 -1.205947f, 1.477332f, 0.287396f,
 1.624547f, 6.251291f, -2.100665f,
 1.624547f, 6.251291f, -2.100665f,
 0.591430f, 5.457075f, -1.763773f,
 0.591430f, 5.457075f, -1.763773f,
 0.564801f, 4.564819f, -0.396727f,
 0.564801f, 4.564819f, -0.396727f,
 1.621028f, 6.810682f, -2.319050f,
 1.621028f, 6.810682f, -2.319050f,
 0.291793f, 0.996923f, -0.076370f,
 0.291793f, 0.996923f, -0.076370f,
 -0.045561f, 2.254394f, -0.650830f,
 -0.066006f, 1.385293f, 1.864784f,
 -0.066006f, 1.385293f, 1.864784f,
 0.287396f, 2.740064f, 0.593791f,
 0.287396f, 2.740064f, 0.593791f,
 0.907600f, 4.267899f, 1.254096f,
 0.907600f, 4.267899f, 1.254096f,
 -0.045561f, 2.254394f, -0.650830f,
 -0.412464f, 5.244646f, -0.246470f,
 -0.412464f, 5.244646f, -0.246470f,
 0.907600f, 4.267899f, 1.254096f,
 0.499386f, 5.180579f, 1.140690f,
 0.499386f, 5.180579f, 1.140690f,
 -0.412464f, 5.244646f, -0.246470f,
 -0.412464f, 5.244646f, -0.246470f,
 0.158379f, 5.557850f, 0.009296f,
 -2.019892f, 3.210065f, 1.405787f,
 -2.019892f, 3.210065f, 1.405787f,
 -2.117240f, 4.189539f, 0.487720f,
 -0.667611f, 4.469599f, 0.626365f,
 -0.667611f, 4.469599f, 0.626365f,
 -2.117240f, 4.189539f, 0.487720f,
 -2.429645f, 3.010961f, 1.797556f,
 -2.429645f, 3.010961f, 1.797556f,
 0.381741f, 5.802663f, 1.782971f,
 0.523774f, 5.006927f, 1.197015f,
 0.523774f, 5.006927f, 1.197015f,
 0.369365f, 6.393866f, -0.358860f,
 0.152675f, 5.192132f, 0.010144f,
 0.152675f, 5.192132f, 0.010144f,
 0.323099f, 6.921116f, 1.762147f,
 0.381741f, 5.802663f, 1.782971f,
 0.381741f, 5.802663f, 1.782971f,
 0.369365f, 6.393866f, -0.358860f,
 0.369365f, 6.393866f, -0.358860f,
 0.354056f, 7.281603f, 0.024669f,
 0.354056f, 7.281603f, 0.024669f,
 0.323099f, 6.921116f, 1.762147f,
 0.351842f, 7.658915f, 0.450783f,
 0.351842f, 7.658915f, 0.450783f,
 0.346597f, 6.973454f, 0.690078f,
 0.348825f, 6.855401f, -0.494999f,
 0.361345f, 6.529673f, 0.017264f,
 0.361345f, 6.529673f, 0.017264f,
 0.356434f, 7.904908f, -0.017329f,
 0.351842f, 7.658915f, 0.450783f,
 0.351842f, 7.658915f, 0.450783f,
 0.348229f, 7.334181f, -0.682585f,
 0.348825f, 6.855401f, -0.494999f,
 0.348825f, 6.855401f, -0.494999f,
 0.348229f, 7.334181f, -0.682585f,
 0.356434f, 7.904908f, -0.017329f,
 -0.066006f, 1.385293f, 1.864784f,
 -1.222456f, 0.000167f, 1.332250f,
 -1.222456f, 0.000167f, 1.332250f,
 1.067523f, 0.000185f, -0.957857f,
 1.067523f, 0.000185f, -0.957857f,
 0.291793f, 0.996923f, -0.076370f,};

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
{ -0.619327f, 0.746271f, 0.243955f},
{ -0.619087f, 0.746451f, 0.244014f},
{ -0.619231f, 0.746343f, 0.243978f},
{ -0.618991f, 0.746522f, 0.244038f},
{ 0.012076f, 0.952021f, 0.305794f},
{ 0.115519f, 0.927478f, 0.355584f},
{ 0.121043f, 0.925794f, 0.358125f},
{ 0.220679f, 0.888712f, 0.401860f},
{ 0.430696f, 0.375592f, 0.820629f},
{ 0.964891f, 0.245751f, 0.092697f},
{ 0.838968f, 0.126463f, 0.529282f},
{ 0.714999f, -0.112730f, -0.689977f},
{ 0.600226f, 0.092390f, -0.794476f},
{ 0.056639f, -0.158757f, -0.985692f},
{ -0.215225f, -0.095791f, -0.971855f},
{ 0.187255f, 0.292964f, -0.937607f},
{ -0.002376f, 0.161496f, 0.986871f},
{ 0.227335f, 0.126295f, 0.965592f},
{ 0.789342f, 0.261346f, -0.555552f},
{ 0.986090f, -0.011831f, 0.165792f},
{ 0.585428f, -0.248657f, 0.771650f},
{ -0.623204f, 0.213160f, -0.752449f},
{ -0.159802f, 0.238495f, -0.957906f},
{ 0.681231f, 0.711260f, 0.173301f},
{ 0.722505f, 0.461419f, 0.514859f},
{ 0.427705f, 0.466570f, 0.774197f},
{ -0.057497f, 0.692242f, -0.719371f},
{ 0.111318f, 0.957504f, -0.266072f},
{ 0.793611f, -0.568788f, 0.216014f},
{ 0.819037f, -0.558472f, -0.131482f},
{ 0.339805f, -0.547897f, -0.764422f},
{ 0.036948f, -0.771701f, -0.634911f},
{ -0.293765f, -0.811431f, -0.505254f},
{ 0.913453f, -0.315196f, -0.257401f},
{ 0.730159f, 0.296625f, 0.615533f},
{ 0.656713f, 0.144579f, 0.740152f},
{ 0.995608f, -0.083678f, -0.041980f},
{ -0.048321f, 0.682087f, 0.729673f},
{ -0.396117f, 0.740314f, 0.543164f},
{ 0.253267f, 0.806823f, 0.533753f},
{ -0.603020f, 0.703985f, -0.375196f},
{ -0.947066f, 0.320641f, -0.016001f},
{ -0.719040f, 0.404237f, 0.565309f},
{ -0.003113f, 0.296950f, -0.954888f},
{ -0.673781f, -0.133841f, -0.726709f},
{ -0.924312f, -0.374464f, -0.073646f},
{ -0.039977f, -0.303225f, 0.952080f},
{ 0.193368f, -0.591648f, 0.782663f},
{ 0.991396f, -0.115405f, -0.061774f},
{ 0.864092f, -0.189554f, -0.466278f},
{ 0.071988f, 0.019477f, -0.997215f},
{ -0.122941f, -0.244434f, -0.961841f},
{ -0.033101f, 0.569786f, 0.821126f},
{ 0.783043f, 0.604623f, 0.145855f},
{ 0.008530f, 0.858049f, -0.513497f},
{ -0.018005f, 0.329663f, 0.943927f},
{ 0.930957f, -0.126982f, 0.342338f},
{ -0.011085f, 0.619013f, 0.785302f},
{ 0.998849f, 0.034816f, 0.032998f},
{ 0.022959f, -0.841092f, -0.540405f},
{ 0.000521f, -0.674829f, -0.737974f},
{ 0.010059f, 0.999593f, -0.026700f},
{ 0.725440f, 0.527211f, -0.442477f},
{ 0.014809f, 0.137785f, -0.990351f},
{ -0.998429f, -0.005581f, -0.055753f},
{ -0.973583f, 0.190053f, -0.126555f},
{ -0.503146f, 0.176564f, 0.845972f},
{ -0.727760f, 0.412626f, 0.547818f},
{ -0.540871f, -0.030844f, -0.840540f},
{ -0.022264f, 0.471111f, -0.881793f},
{ -0.133089f, -0.333267f, 0.933392f},
{ -0.705364f, -0.031043f, 0.708165f},
{ -0.947893f, 0.208612f, -0.240791f},
{ -0.092873f, 0.827802f, 0.553279f},
{ -0.242041f, 0.609754f, 0.754729f},
{ -0.361599f, 0.929097f, -0.077619f},
{ 0.085736f, -0.335091f, -0.938277f},
{ 0.488615f, -0.849866f, -0.197441f},
{ 0.099835f, -0.768006f, -0.632614f},
{ 0.946192f, -0.304171f, -0.110458f},
{ 0.075478f, -0.391831f, -0.916936f},
{ 0.171586f, -0.669744f, 0.722497f},
{ 0.628006f, -0.032506f, 0.777529f},
{ 0.662098f, -0.021447f, 0.749110f},
{ 0.458101f, -0.063193f, 0.886651f},
{ 0.013747f, 0.553418f, 0.832790f},
{ -0.353576f, 0.625445f, 0.695559f},
{ 0.115318f, -0.290264f, 0.949973f},
{ -0.971210f, 0.055815f, 0.231592f},
{ -0.683562f, 0.690216f, -0.237372f},
{ -0.297898f, 0.951256f, 0.079806f},
{ -0.672596f, 0.023757f, -0.739628f},
{ -0.662975f, -0.739926f, -0.113907f},
{ -0.188823f, 0.708662f, -0.679812f},
{ -0.995942f, -0.085438f, -0.028285f},
{ -0.866424f, -0.392385f, 0.308777f},
{ -0.796309f, 0.590512f, 0.131103f},
{ -0.999074f, 0.037562f, 0.020971f},
{ -0.943658f, -0.130826f, 0.303964f},
{ -0.715731f, 0.541231f, -0.441360f},
{ -0.814017f, 0.557129f, -0.164270f},
{ -0.706613f, 0.116513f, 0.697942f},
{ -0.147194f, 0.322758f, 0.934966f},
{ 0.775710f, 0.051264f, 0.629004f},
{ 0.960788f, 0.230601f, -0.153978f},
{ 0.422177f, 0.701941f, -0.573625f},
{ 0.117264f, 0.792129f, -0.598984f},
{ -0.419723f, 0.724138f, -0.547227f}};

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


//Vertices: 176  Texture Co-ords: 138  Normals: 108  Texture: CurrieAttack4.mtl Faces: 164 Smooth Groups: 11 sucess: 117 Doubles: 47 Redos needed: 68 Correct: 73