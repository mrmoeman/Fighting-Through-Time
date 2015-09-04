package com.example.jgfjhg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;
import android.graphics.Bitmap;
import android.opengl.GLUtils;

class phablockd {

static String TextureName = "block";

static int Vertices = 341;

static int VertTexts = 191;

static int Normals = 106;

static int Faces = 196;

static int FacesB = 30;

static int SmoothGroups = 2;

static float VertArray[] = new float[]{
 1.272911f, 7.421901f, 0.276562f,
 0.936363f, 9.071084f, 0.659187f,
 0.791186f, 8.797078f, -0.732722f,
 0.817567f, 7.910450f, -1.088899f,
 0.562201f, 9.146067f, 0.709807f,
 0.444292f, 9.209339f, -0.743987f,
 0.371258f, 7.766071f, -1.206877f,
 0.442211f, 7.421197f, 0.279593f,
 0.033961f, 7.357553f, 0.553911f,
 0.033961f, 9.298294f, 0.806713f,
 0.033961f, 9.370788f, -0.706530f,
 0.033961f, 7.785854f, -1.292142f,
 0.033961f, 9.575209f, 0.071313f,
 0.541219f, 9.475895f, 0.048271f,
 0.936363f, 9.117025f, 0.461681f,
 0.936363f, 7.480258f, 0.025035f,
 0.429582f, 7.495232f, -0.039508f,
 0.033961f, 7.495232f, -0.039508f,
 0.445001f, 7.142276f, 0.414432f,
 0.782250f, 7.135666f, 0.442925f,
 0.432372f, 6.809976f, 0.347261f,
 0.782250f, 6.795001f, 0.411806f,
 1.200907f, 7.371630f, -1.148944f,
 0.776421f, 7.202110f, -0.107515f,
 0.033961f, 7.240047f, -0.136769f,
 0.033961f, 7.395127f, -1.250180f,
 0.700363f, 4.288538f, -0.399952f,
 0.684600f, 4.409849f, 0.286110f,
 0.033961f, 4.439834f, 0.455640f,
 0.033961f, 4.217994f, -0.798955f,
 0.971581f, 6.464147f, 0.263608f,
 0.997360f, 6.263332f, -0.872077f,
 0.033961f, 6.403212f, -1.054350f,
 0.033961f, 6.599206f, 0.481129f,
 1.813749f, -0.141349f, -0.914883f,
 1.774087f, -0.251859f, 1.453181f,
 0.041929f, -0.286815f, 1.932643f,
 0.028191f, -0.076717f, -1.616305f,
 1.370982f, 7.151954f, -0.448478f,
 0.729950f, 7.154729f, -0.132015f,
 0.671499f, 6.570849f, 0.010188f,
 1.409799f, 6.566155f, -0.359546f,
 2.046099f, 6.648149f, 1.232286f,
 1.708698f, 6.776270f, 1.227981f,
 1.561853f, 6.545872f, 1.092787f,
 1.951865f, 6.398641f, 1.095402f,
 1.966852f, 5.717905f, 2.992560f,
 1.265871f, 5.982560f, 2.987764f,
 1.005022f, 5.552965f, 2.661414f,
 1.791750f, 5.257243f, 2.663590f,
 0.043338f, 2.241350f, 1.443419f,
 1.175917f, 2.226418f, 1.308723f,
 1.200035f, 2.098017f, -0.127161f,
 0.030136f, 2.078151f, -0.500491f,
 -0.868441f, 9.117025f, 0.461681f,
 -0.868441f, 7.480258f, 0.025035f,
 -0.749646f, 7.910450f, -1.088899f,
 -0.723264f, 8.797078f, -0.732722f,
 -0.376369f, 9.209339f, -0.743987f,
 -0.473295f, 9.475895f, 0.048271f,
 -0.303336f, 7.766071f, -1.206877f,
 -0.361660f, 7.495232f, -0.039508f,
 -0.374288f, 7.421197f, 0.279594f,
 -1.204989f, 7.421901f, 0.276562f,
 -0.868441f, 9.071084f, 0.659187f,
 -0.494279f, 9.146067f, 0.709807f,
 -0.714328f, 7.135666f, 0.442925f,
 -0.377078f, 7.142276f, 0.414432f,
 -0.364450f, 6.809976f, 0.347261f,
 -0.714328f, 6.795001f, 0.411806f,
 -0.708500f, 7.202110f, -0.107515f,
 -1.132985f, 7.371630f, -1.148944f,
 -1.489683f, 6.416561f, 3.196294f,
 -2.117481f, 6.718704f, 2.920578f,
 -1.884712f, 7.214411f, 2.677288f,
 -1.179653f, 6.874441f, 2.983411f,
 -0.903658f, 6.464147f, 0.263608f,
 -0.929437f, 6.263332f, -0.872077f,
 -0.616678f, 4.409849f, 0.286110f,
 -0.632440f, 4.288538f, -0.399952f,
 -1.091143f, 2.227143f, 1.319459f,
 -1.134767f, 2.097050f, -0.109941f,
 -1.524423f, 6.794349f, -0.430844f,
 -0.922633f, 6.414506f, -0.499007f,
 -1.377356f, 7.157805f, 0.028312f,
 -0.680293f, 6.722732f, -0.053088f,
 -1.619590f, 5.877210f, 1.198109f,
 -1.317753f, 5.732265f, 1.332862f,
 -1.515406f, 6.147139f, 1.102149f,
 -1.166101f, 5.979022f, 1.255497f,
 -1.693855f, -0.254569f, 1.460416f,
 -1.752124f, -0.139576f, -0.907307f,
 1.237879f, 5.879245f, 2.159702f,
 1.446332f, 6.206305f, 2.351616f,
 1.925290f, 6.024432f, 2.357728f,
 1.791520f, 5.670244f, 2.163414f,
 -1.736058f, 6.828492f, 2.185999f,
 -1.240203f, 6.589841f, 2.403684f,
 -1.455480f, 6.239560f, 2.513507f,
 -1.883952f, 6.445316f, 2.322217f,
 4.897695f, 4.532853f, 1.908413f,
 4.934504f, 4.513434f, 2.682981f,
 -4.737711f, 7.949809f, 1.789426f,
 -4.737568f, 7.494235f, 3.918316f,
 -2.936891f, 7.137310f, 2.346023f,
 -2.900082f, 7.117892f, 3.120591f,
 0.791186f, 8.797078f, -0.732722f,
 0.791186f, 8.797078f, -0.732722f,
 0.936363f, 9.117025f, 0.461681f,
 0.817567f, 7.910450f, -1.088899f,
 0.371258f, 7.766071f, -1.206877f,
 0.791186f, 8.797078f, -0.732722f,
 0.791186f, 8.797078f, -0.732722f,
 0.371258f, 7.766071f, -1.206877f,
 0.371258f, 7.766071f, -1.206877f,
 0.033961f, 9.298294f, 0.806713f,
 0.033961f, 9.298294f, 0.806713f,
 0.562201f, 9.146067f, 0.709807f,
 0.562201f, 9.146067f, 0.709807f,
 0.936363f, 9.117025f, 0.461681f,
 0.936363f, 9.117025f, 0.461681f,
 0.562201f, 9.146067f, 0.709807f,
 0.936363f, 9.071084f, 0.659187f,
 1.272911f, 7.421901f, 0.276562f,
 0.936363f, 9.071084f, 0.659187f,
 0.936363f, 9.071084f, 0.659187f,
 0.429582f, 7.495232f, -0.039508f,
 0.442211f, 7.421197f, 0.279593f,
 0.442211f, 7.421197f, 0.279593f,
 0.033961f, 7.357553f, 0.553911f,
 0.442211f, 7.421197f, 0.279593f,
 0.445001f, 7.142276f, 0.414432f,
 0.445001f, 7.142276f, 0.414432f,
 0.432372f, 6.809976f, 0.347261f,
 0.432372f, 6.809976f, 0.347261f,
 0.432372f, 6.809976f, 0.347261f,
 0.782250f, 6.795001f, 0.411806f,
 1.272911f, 7.421901f, 0.276562f,
 0.782250f, 7.135666f, 0.442925f,
 0.782250f, 7.135666f, 0.442925f,
 0.782250f, 6.795001f, 0.411806f,
 0.429582f, 7.495232f, -0.039508f,
 0.776421f, 7.202110f, -0.107515f,
 0.371258f, 7.766071f, -1.206877f,
 0.371258f, 7.766071f, -1.206877f,
 0.776421f, 7.202110f, -0.107515f,
 1.200907f, 7.371630f, -1.148944f,
 0.033961f, 7.240047f, -0.136769f,
 0.429582f, 7.495232f, -0.039508f,
 0.429582f, 7.495232f, -0.039508f,
 0.033961f, 7.240047f, -0.136769f,
 0.776421f, 7.202110f, -0.107515f,
 0.033961f, 7.785854f, -1.292142f,
 0.371258f, 7.766071f, -1.206877f,
 0.033961f, 7.395127f, -1.250180f,
 0.033961f, 7.395127f, -1.250180f,
 0.371258f, 7.766071f, -1.206877f,
 1.200907f, 7.371630f, -1.148944f,
 0.971581f, 6.464147f, 0.263608f,
 0.684600f, 4.409849f, 0.286110f,
 0.700363f, 4.288538f, -0.399952f,
 0.684600f, 4.409849f, 0.286110f,
 0.684600f, 4.409849f, 0.286110f,
 1.175917f, 2.226418f, 1.308723f,
 0.033961f, 4.439834f, 0.455640f,
 0.684600f, 4.409849f, 0.286110f,
 0.684600f, 4.409849f, 0.286110f,
 0.033961f, 4.217994f, -0.798955f,
 0.700363f, 4.288538f, -0.399952f,
 0.700363f, 4.288538f, -0.399952f,
 1.200907f, 7.371630f, -1.148944f,
 0.776421f, 7.202110f, -0.107515f,
 0.776421f, 7.202110f, -0.107515f,
 0.776421f, 7.202110f, -0.107515f,
 0.971581f, 6.464147f, 0.263608f,
 0.971581f, 6.464147f, 0.263608f,
 0.997360f, 6.263332f, -0.872077f,
 0.971581f, 6.464147f, 0.263608f,
 0.971581f, 6.464147f, 0.263608f,
 0.671499f, 6.570849f, 0.010188f,
 1.200907f, 7.371630f, -1.148944f,
 0.997360f, 6.263332f, -0.872077f,
 0.997360f, 6.263332f, -0.872077f,
 0.671499f, 6.570849f, 0.010188f,
 1.561853f, 6.545872f, 1.092787f,
 1.561853f, 6.545872f, 1.092787f,
 1.561853f, 6.545872f, 1.092787f,
 1.237879f, 5.879245f, 2.159702f,
 1.237879f, 5.879245f, 2.159702f,
 1.175917f, 2.226418f, 1.308723f,
 1.774087f, -0.251859f, 1.453181f,
 1.774087f, -0.251859f, 1.453181f,
 -0.868441f, 9.117025f, 0.461681f,
 -0.723264f, 8.797078f, -0.732722f,
 -0.723264f, 8.797078f, -0.732722f,
 -0.749646f, 7.910450f, -1.088899f,
 -0.723264f, 8.797078f, -0.732722f,
 -0.303336f, 7.766071f, -1.206877f,
 -0.303336f, 7.766071f, -1.206877f,
 -0.723264f, 8.797078f, -0.732722f,
 -0.303336f, 7.766071f, -1.206877f,
 -0.494279f, 9.146067f, 0.709807f,
 0.033961f, 9.298294f, 0.806713f,
 0.033961f, 9.298294f, 0.806713f,
 -0.868441f, 9.071084f, 0.659187f,
 -0.494279f, 9.146067f, 0.709807f,
 -0.868441f, 9.117025f, 0.461681f,
 -0.868441f, 9.117025f, 0.461681f,
 -0.494279f, 9.146067f, 0.709807f,
 -0.868441f, 9.071084f, 0.659187f,
 -0.868441f, 9.071084f, 0.659187f,
 -1.204989f, 7.421901f, 0.276562f,
 0.033961f, 7.357553f, 0.553911f,
 -0.374288f, 7.421197f, 0.279594f,
 -0.374288f, 7.421197f, 0.279594f,
 -0.361660f, 7.495232f, -0.039508f,
 -0.374288f, 7.421197f, 0.279594f,
 -0.377078f, 7.142276f, 0.414432f,
 -0.377078f, 7.142276f, 0.414432f,
 -0.364450f, 6.809976f, 0.347261f,
 -0.364450f, 6.809976f, 0.347261f,
 -0.364450f, 6.809976f, 0.347261f,
 -0.714328f, 6.795001f, 0.411806f,
 -0.714328f, 6.795001f, 0.411806f,
 -0.714328f, 7.135666f, 0.442925f,
 -0.714328f, 7.135666f, 0.442925f,
 -1.204989f, 7.421901f, 0.276562f,
 -1.132985f, 7.371630f, -1.148944f,
 -0.708500f, 7.202110f, -0.107515f,
 -0.303336f, 7.766071f, -1.206877f,
 -0.303336f, 7.766071f, -1.206877f,
 -0.708500f, 7.202110f, -0.107515f,
 -0.361660f, 7.495232f, -0.039508f,
 -0.708500f, 7.202110f, -0.107515f,
 0.033961f, 7.240047f, -0.136769f,
 -0.361660f, 7.495232f, -0.039508f,
 -0.361660f, 7.495232f, -0.039508f,
 0.033961f, 7.240047f, -0.136769f,
 0.033961f, 7.785854f, -1.292142f,
 0.033961f, 7.395127f, -1.250180f,
 -0.303336f, 7.766071f, -1.206877f,
 -0.303336f, 7.766071f, -1.206877f,
 0.033961f, 7.395127f, -1.250180f,
 -1.132985f, 7.371630f, -1.148944f,
 -0.903658f, 6.464147f, 0.263608f,
 -0.616678f, 4.409849f, 0.286110f,
 -0.632440f, 4.288538f, -0.399952f,
 -0.616678f, 4.409849f, 0.286110f,
 -0.616678f, 4.409849f, 0.286110f,
 -1.091143f, 2.227143f, 1.319459f,
 -0.616678f, 4.409849f, 0.286110f,};

static float VertArrayB[] = new float[]{
 -0.616678f, 4.409849f, 0.286110f,
 0.043338f, 2.241350f, 1.443419f,
 0.033961f, 4.439834f, 0.455640f,
 0.033961f, 4.217994f, -0.798955f,
 0.030136f, 2.078151f, -0.500491f,
 -0.632440f, 4.288538f, -0.399952f,
 -0.632440f, 4.288538f, -0.399952f,
 0.030136f, 2.078151f, -0.500491f,
 -1.134767f, 2.097050f, -0.109941f,
 -0.708500f, 7.202110f, -0.107515f,
 -1.132985f, 7.371630f, -1.148944f,
 -1.524423f, 6.794349f, -0.430844f,
 -1.132985f, 7.371630f, -1.148944f,
 -0.922633f, 6.414506f, -0.499007f,
 -1.524423f, 6.794349f, -0.430844f,
 -1.524423f, 6.794349f, -0.430844f,
 -1.377356f, 7.157805f, 0.028312f,
 -0.708500f, 7.202110f, -0.107515f,
 -0.708500f, 7.202110f, -0.107515f,
 -1.377356f, 7.157805f, 0.028312f,
 -0.903658f, 6.464147f, 0.263608f,
 -1.377356f, 7.157805f, 0.028312f,
 -0.680293f, 6.722732f, -0.053088f,
 -0.903658f, 6.464147f, 0.263608f,
 -0.903658f, 6.464147f, 0.263608f,
 -0.680293f, 6.722732f, -0.053088f,
 -0.929437f, 6.263332f, -0.872077f,
 -1.132985f, 7.371630f, -1.148944f,
 -0.929437f, 6.263332f, -0.872077f,
 -0.922633f, 6.414506f, -0.499007f,
 -0.929437f, 6.263332f, -0.872077f,
 -0.680293f, 6.722732f, -0.053088f,
 -0.922633f, 6.414506f, -0.499007f,
 -1.619590f, 5.877210f, 1.198109f,
 -1.515406f, 6.147139f, 1.102149f,
 -1.524423f, 6.794349f, -0.430844f,
 -1.524423f, 6.794349f, -0.430844f,
 -1.515406f, 6.147139f, 1.102149f,
 -1.377356f, 7.157805f, 0.028312f,
 -1.736058f, 6.828492f, 2.185999f,
 -1.515406f, 6.147139f, 1.102149f,
 -1.883952f, 6.445316f, 2.322217f,
 -1.883952f, 6.445316f, 2.322217f,
 -1.515406f, 6.147139f, 1.102149f,
 -1.619590f, 5.877210f, 1.198109f,
 -1.752124f, -0.139576f, -0.907307f,
 -1.693855f, -0.254569f, 1.460416f,
 -1.134767f, 2.097050f, -0.109941f,
 -1.134767f, 2.097050f, -0.109941f,
 -1.693855f, -0.254569f, 1.460416f,
 -1.091143f, 2.227143f, 1.319459f,
 1.925290f, 6.024432f, 2.357728f,
 1.265871f, 5.982560f, 2.987764f,
 1.966852f, 5.717905f, 2.992560f,
 1.791520f, 5.670244f, 2.163414f,
 1.925290f, 6.024432f, 2.357728f,
 1.791750f, 5.257243f, 2.663590f,
 1.791750f, 5.257243f, 2.663590f,
 1.925290f, 6.024432f, 2.357728f,
 1.966852f, 5.717905f, 2.992560f,
 1.237879f, 5.879245f, 2.159702f,
 1.791520f, 5.670244f, 2.163414f,
 1.005022f, 5.552965f, 2.661414f,
 1.005022f, 5.552965f, 2.661414f,
 1.791520f, 5.670244f, 2.163414f,
 1.791750f, 5.257243f, 2.663590f,
 -1.240203f, 6.589841f, 2.403684f,
 -1.884712f, 7.214411f, 2.677288f,
 -1.179653f, 6.874441f, 2.983411f,
 -1.240203f, 6.589841f, 2.403684f,
 -1.179653f, 6.874441f, 2.983411f,
 -1.455480f, 6.239560f, 2.513507f,
 -1.455480f, 6.239560f, 2.513507f,
 -1.179653f, 6.874441f, 2.983411f,
 -1.489683f, 6.416561f, 3.196294f,
 -1.883952f, 6.445316f, 2.322217f,
 -1.455480f, 6.239560f, 2.513507f,
 -2.117481f, 6.718704f, 2.920578f,
 -2.117481f, 6.718704f, 2.920578f,
 -1.455480f, 6.239560f, 2.513507f,
 -1.489683f, 6.416561f, 3.196294f,
 -1.883952f, 6.445316f, 2.322217f,
 -2.117481f, 6.718704f, 2.920578f,
 -1.736058f, 6.828492f, 2.185999f,
 4.897695f, 4.532853f, 1.908413f,
 4.934504f, 4.513434f, 2.682981f,
 -2.936891f, 7.137310f, 2.346023f,
 -2.936891f, 7.137310f, 2.346023f,
 4.934504f, 4.513434f, 2.682981f,
 -2.900082f, 7.117892f, 3.120591f,};

static float[] TextArray = new float[]{
 0.531280f, 0.707589f,
 0.484323f, 0.943805f,
 0.906579f, 0.606627f,
 0.908324f, 0.508558f,
 0.432117f, 0.970430f,
 0.119964f, 0.206787f,
 0.912807f, 0.483165f,
 0.415376f, 0.707589f,
 0.358414f, 0.707589f,
 0.358414f, 0.994176f,
 0.086285f, 0.199997f,
 0.083540f, 0.350365f,
 0.085479f, 0.151978f,
 0.126438f, 0.150934f,
 0.821509f, 0.628783f,
 0.826742f, 0.493028f,
 0.848890f, 0.463714f,
 0.949638f, 0.757239f,
 0.415765f, 0.673932f,
 0.462820f, 0.673932f,
 0.414003f, 0.626649f,
 0.462820f, 0.626649f,
 0.506471f, 0.680776f,
 0.888747f, 0.982432f,
 0.804662f, 0.985869f,
 0.608704f, 0.680777f,
 0.550265f, 0.427741f,
 0.490451f, 0.415698f,
 0.804662f, 0.646870f,
 0.608704f, 0.427351f,
 0.910849f, 0.876410f,
 0.524361f, 0.604524f,
 0.608704f, 0.619762f,
 0.804662f, 0.887183f,
 0.637059f, 0.094341f,
 0.508844f, 0.103073f,
 0.340575f, 0.103073f,
 0.745360f, 0.093609f,
 0.088712f, 0.403165f,
 0.134506f, 0.403165f,
 0.177173f, 0.403165f,
 0.049042f, 0.403165f,
 0.088712f, 0.521627f,
 0.134506f, 0.521627f,
 0.177173f, 0.521627f,
 0.049042f, 0.521627f,
 0.134506f, 0.697341f,
 0.134506f, 0.642886f,
 0.177173f, 0.642886f,
 0.177173f, 0.697341f,
 0.340574f, 0.348630f,
 0.450573f, 0.348630f,
 0.673596f, 0.248044f,
 0.745360f, 0.248156f,
 0.966035f, 0.484735f,
 0.960563f, 0.348968f,
 0.880548f, 0.364100f,
 0.880965f, 0.462579f,
 0.052854f, 0.206348f,
 0.044331f, 0.151978f,
 0.878018f, 0.339363f,
 0.938475f, 0.320998f,
 0.301453f, 0.707589f,
 0.185549f, 0.707589f,
 0.232506f, 0.943805f,
 0.284711f, 0.970430f,
 0.254009f, 0.673932f,
 0.301064f, 0.673932f,
 0.302825f, 0.626649f,
 0.254009f, 0.626649f,
 0.720578f, 0.982432f,
 0.710936f, 0.680776f,
 0.007565f, 0.655407f,
 0.007565f, 0.709862f,
 0.049236f, 0.709862f,
 0.049236f, 0.655407f,
 0.698476f, 0.876410f,
 0.693047f, 0.604524f,
 0.726955f, 0.415697f,
 0.667142f, 0.427741f,
 0.230576f, 0.348630f,
 0.817124f, 0.248044f,
 0.176724f, 0.949583f,
 0.137216f, 0.949583f,
 0.049236f, 0.949583f,
 0.091983f, 0.949583f,
 0.176724f, 0.831121f,
 0.137216f, 0.831121f,
 0.049236f, 0.831121f,
 0.091983f, 0.831121f,
 0.172305f, 0.103073f,
 0.853660f, 0.094340f,
 0.177173f, 0.602466f,
 0.134506f, 0.602466f,
 0.088712f, 0.602466f,
 0.049042f, 0.602466f,
 0.049236f, 0.750282f,
 0.091983f, 0.750282f,
 0.137216f, 0.750282f,
 0.176724f, 0.750282f,
 0.493691f, 0.982654f,
 0.694605f, 0.981109f,
 0.557045f, 0.804122f,
 0.628631f, 0.805010f,
 0.158683f, 0.223498f,
 0.158683f, 0.223498f,
 0.158683f, 0.115418f,
 0.158683f, 0.338207f,
 0.110895f, 0.350972f,
 0.158683f, 0.223498f,
 0.158683f, 0.223498f,
 0.110895f, 0.350972f,
 0.110895f, 0.350972f,
 0.085479f, 0.096280f,
 0.085479f, 0.096280f,
 0.128331f, 0.096280f,
 0.128331f, 0.096280f,
 0.158683f, 0.115418f,
 0.158683f, 0.115418f,
 0.128331f, 0.096280f,
 0.158683f, 0.096281f,
 0.805700f, 0.496787f,
 0.805700f, 0.628774f,
 0.805700f, 0.628774f,
 0.949638f, 0.718017f,
 0.972326f, 0.722391f,
 0.972326f, 0.722391f,
 0.972326f, 0.753767f,
 0.846690f, 0.444907f,
 0.822498f, 0.435909f,
 0.822498f, 0.435909f,
 0.804583f, 0.447868f,
 0.804583f, 0.447868f,
 0.804583f, 0.447868f,
 0.792244f, 0.460353f,
 0.805700f, 0.496787f,
 0.788023f, 0.477981f,
 0.788023f, 0.477981f,
 0.792244f, 0.460353f,
 0.925303f, 0.838421f,
 0.933270f, 0.825273f,
 0.965643f, 0.877787f,
 0.965643f, 0.877787f,
 0.933270f, 0.825273f,
 0.986675f, 0.823739f,
 0.921005f, 0.754538f,
 0.949638f, 0.718017f,
 0.949638f, 0.718017f,
 0.921005f, 0.754538f,
 0.917794f, 0.675968f,
 0.961898f, 0.902588f,
 0.965643f, 0.877787f,
 0.990420f, 0.903796f,
 0.990420f, 0.903796f,
 0.965643f, 0.877787f,
 0.986675f, 0.823739f,
 0.425500f, 0.583551f,
 0.878348f, 0.646869f,
 0.704988f, 0.396285f,
 0.666165f, 0.412442f,
 0.666165f, 0.412442f,
 0.590716f, 0.283014f,
 0.340575f, 0.584800f,
 0.403714f, 0.584799f,
 0.403714f, 0.584799f,
 0.745360f, 0.396794f,
 0.704988f, 0.396285f,
 0.704988f, 0.396285f,
 0.088712f, 0.357626f,
 0.134506f, 0.357626f,
 0.134506f, 0.357626f,
 0.134506f, 0.357626f,
 0.177173f, 0.357626f,
 0.177173f, 0.357626f,
 0.049042f, 0.357626f,
 0.008494f, 0.357626f,
 0.008494f, 0.357626f,
 0.008494f, 0.403165f,
 0.088712f, 0.357626f,
 0.049042f, 0.357626f,
 0.049042f, 0.357626f,
 0.008494f, 0.403165f,
 0.008494f, 0.521627f,
 0.008494f, 0.521627f,
 0.008494f, 0.521627f,
 0.008494f, 0.602466f,
 0.008494f, 0.602466f,
 0.590716f, 0.283014f,
 0.501906f, 0.152852f,
 0.501906f, 0.152852f,
 0.012277f, 0.112730f,
 0.012276f, 0.217993f,
 0.012276f, 0.217993f,
 0.012276f, 0.335387f,
 0.012276f, 0.217993f,
 0.056185f, 0.349758f,
 0.056185f, 0.349758f,
 0.012276f, 0.217993f,
 0.056185f, 0.349758f,
 0.042629f, 0.096280f,
 0.085479f, 0.096280f,
 0.085479f, 0.096280f,
 0.012276f, 0.096281f,
 0.042629f, 0.096280f,
 0.012277f, 0.112730f,
 0.012277f, 0.112730f,
 0.042629f, 0.096280f,
 0.981844f, 0.484725f,
 0.981844f, 0.484725f,
 0.981844f, 0.352739f,
 0.972326f, 0.753767f,
 0.972326f, 0.785142f,
 0.972326f, 0.785142f,
 0.949638f, 0.785658f,
 0.940336f, 0.302313f,
 0.964527f, 0.293316f,
 0.964527f, 0.293316f,
 0.982102f, 0.305398f,
 0.982102f, 0.305398f,
 0.982102f, 0.305398f,
 0.994453f, 0.316738f,
 0.994453f, 0.316738f,
 0.999521f, 0.333933f,
 0.999521f, 0.333933f,
 0.981844f, 0.352739f,
 0.986755f, 0.984311f,
 0.933507f, 0.983693f,
 0.965564f, 0.931307f,
 0.965564f, 0.931307f,
 0.933507f, 0.983693f,
 0.925419f, 0.970619f,
 0.917795f, 0.833109f,
 0.921005f, 0.754538f,
 0.949638f, 0.785658f,
 0.949638f, 0.785658f,
 0.921005f, 0.754538f,
 0.961898f, 0.902588f,
 0.990420f, 0.903796f,
 0.965564f, 0.931307f,
 0.965564f, 0.931307f,
 0.990420f, 0.903796f,
 0.986755f, 0.984311f,
 0.791908f, 0.583549f,
 0.730977f, 0.646869f,
 0.785732f, 0.396285f,
 0.824556f, 0.412442f,
 0.824556f, 0.412442f,
 0.900004f, 0.283013f,
 0.277434f, 0.584799f,};

static float[] TextArrayB = new float[]{
 0.277434f, 0.584799f,
 0.340574f, 0.348630f,
 0.340575f, 0.584800f,
 0.745360f, 0.396794f,
 0.745360f, 0.248156f,
 0.785732f, 0.396285f,
 0.785732f, 0.396285f,
 0.745360f, 0.248156f,
 0.817124f, 0.248044f,
 0.176724f, 0.995122f,
 0.137216f, 0.995122f,
 0.176724f, 0.949583f,
 0.137216f, 0.995122f,
 0.137216f, 0.949583f,
 0.176724f, 0.949583f,
 0.007565f, 0.949583f,
 0.049236f, 0.949583f,
 0.007565f, 0.995122f,
 0.007565f, 0.995122f,
 0.049236f, 0.949583f,
 0.049236f, 0.995122f,
 0.049236f, 0.949583f,
 0.091983f, 0.949583f,
 0.049236f, 0.995122f,
 0.049236f, 0.995122f,
 0.091983f, 0.949583f,
 0.091983f, 0.995122f,
 0.137216f, 0.995122f,
 0.091983f, 0.995122f,
 0.137216f, 0.949583f,
 0.091983f, 0.995122f,
 0.091983f, 0.949583f,
 0.137216f, 0.949583f,
 0.007565f, 0.831121f,
 0.049236f, 0.831121f,
 0.007565f, 0.949583f,
 0.007565f, 0.949583f,
 0.049236f, 0.831121f,
 0.049236f, 0.949583f,
 0.049236f, 0.750282f,
 0.049236f, 0.831121f,
 0.007565f, 0.750282f,
 0.007565f, 0.750282f,
 0.049236f, 0.831121f,
 0.007565f, 0.831121f,
 0.853660f, 0.094340f,
 0.988813f, 0.152851f,
 0.817124f, 0.248044f,
 0.817124f, 0.248044f,
 0.988813f, 0.152851f,
 0.900004f, 0.283013f,
 0.088712f, 0.602466f,
 0.134506f, 0.642886f,
 0.088712f, 0.642886f,
 0.049042f, 0.602466f,
 0.088712f, 0.602466f,
 0.049042f, 0.642886f,
 0.049042f, 0.642886f,
 0.088712f, 0.602466f,
 0.088712f, 0.642886f,
 0.008494f, 0.602466f,
 0.049042f, 0.602466f,
 0.008494f, 0.642886f,
 0.008494f, 0.642886f,
 0.049042f, 0.602466f,
 0.049042f, 0.642886f,
 0.091983f, 0.750282f,
 0.049236f, 0.709862f,
 0.091983f, 0.709862f,
 0.091983f, 0.750282f,
 0.091983f, 0.709862f,
 0.137216f, 0.750282f,
 0.137216f, 0.750282f,
 0.091983f, 0.709862f,
 0.137216f, 0.709862f,
 0.176724f, 0.750282f,
 0.137216f, 0.750282f,
 0.176724f, 0.709862f,
 0.176724f, 0.709862f,
 0.137216f, 0.750282f,
 0.137216f, 0.709862f,
 0.007565f, 0.750282f,
 0.007565f, 0.709862f,
 0.049236f, 0.750282f,
 0.997287f, 0.008229f,
 0.997287f, 0.089162f,
 0.134658f, 0.008229f,
 0.134658f, 0.008229f,
 0.997287f, 0.089162f,
 0.134658f, 0.089162f,};

static float[][] NormArray = new float[][]{
{ 0.958716f, 0.274666f, -0.073633f},
{ 0.826605f, -0.221158f, -0.517507f},
{ 0.904768f, 0.205782f, -0.372892f},
{ 0.857718f, -0.208612f, -0.469894f},
{ 0.363846f, 0.556450f, -0.746980f},
{ 0.549456f, 0.832285f, -0.073488f},
{ 0.485922f, 0.317888f, -0.814142f},
{ 0.520281f, -0.801236f, -0.295512f},
{ 0.517275f, -0.189815f, 0.834504f},
{ 0.414372f, -0.133821f, 0.900215f},
{ 0.188090f, -0.307780f, 0.932681f},
{ 0.238558f, 0.112638f, 0.964574f},
{ 0.000000f, 0.234767f, 0.972052f},
{ 0.000000f, -0.431788f, 0.901975f},
{ -0.000000f, 0.677049f, -0.735938f},
{ 0.000000f, 0.998497f, 0.054803f},
{ 0.000000f, 0.229631f, -0.973278f},
{ 0.453144f, 0.145355f, 0.879507f},
{ -0.760936f, 0.101388f, 0.640857f},
{ 0.383691f, -0.760422f, -0.523965f},
{ -0.216585f, -0.713194f, -0.666667f},
{ -0.000000f, -0.971477f, 0.237135f},
{ 0.369532f, 0.741332f, 0.560244f},
{ 0.659747f, 0.379749f, -0.648479f},
{ 0.000000f, 0.545472f, 0.838129f},
{ 0.000000f, -0.152572f, -0.988292f},
{ 0.639610f, 0.108602f, 0.760989f},
{ -0.343939f, 0.379066f, 0.859078f},
{ 0.167440f, -0.983255f, 0.071930f},
{ -0.815179f, -0.551890f, 0.175786f},
{ 0.000000f, 0.161274f, 0.986910f},
{ 0.750628f, 0.013939f, 0.660578f},
{ 0.000000f, -0.162248f, -0.986750f},
{ 0.692341f, -0.255093f, -0.674975f},
{ 0.822525f, 0.180849f, 0.539209f},
{ 0.824538f, -0.084994f, -0.559386f},
{ 0.000278f, -0.192251f, -0.981346f},
{ -0.000308f, 0.203172f, 0.979143f},
{ 0.864203f, 0.273479f, -0.422330f},
{ 0.717843f, 0.318335f, 0.619164f},
{ 0.004500f, 0.308398f, 0.951247f},
{ -0.005502f, 0.250086f, -0.968208f},
{ 0.760770f, 0.640421f, -0.105312f},
{ -0.201585f, 0.893801f, 0.400602f},
{ -0.572202f, -0.688504f, 0.445587f},
{ 0.732363f, -0.628348f, -0.262344f},
{ -0.089445f, 0.930957f, 0.354005f},
{ 0.844494f, 0.526712f, 0.096978f},
{ -0.780229f, -0.616795f, 0.103959f},
{ 0.413925f, -0.812241f, -0.411011f},
{ -0.291085f, 0.898461f, 0.328690f},
{ 0.834444f, 0.477785f, 0.274636f},
{ -0.822405f, -0.290563f, -0.489104f},
{ 0.269161f, -0.787193f, -0.554869f},
{ 0.002080f, 0.136256f, 0.990671f},
{ 0.794409f, 0.234219f, 0.560407f},
{ 0.809880f, 0.393420f, -0.435104f},
{ -0.001489f, 0.459822f, -0.888010f},
{ -0.958716f, 0.274666f, -0.073633f},
{ -0.904768f, 0.205783f, -0.372893f},
{ -0.826605f, -0.221158f, -0.517506f},
{ -0.857718f, -0.208612f, -0.469894f},
{ -0.549456f, 0.832285f, -0.073488f},
{ -0.363846f, 0.556450f, -0.746980f},
{ -0.485922f, 0.317888f, -0.814142f},
{ -0.520281f, -0.801236f, -0.295514f},
{ -0.238558f, 0.112638f, 0.964574f},
{ -0.414372f, -0.133821f, 0.900216f},
{ -0.188090f, -0.307781f, 0.932681f},
{ -0.517274f, -0.189815f, 0.834505f},
{ -0.453143f, 0.145355f, 0.879507f},
{ -0.383691f, -0.760423f, -0.523964f},
{ 0.760937f, 0.101387f, 0.640855f},
{ 0.216586f, -0.713194f, -0.666667f},
{ -0.642214f, 0.497590f, -0.583065f},
{ -0.330789f, 0.759929f, 0.559541f},
{ 0.045094f, -0.540545f, 0.840106f},
{ 0.705693f, 0.582934f, 0.402722f},
{ -0.814016f, -0.046710f, 0.578962f},
{ -0.257319f, 0.961188f, 0.099520f},
{ -0.760923f, 0.033735f, 0.647965f},
{ -0.717218f, -0.202059f, -0.666911f},
{ -0.825104f, -0.084980f, -0.558554f},
{ -0.821333f, 0.180250f, 0.541222f},
{ -0.869768f, 0.274106f, -0.410329f},
{ -0.709013f, 0.318472f, 0.629187f},
{ -0.908960f, -0.180438f, -0.375811f},
{ -0.239489f, -0.890728f, -0.386327f},
{ -0.319687f, 0.819882f, 0.474968f},
{ 0.934832f, 0.086474f, 0.344399f},
{ 0.136447f, -0.989921f, 0.037938f},
{ -0.688213f, -0.685085f, -0.238795f},
{ -0.310528f, 0.926436f, 0.212811f},
{ 0.918572f, 0.367269f, 0.146081f},
{ -0.894981f, -0.443804f, -0.045248f},
{ 0.135259f, -0.930755f, 0.339705f},
{ -0.159665f, 0.792993f, -0.587937f},
{ 0.901173f, 0.384257f, -0.200584f},
{ -0.790934f, 0.232604f, 0.565967f},
{ -0.812416f, 0.393812f, -0.429992f},
{ -0.337096f, -0.941440f, -0.007583f},
{ -0.315982f, -0.946866f, -0.060006f},
{ -0.294581f, -0.938543f, -0.179887f},
{ -0.279516f, -0.938888f, -0.200899f},
{ -0.315886f, -0.948757f, -0.008774f},
{ -0.315886f, -0.948757f, -0.008774f}};

static int[] FaceArray = new int[]{
14, 15, 2,
2, 15, 3,
5, 13, 106,
107, 13, 108,
109, 110, 111,
112, 113, 5,
15, 16, 3,
3, 16, 6,
0, 1, 7,
7, 1, 4,
9, 8, 4,
4, 8, 7,
5, 10, 13,
13, 10, 12,
114, 11, 5,
5, 11, 10,
12, 115, 13,
13, 116, 117,
13, 118, 119,
120, 121, 122,
123, 15, 124,
125, 15, 14,
19, 18, 21,
21, 18, 20,
126, 127, 17,
17, 128, 129,
0, 7, 19,
19, 7, 18,
130, 16, 131,
132, 16, 133,
16, 15, 134,
135, 15, 136,
137, 138, 15,
15, 139, 140,
141, 142, 143,
144, 145, 146,
17, 147, 148,
149, 150, 151,
152, 153, 154,
155, 156, 157,
46, 47, 49,
49, 47, 48,
24, 33, 23,
23, 33, 30,
25, 22, 32,
32, 22, 31,
158, 27, 31,
31, 27, 26,
32, 31, 29,
29, 31, 26,
33, 28, 30,
30, 28, 159,
160, 161, 52,
52, 162, 163,
164, 50, 165,
166, 50, 51,
167, 168, 53,
53, 169, 52,
170, 171, 38,
172, 39, 38,
173, 174, 39,
175, 40, 39,
176, 41, 177,
178, 41, 179,
180, 38, 181,
182, 38, 41,
39, 43, 38,
38, 43, 42,
40, 44, 39,
39, 44, 43,
183, 41, 184,
185, 41, 45,
38, 42, 41,
41, 42, 45,
43, 93, 42,
42, 93, 94,
43, 44, 93,
93, 44, 92,
186, 45, 187,
188, 45, 95,
42, 94, 45,
45, 94, 95,
50, 36, 51,
51, 36, 35,
189, 190, 52,
52, 191, 34,
52, 34, 53,
53, 34, 37,
54, 57, 55,
55, 57, 56,
192, 59, 193,
194, 59, 58,
195, 196, 197,
198, 199, 58,
55, 56, 61,
61, 56, 60,
65, 64, 62,
62, 64, 63,
9, 65, 8,
8, 65, 62,
58, 59, 10,
10, 59, 12,
10, 11, 58,
58, 11, 200,
201, 202, 59,
59, 203, 12,
204, 205, 206,
207, 208, 59,
54, 55, 209,
210, 55, 211,
66, 69, 67,
67, 69, 68,
212, 213, 17,
17, 214, 215,
63, 66, 62,
62, 66, 67,
216, 217, 61,
61, 218, 219,
61, 220, 55,
55, 221, 222,
223, 224, 55,
55, 225, 226,
227, 228, 229,
230, 231, 232,
233, 234, 235,
236, 237, 17,
238, 239, 240,
241, 242, 243,
72, 75, 73,
73, 75, 74,
76, 33, 70,
70, 33, 24,
25, 32, 71,
71, 32, 77,
79, 78, 77,
77, 78, 244,
32, 29, 77,
77, 29, 79,
245, 28, 76,
76, 28, 33,
246, 81, 247,
248, 81, 249,
80, 50, 250,
87, 86, 83,
83, 86, 82,
84, 88, 85,
85, 88, 89,
89, 87, 85,
85, 87, 83,
86, 87, 99,
99, 87, 98,
88, 96, 89,
89, 96, 97,
87, 89, 98,
98, 89, 97,
90, 36, 80,
80, 36, 50,
37, 91, 53,
53, 91, 81,
93, 92, 47,
47, 92, 48,
93, 47, 94,
96, 74, 97,
96, 73, 74,
104, 105, 102,
102, 105, 103,};

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


//Vertices: 341  Texture Co-ords: 191  Normals: 106  Texture: block Faces: 196 Smooth Groups: 2 sucess: 89 Doubles: 107 Redos needed: 145 Correct: 86