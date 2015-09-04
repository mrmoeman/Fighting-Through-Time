package com.example.jgfjhg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;
import android.graphics.Bitmap;
import android.opengl.GLUtils;

class ragnarwalka {

static String TextureName = "RagWalk1.mtl";

static int Vertices = 238;

static int VertTexts = 170;

static int Normals = 123;

static int Faces = 168;

static int FacesB = 0;

static int SmoothGroups = 16;

static float VertArray[] = new float[]{
 -2.485472f, 9.505451f, 4.797719f,
 -0.894823f, 10.397721f, 5.702991f,
 -2.153489f, 14.360959f, 6.551877f,
 -3.903872f, 12.067815f, 4.543999f,
 1.087414f, 9.488450f, 4.420930f,
 -0.273450f, 10.396094f, 5.636195f,
 1.142827f, 14.352992f, 6.198322f,
 2.425567f, 12.019497f, 3.909007f,
 -2.123818f, 10.562252f, 5.636795f,
 -2.071134f, 9.328615f, 6.114045f,
 -1.810531f, 7.206407f, 5.406102f,
 0.028788f, 5.621652f, 4.615697f,
 -0.491585f, 9.135218f, 6.501305f,
 -0.574208f, 11.385995f, 5.750896f,
 -2.928903f, 9.565895f, 4.023507f,
 -2.609081f, 10.864419f, 3.283429f,
 -0.657752f, 11.487529f, 3.414424f,
 -0.310768f, 5.434553f, 1.197373f,
 -1.991578f, 6.869634f, 2.995324f,
 -2.281839f, 3.927215f, 2.397186f,
 -2.662810f, 4.065248f, -0.276573f,
 -4.223550f, 8.922544f, 4.272390f,
 -5.403782f, 9.351125f, -0.330658f,
 -1.170498f, 9.424694f, 5.576436f,
 -0.638586f, 10.298736f, -0.358917f,
 -0.607534f, 3.246102f, -1.273152f,
 0.014174f, 2.583676f, 2.996343f,
 -5.873349f, 10.521138f, 2.501092f,
 -0.510267f, 12.319254f, 3.135277f,
 -1.698810f, 5.446161f, 2.255574f,
 -0.000923f, 5.439599f, 2.036246f,
 -1.153311f, 6.682231f, -0.499247f,
 -2.437330f, 6.223011f, 0.518170f,
 -2.474938f, 5.891682f, 1.691075f,
 -3.029367f, 3.220095f, 1.206734f,
 -0.131994f, 2.206672f, 0.515337f,
 -5.807905f, 8.940537f, 1.542439f,
 -4.549893f, 7.218406f, 1.035904f,
 -5.946642f, 6.492002f, 0.101273f,
 -7.109102f, 7.762608f, 0.241790f,
 -5.543666f, 5.819218f, 3.420635f,
 -4.714608f, 4.912678f, 2.876878f,
 -5.629230f, 4.428301f, 2.266683f,
 -6.467022f, 5.329886f, 2.813361f,
 -3.731285f, 10.336375f, 1.058247f,
 -3.944701f, 10.428504f, 3.374916f,
 -3.656115f, 8.730350f, 1.040997f,
 -3.961988f, 8.291590f, 2.813105f,
 -1.146446f, 2.072326f, 1.834654f,
 -1.064944f, 1.976041f, 3.744986f,
 -2.247124f, 2.014401f, 2.246153f,
 -2.186486f, 1.980321f, 3.663342f,
 -1.030286f, -0.001379f, 0.319163f,
 -0.889382f, -0.006646f, 4.605591f,
 -2.384117f, -0.003803f, 0.482966f,
 -2.384351f, -0.006648f, 4.550790f,
 -0.953145f, 4.127494f, 0.088214f,
 -1.869639f, 4.105067f, 0.495992f,
 -1.729549f, 4.177636f, 1.488875f,
 -0.591185f, 3.973094f, 1.234133f,
 -2.145064f, 1.050707f, 2.242113f,
 -2.197392f, 0.823414f, 0.944405f,
 -1.105065f, 0.826351f, 0.704273f,
 -1.052496f, 1.097518f, 2.287058f,
 0.912740f, 10.554058f, 5.311988f,
 0.966308f, 9.326385f, 5.783512f,
 0.562530f, 7.206746f, 5.146287f,
 0.808933f, 9.020826f, 4.408752f,
 1.024053f, 10.335124f, 3.656855f,
 0.600088f, 6.868707f, 2.694334f,
 1.974428f, 3.935923f, 1.085325f,
 1.154149f, 5.146619f, -1.476164f,
 2.474478f, 7.649976f, 4.719097f,
 3.779191f, 8.698809f, 0.339509f,
 4.318770f, 9.549565f, 3.192165f,
 1.346841f, 5.982398f, 1.132926f,
 0.563927f, 6.770005f, -0.559743f,
 1.408430f, 6.576457f, 0.257739f,
 2.301349f, 3.975078f, -0.553995f,
 4.570822f, 7.928441f, 2.154051f,
 3.859369f, 6.163052f, 1.049086f,
 4.572927f, 6.843739f, -0.511430f,
 5.210426f, 8.355858f, 0.026198f,
 6.440481f, 4.805501f, 1.476017f,
 5.745969f, 3.895667f, 0.768795f,
 6.215877f, 4.336254f, -0.256615f,
 6.913316f, 5.242169f, 0.455153f,
 2.371624f, 9.446523f, 1.687404f,
 2.163077f, 9.534478f, 3.984439f,
 1.850834f, 7.927252f, 1.608687f,
 1.667905f, 7.469114f, 3.389411f,
 0.927389f, 2.000335f, -0.802322f,
 1.218048f, 1.139756f, 0.977100f,
 2.057098f, 2.076240f, -0.544503f,
 2.278683f, 1.462535f, 0.798994f,
 1.029510f, 0.002178f, -2.679308f,
 0.889388f, -0.006621f, 1.605674f,
 2.383549f, 0.003874f, -2.519898f,
 2.384549f, -0.006857f, 1.550861f,
 -0.176496f, 4.287852f, -0.252444f,
 0.804784f, 4.625051f, -0.483820f,
 1.181854f, 4.395628f, 0.554001f,
 0.199625f, 3.990407f, 0.840409f,
 2.208300f, 1.033964f, -0.825933f,
 2.196786f, 0.825543f, -2.055837f,
 1.103121f, 0.827750f, -2.292446f,
 1.135978f, 0.898913f, -0.694270f,
 7.518154f, 8.356085f, -4.045105f,
 9.756025f, 4.635362f, -4.835722f,
 3.851049f, 4.618753f, 4.239823f,
 6.165980f, 0.897525f, 3.487672f,
 -3.531613f, 9.810520f, 3.263004f,
 -3.364407f, 4.914292f, 6.710409f,
 -8.252192f, 2.396498f, 3.287570f,
 -8.437427f, 7.338015f, -0.126884f,
 -5.873349f, 10.521138f, 2.501092f,
 -0.510267f, 12.319254f, 3.135277f,
 -0.510267f, 12.319254f, 3.135277f,
 -2.474938f, 5.891682f, 1.691075f,
 -2.474938f, 5.891682f, 1.691075f,
 -5.873349f, 10.521138f, 2.501092f,
 -3.029367f, 3.220095f, 1.206734f,
 -2.474938f, 5.891682f, 1.691075f,
 -2.474938f, 5.891682f, 1.691075f,
 -3.029367f, 3.220095f, 1.206734f,
 -0.131994f, 2.206672f, 0.515337f,
 -5.629230f, 4.428301f, 2.266683f,
 -6.467022f, 5.329886f, 2.813361f,
 -6.467022f, 5.329886f, 2.813361f,
 -5.629230f, 4.428301f, 2.266683f,
 -5.629230f, 4.428301f, 2.266683f,
 -5.946642f, 6.492002f, 0.101273f,
 -6.467022f, 5.329886f, 2.813361f,
 -6.467022f, 5.329886f, 2.813361f,
 -5.946642f, 6.492002f, 0.101273f,
 -3.656115f, 8.730350f, 1.040997f,
 -3.656115f, 8.730350f, 1.040997f,
 -1.146446f, 2.072326f, 1.834654f,
 -1.146446f, 2.072326f, 1.834654f,
 -1.105065f, 0.826351f, 0.704273f,
 -0.953145f, 4.127494f, 0.088214f,
 -1.146446f, 2.072326f, 1.834654f,
 -1.146446f, 2.072326f, 1.834654f,
 -2.197392f, 0.823414f, 0.944405f,
 -2.145064f, 1.050707f, 2.242113f,
 -2.145064f, 1.050707f, 2.242113f,
 -1.030286f, -0.001379f, 0.319163f,
 -1.105065f, 0.826351f, 0.704273f,
 -1.105065f, 0.826351f, 0.704273f,
 -2.197392f, 0.823414f, 0.944405f,
 -0.889382f, -0.006646f, 4.605591f,
 -1.030286f, -0.001379f, 0.319163f,
 -1.052496f, 1.097518f, 2.287058f,
 -1.052496f, 1.097518f, 2.287058f,
 -1.030286f, -0.001379f, 0.319163f,
 -1.105065f, 0.826351f, 0.704273f,
 -2.145064f, 1.050707f, 2.242113f,
 -1.052496f, 1.097518f, 2.287058f,
 -1.052496f, 1.097518f, 2.287058f,
 -0.889382f, -0.006646f, 4.605591f,
 0.028788f, 5.621652f, 4.615697f,
 -0.491585f, 9.135218f, 6.501305f,
 -0.491585f, 9.135218f, 6.501305f,
 -0.491585f, 9.135218f, 6.501305f,
 -0.491585f, 9.135218f, 6.501305f,
 -0.574208f, 11.385995f, 5.750896f,
 -0.657752f, 11.487529f, 3.414424f,
 -0.657752f, 11.487529f, 3.414424f,
 -0.574208f, 11.385995f, 5.750896f,
 0.028788f, 5.621652f, 4.615697f,
 0.028788f, 5.621652f, 4.615697f,
 -0.310768f, 5.434553f, 1.197373f,
 -0.510267f, 12.319254f, 3.135277f,
 -0.638586f, 10.298736f, -0.358917f,
 -0.638586f, 10.298736f, -0.358917f,
 4.318770f, 9.549565f, 3.192165f,
 -0.510267f, 12.319254f, 3.135277f,
 -0.510267f, 12.319254f, 3.135277f,
 -1.170498f, 9.424694f, 5.576436f,
 -1.153311f, 6.682231f, -0.499247f,
 -0.638586f, 10.298736f, -0.358917f,
 -0.638586f, 10.298736f, -0.358917f,
 -0.000923f, 5.439599f, 2.036246f,
 -0.000923f, 5.439599f, 2.036246f,
 0.014174f, 2.583676f, 2.996343f,
 4.318770f, 9.549565f, 3.192165f,
 1.408430f, 6.576457f, 0.257739f,
 1.408430f, 6.576457f, 0.257739f,
 -1.153311f, 6.682231f, -0.499247f,
 -1.153311f, 6.682231f, -0.499247f,
 -0.607534f, 3.246102f, -1.273152f,
 -1.170498f, 9.424694f, 5.576436f,
 -0.000923f, 5.439599f, 2.036246f,
 -0.000923f, 5.439599f, 2.036246f,
 2.301349f, 3.975078f, -0.553995f,
 1.408430f, 6.576457f, 0.257739f,
 1.408430f, 6.576457f, 0.257739f,
 0.014174f, 2.583676f, 2.996343f,
 -0.131994f, 2.206672f, 0.515337f,
 -0.131994f, 2.206672f, 0.515337f,
 2.301349f, 3.975078f, -0.553995f,
 -0.131994f, 2.206672f, 0.515337f,
 -0.607534f, 3.246102f, -1.273152f,
 -0.607534f, 3.246102f, -1.273152f,
 6.913316f, 5.242169f, 0.455153f,
 6.913316f, 5.242169f, 0.455153f,
 6.215877f, 4.336254f, -0.256615f,
 6.215877f, 4.336254f, -0.256615f,
 6.215877f, 4.336254f, -0.256615f,
 4.572927f, 6.843739f, -0.511430f,
 6.913316f, 5.242169f, 0.455153f,
 6.913316f, 5.242169f, 0.455153f,
 1.850834f, 7.927252f, 1.608687f,
 1.850834f, 7.927252f, 1.608687f,
 4.572927f, 6.843739f, -0.511430f,
 1.103121f, 0.827750f, -2.292446f,
 0.927389f, 2.000335f, -0.802322f,
 0.927389f, 2.000335f, -0.802322f,
 0.927389f, 2.000335f, -0.802322f,
 0.927389f, 2.000335f, -0.802322f,
 -0.176496f, 4.287852f, -0.252444f,
 2.208300f, 1.033964f, -0.825933f,
 2.208300f, 1.033964f, -0.825933f,
 2.196786f, 0.825543f, -2.055837f,
 2.196786f, 0.825543f, -2.055837f,
 1.103121f, 0.827750f, -2.292446f,
 1.103121f, 0.827750f, -2.292446f,
 1.029510f, 0.002178f, -2.679308f,
 1.103121f, 0.827750f, -2.292446f,
 1.029510f, 0.002178f, -2.679308f,
 1.135978f, 0.898913f, -0.694270f,
 1.135978f, 0.898913f, -0.694270f,
 1.029510f, 0.002178f, -2.679308f,
 0.889388f, -0.006621f, 1.605674f,
 2.208300f, 1.033964f, -0.825933f,
 1.135978f, 0.898913f, -0.694270f,
 1.135978f, 0.898913f, -0.694270f,
 0.889388f, -0.006621f, 1.605674f,};

static float VertArrayB[] = new float[]{};

static float[] TextArray = new float[]{
 0.210839f, -0.041423f,
 0.285887f, 0.101580f,
 0.176571f, 0.484642f,
 0.021531f, 0.163306f,
 0.210839f, -0.041423f,
 0.285887f, 0.101580f,
 0.176571f, 0.484642f,
 0.021531f, 0.163306f,
 0.092566f, 0.905169f,
 0.103424f, 0.808166f,
 0.093844f, 0.625832f,
 0.013347f, 0.528962f,
 0.013347f, 0.808166f,
 0.013347f, 0.941674f,
 0.192207f, 0.808166f,
 0.164310f, 0.929344f,
 0.013347f, 0.989437f,
 0.013347f, 0.412760f,
 0.165447f, 0.558111f,
 0.620875f, 0.595240f,
 0.893289f, 0.616672f,
 0.633892f, 0.833904f,
 0.846020f, 0.811014f,
 0.508256f, 0.857141f,
 0.999194f, 0.825257f,
 0.975622f, 0.556485f,
 0.551829f, 0.529642f,
 0.762511f, 0.879742f,
 0.968799f, 0.979409f,
 0.592427f, 0.672403f,
 0.542608f, 0.666950f,
 0.971098f, 0.678132f,
 0.889854f, 0.680554f,
 0.843077f, 0.676027f,
 0.846481f, 0.575682f,
 0.639777f, 0.472055f,
 0.356757f, 0.879728f,
 0.286059f, 0.832288f,
 0.480386f, 0.813107f,
 0.433271f, 0.853567f,
 0.350836f, 0.738776f,
 0.303186f, 0.720185f,
 0.320873f, 0.678150f,
 0.368114f, 0.697246f,
 0.443448f, 0.971941f,
 0.356050f, 0.998934f,
 0.503720f, 0.952628f,
 0.274924f, 0.967028f,
 0.230404f, 0.625207f,
 0.363360f, 0.611016f,
 0.276621f, 0.620714f,
 0.326923f, 0.611250f,
 0.843016f, 0.589495f,
 0.732209f, 0.478687f,
 0.806926f, 0.616705f,
 0.702961f, 0.512947f,
 0.171796f, 0.511290f,
 0.236933f, 0.493612f,
 0.323008f, 0.501337f,
 0.400130f, 0.507294f,
 0.314087f, 0.670139f,
 0.271059f, 0.699000f,
 0.224680f, 0.698634f,
 0.365599f, 0.674181f,
 0.092566f, 0.905169f,
 0.103424f, 0.808166f,
 0.093844f, 0.625832f,
 0.192207f, 0.808166f,
 0.164310f, 0.929344f,
 0.165447f, 0.558111f,
 0.620875f, 0.595240f,
 0.893289f, 0.616672f,
 0.633892f, 0.833904f,
 0.846020f, 0.811014f,
 0.762511f, 0.879742f,
 0.592427f, 0.672403f,
 0.889854f, 0.680554f,
 0.843077f, 0.676027f,
 0.846481f, 0.575682f,
 0.356757f, 0.879728f,
 0.286059f, 0.832288f,
 0.480386f, 0.813107f,
 0.433271f, 0.853567f,
 0.350836f, 0.738776f,
 0.303186f, 0.720185f,
 0.320873f, 0.678150f,
 0.368114f, 0.697246f,
 0.443448f, 0.971941f,
 0.356050f, 0.998934f,
 0.503720f, 0.952628f,
 0.274924f, 0.967028f,
 0.230404f, 0.625207f,
 0.363360f, 0.611016f,
 0.276621f, 0.620714f,
 0.326923f, 0.611250f,
 0.843016f, 0.589495f,
 0.732209f, 0.478687f,
 0.806926f, 0.616705f,
 0.702961f, 0.512947f,
 0.171796f, 0.511290f,
 0.236933f, 0.493612f,
 0.323008f, 0.501337f,
 0.400130f, 0.507294f,
 0.314087f, 0.670139f,
 0.271059f, 0.699000f,
 0.224680f, 0.698634f,
 0.365599f, 0.674181f,
 0.276795f, 0.002094f,
 0.555656f, 0.002094f,
 0.276795f, 0.471994f,
 0.555656f, 0.471994f,
 0.569079f, 0.470162f,
 0.997072f, 0.470162f,
 0.997072f, 0.002210f,
 0.569079f, 0.002210f,
 0.746989f, 0.877263f,
 0.555582f, 0.992492f,
 0.555582f, 0.992492f,
 0.661126f, 0.677823f,
 0.661126f, 0.677823f,
 0.746989f, 0.877263f,
 0.671984f, 0.579828f,
 0.661126f, 0.677823f,
 0.661126f, 0.677823f,
 0.671984f, 0.579828f,
 0.912281f, 0.487364f,
 0.440542f, 0.704543f,
 0.397521f, 0.732265f,
 0.397521f, 0.732265f,
 0.258556f, 0.708240f,
 0.258556f, 0.708240f,
 0.218498f, 0.814911f,
 0.397521f, 0.732265f,
 0.397521f, 0.732265f,
 0.218498f, 0.814911f,
 0.206379f, 0.950997f,
 0.206379f, 0.950997f,
 0.424695f, 0.637310f,
 0.424695f, 0.637310f,
 0.420018f, 0.712424f,
 0.489396f, 0.525040f,
 0.424695f, 0.637310f,
 0.424695f, 0.637310f,
 0.775316f, 0.625800f,
 0.731916f, 0.600795f,
 0.731916f, 0.600795f,
 0.817299f, 0.659726f,
 0.785650f, 0.664322f,
 0.785650f, 0.664322f,
 0.775316f, 0.625800f,
 0.773592f, 0.809902f,
 0.817299f, 0.659726f,
 0.756028f, 0.715566f,
 0.756028f, 0.715566f,
 0.817299f, 0.659726f,
 0.785650f, 0.664322f,
 0.731916f, 0.600795f,
 0.692441f, 0.608961f,
 0.692441f, 0.608961f,
 0.661792f, 0.529129f,
 0.013347f, 0.528962f,
 0.013347f, 0.808166f,
 0.013347f, 0.808166f,
 0.013347f, 0.808166f,
 0.013347f, 0.808166f,
 0.013347f, 0.941674f,
 0.013347f, 0.989437f,
 0.013347f, 0.989437f,
 0.013347f, 0.941674f,
 0.013347f, 0.528962f,
 0.013347f, 0.528962f,
 0.013347f, 0.412760f,
 0.968799f, 0.979409f,
 0.999194f, 0.825257f,
 0.999194f, 0.825257f,
 0.746989f, 0.877263f,
 0.555582f, 0.992492f,
 0.555582f, 0.992492f,
 0.508256f, 0.857141f,
 0.971098f, 0.678132f,
 0.999194f, 0.825257f,
 0.999194f, 0.825257f,
 0.542608f, 0.666950f,
 0.542608f, 0.666950f,
 0.551829f, 0.529642f,
 0.746989f, 0.877263f,
 0.661126f, 0.677823f,
 0.661126f, 0.677823f,
 0.971098f, 0.678132f,
 0.971098f, 0.678132f,
 0.975622f, 0.556485f,
 0.508256f, 0.857141f,
 0.542608f, 0.666950f,
 0.542608f, 0.666950f,
 0.671984f, 0.579828f,
 0.661126f, 0.677823f,
 0.661126f, 0.677823f,
 0.551829f, 0.529642f,
 0.639777f, 0.472055f,
 0.639777f, 0.472055f,
 0.671984f, 0.579828f,
 0.912281f, 0.487364f,
 0.975622f, 0.556485f,
 0.975622f, 0.556485f,
 0.397521f, 0.732265f,
 0.397521f, 0.732265f,
 0.440542f, 0.704543f,
 0.258556f, 0.708240f,
 0.258556f, 0.708240f,
 0.218498f, 0.814911f,
 0.397521f, 0.732265f,
 0.397521f, 0.732265f,
 0.206379f, 0.950997f,
 0.206379f, 0.950997f,
 0.218498f, 0.814911f,
 0.420018f, 0.712424f,
 0.424695f, 0.637310f,
 0.424695f, 0.637310f,
 0.424695f, 0.637310f,
 0.424695f, 0.637310f,
 0.489396f, 0.525040f,
 0.731916f, 0.600795f,
 0.731916f, 0.600795f,
 0.775316f, 0.625800f,
 0.775316f, 0.625800f,
 0.785650f, 0.664322f,
 0.785650f, 0.664322f,
 0.817299f, 0.659726f,
 0.785650f, 0.664322f,
 0.817299f, 0.659726f,
 0.756028f, 0.715566f,
 0.756028f, 0.715566f,
 0.817299f, 0.659726f,
 0.773592f, 0.809902f,
 0.731916f, 0.600795f,
 0.692441f, 0.608961f,
 0.692441f, 0.608961f,
 0.661792f, 0.529129f,};

static float[] TextArrayB = new float[]{};

static float[][] NormArray = new float[][]{
{ -0.425591f, -0.147177f, 0.892867f},
{ -0.472650f, -0.269275f, 0.839102f},
{ -0.481977f, -0.296125f, 0.824626f},
{ -0.492878f, -0.329056f, 0.805477f},
{ 0.597560f, -0.156887f, 0.786326f},
{ 0.634961f, -0.296817f, 0.713249f},
{ 0.629377f, -0.271835f, 0.728005f},
{ 0.641232f, -0.328060f, 0.693684f},
{ 0.049025f, -0.923131f, 0.381347f},
{ 0.091642f, -0.125173f, 0.987893f},
{ -0.594812f, -0.565860f, 0.570965f},
{ -0.687684f, -0.103925f, 0.718534f},
{ -0.591973f, 0.615219f, 0.520648f},
{ 0.044256f, 0.836962f, 0.545469f},
{ -0.963940f, -0.080656f, 0.253601f},
{ -0.545848f, 0.809435f, 0.216483f},
{ -0.002745f, 0.996648f, 0.081762f},
{ -0.719885f, -0.682744f, 0.125006f},
{ -0.099216f, -0.992992f, 0.064206f},
{ 0.128383f, 0.991282f, 0.029626f},
{ 0.095399f, 0.628475f, -0.771957f},
{ -0.837067f, 0.539084f, 0.093314f},
{ -0.673879f, 0.083261f, -0.734135f},
{ -0.575878f, -0.167376f, 0.800219f},
{ -0.070220f, -0.018651f, 0.997357f},
{ -0.389204f, 0.160987f, -0.906975f},
{ -0.488659f, -0.228389f, -0.842052f},
{ -0.852681f, -0.491953f, 0.175831f},
{ 0.159513f, -0.547778f, 0.821276f},
{ 0.141284f, -0.464465f, 0.874249f},
{ -0.460186f, -0.301534f, 0.835049f},
{ -0.091576f, -0.358421f, 0.929058f},
{ -0.724358f, -0.069430f, -0.685919f},
{ -0.766401f, -0.632595f, 0.111590f},
{ -0.181489f, -0.454106f, -0.872267f},
{ 0.061508f, -0.987674f, -0.143931f},
{ 0.163847f, 0.351577f, 0.921709f},
{ -0.925430f, -0.165197f, 0.341011f},
{ 0.925250f, -0.331724f, 0.184041f},
{ 0.016790f, -0.884322f, -0.466576f},
{ -0.035381f, -0.420283f, -0.906703f},
{ -0.883027f, 0.274470f, -0.380695f},
{ -0.667510f, 0.557770f, 0.493278f},
{ -0.375303f, 0.711756f, -0.593760f},
{ -0.778778f, 0.484575f, 0.398362f},
{ 0.946134f, -0.316142f, 0.069897f},
{ 0.448159f, -0.096833f, -0.888694f},
{ -0.424488f, -0.502626f, 0.753112f},
{ -0.942341f, 0.096444f, -0.320456f},
{ -0.644498f, -0.434845f, -0.628913f},
{ 0.755097f, -0.246786f, -0.607392f},
{ 0.183688f, -0.646508f, -0.740464f},
{ -0.449411f, 0.708502f, 0.544109f},
{ -0.532197f, 0.241329f, 0.811497f},
{ 0.526956f, 0.173647f, 0.831964f},
{ 0.958259f, 0.190119f, 0.213530f},
{ 0.956709f, 0.209542f, 0.201989f},
{ 0.521839f, 0.521363f, -0.675178f},
{ -0.598781f, 0.549734f, -0.582455f},
{ -0.934205f, 0.250385f, 0.254102f},
{ 0.001635f, -0.999998f, -0.001282f},
{ 0.000353f, -1.000000f, -0.000818f},
{ 0.001293f, -0.999999f, -0.001158f},
{ 0.000027f, -1.000000f, -0.000699f},
{ -0.840137f, 0.380744f, -0.386270f},
{ -0.329552f, 0.866053f, 0.375963f},
{ 0.829405f, 0.281483f, -0.482551f},
{ 0.328356f, 0.861546f, 0.387197f},
{ 0.827943f, -0.332333f, 0.451735f},
{ 0.793287f, -0.077934f, 0.603840f},
{ 0.732935f, 0.568768f, 0.373242f},
{ 0.819468f, 0.572753f, -0.020650f},
{ 0.992772f, -0.119728f, -0.008352f},
{ 0.924779f, -0.380187f, -0.015552f},
{ 0.858509f, 0.454190f, 0.238064f},
{ 0.739121f, 0.308266f, -0.598893f},
{ 0.419799f, -0.336330f, 0.843001f},
{ 0.188859f, 0.161111f, -0.968698f},
{ 0.882445f, -0.410139f, -0.230386f},
{ 0.857670f, -0.409179f, 0.311408f},
{ 0.850470f, -0.251728f, 0.461880f},
{ 0.847928f, -0.352598f, -0.395844f},
{ 0.225934f, 0.145747f, -0.963178f},
{ 0.334465f, -0.213384f, 0.917933f},
{ -0.491007f, -0.849540f, 0.192858f},
{ 0.946352f, 0.291436f, -0.139582f},
{ -0.041378f, -0.446403f, -0.893875f},
{ 0.514231f, 0.771186f, -0.375285f},
{ -0.294399f, -0.028587f, -0.955255f},
{ 0.678150f, 0.216119f, 0.702428f},
{ 0.632009f, 0.226216f, 0.741209f},
{ 0.255026f, 0.880307f, -0.400026f},
{ -0.553973f, -0.795476f, 0.245626f},
{ -0.678830f, -0.275108f, -0.680813f},
{ 0.185308f, -0.664700f, 0.723764f},
{ -0.818445f, -0.273485f, -0.505326f},
{ 0.407444f, 0.336185f, -0.849099f},
{ -0.814057f, -0.010417f, -0.580691f},
{ 0.789186f, 0.441695f, -0.426721f},
{ 0.797631f, 0.385861f, 0.463568f},
{ 0.748832f, -0.060531f, 0.659990f},
{ -0.665678f, -0.277847f, 0.692585f},
{ -0.545722f, -0.473780f, 0.691173f},
{ -0.524048f, 0.583659f, -0.620255f},
{ -0.961841f, 0.200626f, 0.186040f},
{ 0.509548f, 0.646205f, -0.568137f},
{ 0.959669f, 0.239103f, 0.147870f},
{ -0.000255f, -0.999996f, -0.002636f},
{ 0.000098f, -0.999997f, -0.002508f},
{ 0.001117f, -0.999997f, -0.002139f},
{ 0.001489f, -0.999997f, -0.002005f},
{ 0.296013f, 0.892142f, 0.341262f},
{ 0.843435f, 0.355940f, -0.402397f},
{ -0.768518f, 0.361877f, -0.527660f},
{ -0.243036f, 0.911180f, 0.332693f},
{ -0.784077f, -0.364909f, -0.502060f},
{ -0.775307f, -0.373684f, -0.509175f},
{ -0.780852f, -0.368164f, -0.504704f},
{ -0.772073f, -0.376862f, -0.511740f},
{ -0.649661f, 0.422709f, 0.631869f},
{ -0.652739f, 0.417356f, 0.632255f},
{ -0.652462f, 0.417839f, 0.632221f},
{ -0.655487f, 0.412526f, 0.632582f}};

static int[] FaceArray = new int[]{
0, 1, 3,
3, 1, 2,
4, 7, 5,
5, 7, 6,
11, 12, 10,
10, 12, 9,
9, 12, 8,
8, 12, 13,
9, 8, 14,
14, 8, 15,
13, 16, 8,
8, 16, 15,
10, 18, 11,
11, 18, 17,
9, 14, 10,
10, 14, 18,
28, 24, 27,
27, 24, 22,
115, 21, 116,
117, 21, 23,
31, 32, 24,
24, 32, 22,
27, 22, 33,
33, 22, 32,
26, 30, 19,
19, 30, 29,
29, 21, 118,
119, 21, 120,
32, 20, 33,
33, 20, 34,
25, 20, 31,
31, 20, 32,
23, 21, 30,
30, 21, 29,
121, 19, 122,
123, 19, 29,
124, 35, 19,
19, 35, 26,
20, 25, 34,
34, 25, 125,
40, 43, 41,
41, 43, 42,
126, 127, 38,
38, 128, 39,
39, 36, 44,
44, 36, 45,
41, 37, 40,
40, 37, 36,
41, 129, 37,
37, 130, 131,
39, 132, 36,
36, 133, 40,
38, 39, 46,
46, 39, 44,
37, 47, 36,
36, 47, 45,
134, 135, 37,
37, 136, 47,
50, 57, 48,
48, 57, 56,
57, 50, 58,
58, 50, 51,
51, 49, 58,
58, 49, 59,
49, 63, 137,
138, 63, 139,
62, 61, 48,
48, 61, 50,
60, 63, 51,
51, 63, 49,
51, 50, 60,
60, 50, 61,
52, 53, 54,
54, 53, 55,
140, 59, 141,
142, 59, 49,
143, 54, 144,
145, 54, 55,
146, 54, 147,
148, 54, 149,
150, 151, 152,
153, 154, 155,
156, 55, 157,
158, 55, 159,
160, 66, 161,
162, 66, 65,
65, 64, 163,
164, 64, 165,
68, 64, 67,
67, 64, 65,
68, 166, 64,
64, 167, 168,
66, 169, 69,
69, 170, 171,
69, 67, 66,
66, 67, 65,
172, 74, 173,
174, 74, 73,
175, 176, 72,
72, 177, 178,
179, 180, 76,
76, 181, 73,
76, 73, 77,
77, 73, 74,
75, 182, 70,
70, 183, 184,
185, 72, 186,
187, 72, 75,
78, 71, 77,
77, 71, 76,
76, 71, 188,
189, 71, 190,
191, 192, 72,
72, 193, 75,
194, 195, 70,
70, 196, 75,
197, 198, 70,
70, 199, 200,
201, 202, 78,
78, 203, 71,
83, 84, 86,
86, 84, 85,
82, 204, 81,
81, 205, 206,
88, 79, 87,
87, 79, 82,
79, 80, 83,
83, 80, 84,
84, 80, 207,
208, 80, 209,
82, 79, 210,
211, 79, 83,
87, 82, 89,
89, 82, 81,
88, 90, 79,
79, 90, 80,
90, 212, 80,
80, 213, 214,
99, 100, 91,
91, 100, 93,
100, 101, 93,
93, 101, 94,
102, 92, 101,
101, 92, 94,
215, 106, 216,
217, 106, 92,
93, 104, 91,
91, 104, 105,
92, 106, 94,
94, 106, 103,
94, 103, 93,
93, 103, 104,
98, 96, 97,
97, 96, 95,
92, 102, 218,
219, 102, 220,
98, 97, 221,
222, 97, 223,
224, 97, 225,
226, 97, 227,
228, 229, 230,
231, 232, 233,
234, 235, 98,
98, 236, 237,
108, 110, 107,
107, 110, 109,
111, 114, 112,
112, 114, 113, };

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


//Vertices: 238  Texture Co-ords: 170  Normals: 123  Texture: RagWalk1.mtl Faces: 168 Smooth Groups: 16 sucess: 92 Doubles: 76 Redos needed: 123 Correct: 105