package com.example.jgfjhg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;
import android.graphics.Bitmap;
import android.opengl.GLUtils;

class CurrieWalkb {

static String TextureName = "CurrieWalk2.mtl";

static int Vertices = 176;

static int VertTexts = 138;

static int Normals = 108;

static int Faces = 164;

static int FacesB = 0;

static int SmoothGroups = 11;

static float VertArray[] = new float[]{
 3.036282f, 4.659628f, 3.121218f,
 3.137065f, 2.140484f, 1.469056f,
 2.273118f, 5.301494f, 2.062639f,
 2.373583f, 2.784251f, 0.408516f,
 0.978009f, 5.553062f, 1.464907f,
 0.986224f, 5.994048f, -0.375194f,
 -1.080298f, 5.264135f, 1.524638f,
 -1.001362f, 6.155947f, -0.232272f,
 -0.040075f, 5.397920f, 1.316911f,
 0.629060f, 5.523335f, 0.519698f,
 -0.016441f, 5.597463f, 0.005870f,
 -0.030596f, 6.173393f, 1.868318f,
 1.025280f, 6.416233f, 0.826002f,
 -0.038116f, 6.809406f, -0.262767f,
 -0.024242f, 7.275238f, 1.873218f,
 0.840622f, 7.320778f, 1.021056f,
 -0.035720f, 7.693915f, 0.131294f,
 -0.031204f, 7.358439f, 0.802866f,
 0.409406f, 7.200801f, 0.464164f,
 -0.035662f, 6.934226f, 0.117403f,
 -0.032632f, 8.050510f, 0.583361f,
 0.589238f, 7.671592f, 0.082232f,
 -0.037541f, 7.287502f, -0.413300f,
 -0.035947f, 8.317729f, 0.107742f,
 0.405299f, 8.018689f, -0.186283f,
 -0.038708f, 7.775545f, -0.597046f,
 -0.096143f, 3.093307f, 0.757819f,
 0.275378f, 2.778855f, -0.641293f,
 -0.614060f, 0.000164f, 1.732894f,
 0.585047f, 0.000178f, -1.275587f,
 -0.003650f, 4.647552f, 1.537522f,
 -0.025900f, 5.639999f, -0.453394f,
 -0.039274f, 5.568195f, 1.253625f,
 -0.018143f, 5.973646f, 0.001190f,
 0.552809f, 5.795879f, 0.631869f,
 0.293742f, 5.711477f, 0.937645f,
 0.313165f, 5.886692f, 0.224987f,
 0.656381f, 3.075556f, 0.776700f,
 1.073520f, 2.976932f, 0.303587f,
 1.874917f, 0.000165f, 0.662829f,
 0.878581f, -0.000156f, 1.774718f,
 0.791447f, 2.819940f, -0.322790f,
 1.697181f, -0.000155f, -0.279093f,
 0.862427f, 4.850010f, 1.284131f,
 1.408905f, 5.473226f, 0.453568f,
 1.038516f, 5.615578f, -0.191329f,
 2.357340f, 3.425128f, 1.885281f,
 1.765548f, 4.058902f, 0.855590f,
 1.764584f, 4.360900f, 1.148724f,
 2.356028f, 3.727199f, 2.178022f,
 0.792564f, 4.928197f, 0.057986f,
 0.793605f, 4.858662f, 0.465727f,
 2.098007f, 4.540948f, 1.243447f,
 2.894246f, 3.780118f, 2.511076f,
 0.731643f, 5.349086f, 0.777560f,
 2.277959f, 4.552179f, 0.920610f,
 3.248325f, 3.921750f, 1.969425f,
 1.540071f, 5.467354f, 0.388737f,
 2.278962f, 4.250906f, 0.632015f,
 3.249635f, 3.619681f, 1.676610f,
 1.536634f, 5.287186f, -0.025732f,
 2.099993f, 3.926307f, 0.648541f,
 2.896916f, 3.163352f, 1.913323f,
 0.724691f, 5.658224f, -0.038085f,
 -0.711287f, 3.063934f, 0.293011f,
 -1.726225f, -0.000163f, 0.736438f,
 -1.684594f, 0.000165f, -0.755897f,
 -0.817626f, 3.000554f, -0.470872f,
 -0.907633f, -0.000164f, -1.317366f,
 -0.314772f, 2.847665f, -0.713140f,
 -1.452692f, 5.390472f, 0.446871f,
 -0.957612f, 4.795692f, 1.277404f,
 -1.088272f, 5.584129f, -0.193661f,
 -0.619273f, 5.765373f, 0.668996f,
 -0.367833f, 5.696563f, 0.935782f,
 -0.342063f, 5.888218f, 0.223477f,
 -2.379545f, 3.673892f, -0.230297f,
 -2.272048f, 3.804092f, 0.155539f,
 -1.775645f, 4.664874f, -0.567474f,
 -1.836266f, 4.643472f, -0.990106f,
 -0.806670f, 4.811797f, 0.451607f,
 -0.804195f, 4.884149f, 0.047192f,
 -2.730384f, 3.756507f, 0.592944f,
 -2.092889f, 4.728189f, -0.373288f,
 -0.772200f, 5.299861f, 0.775889f,
 -3.127173f, 4.171435f, 0.262124f,
 -2.260357f, 4.990341f, -0.503307f,
 -1.575178f, 5.349576f, 0.551979f,
 -3.234916f, 4.041880f, -0.122498f,
 -2.327163f, 4.974030f, -0.982592f,
 -1.474573f, 5.734124f, 0.342024f,
 -2.950611f, 3.491710f, -0.193859f,
 -2.218954f, 4.659447f, -1.151775f,
 -0.778387f, 5.615019f, -0.041763f,
 -0.685877f, 5.469831f, 0.593502f,
 -1.087599f, 6.413071f, 0.850801f,
 -0.900226f, 7.320507f, 1.033189f,
 -0.476145f, 7.200584f, 0.471475f,
 -0.660007f, 7.672381f, 0.096663f,
 -0.479019f, 8.022669f, -0.170232f,
 -1.424865f, 1.612939f, 0.827806f,
 -0.642810f, 1.497415f, 1.629793f,
 0.478447f, 1.548087f, 1.730884f,
 1.292469f, 1.554605f, 1.132951f,
 1.041960f, 1.289935f, 0.266398f,
 0.221757f, 1.183949f, -0.398205f,
 -0.808290f, 1.319446f, -0.536841f,
 -1.423931f, 1.568591f, -0.149368f,
 2.357340f, 3.425128f, 1.885281f,
 2.357340f, 3.425128f, 1.885281f,
 1.765548f, 4.058902f, 0.855590f,
 1.765548f, 4.058902f, 0.855590f,
 0.792564f, 4.928197f, 0.057986f,
 0.792564f, 4.928197f, 0.057986f,
 2.896916f, 3.163352f, 1.913323f,
 2.896916f, 3.163352f, 1.913323f,
 0.221757f, 1.183949f, -0.398205f,
 0.221757f, 1.183949f, -0.398205f,
 0.275378f, 2.778855f, -0.641293f,
 -0.642810f, 1.497415f, 1.629793f,
 -0.642810f, 1.497415f, 1.629793f,
 -0.096143f, 3.093307f, 0.757819f,
 -0.096143f, 3.093307f, 0.757819f,
 -0.003650f, 4.647552f, 1.537522f,
 -0.003650f, 4.647552f, 1.537522f,
 0.275378f, 2.778855f, -0.641293f,
 -0.025900f, 5.639999f, -0.453394f,
 -0.025900f, 5.639999f, -0.453394f,
 -0.003650f, 4.647552f, 1.537522f,
 -0.039274f, 5.568195f, 1.253625f,
 -0.039274f, 5.568195f, 1.253625f,
 -0.025900f, 5.639999f, -0.453394f,
 -0.025900f, 5.639999f, -0.453394f,
 -0.018143f, 5.973646f, 0.001190f,
 -2.379545f, 3.673892f, -0.230297f,
 -2.379545f, 3.673892f, -0.230297f,
 -1.836266f, 4.643472f, -0.990106f,
 -0.804195f, 4.884149f, 0.047192f,
 -0.804195f, 4.884149f, 0.047192f,
 -1.836266f, 4.643472f, -0.990106f,
 -2.950611f, 3.491710f, -0.193859f,
 -2.950611f, 3.491710f, -0.193859f,
 -0.030596f, 6.173393f, 1.868318f,
 -0.040075f, 5.397920f, 1.316911f,
 -0.040075f, 5.397920f, 1.316911f,
 -0.038116f, 6.809406f, -0.262767f,
 -0.016441f, 5.597463f, 0.005870f,
 -0.016441f, 5.597463f, 0.005870f,
 -0.024242f, 7.275238f, 1.873218f,
 -0.030596f, 6.173393f, 1.868318f,
 -0.030596f, 6.173393f, 1.868318f,
 -0.038116f, 6.809406f, -0.262767f,
 -0.038116f, 6.809406f, -0.262767f,
 -0.035720f, 7.693915f, 0.131294f,
 -0.035720f, 7.693915f, 0.131294f,
 -0.024242f, 7.275238f, 1.873218f,
 -0.032632f, 8.050510f, 0.583361f,
 -0.032632f, 8.050510f, 0.583361f,
 -0.031204f, 7.358439f, 0.802866f,
 -0.037541f, 7.287502f, -0.413300f,
 -0.035662f, 6.934226f, 0.117403f,
 -0.035662f, 6.934226f, 0.117403f,
 -0.035947f, 8.317729f, 0.107742f,
 -0.032632f, 8.050510f, 0.583361f,
 -0.032632f, 8.050510f, 0.583361f,
 -0.038708f, 7.775545f, -0.597046f,
 -0.037541f, 7.287502f, -0.413300f,
 -0.037541f, 7.287502f, -0.413300f,
 -0.038708f, 7.775545f, -0.597046f,
 -0.035947f, 8.317729f, 0.107742f,
 -0.642810f, 1.497415f, 1.629793f,
 -0.614060f, 0.000164f, 1.732894f,
 -0.614060f, 0.000164f, 1.732894f,
 0.585047f, 0.000178f, -1.275587f,
 0.585047f, 0.000178f, -1.275587f,
 0.221757f, 1.183949f, -0.398205f,};

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
{ 0.850307f, 0.311990f, -0.423840f},
{ 0.850594f, 0.311964f, -0.423284f},
{ 0.850422f, 0.311980f, -0.423617f},
{ 0.850708f, 0.311953f, -0.423062f},
{ -0.128698f, 0.964507f, 0.230572f},
{ -0.016020f, 0.939067f, 0.343362f},
{ -0.008063f, 0.936351f, 0.350974f},
{ 0.104716f, 0.884890f, 0.453877f},
{ 0.225508f, 0.288751f, 0.930467f},
{ 0.862469f, 0.231814f, 0.449899f},
{ 0.397115f, 0.089603f, 0.913384f},
{ 0.999568f, -0.012279f, -0.026709f},
{ 0.768511f, 0.292449f, -0.569091f},
{ 0.701605f, -0.025918f, -0.712095f},
{ 0.338916f, 0.001097f, -0.940816f},
{ 0.383520f, 0.301851f, -0.872811f},
{ -0.405455f, 0.293184f, 0.865823f},
{ -0.337492f, 0.093989f, 0.936624f},
{ 0.986055f, 0.151036f, 0.069889f},
{ 0.673570f, -0.050135f, 0.737421f},
{ -0.039931f, -0.220633f, 0.974539f},
{ 0.007791f, 0.210849f, -0.977488f},
{ 0.535737f, 0.175846f, -0.825872f},
{ 0.425314f, 0.783669f, 0.452736f},
{ 0.476120f, 0.580117f, 0.660889f},
{ -0.019306f, 0.441312f, 0.897146f},
{ 0.006225f, 0.806098f, -0.591750f},
{ 0.244889f, 0.931098f, -0.270344f},
{ -0.681830f, 0.080008f, 0.727122f},
{ -0.774652f, -0.043924f, 0.630860f},
{ -0.644510f, -0.761676f, 0.066762f},
{ -0.721944f, -0.690023f, 0.051624f},
{ 0.211038f, -0.299979f, -0.930310f},
{ -0.532951f, -0.733887f, 0.421157f},
{ 0.199481f, 0.421906f, 0.884422f},
{ 0.029250f, 0.771483f, 0.635577f},
{ -0.054866f, 0.521828f, 0.851284f},
{ 0.718309f, 0.653059f, 0.239888f},
{ 0.756567f, 0.640341f, -0.132551f},
{ 0.352110f, 0.894120f, 0.276710f},
{ 0.777480f, -0.289267f, -0.558435f},
{ 0.715545f, 0.040304f, -0.697403f},
{ 0.150749f, -0.004918f, -0.988560f},
{ 0.242677f, -0.951803f, -0.187560f},
{ 0.026325f, -0.707427f, -0.706296f},
{ 0.484697f, 0.578340f, -0.656195f},
{ 0.010292f, -0.298826f, 0.954252f},
{ 0.008983f, -0.603260f, 0.797494f},
{ 0.995812f, -0.084784f, -0.034213f},
{ 0.922012f, -0.369677f, -0.115037f},
{ -0.015114f, 0.082410f, -0.996484f},
{ -0.028587f, -0.181595f, -0.982958f},
{ 0.007460f, 0.556070f, 0.831102f},
{ 0.787814f, 0.596328f, 0.154088f},
{ -0.003622f, 0.869397f, -0.494100f},
{ 0.007470f, 0.302335f, 0.953172f},
{ 0.939331f, -0.137705f, 0.314158f},
{ 0.010617f, 0.598542f, 0.801021f},
{ 0.999387f, 0.027077f, 0.022173f},
{ -0.007790f, -0.829243f, -0.558833f},
{ -0.009369f, -0.659068f, -0.752025f},
{ 0.005568f, 0.999925f, 0.010946f},
{ 0.730836f, 0.541398f, -0.415653f},
{ -0.016102f, 0.172057f, -0.984955f},
{ -0.859108f, 0.038372f, -0.510354f},
{ -0.886903f, 0.302196f, -0.349400f},
{ -0.870655f, 0.119247f, 0.477221f},
{ -0.854405f, 0.312213f, 0.415349f},
{ -0.105345f, 0.016758f, -0.994295f},
{ -0.121014f, 0.289744f, -0.949423f},
{ -0.710634f, -0.260368f, 0.653611f},
{ -0.997032f, 0.023271f, 0.073382f},
{ -0.559660f, 0.247517f, -0.790896f},
{ -0.471359f, 0.765855f, 0.437363f},
{ -0.481162f, 0.568164f, 0.667587f},
{ -0.278974f, 0.924642f, -0.259252f},
{ 0.656546f, -0.350080f, -0.668125f},
{ 0.475573f, -0.866030f, 0.154347f},
{ 0.458645f, -0.778833f, -0.427859f},
{ 0.787671f, -0.332421f, 0.518720f},
{ 0.633268f, -0.406482f, -0.658593f},
{ -0.351616f, -0.664651f, 0.659247f},
{ -0.016894f, -0.040376f, 0.999042f},
{ 0.027534f, -0.030423f, 0.999158f},
{ -0.218841f, -0.063303f, 0.973705f},
{ -0.506228f, 0.563685f, 0.652681f},
{ -0.697885f, 0.644493f, 0.312387f},
{ -0.529131f, -0.280147f, 0.800961f},
{ -0.891923f, 0.086375f, -0.443862f},
{ -0.351785f, 0.706140f, -0.614503f},
{ -0.250834f, 0.960318f, -0.121951f},
{ -0.041638f, 0.032928f, -0.998590f},
{ -0.458134f, -0.722290f, -0.518084f},
{ 0.311946f, 0.704671f, -0.637283f},
{ -0.995871f, -0.081767f, -0.039429f},
{ -0.924763f, -0.361075f, -0.120159f},
{ -0.785407f, 0.598256f, 0.158825f},
{ -0.999149f, 0.025217f, 0.032640f},
{ -0.935486f, -0.138523f, 0.325081f},
{ -0.738283f, 0.540607f, -0.403340f},
{ -0.920939f, 0.151718f, 0.358961f},
{ -0.384481f, 0.055106f, 0.921487f},
{ 0.445882f, 0.140264f, 0.884034f},
{ 0.915011f, 0.316800f, 0.249787f},
{ 0.694911f, 0.522298f, -0.494271f},
{ 0.310671f, 0.574537f, -0.757226f},
{ -0.173921f, 0.486864f, -0.855988f},
{ -0.843040f, 0.313719f, -0.436880f}};

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


//Vertices: 176  Texture Co-ords: 138  Normals: 108  Texture: CurrieWalk2.mtl Faces: 164 Smooth Groups: 11 sucess: 117 Doubles: 47 Redos needed: 68 Correct: 73