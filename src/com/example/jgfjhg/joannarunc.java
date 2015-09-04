package com.example.jgfjhg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;
import android.graphics.Bitmap;
import android.opengl.GLUtils;

class joannarunc {

static String TextureName = "joannarun3.mtl";

static int Vertices = 249;

static int VertTexts = 156;

static int Normals = 96;

static int Faces = 170;

static int FacesB = 0;

static int SmoothGroups = 4;

static float VertArray[] = new float[]{
 0.309678f, 0.579757f, 1.741259f,
 0.890661f, 0.568929f, 1.672330f,
 0.986433f, 0.777671f, 2.251611f,
 0.404008f, 0.787319f, 2.335398f,
 0.317482f, -0.025400f, 1.777942f,
 0.896887f, -0.032288f, 1.692620f,
 1.248560f, 0.517489f, 3.714062f,
 0.668319f, 0.516673f, 3.812498f,
 0.037026f, 3.298263f, 0.805403f,
 0.799784f, 3.380213f, 0.835898f,
 0.910618f, 3.887177f, 1.536660f,
 0.160237f, 3.880807f, 1.622106f,
 0.484235f, 2.715964f, 2.366513f,
 0.994007f, 2.714765f, 2.308078f,
 0.907623f, 2.519262f, 1.743528f,
 0.389160f, 2.510626f, 1.740380f,
 0.773988f, 8.088290f, 1.875342f,
 0.384257f, 6.307260f, 1.781322f,
 -0.006736f, 7.308733f, 1.160638f,
 0.124928f, 8.015659f, 1.488290f,
 0.113320f, 7.784250f, 2.941724f,
 1.072680f, 6.901001f, 1.565327f,
 1.048051f, 7.316972f, 0.886638f,
 0.183709f, 5.513296f, 0.312306f,
 0.500753f, 5.378056f, 0.955832f,
 0.172619f, 5.046579f, 1.324379f,
 -0.456093f, 4.800339f, 0.952647f,
 0.132401f, 9.080840f, 3.030209f,
 0.767287f, 8.834332f, 2.679052f,
 0.767814f, 7.977662f, 2.623085f,
 0.540200f, 7.569562f, 2.179786f,
 1.692692f, 6.847363f, 1.770619f,
 0.143613f, 9.143803f, 1.605265f,
 0.773609f, 8.867154f, 1.919481f,
 0.512387f, 7.759039f, 1.667070f,
 1.825539f, 6.888388f, 1.374547f,
 1.583301f, 7.583280f, 1.879599f,
 1.670717f, 7.719089f, 1.433899f,
 1.733393f, 5.911170f, 1.438839f,
 2.103678f, 5.958511f, 1.543226f,
 2.237432f, 5.786088f, 1.263446f,
 1.899854f, 5.717391f, 1.132419f,
 -0.070828f, 7.356398f, 2.280298f,
 0.144893f, 7.636925f, 1.522418f,
 1.288662f, 5.693335f, 3.229532f,
 1.959119f, 5.853443f, 3.024467f,
 2.122642f, 5.392159f, 2.857770f,
 1.621841f, 5.018825f, 2.898934f,
 0.801042f, 2.723257f, -0.367292f,
 1.303120f, 3.799752f, 1.763666f,
 1.416719f, 3.093518f, 0.875779f,
 -0.339692f, 3.204559f, 1.159374f,
 -0.528801f, 7.524707f, 2.276007f,
 -0.144763f, 6.984981f, 2.574483f,
 -0.875480f, 7.382283f, 2.542479f,
 -0.431429f, 6.863221f, 2.856415f,
 -0.497149f, 8.833743f, 2.668247f,
 -0.491344f, 8.866338f, 1.909231f,
 -0.837894f, 5.042600f, 0.329090f,
 -0.459379f, 5.377659f, -0.003178f,
 -0.468290f, 6.577534f, 1.833504f,
 -0.957121f, 6.818720f, 1.798459f,
 -0.485471f, 7.617197f, 1.721963f,
 -0.399693f, 7.451057f, 2.185195f,
 -0.496430f, 7.977277f, 2.612466f,
 -0.490744f, 8.087542f, 1.865242f,
 1.972148f, 6.545242f, 2.313161f,
 2.033970f, 6.070029f, 2.981335f,
 1.709840f, 6.911334f, 2.875996f,
 1.791194f, 6.580998f, 3.268227f,
 0.290867f, 6.167895f, 3.019635f,
 0.153139f, 5.938741f, 3.356755f,
 0.234602f, 6.210917f, 3.592088f,
 0.363480f, 6.426407f, 3.304513f,
 -1.180591f, 3.688188f, 0.764104f,
 -0.861154f, 3.230748f, -0.751120f,
 -0.270224f, 1.838072f, -1.179427f,
 -0.827259f, 1.981388f, -1.322291f,
 -1.018949f, 1.554917f, -0.910271f,
 -0.456302f, 1.437813f, -0.782245f,
 -0.235675f, 1.376595f, -1.654375f,
 -0.815395f, 1.377747f, -1.769544f,
 -1.130219f, 0.315654f, 0.042916f,
 -0.550033f, 0.317168f, 0.143657f,
 0.004275f, 3.265532f, -0.248733f,
 -0.732044f, 3.475254f, -0.285330f,
 -0.848242f, 3.785234f, 0.523317f,
 -0.123361f, 3.620174f, 0.656910f,
 -0.714632f, 2.313010f, 0.979648f,
 -1.207244f, 2.413136f, 0.867415f,
 -1.077737f, 2.572116f, 0.456337f,
 -0.573191f, 2.490325f, 0.574862f,
 1.362268f, 11.560413f, 3.563425f,
 0.564266f, 11.175479f, 4.300778f,
 2.315772f, 4.480285f, 1.986018f,
 1.514893f, 4.227410f, 2.648210f,
 0.389160f, 2.510626f, 1.740380f,
 0.389160f, 2.510626f, 1.740380f,
 0.037026f, 3.298263f, 0.805403f,
 0.309678f, 0.579757f, 1.741259f,
 0.317482f, -0.025400f, 1.777942f,
 0.317482f, -0.025400f, 1.777942f,
 0.309678f, 0.579757f, 1.741259f,
 0.317482f, -0.025400f, 1.777942f,
 0.404008f, 0.787319f, 2.335398f,
 0.404008f, 0.787319f, 2.335398f,
 0.317482f, -0.025400f, 1.777942f,
 0.668319f, 0.516673f, 3.812498f,
 0.404008f, 0.787319f, 2.335398f,
 0.668319f, 0.516673f, 3.812498f,
 0.668319f, 0.516673f, 3.812498f,
 0.986433f, 0.777671f, 2.251611f,
 0.986433f, 0.777671f, 2.251611f,
 0.986433f, 0.777671f, 2.251611f,
 0.986433f, 0.777671f, 2.251611f,
 0.890661f, 0.568929f, 1.672330f,
 0.890661f, 0.568929f, 1.672330f,
 0.389160f, 2.510626f, 1.740380f,
 0.389160f, 2.510626f, 1.740380f,
 0.890661f, 0.568929f, 1.672330f,
 0.309678f, 0.579757f, 1.741259f,
 0.540200f, 7.569562f, 2.179786f,
 0.540200f, 7.569562f, 2.179786f,
 1.072680f, 6.901001f, 1.565327f,
 1.072680f, 6.901001f, 1.565327f,
 0.540200f, 7.569562f, 2.179786f,
 0.540200f, 7.569562f, 2.179786f,
 0.512387f, 7.759039f, 1.667070f,
 0.512387f, 7.759039f, 1.667070f,
 0.512387f, 7.759039f, 1.667070f,
 0.540200f, 7.569562f, 2.179786f,
 0.540200f, 7.569562f, 2.179786f,
 1.072680f, 6.901001f, 1.565327f,
 1.048051f, 7.316972f, 0.886638f,
 1.733393f, 5.911170f, 1.438839f,
 1.733393f, 5.911170f, 1.438839f,
 1.048051f, 7.316972f, 0.886638f,
 1.048051f, 7.316972f, 0.886638f,
 1.072680f, 6.901001f, 1.565327f,
 1.288662f, 5.693335f, 3.229532f,
 1.288662f, 5.693335f, 3.229532f,
 1.733393f, 5.911170f, 1.438839f,
 1.621841f, 5.018825f, 2.898934f,
 1.621841f, 5.018825f, 2.898934f,
 1.733393f, 5.911170f, 1.438839f,
 1.048051f, 7.316972f, 0.886638f,
 1.048051f, 7.316972f, 0.886638f,
 0.512387f, 7.759039f, 1.667070f,
 0.512387f, 7.759039f, 1.667070f,
 1.621841f, 5.018825f, 2.898934f,
 0.801042f, 2.723257f, -0.367292f,
 1.416719f, 3.093518f, 0.875779f,
 -0.339692f, 3.204559f, 1.159374f,
 -0.339692f, 3.204559f, 1.159374f,
 1.416719f, 3.093518f, 0.875779f,
 1.303120f, 3.799752f, 1.763666f,
 0.132401f, 9.080840f, 3.030209f,
 0.143613f, 9.143803f, 1.605265f,
 0.143613f, 9.143803f, 1.605265f,
 0.384257f, 6.307260f, 1.781322f,
 -0.399693f, 7.451057f, 2.185195f,
 0.384257f, 6.307260f, 1.781322f,
 -0.070828f, 7.356398f, 2.280298f,
 -0.399693f, 7.451057f, 2.185195f,
 -0.468290f, 6.577534f, 1.833504f,
 -0.468290f, 6.577534f, 1.833504f,
 -0.070828f, 7.356398f, 2.280298f,
 0.113320f, 7.784250f, 2.941724f,
 -0.399693f, 7.451057f, 2.185195f,
 0.113320f, 7.784250f, 2.941724f,
 -0.399693f, 7.451057f, 2.185195f,
 0.144893f, 7.636925f, 1.522418f,
 -0.485471f, 7.617197f, 1.721963f,
 0.124928f, 8.015659f, 1.488290f,
 -0.485471f, 7.617197f, 1.721963f,
 0.124928f, 8.015659f, 1.488290f,
 -0.485471f, 7.617197f, 1.721963f,
 -0.399693f, 7.451057f, 2.185195f,
 -0.399693f, 7.451057f, 2.185195f,
 -0.456093f, 4.800339f, 0.952647f,
 0.384257f, 6.307260f, 1.781322f,
 0.384257f, 6.307260f, 1.781322f,
 -0.468290f, 6.577534f, 1.833504f,
 0.290867f, 6.167895f, 3.019635f,
 -0.957121f, 6.818720f, 1.798459f,
 0.290867f, 6.167895f, 3.019635f,
 -0.957121f, 6.818720f, 1.798459f,
 -0.957121f, 6.818720f, 1.798459f,
 -0.468290f, 6.577534f, 1.833504f,
 1.972148f, 6.545242f, 2.313161f,
 1.972148f, 6.545242f, 2.313161f,
 2.033970f, 6.070029f, 2.981335f,
 0.290867f, 6.167895f, 3.019635f,
 2.033970f, 6.070029f, 2.981335f,
 0.290867f, 6.167895f, 3.019635f,
 -0.957121f, 6.818720f, 1.798459f,
 -0.957121f, 6.818720f, 1.798459f,
 -0.485471f, 7.617197f, 1.721963f,
 -0.006736f, 7.308733f, 1.160638f,
 -0.485471f, 7.617197f, 1.721963f,
 0.144893f, 7.636925f, 1.522418f,
 -0.006736f, 7.308733f, 1.160638f,
 2.033970f, 6.070029f, 2.981335f,
 0.124928f, 8.015659f, 1.488290f,
 0.143613f, 9.143803f, 1.605265f,
 0.124928f, 8.015659f, 1.488290f,
 0.132401f, 9.080840f, 3.030209f,
 0.113320f, 7.784250f, 2.941724f,
 0.113320f, 7.784250f, 2.941724f,
 0.183709f, 5.513296f, 0.312306f,
 -0.006736f, 7.308733f, 1.160638f,
 0.183709f, 5.513296f, 0.312306f,
 0.801042f, 2.723257f, -0.367292f,
 0.183709f, 5.513296f, 0.312306f,
 0.183709f, 5.513296f, 0.312306f,
 -0.339692f, 3.204559f, 1.159374f,
 -0.456093f, 4.800339f, 0.952647f,
 -0.456093f, 4.800339f, 0.952647f,
 0.801042f, 2.723257f, -0.367292f,
 -0.339692f, 3.204559f, 1.159374f,
 -0.861154f, 3.230748f, -0.751120f,
 -0.339692f, 3.204559f, 1.159374f,
 -1.180591f, 3.688188f, 0.764104f,
 -0.861154f, 3.230748f, -0.751120f,
 -0.573191f, 2.490325f, 0.574862f,
 0.004275f, 3.265532f, -0.248733f,
 -0.573191f, 2.490325f, 0.574862f,
 -0.270224f, 1.838072f, -1.179427f,
 -0.235675f, 1.376595f, -1.654375f,
 -0.235675f, 1.376595f, -1.654375f,
 -0.270224f, 1.838072f, -1.179427f,
 -0.456302f, 1.437813f, -0.782245f,
 -0.235675f, 1.376595f, -1.654375f,
 -0.456302f, 1.437813f, -0.782245f,
 -0.550033f, 0.317168f, 0.143657f,
 -0.235675f, 1.376595f, -1.654375f,
 -0.456302f, 1.437813f, -0.782245f,
 -0.550033f, 0.317168f, 0.143657f,
 -0.550033f, 0.317168f, 0.143657f,
 -1.018949f, 1.554917f, -0.910271f,
 -1.018949f, 1.554917f, -0.910271f,
 -1.018949f, 1.554917f, -0.910271f,
 -0.827259f, 1.981388f, -1.322291f,
 -1.018949f, 1.554917f, -0.910271f,
 -0.573191f, 2.490325f, 0.574862f,
 -0.827259f, 1.981388f, -1.322291f,
 -0.573191f, 2.490325f, 0.574862f,
 -0.270224f, 1.838072f, -1.179427f,
 -0.827259f, 1.981388f, -1.322291f,};

static float VertArrayB[] = new float[]{};

static float[] TextArray = new float[]{
 0.006939f, 0.326299f,
 0.090499f, 0.173168f,
 0.105659f, 0.212267f,
 0.055390f, 0.326300f,
 0.015021f, 0.168109f,
 0.054525f, 0.165271f,
 0.064749f, 0.307849f,
 0.025236f, 0.310573f,
 0.006936f, 0.973168f,
 0.148951f, 0.973168f,
 0.102753f, 0.881533f,
 0.055389f, 0.881533f,
 0.055390f, 0.579866f,
 0.102750f, 0.579866f,
 0.148951f, 0.621715f,
 0.006938f, 0.621714f,
 0.453876f, 0.791903f,
 0.201824f, 0.532079f,
 0.590263f, 0.596995f,
 0.556897f, 0.779659f,
 0.235400f, 0.777966f,
 0.367224f, 0.573251f,
 0.453040f, 0.577674f,
 0.566387f, 0.397259f,
 0.470805f, 0.365178f,
 0.365778f, 0.346308f,
 0.249833f, 0.335338f,
 0.289739f, 0.984705f,
 0.362886f, 0.905310f,
 0.354538f, 0.788048f,
 0.662213f, 0.973243f,
 0.649436f, 0.842323f,
 0.523433f, 0.983917f,
 0.451956f, 0.900429f,
 0.700374f, 0.973112f,
 0.714202f, 0.842324f,
 0.662213f, 0.871337f,
 0.700374f, 0.871169f,
 0.611238f, 0.659338f,
 0.649436f, 0.659338f,
 0.714202f, 0.659338f,
 0.749335f, 0.659338f,
 0.262276f, 0.714547f,
 0.539459f, 0.732725f,
 0.635368f, 0.320085f,
 0.647458f, 0.410463f,
 0.714202f, 0.410460f,
 0.727698f, 0.329948f,
 0.754615f, 0.048462f,
 0.320425f, 0.069876f,
 0.504948f, 0.016928f,
 0.147427f, 0.097935f,
 0.662213f, 0.871337f,
 0.649436f, 0.842323f,
 0.700374f, 0.871169f,
 0.714202f, 0.842324f,
 0.362886f, 0.905310f,
 0.451956f, 0.900429f,
 0.365778f, 0.346308f,
 0.470805f, 0.365178f,
 0.367224f, 0.573251f,
 0.453040f, 0.577674f,
 0.700374f, 0.973112f,
 0.662213f, 0.973243f,
 0.354538f, 0.788048f,
 0.453876f, 0.791903f,
 0.635368f, 0.320085f,
 0.727698f, 0.329948f,
 0.647458f, 0.410463f,
 0.714202f, 0.410460f,
 0.611238f, 0.659338f,
 0.749335f, 0.659338f,
 0.714202f, 0.659338f,
 0.649436f, 0.659338f,
 0.320425f, 0.069876f,
 0.504948f, 0.016928f,
 0.006939f, 0.326299f,
 0.090499f, 0.173168f,
 0.105659f, 0.212267f,
 0.055390f, 0.326300f,
 0.015021f, 0.168109f,
 0.054525f, 0.165271f,
 0.064749f, 0.307849f,
 0.025236f, 0.310573f,
 0.006936f, 0.973168f,
 0.148951f, 0.973168f,
 0.102753f, 0.881533f,
 0.055389f, 0.881533f,
 0.055390f, 0.579866f,
 0.102750f, 0.579866f,
 0.148951f, 0.621715f,
 0.006938f, 0.621714f,
 0.829311f, 0.001810f,
 0.999173f, 0.001810f,
 0.829311f, 0.998093f,
 0.999173f, 0.998093f,
 0.196341f, 0.621715f,
 0.196341f, 0.621715f,
 0.196341f, 0.973168f,
 0.099486f, 0.134595f,
 0.063514f, 0.126699f,
 0.063514f, 0.126699f,
 0.099486f, 0.134595f,
 0.063514f, 0.126699f,
 0.129579f, 0.105546f,
 0.129579f, 0.105546f,
 0.063514f, 0.126699f,
 0.132466f, 0.001616f,
 0.142109f, 0.227760f,
 0.101198f, 0.323344f,
 0.101198f, 0.323344f,
 0.102748f, 0.326300f,
 0.102748f, 0.326300f,
 0.102748f, 0.326300f,
 0.102748f, 0.326300f,
 0.148951f, 0.326300f,
 0.148951f, 0.326300f,
 0.196341f, 0.621715f,
 0.196341f, 0.621715f,
 0.148951f, 0.326300f,
 0.196341f, 0.326300f,
 0.353637f, 0.718421f,
 0.353637f, 0.718421f,
 0.611238f, 0.872595f,
 0.611238f, 0.872595f,
 0.353637f, 0.718421f,
 0.353637f, 0.718421f,
 0.452577f, 0.721572f,
 0.452577f, 0.721572f,
 0.452577f, 0.721572f,
 0.353637f, 0.718421f,
 0.353637f, 0.718421f,
 0.806916f, 0.873085f,
 0.749335f, 0.873085f,
 0.806916f, 0.659338f,
 0.806916f, 0.659338f,
 0.749335f, 0.873085f,
 0.749335f, 0.873085f,
 0.611238f, 0.872595f,
 0.611238f, 0.410462f,
 0.806916f, 0.410462f,
 0.806916f, 0.659338f,
 0.749335f, 0.410462f,
 0.749335f, 0.410462f,
 0.806916f, 0.659338f,
 0.749335f, 0.873085f,
 0.749335f, 0.873085f,
 0.452577f, 0.721572f,
 0.452577f, 0.721572f,
 0.749335f, 0.410462f,
 0.747690f, 0.223911f,
 0.756142f, 0.248493f,
 0.724061f, 0.244264f,
 0.724061f, 0.244264f,
 0.756142f, 0.248493f,
 0.737676f, 0.256798f,
 0.289739f, 0.984705f,
 0.523433f, 0.983917f,
 0.523433f, 0.983917f,
 0.201824f, 0.532079f,
 0.353637f, 0.718421f,
 0.201824f, 0.532079f,
 0.262276f, 0.714547f,
 0.353637f, 0.718421f,
 0.611238f, 0.872595f,
 0.611238f, 0.872595f,
 0.262276f, 0.714547f,
 0.235400f, 0.777966f,
 0.353637f, 0.718421f,
 0.235400f, 0.777966f,
 0.353637f, 0.718421f,
 0.539459f, 0.732725f,
 0.452577f, 0.721572f,
 0.556897f, 0.779659f,
 0.452577f, 0.721572f,
 0.556897f, 0.779659f,
 0.452577f, 0.721572f,
 0.353637f, 0.718421f,
 0.353637f, 0.718421f,
 0.249833f, 0.335338f,
 0.201824f, 0.532079f,
 0.201824f, 0.532079f,
 0.806916f, 0.873085f,
 0.806916f, 0.659338f,
 0.749335f, 0.873085f,
 0.806916f, 0.659338f,
 0.749335f, 0.873085f,
 0.749335f, 0.873085f,
 0.611238f, 0.872595f,
 0.611238f, 0.410462f,
 0.806916f, 0.410462f,
 0.749335f, 0.410462f,
 0.806916f, 0.659338f,
 0.749335f, 0.410462f,
 0.806916f, 0.659338f,
 0.749335f, 0.873085f,
 0.749335f, 0.873085f,
 0.452577f, 0.721572f,
 0.590263f, 0.596995f,
 0.452577f, 0.721572f,
 0.539459f, 0.732725f,
 0.590263f, 0.596995f,
 0.749335f, 0.410462f,
 0.556897f, 0.779659f,
 0.523433f, 0.983917f,
 0.556897f, 0.779659f,
 0.289739f, 0.984705f,
 0.235400f, 0.777966f,
 0.235400f, 0.777966f,
 0.566387f, 0.397259f,
 0.590263f, 0.596995f,
 0.566387f, 0.397259f,
 0.754615f, 0.048462f,
 0.566387f, 0.397259f,
 0.566387f, 0.397259f,
 0.147427f, 0.097935f,
 0.249833f, 0.335338f,
 0.249833f, 0.335338f,
 0.747690f, 0.223911f,
 0.724061f, 0.244264f,
 0.756142f, 0.248493f,
 0.724061f, 0.244264f,
 0.737676f, 0.256798f,
 0.756142f, 0.248493f,
 0.196341f, 0.621715f,
 0.196341f, 0.973168f,
 0.196341f, 0.621715f,
 0.099486f, 0.134595f,
 0.063514f, 0.126699f,
 0.063514f, 0.126699f,
 0.099486f, 0.134595f,
 0.129579f, 0.105546f,
 0.063514f, 0.126699f,
 0.129579f, 0.105546f,
 0.132466f, 0.001616f,
 0.063514f, 0.126699f,
 0.142109f, 0.227760f,
 0.101198f, 0.323344f,
 0.101198f, 0.323344f,
 0.102748f, 0.326300f,
 0.102748f, 0.326300f,
 0.102748f, 0.326300f,
 0.148951f, 0.326300f,
 0.102748f, 0.326300f,
 0.196341f, 0.621715f,
 0.148951f, 0.326300f,
 0.196341f, 0.621715f,
 0.196341f, 0.326300f,
 0.148951f, 0.326300f,};

static float[] TextArrayB = new float[]{};

static float[][] NormArray = new float[][]{
{ -0.538005f, -0.840596f, 0.062833f},
{ 0.503576f, -0.857413f, -0.106089f},
{ -0.422311f, -0.478548f, 0.769835f},
{ 0.652257f, -0.480696f, 0.586082f},
{ -0.667389f, 0.247215f, 0.702479f},
{ -0.569849f, 0.157046f, 0.806603f},
{ 0.780466f, 0.381940f, 0.494969f},
{ 0.770512f, 0.160252f, 0.616953f},
{ -0.749852f, -0.617425f, -0.237715f},
{ -0.893790f, -0.243681f, -0.376509f},
{ 0.807275f, -0.139963f, -0.573339f},
{ 0.710870f, -0.480329f, -0.513760f},
{ -0.767942f, 0.009772f, -0.640445f},
{ 0.556044f, -0.003759f, -0.831144f},
{ 0.948441f, 0.249474f, 0.195505f},
{ -0.840807f, 0.236701f, 0.486844f},
{ 0.422592f, 0.266649f, 0.866207f},
{ 0.213277f, -0.123529f, 0.969151f},
{ 0.474633f, 0.770693f, -0.425154f},
{ 0.793670f, 0.242872f, -0.557764f},
{ -0.002260f, 0.666594f, 0.745418f},
{ 0.743482f, 0.469354f, 0.476383f},
{ 0.010125f, 0.715476f, -0.698564f},
{ 0.786702f, 0.415617f, -0.456467f},
{ -0.094103f, -0.040376f, 0.994743f},
{ 0.989954f, 0.073442f, -0.120823f},
{ 0.436458f, -0.705321f, 0.558594f},
{ 0.200760f, 0.343449f, -0.917463f},
{ 0.153692f, 0.866990f, -0.474032f},
{ 0.530002f, -0.374228f, 0.760955f},
{ 0.127058f, -0.481583f, 0.867141f},
{ 0.018787f, -0.605082f, 0.795941f},
{ 0.021021f, -0.391435f, 0.919966f},
{ 0.815193f, -0.283539f, 0.505041f},
{ -0.109301f, 0.466415f, -0.877787f},
{ -0.023317f, 0.076964f, -0.996761f},
{ 0.893335f, -0.089798f, -0.440329f},
{ -0.592852f, 0.116703f, 0.796810f},
{ -0.950097f, 0.259457f, 0.173200f},
{ -0.492704f, -0.860882f, -0.126982f},
{ 0.292673f, 0.867926f, 0.401308f},
{ 0.867094f, -0.489860f, 0.090476f},
{ -0.984262f, -0.175643f, 0.019435f},
{ -0.068366f, -0.611524f, -0.788267f},
{ 0.750475f, -0.447859f, -0.486015f},
{ 0.656030f, 0.646601f, 0.389271f},
{ -0.443708f, 0.416637f, -0.793434f},
{ 0.605173f, -0.010098f, 0.796030f},
{ 0.933685f, -0.343538f, -0.101064f},
{ 0.432162f, 0.388968f, -0.813596f},
{ 0.538830f, -0.345264f, -0.768411f},
{ -0.372236f, -0.644614f, 0.667767f},
{ 0.560067f, 0.809451f, 0.176392f},
{ -0.894977f, 0.203257f, 0.397118f},
{ 0.847720f, 0.484512f, -0.215914f},
{ -0.760507f, -0.046512f, 0.647662f},
{ -0.752415f, 0.475412f, 0.455911f},
{ -0.782048f, 0.421674f, -0.458903f},
{ -0.972533f, 0.222949f, 0.066876f},
{ -0.210955f, -0.772625f, 0.598789f},
{ -0.343493f, 0.546466f, -0.763798f},
{ -0.921820f, -0.046223f, -0.384851f},
{ -0.741121f, 0.376490f, -0.555874f},
{ -0.487994f, -0.455200f, 0.744752f},
{ -0.841407f, -0.209267f, 0.498239f},
{ -0.892861f, 0.030224f, -0.449317f},
{ 0.036050f, -0.223739f, -0.973982f},
{ -0.073791f, 0.972668f, -0.220165f},
{ 0.330625f, -0.943457f, -0.023999f},
{ 0.316029f, 0.118075f, 0.941373f},
{ 0.132691f, -0.525898f, -0.840134f},
{ -0.311384f, -0.913771f, 0.260887f},
{ -0.128867f, -0.134415f, 0.982510f},
{ 0.007234f, 0.981605f, 0.190784f},
{ -0.975613f, -0.106502f, 0.191928f},
{ -0.333859f, -0.169661f, -0.927229f},
{ 0.570369f, -0.576648f, -0.584942f},
{ 0.417932f, -0.883299f, 0.212403f},
{ -0.394768f, -0.546509f, -0.738571f},
{ -0.521300f, -0.849512f, 0.081096f},
{ 0.529818f, -0.054361f, 0.846367f},
{ -0.721769f, 0.347581f, 0.598529f},
{ 0.123066f, -0.502235f, 0.855929f},
{ -0.675186f, -0.366322f, 0.640259f},
{ 0.542255f, -0.767408f, -0.342118f},
{ 0.980008f, -0.122309f, -0.156923f},
{ -0.759304f, 0.410222f, -0.505148f},
{ -0.671714f, -0.349333f, -0.653274f},
{ 0.811892f, 0.561661f, -0.159276f},
{ -0.370280f, 0.804040f, -0.465201f},
{ -0.990622f, -0.095667f, 0.097554f},
{ 0.777661f, -0.164942f, 0.606661f},
{ 0.694195f, -0.066195f, 0.716737f},
{ 0.690774f, -0.068166f, 0.719850f},
{ 0.656144f, -0.087493f, 0.749547f},
{ 0.651371f, -0.090072f, 0.753395f}};

static int[] FaceArray = new int[]{
4, 5, 7,
7, 5, 6,
11, 12, 10,
10, 12, 13,
8, 15, 11,
11, 15, 12,
14, 96, 9,
9, 97, 98,
13, 14, 10,
10, 14, 9,
99, 1, 100,
101, 1, 5,
1, 2, 5,
5, 2, 6,
102, 103, 104,
105, 106, 107,
108, 109, 2,
2, 110, 6,
13, 12, 111,
112, 12, 3,
13, 113, 14,
14, 114, 115,
14, 116, 117,
118, 119, 120,
12, 15, 3,
3, 15, 0,
36, 31, 37,
37, 31, 35,
27, 28, 32,
32, 28, 33,
25, 24, 21,
21, 24, 22,
37, 34, 36,
36, 34, 30,
21, 121, 17,
17, 122, 42,
31, 36, 123,
124, 36, 30,
42, 125, 20,
20, 126, 29,
43, 19, 127,
128, 19, 16,
129, 16, 130,
131, 16, 29,
29, 16, 28,
28, 16, 33,
26, 25, 17,
17, 25, 21,
44, 47, 45,
45, 47, 46,
132, 133, 134,
135, 136, 41,
137, 35, 41,
41, 35, 40,
138, 38, 31,
31, 38, 39,
31, 39, 35,
35, 39, 40,
39, 38, 45,
45, 38, 139,
140, 141, 142,
143, 144, 41,
40, 39, 46,
46, 39, 45,
35, 145, 37,
37, 146, 34,
22, 18, 147,
148, 18, 43,
149, 41, 46,
46, 41, 40,
16, 19, 33,
33, 19, 32,
27, 20, 28,
28, 20, 29,
25, 49, 24,
24, 49, 50,
24, 23, 22,
22, 23, 18,
48, 23, 50,
50, 23, 24,
51, 49, 26,
26, 49, 25,
150, 151, 152,
153, 154, 155,
52, 54, 53,
54, 55, 53,
156, 157, 56,
158, 57, 56,
58, 60, 59,
60, 61, 59,
54, 52, 62,
52, 63, 62,
60, 159, 160,
161, 162, 163,
53, 164, 52,
165, 63, 52,
166, 167, 168,
169, 64, 170,
171, 172, 173,
174, 65, 175,
176, 177, 65,
178, 64, 65,
64, 56, 65,
56, 57, 65,
179, 180, 58,
181, 60, 58,
66, 68, 67,
68, 69, 67,
182, 183, 184,
185, 71, 186,
187, 71, 55,
71, 72, 55,
188, 53, 70,
53, 73, 70,
53, 55, 73,
55, 72, 73,
73, 68, 70,
68, 189, 70,
190, 191, 192,
193, 71, 194,
72, 69, 73,
69, 68, 73,
55, 54, 195,
54, 62, 196,
61, 197, 198,
199, 200, 201,
202, 69, 71,
69, 72, 71,
65, 57, 203,
57, 204, 205,
206, 56, 207,
56, 64, 208,
58, 59, 74,
59, 75, 74,
59, 61, 209,
61, 210, 211,
212, 75, 213,
75, 59, 214,
215, 216, 74,
217, 58, 74,
218, 219, 220,
221, 222, 223,
80, 83, 81,
83, 82, 81,
87, 86, 88,
86, 89, 88,
84, 87, 91,
87, 88, 91,
90, 85, 224,
85, 225, 226,
89, 86, 90,
86, 85, 90,
227, 228, 77,
229, 81, 77,
77, 81, 78,
81, 82, 78,
230, 231, 232,
233, 234, 235,
236, 78, 237,
78, 82, 238,
89, 239, 88,
240, 79, 88,
89, 90, 241,
90, 242, 243,
90, 244, 245,
246, 247, 248,
88, 79, 91,
79, 76, 91,
92, 93, 94,
94, 93, 95, };

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


//Vertices: 249  Texture Co-ords: 156  Normals: 96  Texture: joannarun3.mtl Faces: 170 Smooth Groups: 4 sucess: 80 Doubles: 90 Redos needed: 153 Correct: 117