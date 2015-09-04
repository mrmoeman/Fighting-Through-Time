package com.example.jgfjhg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;
import android.graphics.Bitmap;
import android.opengl.GLUtils;

class lilhoodblockd {

static String TextureName = "LRRH";

static int Vertices = 314;

static int VertTexts = 199;

static int Normals = 344;

static int Faces = 196;

static int FacesB = 21;

static int SmoothGroups = 91;

static float VertArray[] = new float[]{
 5.327505f, 3.118948f, 2.196396f,
 -1.737807f, 8.544400f, 4.189484f,
 4.703075f, 3.300065f, 1.844172f,
 -1.566490f, 8.114464f, 3.612784f,
 1.470935f, 6.128717f, 3.369860f,
 1.931377f, 6.381562f, 4.313807f,
 2.173195f, 5.589452f, 3.171756f,
 2.633636f, 5.842296f, 4.115703f,
 5.319370f, 2.567855f, 1.211762f,
 4.323331f, 3.328782f, 1.485778f,
 -2.576028f, 8.630730f, 3.439013f,
 -1.585960f, 7.866524f, 3.152754f,
 0.555432f, 7.192626f, 4.267186f,
 0.331901f, 6.873372f, 3.460956f,
 3.643837f, 4.821040f, 3.395963f,
 3.121900f, 4.730932f, 2.673912f,
 -0.440869f, 7.363389f, -0.692785f,
 0.848107f, 7.939988f, 0.802614f,
 2.338445f, 7.840926f, -2.571234f,
 2.889978f, 8.219847f, -1.050379f,
 1.664543f, 4.198525f, 0.344031f,
 0.766197f, 4.186596f, 0.686436f,
 0.852410f, 3.970820f, -1.251001f,
 1.717868f, 3.955954f, -0.986245f,
 0.983691f, 7.098502f, -0.264202f,
 0.318864f, 6.954284f, -0.652458f,
 1.959342f, 7.059726f, -2.086068f,
 2.183463f, 7.281329f, -1.222501f,
 -1.219093f, 10.361217f, -1.106681f,
 -1.058809f, 10.208125f, -0.787401f,
 1.216989f, 10.395512f, -2.261035f,
 0.989000f, 10.406984f, -2.492408f,
 0.806416f, 5.817131f, 0.338928f,
 0.853282f, 5.078836f, -1.797070f,
 1.618820f, 5.126446f, -1.665033f,
 1.578643f, 5.736156f, 0.161079f,
 2.299846f, 1.950541f, 1.346538f,
 0.721163f, 1.328962f, 0.833421f,
 0.923524f, 2.278426f, -2.835016f,
 2.370872f, 1.456777f, -1.099666f,
 0.821517f, 6.262112f, -2.950184f,
 3.020062f, 5.425764f, -1.352657f,
 0.812976f, 0.720198f, -3.106665f,
 5.384276f, 0.931046f, 0.291412f,
 -1.384927f, 10.040204f, -1.312606f,
 0.888188f, 10.226209f, -2.790563f,
 -0.097507f, 4.140947f, 0.312635f,
 0.042697f, 5.744078f, 0.124641f,
 0.082875f, 5.134367f, -1.701471f,
 -0.037940f, 4.033014f, -0.997211f,
 -0.208602f, 6.798302f, -1.227125f,
 -1.222076f, 6.874035f, -2.531370f,
 1.233519f, 7.366924f, -3.718071f,
 1.287332f, 6.819903f, -2.665701f,
 -0.761104f, 1.415137f, -0.440988f,
 -0.613238f, 2.288013f, -2.755068f,
 -0.566611f, 4.826674f, -3.197231f,
 -2.146102f, 0.931409f, -3.298599f,
 4.071957f, 3.805328f, -1.032222f,
 0.807320f, 3.686786f, -3.251629f,
 -1.638752f, 3.236628f, -3.252803f,
 1.877178f, 5.998493f, 1.394789f,
 1.768201f, 6.155679f, 1.245373f,
 2.094655f, 6.278220f, 1.313740f,
 1.971069f, 6.449746f, 1.126718f,
 2.030781f, 5.606323f, 3.005180f,
 1.450298f, 6.027585f, 3.092637f,
 2.413484f, 6.098569f, 2.862554f,
 1.768094f, 6.566935f, 2.959791f,
 2.139001f, 5.593695f, 3.784303f,
 1.558517f, 6.014957f, 3.871760f,
 2.521706f, 6.085944f, 3.641676f,
 1.876314f, 6.554310f, 3.738912f,
 1.508500f, 5.947050f, -0.415830f,
 1.527354f, 5.584886f, -1.289314f,
 1.596848f, 6.327081f, -1.659118f,
 1.575764f, 6.747442f, -0.678962f,
 -1.288495f, 6.167788f, 1.069997f,
 -0.924568f, 6.166637f, 0.950510f,
 -1.363729f, 6.508346f, 0.967663f,
 -0.954145f, 6.499048f, 0.810724f,
 -1.575961f, 5.986642f, 2.699506f,
 -0.868936f, 6.118287f, 2.769197f,
 -1.708354f, 6.585936f, 2.519426f,
 -0.922274f, 6.732300f, 2.596910f,
 -1.668544f, 6.072821f, 3.475976f,
 -0.961519f, 6.204465f, 3.545667f,
 -1.800937f, 6.672119f, 3.295894f,
 -1.014855f, 6.818483f, 3.373378f,
 0.111958f, 5.954465f, -0.448702f,
 0.130800f, 5.591367f, -1.321889f,
 0.086590f, 6.333776f, -1.695161f,
 0.065507f, 6.755225f, -0.714822f,
 2.420236f, 0.611014f, 1.750377f,
 1.286887f, 0.611012f, 1.750377f,
 1.286887f, 0.039443f, 2.325288f,
 2.420236f, 0.039444f, 2.325288f,
 1.166096f, 1.888181f, 0.688460f,
 1.853204f, 1.895641f, 0.701340f,
 1.180189f, 1.785541f, -0.003877f,
 1.867297f, 1.793001f, 0.009003f,
 1.365588f, 0.614665f, 1.068962f,
 2.341534f, 0.614666f, 1.068962f,
 1.365588f, 0.026562f, 0.111251f,
 2.341535f, 0.026562f, 0.111251f,
 1.664229f, 4.198524f, 0.344017f,
 0.765882f, 4.186579f, 0.686430f,
 0.852097f, 3.970841f, -1.251001f,
 1.717555f, 3.955957f, -0.986255f,
 -0.792285f, 0.611017f, -0.545925f,
 0.341064f, 0.611016f, -0.545924f,
 0.341064f, 0.039443f, 0.028983f,
 -0.792285f, 0.039444f, 0.028982f,
 0.424842f, 1.683935f, -0.923964f,
 -0.261700f, 1.693391f, -0.954107f,
 0.456996f, 1.866633f, -1.598984f,
 -0.229547f, 1.876089f, -1.629127f,
 0.262364f, 0.614673f, -1.227340f,
 -0.713583f, 0.614675f, -1.227341f,
 0.262365f, 0.026577f, -2.185054f,
 -0.713581f, 0.026577f, -2.185055f,
 -0.097507f, 4.140947f, 0.312635f,
 0.766197f, 4.186596f, 0.686436f,
 0.852410f, 3.970820f, -1.251001f,
 -0.037940f, 4.033014f, -0.997211f,
 2.183463f, 7.281329f, -1.222501f,
 2.889978f, 8.219847f, -1.050379f,
 0.983691f, 7.098502f, -0.264202f,
 0.983691f, 7.098502f, -0.264202f,
 2.889978f, 8.219847f, -1.050379f,
 0.848107f, 7.939988f, 0.802614f,
 -1.058809f, 10.208125f, -0.787401f,
 -1.058809f, 10.208125f, -0.787401f,
 -1.219093f, 10.361217f, -1.106681f,
 2.889978f, 8.219847f, -1.050379f,
 0.848107f, 7.939988f, 0.802614f,
 0.848107f, 7.939988f, 0.802614f,
 1.216989f, 10.395512f, -2.261035f,
 1.216989f, 10.395512f, -2.261035f,
 0.989000f, 10.406984f, -2.492408f,
 2.183463f, 7.281329f, -1.222501f,
 1.959342f, 7.059726f, -2.086068f,
 1.959342f, 7.059726f, -2.086068f,
 0.983691f, 7.098502f, -0.264202f,
 0.983691f, 7.098502f, -0.264202f,
 0.318864f, 6.954284f, -0.652458f,
 1.664543f, 4.198525f, 0.344031f,
 0.766197f, 4.186596f, 0.686436f,
 0.766197f, 4.186596f, 0.686436f,
 0.852410f, 3.970820f, -1.251001f,
 1.717868f, 3.955954f, -0.986245f,
 1.717868f, 3.955954f, -0.986245f,
 1.664543f, 4.198525f, 0.344031f,
 1.717868f, 3.955954f, -0.986245f,
 1.717868f, 3.955954f, -0.986245f,
 2.370872f, 1.456777f, -1.099666f,
 2.183463f, 7.281329f, -1.222501f,
 2.183463f, 7.281329f, -1.222501f,
 0.983691f, 7.098502f, -0.264202f,
 2.183463f, 7.281329f, -1.222501f,
 1.959342f, 7.059726f, -2.086068f,
 1.959342f, 7.059726f, -2.086068f,
 -0.037940f, 4.033014f, -0.997211f,
 -0.037940f, 4.033014f, -0.997211f,
 0.082875f, 5.134367f, -1.701471f,
 -0.208602f, 6.798302f, -1.227125f,
 -1.222076f, 6.874035f, -2.531370f,
 1.287332f, 6.819903f, -2.665701f,
 1.287332f, 6.819903f, -2.665701f,
 -1.222076f, 6.874035f, -2.531370f,
 1.233519f, 7.366924f, -3.718071f,
 -1.219093f, 10.361217f, -1.106681f,
 -1.384927f, 10.040204f, -1.312606f,
 -1.384927f, 10.040204f, -1.312606f,
 -1.222076f, 6.874035f, -2.531370f,
 -1.222076f, 6.874035f, -2.531370f,
 1.233519f, 7.366924f, -3.718071f,
 0.888188f, 10.226209f, -2.790563f,
 0.888188f, 10.226209f, -2.790563f,
 0.989000f, 10.406984f, -2.492408f,
 1.959342f, 7.059726f, -2.086068f,
 1.287332f, 6.819903f, -2.665701f,
 1.287332f, 6.819903f, -2.665701f,
 0.318864f, 6.954284f, -0.652458f,
 0.318864f, 6.954284f, -0.652458f,
 -0.208602f, 6.798302f, -1.227125f,
 -0.097507f, 4.140947f, 0.312635f,
 -0.097507f, 4.140947f, 0.312635f,
 0.766197f, 4.186596f, 0.686436f,
 0.852410f, 3.970820f, -1.251001f,
 0.852410f, 3.970820f, -1.251001f,
 -0.037940f, 4.033014f, -0.997211f,
 -0.037940f, 4.033014f, -0.997211f,
 -0.037940f, 4.033014f, -0.997211f,
 -0.097507f, 4.140947f, 0.312635f,
 -0.208602f, 6.798302f, -1.227125f,
 0.082875f, 5.134367f, -1.701471f,
 0.082875f, 5.134367f, -1.701471f,
 -0.208602f, 6.798302f, -1.227125f,
 1.287332f, 6.819903f, -2.665701f,
 1.959342f, 7.059726f, -2.086068f,
 1.287332f, 6.819903f, -2.665701f,
 1.287332f, 6.819903f, -2.665701f,
 1.527354f, 5.584886f, -1.289314f,
 1.527354f, 5.584886f, -1.289314f,
 1.877178f, 5.998493f, 1.394789f,
 1.877178f, 5.998493f, 1.394789f,
 1.877178f, 5.998493f, 1.394789f,
 2.030781f, 5.606323f, 3.005180f,
 2.521706f, 6.085944f, 3.641676f,
 2.030781f, 5.606323f, 3.005180f,
 2.030781f, 5.606323f, 3.005180f,
 2.521706f, 6.085944f, 3.641676f,
 2.139001f, 5.593695f, 3.784303f,
 2.521706f, 6.085944f, 3.641676f,
 2.521706f, 6.085944f, 3.641676f,
 1.876314f, 6.554310f, 3.738912f,
 1.876314f, 6.554310f, 3.738912f,
 1.876314f, 6.554310f, 3.738912f,
 -1.288495f, 6.167788f, 1.069997f,
 0.130800f, 5.591367f, -1.321889f,
 0.130800f, 5.591367f, -1.321889f,
 -1.575961f, 5.986642f, 2.699506f,
 -1.288495f, 6.167788f, 1.069997f,
 -1.288495f, 6.167788f, 1.069997f,
 -1.668544f, 6.072821f, 3.475976f,
 -1.800937f, 6.672119f, 3.295894f,
 -1.575961f, 5.986642f, 2.699506f,
 -1.575961f, 5.986642f, 2.699506f,
 -1.800937f, 6.672119f, 3.295894f,
 -1.800937f, 6.672119f, 3.295894f,
 -1.800937f, 6.672119f, 3.295894f,
 -1.014855f, 6.818483f, 3.373378f,
 -1.014855f, 6.818483f, 3.373378f,
 -1.014855f, 6.818483f, 3.373378f,
 0.852097f, 3.970841f, -1.251001f,
 1.180189f, 1.785541f, -0.003877f,
 1.180189f, 1.785541f, -0.003877f,
 1.664229f, 4.198524f, 0.344017f,
 1.664229f, 4.198524f, 0.344017f,
 1.853204f, 1.895641f, 0.701340f,
 1.180189f, 1.785541f, -0.003877f,
 1.365588f, 0.026562f, 0.111251f,
 1.365588f, 0.026562f, 0.111251f,
 2.341535f, 0.026562f, 0.111251f,
 1.853204f, 1.895641f, 0.701340f,
 2.341534f, 0.614666f, 1.068962f,
 2.341534f, 0.614666f, 1.068962f,
 2.341535f, 0.026562f, 0.111251f,
 2.341534f, 0.614666f, 1.068962f,
 1.365588f, 0.614665f, 1.068962f,};

static float VertArrayB[] = new float[]{
 2.420236f, 0.611014f, 1.750377f,
 1.365588f, 0.614665f, 1.068962f,
 1.286887f, 0.611012f, 1.750377f,
 1.365588f, 0.026562f, 0.111251f,
 1.286887f, 0.039443f, 2.325288f,
 1.365588f, 0.614665f, 1.068962f,
 1.365588f, 0.614665f, 1.068962f,
 1.286887f, 0.039443f, 2.325288f,
 1.286887f, 0.611012f, 1.750377f,
 1.365588f, 0.026562f, 0.111251f,
 2.341535f, 0.026562f, 0.111251f,
 1.286887f, 0.039443f, 2.325288f,
 2.341535f, 0.026562f, 0.111251f,
 2.341534f, 0.614666f, 1.068962f,
 2.420236f, 0.039444f, 2.325288f,
 2.420236f, 0.039444f, 2.325288f,
 2.341534f, 0.614666f, 1.068962f,
 2.420236f, 0.611014f, 1.750377f,
 0.852410f, 3.970820f, -1.251001f,
 0.456996f, 1.866633f, -1.598984f,
 -0.037940f, 4.033014f, -0.997211f,
 -0.037940f, 4.033014f, -0.997211f,
 0.456996f, 1.866633f, -1.598984f,
 -0.229547f, 1.876089f, -1.629127f,
 -0.229547f, 1.876089f, -1.629127f,
 -0.261700f, 1.693391f, -0.954107f,
 -0.037940f, 4.033014f, -0.997211f,
 -0.037940f, 4.033014f, -0.997211f,
 -0.261700f, 1.693391f, -0.954107f,
 -0.097507f, 4.140947f, 0.312635f,
 0.456996f, 1.866633f, -1.598984f,
 0.262365f, 0.026577f, -2.185054f,
 -0.229547f, 1.876089f, -1.629127f,
 -0.229547f, 1.876089f, -1.629127f,
 0.262365f, 0.026577f, -2.185054f,
 -0.713581f, 0.026577f, -2.185055f,
 -0.713581f, 0.026577f, -2.185055f,
 -0.713583f, 0.614675f, -1.227341f,
 -0.229547f, 1.876089f, -1.629127f,
 -0.229547f, 1.876089f, -1.629127f,
 -0.713583f, 0.614675f, -1.227341f,
 -0.261700f, 1.693391f, -0.954107f,
 -0.713583f, 0.614675f, -1.227341f,
 -0.792285f, 0.611017f, -0.545925f,
 0.262364f, 0.614673f, -1.227340f,
 0.262364f, 0.614673f, -1.227340f,
 -0.792285f, 0.611017f, -0.545925f,
 0.341064f, 0.611016f, -0.545924f,
 0.341064f, 0.611016f, -0.545924f,
 0.341064f, 0.039443f, 0.028983f,
 0.262364f, 0.614673f, -1.227340f,
 0.262364f, 0.614673f, -1.227340f,
 0.341064f, 0.039443f, 0.028983f,
 0.262365f, 0.026577f, -2.185054f,
 0.262365f, 0.026577f, -2.185054f,
 0.341064f, 0.039443f, 0.028983f,
 -0.713581f, 0.026577f, -2.185055f,
 -0.713581f, 0.026577f, -2.185055f,
 -0.792285f, 0.039444f, 0.028982f,
 -0.713583f, 0.614675f, -1.227341f,
 -0.713583f, 0.614675f, -1.227341f,
 -0.792285f, 0.039444f, 0.028982f,
 -0.792285f, 0.611017f, -0.545925f,};

static float[] TextArray = new float[]{
 0.079364f, 0.603509f,
 0.079397f, 0.054130f,
 0.111348f, 0.572591f,
 0.111378f, 0.085050f,
 0.074195f, 0.300773f,
 0.009202f, 0.300773f,
 0.074201f, 0.355385f,
 0.009195f, 0.355368f,
 0.135816f, 0.649511f,
 0.139523f, 0.558566f,
 0.135624f, 0.007882f,
 0.139551f, 0.099076f,
 0.035525f, 0.208282f,
 0.088138f, 0.219877f,
 0.035509f, 0.448421f,
 0.088131f, 0.436837f,
 0.630075f, 0.318071f,
 0.777400f, 0.318071f,
 0.265372f, 0.303773f,
 0.147307f, 0.303773f,
 0.488957f, 0.012375f,
 0.423595f, 0.011904f,
 0.711862f, 0.011933f,
 0.646199f, 0.012374f,
 0.693849f, 0.268292f,
 0.630075f, 0.268292f,
 0.265372f, 0.262174f,
 0.214264f, 0.263880f,
 0.805419f, 0.249658f,
 0.805419f, 0.236209f,
 0.975264f, 0.236209f,
 0.975264f, 0.249658f,
 0.422835f, 0.121346f,
 0.712567f, 0.120121f,
 0.647108f, 0.121788f,
 0.488577f, 0.121787f,
 0.592804f, 0.994977f,
 0.689407f, 0.955205f,
 0.934362f, 0.594129f,
 0.934354f, 0.489988f,
 0.486458f, 0.507535f,
 0.582212f, 0.506361f,
 0.486458f, 0.737638f,
 0.651913f, 0.736464f,
 0.805419f, 0.263107f,
 0.975264f, 0.263108f,
 0.358234f, 0.011467f,
 0.357094f, 0.120874f,
 0.773870f, 0.120976f,
 0.782091f, 0.011476f,
 0.566302f, 0.268292f,
 0.482750f, 0.318072f,
 0.383437f, 0.303773f,
 0.316479f, 0.263880f,
 0.786929f, 0.917745f,
 0.935598f, 0.698590f,
 0.390703f, 0.506361f,
 0.321002f, 0.736464f,
 0.617062f, 0.621413f,
 0.486458f, 0.622587f,
 0.355853f, 0.621412f,
 0.036262f, 0.882715f,
 0.063521f, 0.884403f,
 0.125636f, 0.888754f,
 0.093046f, 0.889655f,
 0.028541f, 0.803332f,
 0.061668f, 0.803332f,
 0.126707f, 0.803332f,
 0.089227f, 0.803332f,
 0.028397f, 0.767704f,
 0.063216f, 0.767704f,
 0.028397f, 0.727884f,
 0.063216f, 0.727469f,
 0.062904f, 0.969132f,
 0.022767f, 0.967681f,
 0.132879f, 0.967236f,
 0.091184f, 0.968537f,
 0.036262f, 0.882715f,
 0.063521f, 0.884403f,
 0.125636f, 0.888754f,
 0.093046f, 0.889655f,
 0.028541f, 0.803332f,
 0.061668f, 0.803332f,
 0.126707f, 0.803332f,
 0.089227f, 0.803332f,
 0.028397f, 0.767704f,
 0.063216f, 0.767704f,
 0.028397f, 0.727884f,
 0.063216f, 0.727469f,
 0.062904f, 0.969132f,
 0.022767f, 0.967681f,
 0.132879f, 0.967236f,
 0.091184f, 0.968537f,
 0.862196f, 0.955301f,
 0.918038f, 0.955301f,
 0.918038f, 0.926974f,
 0.862196f, 0.926974f,
 0.256825f, 0.881334f,
 0.292701f, 0.881456f,
 0.218504f, 0.881342f,
 0.235118f, 0.593559f,
 0.254307f, 0.942159f,
 0.294779f, 0.942745f,
 0.212156f, 0.971357f,
 0.866076f, 0.817884f,
 0.323010f, 0.761275f,
 0.284589f, 0.761755f,
 0.184288f, 0.761519f,
 0.213615f, 0.713385f,
 0.862196f, 0.955301f,
 0.918038f, 0.955301f,
 0.918038f, 0.926974f,
 0.862196f, 0.926974f,
 0.256825f, 0.881334f,
 0.292701f, 0.881456f,
 0.218504f, 0.881342f,
 0.254307f, 0.942159f,
 0.294779f, 0.942745f,
 0.212156f, 0.971357f,
 0.866076f, 0.817884f,
 0.323010f, 0.761275f,
 0.284589f, 0.761755f,
 0.184288f, 0.761519f,
 0.950447f, 0.030323f,
 0.994107f, 0.069861f,
 0.830236f, 0.030323f,
 0.830236f, 0.030323f,
 0.994107f, 0.069861f,
 0.797056f, 0.069861f,
 0.656294f, 0.527511f,
 0.656294f, 0.527511f,
 0.630075f, 0.544444f,
 0.994107f, 0.069861f,
 0.797056f, 0.069861f,
 0.797056f, 0.069861f,
 0.252709f, 0.471616f,
 0.252709f, 0.471616f,
 0.265372f, 0.485186f,
 0.646986f, 0.253990f,
 0.713420f, 0.251201f,
 0.713420f, 0.251201f,
 0.488118f, 0.253991f,
 0.488118f, 0.253991f,
 0.421917f, 0.253517f,
 0.570051f, 0.817057f,
 0.626105f, 0.796095f,
 0.626105f, 0.796095f,
 0.763113f, 0.594129f,
 0.763113f, 0.533977f,
 0.763113f, 0.533977f,
 0.570051f, 0.817057f,
 0.430492f, 0.784985f,
 0.430492f, 0.784985f,
 0.333532f, 0.938934f,
 0.646986f, 0.253990f,
 0.646986f, 0.253990f,
 0.488118f, 0.253991f,
 0.521629f, 0.472552f,
 0.486458f, 0.473726f,
 0.486458f, 0.473726f,
 0.196441f, 0.009203f,
 0.196441f, 0.009203f,
 0.202748f, 0.118745f,
 0.830235f, 0.468993f,
 0.797056f, 0.429455f,
 0.950447f, 0.468993f,
 0.950447f, 0.468993f,
 0.797056f, 0.429455f,
 0.994106f, 0.429455f,
 0.630075f, 0.544444f,
 0.603856f, 0.527511f,
 0.603856f, 0.527511f,
 0.797056f, 0.429455f,
 0.797056f, 0.429455f,
 0.994106f, 0.429455f,
 0.278034f, 0.471616f,
 0.278034f, 0.471616f,
 0.265372f, 0.485186f,
 0.713420f, 0.251201f,
 0.783665f, 0.253088f,
 0.783665f, 0.253088f,
 0.421917f, 0.253517f,
 0.421917f, 0.253517f,
 0.355716f, 0.253071f,
 0.681239f, 0.772821f,
 0.681239f, 0.772821f,
 0.626105f, 0.796095f,
 0.763113f, 0.594129f,
 0.763113f, 0.594129f,
 0.761869f, 0.653963f,
 0.761869f, 0.653963f,
 0.761869f, 0.653963f,
 0.681239f, 0.772821f,
 0.355716f, 0.253071f,
 0.202748f, 0.118745f,
 0.202748f, 0.118745f,
 0.355716f, 0.253071f,
 0.193085f, 0.250798f,
 0.486458f, 0.473726f,
 0.451286f, 0.472552f,
 0.451286f, 0.472552f,
 0.167610f, 0.967103f,
 0.167610f, 0.967103f,
 0.147867f, 0.883841f,
 0.147867f, 0.883841f,
 0.147867f, 0.883841f,
 0.154473f, 0.803332f,
 0.127330f, 0.767704f,
 0.154473f, 0.803332f,
 0.154473f, 0.803332f,
 0.127330f, 0.767704f,
 0.154669f, 0.767704f,
 0.127330f, 0.767704f,
 0.127330f, 0.767704f,
 0.090776f, 0.767704f,
 0.090776f, 0.767704f,
 0.090776f, 0.767704f,
 0.147867f, 0.883841f,
 0.167610f, 0.967103f,
 0.167610f, 0.967103f,
 0.154473f, 0.803332f,
 0.147867f, 0.883841f,
 0.147867f, 0.883841f,
 0.154669f, 0.767704f,
 0.127330f, 0.767704f,
 0.154473f, 0.803332f,
 0.154473f, 0.803332f,
 0.127330f, 0.767704f,
 0.127330f, 0.767704f,
 0.127330f, 0.767704f,
 0.090776f, 0.767704f,
 0.090776f, 0.767704f,
 0.090776f, 0.767704f,
 0.176118f, 0.713420f,
 0.194413f, 0.593584f,
 0.194413f, 0.593584f,
 0.310668f, 0.713380f,
 0.310668f, 0.713380f,
 0.276453f, 0.593558f,
 0.194413f, 0.593584f,
 0.203156f, 0.503563f,
 0.203156f, 0.503563f,
 0.243427f, 0.503536f,
 0.276453f, 0.593558f,
 0.282801f, 0.532520f,
 0.282801f, 0.532520f,
 0.243427f, 0.503536f,
 0.866074f, 0.988875f,
 0.914161f, 0.988875f,};

static float[] TextArrayB = new float[]{
 0.862196f, 0.955301f,
 0.914161f, 0.988875f,
 0.918038f, 0.955301f,
 0.212156f, 0.971357f,
 0.321245f, 0.970722f,
 0.254307f, 0.942159f,
 0.254307f, 0.942159f,
 0.321245f, 0.970722f,
 0.292918f, 0.942560f,
 0.914163f, 0.817885f,
 0.866076f, 0.817884f,
 0.918038f, 0.926974f,
 0.243427f, 0.503536f,
 0.282801f, 0.532520f,
 0.344702f, 0.504178f,
 0.344702f, 0.504178f,
 0.282801f, 0.532520f,
 0.316375f, 0.532340f,
 0.176118f, 0.713420f,
 0.194413f, 0.593584f,
 0.213615f, 0.713385f,
 0.213615f, 0.713385f,
 0.194413f, 0.593584f,
 0.235118f, 0.593559f,
 0.235118f, 0.593559f,
 0.276453f, 0.593558f,
 0.213615f, 0.713385f,
 0.213615f, 0.713385f,
 0.276453f, 0.593558f,
 0.310668f, 0.713380f,
 0.194413f, 0.593584f,
 0.203156f, 0.503563f,
 0.235118f, 0.593559f,
 0.235118f, 0.593559f,
 0.203156f, 0.503563f,
 0.243427f, 0.503536f,
 0.243427f, 0.503536f,
 0.282801f, 0.532520f,
 0.235118f, 0.593559f,
 0.235118f, 0.593559f,
 0.282801f, 0.532520f,
 0.276453f, 0.593558f,
 0.866074f, 0.988875f,
 0.862196f, 0.955301f,
 0.914161f, 0.988875f,
 0.914161f, 0.988875f,
 0.862196f, 0.955301f,
 0.918038f, 0.955301f,
 0.292918f, 0.942560f,
 0.321245f, 0.970722f,
 0.254307f, 0.942159f,
 0.254307f, 0.942159f,
 0.321245f, 0.970722f,
 0.212156f, 0.971357f,
 0.914163f, 0.817885f,
 0.918038f, 0.926974f,
 0.866076f, 0.817884f,
 0.243427f, 0.503536f,
 0.344702f, 0.504178f,
 0.282801f, 0.532520f,
 0.282801f, 0.532520f,
 0.344702f, 0.504178f,
 0.316375f, 0.532340f,};

static float[][] NormArray = new float[][]{
{ -0.468248f, -0.769391f, 0.434490f},
{ -0.468247f, -0.769391f, 0.434491f},
{ -0.468248f, -0.769391f, 0.434490f},
{ -0.468247f, -0.769391f, 0.434491f},
{ -0.468248f, -0.769391f, 0.434490f},
{ -0.468248f, -0.769391f, 0.434491f},
{ -0.468248f, -0.769391f, 0.434490f},
{ -0.468247f, -0.769391f, 0.434491f},
{ -0.468248f, -0.769391f, 0.434490f},
{ -0.468247f, -0.769391f, 0.434491f},
{ -0.468247f, -0.769391f, 0.434491f},
{ -0.468247f, -0.769391f, 0.434491f},
{ -0.468247f, -0.769391f, 0.434490f},
{ -0.468247f, -0.769391f, 0.434491f},
{ -0.468247f, -0.769391f, 0.434491f},
{ -0.468247f, -0.769391f, 0.434491f},
{ 0.195793f, 0.918950f, 0.342339f},
{ 0.180363f, 0.928388f, 0.324907f},
{ -0.009553f, 0.994478f, 0.104511f},
{ -0.030554f, 0.996366f, 0.079508f},
{ 0.351631f, 0.129950f, 0.927076f},
{ 0.268782f, 0.250550f, 0.930044f},
{ 0.320417f, 0.149158f, 0.935460f},
{ 0.144676f, 0.312539f, 0.938823f},
{ 0.180340f, -0.335795f, -0.924510f},
{ 0.329908f, -0.332724f, -0.883434f},
{ 0.230682f, -0.460154f, -0.857347f},
{ 0.250877f, -0.469646f, -0.846459f},
{ 0.997818f, 0.059218f, 0.029200f},
{ 0.997305f, 0.072951f, 0.007830f},
{ 0.997402f, 0.071281f, 0.010432f},
{ 0.996675f, 0.081312f, -0.005220f},
{ -0.496110f, -0.047047f, 0.866984f},
{ -0.402582f, -0.370739f, 0.836947f},
{ -0.315698f, -0.743042f, 0.590105f},
{ -0.311810f, -0.764872f, 0.563689f},
{ 0.803002f, -0.577480f, -0.147328f},
{ 0.818879f, -0.557339f, -0.137147f},
{ 0.825063f, -0.549155f, -0.133041f},
{ 0.868916f, -0.484508f, -0.101179f},
{ 0.572806f, -0.543706f, 0.613414f},
{ 0.577977f, -0.580305f, 0.573750f},
{ 0.579603f, -0.594791f, 0.557031f},
{ 0.580311f, -0.601939f, 0.548552f},
{ -0.724232f, -0.134828f, 0.676247f},
{ -0.800904f, -0.154735f, 0.578455f},
{ -0.727069f, -0.135550f, 0.673051f},
{ -0.910980f, -0.185635f, 0.368314f},
{ 0.445199f, 0.671780f, 0.592038f},
{ 0.383521f, 0.697545f, 0.605263f},
{ 0.394003f, 0.693445f, 0.603238f},
{ 0.338153f, 0.714042f, 0.613023f},
{ 0.820602f, 0.408744f, -0.399427f},
{ 0.818858f, 0.408447f, -0.403289f},
{ 0.771456f, 0.398864f, -0.495745f},
{ 0.670277f, 0.372209f, -0.642019f},
{ 0.957934f, -0.211075f, -0.194448f},
{ 0.914065f, -0.233256f, -0.331778f},
{ 0.311089f, 0.459032f, 0.832174f},
{ -0.024343f, 0.267651f, 0.963208f},
{ -0.257869f, 0.106617f, 0.960279f},
{ -0.327719f, 0.053681f, 0.943249f},
{ 0.227540f, 0.670497f, -0.706158f},
{ 0.669751f, 0.383600f, -0.635834f},
{ 0.756693f, 0.288338f, -0.586751f},
{ 0.798261f, 0.233768f, -0.555096f},
{ 0.963440f, 0.267729f, -0.010199f},
{ 0.966317f, 0.256534f, -0.020541f},
{ 0.965775f, 0.258721f, -0.018526f},
{ 0.967002f, 0.253716f, -0.023135f},
{ 0.955327f, -0.273386f, 0.112298f},
{ 0.923102f, -0.017338f, 0.384164f},
{ 0.939158f, -0.065732f, 0.337136f},
{ 0.513644f, 0.451980f, 0.729304f},
{ 0.853062f, 0.407475f, -0.325959f},
{ 0.701574f, 0.142005f, -0.698304f},
{ 0.702429f, 0.143040f, -0.697232f},
{ 0.593716f, 0.024407f, -0.804304f},
{ 0.607443f, 0.089047f, -0.789356f},
{ 0.569824f, 0.155991f, -0.806825f},
{ 0.573713f, 0.019403f, -0.818826f},
{ 0.584862f, -0.033247f, -0.810451f},
{ -0.420571f, 0.633734f, -0.649232f},
{ -0.342764f, 0.835213f, -0.430037f},
{ -0.415088f, 0.654751f, -0.631667f},
{ -0.332529f, 0.852085f, -0.404198f},
{ -0.283861f, 0.356310f, 0.890206f},
{ -0.363213f, 0.372099f, 0.854177f},
{ -0.369264f, 0.158752f, 0.915665f},
{ -0.399483f, 0.141159f, 0.905807f},
{ -0.020530f, -0.449918f, -0.892834f},
{ -0.232699f, -0.481123f, -0.845205f},
{ -0.173077f, -0.441981f, -0.880169f},
{ -0.269751f, -0.497577f, -0.824409f},
{ -0.995363f, 0.080961f, -0.051937f},
{ -0.995572f, 0.079651f, -0.049925f},
{ -0.995598f, 0.079487f, -0.049672f},
{ -0.995755f, 0.078469f, -0.048108f},
{ -0.662864f, 0.323716f, 0.675144f},
{ -0.545809f, -0.683138f, 0.485196f},
{ -0.712920f, -0.417232f, 0.563616f},
{ -0.609763f, -0.662305f, 0.435364f},
{ 0.632316f, -0.606335f, -0.482218f},
{ 0.657673f, -0.640346f, -0.396767f},
{ 0.655040f, -0.636701f, -0.406859f},
{ 0.663898f, -0.649105f, -0.371353f},
{ -0.023669f, -0.998935f, -0.039612f},
{ -0.029999f, -0.986168f, -0.163009f},
{ -0.037650f, -0.945940f, -0.322147f},
{ -0.043713f, -0.887355f, -0.459011f},
{ -0.705992f, -0.086219f, 0.702953f},
{ -0.827303f, -0.167623f, 0.536164f},
{ -0.876672f, -0.208830f, 0.433401f},
{ -0.878358f, -0.210395f, 0.429209f},
{ -0.539482f, 0.278167f, -0.794721f},
{ -0.507425f, 0.255811f, -0.822849f},
{ -0.499209f, 0.250117f, -0.829598f},
{ -0.460097f, 0.223194f, -0.859358f},
{ 0.617810f, 0.309148f, -0.723007f},
{ 0.680006f, 0.354426f, -0.641852f},
{ 0.620788f, 0.311279f, -0.719533f},
{ 0.756631f, 0.413459f, -0.506519f},
{ 0.668567f, -0.458700f, -0.585330f},
{ 0.579614f, -0.474884f, -0.662219f},
{ -0.652794f, -0.050061f, 0.755880f},
{ -0.626170f, -0.038073f, 0.778756f},
{ -0.536175f, 0.000231f, 0.844107f},
{ -0.398995f, 0.053372f, 0.915399f},
{ -0.033741f, 0.682198f, -0.730389f},
{ -0.053612f, 0.690995f, -0.720868f},
{ -0.095778f, 0.708414f, -0.699268f},
{ -0.141381f, 0.725316f, -0.673742f},
{ -0.960714f, 0.274331f, 0.042091f},
{ -0.962741f, 0.269814f, 0.018194f},
{ -0.964362f, 0.264422f, -0.009292f},
{ -0.965322f, 0.252906f, -0.064739f},
{ -0.982249f, -0.183355f, 0.039608f},
{ -0.899407f, -0.033304f, -0.435842f},
{ -0.900224f, -0.033944f, -0.434102f},
{ -0.691359f, 0.083482f, -0.717672f},
{ 0.680490f, -0.210283f, -0.701936f},
{ -0.628228f, 0.698943f, -0.341773f},
{ 0.647720f, -0.161135f, -0.744644f},
{ -0.670838f, 0.693807f, -0.261931f},
{ 0.056779f, 0.115761f, -0.991653f},
{ 0.015746f, -0.000500f, -0.999876f},
{ 0.026126f, 0.079047f, -0.996529f},
{ 0.029746f, -0.012144f, -0.999484f},
{ 0.580041f, -0.066846f, -0.811840f},
{ 0.596712f, -0.094523f, -0.796869f},
{ 0.035875f, -0.023068f, -0.999090f},
{ 0.065116f, 0.005492f, -0.997863f},
{ 0.223548f, 0.106909f, 0.968812f},
{ 0.223548f, 0.106909f, 0.968812f},
{ 0.223548f, 0.106909f, 0.968812f},
{ 0.223548f, 0.106908f, 0.968812f},
{ -0.848643f, -0.494861f, 0.186861f},
{ -0.737322f, -0.670802f, -0.079888f},
{ -0.849280f, -0.493731f, 0.186958f},
{ -0.851148f, -0.519670f, 0.074096f},
{ 0.970872f, -0.173329f, -0.165422f},
{ 0.835250f, -0.539830f, -0.104597f},
{ 0.968820f, -0.188352f, -0.160973f},
{ 0.769745f, -0.629368f, -0.106721f},
{ 0.910666f, 0.386433f, -0.146140f},
{ 0.910383f, 0.387195f, -0.145887f},
{ 0.763880f, 0.645060f, -0.019646f},
{ 0.835882f, 0.546524f, -0.051121f},
{ -0.958802f, 0.158156f, 0.235978f},
{ -0.956311f, 0.184770f, 0.226558f},
{ -0.886903f, 0.459829f, 0.044286f},
{ -0.837513f, 0.543408f, -0.057266f},
{ -0.599140f, -0.788814f, -0.137122f},
{ -0.595228f, -0.791950f, -0.136085f},
{ 0.736376f, -0.637862f, -0.225573f},
{ 0.736376f, -0.637862f, -0.225573f},
{ 0.592887f, 0.804941f, -0.023562f},
{ 0.584545f, 0.810936f, -0.026269f},
{ -0.866079f, 0.486104f, -0.116661f},
{ -0.867980f, 0.482887f, -0.115890f},
{ -0.579350f, -0.812296f, 0.067306f},
{ -0.579350f, -0.812295f, 0.067306f},
{ -0.579350f, -0.812295f, 0.067306f},
{ -0.579350f, -0.812295f, 0.067306f},
{ 0.767385f, -0.630457f, -0.116809f},
{ 0.767385f, -0.630457f, -0.116808f},
{ 0.767385f, -0.630457f, -0.116809f},
{ 0.767385f, -0.630457f, -0.116808f},
{ 0.579349f, 0.812296f, -0.067309f},
{ 0.579349f, 0.812296f, -0.067310f},
{ 0.579349f, 0.812296f, -0.067310f},
{ 0.579349f, 0.812296f, -0.067311f},
{ -0.840959f, 0.526382f, 0.125339f},
{ -0.840959f, 0.526382f, 0.125339f},
{ -0.840959f, 0.526382f, 0.125340f},
{ -0.840959f, 0.526381f, 0.125341f},
{ -0.141915f, 0.255978f, 0.956209f},
{ -0.141916f, 0.255979f, 0.956209f},
{ -0.141916f, 0.255979f, 0.956209f},
{ -0.141917f, 0.255979f, 0.956208f},
{ 0.027020f, -0.995403f, 0.091884f},
{ 0.086324f, -0.995359f, 0.042531f},
{ 0.268514f, -0.888382f, 0.372394f},
{ 0.271122f, -0.886678f, 0.374559f},
{ -0.895810f, -0.297194f, -0.330454f},
{ -0.880656f, -0.294980f, -0.370717f},
{ -0.851694f, -0.276251f, -0.445312f},
{ -0.851807f, -0.274925f, -0.445917f},
{ -0.536846f, 0.770840f, -0.342931f},
{ -0.146858f, 0.980941f, -0.127232f},
{ -0.530811f, 0.777693f, -0.336799f},
{ 0.053898f, 0.995198f, 0.081709f},
{ 0.789621f, 0.234275f, 0.567110f},
{ 0.901053f, 0.216341f, 0.375899f},
{ 0.789646f, 0.237883f, 0.565572f},
{ 0.964875f, 0.170307f, 0.200029f},
{ 0.172507f, -0.982431f, -0.071214f},
{ 0.189703f, -0.978945f, -0.075359f},
{ -0.943422f, -0.267357f, -0.196152f},
{ -0.943422f, -0.267357f, -0.196152f},
{ -0.173984f, 0.980837f, -0.087682f},
{ -0.158402f, 0.983060f, -0.092210f},
{ 0.996512f, 0.078483f, -0.028353f},
{ 0.996502f, 0.078596f, -0.028392f},
{ 0.169260f, -0.977141f, 0.128632f},
{ 0.169260f, -0.977141f, 0.128633f},
{ 0.169260f, -0.977141f, 0.128633f},
{ 0.169260f, -0.977141f, 0.128633f},
{ -0.966677f, -0.240178f, -0.088605f},
{ -0.966677f, -0.240178f, -0.088605f},
{ -0.966677f, -0.240178f, -0.088605f},
{ -0.966677f, -0.240178f, -0.088605f},
{ -0.169259f, 0.977141f, -0.128639f},
{ -0.169259f, 0.977141f, -0.128638f},
{ -0.169259f, 0.977141f, -0.128638f},
{ -0.169259f, 0.977141f, -0.128637f},
{ 0.987772f, 0.115262f, 0.104983f},
{ 0.987772f, 0.115261f, 0.104984f},
{ 0.987772f, 0.115261f, 0.104983f},
{ 0.987772f, 0.115261f, 0.104984f},
{ -0.000001f, 0.709165f, 0.705043f},
{ -0.000001f, 0.709165f, 0.705043f},
{ -0.000001f, 0.709165f, 0.705043f},
{ -0.000001f, 0.709165f, 0.705043f},
{ 0.354739f, 0.062594f, 0.932868f},
{ 0.091999f, 0.127399f, 0.987576f},
{ 0.305643f, 0.075605f, 0.949140f},
{ -0.020172f, 0.151681f, 0.988224f},
{ -0.986325f, -0.162786f, -0.025764f},
{ -0.986046f, -0.165775f, -0.015203f},
{ -0.986272f, -0.163465f, -0.023373f},
{ -0.985163f, -0.171539f, 0.005377f},
{ 0.254091f, -0.450329f, -0.855945f},
{ 0.225953f, -0.447567f, -0.865234f},
{ 0.084035f, -0.428086f, -0.899823f},
{ 0.021561f, -0.416680f, -0.908798f},
{ 0.996427f, 0.080600f, 0.025246f},
{ 0.996451f, 0.080863f, 0.023371f},
{ 0.996513f, 0.081909f, 0.015893f},
{ 0.996517f, 0.083012f, 0.007978f},
{ -0.021049f, 0.283184f, 0.958835f},
{ -0.004707f, 0.277502f, 0.960714f},
{ -0.011553f, 0.279893f, 0.959962f},
{ -0.000000f, 0.275850f, 0.961201f},
{ -0.988072f, -0.153968f, 0.002713f},
{ -0.991630f, -0.123973f, 0.036063f},
{ -0.992677f, -0.108473f, 0.053160f},
{ -0.993005f, -0.100620f, 0.061788f},
{ 0.019392f, -0.063264f, -0.997808f},
{ 0.012147f, -0.061221f, -0.998050f},
{ 0.003323f, -0.058727f, -0.998269f},
{ 0.000000f, -0.057787f, -0.998329f},
{ 0.936980f, 0.347867f, -0.032499f},
{ 0.955327f, 0.262743f, -0.135339f},
{ 0.950579f, 0.294723f, -0.097662f},
{ 0.956704f, 0.248031f, -0.152309f},
{ -0.000001f, 0.999986f, 0.005360f},
{ -0.000001f, 0.999986f, 0.005360f},
{ -0.000001f, 0.999986f, 0.005360f},
{ -0.000001f, 0.999986f, 0.005360f},
{ -0.997657f, 0.058303f, -0.035802f},
{ -0.998382f, 0.023725f, -0.051679f},
{ -0.998008f, 0.048537f, -0.040295f},
{ -0.986706f, -0.115248f, -0.114579f},
{ 0.000001f, -0.999983f, 0.005818f},
{ 0.000001f, -0.999983f, 0.005818f},
{ 0.000001f, -0.999983f, 0.005818f},
{ 0.000001f, -0.999983f, 0.005818f},
{ 0.997657f, 0.058303f, -0.035802f},
{ 0.998008f, 0.048537f, -0.040296f},
{ 0.998382f, 0.023725f, -0.051680f},
{ 0.986706f, -0.115250f, -0.114579f},
{ -0.000000f, 0.709160f, 0.705048f},
{ -0.000000f, 0.709160f, 0.705048f},
{ -0.000000f, 0.709160f, 0.705048f},
{ -0.000000f, 0.709160f, 0.705048f},
{ -0.045299f, -0.456771f, 0.888430f},
{ -0.114500f, -0.465924f, 0.877385f},
{ -0.300351f, -0.478989f, 0.824839f},
{ -0.327106f, -0.479402f, 0.814356f},
{ 0.982597f, -0.174677f, 0.063178f},
{ 0.983199f, -0.178110f, 0.039959f},
{ 0.982740f, -0.175278f, 0.059162f},
{ 0.982884f, -0.184199f, -0.003036f},
{ -0.255127f, 0.204239f, -0.945091f},
{ -0.040113f, 0.258910f, -0.965068f},
{ -0.208410f, 0.217276f, -0.953602f},
{ 0.045955f, 0.277094f, -0.959743f},
{ -0.995260f, 0.094785f, -0.021754f},
{ -0.994903f, 0.094504f, -0.035178f},
{ -0.994287f, 0.094167f, -0.050262f},
{ -0.994152f, 0.094104f, -0.052965f},
{ -0.000001f, -0.245540f, 0.969386f},
{ -0.012278f, -0.251123f, 0.967877f},
{ -0.022526f, -0.255747f, 0.966481f},
{ -0.045940f, -0.266196f, 0.962824f},
{ 0.988381f, -0.151882f, 0.005972f},
{ 0.988675f, -0.133147f, 0.069240f},
{ 0.989074f, -0.140677f, 0.044083f},
{ 0.988303f, -0.129954f, 0.079801f},
{ 0.045968f, 0.298746f, -0.953225f},
{ 0.007232f, 0.289614f, -0.957116f},
{ 0.030011f, 0.295040f, -0.955013f},
{ 0.000001f, 0.287858f, -0.957673f},
{ -0.935827f, 0.300353f, -0.184437f},
{ -0.937994f, 0.311453f, -0.152199f},
{ -0.938485f, 0.338720f, -0.067186f},
{ -0.925904f, 0.373438f, 0.056969f},
{ 0.000001f, 0.999986f, 0.005367f},
{ 0.000001f, 0.999986f, 0.005367f},
{ 0.000001f, 0.999986f, 0.005367f},
{ 0.000001f, 0.999986f, 0.005367f},
{ 0.986707f, -0.115247f, -0.114578f},
{ 0.998382f, 0.023726f, -0.051678f},
{ 0.998008f, 0.048538f, -0.040294f},
{ 0.997657f, 0.058303f, -0.035801f},
{ -0.000000f, -0.999983f, 0.005811f},
{ -0.000001f, -0.999983f, 0.005811f},
{ -0.000000f, -0.999983f, 0.005811f},
{ -0.000001f, -0.999983f, 0.005811f},
{ -0.997657f, 0.058303f, -0.035803f},
{ -0.998382f, 0.023726f, -0.051681f},
{ -0.998008f, 0.048538f, -0.040297f},
{ -0.986706f, -0.115249f, -0.114581f}};

static int[] FaceArray = new int[]{
13, 4, 12,
12, 4, 5,
7, 5, 6,
6, 5, 4,
15, 2, 14,
14, 2, 0,
0, 2, 8,
8, 2, 9,
1, 10, 3,
3, 10, 11,
2, 3, 9,
9, 3, 11,
13, 12, 3,
3, 12, 1,
15, 14, 6,
6, 14, 7,
28, 29, 31,
31, 29, 30,
20, 35, 21,
21, 35, 32,
33, 34, 22,
22, 34, 23,
20, 23, 35,
35, 23, 34,
25, 24, 16,
16, 24, 17,
19, 27, 18,
18, 27, 26,
125, 126, 127,
128, 129, 130,
17, 131, 16,
16, 132, 133,
134, 30, 135,
136, 30, 29,
19, 18, 137,
138, 18, 139,
140, 34, 141,
142, 34, 33,
35, 143, 32,
32, 144, 145,
146, 147, 36,
36, 148, 37,
149, 150, 38,
38, 151, 39,
152, 36, 153,
154, 36, 155,
34, 156, 35,
35, 157, 158,
159, 41, 160,
161, 41, 40,
40, 41, 59,
59, 41, 58,
28, 31, 44,
44, 31, 45,
32, 47, 21,
21, 47, 46,
33, 22, 48,
48, 22, 49,
46, 47, 162,
163, 47, 164,
25, 16, 50,
50, 16, 51,
26, 53, 18,
18, 53, 52,
165, 166, 167,
168, 169, 170,
171, 172, 16,
16, 173, 51,
44, 45, 174,
175, 45, 176,
52, 177, 18,
18, 178, 179,
180, 33, 181,
182, 33, 48,
32, 183, 47,
47, 184, 185,
54, 37, 186,
187, 37, 188,
38, 55, 189,
190, 55, 191,
55, 54, 192,
193, 54, 194,
47, 195, 196,
197, 198, 199,
200, 40, 201,
40, 56, 202,
40, 59, 56,
56, 59, 60,
59, 58, 42,
42, 58, 43,
59, 42, 60,
60, 42, 57,
69, 71, 70,
70, 71, 72,
74, 61, 73,
73, 61, 62,
75, 63, 203,
204, 63, 205,
75, 76, 63,
63, 76, 64,
76, 73, 64,
64, 73, 62,
62, 61, 66,
66, 61, 65,
63, 67, 206,
207, 67, 208,
64, 68, 63,
63, 68, 67,
64, 62, 68,
68, 62, 66,
66, 65, 70,
70, 65, 69,
67, 209, 210,
211, 212, 213,
67, 68, 214,
215, 68, 216,
68, 66, 217,
218, 66, 70,
88, 87, 86,
86, 87, 85,
78, 77, 89,
89, 77, 90,
219, 79, 220,
221, 79, 91,
91, 79, 92,
92, 79, 80,
92, 80, 89,
89, 80, 78,
78, 82, 77,
77, 82, 81,
222, 83, 223,
224, 83, 79,
83, 84, 79,
79, 84, 80,
80, 84, 78,
78, 84, 82,
82, 86, 81,
81, 86, 85,
225, 226, 227,
228, 229, 83,
83, 230, 84,
84, 231, 232,
84, 233, 82,
82, 234, 86,
93, 94, 96,
96, 94, 95,
106, 97, 105,
105, 97, 98,
107, 99, 106,
106, 99, 97,
235, 108, 236,
237, 108, 100,
108, 238, 100,
100, 239, 240,
97, 101, 98,
98, 101, 102,
97, 99, 101,
101, 99, 103,
241, 100, 242,
243, 100, 244,
245, 246, 100,
100, 247, 248,
249, 250, 93,
95, 104, 96,
109, 112, 110,
110, 112, 111,
114, 113, 121,
121, 113, 122,
122, 113, 123,
123, 113, 115,
118, 117, 114,
114, 117, 113,
113, 117, 115,
115, 117, 119,
120, 111, 112,};

static int[] FaceArrayB = new int[]{
0, 1, 2,
3, 4, 5,
6, 7, 8,
9, 10, 11,
12, 13, 14,
15, 16, 17,
18, 19, 20,
21, 22, 23,
24, 25, 26,
27, 28, 29,
30, 31, 32,
33, 34, 35,
36, 37, 38,
39, 40, 41,
42, 43, 44,
45, 46, 47,
48, 49, 50,
51, 52, 53,
54, 55, 56,
57, 58, 59,
60, 61, 62,};

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


//Vertices: 314  Texture Co-ords: 199  Normals: 344  Texture: LRRH Faces: 196 Smooth Groups: 91 sucess: 100 Doubles: 96 Redos needed: 126 Correct: 99