package com.example.jgfjhg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;
import android.graphics.Bitmap;
import android.opengl.GLUtils;

class luchdeathe {

static String TextureName = "V2";

static int Vertices = 338;

static int VertTexts = 202;

static int Normals = 304;

static int Faces = 196;

static int FacesB = 29;

static int SmoothGroups = 94;

static float VertArray[] = new float[]{
 1.339380f, 0.217845f, -9.341615f,
 -1.191277f, 0.386153f, -9.607123f,
 1.449395f, 0.167560f, -11.188838f,
 -1.056146f, 0.131762f, -11.402906f,
 0.696828f, 3.489484f, -12.012239f,
 -1.543313f, 3.262580f, -11.961453f,
 0.849415f, 4.220522f, -10.396610f,
 -1.582795f, 3.567827f, -10.408976f,
 0.647734f, 4.551210f, -7.596101f,
 -0.712080f, 3.931694f, -6.683345f,
 -0.105463f, 2.272782f, -8.460772f,
 0.946319f, 2.124763f, -6.984582f,
 1.593656f, 0.772505f, -12.010896f,
 0.548036f, 0.726451f, -11.994765f,
 -0.010581f, 2.354935f, -12.298818f,
 0.820239f, 3.027175f, -12.431863f,
 1.671625f, 0.292776f, -13.166838f,
 0.146954f, 0.393965f, -13.175157f,
 -0.391190f, 1.962767f, -13.468067f,
 0.735670f, 3.021278f, -13.676274f,
 1.580279f, 0.201772f, -14.912760f,
 0.604806f, 0.162001f, -14.676374f,
 -0.003363f, 1.934938f, -15.007398f,
 0.806696f, 2.456926f, -15.333817f,
 -0.430804f, 1.229494f, -6.045788f,
 -1.453967f, 1.312244f, -6.103067f,
 -1.531704f, 0.110156f, -6.451096f,
 -0.508540f, 0.027407f, -6.393817f,
 -0.424735f, 1.671485f, -2.103496f,
 -2.202686f, 1.759755f, -2.444980f,
 -2.625323f, -0.009229f, -0.701769f,
 -0.847410f, -0.097497f, -0.360292f,
 -1.350694f, 0.632623f, 2.209851f,
 -2.957648f, 0.712404f, 1.901210f,
 -2.532314f, -0.190767f, 0.365963f,
 -1.310613f, -0.251422f, 0.600611f,
 -3.219310f, 0.582100f, -12.206507f,
 -1.387848f, 0.122117f, -13.073235f,
 -2.553490f, 1.528025f, -11.301593f,
 -0.931851f, 1.120740f, -12.069023f,
 -3.169632f, 1.000876f, -14.109798f,
 -2.571344f, 0.926311f, -13.837457f,
 -3.037880f, 1.698327f, -14.208273f,
 -2.598305f, 1.643541f, -14.008177f,
 -2.868362f, 0.361755f, -16.133453f,
 -1.568679f, 0.199772f, -15.541831f,
 -2.664797f, 1.439364f, -16.285606f,
 -1.590903f, 1.305523f, -15.796764f,
 -2.335722f, 0.108326f, -17.372953f,
 -1.036039f, -0.053657f, -16.781332f,
 -2.132157f, 1.185934f, -17.525105f,
 -1.058264f, 1.052092f, -17.036264f,
 -1.586809f, 8.883029f, -1.947588f,
 -0.583903f, 8.371675f, -7.541966f,
 -4.684597f, 6.336105f, -7.889530f,
 -7.342528f, 7.085653f, -2.949580f,
 3.745318f, 1.063073f, -9.331542f,
 3.880449f, 0.808683f, -11.127325f,
 2.347886f, 0.737302f, -14.797558f,
 1.739751f, 2.510249f, -15.128585f,
 3.030691f, 3.865412f, -12.131099f,
 3.353800f, 4.244747f, -10.133394f,
 0.332194f, 4.812243f, 1.670851f,
 1.952428f, 4.671601f, 1.868299f,
 1.912974f, 3.893442f, 0.211037f,
 0.681176f, 4.000366f, 0.060924f,
 2.197643f, 4.507703f, -6.965367f,
 1.873073f, 2.097618f, -7.460586f,
 2.454975f, 1.355833f, -12.127341f,
 1.896358f, 2.984317f, -12.431393f,
 2.823811f, 1.277458f, -13.361260f,
 2.285667f, 2.846259f, -13.654170f,
 2.450537f, 2.670699f, -4.953494f,
 1.426899f, 2.601197f, -5.019266f,
 2.480368f, 1.605707f, -4.292371f,
 1.456729f, 1.536205f, -4.358143f,
 2.716910f, 5.968940f, -2.408236f,
 0.924266f, 6.124548f, -2.626696f,
 2.353765f, 4.097293f, -0.761490f,
 0.561159f, 4.252898f, -0.979945f,
 5.808823f, 1.856176f, -11.659794f,
 4.288406f, 1.281366f, -12.954005f,
 4.821286f, 2.505799f, -10.788175f,
 3.475057f, 1.996843f, -11.934113f,
 5.635536f, 2.514365f, -13.762429f,
 5.229528f, 2.363253f, -13.262428f,
 5.462811f, 3.206400f, -13.693533f,
 5.164508f, 3.095373f, -13.326170f,
 4.450871f, 2.092696f, -15.498281f,
 3.568885f, 1.764426f, -14.412108f,
 4.183997f, 3.161939f, -15.391832f,
 3.455236f, 2.890698f, -14.494357f,
 2.531749f, 1.616242f, -15.299062f,
 3.413735f, 1.944511f, -16.385235f,
 3.146862f, 3.013753f, -16.278784f,
 2.418101f, 2.742513f, -15.381310f,
 3.473352f, 6.931490f, -8.204815f,
 4.186594f, 8.110042f, -2.745182f,
 -6.227441f, 6.282336f, -5.832954f,
 -0.881408f, 9.541289f, -5.505685f,
 3.456767f, 8.393832f, -5.794880f,
 -3.283764f, 4.141090f, -9.966824f,
 -0.614997f, 7.061368f, -9.314069f,
 3.448202f, 4.782307f, -10.307095f,
 -1.191277f, 0.386153f, -9.607123f,
 -0.105463f, 2.272782f, -8.460772f,
 -0.105463f, 2.272782f, -8.460772f,
 0.946319f, 2.124763f, -6.984582f,
 -1.543313f, 3.262580f, -11.961453f,
 -1.543313f, 3.262580f, -11.961453f,
 0.696828f, 3.489484f, -12.012239f,
 0.696828f, 3.489484f, -12.012239f,
 1.593656f, 0.772505f, -12.010896f,
 0.548036f, 0.726451f, -11.994765f,
 0.548036f, 0.726451f, -11.994765f,
 0.548036f, 0.726451f, -11.994765f,
 -0.010581f, 2.354935f, -12.298818f,
 0.146954f, 0.393965f, -13.175157f,
 0.146954f, 0.393965f, -13.175157f,
 -0.010581f, 2.354935f, -12.298818f,
 0.820239f, 3.027175f, -12.431863f,
 -0.010581f, 2.354935f, -12.298818f,
 -0.010581f, 2.354935f, -12.298818f,
 -0.391190f, 1.962767f, -13.468067f,
 0.146954f, 0.393965f, -13.175157f,
 -0.391190f, 1.962767f, -13.468067f,
 0.647734f, 4.551210f, -7.596101f,
 -0.712080f, 3.931694f, -6.683345f,
 -0.712080f, 3.931694f, -6.683345f,
 -0.712080f, 3.931694f, -6.683345f,
 -0.105463f, 2.272782f, -8.460772f,
 -1.453967f, 1.312244f, -6.103067f,
 -1.453967f, 1.312244f, -6.103067f,
 -0.105463f, 2.272782f, -8.460772f,
 0.946319f, 2.124763f, -6.984582f,
 -0.508540f, 0.027407f, -6.393817f,
 -0.105463f, 2.272782f, -8.460772f,
 -0.105463f, 2.272782f, -8.460772f,
 -0.508540f, 0.027407f, -6.393817f,
 0.647734f, 4.551210f, -7.596101f,
 -1.453967f, 1.312244f, -6.103067f,
 -2.202686f, 1.759755f, -2.444980f,
 -2.202686f, 1.759755f, -2.444980f,
 -0.508540f, 0.027407f, -6.393817f,
 -0.508540f, 0.027407f, -6.393817f,
 -0.847410f, -0.097497f, -0.360292f,
 -2.202686f, 1.759755f, -2.444980f,
 -0.424735f, 1.671485f, -2.103496f,
 -0.424735f, 1.671485f, -2.103496f,
 -2.202686f, 1.759755f, -2.444980f,
 -2.957648f, 0.712404f, 1.901210f,
 -2.957648f, 0.712404f, 1.901210f,
 -2.532314f, -0.190767f, 0.365963f,
 -2.625323f, -0.009229f, -0.701769f,
 -0.847410f, -0.097497f, -0.360292f,
 -0.847410f, -0.097497f, -0.360292f,
 -1.350694f, 0.632623f, 2.209851f,
 -1.350694f, 0.632623f, 2.209851f,
 -1.310613f, -0.251422f, 0.600611f,
 -1.582795f, 3.567827f, -10.408976f,
 -3.219310f, 0.582100f, -12.206507f,
 -1.191277f, 0.386153f, -9.607123f,
 -1.191277f, 0.386153f, -9.607123f,
 -3.219310f, 0.582100f, -12.206507f,
 -1.582795f, 3.567827f, -10.408976f,
 -1.543313f, 3.262580f, -11.961453f,
 -3.219310f, 0.582100f, -12.206507f,
 -1.543313f, 3.262580f, -11.961453f,
 -3.219310f, 0.582100f, -12.206507f,
 -1.543313f, 3.262580f, -11.961453f,
 -1.191277f, 0.386153f, -9.607123f,
 -1.387848f, 0.122117f, -13.073235f,
 -2.553490f, 1.528025f, -11.301593f,
 -3.219310f, 0.582100f, -12.206507f,
 -3.219310f, 0.582100f, -12.206507f,
 -3.169632f, 1.000876f, -14.109798f,
 -0.931851f, 1.120740f, -12.069023f,
 -2.553490f, 1.528025f, -11.301593f,
 -2.553490f, 1.528025f, -11.301593f,
 -0.931851f, 1.120740f, -12.069023f,
 -1.387848f, 0.122117f, -13.073235f,
 -1.387848f, 0.122117f, -13.073235f,
 -3.169632f, 1.000876f, -14.109798f,
 -2.868362f, 0.361755f, -16.133453f,
 -2.868362f, 0.361755f, -16.133453f,
 -1.568679f, 0.199772f, -15.541831f,
 -2.868362f, 0.361755f, -16.133453f,
 -2.868362f, 0.361755f, -16.133453f,
 -2.868362f, 0.361755f, -16.133453f,
 -2.664797f, 1.439364f, -16.285606f,
 -2.664797f, 1.439364f, -16.285606f,
 -1.590903f, 1.305523f, -15.796764f,
 -2.664797f, 1.439364f, -16.285606f,
 -2.664797f, 1.439364f, -16.285606f,
 -1.568679f, 0.199772f, -15.541831f,
 -1.590903f, 1.305523f, -15.796764f,
 -1.590903f, 1.305523f, -15.796764f,
 0.696828f, 3.489484f, -12.012239f,
 -1.543313f, 3.262580f, -11.961453f,
 -1.543313f, 3.262580f, -11.961453f,
 3.745318f, 1.063073f, -9.331542f,
 1.873073f, 2.097618f, -7.460586f,
 1.873073f, 2.097618f, -7.460586f,
 0.946319f, 2.124763f, -6.984582f,
 3.030691f, 3.865412f, -12.131099f,
 3.030691f, 3.865412f, -12.131099f,
 1.896358f, 2.984317f, -12.431393f,
 3.030691f, 3.865412f, -12.131099f,
 1.896358f, 2.984317f, -12.431393f,
 0.696828f, 3.489484f, -12.012239f,
 0.696828f, 3.489484f, -12.012239f,
 1.896358f, 2.984317f, -12.431393f,
 1.593656f, 0.772505f, -12.010896f,
 2.454975f, 1.355833f, -12.127341f,
 2.454975f, 1.355833f, -12.127341f,
 2.823811f, 1.277458f, -13.361260f,
 2.454975f, 1.355833f, -12.127341f,
 2.285667f, 2.846259f, -13.654170f,
 1.896358f, 2.984317f, -12.431393f,
 1.896358f, 2.984317f, -12.431393f,
 0.820239f, 3.027175f, -12.431863f,
 2.823811f, 1.277458f, -13.361260f,
 2.285667f, 2.846259f, -13.654170f,
 0.647734f, 4.551210f, -7.596101f,
 2.197643f, 4.507703f, -6.965367f,
 2.197643f, 4.507703f, -6.965367f,
 2.197643f, 4.507703f, -6.965367f,
 2.450537f, 2.670699f, -4.953494f,
 1.873073f, 2.097618f, -7.460586f,
 1.873073f, 2.097618f, -7.460586f,
 2.450537f, 2.670699f, -4.953494f,
 1.873073f, 2.097618f, -7.460586f,
 0.946319f, 2.124763f, -6.984582f,
 0.946319f, 2.124763f, -6.984582f,
 1.456729f, 1.536205f, -4.358143f,
 0.946319f, 2.124763f, -6.984582f,
 0.946319f, 2.124763f, -6.984582f,
 0.647734f, 4.551210f, -7.596101f,
 2.450537f, 2.670699f, -4.953494f,
 2.716910f, 5.968940f, -2.408236f,
 2.716910f, 5.968940f, -2.408236f,
 0.561159f, 4.252898f, -0.979945f,
 1.456729f, 1.536205f, -4.358143f,
 1.456729f, 1.536205f, -4.358143f,
 0.924266f, 6.124548f, -2.626696f,
 0.924266f, 6.124548f, -2.626696f,
 2.716910f, 5.968940f, -2.408236f,
 2.716910f, 5.968940f, -2.408236f,
 1.952428f, 4.671601f, 1.868299f,
 1.952428f, 4.671601f, 1.868299f,
 1.912974f, 3.893442f, 0.211037f,};

static float VertArrayB[] = new float[]{
 2.353765f, 4.097293f, -0.761490f,
 1.912974f, 3.893442f, 0.211037f,
 0.561159f, 4.252898f, -0.979945f,
 0.561159f, 4.252898f, -0.979945f,
 1.912974f, 3.893442f, 0.211037f,
 0.681176f, 4.000366f, 0.060924f,
 0.681176f, 4.000366f, 0.060924f,
 0.332194f, 4.812243f, 1.670851f,
 0.561159f, 4.252898f, -0.979945f,
 0.561159f, 4.252898f, -0.979945f,
 0.332194f, 4.812243f, 1.670851f,
 0.924266f, 6.124548f, -2.626696f,
 4.288406f, 1.281366f, -12.954005f,
 5.808823f, 1.856176f, -11.659794f,
 3.745318f, 1.063073f, -9.331542f,
 3.745318f, 1.063073f, -9.331542f,
 5.808823f, 1.856176f, -11.659794f,
 3.353800f, 4.244747f, -10.133394f,
 3.030691f, 3.865412f, -12.131099f,
 3.353800f, 4.244747f, -10.133394f,
 4.821286f, 2.505799f, -10.788175f,
 3.353800f, 4.244747f, -10.133394f,
 5.808823f, 1.856176f, -11.659794f,
 4.821286f, 2.505799f, -10.788175f,
 3.030691f, 3.865412f, -12.131099f,
 4.821286f, 2.505799f, -10.788175f,
 3.880449f, 0.808683f, -11.127325f,
 3.745318f, 1.063073f, -9.331542f,
 3.880449f, 0.808683f, -11.127325f,
 4.288406f, 1.281366f, -12.954005f,
 4.288406f, 1.281366f, -12.954005f,
 5.229528f, 2.363253f, -13.262428f,
 5.808823f, 1.856176f, -11.659794f,
 5.635536f, 2.514365f, -13.762429f,
 5.462811f, 3.206400f, -13.693533f,
 5.808823f, 1.856176f, -11.659794f,
 5.808823f, 1.856176f, -11.659794f,
 5.462811f, 3.206400f, -13.693533f,
 4.821286f, 2.505799f, -10.788175f,
 5.462811f, 3.206400f, -13.693533f,
 5.164508f, 3.095373f, -13.326170f,
 4.821286f, 2.505799f, -10.788175f,
 4.821286f, 2.505799f, -10.788175f,
 5.164508f, 3.095373f, -13.326170f,
 3.475057f, 1.996843f, -11.934113f,
 3.475057f, 1.996843f, -11.934113f,
 5.164508f, 3.095373f, -13.326170f,
 4.288406f, 1.281366f, -12.954005f,
 4.288406f, 1.281366f, -12.954005f,
 5.164508f, 3.095373f, -13.326170f,
 5.229528f, 2.363253f, -13.262428f,
 5.635536f, 2.514365f, -13.762429f,
 4.450871f, 2.092696f, -15.498281f,
 5.462811f, 3.206400f, -13.693533f,
 5.462811f, 3.206400f, -13.693533f,
 4.450871f, 2.092696f, -15.498281f,
 4.183997f, 3.161939f, -15.391832f,
 3.413735f, 1.944511f, -16.385235f,
 2.531749f, 1.616242f, -15.299062f,
 4.450871f, 2.092696f, -15.498281f,
 4.450871f, 2.092696f, -15.498281f,
 2.531749f, 1.616242f, -15.299062f,
 3.568885f, 1.764426f, -14.412108f,
 3.146862f, 3.013753f, -16.278784f,
 3.413735f, 1.944511f, -16.385235f,
 4.183997f, 3.161939f, -15.391832f,
 4.183997f, 3.161939f, -15.391832f,
 3.413735f, 1.944511f, -16.385235f,
 4.450871f, 2.092696f, -15.498281f,
 3.455236f, 2.890698f, -14.494357f,
 2.418101f, 2.742513f, -15.381310f,
 4.183997f, 3.161939f, -15.391832f,
 4.183997f, 3.161939f, -15.391832f,
 2.418101f, 2.742513f, -15.381310f,
 3.146862f, 3.013753f, -16.278784f,
 3.568885f, 1.764426f, -14.412108f,
 2.531749f, 1.616242f, -15.299062f,
 3.455236f, 2.890698f, -14.494357f,
 3.455236f, 2.890698f, -14.494357f,
 2.531749f, 1.616242f, -15.299062f,
 2.418101f, 2.742513f, -15.381310f,
 -0.614997f, 7.061368f, -9.314069f,
 3.448202f, 4.782307f, -10.307095f,
 0.696828f, 3.489484f, -12.012239f,
 0.696828f, 3.489484f, -12.012239f,
 3.448202f, 4.782307f, -10.307095f,
 3.030691f, 3.865412f, -12.131099f,};

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
 0.925844f, 0.639527f,
 0.925844f, 0.681379f,
 0.322042f, 0.569516f,
 0.320395f, 0.473878f,
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
 0.519237f, 0.761523f,
 0.380361f, 0.700279f,
 0.540274f, 0.700278f,
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
 0.963051f, 0.681379f,
 0.963051f, 0.681379f,
 0.259150f, 0.569083f,
 0.259150f, 0.501261f,
 0.259150f, 0.501261f,
 0.401404f, 0.376641f,
 0.519240f, 0.376645f,
 0.380364f, 0.437885f,
 0.380364f, 0.437885f,
 0.519240f, 0.376645f,
 0.661486f, 0.569087f,
 0.661488f, 0.501265f,
 0.661488f, 0.501265f,
 0.600243f, 0.473879f,
 0.380364f, 0.437885f,
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
 0.381748f, 0.247125f,
 0.381748f, 0.247125f,
 0.243753f, 0.367658f,
 0.243753f, 0.367658f,
 0.228262f, 0.289756f,
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
 0.259150f, 0.569083f,
 0.259150f, 0.636906f,
 0.259150f, 0.636906f,
 0.320395f, 0.664289f,
 0.401400f, 0.761524f,
 0.600238f, 0.664291f,
 0.661484f, 0.636909f,
 0.661484f, 0.636909f,
 0.661486f, 0.569087f,
 0.320395f, 0.664289f,
 0.600238f, 0.664291f,
 0.155870f, 0.224211f,
 0.183430f, 0.224360f,
 0.183430f, 0.224360f,
 0.038682f, 0.451933f,
 0.077621f, 0.367980f,
 0.136511f, 0.452982f,
 0.136511f, 0.452982f,
 0.077621f, 0.367980f,
 0.136511f, 0.452982f,
 0.184610f, 0.458992f,
 0.184610f, 0.458992f,
 0.088251f, 0.140305f,
 0.078844f, 0.224258f,
 0.078844f, 0.224258f,
 0.155870f, 0.224211f,
 0.077621f, 0.367980f,
 0.023590f, 0.251572f,
 0.023590f, 0.251572f,
 0.108145f, 0.061199f,
 0.088251f, 0.140305f,
 0.088251f, 0.140305f,
 0.458925f, 0.272771f,
 0.458925f, 0.272771f,
 0.458927f, 0.330342f,
 0.023590f, 0.251572f,
 0.196627f, 0.251865f,
 0.196627f, 0.251865f,
 0.145383f, 0.286830f,};

static float[] TextArrayB = new float[]{
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
 0.809815f, 0.854360f,
 0.832127f, 0.948011f,
 0.788493f, 0.832655f,
 0.788493f, 0.832655f,
 0.832127f, 0.948011f,
 0.819562f, 0.990842f,
 0.962341f, 0.792524f,
 0.964216f, 0.855555f,
 0.920318f, 0.814883f,
 0.964216f, 0.855555f,
 0.925462f, 0.862950f,
 0.920318f, 0.814883f,
 0.962341f, 0.792524f,
 0.920318f, 0.814883f,
 0.822878f, 0.792457f,
 0.788493f, 0.832655f,
 0.822878f, 0.792457f,
 0.809815f, 0.854360f,
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
{ -0.247688f, -0.862016f, 0.442244f},
{ -0.077963f, -0.866731f, 0.492644f},
{ -0.018330f, -0.993160f, -0.115313f},
{ 0.011169f, -0.999276f, 0.036375f},
{ -0.218298f, -0.250961f, -0.943061f},
{ -0.218298f, -0.250961f, -0.943061f},
{ -0.218299f, -0.250961f, -0.943061f},
{ -0.218299f, -0.250961f, -0.943061f},
{ -0.103213f, 0.975473f, -0.194422f},
{ -0.252269f, 0.953028f, -0.167623f},
{ -0.197210f, 0.924715f, -0.325592f},
{ -0.251498f, 0.941439f, -0.224592f},
{ -0.059003f, 0.848161f, 0.526442f},
{ -0.052033f, 0.867280f, 0.495094f},
{ -0.134334f, -0.869918f, 0.474548f},
{ -0.134334f, -0.869919f, 0.474548f},
{ -0.356518f, 0.933272f, -0.043564f},
{ -0.410717f, 0.911737f, 0.006943f},
{ -0.774500f, 0.063317f, 0.629396f},
{ -0.949261f, -0.236402f, 0.207407f},
{ -0.841491f, -0.213019f, 0.496505f},
{ -0.968272f, -0.118107f, -0.220229f},
{ -0.207108f, -0.866090f, 0.454966f},
{ 0.184288f, -0.956255f, -0.227189f},
{ 0.057789f, -0.788942f, -0.611745f},
{ 0.026464f, -0.807351f, -0.589478f},
{ -0.299860f, -0.212573f, -0.929998f},
{ -0.303912f, -0.229673f, -0.924602f},
{ -0.193406f, -0.117883f, -0.974011f},
{ -0.248189f, -0.259399f, -0.933335f},
{ -0.049480f, 0.273492f, -0.960601f},
{ -0.171335f, 0.340364f, -0.924552f},
{ -0.083635f, 0.292748f, -0.952525f},
{ -0.514169f, 0.497133f, -0.698920f},
{ 0.046536f, -0.921502f, 0.385575f},
{ -0.026221f, -0.945457f, 0.324689f},
{ -0.027663f, -0.978680f, 0.203520f},
{ -0.065942f, -0.976850f, 0.203509f},
{ -0.897141f, -0.238297f, 0.371958f},
{ -0.897140f, -0.238297f, 0.371959f},
{ -0.897141f, -0.238297f, 0.371959f},
{ -0.897140f, -0.238297f, 0.371959f},
{ -0.624781f, 0.779837f, 0.038764f},
{ -0.669537f, 0.732058f, -0.125741f},
{ -0.663658f, 0.748033f, 0.002317f},
{ -0.691205f, 0.714370f, -0.109135f},
{ -0.007573f, -0.995766f, 0.091617f},
{ 0.052596f, -0.997401f, 0.049236f},
{ -0.908672f, -0.353252f, -0.222549f},
{ -0.908672f, -0.353253f, -0.222549f},
{ -0.908672f, -0.353253f, -0.222549f},
{ -0.908672f, -0.353253f, -0.222549f},
{ -0.643466f, 0.727922f, -0.236814f},
{ -0.597319f, 0.751049f, -0.281310f},
{ 0.459009f, 0.248995f, 0.852826f},
{ 0.396883f, 0.249706f, 0.883250f},
{ 0.162790f, 0.242592f, 0.956373f},
{ -0.036226f, 0.225911f, 0.973474f},
{ -0.927767f, 0.149331f, -0.341977f},
{ -0.947498f, 0.128408f, -0.292845f},
{ 0.080227f, -0.936716f, -0.340775f},
{ -0.065349f, -0.970028f, -0.234041f},
{ 0.416308f, 0.270034f, 0.868199f},
{ 0.928470f, -0.066428f, 0.365419f},
{ 0.448517f, 0.218793f, 0.866581f},
{ 0.971022f, -0.153671f, 0.183032f},
{ 0.085942f, 0.990896f, -0.103631f},
{ 0.072050f, 0.991259f, -0.110520f},
{ 0.079486f, 0.991094f, -0.106837f},
{ 0.070581f, 0.991283f, -0.111247f},
{ -0.981435f, 0.057877f, -0.182854f},
{ -0.985507f, 0.063122f, -0.157455f},
{ -0.047195f, -0.998598f, -0.023979f},
{ -0.045125f, -0.998712f, -0.023210f},
{ 0.984069f, -0.165427f, 0.065137f},
{ 0.982869f, -0.096586f, 0.156967f},
{ 0.003163f, 0.972040f, 0.234793f},
{ 0.003163f, 0.972040f, 0.234793f},
{ -0.990967f, 0.021265f, -0.132413f},
{ -0.901436f, -0.432885f, 0.004923f},
{ -0.017038f, -0.985954f, -0.166147f},
{ -0.017038f, -0.985953f, -0.166150f},
{ -0.017038f, -0.985954f, -0.166149f},
{ -0.017038f, -0.985953f, -0.166154f},
{ 0.970868f, -0.098955f, 0.218226f},
{ 0.800996f, -0.516064f, 0.303452f},
{ -0.784902f, 0.058866f, 0.616817f},
{ -0.611211f, -0.717992f, 0.333029f},
{ -0.773212f, -0.245344f, 0.584764f},
{ -0.254000f, -0.966917f, -0.023567f},
{ -0.835880f, 0.534187f, -0.126290f},
{ -0.830366f, 0.533806f, -0.159824f},
{ -0.687449f, 0.479685f, -0.545268f},
{ 0.848529f, -0.523501f, -0.077105f},
{ 0.049648f, 0.679642f, -0.731862f},
{ 0.363369f, 0.882136f, 0.299665f},
{ -0.442585f, -0.891887f, 0.093041f},
{ 0.913588f, -0.364968f, -0.179318f},
{ 0.116113f, -0.993085f, -0.017323f},
{ 0.951031f, -0.245775f, -0.187442f},
{ -0.261024f, -0.955607f, -0.136684f},
{ -0.182017f, -0.974243f, 0.133118f},
{ -0.875525f, 0.451388f, 0.172350f},
{ -0.968611f, 0.242542f, -0.054460f},
{ -0.882395f, 0.440404f, 0.165602f},
{ -0.981064f, 0.173045f, -0.086996f},
{ 0.194377f, 0.980166f, 0.038614f},
{ 0.105327f, 0.993606f, 0.040663f},
{ 0.766916f, 0.245895f, -0.592770f},
{ 0.759721f, 0.230887f, -0.607878f},
{ 0.985372f, 0.160836f, -0.056341f},
{ 0.975737f, -0.015310f, -0.218410f},
{ -0.235351f, -0.936302f, 0.260670f},
{ -0.235352f, -0.936302f, 0.260669f},
{ -0.968692f, 0.155686f, -0.193382f},
{ -0.968693f, 0.155685f, -0.193382f},
{ 0.164649f, 0.981973f, -0.092842f},
{ 0.164648f, 0.981973f, -0.092844f},
{ 0.164648f, 0.981973f, -0.092843f},
{ 0.164647f, 0.981973f, -0.092844f},
{ 0.874860f, 0.127530f, 0.467285f},
{ 0.874361f, 0.125640f, 0.468730f},
{ 0.177775f, 0.976325f, -0.123226f},
{ 0.177775f, 0.976325f, -0.123226f},
{ 0.177775f, 0.976325f, -0.123226f},
{ 0.177776f, 0.976325f, -0.123226f},
{ 0.904341f, -0.112710f, 0.411661f},
{ 0.904341f, -0.112710f, 0.411660f},
{ 0.904341f, -0.112710f, 0.411660f},
{ 0.904341f, -0.112709f, 0.411659f},
{ -0.177775f, -0.976325f, 0.123227f},
{ -0.177775f, -0.976325f, 0.123228f},
{ -0.177775f, -0.976325f, 0.123228f},
{ -0.177775f, -0.976325f, 0.123228f},
{ -0.921295f, -0.104850f, -0.374462f},
{ -0.921295f, -0.104850f, -0.374462f},
{ -0.921295f, -0.104850f, -0.374462f},
{ -0.921295f, -0.104850f, -0.374462f},
{ -0.385177f, 0.199966f, 0.900918f},
{ -0.385178f, 0.199966f, 0.900917f},
{ -0.385178f, 0.199966f, 0.900917f},
{ -0.385179f, 0.199967f, 0.900916f},
{ -0.077361f, 0.582698f, -0.808998f},
{ -0.266354f, 0.594066f, -0.759039f},
{ -0.336529f, 0.637037f, -0.693493f},
{ -0.413537f, 0.541527f, -0.731939f},
{ -0.341720f, 0.778334f, -0.526710f},
{ -0.429826f, 0.745680f, -0.509128f},
{ -0.493130f, 0.860590f, -0.127309f},
{ -0.384581f, 0.890934f, -0.241527f},
{ 0.306677f, -0.866851f, 0.393088f},
{ 0.302534f, -0.942744f, -0.140382f},
{ 0.280719f, -0.888043f, 0.364110f},
{ 0.255965f, -0.964809f, -0.060216f},
{ 0.219379f, -0.105832f, -0.969883f},
{ 0.219382f, -0.105832f, -0.969882f},
{ 0.219388f, -0.105832f, -0.969881f},
{ 0.219393f, -0.105833f, -0.969879f},
{ -0.165695f, 0.904264f, -0.393511f},
{ -0.027007f, 0.983808f, -0.177178f},
{ -0.050457f, 0.964065f, -0.260832f},
{ 0.003275f, 0.992463f, -0.122501f},
{ -0.129475f, -0.896374f, 0.423970f},
{ -0.129475f, -0.896373f, 0.423970f},
{ 0.003296f, 0.827077f, 0.562079f},
{ 0.000831f, 0.817709f, 0.575632f},
{ 0.073293f, 0.991030f, -0.111744f},
{ 0.027319f, 0.995195f, -0.094028f},
{ 0.978924f, -0.158337f, 0.128987f},
{ 0.957812f, -0.037750f, 0.284905f},
{ 0.837786f, 0.092160f, 0.538165f},
{ 0.749840f, 0.246962f, 0.613799f},
{ 0.186757f, -0.864577f, 0.466507f},
{ 0.056321f, -0.991658f, 0.115937f},
{ 0.447398f, -0.755993f, -0.477818f},
{ 0.225221f, -0.714098f, -0.662827f},
{ 0.442758f, -0.062680f, -0.894448f},
{ 0.492857f, -0.114357f, -0.862563f},
{ 0.487444f, -0.114681f, -0.865590f},
{ 0.307042f, -0.071859f, -0.948979f},
{ -0.117978f, 0.453049f, -0.883644f},
{ -0.108741f, 0.469025f, -0.876465f},
{ -0.060584f, 0.548242f, -0.834122f},
{ 0.027236f, 0.675825f, -0.736559f},
{ 0.557255f, -0.752941f, 0.350067f},
{ 0.632738f, -0.758251f, 0.157158f},
{ 0.617986f, -0.733098f, 0.284008f},
{ 0.656840f, -0.740573f, 0.141819f},
{ 0.901532f, 0.355352f, 0.246910f},
{ 0.901532f, 0.355352f, 0.246910f},
{ 0.901532f, 0.355352f, 0.246910f},
{ 0.901532f, 0.355352f, 0.246909f},
{ 0.112926f, 0.977796f, -0.176527f},
{ 0.086149f, 0.979833f, -0.180296f},
{ 0.087449f, 0.994811f, -0.051998f},
{ 0.039797f, 0.999180f, -0.007440f},
{ 0.570821f, -0.820973f, 0.012927f},
{ 0.612583f, -0.789452f, 0.038838f},
{ 0.892981f, 0.234599f, -0.384120f},
{ 0.892988f, 0.234593f, -0.384108f},
{ 0.892987f, 0.234594f, -0.384110f},
{ 0.892992f, 0.234588f, -0.384100f},
{ 0.067317f, 0.954827f, -0.289437f},
{ 0.016638f, 0.946722f, -0.321622f},
{ -0.235936f, 0.739241f, 0.630759f},
{ -0.155349f, 0.735721f, 0.659227f},
{ -0.217120f, 0.738900f, 0.637876f},
{ -0.093071f, 0.729413f, 0.677713f},
{ 0.986550f, -0.063492f, -0.150625f},
{ 0.997528f, -0.067023f, -0.021127f},
{ 0.024539f, -0.943303f, 0.331026f},
{ 0.000667f, -0.945557f, 0.325455f},
{ -0.992440f, -0.031146f, -0.118716f},
{ -0.997071f, -0.020606f, 0.073653f},
{ -0.968071f, -0.042556f, 0.247039f},
{ -0.966643f, -0.055959f, 0.249940f},
{ 0.014849f, 0.563166f, -0.826210f},
{ 0.132301f, 0.593361f, -0.793989f},
{ 0.069157f, 0.578225f, -0.812941f},
{ 0.147912f, 0.596705f, -0.788711f},
{ 0.991142f, -0.086466f, 0.100804f},
{ 0.987024f, -0.083829f, 0.136956f},
{ -0.125768f, -0.793027f, 0.596063f},
{ -0.141322f, -0.789415f, 0.597370f},
{ -0.984963f, 0.029997f, -0.170142f},
{ -0.977600f, -0.008843f, -0.210288f},
{ 0.046507f, 0.953561f, 0.297588f},
{ 0.046507f, 0.953561f, 0.297588f},
{ 0.977523f, -0.117732f, 0.174893f},
{ 0.793793f, -0.557574f, 0.242908f},
{ -0.056412f, -0.971731f, -0.229253f},
{ -0.056412f, -0.971731f, -0.229253f},
{ -0.056412f, -0.971731f, -0.229254f},
{ -0.056412f, -0.971731f, -0.229254f},
{ -0.913739f, -0.406245f, 0.006797f},
{ -0.994920f, 0.036801f, -0.093703f},
{ 0.441583f, -0.888596f, -0.124104f},
{ 0.710475f, -0.623707f, 0.325907f},
{ 0.753461f, -0.032580f, 0.656686f},
{ 0.678127f, 0.256977f, 0.688554f},
{ 0.695075f, 0.677328f, -0.241036f},
{ 0.683250f, 0.678341f, -0.270228f},
{ 0.002905f, 0.354531f, -0.935040f},
{ -0.739746f, -0.429101f, -0.518313f},
{ 0.051330f, 0.694851f, -0.717320f},
{ -0.576909f, 0.738047f, 0.349946f},
{ 0.931269f, -0.344397f, 0.118864f},
{ 0.699375f, -0.714182f, -0.028613f},
{ -0.746887f, -0.584021f, -0.317929f},
{ -0.816387f, -0.488115f, -0.308634f},
{ 0.400962f, -0.867784f, -0.293564f},
{ 0.286565f, -0.956402f, -0.056354f},
{ 0.917005f, 0.259070f, -0.303288f},
{ 0.899038f, 0.388671f, -0.201659f},
{ 0.718303f, 0.629693f, 0.295851f},
{ 0.698080f, 0.645527f, 0.309804f},
{ -0.100436f, 0.972046f, 0.212223f},
{ -0.337703f, 0.925881f, 0.169412f},
{ -0.695949f, 0.194289f, -0.691308f},
{ -0.980937f, 0.114951f, 0.156679f},
{ -0.681677f, 0.183940f, -0.708154f},
{ -0.974144f, -0.067750f, 0.215533f},
{ 0.342679f, -0.939435f, -0.005662f},
{ 0.342680f, -0.939435f, -0.005662f},
{ 0.770189f, 0.250623f, -0.586512f},
{ 0.770190f, 0.250623f, -0.586512f},
{ -0.203682f, 0.970639f, 0.127960f},
{ -0.203682f, 0.970639f, 0.127960f},
{ -0.203682f, 0.970639f, 0.127961f},
{ -0.203682f, 0.970638f, 0.127963f},
{ -0.564518f, 0.003314f, 0.825414f},
{ -0.565638f, 0.005291f, 0.824637f},
{ -0.229175f, 0.967560f, 0.106329f},
{ -0.229175f, 0.967560f, 0.106329f},
{ -0.229175f, 0.967560f, 0.106329f},
{ -0.229175f, 0.967560f, 0.106328f},
{ -0.613701f, -0.228416f, 0.755776f},
{ -0.613701f, -0.228416f, 0.755776f},
{ -0.613701f, -0.228416f, 0.755776f},
{ -0.613701f, -0.228416f, 0.755776f},
{ 0.229177f, -0.967560f, -0.106328f},
{ 0.229176f, -0.967560f, -0.106328f},
{ 0.229176f, -0.967560f, -0.106328f},
{ 0.229176f, -0.967560f, -0.106328f},
{ 0.649084f, 0.009949f, -0.760652f},
{ 0.649085f, 0.009949f, -0.760651f},
{ 0.649084f, 0.009949f, -0.760652f},
{ 0.649085f, 0.009949f, -0.760651f},
{ 0.751847f, 0.123167f, 0.647732f},
{ 0.751846f, 0.123168f, 0.647733f},
{ 0.751846f, 0.123168f, 0.647732f},
{ 0.751845f, 0.123168f, 0.647733f},
{ 0.186458f, 0.707551f, -0.681619f},
{ 0.154731f, 0.692141f, -0.704982f},
{ 0.129298f, 0.678540f, -0.723095f},
{ -0.165305f, 0.895840f, -0.412486f},
{ 0.194364f, 0.980862f, -0.011509f},
{ 0.245198f, 0.946288f, -0.210755f},
{ 0.196420f, 0.830982f, -0.520470f},
{ 0.210794f, 0.764107f, -0.609677f},
{ -0.451181f, 0.890595f, -0.057240f},
{ -0.225502f, 0.912458f, -0.341422f},
{ 0.205890f, 0.970533f, 0.125203f},
{ 0.158174f, 0.964852f, 0.209859f}};

static int[] FaceArray = new int[]{
0, 1, 2,
2, 1, 3,
20, 21, 23,
23, 21, 22,
5, 7, 4,
4, 7, 6,
32, 33, 35,
35, 33, 34,
6, 7, 8,
8, 7, 9,
104, 10, 7,
7, 10, 9,
1, 0, 105,
106, 0, 107,
3, 13, 2,
2, 13, 12,
108, 14, 3,
3, 14, 13,
109, 110, 14,
14, 111, 15,
112, 113, 16,
16, 114, 17,
115, 116, 117,
118, 119, 18,
120, 19, 121,
122, 19, 123,
17, 21, 16,
16, 21, 20,
124, 18, 21,
21, 18, 22,
125, 19, 22,
22, 19, 23,
126, 127, 24,
24, 128, 25,
129, 130, 131,
132, 133, 26,
134, 135, 136,
137, 138, 26,
139, 24, 11,
11, 24, 27,
25, 29, 24,
24, 29, 28,
140, 26, 141,
142, 26, 30,
26, 143, 30,
30, 144, 145,
24, 28, 27,
27, 28, 31,
146, 33, 147,
148, 33, 32,
149, 30, 150,
151, 30, 152,
153, 154, 34,
34, 155, 35,
28, 156, 31,
31, 157, 158,
159, 160, 161,
162, 163, 37,
164, 165, 166,
167, 38, 168,
169, 3, 38,
3, 39, 38,
170, 37, 3,
3, 37, 39,
171, 36, 41,
41, 36, 40,
172, 42, 173,
174, 42, 175,
176, 43, 177,
178, 43, 42,
179, 180, 43,
43, 181, 41,
41, 40, 45,
45, 40, 44,
182, 42, 183,
184, 42, 46,
43, 47, 42,
42, 47, 46,
41, 45, 43,
43, 45, 47,
185, 49, 186,
187, 49, 48,
188, 48, 189,
190, 48, 50,
191, 192, 51,
51, 193, 50,
194, 195, 49,
49, 196, 51,
49, 51, 48,
48, 51, 50,
197, 198, 102,
102, 199, 101,
53, 54, 99,
99, 54, 98,
0, 2, 56,
56, 2, 57,
23, 59, 20,
20, 59, 58,
4, 6, 60,
60, 6, 61,
65, 64, 62,
62, 64, 63,
8, 66, 6,
6, 66, 61,
66, 67, 61,
61, 67, 200,
56, 201, 0,
0, 202, 203,
12, 68, 2,
2, 68, 57,
57, 68, 204,
205, 68, 206,
207, 208, 209,
210, 211, 15,
212, 16, 213,
214, 16, 215,
216, 70, 69,
69, 70, 71,
217, 19, 218,
219, 19, 220,
20, 58, 16,
16, 58, 221,
70, 58, 71,
71, 58, 59,
222, 59, 19,
19, 59, 23,
223, 73, 224,
225, 73, 72,
226, 227, 228,
229, 230, 74,
231, 74, 232,
233, 74, 75,
234, 73, 235,
236, 73, 237,
73, 77, 72,
72, 77, 76,
238, 239, 74,
74, 240, 78,
74, 78, 75,
75, 78, 79,
241, 77, 242,
243, 77, 73,
62, 63, 244,
245, 63, 246,
247, 248, 78,
78, 249, 250,
82, 83, 57,
57, 83, 81,
80, 85, 84,
85, 89, 84,
84, 89, 88,
90, 91, 86,
86, 91, 87,
91, 89, 87,
87, 89, 85,
94, 95, 93,
93, 95, 92,
99, 100, 53,
53, 100, 96,
99, 98, 52,
52, 98, 55,
100, 99, 97,
97, 99, 52,
101, 54, 102,
102, 54, 53,
103, 102, 96,
96, 102, 53, };

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
84, 85, 86,};

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


//Vertices: 338  Texture Co-ords: 202  Normals: 304  Texture: V2 Faces: 196 Smooth Groups: 94 sucess: 79 Doubles: 117 Redos needed: 147 Correct: 117