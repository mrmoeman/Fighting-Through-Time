package com.example.jgfjhg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;
import android.graphics.Bitmap;
import android.opengl.GLUtils;

class luchblockc {

static String TextureName = "block";

static int Vertices = 342;

static int VertTexts = 202;

static int Normals = 304;

static int Faces = 196;

static int FacesB = 30;

static int SmoothGroups = 94;

static float VertArray[] = new float[]{
 0.323412f, 8.517485f, 1.142506f,
 1.998192f, 8.637631f, 0.627071f,
 -0.429936f, 10.267642f, 0.558887f,
 2.073855f, 10.331515f, 0.786471f,
 -0.053644f, 10.448458f, -2.976095f,
 2.644438f, 10.361036f, -2.789111f,
 -0.372869f, 8.157221f, -2.951380f,
 2.144026f, 8.146204f, -3.034606f,
 -0.269747f, 5.396305f, -2.351724f,
 1.388415f, 5.527248f, -2.332067f,
 0.946583f, 5.716590f, 0.146707f,
 0.150784f, 5.641205f, 0.120912f,
 -0.071227f, 10.563288f, -0.117288f,
 0.937171f, 10.592791f, -0.396512f,
 0.950603f, 10.827341f, -2.128928f,
 -0.052629f, 10.888028f, -2.515854f,
 -0.063298f, 11.740233f, 0.315333f,
 1.353603f, 11.805533f, -0.253049f,
 1.366544f, 12.031487f, -1.921974f,
 -0.040792f, 12.133219f, -2.587307f,
 -0.047225f, 13.490785f, 0.302130f,
 0.905049f, 13.297332f, 0.047653f,
 0.919673f, 13.552688f, -1.838434f,
 -0.028623f, 13.815594f, -2.096951f,
 1.016779f, 3.200182f, -0.862141f,
 2.043871f, 3.207812f, -0.907047f,
 2.097284f, 2.666376f, 0.222633f,
 1.070192f, 2.658747f, 0.267539f,
 0.733040f, -0.025459f, -3.838224f,
 2.545638f, -0.025459f, -3.838224f,
 2.545638f, 1.291012f, -1.690292f,
 0.733078f, 1.291012f, -1.690292f,
 0.778096f, -0.015118f, 0.693824f,
 2.416366f, -0.015118f, 0.693824f,
 2.244411f, 1.218862f, -0.648314f,
 0.998903f, 1.218862f, -0.648314f,
 3.346911f, 9.197144f, 1.537830f,
 2.386481f, 8.930326f, 0.647263f,
 3.606317f, 10.005375f, 0.339319f,
 2.375454f, 10.109624f, 0.203226f,
 2.165844f, 10.093076f, 2.961557f,
 2.152298f, 10.155497f, 2.303076f,
 2.338657f, 10.785731f, 3.023661f,
 2.328705f, 10.831592f, 2.539859f,
 0.100720f, 10.260534f, 3.510775f,
 0.071295f, 10.396129f, 2.080329f,
 0.367727f, 11.330735f, 3.606730f,
 0.343415f, 11.442774f, 2.424790f,
 -1.225789f, 10.608438f, 3.571041f,
 -1.255213f, 10.744034f, 2.140594f,
 -0.958780f, 11.678638f, 3.666995f,
 -0.983093f, 11.790677f, 2.485056f,
 0.078843f, 0.291823f, -4.060118f,
 0.078843f, 7.464554f, -3.673194f,
 4.632588f, 7.464556f, -3.244688f,
 6.563060f, 0.291822f, -3.219815f,
 -2.224280f, 8.465345f, 1.044548f,
 -2.660157f, 10.174791f, -0.017642f,
 -0.934397f, 13.314131f, 0.035665f,
 -0.919808f, 13.569487f, -1.850423f,
 -2.301160f, 9.837316f, -2.996423f,
 -2.775700f, 8.144221f, -2.197692f,
 -0.620411f, -0.015118f, 5.053027f,
 -2.258681f, -0.015118f, 5.053027f,
 -2.086726f, 1.218862f, 3.710888f,
 -0.841217f, 1.218862f, 3.710888f,
 -1.405299f, 4.647693f, -1.688654f,
 -1.144485f, 6.498094f, -0.128188f,
 -1.075192f, 10.611168f, -0.409627f,
 -1.061760f, 10.845719f, -2.142043f,
 -1.471242f, 11.831330f, -0.271460f,
 -1.458302f, 12.057285f, -1.940384f,
 -2.040315f, 4.238437f, 0.964502f,
 -1.023541f, 4.293081f, 1.106545f,
 -2.224275f, 4.523931f, 2.171496f,
 -1.207501f, 4.578574f, 2.313539f,
 -2.387953f, -0.025459f, 0.520979f,
 -0.575354f, -0.025459f, 0.520979f,
 -2.387953f, 1.291012f, 2.668911f,
 -0.575393f, 1.291012f, 2.668911f,
 -3.897381f, 8.543082f, -0.219170f,
 -1.836201f, 8.570334f, 0.041311f,
 -3.827497f, 9.838468f, -0.907683f,
 -2.002458f, 9.862597f, -0.677045f,
 -2.822248f, 8.593629f, 1.722614f,
 -2.779359f, 8.840777f, 1.110441f,
 -2.990171f, 9.243607f, 1.973260f,
 -2.958659f, 9.425192f, 1.523481f,
 -0.781338f, 8.550702f, 2.376266f,
 -0.688169f, 9.087590f, 1.046416f,
 -1.040788f, 9.554965f, 2.763530f,
 -0.963805f, 9.998581f, 1.664711f,
 0.638107f, 9.373684f, 1.254836f,
 0.544938f, 8.836796f, 2.584686f,
 0.285487f, 9.841058f, 2.971950f,
 0.362470f, 10.284674f, 1.873131f,
 -3.719020f, 7.464556f, -3.420469f,
 -6.078575f, 0.291822f, -2.371626f,
 5.597824f, 3.336636f, -3.222102f,
 0.066234f, 4.538416f, -3.446765f,
 -5.276739f, 3.336636f, -2.373912f,
 3.909215f, 8.724590f, -3.289036f,
 0.078843f, 9.586023f, -3.075205f,
 -3.480362f, 7.840855f, -3.551715f,
 1.998192f, 8.637631f, 0.627071f,
 1.998192f, 8.637631f, 0.627071f,
 0.946583f, 5.716590f, 0.146707f,
 2.644438f, 10.361036f, -2.789111f,
 2.644438f, 10.361036f, -2.789111f,
 0.950603f, 10.827341f, -2.128928f,
 2.644438f, 10.361036f, -2.789111f,
 -0.053644f, 10.448458f, -2.976095f,
 0.950603f, 10.827341f, -2.128928f,
 0.950603f, 10.827341f, -2.128928f,
 -0.053644f, 10.448458f, -2.976095f,
 -0.052629f, 10.888028f, -2.515854f,
 -0.071227f, 10.563288f, -0.117288f,
 0.937171f, 10.592791f, -0.396512f,
 0.937171f, 10.592791f, -0.396512f,
 0.950603f, 10.827341f, -2.128928f,
 1.366544f, 12.031487f, -1.921974f,
 0.937171f, 10.592791f, -0.396512f,
 0.937171f, 10.592791f, -0.396512f,
 1.366544f, 12.031487f, -1.921974f,
 1.353603f, 11.805533f, -0.253049f,
 1.366544f, 12.031487f, -1.921974f,
 1.353603f, 11.805533f, -0.253049f,
 1.353603f, 11.805533f, -0.253049f,
 -0.269747f, 5.396305f, -2.351724f,
 1.388415f, 5.527248f, -2.332067f,
 1.388415f, 5.527248f, -2.332067f,
 1.388415f, 5.527248f, -2.332067f,
 0.946583f, 5.716590f, 0.146707f,
 2.043871f, 3.207812f, -0.907047f,
 2.043871f, 3.207812f, -0.907047f,
 0.946583f, 5.716590f, 0.146707f,
 0.150784f, 5.641205f, 0.120912f,
 0.946583f, 5.716590f, 0.146707f,
 0.946583f, 5.716590f, 0.146707f,
 -0.269747f, 5.396305f, -2.351724f,
 0.150784f, 5.641205f, 0.120912f,
 0.150784f, 5.641205f, 0.120912f,
 1.070192f, 2.658747f, 0.267539f,
 2.043871f, 3.207812f, -0.907047f,
 2.043871f, 3.207812f, -0.907047f,
 2.545638f, -0.025459f, -3.838224f,
 1.070192f, 2.658747f, 0.267539f,
 0.733078f, 1.291012f, -1.690292f,
 0.733078f, 1.291012f, -1.690292f,
 2.545638f, -0.025459f, -3.838224f,
 0.733040f, -0.025459f, -3.838224f,
 0.733040f, -0.025459f, -3.838224f,
 2.545638f, -0.025459f, -3.838224f,
 2.416366f, -0.015118f, 0.693824f,
 2.416366f, -0.015118f, 0.693824f,
 2.244411f, 1.218862f, -0.648314f,
 2.545638f, 1.291012f, -1.690292f,
 0.733078f, 1.291012f, -1.690292f,
 0.733078f, 1.291012f, -1.690292f,
 0.778096f, -0.015118f, 0.693824f,
 0.733078f, 1.291012f, -1.690292f,
 0.733078f, 1.291012f, -1.690292f,
 0.778096f, -0.015118f, 0.693824f,
 0.998903f, 1.218862f, -0.648314f,
 3.346911f, 9.197144f, 1.537830f,
 2.144026f, 8.146204f, -3.034606f,
 1.998192f, 8.637631f, 0.627071f,
 2.144026f, 8.146204f, -3.034606f,
 2.644438f, 10.361036f, -2.789111f,
 3.606317f, 10.005375f, 0.339319f,
 2.144026f, 8.146204f, -3.034606f,
 2.144026f, 8.146204f, -3.034606f,
 3.606317f, 10.005375f, 0.339319f,
 3.346911f, 9.197144f, 1.537830f,
 2.644438f, 10.361036f, -2.789111f,
 2.644438f, 10.361036f, -2.789111f,
 3.606317f, 10.005375f, 0.339319f,
 1.998192f, 8.637631f, 0.627071f,
 2.386481f, 8.930326f, 0.647263f,
 3.346911f, 9.197144f, 1.537830f,
 3.346911f, 9.197144f, 1.537830f,
 2.165844f, 10.093076f, 2.961557f,
 2.375454f, 10.109624f, 0.203226f,
 2.386481f, 8.930326f, 0.647263f,
 2.375454f, 10.109624f, 0.203226f,
 2.375454f, 10.109624f, 0.203226f,
 2.165844f, 10.093076f, 2.961557f,
 2.165844f, 10.093076f, 2.961557f,
 0.100720f, 10.260534f, 3.510775f,
 0.071295f, 10.396129f, 2.080329f,
 0.100720f, 10.260534f, 3.510775f,
 0.100720f, 10.260534f, 3.510775f,
 0.367727f, 11.330735f, 3.606730f,
 0.100720f, 10.260534f, 3.510775f,
 0.100720f, 10.260534f, 3.510775f,
 0.343415f, 11.442774f, 2.424790f,
 0.367727f, 11.330735f, 3.606730f,
 0.367727f, 11.330735f, 3.606730f,
 0.343415f, 11.442774f, 2.424790f,
 0.071295f, 10.396129f, 2.080329f,
 0.071295f, 10.396129f, 2.080329f,
 -0.053644f, 10.448458f, -2.976095f,
 2.644438f, 10.361036f, -2.789111f,
 2.644438f, 10.361036f, -2.789111f,
 -2.224280f, 8.465345f, 1.044548f,
 -1.144485f, 6.498094f, -0.128188f,
 -1.144485f, 6.498094f, -0.128188f,
 -2.301160f, 9.837316f, -2.996423f,
 -2.301160f, 9.837316f, -2.996423f,
 -0.053644f, 10.448458f, -2.976095f,
 -0.053644f, 10.448458f, -2.976095f,
 -0.052629f, 10.888028f, -2.515854f,
 -0.071227f, 10.563288f, -0.117288f,
 -1.075192f, 10.611168f, -0.409627f,
 -1.075192f, 10.611168f, -0.409627f,
 -1.471242f, 11.831330f, -0.271460f,
 -1.458302f, 12.057285f, -1.940384f,
 -1.075192f, 10.611168f, -0.409627f,
 -1.075192f, 10.611168f, -0.409627f,
 -1.458302f, 12.057285f, -1.940384f,
 -1.061760f, 10.845719f, -2.142043f,
 -1.061760f, 10.845719f, -2.142043f,
 -1.061760f, 10.845719f, -2.142043f,
 -1.471242f, 11.831330f, -0.271460f,
 -1.471242f, 11.831330f, -0.271460f,
 -1.458302f, 12.057285f, -1.940384f,
 -0.269747f, 5.396305f, -2.351724f,
 -1.405299f, 4.647693f, -1.688654f,
 -1.405299f, 4.647693f, -1.688654f,
 -1.405299f, 4.647693f, -1.688654f,
 -2.040315f, 4.238437f, 0.964502f,
 -1.144485f, 6.498094f, -0.128188f,
 -1.144485f, 6.498094f, -0.128188f,
 -2.040315f, 4.238437f, 0.964502f,
 -1.144485f, 6.498094f, -0.128188f,
 -1.144485f, 6.498094f, -0.128188f,
 0.150784f, 5.641205f, 0.120912f,
 -1.207501f, 4.578574f, 2.313539f,
 0.150784f, 5.641205f, 0.120912f,
 0.150784f, 5.641205f, 0.120912f,
 -0.269747f, 5.396305f, -2.351724f,
 -2.387953f, -0.025459f, 0.520979f,
 -2.040315f, 4.238437f, 0.964502f,
 -2.040315f, 4.238437f, 0.964502f,
 -1.207501f, 4.578574f, 2.313539f,
 -0.575393f, 1.291012f, 2.668911f,
 -0.575393f, 1.291012f, 2.668911f,
 -0.575354f, -0.025459f, 0.520979f,
 -0.575354f, -0.025459f, 0.520979f,
 -2.387953f, -0.025459f, 0.520979f,
 -2.387953f, -0.025459f, 0.520979f,
 -2.258681f, -0.015118f, 5.053027f,};

static float VertArrayB[] = new float[]{
 -2.387953f, 1.291012f, 2.668911f,
 -2.258681f, -0.015118f, 5.053027f,
 -2.086726f, 1.218862f, 3.710888f,
 -2.387953f, 1.291012f, 2.668911f,
 -2.086726f, 1.218862f, 3.710888f,
 -0.575393f, 1.291012f, 2.668911f,
 -0.575393f, 1.291012f, 2.668911f,
 -2.086726f, 1.218862f, 3.710888f,
 -0.841217f, 1.218862f, 3.710888f,
 -0.841217f, 1.218862f, 3.710888f,
 -0.620411f, -0.015118f, 5.053027f,
 -0.575393f, 1.291012f, 2.668911f,
 -0.575393f, 1.291012f, 2.668911f,
 -0.620411f, -0.015118f, 5.053027f,
 -0.575354f, -0.025459f, 0.520979f,
 -2.775700f, 8.144221f, -2.197692f,
 -2.224280f, 8.465345f, 1.044548f,
 -3.897381f, 8.543082f, -0.219170f,
 -2.224280f, 8.465345f, 1.044548f,
 -1.836201f, 8.570334f, 0.041311f,
 -3.897381f, 8.543082f, -0.219170f,
 -3.897381f, 8.543082f, -0.219170f,
 -3.827497f, 9.838468f, -0.907683f,
 -2.775700f, 8.144221f, -2.197692f,
 -2.775700f, 8.144221f, -2.197692f,
 -3.827497f, 9.838468f, -0.907683f,
 -2.301160f, 9.837316f, -2.996423f,
 -2.301160f, 9.837316f, -2.996423f,
 -3.827497f, 9.838468f, -0.907683f,
 -2.660157f, 10.174791f, -0.017642f,
 -2.660157f, 10.174791f, -0.017642f,
 -1.836201f, 8.570334f, 0.041311f,
 -2.224280f, 8.465345f, 1.044548f,
 -1.836201f, 8.570334f, 0.041311f,
 -2.779359f, 8.840777f, 1.110441f,
 -3.897381f, 8.543082f, -0.219170f,
 -2.822248f, 8.593629f, 1.722614f,
 -2.990171f, 9.243607f, 1.973260f,
 -3.897381f, 8.543082f, -0.219170f,
 -3.897381f, 8.543082f, -0.219170f,
 -2.990171f, 9.243607f, 1.973260f,
 -3.827497f, 9.838468f, -0.907683f,
 -2.990171f, 9.243607f, 1.973260f,
 -2.958659f, 9.425192f, 1.523481f,
 -3.827497f, 9.838468f, -0.907683f,
 -3.827497f, 9.838468f, -0.907683f,
 -2.958659f, 9.425192f, 1.523481f,
 -2.002458f, 9.862597f, -0.677045f,
 -2.002458f, 9.862597f, -0.677045f,
 -2.958659f, 9.425192f, 1.523481f,
 -1.836201f, 8.570334f, 0.041311f,
 -1.836201f, 8.570334f, 0.041311f,
 -2.958659f, 9.425192f, 1.523481f,
 -2.779359f, 8.840777f, 1.110441f,
 -0.781338f, 8.550702f, 2.376266f,
 -1.040788f, 9.554965f, 2.763530f,
 -2.822248f, 8.593629f, 1.722614f,
 -2.822248f, 8.593629f, 1.722614f,
 -1.040788f, 9.554965f, 2.763530f,
 -2.990171f, 9.243607f, 1.973260f,
 0.544938f, 8.836796f, 2.584686f,
 0.638107f, 9.373684f, 1.254836f,
 -0.781338f, 8.550702f, 2.376266f,
 -0.781338f, 8.550702f, 2.376266f,
 0.638107f, 9.373684f, 1.254836f,
 -0.688169f, 9.087590f, 1.046416f,
 -1.040788f, 9.554965f, 2.763530f,
 0.285487f, 9.841058f, 2.971950f,
 -0.781338f, 8.550702f, 2.376266f,
 -0.781338f, 8.550702f, 2.376266f,
 0.285487f, 9.841058f, 2.971950f,
 0.544938f, 8.836796f, 2.584686f,
 -0.963805f, 9.998581f, 1.664711f,
 0.362470f, 10.284674f, 1.873131f,
 -1.040788f, 9.554965f, 2.763530f,
 -1.040788f, 9.554965f, 2.763530f,
 0.362470f, 10.284674f, 1.873131f,
 0.285487f, 9.841058f, 2.971950f,
 0.638107f, 9.373684f, 1.254836f,
 0.362470f, 10.284674f, 1.873131f,
 -0.688169f, 9.087590f, 1.046416f,
 -0.688169f, 9.087590f, 1.046416f,
 0.362470f, 10.284674f, 1.873131f,
 -0.963805f, 9.998581f, 1.664711f,
 -0.053644f, 10.448458f, -2.976095f,
 0.078843f, 9.586023f, -3.075205f,
 -2.301160f, 9.837316f, -2.996423f,
 -2.301160f, 9.837316f, -2.996423f,
 0.078843f, 9.586023f, -3.075205f,
 -3.480362f, 7.840855f, -3.551715f,};

static float[] TextArray = new float[]{
 0.765412f, 0.681378f,
 0.765412f, 0.570335f,
 0.825201f, 0.681378f,
 0.822879f, 0.570299f,
 0.542473f, 0.970289f,
 0.447291f, 0.970289f,
 0.542473f, 0.916457f,
 0.449024f, 0.913521f,
 0.542473f, 0.838197f,
 0.493899f, 0.841133f,
 0.674193f, 0.626883f,
 0.674193f, 0.681378f,
 0.847778f, 0.681378f,
 0.850454f, 0.639527f,
 0.661488f, 0.501265f,
 0.661486f, 0.569087f,
 0.322042f, 0.569516f,
 0.320395f, 0.473878f,
 0.600243f, 0.473879f,
 0.599213f, 0.569510f,
 0.408358f, 0.569764f,
 0.396173f, 0.513666f,
 0.524463f, 0.513667f,
 0.513269f, 0.569764f,
 0.324047f, 0.138784f,
 0.268283f, 0.138970f,
 0.281315f, 0.363513f,
 0.243753f, 0.367658f,
 0.300356f, 0.022362f,
 0.244979f, 0.022659f,
 0.298407f, 0.283420f,
 0.228262f, 0.289756f,
 0.700544f, 0.421993f,
 0.700544f, 0.369959f,
 0.743172f, 0.375421f,
 0.743172f, 0.414980f,
 0.711360f, 0.038998f,
 0.809816f, 0.508397f,
 0.545151f, 0.038998f,
 0.836660f, 0.547841f,
 0.711360f, 0.146332f,
 0.662490f, 0.146332f,
 0.545151f, 0.146332f,
 0.605984f, 0.146332f,
 0.711360f, 0.247785f,
 0.662490f, 0.247785f,
 0.545151f, 0.247785f,
 0.605984f, 0.247785f,
 0.123410f, 0.926820f,
 0.064457f, 0.926366f,
 0.124920f, 0.870927f,
 0.064167f, 0.871384f,
 0.985361f, 0.221742f,
 0.840209f, 0.221742f,
 0.840209f, 0.075484f,
 0.985361f, 0.013481f,
 0.765412f, 0.792421f,
 0.822878f, 0.792457f,
 0.396173f, 0.624501f,
 0.524462f, 0.624500f,
 0.637654f, 0.970289f,
 0.635921f, 0.913521f,
 0.602870f, 0.274197f,
 0.602871f, 0.326231f,
 0.645499f, 0.320769f,
 0.645499f, 0.281210f,
 0.591046f, 0.841133f,
 0.674644f, 0.793372f,
 0.850454f, 0.723230f,
 0.925844f, 0.723230f,
 0.320395f, 0.664289f,
 0.600238f, 0.664291f,
 0.208399f, 0.140511f,
 0.152635f, 0.140325f,
 0.124023f, 0.367959f,
 0.161585f, 0.372104f,
 0.231702f, 0.024200f,
 0.176325f, 0.023903f,
 0.106931f, 0.287866f,
 0.177076f, 0.294203f,
 0.015226f, 0.586251f,
 0.809815f, 0.854360f,
 0.920318f, 0.814883f,
 0.836659f, 0.814916f,
 0.015226f, 0.680055f,
 0.069400f, 0.680055f,
 0.186740f, 0.680055f,
 0.130233f, 0.680055f,
 0.015226f, 0.795038f,
 0.069400f, 0.795038f,
 0.186740f, 0.795038f,
 0.130233f, 0.795038f,
 0.249217f, 0.874910f,
 0.249424f, 0.933539f,
 0.301860f, 0.930908f,
 0.302065f, 0.877358f,
 0.840209f, 0.368000f,
 0.985361f, 0.419507f,
 0.912785f, 0.044483f,
 0.912785f, 0.221742f,
 0.912785f, 0.393753f,
 0.789643f, 0.108579f,
 0.789643f, 0.221742f,
 0.789643f, 0.334905f,
 0.330550f, 0.836015f,
 0.330550f, 0.836015f,
 0.410299f, 0.793373f,
 0.962340f, 0.570236f,
 0.962340f, 0.570236f,
 0.925844f, 0.639527f,
 0.962340f, 0.570236f,
 0.963051f, 0.681379f,
 0.925844f, 0.639527f,
 0.925844f, 0.639527f,
 0.963051f, 0.681379f,
 0.925844f, 0.681379f,
 0.259150f, 0.569083f,
 0.259150f, 0.501261f,
 0.259150f, 0.501261f,
 0.519240f, 0.376645f,
 0.540277f, 0.437890f,
 0.401404f, 0.376641f,
 0.401404f, 0.376641f,
 0.540277f, 0.437890f,
 0.380364f, 0.437885f,
 0.540277f, 0.437890f,
 0.380364f, 0.437885f,
 0.380364f, 0.437885f,
 0.320813f, 0.222669f,
 0.293252f, 0.222819f,
 0.293252f, 0.222819f,
 0.366655f, 0.447487f,
 0.268827f, 0.448535f,
 0.327717f, 0.363533f,
 0.327717f, 0.363533f,
 0.268827f, 0.448535f,
 0.220727f, 0.454545f,
 0.268827f, 0.448535f,
 0.268827f, 0.448535f,
 0.320813f, 0.222669f,
 0.397838f, 0.222717f,
 0.397838f, 0.222717f,
 0.388431f, 0.138763f,
 0.327717f, 0.363533f,
 0.327717f, 0.363533f,
 0.381748f, 0.247125f,
 0.388431f, 0.138763f,
 0.368537f, 0.059658f,
 0.368537f, 0.059658f,
 0.556600f, 0.365850f,
 0.556599f, 0.423421f,
 0.556599f, 0.423421f,
 0.381748f, 0.247125f,
 0.208711f, 0.247418f,
 0.208711f, 0.247418f,
 0.259954f, 0.282383f,
 0.776267f, 0.365854f,
 0.776267f, 0.423423f,
 0.776267f, 0.423423f,
 0.459565f, 0.022649f,
 0.368537f, 0.059658f,
 0.368537f, 0.059658f,
 0.459565f, 0.022649f,
 0.408321f, 0.057613f,
 0.832137f, 0.414748f,
 0.819577f, 0.371917f,
 0.788493f, 0.530101f,
 0.819577f, 0.371917f,
 0.962340f, 0.570236f,
 0.920320f, 0.547872f,
 0.964229f, 0.507208f,
 0.964229f, 0.507208f,
 0.920320f, 0.547872f,
 0.925476f, 0.499804f,
 0.962340f, 0.570236f,
 0.962340f, 0.570236f,
 0.920320f, 0.547872f,
 0.788493f, 0.530101f,
 0.662490f, 0.038998f,
 0.490977f, 0.038998f,
 0.490977f, 0.038998f,
 0.490977f, 0.146332f,
 0.605984f, 0.038998f,
 0.662490f, 0.038998f,
 0.605984f, 0.038998f,
 0.605984f, 0.038998f,
 0.490977f, 0.146332f,
 0.490977f, 0.146332f,
 0.490977f, 0.247785f,
 0.064893f, 0.975472f,
 0.123410f, 0.975472f,
 0.123410f, 0.975472f,
 0.171616f, 0.872795f,
 0.171617f, 0.919755f,
 0.171617f, 0.919755f,
 0.063685f, 0.822293f,
 0.127460f, 0.821833f,
 0.127460f, 0.821833f,
 0.011377f, 0.873096f,
 0.009284f, 0.925250f,
 0.009284f, 0.925250f,
 0.739076f, 0.221742f,
 0.739076f, 0.141674f,
 0.739076f, 0.141674f,
 0.754394f, 0.836011f,
 0.674193f, 0.735873f,
 0.674193f, 0.735873f,
 0.962341f, 0.792524f,
 0.962341f, 0.792524f,
 0.963051f, 0.681379f,
 0.963051f, 0.681379f,
 0.925844f, 0.681379f,
 0.259150f, 0.569083f,
 0.259150f, 0.636906f,
 0.259150f, 0.636906f,
 0.380361f, 0.700279f,
 0.540274f, 0.700278f,
 0.401400f, 0.761524f,
 0.401400f, 0.761524f,
 0.540274f, 0.700278f,
 0.519237f, 0.761523f,
 0.661484f, 0.636909f,
 0.661484f, 0.636909f,
 0.380361f, 0.700279f,
 0.380361f, 0.700279f,
 0.540274f, 0.700278f,
 0.155870f, 0.224211f,
 0.183430f, 0.224360f,
 0.183430f, 0.224360f,
 0.038682f, 0.451933f,
 0.077621f, 0.367980f,
 0.136511f, 0.452982f,
 0.136511f, 0.452982f,
 0.077621f, 0.367980f,
 0.136511f, 0.452982f,
 0.136511f, 0.452982f,
 0.184610f, 0.458992f,
 0.088251f, 0.140305f,
 0.078844f, 0.224258f,
 0.078844f, 0.224258f,
 0.155870f, 0.224211f,
 0.023590f, 0.251572f,
 0.077621f, 0.367980f,
 0.077621f, 0.367980f,
 0.088251f, 0.140305f,
 0.108145f, 0.061199f,
 0.108145f, 0.061199f,
 0.458925f, 0.272771f,
 0.458925f, 0.272771f,
 0.458927f, 0.330342f,
 0.023590f, 0.251572f,
 0.196627f, 0.251865f,};

static float[] TextArrayB = new float[]{
 0.106931f, 0.287866f,
 0.196627f, 0.251865f,
 0.145383f, 0.286830f,
 0.678594f, 0.330337f,
 0.645499f, 0.320769f,
 0.678594f, 0.272767f,
 0.678594f, 0.272767f,
 0.645499f, 0.320769f,
 0.645499f, 0.281210f,
 0.068361f, 0.059155f,
 0.017117f, 0.024190f,
 0.108145f, 0.061199f,
 0.108145f, 0.061199f,
 0.017117f, 0.024190f,
 0.176325f, 0.023903f,
 0.819562f, 0.990842f,
 0.788493f, 0.832655f,
 0.832127f, 0.948011f,
 0.788493f, 0.832655f,
 0.809815f, 0.854360f,
 0.832127f, 0.948011f,
 0.925462f, 0.862950f,
 0.920318f, 0.814883f,
 0.964216f, 0.855555f,
 0.964216f, 0.855555f,
 0.920318f, 0.814883f,
 0.962341f, 0.792524f,
 0.962341f, 0.792524f,
 0.920318f, 0.814883f,
 0.822878f, 0.792457f,
 0.822878f, 0.792457f,
 0.809815f, 0.854360f,
 0.788493f, 0.832655f,
 0.069400f, 0.586251f,
 0.069400f, 0.680055f,
 0.015226f, 0.586251f,
 0.235609f, 0.680055f,
 0.186740f, 0.680055f,
 0.235609f, 0.586251f,
 0.235609f, 0.586251f,
 0.186740f, 0.680055f,
 0.186739f, 0.586251f,
 0.186740f, 0.680055f,
 0.130233f, 0.680055f,
 0.186739f, 0.586251f,
 0.186739f, 0.586251f,
 0.130233f, 0.680055f,
 0.130233f, 0.586251f,
 0.130233f, 0.586251f,
 0.130233f, 0.680055f,
 0.069400f, 0.586251f,
 0.069400f, 0.586251f,
 0.130233f, 0.680055f,
 0.069400f, 0.680055f,
 0.235609f, 0.795038f,
 0.186740f, 0.795038f,
 0.235609f, 0.680055f,
 0.235609f, 0.680055f,
 0.186740f, 0.795038f,
 0.186740f, 0.680055f,
 0.249424f, 0.933539f,
 0.249217f, 0.874910f,
 0.200327f, 0.935933f,
 0.200327f, 0.935933f,
 0.249217f, 0.874910f,
 0.201459f, 0.877993f,
 0.302124f, 0.983361f,
 0.301860f, 0.930908f,
 0.249642f, 0.985999f,
 0.249642f, 0.985999f,
 0.301860f, 0.930908f,
 0.249424f, 0.933539f,
 0.353274f, 0.877965f,
 0.302065f, 0.877358f,
 0.352586f, 0.930336f,
 0.352586f, 0.930336f,
 0.302065f, 0.877358f,
 0.301860f, 0.930908f,
 0.249217f, 0.874910f,
 0.302065f, 0.877358f,
 0.250990f, 0.823806f,
 0.250990f, 0.823806f,
 0.302065f, 0.877358f,
 0.302280f, 0.822266f,
 0.739076f, 0.221742f,
 0.789643f, 0.221742f,
 0.739076f, 0.301810f,
 0.739076f, 0.301810f,
 0.789643f, 0.221742f,
 0.789643f, 0.334905f,};

static float[][] NormArray = new float[][]{
{ 0.301213f, -0.189805f, 0.934476f},
{ 0.061387f, 0.387746f, 0.919720f},
{ 0.127255f, -0.022234f, 0.991621f},
{ -0.081833f, 0.551365f, 0.830241f},
{ 0.231162f, 0.963879f, 0.132291f},
{ 0.231162f, 0.963879f, 0.132291f},
{ 0.231162f, 0.963879f, 0.132291f},
{ 0.231162f, 0.963879f, 0.132291f},
{ 0.071857f, 0.093829f, -0.992992f},
{ 0.006608f, -0.073513f, -0.997272f},
{ 0.006930f, 0.032016f, -0.999463f},
{ -0.022038f, -0.129199f, -0.991374f},
{ 0.000000f, -0.946364f, 0.323104f},
{ 0.000000f, -0.960351f, 0.278793f},
{ 0.000000f, 0.736146f, 0.676823f},
{ 0.000000f, 0.736147f, 0.676822f},
{ -0.010270f, -0.235713f, -0.971769f},
{ 0.028257f, -0.211153f, -0.977044f},
{ 0.963291f, -0.258333f, 0.073036f},
{ 0.942635f, -0.307780f, 0.129266f},
{ 0.985115f, -0.121288f, 0.121812f},
{ 0.978377f, -0.100251f, 0.180911f},
{ 0.090182f, -0.159889f, 0.983007f},
{ -0.016602f, -0.162338f, 0.986596f},
{ -0.041488f, 0.962472f, 0.268189f},
{ 0.096031f, 0.892310f, 0.441091f},
{ 0.239775f, 0.969725f, 0.046269f},
{ 0.208796f, 0.974396f, 0.083412f},
{ 0.210020f, 0.976131f, 0.055311f},
{ 0.309922f, 0.941844f, 0.129919f},
{ 0.060938f, 0.882255f, -0.466812f},
{ 0.126057f, 0.841289f, -0.525684f},
{ 0.074163f, 0.874633f, -0.479080f},
{ 0.296311f, 0.690358f, -0.660004f},
{ 0.260553f, -0.334639f, 0.905610f},
{ 0.341001f, -0.262645f, 0.902627f},
{ 0.329703f, -0.143821f, 0.933066f},
{ 0.374084f, -0.147399f, 0.915606f},
{ 0.946481f, -0.320735f, -0.036085f},
{ 0.946481f, -0.320735f, -0.036085f},
{ 0.946481f, -0.320735f, -0.036085f},
{ 0.946481f, -0.320735f, -0.036085f},
{ 0.356262f, -0.056906f, -0.932652f},
{ 0.394741f, 0.107834f, -0.912442f},
{ 0.409240f, -0.009569f, -0.912377f},
{ 0.431210f, 0.103151f, -0.896336f},
{ 0.329850f, -0.043011f, 0.943053f},
{ 0.259098f, 0.004906f, 0.965838f},
{ 0.959145f, 0.279275f, 0.045248f},
{ 0.959145f, 0.279275f, 0.045248f},
{ 0.959145f, 0.279275f, 0.045248f},
{ 0.959145f, 0.279275f, 0.045248f},
{ 0.389092f, 0.209937f, -0.896958f},
{ 0.320928f, 0.262881f, -0.909889f},
{ 0.052551f, -0.539293f, -0.840477f},
{ 0.038118f, -0.538001f, -0.842082f},
{ 0.005173f, -0.534628f, -0.845071f},
{ -0.033112f, -0.529967f, -0.847372f},
{ 0.943104f, 0.319500f, 0.092056f},
{ 0.944537f, 0.311318f, 0.104550f},
{ 0.036035f, -0.358074f, 0.932997f},
{ 0.027911f, -0.559329f, 0.828475f},
{ -0.898017f, -0.395885f, 0.191939f},
{ -0.975843f, -0.207466f, 0.068479f},
{ -0.915242f, -0.379357f, 0.135724f},
{ -0.986348f, -0.161751f, -0.030888f},
{ -0.037087f, 0.679398f, -0.732832f},
{ -0.022593f, 0.676489f, -0.736106f},
{ -0.003961f, 0.672524f, -0.740065f},
{ 0.000000f, 0.671648f, -0.740870f},
{ 0.993153f, 0.109312f, -0.041205f},
{ 0.997799f, 0.056539f, -0.034653f},
{ 0.005885f, -0.813895f, 0.580982f},
{ 0.000000f, -0.811925f, 0.583762f},
{ -0.997130f, 0.072410f, -0.022090f},
{ -0.999130f, 0.035568f, -0.021782f},
{ 0.000000f, -0.999997f, 0.002282f},
{ 0.000000f, -0.999997f, 0.002282f},
{ 0.997819f, 0.017446f, 0.063662f},
{ 0.862197f, 0.423114f, 0.278551f},
{ 0.000000f, 0.997611f, 0.069077f},
{ 0.000000f, 0.997611f, 0.069078f},
{ 0.000000f, 0.997611f, 0.069077f},
{ 0.000000f, 0.997611f, 0.069079f},
{ -0.998095f, 0.044185f, 0.043053f},
{ -0.867985f, 0.428427f, 0.251102f},
{ -0.186390f, -0.893859f, 0.407768f},
{ 0.125506f, -0.957365f, 0.260192f},
{ 0.216504f, -0.957675f, 0.189697f},
{ 0.592483f, -0.794977f, 0.130289f},
{ 0.934889f, -0.177133f, -0.307582f},
{ 0.898794f, -0.405739f, -0.165967f},
{ 0.933153f, -0.224619f, -0.280663f},
{ 0.876665f, -0.464908f, -0.123771f},
{ 0.245849f, 0.968721f, -0.033743f},
{ 0.098345f, 0.991913f, -0.080231f},
{ 0.019501f, -0.094535f, 0.995330f},
{ 0.365176f, -0.011006f, 0.930874f},
{ 0.810591f, 0.123993f, 0.572336f},
{ 0.900338f, 0.160698f, 0.404434f},
{ -0.367644f, -0.924082f, 0.104454f},
{ -0.215727f, -0.972503f, -0.087750f},
{ 0.902981f, 0.239345f, 0.356847f},
{ 0.605000f, -0.072888f, 0.792883f},
{ 0.900122f, 0.219144f, 0.376504f},
{ 0.449233f, -0.190346f, 0.872902f},
{ 0.424667f, 0.900702f, -0.091620f},
{ 0.614949f, 0.786136f, 0.061870f},
{ -0.993335f, -0.048635f, -0.104502f},
{ -0.675529f, 0.324198f, -0.662236f},
{ -0.994344f, -0.013232f, -0.105383f},
{ -0.378835f, 0.392389f, -0.838162f},
{ -0.104691f, -0.990267f, -0.091717f},
{ -0.104691f, -0.990267f, -0.091717f},
{ 0.243116f, -0.146627f, 0.958851f},
{ 0.243116f, -0.146627f, 0.958851f},
{ 0.288702f, 0.953686f, 0.084464f},
{ 0.288702f, 0.953686f, 0.084464f},
{ 0.288702f, 0.953686f, 0.084464f},
{ 0.288702f, 0.953686f, 0.084464f},
{ 0.135264f, 0.279939f, -0.950441f},
{ 0.133977f, 0.278196f, -0.951135f},
{ 0.256404f, 0.962737f, 0.085986f},
{ 0.256404f, 0.962737f, 0.085986f},
{ 0.256404f, 0.962737f, 0.085986f},
{ 0.256404f, 0.962737f, 0.085986f},
{ -0.020474f, 0.094350f, -0.995329f},
{ -0.020474f, 0.094350f, -0.995329f},
{ -0.020474f, 0.094350f, -0.995329f},
{ -0.020474f, 0.094350f, -0.995329f},
{ -0.256404f, -0.962738f, -0.085986f},
{ -0.256404f, -0.962738f, -0.085986f},
{ -0.256404f, -0.962738f, -0.085986f},
{ -0.256404f, -0.962738f, -0.085986f},
{ -0.036438f, -0.303847f, 0.952024f},
{ -0.036438f, -0.303847f, 0.952024f},
{ -0.036438f, -0.303847f, 0.952024f},
{ -0.036439f, -0.303848f, 0.952024f},
{ 0.970269f, -0.238262f, -0.042544f},
{ 0.970269f, -0.238262f, -0.042544f},
{ 0.970269f, -0.238262f, -0.042544f},
{ 0.970269f, -0.238262f, -0.042544f},
{ 0.072622f, 0.124870f, -0.989512f},
{ 0.017662f, 0.294274f, -0.955558f},
{ 0.021622f, 0.246065f, -0.969012f},
{ 0.062728f, 0.121982f, -0.990548f},
{ 0.065849f, 0.042671f, -0.996917f},
{ 0.055363f, -0.005491f, -0.998451f},
{ 0.070642f, 0.060005f, -0.995695f},
{ 0.087284f, 0.047329f, -0.995059f},
{ -0.109462f, -0.168028f, 0.979686f},
{ -0.117827f, 0.490458f, 0.863463f},
{ -0.119235f, 0.009807f, 0.992818f},
{ -0.230174f, 0.551911f, 0.801508f},
{ -0.230716f, 0.964460f, 0.128789f},
{ -0.230718f, 0.964460f, 0.128789f},
{ -0.230723f, 0.964458f, 0.128791f},
{ -0.230727f, 0.964457f, 0.128793f},
{ 0.012448f, -0.012519f, -0.999844f},
{ -0.212074f, -0.195079f, -0.957585f},
{ -0.172603f, -0.223817f, -0.959226f},
{ -0.286029f, -0.279012f, -0.916700f},
{ 0.000000f, -0.946364f, 0.323103f},
{ 0.000000f, 0.736147f, 0.676822f},
{ 0.000000f, -0.960351f, 0.278792f},
{ 0.000000f, 0.736147f, 0.676822f},
{ -0.386367f, -0.209522f, -0.898232f},
{ -0.311806f, -0.239131f, -0.919561f},
{ -0.969016f, -0.064490f, 0.238432f},
{ -0.961737f, -0.212842f, 0.172511f},
{ -0.845207f, -0.416454f, 0.334949f},
{ -0.807272f, -0.557885f, 0.192551f},
{ -0.018103f, -0.027467f, 0.999459f},
{ 0.016561f, 0.302111f, 0.953129f},
{ -0.063892f, 0.926374f, 0.371146f},
{ -0.133371f, 0.902716f, 0.409044f},
{ -0.233532f, 0.963797f, 0.128677f},
{ -0.497933f, 0.861114f, -0.102688f},
{ -0.437861f, 0.898380f, 0.034503f},
{ -0.460413f, 0.874153f, -0.154523f},
{ -0.202783f, 0.766039f, -0.609970f},
{ -0.207330f, 0.761971f, -0.613527f},
{ -0.219465f, 0.750878f, -0.622911f},
{ -0.275026f, 0.695576f, -0.663728f},
{ -0.278401f, -0.329717f, 0.902097f},
{ -0.350229f, -0.133346f, 0.927124f},
{ -0.357535f, -0.256208f, 0.898068f},
{ -0.388604f, -0.133939f, 0.911618f},
{ -0.951630f, -0.303401f, -0.048456f},
{ -0.951630f, -0.303401f, -0.048456f},
{ -0.951630f, -0.303401f, -0.048456f},
{ -0.951630f, -0.303401f, -0.048456f},
{ -0.417505f, 0.118893f, -0.900863f},
{ -0.386761f, 0.119128f, -0.914453f},
{ -0.397474f, -0.002152f, -0.917611f},
{ -0.345057f, -0.050501f, -0.937222f},
{ -0.289448f, 0.009877f, 0.957143f},
{ -0.350080f, -0.027381f, 0.936319f},
{ -0.942082f, 0.333243f, 0.037831f},
{ -0.942085f, 0.333234f, 0.037819f},
{ -0.942084f, 0.333238f, 0.037824f},
{ -0.942088f, 0.333227f, 0.037811f},
{ -0.381568f, 0.226282f, -0.896215f},
{ -0.324700f, 0.266825f, -0.907400f},
{ 0.469214f, -0.865788f, -0.173922f},
{ 0.188807f, -0.970656f, -0.148928f},
{ 0.426264f, -0.888306f, -0.170912f},
{ 0.071995f, -0.988199f, -0.135200f},
{ -0.973973f, 0.172944f, -0.146515f},
{ -0.980847f, 0.092557f, -0.171385f},
{ -0.147163f, 0.453949f, 0.878791f},
{ -0.020726f, 0.471778f, 0.881474f},
{ 0.988639f, 0.065913f, 0.135090f},
{ 0.982729f, -0.175362f, 0.059100f},
{ 0.742738f, -0.668911f, -0.029990f},
{ 0.731726f, -0.679196f, -0.057177f},
{ 0.129145f, 0.146388f, -0.980761f},
{ 0.016886f, 0.109183f, -0.993878f},
{ 0.073042f, 0.127978f, -0.989084f},
{ 0.000000f, 0.103460f, -0.994634f},
{ -0.997791f, 0.056645f, -0.034718f},
{ -0.999652f, 0.023001f, -0.012876f},
{ -0.023313f, 0.115711f, 0.993009f},
{ 0.000000f, 0.107470f, 0.994208f},
{ 0.998016f, 0.061760f, -0.012274f},
{ 0.995316f, 0.082430f, -0.050503f},
{ 0.000000f, -0.999997f, 0.002282f},
{ 0.000000f, -0.999997f, 0.002282f},
{ -0.997819f, 0.017446f, 0.063662f},
{ -0.862197f, 0.423113f, 0.278551f},
{ 0.000000f, 0.997611f, 0.069077f},
{ 0.000000f, 0.997611f, 0.069077f},
{ 0.000000f, 0.997611f, 0.069078f},
{ 0.000000f, 0.997611f, 0.069079f},
{ 0.867985f, 0.428427f, 0.251102f},
{ 0.998095f, 0.044185f, 0.043053f},
{ -0.136812f, -0.983222f, 0.120651f},
{ -0.472266f, -0.659630f, 0.584682f},
{ -0.117020f, -0.979804f, 0.162141f},
{ -0.115925f, 0.485490f, 0.866522f},
{ -0.869635f, -0.194311f, -0.453849f},
{ -0.850312f, -0.142036f, -0.506750f},
{ -0.822171f, -0.081444f, -0.563384f},
{ -0.806323f, -0.051959f, -0.589188f},
{ -0.131883f, 0.990588f, 0.036627f},
{ -0.056147f, 0.936437f, 0.346314f},
{ -0.736790f, -0.398444f, -0.546244f},
{ -0.803178f, -0.427703f, -0.414698f},
{ -0.782349f, -0.418712f, -0.461097f},
{ -0.823029f, -0.436035f, -0.364000f},
{ 0.179070f, -0.980123f, -0.085397f},
{ 0.165761f, -0.918431f, -0.359177f},
{ -0.571513f, -0.419592f, 0.705205f},
{ -0.684288f, -0.274415f, 0.675609f},
{ -0.927259f, 0.188676f, 0.323407f},
{ -0.924609f, 0.216472f, 0.313429f},
{ -0.456871f, 0.835500f, 0.305302f},
{ -0.174426f, 0.958553f, 0.225281f},
{ 0.833108f, 0.346736f, 0.430935f},
{ 0.562411f, 0.721467f, -0.403953f},
{ 0.834270f, 0.331302f, 0.440717f},
{ 0.453149f, 0.595761f, -0.663117f},
{ 0.097970f, -0.925185f, -0.366653f},
{ 0.097970f, -0.925185f, -0.366653f},
{ -0.286217f, -0.408221f, 0.866854f},
{ -0.286217f, -0.408221f, 0.866854f},
{ -0.281872f, 0.896376f, 0.342138f},
{ -0.281872f, 0.896376f, 0.342138f},
{ -0.281871f, 0.896376f, 0.342138f},
{ -0.281871f, 0.896376f, 0.342138f},
{ -0.090838f, 0.542302f, -0.835259f},
{ -0.089422f, 0.540663f, -0.836473f},
{ -0.249576f, 0.903882f, 0.347431f},
{ -0.249576f, 0.903883f, 0.347431f},
{ -0.249576f, 0.903883f, 0.347431f},
{ -0.249576f, 0.903883f, 0.347431f},
{ 0.064828f, 0.373575f, -0.925332f},
{ 0.064828f, 0.373575f, -0.925332f},
{ 0.064828f, 0.373575f, -0.925332f},
{ 0.064829f, 0.373575f, -0.925332f},
{ 0.249576f, -0.903883f, -0.347431f},
{ 0.249576f, -0.903883f, -0.347431f},
{ 0.249576f, -0.903883f, -0.347431f},
{ 0.249576f, -0.903883f, -0.347431f},
{ -0.008331f, -0.563283f, 0.826222f},
{ -0.008331f, -0.563283f, 0.826222f},
{ -0.008331f, -0.563283f, 0.826222f},
{ -0.008331f, -0.563283f, 0.826222f},
{ -0.969992f, -0.194164f, -0.146345f},
{ -0.969992f, -0.194164f, -0.146345f},
{ -0.969992f, -0.194164f, -0.146345f},
{ -0.969991f, -0.194164f, -0.146345f},
{ -0.021177f, 0.110931f, -0.993603f},
{ -0.007137f, 0.242457f, -0.970136f},
{ -0.004253f, 0.262253f, -0.964990f},
{ -0.024591f, 0.086123f, -0.995981f},
{ -0.042070f, 0.062283f, -0.997171f},
{ -0.178574f, 0.017671f, -0.983768f},
{ -0.136638f, -0.175475f, -0.974956f},
{ -0.223473f, 0.004491f, -0.974700f},
{ 0.083615f, 0.120685f, -0.989163f},
{ 0.128415f, 0.039965f, -0.990915f},
{ -0.233518f, 0.123393f, -0.964491f},
{ -0.263832f, 0.068756f, -0.962115f}};

static int[] FaceArray = new int[]{
1, 3, 0,
0, 3, 2,
21, 22, 20,
20, 22, 23,
5, 7, 4,
4, 7, 6,
32, 33, 35,
35, 33, 34,
7, 9, 6,
6, 9, 8,
7, 104, 9,
9, 105, 106,
1, 0, 10,
10, 0, 11,
3, 13, 2,
2, 13, 12,
3, 107, 13,
13, 108, 109,
110, 111, 112,
113, 114, 115,
116, 117, 16,
16, 118, 17,
119, 120, 121,
122, 123, 124,
15, 19, 14,
14, 19, 18,
17, 21, 16,
16, 21, 20,
125, 22, 126,
127, 22, 21,
18, 19, 22,
22, 19, 23,
128, 129, 24,
24, 130, 25,
131, 132, 133,
134, 135, 26,
136, 27, 137,
138, 27, 26,
139, 24, 140,
141, 24, 142,
24, 25, 28,
28, 25, 29,
26, 30, 143,
144, 30, 145,
27, 31, 26,
26, 31, 30,
146, 24, 147,
148, 24, 28,
149, 33, 150,
151, 33, 32,
152, 30, 153,
154, 30, 155,
156, 157, 34,
34, 158, 35,
28, 159, 160,
161, 162, 163,
164, 37, 165,
166, 167, 37,
168, 169, 170,
171, 172, 173,
3, 39, 174,
175, 39, 176,
177, 37, 3,
3, 37, 39,
178, 36, 41,
41, 36, 40,
38, 42, 179,
180, 42, 181,
182, 43, 38,
38, 43, 42,
183, 41, 184,
185, 41, 43,
41, 40, 45,
45, 40, 44,
42, 46, 186,
187, 46, 188,
43, 47, 42,
42, 47, 46,
43, 41, 47,
47, 41, 45,
189, 49, 190,
191, 49, 48,
192, 193, 50,
50, 194, 48,
195, 196, 51,
51, 197, 50,
198, 51, 199,
200, 51, 49,
49, 51, 48,
48, 51, 50,
201, 202, 102,
102, 203, 101,
53, 54, 99,
99, 54, 98,
0, 2, 56,
56, 2, 57,
23, 59, 20,
20, 59, 58,
4, 6, 60,
60, 6, 61,
62, 65, 63,
63, 65, 64,
8, 66, 6,
6, 66, 61,
66, 67, 61,
61, 67, 204,
56, 205, 0,
0, 206, 11,
12, 68, 2,
2, 68, 57,
68, 69, 57,
57, 69, 207,
208, 69, 209,
210, 69, 211,
212, 16, 213,
214, 16, 70,
215, 216, 217,
218, 219, 220,
71, 19, 221,
222, 19, 15,
20, 58, 16,
16, 58, 70,
58, 59, 223,
224, 59, 225,
71, 59, 19,
19, 59, 23,
226, 73, 227,
228, 73, 72,
229, 230, 231,
232, 233, 74,
74, 75, 234,
235, 75, 236,
237, 73, 238,
239, 73, 240,
73, 77, 72,
72, 77, 76,
241, 78, 242,
243, 78, 74,
74, 78, 75,
75, 78, 79,
244, 245, 73,
73, 246, 77,
62, 63, 247,
248, 63, 249,
250, 251, 78,
82, 83, 57,
83, 81, 57,
80, 85, 84,
85, 89, 84,
84, 89, 88,
90, 91, 86,
86, 91, 87,
87, 91, 85,
85, 91, 89,
94, 95, 93,
93, 95, 92,
53, 99, 96,
96, 99, 100,
99, 98, 52,
52, 98, 55,
99, 52, 100,
100, 52, 97,
102, 101, 53,
53, 101, 54,
102, 53, 103,
103, 53, 96, };

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
60, 61, 62,
63, 64, 65,
66, 67, 68,
69, 70, 71,
72, 73, 74,
75, 76, 77,
78, 79, 80,
81, 82, 83,
84, 85, 86,
87, 88, 89,};

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


//Vertices: 342  Texture Co-ords: 202  Normals: 304  Texture: block Faces: 196 Smooth Groups: 94 sucess: 80 Doubles: 116 Redos needed: 148 Correct: 110