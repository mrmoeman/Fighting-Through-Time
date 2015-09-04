package com.example.jgfjhg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;
import android.graphics.Bitmap;
import android.opengl.GLUtils;

class luchdeathf {

static String TextureName = "V2";

static int Vertices = 342;

static int VertTexts = 202;

static int Normals = 304;

static int Faces = 196;

static int FacesB = 30;

static int SmoothGroups = 94;

static float VertArray[] = new float[]{
 1.281538f, -0.361130f, -9.840343f,
 -1.258078f, -0.178133f, -9.981465f,
 1.329726f, 0.024302f, -11.650312f,
 -1.181165f, -0.002723f, -11.790091f,
 1.024425f, 3.535316f, -11.769098f,
 -1.640659f, 2.917080f, -11.763787f,
 0.719261f, 3.768430f, -9.911650f,
 -1.705836f, 3.095760f, -10.002378f,
 0.608977f, 3.430844f, -7.106876f,
 -0.646103f, 3.186717f, -6.950498f,
 -0.233240f, 0.818228f, -7.705708f,
 0.950452f, 0.934068f, -7.090928f,
 1.166114f, 0.717772f, -12.246215f,
 0.145807f, 0.949152f, -12.212470f,
 0.047058f, 2.694590f, -12.224828f,
 1.029393f, 3.134367f, -12.263325f,
 1.138422f, 0.436380f, -13.467884f,
 -0.303885f, 0.938927f, -13.421772f,
 -0.399016f, 2.620397f, -13.433678f,
 0.972969f, 3.360839f, -13.488590f,
 1.063570f, 0.668337f, -15.201509f,
 0.107821f, 0.849946f, -14.951370f,
 0.000312f, 2.750212f, -14.964824f,
 0.926820f, 3.085452f, -15.218623f,
 -0.544669f, 1.148537f, -5.061904f,
 -1.562188f, 1.261278f, -5.156439f,
 -1.720938f, 0.044455f, -4.898906f,
 -0.703419f, -0.068286f, -4.804372f,
 -0.473769f, 3.512763f, -1.388700f,
 -2.251720f, 3.601033f, -1.730185f,
 -2.412547f, 1.094042f, -1.540867f,
 -0.634634f, 1.005774f, -1.199391f,
 -1.198693f, -0.133328f, 1.204001f,
 -2.805647f, -0.053547f, 0.895360f,
 -2.282780f, 0.284788f, -0.826775f,
 -1.061079f, 0.224134f, -0.592128f,
 -3.399704f, 0.507437f, -12.287266f,
 -1.617263f, 0.028313f, -13.241415f,
 -2.671683f, 1.398706f, -11.374804f,
 -1.093450f, 0.974473f, -12.219640f,
 -3.349751f, 0.964510f, -14.216102f,
 -2.773362f, 0.897611f, -13.898332f,
 -3.222178f, 1.664625f, -14.300105f,
 -2.798692f, 1.615472f, -14.066631f,
 -2.881276f, 0.344121f, -16.213618f,
 -1.629164f, 0.198791f, -15.523310f,
 -2.684167f, 1.425848f, -16.343409f,
 -1.649580f, 1.305766f, -15.773026f,
 -2.249590f, 0.107683f, -17.409177f,
 -0.997478f, -0.037647f, -16.718870f,
 -2.052482f, 1.189409f, -17.538968f,
 -1.017895f, 1.069327f, -16.968584f,
 -1.586809f, 4.150268f, -1.947588f,
 -0.595703f, 4.026745f, -7.409957f,
 -4.684597f, 0.935195f, -7.889530f,
 -7.366976f, 0.166884f, 0.444608f,
 3.678517f, 0.498788f, -9.705883f,
 3.755430f, 0.674197f, -11.514510f,
 1.943310f, 0.953327f, -15.016788f,
 1.835836f, 2.853594f, -15.030243f,
 2.932415f, 3.448286f, -11.931545f,
 3.230759f, 3.772681f, -9.726796f,
 2.395581f, -0.072425f, 1.072156f,
 4.030547f, 0.017883f, 1.123694f,
 3.888527f, 0.477988f, -0.643151f,
 2.645529f, 0.409330f, -0.682334f,
 2.342384f, 3.271150f, -6.831163f,
 1.701788f, 0.948260f, -7.449331f,
 2.153841f, 1.062251f, -12.284037f,
 2.055092f, 2.807690f, -12.296395f,
 2.514884f, 1.097690f, -13.522235f,
 2.419753f, 2.779160f, -13.534140f,
 2.852382f, 1.285779f, -4.858917f,
 1.837455f, 1.412218f, -4.754381f,
 2.735592f, 0.080211f, -4.534651f,
 1.720664f, 0.206651f, -4.430116f,
 4.024905f, 3.848916f, -1.301060f,
 2.215961f, 3.748997f, -1.358083f,
 4.162372f, 1.333826f, -1.254879f,
 2.353467f, 1.233909f, -1.311900f,
 4.815055f, 3.361347f, -11.875619f,
 4.592343f, 1.621923f, -12.990006f,
 3.634941f, 3.001888f, -11.078700f,
 3.437745f, 1.461743f, -12.065416f,
 4.399729f, 3.262993f, -14.051527f,
 4.243626f, 2.941989f, -13.494513f,
 3.731488f, 3.518632f, -14.091477f,
 3.616796f, 3.282784f, -13.682224f,
 4.219166f, 1.747008f, -15.556056f,
 3.880059f, 1.049680f, -14.346027f,
 3.186687f, 2.141988f, -15.617781f,
 2.906492f, 1.565805f, -14.617968f,
 3.484776f, -0.038315f, -15.083803f,
 3.823883f, 0.659012f, -16.293833f,
 2.791405f, 1.053994f, -16.355558f,
 2.511210f, 0.477810f, -15.355743f,
 4.610144f, 3.879048f, -8.351502f,
 6.393622f, 2.416749f, -2.745182f,
 -6.059947f, 0.319439f, -2.465888f,
 -0.883944f, 2.854334f, -5.481736f,
 5.663795f, 2.700539f, -5.794880f,
 -3.283764f, 3.335046f, -9.966824f,
 -0.587356f, 3.794594f, -9.601819f,
 3.448202f, 3.749713f, -10.307095f,
 -1.258078f, -0.178133f, -9.981465f,
 -0.233240f, 0.818228f, -7.705708f,
 -0.233240f, 0.818228f, -7.705708f,
 0.950452f, 0.934068f, -7.090928f,
 -1.640659f, 2.917080f, -11.763787f,
 -1.640659f, 2.917080f, -11.763787f,
 0.047058f, 2.694590f, -12.224828f,
 -1.640659f, 2.917080f, -11.763787f,
 1.024425f, 3.535316f, -11.769098f,
 0.047058f, 2.694590f, -12.224828f,
 0.047058f, 2.694590f, -12.224828f,
 1.024425f, 3.535316f, -11.769098f,
 1.029393f, 3.134367f, -12.263325f,
 1.166114f, 0.717772f, -12.246215f,
 0.145807f, 0.949152f, -12.212470f,
 0.145807f, 0.949152f, -12.212470f,
 -0.303885f, 0.938927f, -13.421772f,
 0.145807f, 0.949152f, -12.212470f,
 0.047058f, 2.694590f, -12.224828f,
 0.047058f, 2.694590f, -12.224828f,
 -0.399016f, 2.620397f, -13.433678f,
 -0.303885f, 0.938927f, -13.421772f,
 -0.399016f, 2.620397f, -13.433678f,
 0.608977f, 3.430844f, -7.106876f,
 -0.646103f, 3.186717f, -6.950498f,
 -0.646103f, 3.186717f, -6.950498f,
 -0.646103f, 3.186717f, -6.950498f,
 -0.233240f, 0.818228f, -7.705708f,
 -1.562188f, 1.261278f, -5.156439f,
 -1.562188f, 1.261278f, -5.156439f,
 -0.233240f, 0.818228f, -7.705708f,
 0.950452f, 0.934068f, -7.090928f,
 -0.703419f, -0.068286f, -4.804372f,
 -0.233240f, 0.818228f, -7.705708f,
 -0.233240f, 0.818228f, -7.705708f,
 -0.703419f, -0.068286f, -4.804372f,
 0.608977f, 3.430844f, -7.106876f,
 -1.562188f, 1.261278f, -5.156439f,
 -1.562188f, 1.261278f, -5.156439f,
 -2.251720f, 3.601033f, -1.730185f,
 -0.703419f, -0.068286f, -4.804372f,
 -0.703419f, -0.068286f, -4.804372f,
 -0.634634f, 1.005774f, -1.199391f,
 -0.473769f, 3.512763f, -1.388700f,
 -2.251720f, 3.601033f, -1.730185f,
 -2.251720f, 3.601033f, -1.730185f,
 -2.251720f, 3.601033f, -1.730185f,
 -2.805647f, -0.053547f, 0.895360f,
 -2.805647f, -0.053547f, 0.895360f,
 -2.282780f, 0.284788f, -0.826775f,
 -2.412547f, 1.094042f, -1.540867f,
 -0.634634f, 1.005774f, -1.199391f,
 -0.634634f, 1.005774f, -1.199391f,
 -1.198693f, -0.133328f, 1.204001f,
 -1.198693f, -0.133328f, 1.204001f,
 -1.061079f, 0.224134f, -0.592128f,
 -1.705836f, 3.095760f, -10.002378f,
 -3.399704f, 0.507437f, -12.287266f,
 -1.258078f, -0.178133f, -9.981465f,
 -1.258078f, -0.178133f, -9.981465f,
 -3.399704f, 0.507437f, -12.287266f,
 -1.705836f, 3.095760f, -10.002378f,
 -1.640659f, 2.917080f, -11.763787f,
 -3.399704f, 0.507437f, -12.287266f,
 -1.640659f, 2.917080f, -11.763787f,
 -3.399704f, 0.507437f, -12.287266f,
 -1.640659f, 2.917080f, -11.763787f,
 -1.258078f, -0.178133f, -9.981465f,
 -1.617263f, 0.028313f, -13.241415f,
 -2.671683f, 1.398706f, -11.374804f,
 -3.399704f, 0.507437f, -12.287266f,
 -3.399704f, 0.507437f, -12.287266f,
 -3.349751f, 0.964510f, -14.216102f,
 -1.093450f, 0.974473f, -12.219640f,
 -2.671683f, 1.398706f, -11.374804f,
 -2.671683f, 1.398706f, -11.374804f,
 -1.093450f, 0.974473f, -12.219640f,
 -1.617263f, 0.028313f, -13.241415f,
 -1.617263f, 0.028313f, -13.241415f,
 -3.349751f, 0.964510f, -14.216102f,
 -2.881276f, 0.344121f, -16.213618f,
 -2.881276f, 0.344121f, -16.213618f,
 -1.629164f, 0.198791f, -15.523310f,
 -2.881276f, 0.344121f, -16.213618f,
 -2.881276f, 0.344121f, -16.213618f,
 -2.881276f, 0.344121f, -16.213618f,
 -2.684167f, 1.425848f, -16.343409f,
 -2.684167f, 1.425848f, -16.343409f,
 -1.649580f, 1.305766f, -15.773026f,
 -2.684167f, 1.425848f, -16.343409f,
 -2.684167f, 1.425848f, -16.343409f,
 -1.629164f, 0.198791f, -15.523310f,
 -1.649580f, 1.305766f, -15.773026f,
 -1.649580f, 1.305766f, -15.773026f,
 1.024425f, 3.535316f, -11.769098f,
 -1.640659f, 2.917080f, -11.763787f,
 -1.640659f, 2.917080f, -11.763787f,
 3.678517f, 0.498788f, -9.705883f,
 1.701788f, 0.948260f, -7.449331f,
 1.701788f, 0.948260f, -7.449331f,
 0.950452f, 0.934068f, -7.090928f,
 2.932415f, 3.448286f, -11.931545f,
 2.932415f, 3.448286f, -11.931545f,
 2.055092f, 2.807690f, -12.296395f,
 2.932415f, 3.448286f, -11.931545f,
 2.055092f, 2.807690f, -12.296395f,
 1.024425f, 3.535316f, -11.769098f,
 1.024425f, 3.535316f, -11.769098f,
 2.055092f, 2.807690f, -12.296395f,
 1.029393f, 3.134367f, -12.263325f,
 1.166114f, 0.717772f, -12.246215f,
 2.153841f, 1.062251f, -12.284037f,
 2.153841f, 1.062251f, -12.284037f,
 2.514884f, 1.097690f, -13.522235f,
 2.419753f, 2.779160f, -13.534140f,
 2.153841f, 1.062251f, -12.284037f,
 2.153841f, 1.062251f, -12.284037f,
 2.419753f, 2.779160f, -13.534140f,
 2.055092f, 2.807690f, -12.296395f,
 2.514884f, 1.097690f, -13.522235f,
 2.419753f, 2.779160f, -13.534140f,
 2.419753f, 2.779160f, -13.534140f,
 0.608977f, 3.430844f, -7.106876f,
 2.342384f, 3.271150f, -6.831163f,
 2.342384f, 3.271150f, -6.831163f,
 2.342384f, 3.271150f, -6.831163f,
 2.852382f, 1.285779f, -4.858917f,
 1.701788f, 0.948260f, -7.449331f,
 1.701788f, 0.948260f, -7.449331f,
 2.852382f, 1.285779f, -4.858917f,
 1.701788f, 0.948260f, -7.449331f,
 1.701788f, 0.948260f, -7.449331f,
 0.950452f, 0.934068f, -7.090928f,
 1.720664f, 0.206651f, -4.430116f,
 0.950452f, 0.934068f, -7.090928f,
 0.950452f, 0.934068f, -7.090928f,
 0.608977f, 3.430844f, -7.106876f,
 4.024905f, 3.848916f, -1.301060f,
 2.852382f, 1.285779f, -4.858917f,
 2.852382f, 1.285779f, -4.858917f,
 1.720664f, 0.206651f, -4.430116f,
 2.353467f, 1.233909f, -1.311900f,
 2.353467f, 1.233909f, -1.311900f,
 2.215961f, 3.748997f, -1.358083f,
 4.024905f, 3.848916f, -1.301060f,
 4.024905f, 3.848916f, -1.301060f,
 4.024905f, 3.848916f, -1.301060f,
 4.030547f, 0.017883f, 1.123694f,};

static float VertArrayB[] = new float[]{
 4.162372f, 1.333826f, -1.254879f,
 4.030547f, 0.017883f, 1.123694f,
 3.888527f, 0.477988f, -0.643151f,
 3.888527f, 0.477988f, -0.643151f,
 2.645529f, 0.409330f, -0.682334f,
 4.162372f, 1.333826f, -1.254879f,
 4.162372f, 1.333826f, -1.254879f,
 2.645529f, 0.409330f, -0.682334f,
 2.353467f, 1.233909f, -1.311900f,
 2.645529f, 0.409330f, -0.682334f,
 2.395581f, -0.072425f, 1.072156f,
 2.353467f, 1.233909f, -1.311900f,
 2.353467f, 1.233909f, -1.311900f,
 2.395581f, -0.072425f, 1.072156f,
 2.215961f, 3.748997f, -1.358083f,
 4.592343f, 1.621923f, -12.990006f,
 4.815055f, 3.361347f, -11.875619f,
 3.678517f, 0.498788f, -9.705883f,
 3.678517f, 0.498788f, -9.705883f,
 4.815055f, 3.361347f, -11.875619f,
 3.230759f, 3.772681f, -9.726796f,
 4.815055f, 3.361347f, -11.875619f,
 3.634941f, 3.001888f, -11.078700f,
 3.230759f, 3.772681f, -9.726796f,
 3.230759f, 3.772681f, -9.726796f,
 3.634941f, 3.001888f, -11.078700f,
 2.932415f, 3.448286f, -11.931545f,
 2.932415f, 3.448286f, -11.931545f,
 3.634941f, 3.001888f, -11.078700f,
 3.755430f, 0.674197f, -11.514510f,
 3.755430f, 0.674197f, -11.514510f,
 4.592343f, 1.621923f, -12.990006f,
 3.678517f, 0.498788f, -9.705883f,
 4.592343f, 1.621923f, -12.990006f,
 4.243626f, 2.941989f, -13.494513f,
 4.815055f, 3.361347f, -11.875619f,
 4.399729f, 3.262993f, -14.051527f,
 3.731488f, 3.518632f, -14.091477f,
 4.815055f, 3.361347f, -11.875619f,
 4.815055f, 3.361347f, -11.875619f,
 3.731488f, 3.518632f, -14.091477f,
 3.634941f, 3.001888f, -11.078700f,
 3.731488f, 3.518632f, -14.091477f,
 3.616796f, 3.282784f, -13.682224f,
 3.634941f, 3.001888f, -11.078700f,
 3.634941f, 3.001888f, -11.078700f,
 3.616796f, 3.282784f, -13.682224f,
 3.437745f, 1.461743f, -12.065416f,
 3.437745f, 1.461743f, -12.065416f,
 3.616796f, 3.282784f, -13.682224f,
 4.592343f, 1.621923f, -12.990006f,
 4.592343f, 1.621923f, -12.990006f,
 3.616796f, 3.282784f, -13.682224f,
 4.243626f, 2.941989f, -13.494513f,
 4.399729f, 3.262993f, -14.051527f,
 4.219166f, 1.747008f, -15.556056f,
 3.731488f, 3.518632f, -14.091477f,
 3.731488f, 3.518632f, -14.091477f,
 4.219166f, 1.747008f, -15.556056f,
 3.186687f, 2.141988f, -15.617781f,
 3.823883f, 0.659012f, -16.293833f,
 3.484776f, -0.038315f, -15.083803f,
 4.219166f, 1.747008f, -15.556056f,
 4.219166f, 1.747008f, -15.556056f,
 3.484776f, -0.038315f, -15.083803f,
 3.880059f, 1.049680f, -14.346027f,
 2.791405f, 1.053994f, -16.355558f,
 3.823883f, 0.659012f, -16.293833f,
 3.186687f, 2.141988f, -15.617781f,
 3.186687f, 2.141988f, -15.617781f,
 3.823883f, 0.659012f, -16.293833f,
 4.219166f, 1.747008f, -15.556056f,
 2.906492f, 1.565805f, -14.617968f,
 2.511210f, 0.477810f, -15.355743f,
 3.186687f, 2.141988f, -15.617781f,
 3.186687f, 2.141988f, -15.617781f,
 2.511210f, 0.477810f, -15.355743f,
 2.791405f, 1.053994f, -16.355558f,
 3.880059f, 1.049680f, -14.346027f,
 3.484776f, -0.038315f, -15.083803f,
 2.906492f, 1.565805f, -14.617968f,
 2.906492f, 1.565805f, -14.617968f,
 3.484776f, -0.038315f, -15.083803f,
 2.511210f, 0.477810f, -15.355743f,
 -0.587356f, 3.794594f, -9.601819f,
 3.448202f, 3.749713f, -10.307095f,
 1.024425f, 3.535316f, -11.769098f,
 1.024425f, 3.535316f, -11.769098f,
 3.448202f, 3.749713f, -10.307095f,
 2.932415f, 3.448286f, -11.931545f,};

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
 0.410299f, 0.793373f,
 0.397838f, 0.222717f,
 0.847778f, 0.681378f,
 0.850454f, 0.639527f,
 0.519240f, 0.376645f,
 0.661486f, 0.569087f,
 0.322042f, 0.569516f,
 0.380364f, 0.437885f,
 0.540277f, 0.437890f,
 0.599213f, 0.569510f,
 0.408358f, 0.569764f,
 0.396173f, 0.513666f,
 0.524463f, 0.513667f,
 0.513269f, 0.569764f,
 0.324047f, 0.138784f,
 0.268283f, 0.138970f,
 0.281315f, 0.363513f,
 0.388431f, 0.138763f,
 0.300356f, 0.022362f,
 0.244979f, 0.022659f,
 0.298407f, 0.283420f,
 0.368537f, 0.059658f,
 0.700544f, 0.421993f,
 0.700544f, 0.369959f,
 0.743172f, 0.375421f,
 0.743172f, 0.414980f,
 0.711360f, 0.038998f,
 0.809816f, 0.508397f,
 0.920320f, 0.547872f,
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
 0.661484f, 0.636909f,
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
 0.674193f, 0.626883f,
 0.674193f, 0.626883f,
 0.674193f, 0.681378f,
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
 0.320395f, 0.473878f,
 0.401404f, 0.376641f,
 0.661488f, 0.501265f,
 0.661488f, 0.501265f,
 0.600243f, 0.473879f,
 0.320395f, 0.473878f,
 0.600243f, 0.473879f,
 0.320813f, 0.222669f,
 0.293252f, 0.222819f,
 0.293252f, 0.222819f,
 0.366655f, 0.447487f,
 0.268827f, 0.448535f,
 0.327717f, 0.363533f,
 0.327717f, 0.363533f,
 0.268827f, 0.448535f,
 0.220727f, 0.454545f,
 0.243753f, 0.367658f,
 0.268827f, 0.448535f,
 0.268827f, 0.448535f,
 0.243753f, 0.367658f,
 0.320813f, 0.222669f,
 0.327717f, 0.363533f,
 0.327717f, 0.363533f,
 0.381748f, 0.247125f,
 0.243753f, 0.367658f,
 0.243753f, 0.367658f,
 0.228262f, 0.289756f,
 0.556599f, 0.423421f,
 0.556600f, 0.365850f,
 0.556600f, 0.365850f,
 0.381748f, 0.247125f,
 0.208711f, 0.247418f,
 0.208711f, 0.247418f,
 0.259954f, 0.282383f,
 0.776267f, 0.365854f,
 0.776267f, 0.423423f,
 0.776267f, 0.423423f,
 0.459565f, 0.022649f,
 0.459565f, 0.022649f,
 0.408321f, 0.057613f,
 0.819577f, 0.371917f,
 0.832137f, 0.414748f,
 0.788493f, 0.530101f,
 0.788493f, 0.530101f,
 0.832137f, 0.414748f,
 0.964229f, 0.507208f,
 0.962340f, 0.570236f,
 0.925476f, 0.499804f,
 0.962340f, 0.570236f,
 0.925476f, 0.499804f,
 0.962340f, 0.570236f,
 0.788493f, 0.530101f,
 0.662490f, 0.038998f,
 0.545151f, 0.038998f,
 0.490977f, 0.038998f,
 0.490977f, 0.038998f,
 0.490977f, 0.146332f,
 0.605984f, 0.038998f,
 0.545151f, 0.038998f,
 0.545151f, 0.038998f,
 0.605984f, 0.038998f,
 0.662490f, 0.038998f,
 0.662490f, 0.038998f,
 0.490977f, 0.146332f,
 0.490977f, 0.247785f,
 0.490977f, 0.247785f,
 0.064893f, 0.975472f,
 0.123410f, 0.975472f,
 0.123410f, 0.975472f,
 0.171617f, 0.919755f,
 0.171616f, 0.872795f,
 0.171616f, 0.872795f,
 0.063685f, 0.822293f,
 0.127460f, 0.821833f,
 0.127460f, 0.821833f,
 0.009284f, 0.925250f,
 0.011377f, 0.873096f,
 0.011377f, 0.873096f,
 0.739076f, 0.221742f,
 0.739076f, 0.141674f,
 0.739076f, 0.141674f,
 0.754394f, 0.836011f,
 0.674193f, 0.735873f,
 0.674193f, 0.735873f,
 0.674193f, 0.681378f,
 0.962341f, 0.792524f,
 0.962341f, 0.792524f,
 0.925844f, 0.723230f,
 0.962341f, 0.792524f,
 0.925844f, 0.723230f,
 0.963051f, 0.681379f,
 0.963051f, 0.681379f,
 0.925844f, 0.723230f,
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
 0.380361f, 0.700279f,
 0.540274f, 0.700278f,
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
 0.458927f, 0.330342f,
 0.458927f, 0.330342f,
 0.023590f, 0.251572f,
 0.196627f, 0.251865f,};

static float[] TextArrayB = new float[]{
 0.106931f, 0.287866f,
 0.196627f, 0.251865f,
 0.145383f, 0.286830f,
 0.645499f, 0.320769f,
 0.645499f, 0.281210f,
 0.678594f, 0.330337f,
 0.678594f, 0.330337f,
 0.645499f, 0.281210f,
 0.678594f, 0.272767f,
 0.068361f, 0.059155f,
 0.017117f, 0.024190f,
 0.108145f, 0.061199f,
 0.108145f, 0.061199f,
 0.017117f, 0.024190f,
 0.176325f, 0.023903f,
 0.809815f, 0.854360f,
 0.832127f, 0.948011f,
 0.788493f, 0.832655f,
 0.788493f, 0.832655f,
 0.832127f, 0.948011f,
 0.819562f, 0.990842f,
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
 0.235609f, 0.680055f,
 0.235609f, 0.795038f,
 0.186740f, 0.680055f,
 0.186740f, 0.680055f,
 0.235609f, 0.795038f,
 0.186740f, 0.795038f,
 0.249424f, 0.933539f,
 0.249217f, 0.874910f,
 0.200327f, 0.935933f,
 0.200327f, 0.935933f,
 0.249217f, 0.874910f,
 0.201459f, 0.877993f,
 0.301860f, 0.930908f,
 0.249424f, 0.933539f,
 0.302124f, 0.983361f,
 0.302124f, 0.983361f,
 0.249424f, 0.933539f,
 0.249642f, 0.985999f,
 0.353274f, 0.877965f,
 0.302065f, 0.877358f,
 0.352586f, 0.930336f,
 0.352586f, 0.930336f,
 0.302065f, 0.877358f,
 0.301860f, 0.930908f,
 0.250990f, 0.823806f,
 0.249217f, 0.874910f,
 0.302280f, 0.822266f,
 0.302280f, 0.822266f,
 0.249217f, 0.874910f,
 0.302065f, 0.877358f,
 0.789643f, 0.221742f,
 0.789643f, 0.334905f,
 0.739076f, 0.221742f,
 0.739076f, 0.221742f,
 0.789643f, 0.334905f,
 0.739076f, 0.301810f,};

static float[][] NormArray = new float[][]{
{ -0.083269f, -0.987088f, 0.136833f},
{ -0.053291f, -0.987736f, 0.146759f},
{ -0.027650f, -0.937075f, -0.348032f},
{ 0.024505f, -0.967102f, -0.253205f},
{ -0.256933f, -0.021377f, -0.966193f},
{ -0.256934f, -0.021377f, -0.966192f},
{ -0.256935f, -0.021377f, -0.966192f},
{ -0.256936f, -0.021377f, -0.966192f},
{ -0.223456f, 0.961916f, -0.157435f},
{ -0.244958f, 0.960840f, -0.129543f},
{ -0.248924f, 0.968244f, -0.023259f},
{ -0.266918f, 0.963665f, -0.010202f},
{ -0.164048f, 0.313752f, 0.935226f},
{ -0.162303f, 0.329324f, 0.930163f},
{ -0.011038f, -0.980544f, -0.195991f},
{ -0.011038f, -0.980544f, -0.195990f},
{ -0.234316f, 0.968675f, 0.082253f},
{ -0.176440f, 0.978057f, 0.110782f},
{ -0.885030f, -0.118166f, 0.450288f},
{ -0.978836f, -0.154898f, 0.133742f},
{ -0.898359f, -0.174245f, 0.403224f},
{ -0.986456f, -0.153643f, -0.057428f},
{ -0.012154f, -0.978906f, 0.203950f},
{ 0.070241f, -0.996150f, 0.052459f},
{ 0.033989f, -0.486981f, -0.872751f},
{ -0.174840f, -0.665102f, -0.725996f},
{ -0.190399f, 0.068230f, -0.979333f},
{ -0.286864f, -0.034236f, -0.957360f},
{ -0.275425f, -0.030962f, -0.960824f},
{ -0.266139f, -0.021880f, -0.963686f},
{ -0.138877f, 0.591847f, -0.793997f},
{ -0.218557f, 0.649063f, -0.728663f},
{ -0.152969f, 0.602460f, -0.783354f},
{ -0.348348f, 0.726226f, -0.592663f},
{ -0.208486f, -0.952026f, 0.224010f},
{ -0.281913f, -0.945447f, 0.163266f},
{ -0.291924f, -0.955731f, 0.036862f},
{ -0.327701f, -0.944008f, 0.038231f},
{ -0.935958f, -0.050485f, 0.348474f},
{ -0.935958f, -0.050485f, 0.348473f},
{ -0.935958f, -0.050485f, 0.348473f},
{ -0.935958f, -0.050485f, 0.348473f},
{ -0.395558f, 0.899715f, 0.184515f},
{ -0.446605f, 0.894524f, 0.019277f},
{ -0.441954f, 0.885557f, 0.143058f},
{ -0.473986f, 0.880160f, 0.025615f},
{ -0.273242f, -0.958821f, -0.077474f},
{ -0.215630f, -0.969031f, -0.120345f},
{ -0.964914f, -0.056406f, -0.256435f},
{ -0.964914f, -0.056406f, -0.256435f},
{ -0.964914f, -0.056406f, -0.256435f},
{ -0.964914f, -0.056406f, -0.256435f},
{ -0.423641f, 0.900986f, -0.093556f},
{ -0.369894f, 0.919004f, -0.136421f},
{ -0.040443f, 0.678038f, 0.733914f},
{ -0.032618f, 0.678442f, 0.733930f},
{ -0.006474f, 0.679490f, 0.733657f},
{ 0.007198f, 0.679852f, 0.733314f},
{ -0.934929f, 0.034157f, -0.353187f},
{ -0.949065f, 0.058283f, -0.309642f},
{ -0.064575f, -0.997886f, 0.007279f},
{ -0.115066f, -0.991795f, 0.055700f},
{ 0.805519f, 0.113882f, 0.581523f},
{ 0.949448f, -0.021335f, 0.313198f},
{ 0.805886f, 0.104367f, 0.582799f},
{ 0.977604f, -0.086983f, 0.191634f},
{ 0.142058f, 0.830522f, -0.538565f},
{ 0.144257f, 0.830759f, -0.537614f},
{ 0.143041f, 0.830629f, -0.538141f},
{ 0.144484f, 0.830783f, -0.537516f},
{ -0.981176f, 0.039163f, -0.189100f},
{ -0.978010f, 0.047403f, -0.203101f},
{ -0.105187f, -0.952944f, 0.284313f},
{ -0.102203f, -0.952815f, 0.285830f},
{ 0.992513f, -0.069058f, 0.100741f},
{ 0.995977f, -0.058802f, 0.067615f},
{ -0.123706f, 0.591280f, 0.796922f},
{ -0.123706f, 0.591280f, 0.796922f},
{ -0.987389f, 0.002166f, -0.158301f},
{ -0.835438f, -0.432823f, -0.338686f},
{ 0.112673f, -0.647213f, -0.753937f},
{ 0.112673f, -0.647212f, -0.753937f},
{ 0.112673f, -0.647212f, -0.753937f},
{ 0.112674f, -0.647212f, -0.753937f},
{ 0.978210f, -0.096219f, 0.183976f},
{ 0.866459f, -0.498172f, -0.032760f},
{ -0.743506f, -0.097460f, 0.661590f},
{ -0.609599f, -0.744311f, 0.272744f},
{ -0.735053f, -0.356495f, 0.576722f},
{ -0.316664f, -0.941042f, -0.119015f},
{ -0.794947f, 0.599925f, -0.090272f},
{ -0.791153f, 0.601552f, -0.110513f},
{ -0.765633f, 0.605873f, -0.216157f},
{ 0.813548f, -0.574863f, -0.087590f},
{ 0.054592f, 0.786216f, -0.615536f},
{ 0.408529f, 0.848144f, 0.337277f},
{ 0.214457f, -0.973006f, -0.085247f},
{ 0.890515f, -0.362184f, -0.275329f},
{ 0.576469f, -0.794672f, -0.190212f},
{ 0.935215f, -0.209443f, -0.285494f},
{ -0.274249f, -0.947314f, -0.165480f},
{ -0.178733f, -0.976727f, 0.118568f},
{ -0.850110f, 0.485442f, 0.204105f},
{ -0.965703f, 0.245633f, -0.084157f},
{ -0.858871f, 0.473107f, 0.196241f},
{ -0.978878f, 0.163669f, -0.122514f},
{ 0.199355f, 0.977473f, 0.069307f},
{ 0.073171f, 0.994372f, 0.076622f},
{ 0.753293f, 0.242964f, -0.611161f},
{ 0.744946f, 0.228667f, -0.626711f},
{ 0.983746f, 0.178943f, -0.014939f},
{ 0.984707f, -0.006074f, -0.174114f},
{ -0.239566f, -0.941689f, 0.236285f},
{ -0.239566f, -0.941689f, 0.236285f},
{ -0.953100f, 0.141576f, -0.267500f},
{ -0.953100f, 0.141576f, -0.267500f},
{ 0.155261f, 0.985080f, -0.074238f},
{ 0.155262f, 0.985080f, -0.074233f},
{ 0.155261f, 0.985080f, -0.074235f},
{ 0.155262f, 0.985080f, -0.074233f},
{ 0.833580f, 0.138233f, 0.534823f},
{ 0.833001f, 0.136325f, 0.536214f},
{ 0.170808f, 0.979850f, -0.103531f},
{ 0.170808f, 0.979850f, -0.103531f},
{ 0.170808f, 0.979850f, -0.103531f},
{ 0.170808f, 0.979850f, -0.103531f},
{ 0.871240f, -0.101122f, 0.480328f},
{ 0.871241f, -0.101123f, 0.480327f},
{ 0.871240f, -0.101123f, 0.480327f},
{ 0.871241f, -0.101123f, 0.480327f},
{ -0.170807f, -0.979850f, 0.103534f},
{ -0.170807f, -0.979850f, 0.103532f},
{ -0.170807f, -0.979850f, 0.103532f},
{ -0.170807f, -0.979850f, 0.103530f},
{ -0.887473f, -0.116929f, -0.445780f},
{ -0.887473f, -0.116929f, -0.445780f},
{ -0.887473f, -0.116929f, -0.445780f},
{ -0.887472f, -0.116929f, -0.445781f},
{ -0.457434f, 0.187645f, 0.869220f},
{ -0.457435f, 0.187645f, 0.869220f},
{ -0.457435f, 0.187645f, 0.869220f},
{ -0.457435f, 0.187645f, 0.869220f},
{ -0.217841f, 0.936713f, -0.274068f},
{ -0.166910f, 0.939252f, -0.299912f},
{ -0.164126f, 0.963640f, -0.210857f},
{ -0.472025f, 0.852547f, 0.224403f},
{ -0.531881f, 0.788795f, 0.308067f},
{ -0.502806f, 0.854961f, 0.127385f},
{ -0.547827f, 0.834535f, -0.058618f},
{ -0.562845f, 0.802266f, -0.198933f},
{ 0.323604f, -0.933353f, 0.155344f},
{ 0.294630f, -0.894048f, -0.337449f},
{ 0.302413f, -0.943507f, 0.135428f},
{ 0.263996f, -0.943837f, -0.198689f},
{ 0.204050f, 0.004613f, -0.978949f},
{ 0.204053f, 0.004612f, -0.978949f},
{ 0.204056f, 0.004611f, -0.978948f},
{ 0.204059f, 0.004610f, -0.978948f},
{ 0.035151f, 0.992301f, -0.118761f},
{ 0.011948f, 0.999195f, 0.038292f},
{ 0.016996f, 0.990241f, -0.138327f},
{ -0.004144f, 0.999436f, 0.033321f},
{ -0.044211f, 0.248142f, 0.967714f},
{ 0.061359f, -0.964688f, -0.256148f},
{ -0.044914f, 0.263162f, 0.963705f},
{ 0.061360f, -0.964688f, -0.256148f},
{ 0.071799f, 0.989933f, 0.121972f},
{ 0.023658f, 0.988830f, 0.147160f},
{ 0.965962f, -0.255311f, -0.041627f},
{ 0.973504f, -0.142130f, 0.179136f},
{ 0.844282f, -0.025407f, 0.535297f},
{ 0.758367f, 0.107825f, 0.642848f},
{ 0.170929f, -0.949374f, 0.263576f},
{ 0.023334f, -0.999684f, 0.009332f},
{ 0.185131f, -0.614982f, -0.766501f},
{ 0.206744f, -0.624169f, -0.753438f},
{ 0.322411f, -0.005754f, -0.946582f},
{ 0.424125f, -0.004610f, -0.905592f},
{ 0.559980f, 0.048398f, -0.827091f},
{ 0.374812f, 0.014642f, -0.926985f},
{ -0.046726f, 0.541918f, -0.839132f},
{ -0.021497f, 0.566519f, -0.823768f},
{ 0.069744f, 0.648258f, -0.758219f},
{ 0.221761f, 0.758336f, -0.612984f},
{ 0.329307f, -0.921736f, 0.204841f},
{ 0.403872f, -0.914783f, 0.007670f},
{ 0.396361f, -0.907397f, 0.139747f},
{ 0.433156f, -0.901313f, 0.003202f},
{ 0.958070f, 0.056193f, 0.280969f},
{ 0.958070f, 0.056193f, 0.280969f},
{ 0.958070f, 0.056193f, 0.280969f},
{ 0.958070f, 0.056193f, 0.280969f},
{ 0.372636f, 0.927882f, -0.013302f},
{ 0.348089f, 0.937351f, -0.014390f},
{ 0.349368f, 0.929979f, 0.114376f},
{ 0.304252f, 0.939131f, 0.159573f},
{ 0.331508f, -0.933132f, -0.139166f},
{ 0.381239f, -0.918110f, -0.108309f},
{ 0.931226f, 0.050129f, -0.360977f},
{ 0.931231f, 0.050119f, -0.360967f},
{ 0.931230f, 0.050121f, -0.360969f},
{ 0.931234f, 0.050112f, -0.360960f},
{ 0.323481f, 0.937613f, -0.127447f},
{ 0.274710f, 0.948407f, -0.158296f},
{ -0.036232f, 0.748978f, 0.661603f},
{ 0.072745f, 0.734278f, 0.674940f},
{ -0.010430f, 0.746324f, 0.665501f},
{ 0.159208f, 0.716052f, 0.679649f},
{ 0.923494f, -0.129662f, -0.361035f},
{ 0.919077f, -0.182922f, -0.349052f},
{ -0.074675f, -0.987516f, 0.138693f},
{ -0.116291f, -0.992386f, 0.040574f},
{ -0.966291f, 0.149908f, 0.209307f},
{ -0.967037f, 0.047421f, 0.250179f},
{ -0.924387f, -0.092993f, 0.369947f},
{ -0.919130f, -0.123316f, 0.374157f},
{ 0.043586f, 0.820778f, -0.569583f},
{ -0.020603f, 0.815903f, -0.577822f},
{ 0.016205f, 0.819120f, -0.573394f},
{ -0.026795f, 0.815250f, -0.578488f},
{ 0.971702f, 0.048867f, -0.231098f},
{ 0.985889f, 0.030311f, -0.164634f},
{ 0.041123f, -0.939137f, 0.341073f},
{ 0.028403f, -0.940037f, 0.339887f},
{ -0.996190f, -0.056051f, 0.066807f},
{ -0.993610f, -0.052489f, 0.099917f},
{ -0.056086f, 0.533905f, 0.843682f},
{ -0.056086f, 0.533905f, 0.843683f},
{ 0.998199f, 0.007579f, 0.059515f},
{ 0.892458f, -0.413876f, -0.179514f},
{ 0.058063f, -0.592749f, -0.803292f},
{ 0.058063f, -0.592749f, -0.803291f},
{ 0.058063f, -0.592749f, -0.803291f},
{ 0.058063f, -0.592750f, -0.803291f},
{ -0.834749f, -0.488971f, -0.253183f},
{ -0.994117f, -0.101421f, -0.038012f},
{ 0.987722f, -0.151324f, 0.038801f},
{ 0.951641f, -0.088441f, 0.294208f},
{ 0.883521f, 0.004224f, 0.468373f},
{ 0.809935f, 0.114446f, 0.575246f},
{ -0.553956f, 0.641105f, -0.531147f},
{ -0.000705f, 0.868629f, -0.495463f},
{ 0.112371f, 0.877301f, -0.466601f},
{ 0.684223f, 0.702456f, -0.195944f},
{ -0.417940f, 0.386995f, -0.821925f},
{ -0.991146f, 0.047457f, 0.124008f},
{ -0.431824f, -0.627448f, -0.647949f},
{ 0.098786f, -0.861811f, -0.497517f},
{ 0.567080f, -0.800802f, -0.192710f},
{ 0.720131f, -0.692873f, -0.036574f},
{ 0.951427f, -0.291676f, 0.098546f},
{ 0.962611f, -0.218040f, -0.160744f},
{ 0.347755f, 0.845806f, -0.404572f},
{ 0.203179f, 0.911794f, -0.356861f},
{ -0.152905f, 0.977668f, 0.144168f},
{ -0.187005f, 0.969201f, 0.160243f},
{ -0.850842f, 0.521725f, 0.062220f},
{ -0.961394f, 0.272793f, 0.036132f},
{ -0.469084f, -0.560112f, -0.682814f},
{ -0.682339f, -0.687628f, 0.248156f},
{ -0.445665f, -0.554637f, -0.702681f},
{ -0.517309f, -0.823784f, 0.231888f},
{ 0.961369f, -0.242942f, 0.129415f},
{ 0.961369f, -0.242942f, 0.129415f},
{ 0.292498f, 0.655836f, -0.695934f},
{ 0.292497f, 0.655836f, -0.695934f},
{ -0.917928f, 0.395670f, -0.029226f},
{ -0.917928f, 0.395670f, -0.029226f},
{ -0.917928f, 0.395670f, -0.029226f},
{ -0.917928f, 0.395669f, -0.029226f},
{ -0.402412f, -0.304112f, 0.863470f},
{ -0.405741f, -0.304047f, 0.861934f},
{ -0.928118f, 0.369269f, -0.047296f},
{ -0.928118f, 0.369269f, -0.047296f},
{ -0.928118f, 0.369269f, -0.047296f},
{ -0.928118f, 0.369269f, -0.047296f},
{ -0.235956f, -0.485212f, 0.841958f},
{ -0.235956f, -0.485212f, 0.841958f},
{ -0.235956f, -0.485212f, 0.841958f},
{ -0.235957f, -0.485212f, 0.841958f},
{ 0.928118f, -0.369268f, 0.047296f},
{ 0.928118f, -0.369269f, 0.047296f},
{ 0.928118f, -0.369269f, 0.047296f},
{ 0.928118f, -0.369269f, 0.047296f},
{ 0.434367f, 0.392082f, -0.810924f},
{ 0.434369f, 0.392081f, -0.810923f},
{ 0.434369f, 0.392082f, -0.810923f},
{ 0.434371f, 0.392081f, -0.810922f},
{ 0.273317f, 0.798311f, 0.536653f},
{ 0.273316f, 0.798311f, 0.536654f},
{ 0.273316f, 0.798311f, 0.536654f},
{ 0.273315f, 0.798311f, 0.536654f},
{ -0.008391f, 0.993757f, -0.111253f},
{ 0.007817f, 0.995093f, -0.098635f},
{ -0.005656f, 0.990706f, -0.135905f},
{ 0.028483f, 0.981156f, -0.191104f},
{ 0.078145f, 0.948716f, 0.306319f},
{ 0.139936f, 0.989080f, -0.046237f},
{ 0.040795f, 0.960372f, 0.275720f},
{ 0.033171f, 0.976243f, 0.214125f},
{ -0.584967f, 0.730676f, -0.352031f},
{ -0.615903f, 0.751263f, -0.237208f},
{ 0.089355f, 0.992872f, -0.078867f},
{ 0.172335f, 0.935407f, -0.308730f}};

static int[] FaceArray = new int[]{
0, 1, 2,
2, 1, 3,
20, 21, 23,
23, 21, 22,
4, 5, 6,
6, 5, 7,
32, 33, 35,
35, 33, 34,
7, 9, 6,
6, 9, 8,
104, 10, 7,
7, 10, 9,
1, 0, 105,
106, 0, 107,
3, 13, 2,
2, 13, 12,
3, 108, 13,
13, 109, 110,
111, 112, 113,
114, 115, 116,
117, 118, 16,
16, 119, 120,
121, 14, 17,
17, 14, 18,
15, 19, 122,
123, 19, 124,
125, 21, 16,
16, 21, 20,
18, 22, 17,
17, 22, 21,
126, 19, 22,
22, 19, 23,
127, 128, 24,
24, 129, 25,
130, 131, 132,
133, 134, 26,
135, 136, 137,
138, 139, 26,
140, 24, 11,
11, 24, 27,
25, 29, 24,
24, 29, 28,
26, 30, 141,
142, 30, 143,
26, 144, 30,
30, 145, 146,
27, 24, 31,
31, 24, 28,
147, 148, 32,
32, 149, 33,
150, 30, 151,
152, 30, 153,
154, 155, 34,
34, 156, 35,
28, 157, 31,
31, 158, 159,
160, 161, 162,
163, 164, 37,
165, 166, 167,
168, 38, 169,
170, 3, 38,
3, 39, 38,
171, 37, 3,
3, 37, 39,
172, 36, 41,
41, 36, 40,
173, 42, 174,
175, 42, 176,
177, 43, 178,
179, 43, 42,
180, 181, 43,
43, 182, 41,
41, 40, 45,
45, 40, 44,
183, 42, 184,
185, 42, 46,
43, 47, 42,
42, 47, 46,
41, 45, 43,
43, 45, 47,
186, 49, 187,
188, 49, 48,
189, 48, 190,
191, 48, 50,
192, 193, 51,
51, 194, 50,
195, 196, 49,
49, 197, 51,
49, 51, 48,
48, 51, 50,
198, 199, 102,
102, 200, 101,
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
61, 67, 201,
56, 202, 0,
0, 203, 204,
12, 68, 2,
2, 68, 57,
57, 68, 205,
206, 68, 207,
208, 209, 210,
211, 212, 213,
214, 16, 215,
216, 16, 70,
217, 218, 219,
220, 221, 222,
71, 19, 69,
69, 19, 15,
20, 58, 16,
16, 58, 70,
223, 58, 224,
225, 58, 59,
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
78, 79, 74,
74, 79, 75,
244, 245, 73,
73, 246, 77,
247, 62, 248,
249, 62, 63,
250, 251, 78,
82, 83, 57,
83, 81, 57,
84, 80, 85,
85, 89, 84,
84, 89, 88,
90, 91, 86,
86, 91, 87,
91, 89, 87,
87, 89, 85,
94, 95, 93,
93, 95, 92,
53, 99, 96,
96, 99, 100,
99, 98, 52,
52, 98, 55,
100, 99, 97,
97, 99, 52,
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


//Vertices: 342  Texture Co-ords: 202  Normals: 304  Texture: V2 Faces: 196 Smooth Groups: 94 sucess: 80 Doubles: 116 Redos needed: 148 Correct: 110