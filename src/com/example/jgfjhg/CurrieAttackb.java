package com.example.jgfjhg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;
import android.graphics.Bitmap;
import android.opengl.GLUtils;

class CurrieAttackb {

static String TextureName = "CurrieAttack2.mtl";

static int Vertices = 176;

static int VertTexts = 138;

static int Normals = 108;

static int Faces = 164;

static int FacesB = 0;

static int SmoothGroups = 11;

static float VertArray[] = new float[]{
 2.550772f, 5.253622f, 1.472940f,
 3.558003f, 2.444239f, 1.046438f,
 1.859586f, 5.178355f, 0.195308f,
 2.861289f, 2.376532f, -0.240940f,
 0.971035f, 5.120219f, 0.861562f,
 0.922480f, 5.666288f, -1.015688f,
 -1.104264f, 4.882924f, 0.876705f,
 -1.028042f, 5.749814f, -0.889130f,
 -0.065616f, 5.016095f, 0.674948f,
 0.600567f, 5.139911f, -0.092790f,
 -0.039569f, 5.201190f, -0.640795f,
 -0.055933f, 5.812499f, 1.211786f,
 0.998259f, 6.033004f, 0.158919f,
 -0.065862f, 6.394973f, -0.942299f,
 -0.048751f, 6.917852f, 1.180365f,
 0.814705f, 6.940779f, 0.326187f,
 -0.064358f, 7.292331f, -0.568281f,
 -0.057397f, 6.972330f, 0.108180f,
 0.382607f, 6.805941f, -0.226522f,
 -0.062830f, 6.529894f, -0.565658f,
 -0.059316f, 7.658268f, -0.129796f,
 0.561252f, 7.267373f, -0.620136f,
 -0.067854f, 6.874907f, -1.100064f,
 -0.064764f, 7.915203f, -0.608760f,
 0.375890f, 7.609145f, -0.895564f,
 -0.070503f, 7.360096f, -1.295094f,
 -0.039994f, 2.738031f, -0.125857f,
 0.159242f, 2.146698f, -1.250040f,
 -1.222466f, 0.000183f, 1.332248f,
 1.067530f, 0.000159f, -0.957855f,
 -0.016010f, 4.261590f, 0.888887f,
 -0.055359f, 5.250586f, -1.104298f,
 -0.065754f, 5.186929f, 0.607824f,
 -0.043701f, 5.579593f, -0.647854f,
 0.522492f, 5.413737f, 0.002237f,
 0.266315f, 5.327745f, 0.291613f,
 0.284764f, 5.505504f, -0.409973f,
 0.699242f, 2.666266f, -0.138925f,
 1.061794f, 2.448514f, -0.530823f,
 1.486753f, 0.000165f, 1.332478f,
 0.132379f, -0.000073f, 1.960280f,
 0.714903f, 2.215177f, -1.022303f,
 1.695596f, -0.000165f, 0.396806f,
 0.847109f, 4.472754f, 0.631425f,
 1.384362f, 5.099675f, -0.202362f,
 1.004643f, 5.247353f, -0.849152f,
 2.429201f, 3.497376f, 0.835409f,
 1.899007f, 3.475154f, -0.401502f,
 1.813520f, 3.835917f, -0.168611f,
 2.301057f, 3.873841f, 0.971790f,
 0.772002f, 4.547745f, -0.597060f,
 0.775177f, 4.479128f, -0.186732f,
 2.116479f, 4.057245f, -0.105988f,
 2.739960f, 4.209731f, 1.285354f,
 0.709918f, 4.968695f, 0.126014f,
 2.285525f, 4.099043f, -0.407491f,
 3.141849f, 4.227466f, 0.758386f,
 1.504029f, 5.117783f, -0.287878f,
 2.380812f, 3.710993f, -0.651819f,
 3.269930f, 3.850860f, 0.621584f,
 1.413098f, 5.107949f, -0.731619f,
 2.287666f, 3.378619f, -0.510725f,
 3.001801f, 3.440557f, 1.006808f,
 0.696432f, 5.277221f, -0.691752f,
 -0.708242f, 2.663870f, -0.471457f,
 -1.850541f, -0.000154f, -0.022512f,
 -1.222759f, 0.000165f, -1.377033f,
 -0.885575f, 2.488040f, -1.095231f,
 -0.287192f, -0.000165f, -1.585891f,
 -0.426982f, 2.249349f, -1.292672f,
 -1.476287f, 4.988836f, -0.198261f,
 -0.972384f, 4.400603f, 0.631506f,
 -1.116127f, 5.184805f, -0.840539f,
 -0.645318f, 5.374699f, 0.016539f,
 -0.394576f, 5.310284f, 0.284807f,
 -0.364434f, 5.496924f, -0.429091f,
 -2.388937f, 3.261718f, -0.868335f,
 -2.281107f, 3.393918f, -0.483478f,
 -1.795852f, 4.258119f, -1.210002f,
 -1.857826f, 4.235294f, -1.632354f,
 -0.824588f, 4.416570f, -0.194974f,
 -0.824336f, 4.488116f, -0.599369f,
 -2.737328f, 3.342700f, -0.044284f,
 -2.112964f, 4.318716f, -1.014857f,
 -0.793737f, 4.905558f, 0.128378f,
 -3.139390f, 3.753067f, -0.374432f,
 -2.283458f, 4.578963f, -1.144786f,
 -1.597977f, 4.946944f, -0.092611f,
 -3.247281f, 3.621707f, -0.758395f,
 -2.351912f, 4.561035f, -1.623652f,
 -1.501931f, 5.332048f, -0.303678f,
 -2.957853f, 3.074214f, -0.829754f,
 -2.241249f, 4.247197f, -1.792628f,
 -0.806034f, 5.219030f, -0.689823f,
 -0.710340f, 5.077353f, -0.054058f,
 -1.113602f, 6.028080f, 0.183126f,
 -0.926076f, 6.940400f, 0.340834f,
 -0.502856f, 6.805567f, -0.218010f,
 -0.687402f, 7.267176f, -0.604737f,
 -0.506884f, 7.610293f, -0.881038f,
 -1.213120f, 1.836022f, 0.694940f,
 -0.277165f, 1.869557f, 1.321281f,
 0.839484f, 1.876003f, 1.172215f,
 1.291925f, 1.629597f, 0.978847f,
 1.043293f, 1.201924f, 0.364721f,
 0.260714f, 1.029374f, -0.163050f,
 -0.721315f, 1.211632f, -0.412494f,
 -1.316640f, 1.543911f, -0.237483f,
 2.429201f, 3.497376f, 0.835409f,
 2.429201f, 3.497376f, 0.835409f,
 1.899007f, 3.475154f, -0.401502f,
 1.899007f, 3.475154f, -0.401502f,
 0.772002f, 4.547745f, -0.597060f,
 0.772002f, 4.547745f, -0.597060f,
 3.001801f, 3.440557f, 1.006808f,
 3.001801f, 3.440557f, 1.006808f,
 0.260714f, 1.029374f, -0.163050f,
 0.260714f, 1.029374f, -0.163050f,
 0.159242f, 2.146698f, -1.250040f,
 -0.277165f, 1.869557f, 1.321281f,
 -0.277165f, 1.869557f, 1.321281f,
 -0.039994f, 2.738031f, -0.125857f,
 -0.039994f, 2.738031f, -0.125857f,
 -0.016010f, 4.261590f, 0.888887f,
 -0.016010f, 4.261590f, 0.888887f,
 0.159242f, 2.146698f, -1.250040f,
 -0.055359f, 5.250586f, -1.104298f,
 -0.055359f, 5.250586f, -1.104298f,
 -0.016010f, 4.261590f, 0.888887f,
 -0.065754f, 5.186929f, 0.607824f,
 -0.065754f, 5.186929f, 0.607824f,
 -0.055359f, 5.250586f, -1.104298f,
 -0.055359f, 5.250586f, -1.104298f,
 -0.043701f, 5.579593f, -0.647854f,
 -2.388937f, 3.261718f, -0.868335f,
 -2.388937f, 3.261718f, -0.868335f,
 -1.857826f, 4.235294f, -1.632354f,
 -0.824336f, 4.488116f, -0.599369f,
 -0.824336f, 4.488116f, -0.599369f,
 -1.857826f, 4.235294f, -1.632354f,
 -2.957853f, 3.074214f, -0.829754f,
 -2.957853f, 3.074214f, -0.829754f,
 -0.055933f, 5.812499f, 1.211786f,
 -0.065616f, 5.016095f, 0.674948f,
 -0.065616f, 5.016095f, 0.674948f,
 -0.065862f, 6.394973f, -0.942299f,
 -0.039569f, 5.201190f, -0.640795f,
 -0.039569f, 5.201190f, -0.640795f,
 -0.048751f, 6.917852f, 1.180365f,
 -0.055933f, 5.812499f, 1.211786f,
 -0.055933f, 5.812499f, 1.211786f,
 -0.065862f, 6.394973f, -0.942299f,
 -0.065862f, 6.394973f, -0.942299f,
 -0.064358f, 7.292331f, -0.568281f,
 -0.064358f, 7.292331f, -0.568281f,
 -0.048751f, 6.917852f, 1.180365f,
 -0.059316f, 7.658268f, -0.129796f,
 -0.059316f, 7.658268f, -0.129796f,
 -0.057397f, 6.972330f, 0.108180f,
 -0.067854f, 6.874907f, -1.100064f,
 -0.062830f, 6.529894f, -0.565658f,
 -0.062830f, 6.529894f, -0.565658f,
 -0.064764f, 7.915203f, -0.608760f,
 -0.059316f, 7.658268f, -0.129796f,
 -0.059316f, 7.658268f, -0.129796f,
 -0.070503f, 7.360096f, -1.295094f,
 -0.067854f, 6.874907f, -1.100064f,
 -0.067854f, 6.874907f, -1.100064f,
 -0.070503f, 7.360096f, -1.295094f,
 -0.064764f, 7.915203f, -0.608760f,
 -0.277165f, 1.869557f, 1.321281f,
 -1.222466f, 0.000183f, 1.332248f,
 -1.222466f, 0.000183f, 1.332248f,
 1.067530f, 0.000159f, -0.957855f,
 1.067530f, 0.000159f, -0.957855f,
 0.260714f, 1.029374f, -0.163050f,};

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
{ 0.811269f, 0.360715f, -0.460139f},
{ 0.811689f, 0.361365f, -0.458886f},
{ 0.811438f, 0.360977f, -0.459634f},
{ 0.811856f, 0.361625f, -0.458386f},
{ -0.107031f, 0.953939f, 0.280257f},
{ -0.026334f, 0.933297f, 0.358138f},
{ -0.023024f, 0.932194f, 0.361227f},
{ 0.066985f, 0.894499f, 0.442022f},
{ 0.189148f, 0.532855f, 0.824796f},
{ 0.905408f, 0.331277f, 0.265502f},
{ 0.457523f, 0.227600f, 0.859576f},
{ 0.975450f, -0.066581f, -0.209914f},
{ 0.816449f, 0.151955f, -0.557065f},
{ 0.567869f, -0.189640f, -0.800975f},
{ 0.212681f, -0.216781f, -0.952771f},
{ 0.423706f, 0.156912f, -0.892106f},
{ -0.139530f, 0.418650f, 0.897365f},
{ -0.239956f, 0.182826f, 0.953413f},
{ 0.987176f, 0.143123f, 0.070710f},
{ 0.686866f, -0.101398f, 0.719676f},
{ -0.016020f, -0.289110f, 0.957162f},
{ 0.001034f, 0.192626f, -0.981272f},
{ 0.521618f, 0.189929f, -0.831770f},
{ 0.422332f, 0.782049f, 0.458296f},
{ 0.465741f, 0.581492f, 0.667047f},
{ -0.024561f, 0.440070f, 0.897627f},
{ 0.018442f, 0.810863f, -0.584946f},
{ 0.229523f, 0.938470f, -0.258057f},
{ -0.802552f, 0.158084f, 0.575256f},
{ -0.675648f, -0.320565f, 0.663881f},
{ -0.426120f, -0.838437f, 0.339772f},
{ -0.584260f, -0.807124f, -0.084802f},
{ -0.195186f, -0.344946f, -0.918104f},
{ -0.371727f, -0.734637f, 0.567563f},
{ -0.070411f, 0.759323f, 0.646893f},
{ -0.061521f, 0.803106f, 0.592652f},
{ 0.159770f, 0.323386f, 0.932682f},
{ 0.474655f, 0.879817f, -0.024993f},
{ 0.681345f, 0.662830f, -0.310526f},
{ 0.477056f, 0.696307f, 0.536259f},
{ 0.910058f, -0.247668f, -0.332347f},
{ 0.470833f, -0.050691f, -0.880765f},
{ 0.162160f, 0.336457f, -0.927632f},
{ 0.496671f, -0.831035f, 0.250397f},
{ 0.186470f, -0.794576f, -0.577821f},
{ 0.109463f, 0.569461f, -0.814697f},
{ 0.010337f, -0.273610f, 0.961785f},
{ -0.003543f, -0.580590f, 0.814188f},
{ 0.996040f, -0.082439f, -0.033293f},
{ 0.919024f, -0.383347f, -0.091867f},
{ -0.016455f, 0.056222f, -0.998283f},
{ -0.024533f, -0.214389f, -0.976440f},
{ 0.008906f, 0.577966f, 0.816012f},
{ 0.788708f, 0.599508f, 0.136122f},
{ -0.005005f, 0.856376f, -0.516329f},
{ 0.008573f, 0.327779f, 0.944716f},
{ 0.940191f, -0.129246f, 0.315178f},
{ 0.010868f, 0.618128f, 0.786002f},
{ 0.999447f, 0.028408f, 0.017309f},
{ -0.005973f, -0.838910f, -0.544238f},
{ -0.009033f, -0.672804f, -0.739766f},
{ 0.001647f, 0.999959f, -0.008899f},
{ 0.730636f, 0.529892f, -0.430564f},
{ -0.015526f, 0.149826f, -0.988591f},
{ -0.836237f, -0.108053f, -0.537617f},
{ -0.954023f, 0.124405f, -0.272698f},
{ -0.820240f, 0.139402f, 0.554774f},
{ -0.768158f, 0.493249f, 0.408214f},
{ -0.146224f, -0.189213f, -0.970988f},
{ 0.116229f, 0.207380f, -0.971331f},
{ -0.694758f, -0.272114f, 0.665781f},
{ -0.996223f, 0.032909f, 0.080354f},
{ -0.551794f, 0.229232f, -0.801858f},
{ -0.477463f, 0.764292f, 0.433461f},
{ -0.493118f, 0.565255f, 0.661303f},
{ -0.284334f, 0.922428f, -0.261304f},
{ 0.657423f, -0.345094f, -0.669855f},
{ 0.484636f, -0.861003f, 0.154278f},
{ 0.464676f, -0.775170f, -0.428005f},
{ 0.792860f, -0.323550f, 0.516419f},
{ 0.634802f, -0.401451f, -0.660200f},
{ -0.342569f, -0.666857f, 0.661776f},
{ -0.012886f, -0.038435f, 0.999178f},
{ 0.031546f, -0.028131f, 0.999106f},
{ -0.214539f, -0.063732f, 0.974634f},
{ -0.509280f, 0.560009f, 0.653471f},
{ -0.703021f, 0.638197f, 0.313794f},
{ -0.523389f, -0.283843f, 0.803428f},
{ -0.894363f, 0.076750f, -0.440709f},
{ -0.360917f, 0.701434f, -0.614597f},
{ -0.260719f, 0.957564f, -0.122867f},
{ -0.045614f, 0.030475f, -0.998494f},
{ -0.452858f, -0.727758f, -0.515061f},
{ 0.302649f, 0.706443f, -0.639799f},
{ -0.995911f, -0.084073f, -0.033058f},
{ -0.924500f, -0.363549f, -0.114595f},
{ -0.786549f, 0.600508f, 0.143982f},
{ -0.999027f, 0.027215f, 0.034703f},
{ -0.934934f, -0.130012f, 0.330143f},
{ -0.741419f, 0.528303f, -0.413756f},
{ -0.927956f, 0.359924f, -0.096712f},
{ -0.632265f, 0.283987f, 0.720827f},
{ -0.091382f, 0.414740f, 0.905340f},
{ 0.671428f, 0.217937f, 0.708299f},
{ 0.919670f, 0.347513f, -0.182872f},
{ 0.475718f, 0.659260f, -0.582296f},
{ 0.153792f, 0.695033f, -0.702337f},
{ -0.537900f, 0.540429f, -0.646993f}};

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


//Vertices: 176  Texture Co-ords: 138  Normals: 108  Texture: CurrieAttack2.mtl Faces: 164 Smooth Groups: 11 sucess: 117 Doubles: 47 Redos needed: 68 Correct: 73