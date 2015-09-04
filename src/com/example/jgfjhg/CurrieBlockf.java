package com.example.jgfjhg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;
import android.graphics.Bitmap;
import android.opengl.GLUtils;

class CurrieBlockf {

static String TextureName = "CurrieBlock6.mtl";

static int Vertices = 176;

static int VertTexts = 138;

static int Normals = 108;

static int Faces = 164;

static int FacesB = 0;

static int SmoothGroups = 11;

static float VertArray[] = new float[]{
 1.028225f, 5.380655f, 2.714976f,
 1.784741f, 2.564584f, 3.475380f,
 1.391613f, 5.084352f, 1.338550f,
 2.151288f, 2.276429f, 2.084970f,
 0.637525f, 4.919065f, 1.533746f,
 1.003169f, 5.558197f, -0.243249f,
 -1.172051f, 4.815325f, 1.224695f,
 -1.173319f, 5.606083f, -0.495888f,
 -0.272820f, 4.850801f, 1.189536f,
 0.495155f, 4.996967f, 0.538844f,
 -0.073397f, 5.101843f, -0.069947f,
 -0.201136f, 5.633917f, 1.781877f,
 0.865376f, 5.881185f, 0.732942f,
 -0.215180f, 6.266378f, -0.351413f,
 -0.167352f, 6.745269f, 1.781112f,
 0.683716f, 6.785663f, 0.915472f,
 -0.201211f, 7.156312f, 0.041819f,
 -0.191451f, 6.821887f, 0.710518f,
 0.243980f, 6.662386f, 0.366455f,
 -0.206818f, 6.393467f, 0.027833f,
 -0.196486f, 7.512596f, 0.486813f,
 0.419191f, 7.131891f, -0.018928f,
 -0.200387f, 6.751309f, -0.497232f,
 -0.203052f, 7.779643f, 0.014013f,
 0.234697f, 7.479554f, -0.283280f,
 -0.201508f, 7.240376f, -0.681615f,
 -0.097638f, 2.624444f, 0.514393f,
 0.428454f, 2.079038f, -0.589905f,
 -1.222502f, 0.000169f, 1.332231f,
 1.067570f, 0.000181f, -0.957823f,
 -0.411872f, 4.018068f, 1.267403f,
 0.217183f, 5.260977f, -0.465234f,
 -0.267724f, 5.017898f, 1.138694f,
 -0.085329f, 5.481517f, -0.069675f,
 0.399174f, 5.268140f, 0.640521f,
 0.095071f, 5.164583f, 0.897699f,
 0.259593f, 5.398749f, 0.227079f,
 0.548260f, 2.531212f, 0.721998f,
 0.982689f, 2.336270f, 0.392307f,
 1.486753f, 0.000164f, 1.332478f,
 0.132181f, -0.000127f, 1.960321f,
 0.845364f, 2.120820f, -0.176480f,
 1.695553f, -0.000151f, 0.396981f,
 0.482331f, 4.224490f, 1.347938f,
 1.265538f, 4.935579f, 0.840189f,
 1.137460f, 5.177774f, 0.132810f,
 1.209071f, 3.542671f, 2.410788f,
 1.666830f, 3.308552f, 1.167024f,
 1.474826f, 3.686655f, 1.237882f,
 1.058656f, 3.933035f, 2.369623f,
 0.829875f, 4.464850f, 0.189432f,
 0.692938f, 4.342566f, 0.562891f,
 1.670251f, 3.910820f, 1.467982f,
 1.194381f, 4.325492f, 2.850741f,
 0.520495f, 4.788764f, 0.897907f,
 1.995306f, 3.932777f, 1.366455f,
 1.847156f, 4.267273f, 2.749203f,
 1.324162f, 4.972939f, 0.955848f,
 2.208909f, 3.512811f, 1.289016f,
 1.997819f, 3.876716f, 2.789966f,
 1.552785f, 4.963688f, 0.565992f,
 2.013961f, 3.204856f, 1.369636f,
 1.501710f, 3.527838f, 2.934871f,
 0.783755f, 5.203179f, 0.176469f,
 -0.551371f, 2.613551f, -0.038388f,
 -1.850550f, -0.000155f, -0.022527f,
 -1.222759f, 0.000164f, -1.377033f,
 -0.495931f, 2.453088f, -0.629465f,
 -0.287188f, -0.000163f, -1.585893f,
 -0.075450f, 2.200546f, -0.795005f,
 -1.424920f, 4.931910f, -0.135730f,
 -1.223539f, 4.226118f, 0.725187f,
 -0.874353f, 5.198266f, -0.589195f,
 -0.763765f, 5.275960f, 0.465083f,
 -0.546016f, 5.165442f, 0.780867f,
 -0.402107f, 5.413667f, 0.062142f,
 -1.494009f, 3.265699f, 0.698382f,
 -1.505421f, 3.686591f, 0.704216f,
 -1.008114f, 3.415860f, -0.428131f,
 -1.010973f, 3.034506f, -0.534402f,
 -0.798329f, 4.353240f, 0.008550f,
 -0.670843f, 4.468435f, -0.360715f,
 -2.030073f, 3.938428f, 0.960080f,
 -1.268773f, 3.418459f, -0.290002f,
 -0.890824f, 4.789458f, 0.383719f,
 -2.420086f, 3.655257f, 0.505310f,
 -1.544905f, 3.354042f, -0.427512f,
 -1.426738f, 4.515578f, 0.287967f,
 -2.409187f, 3.235863f, 0.501348f,
 -1.550220f, 3.004623f, -0.774668f,
 -1.701271f, 4.692506f, -0.038788f,
 -2.006801f, 3.079939f, 0.951158f,
 -1.341102f, 2.783691f, -0.560562f,
 -0.629401f, 5.203620f, -0.337547f,
 -0.817471f, 5.024052f, 0.327416f,
 -1.249742f, 5.878715f, 0.771332f,
 -1.057166f, 6.785503f, 0.954262f,
 -0.642432f, 6.662553f, 0.386083f,
 -0.834831f, 7.132282f, 0.008648f,
 -0.658946f, 7.481051f, -0.263067f,
 -1.636544f, 1.587278f, 0.165334f,
 -1.298941f, 1.416885f, 1.225049f,
 -0.344540f, 1.448114f, 1.823340f,
 0.521635f, 1.480035f, 1.578561f,
 0.582116f, 1.057967f, 0.791613f,
 0.039408f, 0.929715f, -0.082403f,
 -0.757740f, 1.203747f, -0.520891f,
 -1.289695f, 1.691638f, -0.289064f,
 1.209071f, 3.542671f, 2.410788f,
 1.209071f, 3.542671f, 2.410788f,
 1.666830f, 3.308552f, 1.167024f,
 1.666830f, 3.308552f, 1.167024f,
 0.829875f, 4.464850f, 0.189432f,
 0.829875f, 4.464850f, 0.189432f,
 1.501710f, 3.527838f, 2.934871f,
 1.501710f, 3.527838f, 2.934871f,
 0.039408f, 0.929715f, -0.082403f,
 0.039408f, 0.929715f, -0.082403f,
 0.428454f, 2.079038f, -0.589905f,
 -1.298941f, 1.416885f, 1.225049f,
 -1.298941f, 1.416885f, 1.225049f,
 -0.097638f, 2.624444f, 0.514393f,
 -0.097638f, 2.624444f, 0.514393f,
 -0.411872f, 4.018068f, 1.267403f,
 -0.411872f, 4.018068f, 1.267403f,
 0.428454f, 2.079038f, -0.589905f,
 0.217183f, 5.260977f, -0.465234f,
 0.217183f, 5.260977f, -0.465234f,
 -0.411872f, 4.018068f, 1.267403f,
 -0.267724f, 5.017898f, 1.138694f,
 -0.267724f, 5.017898f, 1.138694f,
 0.217183f, 5.260977f, -0.465234f,
 0.217183f, 5.260977f, -0.465234f,
 -0.085329f, 5.481517f, -0.069675f,
 -1.494009f, 3.265699f, 0.698382f,
 -1.494009f, 3.265699f, 0.698382f,
 -1.010973f, 3.034506f, -0.534402f,
 -0.670843f, 4.468435f, -0.360715f,
 -0.670843f, 4.468435f, -0.360715f,
 -1.010973f, 3.034506f, -0.534402f,
 -2.006801f, 3.079939f, 0.951158f,
 -2.006801f, 3.079939f, 0.951158f,
 -0.201136f, 5.633917f, 1.781877f,
 -0.272820f, 4.850801f, 1.189536f,
 -0.272820f, 4.850801f, 1.189536f,
 -0.215180f, 6.266378f, -0.351413f,
 -0.073397f, 5.101843f, -0.069947f,
 -0.073397f, 5.101843f, -0.069947f,
 -0.167352f, 6.745269f, 1.781112f,
 -0.201136f, 5.633917f, 1.781877f,
 -0.201136f, 5.633917f, 1.781877f,
 -0.215180f, 6.266378f, -0.351413f,
 -0.215180f, 6.266378f, -0.351413f,
 -0.201211f, 7.156312f, 0.041819f,
 -0.201211f, 7.156312f, 0.041819f,
 -0.167352f, 6.745269f, 1.781112f,
 -0.196486f, 7.512596f, 0.486813f,
 -0.196486f, 7.512596f, 0.486813f,
 -0.191451f, 6.821887f, 0.710518f,
 -0.200387f, 6.751309f, -0.497232f,
 -0.206818f, 6.393467f, 0.027833f,
 -0.206818f, 6.393467f, 0.027833f,
 -0.203052f, 7.779643f, 0.014013f,
 -0.196486f, 7.512596f, 0.486813f,
 -0.196486f, 7.512596f, 0.486813f,
 -0.201508f, 7.240376f, -0.681615f,
 -0.200387f, 6.751309f, -0.497232f,
 -0.200387f, 6.751309f, -0.497232f,
 -0.201508f, 7.240376f, -0.681615f,
 -0.203052f, 7.779643f, 0.014013f,
 -1.298941f, 1.416885f, 1.225049f,
 -1.222502f, 0.000169f, 1.332231f,
 -1.222502f, 0.000169f, 1.332231f,
 1.067570f, 0.000181f, -0.957823f,
 1.067570f, 0.000181f, -0.957823f,
 0.039408f, 0.929715f, -0.082403f,};

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
{ 0.936104f, 0.300730f, 0.182401f},
{ 0.935592f, 0.301623f, 0.183549f},
{ 0.935898f, 0.301090f, 0.182865f},
{ 0.935387f, 0.301980f, 0.184008f},
{ -0.108109f, 0.942348f, 0.316690f},
{ -0.064770f, 0.925762f, 0.372517f},
{ -0.062058f, 0.924568f, 0.375930f},
{ -0.028472f, 0.908257f, 0.417444f},
{ -0.201748f, 0.409947f, 0.889517f},
{ 0.582311f, 0.324720f, 0.745299f},
{ 0.171172f, 0.175870f, 0.969417f},
{ 0.980276f, -0.121185f, 0.156121f},
{ 0.862128f, 0.402750f, -0.307454f},
{ 0.830357f, -0.151959f, -0.536111f},
{ 0.554576f, -0.110701f, -0.824737f},
{ 0.657720f, 0.444585f, -0.608070f},
{ -0.716268f, 0.386692f, 0.580888f},
{ -0.534894f, 0.150093f, 0.831481f},
{ 0.903498f, 0.121234f, 0.411088f},
{ 0.376725f, -0.113516f, 0.919344f},
{ -0.370902f, -0.279513f, 0.885609f},
{ 0.341087f, 0.197315f, -0.919090f},
{ 0.765792f, 0.172384f, -0.619554f},
{ 0.211448f, 0.757381f, 0.617789f},
{ 0.383927f, 0.522702f, 0.761172f},
{ -0.258172f, 0.324498f, 0.909972f},
{ 0.033946f, 0.883735f, -0.466756f},
{ 0.258804f, 0.962770f, -0.078066f},
{ -0.958156f, 0.233475f, -0.165607f},
{ -0.952231f, -0.283166f, 0.114337f},
{ -0.617291f, -0.784145f, 0.063787f},
{ -0.386642f, -0.820384f, -0.421281f},
{ 0.643691f, -0.115302f, -0.756549f},
{ -0.629493f, -0.763938f, 0.141910f},
{ -0.419298f, 0.854472f, 0.306704f},
{ -0.392183f, 0.852446f, 0.345729f},
{ -0.421868f, 0.296504f, 0.856804f},
{ 0.441580f, 0.878915f, 0.180322f},
{ 0.760350f, 0.630923f, 0.154288f},
{ 0.096048f, 0.708725f, 0.698917f},
{ 0.863132f, -0.278267f, 0.421391f},
{ 0.902225f, -0.174905f, -0.394205f},
{ 0.590504f, 0.106663f, -0.799955f},
{ 0.110655f, -0.767648f, 0.631246f},
{ 0.460231f, -0.843552f, -0.276780f},
{ 0.653742f, 0.461053f, -0.600043f},
{ 0.029410f, -0.314360f, 0.948848f},
{ -0.082955f, -0.636863f, 0.766501f},
{ 0.997119f, -0.073179f, -0.019964f},
{ 0.915151f, -0.397666f, 0.066029f},
{ -0.057607f, 0.071928f, -0.995745f},
{ 0.066500f, -0.180884f, -0.981254f},
{ 0.027353f, 0.556268f, 0.830553f},
{ 0.793373f, 0.591828f, 0.142472f},
{ -0.009428f, 0.867082f, -0.498077f},
{ 0.021250f, 0.308190f, 0.951087f},
{ 0.943673f, -0.137313f, 0.301041f},
{ 0.016256f, 0.600244f, 0.799652f},
{ 0.999487f, 0.027390f, 0.016584f},
{ -0.024906f, -0.826089f, -0.562989f},
{ -0.011226f, -0.656412f, -0.754319f},
{ 0.001898f, 0.999937f, 0.011083f},
{ 0.730210f, 0.542359f, -0.415500f},
{ -0.019716f, 0.174136f, -0.984524f},
{ -0.694180f, -0.023804f, -0.719408f},
{ -0.612800f, 0.423788f, -0.666993f},
{ -0.926648f, 0.163006f, 0.338752f},
{ -0.922859f, 0.380532f, 0.059389f},
{ 0.142417f, -0.069470f, -0.987366f},
{ 0.284208f, 0.426657f, -0.858597f},
{ -0.894418f, -0.279030f, 0.349514f},
{ -0.944025f, 0.030332f, -0.328477f},
{ -0.225335f, 0.227231f, -0.947412f},
{ -0.647915f, 0.658321f, 0.383169f},
{ -0.641568f, 0.424899f, 0.638632f},
{ -0.195306f, 0.959322f, -0.203854f},
{ 0.807326f, -0.472107f, -0.354034f},
{ 0.792282f, -0.161730f, 0.588331f},
{ 0.692497f, -0.501688f, 0.518417f},
{ 0.714067f, 0.570392f, 0.405909f},
{ 0.584597f, -0.103589f, -0.804683f},
{ 0.704806f, -0.443339f, 0.553804f},
{ -0.058856f, 0.739782f, 0.670267f},
{ -0.184073f, 0.939110f, 0.290156f},
{ -0.185514f, 0.515178f, 0.836765f},
{ -0.665449f, 0.679038f, -0.309974f},
{ -0.903918f, 0.395934f, -0.161768f},
{ -0.370674f, -0.249310f, 0.894676f},
{ -0.750892f, -0.643204f, -0.149832f},
{ 0.086174f, -0.078467f, -0.993185f},
{ -0.571045f, 0.302929f, -0.762982f},
{ 0.032579f, -0.658271f, -0.752076f},
{ -0.167320f, -0.824995f, 0.539803f},
{ -0.407491f, 0.434706f, -0.803108f},
{ -0.993756f, -0.109464f, -0.021627f},
{ -0.898647f, -0.278460f, -0.338960f},
{ -0.781821f, 0.601123f, 0.165552f},
{ -0.998918f, 0.022940f, 0.040467f},
{ -0.929207f, -0.137288f, 0.343112f},
{ -0.740203f, 0.534776f, -0.407570f},
{ -0.990017f, 0.137259f, -0.032041f},
{ -0.729837f, 0.010274f, 0.683544f},
{ 0.085718f, 0.121745f, 0.988853f},
{ 0.737695f, 0.427332f, 0.522680f},
{ 0.690307f, 0.704540f, -0.164618f},
{ 0.458276f, 0.763580f, -0.454895f},
{ 0.150692f, 0.662598f, -0.733659f},
{ -0.513644f, 0.432466f, -0.741042f}};

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


//Vertices: 176  Texture Co-ords: 138  Normals: 108  Texture: CurrieBlock6.mtl Faces: 164 Smooth Groups: 11 sucess: 117 Doubles: 47 Redos needed: 68 Correct: 73