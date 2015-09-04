package com.example.jgfjhg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;
import android.graphics.Bitmap;
import android.opengl.GLUtils;

class luchidleb {

static String TextureName = "IDLE";

static int Vertices = 345;

static int VertTexts = 202;

static int Normals = 304;

static int Faces = 196;

static int FacesB = 31;

static int SmoothGroups = 94;

static float VertArray[] = new float[]{
 0.078843f, 7.840875f, 2.430741f,
 2.098557f, 7.864584f, 1.875076f,
 -0.567848f, 9.653924f, 1.882594f,
 1.862234f, 9.499071f, 2.511533f,
 0.078843f, 10.450731f, -0.873865f,
 2.815588f, 10.662525f, -0.995459f,
 0.078843f, 8.963926f, -1.583391f,
 2.574045f, 8.833105f, -1.269284f,
 0.078843f, 6.165383f, -1.984683f,
 1.648715f, 5.228502f, -1.406338f,
 0.947026f, 6.891600f, 0.337095f,
 0.078843f, 5.512643f, 0.449384f,
 0.078843f, 10.576771f, 1.984524f,
 1.085087f, 10.614343f, 1.698585f,
 1.085087f, 10.842111f, -0.034788f,
 0.078843f, 10.892120f, -0.415366f,
 0.078843f, 11.755451f, 2.412468f,
 1.491354f, 11.831389f, 1.834561f,
 1.491354f, 12.050809f, 0.164715f,
 0.078843f, 12.137073f, -0.491776f,
 0.078843f, 13.506010f, 2.392298f,
 1.031165f, 13.320226f, 2.132347f,
 1.031165f, 13.568198f, 0.245217f,
 0.078843f, 13.821427f, -0.008108f,
 1.045474f, 4.558813f, 1.244963f,
 2.071546f, 4.540850f, 1.182949f,
 2.148364f, 4.615893f, 2.432208f,
 1.122292f, 4.633856f, 2.494223f,
 0.733048f, 0.400290f, -0.006470f,
 2.545647f, 0.400289f, -0.006466f,
 2.545643f, 1.505975f, 2.257196f,
 0.733083f, 1.505976f, 2.257192f,
 0.778095f, -0.021510f, 4.505918f,
 2.416365f, -0.021511f, 4.505922f,
 2.244413f, 1.334809f, 3.287547f,
 0.998904f, 1.334810f, 3.287545f,
 3.876245f, 8.335244f, 0.724107f,
 2.576093f, 7.882899f, 1.667220f,
 3.614096f, 9.682746f, 1.246099f,
 2.411256f, 9.229468f, 2.007485f,
 3.884039f, 6.834879f, 2.127525f,
 3.525384f, 7.390513f, 2.109802f,
 4.204938f, 7.061137f, 2.726962f,
 3.941426f, 7.469375f, 2.713939f,
 2.549996f, 5.420852f, 3.030451f,
 1.770874f, 6.627880f, 2.991947f,
 3.045806f, 5.770436f, 3.956623f,
 2.402039f, 6.767771f, 3.924808f,
 1.583768f, 4.821703f, 3.799684f,
 0.804647f, 6.028732f, 3.761180f,
 2.079579f, 5.171288f, 4.725854f,
 1.435812f, 6.168623f, 4.694039f,
 0.078843f, 1.374928f, -5.647097f,
 0.078843f, 7.464554f, -3.367929f,
 4.632588f, 6.637355f, -2.715925f,
 6.550580f, 1.490007f, -5.217857f,
 -2.416360f, 7.977201f, 1.922382f,
 -2.669220f, 9.927922f, 1.106441f,
 -0.808397f, 13.320226f, 2.132347f,
 -0.808432f, 13.568198f, 0.245217f,
 -2.042556f, 10.523207f, -1.703317f,
 -2.416360f, 8.833105f, -1.269284f,
 -0.620411f, -0.015118f, 1.553026f,
 -2.258681f, -0.015118f, 1.553026f,
 -2.086726f, 1.218862f, 0.210888f,
 -0.841217f, 1.218862f, 0.210888f,
 -1.189355f, 5.691435f, -1.956992f,
 -1.122240f, 6.029774f, 0.515159f,
 -0.927402f, 10.614343f, 1.698585f,
 -0.927402f, 10.842111f, -0.034788f,
 -1.333669f, 11.831389f, 1.834561f,
 -1.333669f, 12.050809f, 0.164715f,
 -1.988450f, 3.439002f, -0.406873f,
 -0.970127f, 3.398211f, -0.271423f,
 -2.160623f, 3.005260f, 0.756916f,
 -1.142300f, 2.964469f, 0.892367f,
 -2.387953f, -0.025459f, -2.979022f,
 -0.575354f, -0.025459f, -2.979022f,
 -2.387953f, 1.291012f, -0.831089f,
 -0.575393f, 1.291012f, -0.831089f,
 -3.038852f, 8.108110f, -0.797393f,
 -2.295768f, 8.648257f, 1.066238f,
 -3.209353f, 9.525949f, -1.140351f,
 -2.551401f, 10.004214f, 0.509772f,
 -4.023865f, 7.551964f, 1.084842f,
 -3.649332f, 8.060810f, 0.888683f,
 -4.599568f, 7.978583f, 1.092299f,
 -4.324389f, 8.352443f, 0.948175f,
 -3.687205f, 7.484592f, 3.200626f,
 -2.873590f, 8.589976f, 2.774498f,
 -4.576706f, 8.143748f, 3.212149f,
 -3.904437f, 9.057098f, 2.860051f,
 -2.637678f, 8.921708f, 4.085450f,
 -3.451293f, 7.816324f, 4.511578f,
 -4.340793f, 8.475480f, 4.523100f,
 -3.668525f, 9.388829f, 4.171001f,
 -4.474903f, 6.637355f, -2.920662f,
 -6.090677f, 1.486442f, -5.012439f,
 5.614591f, 4.259549f, -3.930946f,
 0.078843f, 4.419741f, -4.913701f,
 -5.261344f, 4.272461f, -3.802418f,
 3.602179f, 8.595522f, -2.314810f,
 0.078843f, 9.586023f, -2.769940f,
 -3.444494f, 7.715551f, -2.045042f,
 2.098557f, 7.864584f, 1.875076f,
 0.947026f, 6.891600f, 0.337095f,
 0.947026f, 6.891600f, 0.337095f,
 0.078843f, 5.512643f, 0.449384f,
 2.815588f, 10.662525f, -0.995459f,
 2.815588f, 10.662525f, -0.995459f,
 0.078843f, 10.450731f, -0.873865f,
 0.078843f, 10.450731f, -0.873865f,
 0.078843f, 10.576771f, 1.984524f,
 1.085087f, 10.614343f, 1.698585f,
 1.085087f, 10.614343f, 1.698585f,
 1.085087f, 10.842111f, -0.034788f,
 1.491354f, 12.050809f, 0.164715f,
 1.085087f, 10.614343f, 1.698585f,
 1.085087f, 10.614343f, 1.698585f,
 1.491354f, 12.050809f, 0.164715f,
 1.491354f, 11.831389f, 1.834561f,
 0.078843f, 10.892120f, -0.415366f,
 1.085087f, 10.842111f, -0.034788f,
 1.085087f, 10.842111f, -0.034788f,
 1.491354f, 12.050809f, 0.164715f,
 1.491354f, 11.831389f, 1.834561f,
 1.491354f, 11.831389f, 1.834561f,
 0.078843f, 6.165383f, -1.984683f,
 1.648715f, 5.228502f, -1.406338f,
 1.648715f, 5.228502f, -1.406338f,
 1.648715f, 5.228502f, -1.406338f,
 0.947026f, 6.891600f, 0.337095f,
 2.071546f, 4.540850f, 1.182949f,
 2.071546f, 4.540850f, 1.182949f,
 0.947026f, 6.891600f, 0.337095f,
 0.078843f, 5.512643f, 0.449384f,
 1.122292f, 4.633856f, 2.494223f,
 0.947026f, 6.891600f, 0.337095f,
 0.947026f, 6.891600f, 0.337095f,
 1.122292f, 4.633856f, 2.494223f,
 0.078843f, 6.165383f, -1.984683f,
 2.071546f, 4.540850f, 1.182949f,
 2.071546f, 4.540850f, 1.182949f,
 2.545647f, 0.400289f, -0.006466f,
 1.122292f, 4.633856f, 2.494223f,
 0.733083f, 1.505976f, 2.257192f,
 0.733083f, 1.505976f, 2.257192f,
 2.545647f, 0.400289f, -0.006466f,
 0.733048f, 0.400290f, -0.006470f,
 0.733048f, 0.400290f, -0.006470f,
 2.545647f, 0.400289f, -0.006466f,
 2.416365f, -0.021511f, 4.505922f,
 2.416365f, -0.021511f, 4.505922f,
 2.244413f, 1.334809f, 3.287547f,
 2.545643f, 1.505975f, 2.257196f,
 0.733083f, 1.505976f, 2.257192f,
 0.733083f, 1.505976f, 2.257192f,
 0.778095f, -0.021510f, 4.505918f,
 0.733083f, 1.505976f, 2.257192f,
 0.733083f, 1.505976f, 2.257192f,
 0.778095f, -0.021510f, 4.505918f,
 0.998904f, 1.334810f, 3.287545f,
 2.098557f, 7.864584f, 1.875076f,
 2.574045f, 8.833105f, -1.269284f,
 2.576093f, 7.882899f, 1.667220f,
 2.574045f, 8.833105f, -1.269284f,
 3.876245f, 8.335244f, 0.724107f,
 2.576093f, 7.882899f, 1.667220f,
 2.574045f, 8.833105f, -1.269284f,
 2.815588f, 10.662525f, -0.995459f,
 3.876245f, 8.335244f, 0.724107f,
 3.876245f, 8.335244f, 0.724107f,
 2.815588f, 10.662525f, -0.995459f,
 3.614096f, 9.682746f, 1.246099f,
 2.411256f, 9.229468f, 2.007485f,
 2.815588f, 10.662525f, -0.995459f,
 2.815588f, 10.662525f, -0.995459f,
 2.411256f, 9.229468f, 2.007485f,
 3.614096f, 9.682746f, 1.246099f,
 2.098557f, 7.864584f, 1.875076f,
 2.411256f, 9.229468f, 2.007485f,
 2.411256f, 9.229468f, 2.007485f,
 2.098557f, 7.864584f, 1.875076f,
 2.576093f, 7.882899f, 1.667220f,
 3.876245f, 8.335244f, 0.724107f,
 3.876245f, 8.335244f, 0.724107f,
 3.884039f, 6.834879f, 2.127525f,
 3.884039f, 6.834879f, 2.127525f,
 2.549996f, 5.420852f, 3.030451f,
 2.549996f, 5.420852f, 3.030451f,
 2.549996f, 5.420852f, 3.030451f,
 1.770874f, 6.627880f, 2.991947f,
 1.770874f, 6.627880f, 2.991947f,
 2.549996f, 5.420852f, 3.030451f,
 3.045806f, 5.770436f, 3.956623f,
 3.045806f, 5.770436f, 3.956623f,
 3.045806f, 5.770436f, 3.956623f,
 2.402039f, 6.767771f, 3.924808f,
 2.402039f, 6.767771f, 3.924808f,
 1.770874f, 6.627880f, 2.991947f,
 2.402039f, 6.767771f, 3.924808f,
 2.402039f, 6.767771f, 3.924808f,
 0.078843f, 10.450731f, -0.873865f,
 2.815588f, 10.662525f, -0.995459f,
 2.815588f, 10.662525f, -0.995459f,
 -2.416360f, 7.977201f, 1.922382f,
 -1.122240f, 6.029774f, 0.515159f,
 -1.122240f, 6.029774f, 0.515159f,
 0.078843f, 5.512643f, 0.449384f,
 -2.042556f, 10.523207f, -1.703317f,
 -2.042556f, 10.523207f, -1.703317f,
 0.078843f, 10.450731f, -0.873865f,
 0.078843f, 10.450731f, -0.873865f,
 0.078843f, 10.576771f, 1.984524f,
 -0.927402f, 10.614343f, 1.698585f,
 -0.927402f, 10.614343f, 1.698585f,
 -1.333669f, 11.831389f, 1.834561f,
 -1.333669f, 12.050809f, 0.164715f,
 -0.927402f, 10.614343f, 1.698585f,
 -0.927402f, 10.614343f, 1.698585f,
 -1.333669f, 12.050809f, 0.164715f,
 -0.927402f, 10.842111f, -0.034788f,
 -0.927402f, 10.842111f, -0.034788f,
 -0.927402f, 10.842111f, -0.034788f,
 0.078843f, 10.892120f, -0.415366f,
 -1.333669f, 11.831389f, 1.834561f,
 -1.333669f, 11.831389f, 1.834561f,
 -1.333669f, 12.050809f, 0.164715f,
 0.078843f, 6.165383f, -1.984683f,
 -1.189355f, 5.691435f, -1.956992f,
 -1.189355f, 5.691435f, -1.956992f,
 -1.189355f, 5.691435f, -1.956992f,
 -1.988450f, 3.439002f, -0.406873f,
 -1.122240f, 6.029774f, 0.515159f,
 -1.122240f, 6.029774f, 0.515159f,
 -1.988450f, 3.439002f, -0.406873f,
 -1.122240f, 6.029774f, 0.515159f,
 -1.122240f, 6.029774f, 0.515159f,
 0.078843f, 5.512643f, 0.449384f,
 -1.142300f, 2.964469f, 0.892367f,
 0.078843f, 5.512643f, 0.449384f,
 0.078843f, 5.512643f, 0.449384f,
 0.078843f, 6.165383f, -1.984683f,
 -2.387953f, -0.025459f, -2.979022f,
 -1.988450f, 3.439002f, -0.406873f,
 -1.988450f, 3.439002f, -0.406873f,
 -1.142300f, 2.964469f, 0.892367f,
 -0.575393f, 1.291012f, -0.831089f,
 -0.575393f, 1.291012f, -0.831089f,
 -0.575354f, -0.025459f, -2.979022f,
 -0.575354f, -0.025459f, -2.979022f,
 -2.387953f, -0.025459f, -2.979022f,};

static float VertArrayB[] = new float[]{
 -2.387953f, -0.025459f, -2.979022f,
 -2.258681f, -0.015118f, 1.553026f,
 -2.387953f, 1.291012f, -0.831089f,
 -2.387953f, 1.291012f, -0.831089f,
 -2.258681f, -0.015118f, 1.553026f,
 -2.086726f, 1.218862f, 0.210888f,
 -2.387953f, 1.291012f, -0.831089f,
 -2.086726f, 1.218862f, 0.210888f,
 -0.575393f, 1.291012f, -0.831089f,
 -0.575393f, 1.291012f, -0.831089f,
 -2.086726f, 1.218862f, 0.210888f,
 -0.841217f, 1.218862f, 0.210888f,
 -0.841217f, 1.218862f, 0.210888f,
 -0.620411f, -0.015118f, 1.553026f,
 -0.575393f, 1.291012f, -0.831089f,
 -0.575393f, 1.291012f, -0.831089f,
 -0.620411f, -0.015118f, 1.553026f,
 -0.575354f, -0.025459f, -2.979022f,
 -2.416360f, 8.833105f, -1.269284f,
 -2.416360f, 7.977201f, 1.922382f,
 -3.038852f, 8.108110f, -0.797393f,
 -2.416360f, 7.977201f, 1.922382f,
 -2.295768f, 8.648257f, 1.066238f,
 -3.038852f, 8.108110f, -0.797393f,
 -3.038852f, 8.108110f, -0.797393f,
 -3.209353f, 9.525949f, -1.140351f,
 -2.416360f, 8.833105f, -1.269284f,
 -2.416360f, 8.833105f, -1.269284f,
 -3.209353f, 9.525949f, -1.140351f,
 -2.042556f, 10.523207f, -1.703317f,
 -2.669220f, 9.927922f, 1.106441f,
 -2.042556f, 10.523207f, -1.703317f,
 -2.551401f, 10.004214f, 0.509772f,
 -2.042556f, 10.523207f, -1.703317f,
 -3.209353f, 9.525949f, -1.140351f,
 -2.551401f, 10.004214f, 0.509772f,
 -2.669220f, 9.927922f, 1.106441f,
 -2.295768f, 8.648257f, 1.066238f,
 -2.416360f, 7.977201f, 1.922382f,
 -2.295768f, 8.648257f, 1.066238f,
 -3.649332f, 8.060810f, 0.888683f,
 -3.038852f, 8.108110f, -0.797393f,
 -4.023865f, 7.551964f, 1.084842f,
 -4.599568f, 7.978583f, 1.092299f,
 -3.038852f, 8.108110f, -0.797393f,
 -3.038852f, 8.108110f, -0.797393f,
 -4.599568f, 7.978583f, 1.092299f,
 -3.209353f, 9.525949f, -1.140351f,
 -3.209353f, 9.525949f, -1.140351f,
 -4.324389f, 8.352443f, 0.948175f,
 -2.551401f, 10.004214f, 0.509772f,
 -4.324389f, 8.352443f, 0.948175f,
 -3.649332f, 8.060810f, 0.888683f,
 -2.551401f, 10.004214f, 0.509772f,
 -2.551401f, 10.004214f, 0.509772f,
 -3.649332f, 8.060810f, 0.888683f,
 -2.295768f, 8.648257f, 1.066238f,
 -3.687205f, 7.484592f, 3.200626f,
 -4.576706f, 8.143748f, 3.212149f,
 -4.023865f, 7.551964f, 1.084842f,
 -4.023865f, 7.551964f, 1.084842f,
 -4.576706f, 8.143748f, 3.212149f,
 -4.599568f, 7.978583f, 1.092299f,
 -3.451293f, 7.816324f, 4.511578f,
 -2.637678f, 8.921708f, 4.085450f,
 -3.687205f, 7.484592f, 3.200626f,
 -3.687205f, 7.484592f, 3.200626f,
 -2.637678f, 8.921708f, 4.085450f,
 -2.873590f, 8.589976f, 2.774498f,
 -4.576706f, 8.143748f, 3.212149f,
 -4.340793f, 8.475480f, 4.523100f,
 -3.687205f, 7.484592f, 3.200626f,
 -3.687205f, 7.484592f, 3.200626f,
 -4.340793f, 8.475480f, 4.523100f,
 -3.451293f, 7.816324f, 4.511578f,
 -3.904437f, 9.057098f, 2.860051f,
 -3.668525f, 9.388829f, 4.171001f,
 -4.576706f, 8.143748f, 3.212149f,
 -4.576706f, 8.143748f, 3.212149f,
 -3.668525f, 9.388829f, 4.171001f,
 -4.340793f, 8.475480f, 4.523100f,
 -2.637678f, 8.921708f, 4.085450f,
 -3.668525f, 9.388829f, 4.171001f,
 -2.873590f, 8.589976f, 2.774498f,
 -2.873590f, 8.589976f, 2.774498f,
 -3.668525f, 9.388829f, 4.171001f,
 -3.904437f, 9.057098f, 2.860051f,
 0.078843f, 10.450731f, -0.873865f,
 0.078843f, 9.586023f, -2.769940f,
 -2.042556f, 10.523207f, -1.703317f,
 -2.042556f, 10.523207f, -1.703317f,
 0.078843f, 9.586023f, -2.769940f,
 -3.444494f, 7.715551f, -2.045042f,};

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
 0.600243f, 0.473879f,
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
 0.228262f, 0.289756f,
 0.700544f, 0.421993f,
 0.700544f, 0.369959f,
 0.743172f, 0.375421f,
 0.743172f, 0.414980f,
 0.711360f, 0.038998f,
 0.662490f, 0.038998f,
 0.545151f, 0.038998f,
 0.605984f, 0.038998f,
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
 0.186739f, 0.586251f,
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
 0.519240f, 0.376645f,
 0.540277f, 0.437890f,
 0.401404f, 0.376641f,
 0.401404f, 0.376641f,
 0.540277f, 0.437890f,
 0.380364f, 0.437885f,
 0.661486f, 0.569087f,
 0.661488f, 0.501265f,
 0.661488f, 0.501265f,
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
 0.243753f, 0.367658f,
 0.268827f, 0.448535f,
 0.268827f, 0.448535f,
 0.243753f, 0.367658f,
 0.320813f, 0.222669f,
 0.327717f, 0.363533f,
 0.327717f, 0.363533f,
 0.381748f, 0.247125f,
 0.243753f, 0.367658f,
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
 0.788493f, 0.530101f,
 0.819577f, 0.371917f,
 0.809816f, 0.508397f,
 0.819577f, 0.371917f,
 0.832137f, 0.414748f,
 0.809816f, 0.508397f,
 0.964229f, 0.507208f,
 0.962340f, 0.570236f,
 0.925476f, 0.499804f,
 0.925476f, 0.499804f,
 0.962340f, 0.570236f,
 0.920320f, 0.547872f,
 0.836660f, 0.547841f,
 0.962340f, 0.570236f,
 0.962340f, 0.570236f,
 0.836660f, 0.547841f,
 0.920320f, 0.547872f,
 0.788493f, 0.530101f,
 0.836660f, 0.547841f,
 0.836660f, 0.547841f,
 0.788493f, 0.530101f,
 0.809816f, 0.508397f,
 0.490977f, 0.038998f,
 0.490977f, 0.038998f,
 0.490977f, 0.146332f,
 0.490977f, 0.146332f,
 0.490977f, 0.247785f,
 0.490977f, 0.247785f,
 0.123410f, 0.975472f,
 0.064893f, 0.975472f,
 0.064893f, 0.975472f,
 0.171617f, 0.919755f,
 0.171616f, 0.872795f,
 0.171616f, 0.872795f,
 0.127460f, 0.821833f,
 0.063685f, 0.822293f,
 0.063685f, 0.822293f,
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
 0.963051f, 0.681379f,
 0.963051f, 0.681379f,
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
 0.661486f, 0.569087f,
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
 0.458927f, 0.330342f,};

static float[] TextArrayB = new float[]{
 0.023590f, 0.251572f,
 0.196627f, 0.251865f,
 0.106931f, 0.287866f,
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
 0.822878f, 0.792457f,
 0.962341f, 0.792524f,
 0.836659f, 0.814916f,
 0.962341f, 0.792524f,
 0.920318f, 0.814883f,
 0.836659f, 0.814916f,
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
 0.186739f, 0.586251f,
 0.130233f, 0.680055f,
 0.130233f, 0.586251f,
 0.130233f, 0.680055f,
 0.069400f, 0.680055f,
 0.130233f, 0.586251f,
 0.130233f, 0.586251f,
 0.069400f, 0.680055f,
 0.069400f, 0.586251f,
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
{ 0.206477f, -0.660001f, 0.722333f},
{ -0.007489f, 0.046658f, 0.998883f},
{ 0.103618f, -0.324794f, 0.940092f},
{ -0.193785f, 0.250858f, 0.948429f},
{ 0.223208f, 0.966463f, 0.126995f},
{ 0.223208f, 0.966463f, 0.126995f},
{ 0.223208f, 0.966463f, 0.126995f},
{ 0.223208f, 0.966463f, 0.126995f},
{ -0.055819f, 0.155003f, -0.986336f},
{ 0.069336f, 0.096750f, -0.992891f},
{ 0.067760f, 0.334304f, -0.940026f},
{ 0.175605f, 0.173848f, -0.968989f},
{ -0.000001f, -0.973109f, 0.230343f},
{ -0.000001f, -0.982833f, 0.184497f},
{ -0.000001f, 0.668263f, 0.743925f},
{ -0.000001f, 0.668263f, 0.743925f},
{ 0.211953f, 0.042800f, -0.976342f},
{ 0.409895f, 0.129469f, -0.902897f},
{ 0.718717f, -0.687614f, -0.103114f},
{ 0.966508f, -0.205630f, 0.153553f},
{ 0.838917f, -0.451193f, 0.304374f},
{ 0.939491f, 0.039685f, 0.340266f},
{ 0.243486f, -0.378931f, 0.892819f},
{ -0.155919f, 0.177294f, 0.971729f},
{ -0.161658f, 0.446806f, 0.879904f},
{ 0.271524f, -0.291578f, 0.917201f},
{ 0.234473f, 0.889167f, 0.392942f},
{ 0.341093f, 0.870422f, 0.354995f},
{ 0.511592f, 0.790001f, 0.337895f},
{ 0.789550f, 0.608455f, 0.079952f},
{ -0.087453f, 0.938848f, -0.333041f},
{ -0.000022f, 0.906272f, -0.422696f},
{ -0.068056f, 0.932938f, -0.353546f},
{ 0.285686f, 0.690396f, -0.664632f},
{ 0.269493f, -0.328647f, 0.905188f},
{ 0.349315f, -0.255883f, 0.901389f},
{ 0.337073f, -0.136782f, 0.931489f},
{ 0.381372f, -0.140571f, 0.913671f},
{ 0.949115f, -0.312244f, -0.041029f},
{ 0.949116f, -0.312244f, -0.041029f},
{ 0.949116f, -0.312244f, -0.041029f},
{ 0.949116f, -0.312244f, -0.041029f},
{ 0.350681f, -0.057370f, -0.934736f},
{ 0.387758f, 0.108245f, -0.915383f},
{ 0.403386f, -0.009445f, -0.914981f},
{ 0.424397f, 0.103155f, -0.899581f},
{ 0.336327f, -0.036225f, 0.941048f},
{ 0.265331f, 0.011108f, 0.964093f},
{ 0.956829f, 0.288175f, 0.037867f},
{ 0.956829f, 0.288175f, 0.037867f},
{ 0.956829f, 0.288175f, 0.037867f},
{ 0.956829f, 0.288175f, 0.037867f},
{ 0.381299f, 0.209905f, -0.900306f},
{ 0.312578f, 0.262170f, -0.912996f},
{ -0.400844f, -0.862447f, -0.309047f},
{ -0.365554f, -0.879305f, -0.305276f},
{ -0.194910f, -0.939510f, -0.281657f},
{ -0.032143f, -0.967287f, -0.251639f},
{ 0.957528f, 0.281264f, -0.063481f},
{ 0.973215f, 0.218019f, -0.072940f},
{ -0.070809f, 0.364615f, 0.928462f},
{ 0.039502f, 0.206211f, 0.977710f},
{ -0.594791f, -0.776446f, -0.208218f},
{ -0.983996f, -0.178144f, -0.003946f},
{ -0.611930f, -0.770184f, -0.179887f},
{ -0.998093f, 0.011283f, 0.060696f},
{ -0.052627f, 0.291391f, -0.955155f},
{ -0.029963f, 0.284906f, -0.958087f},
{ -0.006523f, 0.278036f, -0.960548f},
{ 0.000002f, 0.276094f, -0.961131f},
{ 0.998691f, 0.049150f, -0.014139f},
{ 0.995539f, 0.084775f, -0.041407f},
{ 0.010398f, -0.060901f, 0.998090f},
{ -0.000002f, -0.056187f, 0.998420f},
{ -0.998953f, 0.045521f, -0.004511f},
{ -0.997790f, 0.059704f, -0.029147f},
{ -0.000000f, -0.995659f, -0.093070f},
{ -0.000000f, -0.995660f, -0.093070f},
{ 0.997769f, 0.012191f, 0.065642f},
{ 0.862196f, 0.394628f, 0.317625f},
{ 0.000000f, 0.986481f, 0.163875f},
{ 0.000000f, 0.986481f, 0.163876f},
{ 0.000000f, 0.986481f, 0.163876f},
{ 0.000001f, 0.986481f, 0.163877f},
{ -0.998032f, 0.040749f, 0.047657f},
{ -0.867986f, 0.402535f, 0.290803f},
{ -0.097028f, -0.946960f, -0.306353f},
{ 0.089552f, -0.947588f, -0.306687f},
{ -0.022840f, -0.924709f, -0.379990f},
{ 0.037280f, -0.929685f, -0.366465f},
{ 0.833716f, -0.027529f, -0.551507f},
{ 0.877215f, 0.046744f, -0.477817f},
{ 0.923720f, 0.165848f, -0.345306f},
{ 0.938785f, 0.266978f, -0.217727f},
{ 0.377964f, 0.721375f, 0.580311f},
{ 0.072145f, 0.806667f, 0.586586f},
{ 0.602128f, -0.212606f, 0.769571f},
{ 0.483243f, -0.193542f, 0.853825f},
{ 0.571452f, -0.207934f, 0.793855f},
{ 0.398436f, -0.178558f, 0.899647f},
{ -0.491513f, -0.342801f, -0.800564f},
{ -0.401944f, -0.503172f, -0.765022f},
{ 0.978732f, 0.202682f, -0.031687f},
{ 0.895094f, -0.423667f, -0.138970f},
{ 0.983909f, 0.170653f, -0.052911f},
{ 0.819871f, -0.518293f, -0.243275f},
{ 0.475888f, 0.533884f, 0.698926f},
{ 0.694865f, 0.465999f, 0.547729f},
{ -0.635882f, -0.261341f, 0.726192f},
{ -0.636047f, -0.277303f, 0.720102f},
{ -0.621608f, 0.635415f, 0.458095f},
{ -0.655811f, 0.666354f, 0.354803f},
{ -0.345205f, -0.251668f, -0.904155f},
{ -0.345205f, -0.251668f, -0.904155f},
{ 0.691145f, -0.715790f, -0.099818f},
{ 0.691145f, -0.715790f, -0.099818f},
{ 0.482325f, 0.337127f, 0.808522f},
{ 0.482325f, 0.337127f, 0.808522f},
{ 0.482325f, 0.337127f, 0.808522f},
{ 0.482325f, 0.337127f, 0.808522f},
{ -0.351474f, 0.930649f, 0.101778f},
{ -0.353921f, 0.929913f, 0.100010f},
{ 0.458954f, 0.322655f, 0.827801f},
{ 0.458953f, 0.322655f, 0.827802f},
{ 0.458953f, 0.322655f, 0.827802f},
{ 0.458953f, 0.322656f, 0.827802f},
{ -0.542125f, 0.839870f, -0.026793f},
{ -0.542126f, 0.839870f, -0.026793f},
{ -0.542126f, 0.839870f, -0.026793f},
{ -0.542126f, 0.839870f, -0.026792f},
{ -0.458953f, -0.322655f, -0.827802f},
{ -0.458953f, -0.322655f, -0.827802f},
{ -0.458953f, -0.322655f, -0.827802f},
{ -0.458953f, -0.322655f, -0.827802f},
{ 0.427869f, -0.890279f, -0.155987f},
{ 0.427869f, -0.890279f, -0.155987f},
{ 0.427869f, -0.890279f, -0.155987f},
{ 0.427869f, -0.890279f, -0.155987f},
{ 0.711027f, 0.441500f, -0.547282f},
{ 0.711027f, 0.441500f, -0.547282f},
{ 0.711027f, 0.441500f, -0.547282f},
{ 0.711027f, 0.441500f, -0.547282f},
{ -0.088499f, 0.906280f, -0.413310f},
{ 0.186192f, 0.686031f, -0.703345f},
{ 0.153135f, 0.540504f, -0.827288f},
{ 0.216849f, 0.391548f, -0.894241f},
{ 0.202306f, 0.384427f, -0.900715f},
{ 0.179125f, 0.449265f, -0.875257f},
{ 0.185974f, 0.337023f, -0.922946f},
{ 0.106531f, 0.434691f, -0.894257f},
{ -0.212150f, -0.353595f, 0.911023f},
{ -0.243117f, 0.216411f, 0.945548f},
{ -0.251661f, -0.158361f, 0.954772f},
{ -0.294917f, 0.304135f, 0.905829f},
{ -0.238670f, 0.962824f, 0.126516f},
{ -0.238672f, 0.962824f, 0.126517f},
{ -0.238676f, 0.962822f, 0.126519f},
{ -0.238680f, 0.962821f, 0.126521f},
{ 0.345015f, 0.404242f, -0.847085f},
{ -0.002081f, 0.174963f, -0.984573f},
{ 0.010771f, -0.062104f, -0.998012f},
{ -0.125961f, 0.021135f, -0.991810f},
{ 0.000000f, -0.946364f, 0.323103f},
{ 0.000000f, 0.736147f, 0.676822f},
{ 0.000000f, -0.960351f, 0.278792f},
{ 0.000000f, 0.736147f, 0.676822f},
{ -0.074453f, 0.141547f, -0.987128f},
{ -0.115817f, 0.156856f, -0.980807f},
{ -0.992351f, -0.115792f, 0.042788f},
{ -0.975830f, -0.215547f, -0.035988f},
{ -0.902232f, -0.430677f, -0.022266f},
{ -0.866409f, -0.482294f, -0.129336f},
{ -0.126370f, -0.417052f, 0.900054f},
{ -0.071935f, -0.288515f, 0.954769f},
{ -0.269536f, 0.082910f, 0.959415f},
{ -0.324771f, 0.059266f, 0.943934f},
{ -0.398905f, 0.909177f, 0.119467f},
{ -0.406394f, 0.907452f, 0.106655f},
{ -0.405994f, 0.907377f, 0.108791f},
{ -0.508906f, 0.857674f, 0.073553f},
{ 0.140198f, 0.951031f, -0.275471f},
{ 0.113675f, 0.945623f, -0.304755f},
{ 0.071314f, 0.933984f, -0.350127f},
{ -0.285686f, 0.690396f, -0.664632f},
{ -0.269493f, -0.328647f, 0.905188f},
{ -0.342896f, -0.133301f, 0.929867f},
{ -0.349315f, -0.255883f, 0.901389f},
{ -0.381417f, -0.133472f, 0.914716f},
{ -0.949116f, -0.312244f, -0.041029f},
{ -0.949116f, -0.312244f, -0.041029f},
{ -0.949116f, -0.312244f, -0.041029f},
{ -0.949116f, -0.312244f, -0.041029f},
{ -0.424436f, 0.111748f, -0.898536f},
{ -0.393770f, 0.111647f, -0.912404f},
{ -0.403386f, -0.009445f, -0.914981f},
{ -0.350681f, -0.057370f, -0.934736f},
{ -0.283282f, 0.011049f, 0.958973f},
{ -0.343766f, -0.026880f, 0.938670f},
{ -0.944819f, 0.324799f, 0.042697f},
{ -0.944822f, 0.324790f, 0.042686f},
{ -0.944821f, 0.324793f, 0.042690f},
{ -0.944825f, 0.324783f, 0.042677f},
{ -0.389503f, 0.219192f, -0.894563f},
{ -0.333029f, 0.260245f, -0.906291f},
{ 0.195083f, -0.568692f, -0.799082f},
{ 0.118666f, -0.580673f, -0.805442f},
{ 0.177103f, -0.571837f, -0.801022f},
{ 0.083874f, -0.584943f, -0.806726f},
{ -0.958549f, 0.281602f, -0.043404f},
{ -0.960751f, 0.274540f, -0.039816f},
{ -0.137490f, -0.322380f, 0.936572f},
{ -0.059303f, -0.276484f, 0.959187f},
{ 0.976423f, -0.204840f, 0.068111f},
{ 0.976263f, -0.216302f, -0.011174f},
{ 0.904355f, -0.415676f, -0.096727f},
{ 0.904812f, -0.411279f, -0.110292f},
{ 0.127525f, 0.624248f, -0.770748f},
{ 0.014464f, 0.599841f, -0.799988f},
{ 0.077273f, 0.614452f, -0.785161f},
{ 0.000000f, 0.596107f, -0.802905f},
{ -0.998283f, 0.049944f, -0.030611f},
{ -0.996851f, 0.073482f, -0.029808f},
{ -0.022661f, -0.709017f, 0.704827f},
{ 0.000000f, -0.717437f, 0.696624f},
{ 0.995786f, 0.088299f, -0.024774f},
{ 0.997087f, 0.065034f, -0.039841f},
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
{ 0.680449f, -0.707787f, -0.189806f},
{ -0.973480f, -0.063640f, 0.219743f},
{ 0.599319f, -0.795429f, -0.090053f},
{ -0.899831f, -0.160984f, 0.405448f},
{ -0.372244f, -0.260261f, -0.890898f},
{ -0.328714f, -0.204653f, -0.921989f},
{ -0.330521f, -0.206936f, -0.920833f},
{ -0.303811f, -0.173389f, -0.936822f},
{ -0.685702f, 0.726859f, 0.038581f},
{ -0.658057f, 0.751771f, 0.042444f},
{ -0.938393f, -0.266962f, -0.219431f},
{ -0.914779f, -0.257178f, -0.311511f},
{ -0.929343f, -0.263076f, -0.259062f},
{ -0.909543f, -0.255129f, -0.328086f},
{ 0.647662f, -0.756112f, 0.093962f},
{ 0.791540f, -0.607654f, -0.064966f},
{ -0.583681f, -0.783954f, -0.211499f},
{ -0.668169f, -0.683265f, -0.294447f},
{ -0.733119f, -0.270421f, -0.624026f},
{ -0.740158f, -0.240867f, -0.627813f},
{ -0.821524f, 0.556039f, -0.126171f},
{ -0.733505f, 0.679614f, -0.009745f},
{ 0.402930f, 0.885416f, 0.231700f},
{ 0.228211f, 0.718943f, 0.656537f},
{ -0.180093f, 0.285285f, 0.941371f},
{ -0.260029f, 0.324238f, 0.909535f},
{ 0.770168f, -0.621754f, -0.142346f},
{ 0.770168f, -0.621754f, -0.142346f},
{ -0.593393f, -0.801960f, 0.068883f},
{ -0.593393f, -0.801960f, 0.068883f},
{ -0.811519f, 0.583174f, -0.036686f},
{ -0.811519f, 0.583174f, -0.036685f},
{ -0.811519f, 0.583173f, -0.036685f},
{ -0.811520f, 0.583172f, -0.036685f},
{ 0.351553f, 0.853056f, -0.385624f},
{ 0.354259f, 0.852273f, -0.384878f},
{ -0.806204f, 0.591620f, -0.004627f},
{ -0.806204f, 0.591620f, -0.004627f},
{ -0.806204f, 0.591620f, -0.004627f},
{ -0.806204f, 0.591620f, -0.004627f},
{ 0.566127f, 0.769145f, -0.296507f},
{ 0.566127f, 0.769145f, -0.296507f},
{ 0.566127f, 0.769145f, -0.296507f},
{ 0.566127f, 0.769145f, -0.296507f},
{ 0.806203f, -0.591620f, 0.004626f},
{ 0.806203f, -0.591620f, 0.004626f},
{ 0.806203f, -0.591620f, 0.004626f},
{ 0.806203f, -0.591621f, 0.004627f},
{ -0.374886f, -0.880460f, 0.290260f},
{ -0.374885f, -0.880460f, 0.290260f},
{ -0.374885f, -0.880460f, 0.290260f},
{ -0.374885f, -0.880460f, 0.290260f},
{ -0.184530f, -0.232322f, -0.954974f},
{ -0.184529f, -0.232322f, -0.954974f},
{ -0.184530f, -0.232322f, -0.954974f},
{ -0.184529f, -0.232322f, -0.954974f},
{ 0.189808f, 0.893310f, -0.407395f},
{ -0.229636f, 0.441390f, -0.867434f},
{ -0.238107f, 0.444089f, -0.863765f},
{ -0.262691f, 0.547622f, -0.794421f},
{ -0.219300f, 0.406865f, -0.886774f},
{ -0.192231f, 0.323569f, -0.926472f},
{ -0.191589f, 0.464960f, -0.864353f},
{ -0.140105f, 0.388096f, -0.910907f},
{ 0.141231f, 0.291777f, -0.946002f},
{ 0.051878f, 0.435193f, -0.898841f},
{ -0.170455f, 0.286138f, -0.942905f},
{ -0.085469f, 0.418206f, -0.904322f}};

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
118, 119, 120,
121, 19, 122,
123, 19, 18,
17, 21, 16,
16, 21, 20,
124, 22, 125,
126, 22, 21,
18, 19, 22,
22, 19, 23,
127, 128, 24,
24, 129, 25,
130, 131, 132,
133, 134, 26,
135, 136, 137,
138, 139, 26,
140, 24, 11,
11, 24, 27,
24, 25, 28,
28, 25, 29,
26, 30, 141,
142, 30, 143,
144, 31, 26,
26, 31, 30,
27, 24, 145,
146, 24, 28,
147, 33, 148,
149, 33, 32,
150, 30, 151,
152, 30, 153,
154, 155, 34,
34, 156, 35,
28, 157, 158,
159, 160, 161,
162, 163, 164,
165, 166, 167,
168, 169, 170,
171, 172, 173,
3, 174, 175,
176, 177, 178,
3, 179, 180,
181, 182, 183,
40, 41, 36,
37, 36, 41,
38, 42, 184,
185, 42, 186,
39, 43, 38,
38, 43, 42,
39, 37, 43,
43, 37, 41,
40, 44, 41,
41, 44, 45,
187, 42, 188,
189, 42, 46,
42, 43, 46,
46, 43, 47,
43, 41, 47,
47, 41, 45,
190, 191, 48,
48, 192, 49,
193, 48, 194,
195, 48, 50,
196, 50, 197,
198, 50, 51,
199, 200, 49,
49, 201, 51,
49, 51, 48,
48, 51, 50,
202, 203, 102,
102, 204, 101,
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
61, 67, 205,
56, 206, 0,
0, 207, 208,
12, 68, 2,
2, 68, 57,
68, 69, 57,
57, 69, 209,
210, 69, 211,
212, 69, 15,
213, 16, 214,
215, 16, 70,
216, 217, 218,
219, 220, 221,
71, 19, 222,
223, 19, 224,
20, 58, 16,
16, 58, 70,
58, 59, 225,
226, 59, 227,
71, 59, 19,
19, 59, 23,
228, 73, 229,
230, 73, 72,
231, 232, 233,
234, 235, 74,
74, 75, 236,
237, 75, 238,
239, 73, 240,
241, 73, 242,
73, 77, 72,
72, 77, 76,
243, 78, 244,
245, 78, 74,
74, 78, 75,
75, 78, 79,
246, 247, 73,
73, 248, 77,
62, 63, 249,
250, 63, 251,
83, 81, 57,
80, 85, 84,
86, 87, 82,
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
87, 88, 89,
90, 91, 92,};

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


//Vertices: 345  Texture Co-ords: 202  Normals: 304  Texture: IDLE Faces: 196 Smooth Groups: 94 sucess: 81 Doubles: 115 Redos needed: 148 Correct: 104