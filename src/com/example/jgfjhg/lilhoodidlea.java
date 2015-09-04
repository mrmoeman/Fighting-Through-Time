package com.example.jgfjhg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;
import android.graphics.Bitmap;
import android.opengl.GLUtils;

class lilhoodidlea {

static String TextureName = "LRRH";

static int Vertices = 315;

static int VertTexts = 199;

static int Normals = 392;

static int Faces = 196;

static int FacesB = 21;

static int SmoothGroups = 98;

static float VertArray[] = new float[]{
 4.421382f, 0.111700f, -2.333833f,
 0.607327f, 5.067163f, 4.316199f,
 3.979719f, 0.704661f, -2.323382f,
 0.595231f, 5.102004f, 3.577676f,
 2.356429f, 2.791523f, 1.389522f,
 2.817527f, 2.153569f, 2.129370f,
 2.735528f, 2.298973f, 0.728539f,
 3.196625f, 1.661018f, 1.468387f,
 4.221653f, 0.406922f, -3.404453f,
 3.682585f, 1.107565f, -2.474563f,
 -0.040506f, 5.944590f, 4.026876f,
 0.492582f, 5.252221f, 3.087392f,
 1.988701f, 3.246167f, 2.949431f,
 1.695979f, 3.657954f, 2.210080f,
 3.655909f, 1.080024f, 0.042555f,
 3.202100f, 1.701106f, -0.415931f,
 0.458907f, 7.317786f, 1.256737f,
 2.504490f, 7.366031f, 1.465077f,
 1.307211f, 7.251988f, -2.023087f,
 2.797530f, 7.301951f, -1.290129f,
 1.681106f, 3.660611f, 0.179658f,
 0.796493f, 3.662959f, 0.554934f,
 0.835900f, 3.563388f, -1.480821f,
 1.711298f, 3.566007f, -1.195525f,
 1.535312f, 6.611107f, 0.952736f,
 0.653044f, 6.592567f, 0.936835f,
 1.149489f, 6.549362f, -1.336924f,
 1.934799f, 6.607334f, -0.862567f,
 0.445466f, 10.441455f, 1.176531f,
 0.727068f, 10.217269f, 1.323191f,
 1.409345f, 9.961089f, -1.294984f,
 1.099837f, 10.057637f, -1.317960f,
 0.814132f, 4.872770f, 0.950740f,
 0.814132f, 5.101648f, -1.274879f,
 1.582332f, 5.102158f, -1.149900f,
 1.582332f, 4.890893f, 0.740369f,
 2.285817f, 1.739122f, 1.396645f,
 0.692922f, 0.979055f, 1.489675f,
 0.892371f, 1.655021f, -2.124166f,
 2.370519f, 1.111794f, -0.996459f,
 0.814132f, 5.603592f, -1.849534f,
 3.210360f, 5.613965f, -1.261178f,
 0.814132f, 0.423212f, -2.936628f,
 3.441253f, 0.431421f, -1.876456f,
 0.106998f, 10.200174f, 1.163157f,
 0.784171f, 9.943855f, -1.456335f,
 -0.072370f, 3.626776f, 0.188812f,
 0.045933f, 4.890894f, 0.740369f,
 0.045933f, 5.102159f, -1.149900f,
 -0.052279f, 3.609981f, -1.202738f,
 -0.187951f, 6.580270f, 0.663684f,
 -1.431695f, 7.257523f, 0.449186f,
 -0.352014f, 7.215129f, -2.102996f,
 0.230920f, 6.560364f, -1.302322f,
 -0.781453f, 1.036445f, 0.433118f,
 -0.636458f, 1.727677f, -1.916918f,
 -1.582096f, 5.613966f, -1.261178f,
 -3.326348f, 0.431428f, -3.369946f,
 3.377088f, 3.313132f, -1.263314f,
 0.814132f, 3.294470f, -2.668937f,
 -2.454222f, 3.313137f, -2.654537f,
 2.506397f, 3.848001f, -0.316990f,
 2.318896f, 4.067528f, -0.025029f,
 2.825042f, 4.016128f, -0.268921f,
 2.616576f, 4.260201f, 0.055686f,
 2.486636f, 2.413830f, 0.527708f,
 2.156683f, 2.800141f, 1.041484f,
 3.047368f, 2.709690f, 0.612297f,
 2.680522f, 3.139196f, 1.183521f,
 2.586564f, 1.822310f, 1.036650f,
 2.256612f, 2.208621f, 1.550426f,
 3.147300f, 2.118173f, 1.121239f,
 2.780453f, 2.547680f, 1.692464f,
 1.497440f, 5.335906f, 0.318095f,
 1.497440f, 5.408997f, -0.629951f,
 1.554317f, 6.246212f, -0.619684f,
 1.554317f, 6.170663f, 0.442041f,
 -0.915046f, 3.841510f, -0.401632f,
 -0.937227f, 4.198620f, -0.126044f,
 -1.250710f, 3.959855f, -0.475366f,
 -1.207701f, 4.455319f, -0.056219f,
 -0.888964f, 3.094579f, 1.085702f,
 -0.669207f, 3.738502f, 1.328892f,
 -1.479646f, 3.302833f, 0.955950f,
 -1.235316f, 4.018756f, 1.226332f,
 -1.007305f, 2.855460f, 1.825784f,
 -0.787548f, 3.499383f, 2.068974f,
 -1.597991f, 3.063716f, 1.696030f,
 -1.353660f, 3.779640f, 1.966413f,
 0.100491f, 5.335943f, 0.318252f,
 0.100491f, 5.408566f, -0.629865f,
 0.043614f, 6.245786f, -0.620010f,
 0.043614f, 6.170668f, 0.442026f,
 2.420236f, 0.360014f, 1.810635f,
 1.286887f, 0.360012f, 1.810634f,
 1.286887f, -0.211557f, 2.385546f,
 2.420236f, -0.211556f, 2.385546f,
 1.155030f, 1.633140f, 0.743609f,
 1.842122f, 1.645624f, 0.752961f,
 1.166374f, 1.527003f, 0.051749f,
 1.853466f, 1.539487f, 0.061100f,
 1.365588f, 0.363665f, 1.129219f,
 2.341534f, 0.363666f, 1.129219f,
 1.365588f, -0.224438f, 0.171508f,
 2.341535f, -0.224438f, 0.171508f,
 1.680793f, 3.660610f, 0.179651f,
 0.796180f, 3.662950f, 0.554936f,
 0.835585f, 3.563403f, -1.480822f,
 1.710984f, 3.566004f, -1.195532f,
 -0.792285f, 0.360014f, 0.007868f,
 0.341064f, 0.360013f, 0.007869f,
 0.341064f, -0.211558f, 0.582778f,
 -0.792285f, -0.211557f, 0.582778f,
 0.401596f, 1.232375f, -0.082702f,
 -0.282938f, 1.259191f, -0.137778f,
 0.463989f, 1.542328f, -0.707283f,
 -0.220544f, 1.569143f, -0.762358f,
 0.262363f, 0.363667f, -0.673547f,
 -0.713583f, 0.363668f, -0.673547f,
 0.262363f, -0.224434f, -1.631259f,
 -0.713583f, -0.224434f, -1.631259f,
 -0.072370f, 3.626776f, 0.188812f,
 0.796493f, 3.662959f, 0.554934f,
 0.835900f, 3.563388f, -1.480821f,
 -0.052279f, 3.609981f, -1.202738f,
 1.535312f, 6.611107f, 0.952736f,
 1.934799f, 6.607334f, -0.862567f,
 2.504490f, 7.366031f, 1.465077f,
 2.504490f, 7.366031f, 1.465077f,
 1.934799f, 6.607334f, -0.862567f,
 2.797530f, 7.301951f, -1.290129f,
 0.727068f, 10.217269f, 1.323191f,
 0.727068f, 10.217269f, 1.323191f,
 0.445466f, 10.441455f, 1.176531f,
 2.797530f, 7.301951f, -1.290129f,
 2.504490f, 7.366031f, 1.465077f,
 2.504490f, 7.366031f, 1.465077f,
 1.409345f, 9.961089f, -1.294984f,
 1.409345f, 9.961089f, -1.294984f,
 1.099837f, 10.057637f, -1.317960f,
 1.934799f, 6.607334f, -0.862567f,
 1.149489f, 6.549362f, -1.336924f,
 1.149489f, 6.549362f, -1.336924f,
 1.535312f, 6.611107f, 0.952736f,
 1.535312f, 6.611107f, 0.952736f,
 0.653044f, 6.592567f, 0.936835f,
 1.681106f, 3.660611f, 0.179658f,
 0.796493f, 3.662959f, 0.554934f,
 0.796493f, 3.662959f, 0.554934f,
 0.835900f, 3.563388f, -1.480821f,
 1.711298f, 3.566007f, -1.195525f,
 1.711298f, 3.566007f, -1.195525f,
 1.711298f, 3.566007f, -1.195525f,
 1.681106f, 3.660611f, 0.179658f,
 2.370519f, 1.111794f, -0.996459f,
 2.370519f, 1.111794f, -0.996459f,
 1.681106f, 3.660611f, 0.179658f,
 1.934799f, 6.607334f, -0.862567f,
 1.934799f, 6.607334f, -0.862567f,
 1.535312f, 6.611107f, 0.952736f,
 1.149489f, 6.549362f, -1.336924f,
 1.934799f, 6.607334f, -0.862567f,
 1.934799f, 6.607334f, -0.862567f,
 0.045933f, 5.102159f, -1.149900f,
 0.045933f, 5.102159f, -1.149900f,
 -0.052279f, 3.609981f, -1.202738f,
 -0.187951f, 6.580270f, 0.663684f,
 -1.431695f, 7.257523f, 0.449186f,
 0.230920f, 6.560364f, -1.302322f,
 0.230920f, 6.560364f, -1.302322f,
 -1.431695f, 7.257523f, 0.449186f,
 -0.352014f, 7.215129f, -2.102996f,
 0.445466f, 10.441455f, 1.176531f,
 0.106998f, 10.200174f, 1.163157f,
 0.106998f, 10.200174f, 1.163157f,
 -1.431695f, 7.257523f, 0.449186f,
 -1.431695f, 7.257523f, 0.449186f,
 -0.352014f, 7.215129f, -2.102996f,
 0.784171f, 9.943855f, -1.456335f,
 0.784171f, 9.943855f, -1.456335f,
 1.099837f, 10.057637f, -1.317960f,
 1.149489f, 6.549362f, -1.336924f,
 0.230920f, 6.560364f, -1.302322f,
 0.230920f, 6.560364f, -1.302322f,
 0.653044f, 6.592567f, 0.936835f,
 0.653044f, 6.592567f, 0.936835f,
 -0.187951f, 6.580270f, 0.663684f,
 -0.072370f, 3.626776f, 0.188812f,
 -0.072370f, 3.626776f, 0.188812f,
 0.796493f, 3.662959f, 0.554934f,
 0.835900f, 3.563388f, -1.480821f,
 -0.052279f, 3.609981f, -1.202738f,
 -0.052279f, 3.609981f, -1.202738f,
 -0.052279f, 3.609981f, -1.202738f,
 -0.072370f, 3.626776f, 0.188812f,
 -0.072370f, 3.626776f, 0.188812f,
 -0.187951f, 6.580270f, 0.663684f,
 0.045933f, 5.102159f, -1.149900f,
 0.045933f, 5.102159f, -1.149900f,
 -0.187951f, 6.580270f, 0.663684f,
 0.230920f, 6.560364f, -1.302322f,
 1.149489f, 6.549362f, -1.336924f,
 0.230920f, 6.560364f, -1.302322f,
 0.230920f, 6.560364f, -1.302322f,
 1.497440f, 5.408997f, -0.629951f,
 1.497440f, 5.408997f, -0.629951f,
 2.506397f, 3.848001f, -0.316990f,
 2.506397f, 3.848001f, -0.316990f,
 2.506397f, 3.848001f, -0.316990f,
 2.486636f, 2.413830f, 0.527708f,
 3.147300f, 2.118173f, 1.121239f,
 2.486636f, 2.413830f, 0.527708f,
 2.486636f, 2.413830f, 0.527708f,
 3.147300f, 2.118173f, 1.121239f,
 2.586564f, 1.822310f, 1.036650f,
 3.147300f, 2.118173f, 1.121239f,
 3.147300f, 2.118173f, 1.121239f,
 2.780453f, 2.547680f, 1.692464f,
 2.780453f, 2.547680f, 1.692464f,
 2.780453f, 2.547680f, 1.692464f,
 -0.915046f, 3.841510f, -0.401632f,
 0.100491f, 5.408566f, -0.629865f,
 0.100491f, 5.408566f, -0.629865f,
 -0.888964f, 3.094579f, 1.085702f,
 -0.915046f, 3.841510f, -0.401632f,
 -0.915046f, 3.841510f, -0.401632f,
 -1.007305f, 2.855460f, 1.825784f,
 -1.597991f, 3.063716f, 1.696030f,
 -0.888964f, 3.094579f, 1.085702f,
 -0.888964f, 3.094579f, 1.085702f,
 -1.597991f, 3.063716f, 1.696030f,
 -1.597991f, 3.063716f, 1.696030f,
 -1.597991f, 3.063716f, 1.696030f,
 -1.353660f, 3.779640f, 1.966413f,
 -1.353660f, 3.779640f, 1.966413f,
 -1.353660f, 3.779640f, 1.966413f,
 0.835585f, 3.563403f, -1.480822f,
 1.166374f, 1.527003f, 0.051749f,
 1.166374f, 1.527003f, 0.051749f,
 1.680793f, 3.660610f, 0.179651f,
 1.680793f, 3.660610f, 0.179651f,
 1.842122f, 1.645624f, 0.752961f,
 1.166374f, 1.527003f, 0.051749f,
 1.365588f, -0.224438f, 0.171508f,
 1.365588f, -0.224438f, 0.171508f,
 2.341535f, -0.224438f, 0.171508f,
 1.842122f, 1.645624f, 0.752961f,
 2.341534f, 0.363666f, 1.129219f,
 2.341534f, 0.363666f, 1.129219f,
 2.341535f, -0.224438f, 0.171508f,
 2.341534f, 0.363666f, 1.129219f,
 1.365588f, 0.363665f, 1.129219f,};

static float VertArrayB[] = new float[]{
 2.420236f, 0.360014f, 1.810635f,
 1.365588f, 0.363665f, 1.129219f,
 1.286887f, 0.360012f, 1.810634f,
 1.365588f, -0.224438f, 0.171508f,
 1.286887f, -0.211557f, 2.385546f,
 1.365588f, 0.363665f, 1.129219f,
 1.365588f, 0.363665f, 1.129219f,
 1.286887f, -0.211557f, 2.385546f,
 1.286887f, 0.360012f, 1.810634f,
 1.365588f, -0.224438f, 0.171508f,
 2.341535f, -0.224438f, 0.171508f,
 1.286887f, -0.211557f, 2.385546f,
 2.341535f, -0.224438f, 0.171508f,
 2.341534f, 0.363666f, 1.129219f,
 2.420236f, -0.211556f, 2.385546f,
 2.420236f, -0.211556f, 2.385546f,
 2.341534f, 0.363666f, 1.129219f,
 2.420236f, 0.360014f, 1.810635f,
 0.835900f, 3.563388f, -1.480821f,
 0.463989f, 1.542328f, -0.707283f,
 -0.052279f, 3.609981f, -1.202738f,
 -0.052279f, 3.609981f, -1.202738f,
 0.463989f, 1.542328f, -0.707283f,
 -0.220544f, 1.569143f, -0.762358f,
 -0.052279f, 3.609981f, -1.202738f,
 -0.220544f, 1.569143f, -0.762358f,
 -0.072370f, 3.626776f, 0.188812f,
 -0.072370f, 3.626776f, 0.188812f,
 -0.220544f, 1.569143f, -0.762358f,
 -0.282938f, 1.259191f, -0.137778f,
 0.463989f, 1.542328f, -0.707283f,
 0.262363f, -0.224434f, -1.631259f,
 -0.220544f, 1.569143f, -0.762358f,
 -0.220544f, 1.569143f, -0.762358f,
 0.262363f, -0.224434f, -1.631259f,
 -0.713583f, -0.224434f, -1.631259f,
 -0.713583f, -0.224434f, -1.631259f,
 -0.713583f, 0.363668f, -0.673547f,
 -0.220544f, 1.569143f, -0.762358f,
 -0.220544f, 1.569143f, -0.762358f,
 -0.713583f, 0.363668f, -0.673547f,
 -0.282938f, 1.259191f, -0.137778f,
 -0.713583f, 0.363668f, -0.673547f,
 -0.792285f, 0.360014f, 0.007868f,
 0.262363f, 0.363667f, -0.673547f,
 0.262363f, 0.363667f, -0.673547f,
 -0.792285f, 0.360014f, 0.007868f,
 0.341064f, 0.360013f, 0.007869f,
 0.341064f, 0.360013f, 0.007869f,
 0.341064f, -0.211558f, 0.582778f,
 0.262363f, 0.363667f, -0.673547f,
 0.262363f, 0.363667f, -0.673547f,
 0.341064f, -0.211558f, 0.582778f,
 0.262363f, -0.224434f, -1.631259f,
 0.262363f, -0.224434f, -1.631259f,
 0.341064f, -0.211558f, 0.582778f,
 -0.713583f, -0.224434f, -1.631259f,
 -0.713583f, -0.224434f, -1.631259f,
 -0.792285f, -0.211557f, 0.582778f,
 -0.713583f, 0.363668f, -0.673547f,
 -0.713583f, 0.363668f, -0.673547f,
 -0.792285f, -0.211557f, 0.582778f,
 -0.792285f, 0.360014f, 0.007868f,};

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
 0.830236f, 0.030323f,
 0.950447f, 0.030323f,
 0.797056f, 0.069861f,
 0.797056f, 0.069861f,
 0.950447f, 0.030323f,
 0.994107f, 0.069861f,
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
 0.430492f, 0.784985f,
 0.570051f, 0.817057f,
 0.333532f, 0.938934f,
 0.333532f, 0.938934f,
 0.570051f, 0.817057f,
 0.646986f, 0.253990f,
 0.646986f, 0.253990f,
 0.488118f, 0.253991f,
 0.486458f, 0.473726f,
 0.521629f, 0.472552f,
 0.521629f, 0.472552f,
 0.202748f, 0.118745f,
 0.202748f, 0.118745f,
 0.196441f, 0.009203f,
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
 0.761869f, 0.653963f,
 0.761869f, 0.653963f,
 0.761869f, 0.653963f,
 0.681239f, 0.772821f,
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
 0.213615f, 0.713385f,
 0.235118f, 0.593559f,
 0.310668f, 0.713380f,
 0.310668f, 0.713380f,
 0.235118f, 0.593559f,
 0.276453f, 0.593558f,
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
{ -0.802017f, -0.597112f, -0.015033f},
{ -0.802017f, -0.597112f, -0.015033f},
{ -0.802017f, -0.597112f, -0.015033f},
{ -0.802017f, -0.597112f, -0.015033f},
{ -0.802017f, -0.597112f, -0.015033f},
{ -0.802017f, -0.597112f, -0.015033f},
{ -0.802017f, -0.597112f, -0.015033f},
{ -0.802017f, -0.597112f, -0.015033f},
{ -0.802017f, -0.597112f, -0.015033f},
{ -0.802017f, -0.597112f, -0.015033f},
{ -0.802017f, -0.597112f, -0.015033f},
{ -0.802017f, -0.597112f, -0.015033f},
{ -0.802017f, -0.597112f, -0.015033f},
{ -0.802017f, -0.597112f, -0.015033f},
{ -0.802017f, -0.597112f, -0.015032f},
{ -0.802017f, -0.597112f, -0.015033f},
{ -0.802017f, -0.597112f, -0.015034f},
{ -0.802017f, -0.597112f, -0.015033f},
{ -0.802017f, -0.597112f, -0.015033f},
{ -0.802017f, -0.597112f, -0.015033f},
{ -0.802017f, -0.597112f, -0.015033f},
{ -0.802017f, -0.597112f, -0.015033f},
{ -0.802017f, -0.597112f, -0.015033f},
{ -0.802017f, -0.597112f, -0.015033f},
{ -0.802017f, -0.597112f, -0.015033f},
{ -0.802017f, -0.597112f, -0.015033f},
{ -0.802017f, -0.597112f, -0.015033f},
{ -0.802017f, -0.597112f, -0.015034f},
{ -0.802017f, -0.597112f, -0.015033f},
{ -0.802017f, -0.597112f, -0.015033f},
{ -0.802017f, -0.597112f, -0.015033f},
{ -0.802017f, -0.597112f, -0.015033f},
{ 0.473839f, 0.880506f, 0.013659f},
{ 0.473839f, 0.880506f, 0.013659f},
{ 0.473839f, 0.880506f, 0.013659f},
{ 0.473839f, 0.880506f, 0.013659f},
{ 0.317313f, -0.336936f, 0.886446f},
{ 0.215727f, -0.188717f, 0.958044f},
{ 0.317313f, -0.336936f, 0.886446f},
{ 0.206087f, -0.174887f, 0.962779f},
{ 0.294944f, 0.045008f, -0.954454f},
{ 0.302606f, 0.038363f, -0.952343f},
{ 0.241024f, 0.090882f, -0.966255f},
{ 0.241024f, 0.090882f, -0.966255f},
{ 0.996769f, 0.079415f, 0.012053f},
{ 0.996769f, 0.079415f, 0.012053f},
{ 0.996769f, 0.079415f, 0.012053f},
{ 0.996769f, 0.079415f, 0.012053f},
{ 0.031008f, -0.266386f, 0.963368f},
{ 0.019722f, -0.293089f, 0.955882f},
{ -0.056964f, -0.466486f, 0.882693f},
{ -0.056964f, -0.466486f, 0.882693f},
{ 0.348599f, -0.726557f, -0.592110f},
{ 0.348599f, -0.726557f, -0.592110f},
{ 0.348599f, -0.726557f, -0.592110f},
{ 0.348599f, -0.726557f, -0.592110f},
{ 0.614122f, -0.782240f, 0.104665f},
{ 0.614122f, -0.782240f, 0.104665f},
{ 0.614122f, -0.782240f, 0.104665f},
{ 0.614122f, -0.782240f, 0.104665f},
{ -0.151434f, -0.008649f, 0.988430f},
{ -0.151434f, -0.008649f, 0.988430f},
{ -0.151434f, -0.008649f, 0.988430f},
{ -0.151434f, -0.008649f, 0.988430f},
{ 0.858706f, 0.496672f, 0.126260f},
{ 0.858706f, 0.496672f, 0.126260f},
{ 0.858706f, 0.496672f, 0.126260f},
{ 0.858706f, 0.496672f, 0.126260f},
{ 0.382157f, 0.226387f, -0.895938f},
{ 0.382157f, 0.226387f, -0.895938f},
{ 0.382157f, 0.226387f, -0.895938f},
{ 0.382157f, 0.226387f, -0.895938f},
{ 0.360326f, -0.012769f, -0.932739f},
{ 0.302606f, 0.038363f, -0.952343f},
{ 0.360326f, -0.012769f, -0.932739f},
{ 0.294944f, 0.045008f, -0.954454f},
{ 0.215727f, -0.188717f, 0.958044f},
{ 0.019722f, -0.293089f, 0.955882f},
{ 0.206087f, -0.174887f, 0.962779f},
{ 0.031008f, -0.266386f, 0.963368f},
{ 0.040338f, 0.426551f, 0.903563f},
{ 0.040338f, 0.426551f, 0.903563f},
{ 0.040338f, 0.426551f, 0.903563f},
{ 0.040338f, 0.426551f, 0.903563f},
{ 0.535806f, 0.172082f, -0.826619f},
{ 0.535806f, 0.172082f, -0.826619f},
{ 0.535806f, 0.172082f, -0.826619f},
{ 0.535806f, 0.172082f, -0.826619f},
{ 0.962399f, 0.270704f, -0.022519f},
{ 0.962399f, 0.270704f, -0.022519f},
{ 0.962399f, 0.270704f, -0.022519f},
{ 0.962399f, 0.270704f, -0.022519f},
{ 0.988924f, -0.109222f, 0.100497f},
{ 0.988924f, -0.109222f, 0.100497f},
{ 0.988924f, -0.109222f, 0.100497f},
{ 0.988924f, -0.109222f, 0.100497f},
{ 0.262301f, 0.511648f, -0.818178f},
{ 0.262301f, 0.511648f, -0.818178f},
{ 0.262301f, 0.511648f, -0.818178f},
{ 0.262301f, 0.511648f, -0.818178f},
{ 0.366336f, 0.176074f, -0.913672f},
{ 0.399359f, 0.156681f, -0.903307f},
{ 0.366336f, 0.176074f, -0.913672f},
{ 0.401671f, 0.155299f, -0.902520f},
{ -0.425273f, 0.877768f, -0.220604f},
{ -0.425273f, 0.877768f, -0.220604f},
{ -0.425273f, 0.877768f, -0.220604f},
{ -0.425273f, 0.877768f, -0.220604f},
{ -0.302131f, -0.152127f, 0.941050f},
{ -0.301958f, -0.149932f, 0.941457f},
{ -0.310942f, -0.324939f, 0.893157f},
{ -0.310942f, -0.324939f, 0.893157f},
{ -0.233132f, 0.088576f, -0.968403f},
{ -0.233132f, 0.088576f, -0.968403f},
{ -0.162348f, 0.013772f, -0.986637f},
{ -0.170841f, 0.022657f, -0.985038f},
{ -0.996903f, 0.078626f, -0.001444f},
{ -0.996903f, 0.078626f, -0.001444f},
{ -0.996903f, 0.078626f, -0.001444f},
{ -0.996903f, 0.078626f, -0.001444f},
{ -0.310921f, -0.175843f, 0.934028f},
{ -0.327880f, -0.400465f, 0.855642f},
{ -0.318016f, -0.245835f, 0.915659f},
{ -0.327880f, -0.400465f, 0.855642f},
{ 0.019280f, -0.735635f, -0.677104f},
{ 0.019280f, -0.735635f, -0.677104f},
{ 0.019280f, -0.735635f, -0.677104f},
{ 0.019280f, -0.735635f, -0.677104f},
{ -0.521354f, -0.837945f, -0.161364f},
{ -0.521354f, -0.837945f, -0.161364f},
{ -0.521354f, -0.837945f, -0.161364f},
{ -0.521354f, -0.837945f, -0.161364f},
{ -0.344192f, -0.011542f, 0.938828f},
{ -0.344192f, -0.011542f, 0.938828f},
{ -0.344192f, -0.011542f, 0.938828f},
{ -0.344192f, -0.011542f, 0.938828f},
{ -0.829571f, 0.465321f, -0.308688f},
{ -0.829571f, 0.465321f, -0.308688f},
{ -0.829571f, 0.465321f, -0.308688f},
{ -0.829571f, 0.465321f, -0.308688f},
{ 0.090377f, 0.221967f, -0.970857f},
{ 0.090377f, 0.221967f, -0.970857f},
{ 0.090377f, 0.221967f, -0.970857f},
{ 0.090377f, 0.221967f, -0.970857f},
{ -0.094419f, -0.056449f, -0.993931f},
{ -0.162348f, 0.013772f, -0.986637f},
{ -0.094419f, -0.056449f, -0.993931f},
{ -0.170841f, 0.022657f, -0.985038f},
{ -0.302131f, -0.152127f, 0.941050f},
{ -0.310921f, -0.175843f, 0.934028f},
{ -0.301958f, -0.149932f, 0.941457f},
{ -0.318016f, -0.245835f, 0.915659f},
{ -0.499177f, 0.261581f, 0.826074f},
{ -0.499177f, 0.261581f, 0.826074f},
{ -0.499177f, 0.261581f, 0.826074f},
{ -0.499177f, 0.261581f, 0.826074f},
{ -0.167427f, 0.352971f, -0.920532f},
{ -0.167427f, 0.352971f, -0.920532f},
{ -0.167427f, 0.352971f, -0.920532f},
{ -0.167427f, 0.352971f, -0.920532f},
{ -0.960831f, 0.277032f, 0.007543f},
{ -0.960831f, 0.277032f, 0.007543f},
{ -0.960831f, 0.277032f, 0.007543f},
{ -0.960831f, 0.277032f, 0.007543f},
{ -0.993756f, -0.023379f, -0.109102f},
{ -0.993756f, -0.023379f, -0.109102f},
{ -0.993756f, -0.023379f, -0.109102f},
{ -0.993756f, -0.023379f, -0.109102f},
{ -0.165771f, 0.411520f, -0.896198f},
{ -0.165771f, 0.411520f, -0.896198f},
{ -0.165771f, 0.411520f, -0.896198f},
{ -0.165771f, 0.411520f, -0.896198f},
{ -0.092498f, 0.445042f, -0.890720f},
{ -0.003581f, 0.278338f, -0.960477f},
{ -0.092498f, 0.445042f, -0.890720f},
{ 0.009289f, 0.253297f, -0.967344f},
{ 0.399359f, 0.156681f, -0.903307f},
{ 0.424202f, 0.141675f, -0.894417f},
{ 0.401671f, 0.155299f, -0.902520f},
{ 0.424202f, 0.141675f, -0.894417f},
{ -0.003581f, 0.278338f, -0.960477f},
{ 0.056305f, 0.159877f, -0.985530f},
{ 0.009289f, 0.253297f, -0.967344f},
{ 0.056305f, 0.159877f, -0.985530f},
{ 0.258653f, -0.684954f, 0.681129f},
{ 0.258653f, -0.684954f, 0.681130f},
{ 0.258653f, -0.684954f, 0.681130f},
{ 0.258653f, -0.684954f, 0.681130f},
{ -0.838267f, -0.541633f, -0.062791f},
{ -0.838267f, -0.541633f, -0.062791f},
{ -0.879146f, -0.435918f, -0.192556f},
{ -0.891932f, -0.358170f, -0.275991f},
{ 0.232450f, -0.030417f, -0.972133f},
{ 0.301004f, -0.227695f, -0.926041f},
{ 0.232450f, -0.030417f, -0.972133f},
{ 0.309249f, -0.253668f, -0.916525f},
{ 0.869270f, 0.489176f, 0.071250f},
{ 0.880320f, 0.453599f, 0.138867f},
{ 0.869270f, 0.489176f, 0.071250f},
{ 0.885402f, 0.423028f, 0.192642f},
{ 0.031589f, -0.205735f, 0.978098f},
{ 0.031589f, -0.205735f, 0.978098f},
{ -0.266885f, 0.176925f, 0.947349f},
{ -0.336576f, 0.272869f, 0.901254f},
{ -0.879146f, -0.435918f, -0.192556f},
{ -0.891932f, -0.358170f, -0.275991f},
{ -0.887929f, -0.224294f, -0.401590f},
{ -0.887929f, -0.224294f, -0.401590f},
{ 0.301004f, -0.227695f, -0.926041f},
{ 0.371027f, -0.475063f, -0.797906f},
{ 0.309249f, -0.253668f, -0.916525f},
{ 0.371027f, -0.475063f, -0.797906f},
{ 0.885402f, 0.423028f, 0.192642f},
{ 0.880320f, 0.453599f, 0.138867f},
{ 0.885032f, 0.354302f, 0.301976f},
{ 0.885032f, 0.354301f, 0.301976f},
{ -0.266885f, 0.176925f, 0.947349f},
{ -0.336576f, 0.272869f, 0.901254f},
{ -0.540941f, 0.580989f, 0.608141f},
{ -0.540941f, 0.580989f, 0.608141f},
{ -0.880530f, -0.385744f, -0.275443f},
{ -0.880530f, -0.385744f, -0.275443f},
{ -0.880530f, -0.385744f, -0.275443f},
{ -0.880530f, -0.385744f, -0.275443f},
{ 0.403298f, -0.556719f, -0.726233f},
{ 0.403298f, -0.556719f, -0.726233f},
{ 0.403298f, -0.556719f, -0.726233f},
{ 0.403298f, -0.556719f, -0.726233f},
{ 0.880529f, 0.385748f, 0.275440f},
{ 0.880529f, 0.385748f, 0.275440f},
{ 0.880529f, 0.385748f, 0.275440f},
{ 0.880529f, 0.385748f, 0.275440f},
{ -0.515530f, 0.507157f, 0.690666f},
{ -0.515530f, 0.507157f, 0.690666f},
{ -0.515530f, 0.507157f, 0.690666f},
{ -0.515530f, 0.507157f, 0.690666f},
{ -0.290879f, -0.249559f, 0.923639f},
{ -0.290879f, -0.249559f, 0.923639f},
{ -0.290879f, -0.249559f, 0.923639f},
{ -0.290879f, -0.249559f, 0.923639f},
{ 0.780851f, -0.605220f, 0.154855f},
{ 0.906044f, -0.422046f, 0.031020f},
{ 0.780851f, -0.605220f, 0.154855f},
{ 0.935684f, -0.352630f, -0.012119f},
{ -0.134366f, -0.526821f, -0.839288f},
{ -0.129209f, -0.504479f, -0.853701f},
{ -0.029516f, -0.078738f, -0.996458f},
{ -0.029516f, -0.078738f, -0.996458f},
{ -0.914693f, 0.398389f, -0.067994f},
{ -0.889672f, 0.447850f, -0.088959f},
{ -0.831437f, 0.540385f, -0.129214f},
{ -0.831437f, 0.540385f, -0.129214f},
{ -0.134373f, -0.212006f, 0.967986f},
{ 0.188380f, 0.299184f, 0.935415f},
{ -0.134373f, -0.212006f, 0.967986f},
{ 0.250598f, 0.397688f, 0.882635f},
{ 0.982152f, -0.117906f, -0.146543f},
{ 0.982152f, -0.117906f, -0.146543f},
{ 0.906044f, -0.422046f, 0.031020f},
{ 0.935684f, -0.352630f, -0.012119f},
{ -0.212713f, -0.874681f, -0.435530f},
{ -0.212713f, -0.874681f, -0.435530f},
{ -0.134366f, -0.526821f, -0.839288f},
{ -0.129209f, -0.504479f, -0.853701f},
{ -0.914693f, 0.398389f, -0.067994f},
{ -0.973108f, 0.230347f, 0.000830f},
{ -0.889672f, 0.447850f, -0.088959f},
{ -0.973108f, 0.230347f, 0.000830f},
{ 0.188380f, 0.299184f, 0.935415f},
{ 0.520164f, 0.824098f, 0.224258f},
{ 0.250598f, 0.397688f, 0.882635f},
{ 0.520164f, 0.824098f, 0.224258f},
{ 0.940674f, -0.336749f, 0.041614f},
{ 0.940674f, -0.336749f, 0.041614f},
{ 0.940674f, -0.336749f, 0.041614f},
{ 0.940674f, -0.336749f, 0.041614f},
{ -0.247471f, -0.909693f, -0.333491f},
{ -0.247471f, -0.909693f, -0.333491f},
{ -0.247471f, -0.909693f, -0.333491f},
{ -0.247471f, -0.909693f, -0.333491f},
{ -0.940674f, 0.336751f, -0.041618f},
{ -0.940674f, 0.336751f, -0.041618f},
{ -0.940674f, 0.336751f, -0.041618f},
{ -0.940674f, 0.336751f, -0.041618f},
{ 0.367468f, 0.866199f, 0.338625f},
{ 0.367468f, 0.866199f, 0.338625f},
{ 0.367468f, 0.866199f, 0.338625f},
{ 0.367468f, 0.866199f, 0.338625f},
{ -0.000001f, 0.709165f, 0.705043f},
{ -0.000001f, 0.709165f, 0.705043f},
{ -0.000001f, 0.709165f, 0.705043f},
{ -0.000001f, 0.709165f, 0.705043f},
{ 0.220534f, 0.207887f, 0.952968f},
{ 0.220534f, 0.207887f, 0.952968f},
{ 0.220534f, 0.207887f, 0.952968f},
{ 0.220534f, 0.207887f, 0.952968f},
{ -0.985515f, -0.169497f, -0.005555f},
{ -0.985515f, -0.169497f, -0.005555f},
{ -0.985515f, -0.169497f, -0.005555f},
{ -0.985515f, -0.169497f, -0.005555f},
{ 0.160346f, -0.545884f, -0.822374f},
{ 0.160346f, -0.545884f, -0.822374f},
{ 0.160346f, -0.545884f, -0.822374f},
{ 0.160346f, -0.545884f, -0.822374f},
{ 0.996684f, 0.080454f, 0.012214f},
{ 0.996684f, 0.080454f, 0.012214f},
{ 0.996683f, 0.080454f, 0.012214f},
{ 0.996684f, 0.080454f, 0.012214f},
{ -0.007524f, 0.284189f, 0.958739f},
{ -0.007524f, 0.284189f, 0.958739f},
{ -0.007524f, 0.284189f, 0.958739f},
{ -0.007524f, 0.284189f, 0.958739f},
{ -0.990861f, -0.126630f, 0.046479f},
{ -0.990861f, -0.126630f, 0.046479f},
{ -0.990861f, -0.126630f, 0.046479f},
{ -0.990861f, -0.126630f, 0.046479f},
{ 0.006093f, -0.064147f, -0.997922f},
{ 0.006093f, -0.064147f, -0.997922f},
{ 0.006093f, -0.064147f, -0.997922f},
{ 0.006093f, -0.064147f, -0.997922f},
{ 0.950167f, 0.289615f, -0.115353f},
{ 0.950167f, 0.289615f, -0.115353f},
{ 0.950167f, 0.289615f, -0.115353f},
{ 0.950167f, 0.289615f, -0.115353f},
{ -0.000001f, 0.999986f, 0.005360f},
{ -0.000001f, 0.999986f, 0.005360f},
{ -0.000001f, 0.999986f, 0.005360f},
{ -0.000001f, 0.999986f, 0.005360f},
{ -0.998362f, 0.017933f, -0.054330f},
{ -0.998362f, 0.017933f, -0.054330f},
{ -0.998362f, 0.017933f, -0.054330f},
{ -0.998362f, 0.017933f, -0.054330f},
{ 0.000001f, -0.999983f, 0.005818f},
{ 0.000001f, -0.999983f, 0.005818f},
{ 0.000001f, -0.999983f, 0.005818f},
{ 0.000001f, -0.999983f, 0.005818f},
{ 0.998362f, 0.017933f, -0.054330f},
{ 0.998362f, 0.017933f, -0.054330f},
{ 0.998362f, 0.017933f, -0.054330f},
{ 0.998362f, 0.017933f, -0.054330f},
{ 0.000001f, 0.709163f, 0.705044f},
{ 0.000001f, 0.709163f, 0.705044f},
{ 0.000001f, 0.709163f, 0.705044f},
{ 0.000001f, 0.709163f, 0.705044f},
{ -0.257473f, -0.159044f, 0.953107f},
{ -0.257473f, -0.159044f, 0.953107f},
{ -0.257473f, -0.159044f, 0.953107f},
{ -0.257473f, -0.159044f, 0.953107f},
{ 0.985319f, -0.168981f, 0.024341f},
{ 0.985319f, -0.168981f, 0.024341f},
{ 0.985319f, -0.168981f, 0.024341f},
{ 0.985319f, -0.168981f, 0.024341f},
{ -0.147490f, -0.265152f, -0.952859f},
{ -0.147490f, -0.265152f, -0.952859f},
{ -0.147490f, -0.265152f, -0.952859f},
{ -0.147490f, -0.265152f, -0.952859f},
{ -0.995988f, 0.084856f, -0.028409f},
{ -0.995988f, 0.084856f, -0.028409f},
{ -0.995988f, 0.084856f, -0.028409f},
{ -0.995988f, 0.084856f, -0.028409f},
{ -0.036663f, -0.529408f, 0.847575f},
{ -0.036663f, -0.529408f, 0.847575f},
{ -0.036663f, -0.529408f, 0.847575f},
{ -0.036663f, -0.529408f, 0.847575f},
{ 0.983720f, -0.166332f, 0.068030f},
{ 0.983720f, -0.166332f, 0.068030f},
{ 0.983720f, -0.166332f, 0.068030f},
{ 0.983720f, -0.166332f, 0.068030f},
{ 0.036865f, 0.443709f, -0.895412f},
{ 0.036865f, 0.443709f, -0.895412f},
{ 0.036865f, 0.443709f, -0.895412f},
{ 0.036865f, 0.443709f, -0.895412f},
{ -0.923395f, 0.370191f, -0.101487f},
{ -0.923395f, 0.370191f, -0.101487f},
{ -0.923395f, 0.370191f, -0.101487f},
{ -0.923395f, 0.370191f, -0.101487f},
{ 0.000001f, 0.999986f, 0.005363f},
{ 0.000001f, 0.999986f, 0.005363f},
{ 0.000001f, 0.999986f, 0.005363f},
{ 0.000001f, 0.999986f, 0.005363f},
{ 0.998362f, 0.017934f, -0.054329f},
{ 0.998362f, 0.017934f, -0.054329f},
{ 0.998362f, 0.017934f, -0.054329f},
{ 0.998362f, 0.017934f, -0.054329f},
{ -0.000001f, -0.999983f, 0.005816f},
{ -0.000001f, -0.999983f, 0.005816f},
{ -0.000001f, -0.999983f, 0.005816f},
{ -0.000001f, -0.999983f, 0.005816f},
{ -0.998362f, 0.017934f, -0.054330f},
{ -0.998362f, 0.017934f, -0.054330f},
{ -0.998362f, 0.017934f, -0.054330f},
{ -0.998362f, 0.017934f, -0.054330f}};

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
23, 34, 20,
20, 34, 35,
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
152, 153, 154,
155, 156, 36,
34, 157, 35,
35, 158, 159,
160, 161, 40,
40, 162, 41,
41, 58, 40,
40, 58, 59,
28, 31, 44,
44, 31, 45,
32, 47, 21,
21, 47, 46,
22, 49, 33,
33, 49, 48,
47, 163, 46,
46, 164, 165,
25, 16, 50,
50, 16, 51,
26, 53, 18,
18, 53, 52,
166, 167, 168,
169, 170, 171,
172, 173, 16,
16, 174, 51,
44, 45, 175,
176, 45, 177,
52, 178, 18,
18, 179, 180,
181, 33, 182,
183, 33, 48,
32, 184, 47,
47, 185, 186,
54, 37, 187,
188, 37, 189,
190, 38, 191,
192, 38, 55,
193, 55, 194,
195, 55, 54,
47, 196, 197,
198, 199, 200,
201, 40, 202,
203, 40, 56,
40, 59, 56,
56, 59, 60,
58, 43, 59,
59, 43, 42,
59, 42, 60,
60, 42, 57,
69, 71, 70,
70, 71, 72,
73, 74, 62,
62, 74, 61,
75, 63, 204,
205, 63, 206,
76, 64, 75,
75, 64, 63,
76, 73, 64,
64, 73, 62,
62, 61, 66,
66, 61, 65,
63, 67, 207,
208, 67, 209,
63, 64, 67,
67, 64, 68,
64, 62, 68,
68, 62, 66,
66, 65, 70,
70, 65, 69,
67, 210, 211,
212, 213, 214,
67, 68, 215,
216, 68, 217,
68, 66, 218,
219, 66, 70,
88, 87, 86,
86, 87, 85,
89, 78, 90,
90, 78, 77,
220, 79, 221,
222, 79, 91,
79, 80, 91,
91, 80, 92,
92, 80, 89,
89, 80, 78,
82, 81, 78,
78, 81, 77,
223, 83, 224,
225, 83, 79,
79, 83, 80,
80, 83, 84,
80, 84, 78,
78, 84, 82,
82, 86, 81,
81, 86, 85,
226, 227, 228,
229, 230, 83,
83, 231, 84,
84, 232, 233,
84, 234, 82,
82, 235, 86,
93, 94, 96,
96, 94, 95,
106, 97, 105,
105, 97, 98,
107, 99, 106,
106, 99, 97,
236, 108, 237,
238, 108, 100,
108, 239, 100,
100, 240, 241,
97, 101, 98,
98, 101, 102,
97, 99, 101,
101, 99, 103,
242, 100, 243,
244, 100, 245,
246, 247, 100,
100, 248, 249,
250, 251, 93,
95, 104, 96,
109, 112, 110,
110, 112, 111,
114, 113, 121,
121, 113, 122,
113, 115, 122,
122, 115, 123,
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


//Vertices: 315  Texture Co-ords: 199  Normals: 392  Texture: LRRH Faces: 196 Smooth Groups: 98 sucess: 100 Doubles: 96 Redos needed: 127 Correct: 98