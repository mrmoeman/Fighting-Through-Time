package com.example.jgfjhg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;
import android.graphics.Bitmap;
import android.opengl.GLUtils;

class joannarunb {

static String TextureName = "joannarun2.mtl";

static int Vertices = 249;

static int VertTexts = 156;

static int Normals = 96;

static int Faces = 170;

static int FacesB = 0;

static int SmoothGroups = 4;

static float VertArray[] = new float[]{
 0.303197f, 1.434159f, 0.484533f,
 0.884254f, 1.433577f, 0.401567f,
 0.983620f, 1.394073f, 1.015474f,
 0.401825f, 1.411657f, 1.102415f,
 0.273183f, 0.849825f, 0.307667f,
 0.852560f, 0.849763f, 0.213233f,
 1.215015f, 0.640922f, 2.295821f,
 0.634741f, 0.641111f, 2.394847f,
 0.151712f, 3.666936f, 0.250956f,
 0.916223f, 3.750475f, 0.262002f,
 1.029054f, 4.331857f, 0.902679f,
 0.279152f, 4.331536f, 0.993040f,
 0.612730f, 3.206260f, 1.856443f,
 1.121890f, 3.198121f, 1.793582f,
 1.039790f, 3.099434f, 1.270167f,
 0.522409f, 3.099483f, 1.273585f,
 1.083500f, 8.478950f, 1.196773f,
 0.583079f, 6.676930f, 1.067815f,
 0.138881f, 7.685822f, 0.514550f,
 0.439080f, 8.419472f, 0.799119f,
 0.410325f, 8.136253f, 2.250423f,
 1.167817f, 7.256025f, 0.625331f,
 0.931785f, 7.646787f, -0.026956f,
 0.084016f, 5.883666f, -0.119206f,
 0.649006f, 5.748410f, 0.322859f,
 0.513994f, 5.416237f, 0.795354f,
 -0.214735f, 5.170803f, 0.735472f,
 0.417684f, 9.428505f, 2.373994f,
 1.059948f, 9.195189f, 2.026911f,
 1.062183f, 8.341078f, 1.939861f,
 0.839113f, 7.942209f, 1.448300f,
 1.822262f, 7.204398f, 0.628863f,
 0.458450f, 9.543584f, 0.952726f,
 1.081680f, 9.255733f, 1.269240f,
 0.750373f, 8.136947f, 0.950402f,
 1.823895f, 7.229556f, 0.209826f,
 1.748922f, 7.944860f, 0.738430f,
 1.692508f, 8.063251f, 0.282896f,
 1.759016f, 6.256268f, 0.336805f,
 2.143240f, 6.304107f, 0.318602f,
 2.183532f, 6.120226f, 0.017834f,
 1.822132f, 6.049765f, 0.001357f,
 0.283128f, 7.726719f, 1.709758f,
 0.462468f, 8.040654f, 0.814931f,
 1.895916f, 6.109018f, 2.183801f,
 2.468424f, 6.255358f, 1.773900f,
 2.573152f, 5.786752f, 1.582192f,
 2.111328f, 5.419733f, 1.791689f,
 0.396901f, 3.131104f, -1.013182f,
 1.424943f, 4.267725f, 1.144056f,
 1.496274f, 3.471093f, 0.126992f,
 -0.165254f, 3.573248f, 0.913054f,
 -0.133838f, 7.920077f, 1.775803f,
 0.326398f, 7.388523f, 1.961287f,
 -0.379628f, 7.790766f, 2.142333f,
 0.141917f, 7.279795f, 2.322040f,
 -0.204034f, 9.194618f, 1.990816f,
 -0.182611f, 9.254962f, 1.233877f,
 -0.829272f, 5.412991f, 0.339539f,
 -0.632551f, 5.748123f, -0.124140f,
 -0.211557f, 6.956639f, 1.372907f,
 -0.687402f, 7.200852f, 1.483190f,
 -0.207377f, 8.003923f, 1.173801f,
 -0.077868f, 7.830018f, 1.604815f,
 -0.201586f, 8.340708f, 1.903607f,
 -0.180513f, 8.478251f, 1.161412f,
 2.256764f, 6.920153f, 1.068237f,
 2.525426f, 6.469512f, 1.701363f,
 2.182080f, 7.309219f, 1.670452f,
 2.382758f, 6.992938f, 2.030007f,
 0.881023f, 6.584444f, 2.277716f,
 0.856057f, 6.369203f, 2.649439f,
 1.006067f, 6.649175f, 2.837085f,
 1.038126f, 6.852679f, 2.515676f,
 -1.285268f, 3.867984f, 0.552530f,
 -1.193707f, 3.541308f, -0.895647f,
 -0.290897f, 0.953884f, -0.761362f,
 -0.863285f, 0.988202f, -0.898150f,
 -1.002290f, 0.918462f, -0.294694f,
 -0.426780f, 0.896145f, -0.173083f,
 -0.282558f, 0.331735f, -0.912943f,
 -0.862160f, 0.326846f, -1.017063f,
 -1.226368f, 0.297983f, 1.075468f,
 -0.646094f, 0.298111f, 1.175153f,
 -0.054679f, 3.747319f, -0.468732f,
 -0.821083f, 3.815304f, -0.488966f,
 -0.989403f, 4.022796f, 0.342612f,
 -0.246042f, 3.984023f, 0.470425f,
 -0.587938f, 2.622889f, 0.716227f,
 -1.092072f, 2.639976f, 0.611698f,
 -0.966291f, 2.693911f, 0.044814f,
 -0.451192f, 2.694308f, 0.142925f,
 2.052381f, 11.983541f, 2.254572f,
 1.525471f, 11.633430f, 3.218138f,
 2.487360f, 4.841469f, 0.729055f,
 1.933865f, 4.620560f, 1.617140f,
 0.522409f, 3.099483f, 1.273585f,
 0.522409f, 3.099483f, 1.273585f,
 0.151712f, 3.666936f, 0.250956f,
 0.303197f, 1.434159f, 0.484533f,
 0.273183f, 0.849825f, 0.307667f,
 0.273183f, 0.849825f, 0.307667f,
 0.303197f, 1.434159f, 0.484533f,
 0.273183f, 0.849825f, 0.307667f,
 0.401825f, 1.411657f, 1.102415f,
 0.401825f, 1.411657f, 1.102415f,
 0.273183f, 0.849825f, 0.307667f,
 0.634741f, 0.641111f, 2.394847f,
 0.401825f, 1.411657f, 1.102415f,
 0.634741f, 0.641111f, 2.394847f,
 0.634741f, 0.641111f, 2.394847f,
 0.983620f, 1.394073f, 1.015474f,
 0.983620f, 1.394073f, 1.015474f,
 0.983620f, 1.394073f, 1.015474f,
 0.983620f, 1.394073f, 1.015474f,
 0.884254f, 1.433577f, 0.401567f,
 0.884254f, 1.433577f, 0.401567f,
 0.522409f, 3.099483f, 1.273585f,
 0.522409f, 3.099483f, 1.273585f,
 0.884254f, 1.433577f, 0.401567f,
 0.303197f, 1.434159f, 0.484533f,
 0.839113f, 7.942209f, 1.448300f,
 0.839113f, 7.942209f, 1.448300f,
 1.167817f, 7.256025f, 0.625331f,
 1.167817f, 7.256025f, 0.625331f,
 0.839113f, 7.942209f, 1.448300f,
 0.839113f, 7.942209f, 1.448300f,
 0.750373f, 8.136947f, 0.950402f,
 0.750373f, 8.136947f, 0.950402f,
 0.750373f, 8.136947f, 0.950402f,
 0.839113f, 7.942209f, 1.448300f,
 0.839113f, 7.942209f, 1.448300f,
 1.167817f, 7.256025f, 0.625331f,
 0.931785f, 7.646787f, -0.026956f,
 1.759016f, 6.256268f, 0.336805f,
 1.759016f, 6.256268f, 0.336805f,
 0.931785f, 7.646787f, -0.026956f,
 0.931785f, 7.646787f, -0.026956f,
 1.167817f, 7.256025f, 0.625331f,
 1.895916f, 6.109018f, 2.183801f,
 1.895916f, 6.109018f, 2.183801f,
 1.759016f, 6.256268f, 0.336805f,
 2.111328f, 5.419733f, 1.791689f,
 2.111328f, 5.419733f, 1.791689f,
 1.759016f, 6.256268f, 0.336805f,
 0.931785f, 7.646787f, -0.026956f,
 0.931785f, 7.646787f, -0.026956f,
 0.750373f, 8.136947f, 0.950402f,
 0.750373f, 8.136947f, 0.950402f,
 2.111328f, 5.419733f, 1.791689f,
 0.396901f, 3.131104f, -1.013182f,
 1.496274f, 3.471093f, 0.126992f,
 -0.165254f, 3.573248f, 0.913054f,
 -0.165254f, 3.573248f, 0.913054f,
 1.496274f, 3.471093f, 0.126992f,
 1.424943f, 4.267725f, 1.144056f,
 0.417684f, 9.428505f, 2.373994f,
 0.458450f, 9.543584f, 0.952726f,
 0.458450f, 9.543584f, 0.952726f,
 0.583079f, 6.676930f, 1.067815f,
 -0.077868f, 7.830018f, 1.604815f,
 0.583079f, 6.676930f, 1.067815f,
 0.283128f, 7.726719f, 1.709758f,
 -0.077868f, 7.830018f, 1.604815f,
 -0.211557f, 6.956639f, 1.372907f,
 -0.211557f, 6.956639f, 1.372907f,
 0.283128f, 7.726719f, 1.709758f,
 0.410325f, 8.136253f, 2.250423f,
 -0.077868f, 7.830018f, 1.604815f,
 0.410325f, 8.136253f, 2.250423f,
 -0.077868f, 7.830018f, 1.604815f,
 0.462468f, 8.040654f, 0.814931f,
 -0.207377f, 8.003923f, 1.173801f,
 0.439080f, 8.419472f, 0.799119f,
 -0.207377f, 8.003923f, 1.173801f,
 0.439080f, 8.419472f, 0.799119f,
 -0.207377f, 8.003923f, 1.173801f,
 -0.077868f, 7.830018f, 1.604815f,
 -0.077868f, 7.830018f, 1.604815f,
 -0.214735f, 5.170803f, 0.735472f,
 0.583079f, 6.676930f, 1.067815f,
 0.583079f, 6.676930f, 1.067815f,
 -0.211557f, 6.956639f, 1.372907f,
 0.881023f, 6.584444f, 2.277716f,
 -0.687402f, 7.200852f, 1.483190f,
 0.881023f, 6.584444f, 2.277716f,
 -0.687402f, 7.200852f, 1.483190f,
 -0.687402f, 7.200852f, 1.483190f,
 -0.211557f, 6.956639f, 1.372907f,
 2.256764f, 6.920153f, 1.068237f,
 2.256764f, 6.920153f, 1.068237f,
 2.525426f, 6.469512f, 1.701363f,
 0.881023f, 6.584444f, 2.277716f,
 2.525426f, 6.469512f, 1.701363f,
 0.881023f, 6.584444f, 2.277716f,
 -0.687402f, 7.200852f, 1.483190f,
 -0.687402f, 7.200852f, 1.483190f,
 -0.207377f, 8.003923f, 1.173801f,
 0.138881f, 7.685822f, 0.514550f,
 -0.207377f, 8.003923f, 1.173801f,
 0.462468f, 8.040654f, 0.814931f,
 0.138881f, 7.685822f, 0.514550f,
 2.525426f, 6.469512f, 1.701363f,
 0.439080f, 8.419472f, 0.799119f,
 0.458450f, 9.543584f, 0.952726f,
 0.439080f, 8.419472f, 0.799119f,
 0.417684f, 9.428505f, 2.373994f,
 0.410325f, 8.136253f, 2.250423f,
 0.410325f, 8.136253f, 2.250423f,
 0.084016f, 5.883666f, -0.119206f,
 0.138881f, 7.685822f, 0.514550f,
 0.084016f, 5.883666f, -0.119206f,
 0.396901f, 3.131104f, -1.013182f,
 0.084016f, 5.883666f, -0.119206f,
 0.084016f, 5.883666f, -0.119206f,
 -0.165254f, 3.573248f, 0.913054f,
 -0.214735f, 5.170803f, 0.735472f,
 -0.214735f, 5.170803f, 0.735472f,
 0.396901f, 3.131104f, -1.013182f,
 -0.165254f, 3.573248f, 0.913054f,
 -1.193707f, 3.541308f, -0.895647f,
 -0.165254f, 3.573248f, 0.913054f,
 -1.285268f, 3.867984f, 0.552530f,
 -1.193707f, 3.541308f, -0.895647f,
 -0.451192f, 2.694308f, 0.142925f,
 -0.054679f, 3.747319f, -0.468732f,
 -0.451192f, 2.694308f, 0.142925f,
 -0.290897f, 0.953884f, -0.761362f,
 -0.282558f, 0.331735f, -0.912943f,
 -0.282558f, 0.331735f, -0.912943f,
 -0.290897f, 0.953884f, -0.761362f,
 -0.426780f, 0.896145f, -0.173083f,
 -0.282558f, 0.331735f, -0.912943f,
 -0.426780f, 0.896145f, -0.173083f,
 -0.646094f, 0.298111f, 1.175153f,
 -0.282558f, 0.331735f, -0.912943f,
 -0.426780f, 0.896145f, -0.173083f,
 -0.646094f, 0.298111f, 1.175153f,
 -0.646094f, 0.298111f, 1.175153f,
 -1.002290f, 0.918462f, -0.294694f,
 -1.002290f, 0.918462f, -0.294694f,
 -1.002290f, 0.918462f, -0.294694f,
 -0.863285f, 0.988202f, -0.898150f,
 -1.002290f, 0.918462f, -0.294694f,
 -0.451192f, 2.694308f, 0.142925f,
 -0.863285f, 0.988202f, -0.898150f,
 -0.451192f, 2.694308f, 0.142925f,
 -0.290897f, 0.953884f, -0.761362f,
 -0.863285f, 0.988202f, -0.898150f,};

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
{ -0.574040f, -0.786182f, -0.228900f},
{ 0.454355f, -0.791753f, -0.408275f},
{ -0.451377f, -0.697488f, 0.556569f},
{ 0.602640f, -0.704561f, 0.374724f},
{ -0.617618f, 0.332750f, 0.712618f},
{ -0.434574f, 0.051382f, 0.899170f},
{ 0.743832f, 0.450843f, 0.493412f},
{ 0.665891f, 0.018876f, 0.745810f},
{ -0.708989f, -0.693536f, -0.127836f},
{ -0.943512f, -0.123254f, -0.307561f},
{ 0.850976f, -0.040498f, -0.523641f},
{ 0.686353f, -0.584373f, -0.432930f},
{ -0.742276f, 0.328637f, -0.583973f},
{ 0.540878f, 0.303833f, -0.784306f},
{ 0.955998f, 0.103455f, 0.274528f},
{ -0.821651f, 0.098550f, 0.561407f},
{ 0.713592f, 0.222248f, 0.664374f},
{ 0.505530f, -0.089475f, 0.858157f},
{ 0.289533f, 0.752729f, -0.591244f},
{ 0.578918f, 0.214719f, -0.786607f},
{ -0.019832f, 0.641632f, 0.766756f},
{ 0.734064f, 0.454869f, 0.504227f},
{ 0.024326f, 0.739254f, -0.672987f},
{ 0.795213f, 0.430533f, -0.426940f},
{ 0.288904f, 0.125829f, 0.949053f},
{ 0.860965f, 0.084368f, -0.501618f},
{ 0.615806f, -0.638707f, 0.461342f},
{ -0.114651f, 0.316704f, -0.941570f},
{ 0.149822f, 0.894237f, -0.421774f},
{ 0.716983f, -0.380169f, 0.584300f},
{ 0.388433f, -0.366844f, 0.845308f},
{ 0.151592f, -0.614700f, 0.774057f},
{ 0.027751f, -0.384221f, 0.922824f},
{ 0.808610f, -0.310920f, 0.499479f},
{ -0.229464f, 0.416623f, -0.879643f},
{ -0.031721f, 0.082791f, -0.996062f},
{ 0.897512f, -0.087519f, -0.432218f},
{ -0.312499f, 0.108658f, 0.943683f},
{ -0.849388f, 0.274259f, 0.450913f},
{ -0.505134f, -0.860522f, 0.065894f},
{ 0.400671f, 0.879538f, 0.256661f},
{ 0.853500f, -0.493966f, -0.165936f},
{ -0.928477f, -0.165893f, 0.332279f},
{ -0.309106f, -0.639665f, -0.703763f},
{ 0.562668f, -0.472366f, -0.678436f},
{ 0.742901f, 0.654520f, 0.140365f},
{ -0.658631f, 0.374121f, -0.652870f},
{ 0.741369f, -0.025980f, 0.670595f},
{ 0.872913f, -0.353039f, -0.336728f},
{ 0.122483f, 0.350021f, -0.928700f},
{ 0.321046f, -0.349518f, -0.880208f},
{ -0.172661f, -0.655512f, 0.735181f},
{ 0.595414f, 0.799810f, -0.076063f},
{ -0.748788f, 0.256706f, 0.611081f},
{ 0.736661f, 0.468800f, -0.487399f},
{ -0.520595f, -0.016402f, 0.853646f},
{ -0.761983f, 0.458546f, 0.457294f},
{ -0.772889f, 0.437980f, -0.459147f},
{ -0.827765f, 0.224319f, 0.514282f},
{ 0.011644f, -0.725835f, 0.687771f},
{ -0.571050f, 0.520045f, -0.635182f},
{ -0.987222f, -0.018166f, -0.158313f},
{ -0.838134f, 0.362309f, -0.407754f},
{ -0.306265f, -0.502366f, 0.808598f},
{ -0.864336f, -0.188430f, 0.466281f},
{ -0.865752f, 0.006865f, -0.500427f},
{ -0.268998f, -0.260026f, -0.927376f},
{ -0.141734f, 0.964458f, -0.223007f},
{ 0.309466f, -0.946641f, -0.090012f},
{ 0.593639f, 0.150055f, 0.790618f},
{ -0.134495f, -0.557647f, -0.819110f},
{ -0.211705f, -0.900621f, 0.379556f},
{ 0.184678f, -0.096761f, 0.978024f},
{ 0.063396f, 0.987907f, 0.141497f},
{ -0.910322f, -0.184393f, 0.370558f},
{ -0.577680f, -0.206726f, -0.789652f},
{ 0.537790f, -0.820999f, -0.191686f},
{ 0.395682f, -0.681686f, 0.615418f},
{ -0.454685f, -0.812733f, -0.364316f},
{ -0.593659f, -0.671083f, 0.444092f},
{ 0.595078f, -0.016054f, 0.803508f},
{ -0.815872f, 0.174196f, 0.551371f},
{ 0.436334f, -0.186493f, 0.880246f},
{ -0.800034f, -0.119456f, 0.587942f},
{ 0.750788f, -0.519606f, -0.407833f},
{ 0.935395f, -0.070635f, -0.346477f},
{ -0.733149f, 0.114705f, -0.670325f},
{ -0.642228f, -0.298568f, -0.705975f},
{ 0.793578f, 0.293213f, -0.533161f},
{ -0.464365f, 0.342567f, -0.816709f},
{ -0.977834f, 0.089199f, 0.189429f},
{ 0.819064f, 0.088672f, 0.566809f},
{ 0.883380f, -0.045823f, 0.466412f},
{ 0.881107f, -0.047646f, 0.470510f},
{ 0.857531f, -0.065545f, 0.510240f},
{ 0.854204f, -0.067936f, 0.515480f}};

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


//Vertices: 249  Texture Co-ords: 156  Normals: 96  Texture: joannarun2.mtl Faces: 170 Smooth Groups: 4 sucess: 80 Doubles: 90 Redos needed: 153 Correct: 117