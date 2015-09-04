package com.example.jgfjhg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;
import android.graphics.Bitmap;
import android.opengl.GLUtils;

class luchwalka {

static String TextureName = "walk";

static int Vertices = 350;

static int VertTexts = 202;

static int Normals = 304;

static int Faces = 196;

static int FacesB = 33;

static int SmoothGroups = 94;

static float VertArray[] = new float[]{
 0.078843f, 8.337570f, 1.882418f,
 2.055986f, 8.364717f, 1.752113f,
 -0.565265f, 10.171105f, 1.441432f,
 1.864924f, 10.140112f, 2.088011f,
 0.078843f, 10.493659f, -1.946869f,
 2.818147f, 10.605585f, -1.529004f,
 0.078843f, 8.582074f, -2.278678f,
 2.574045f, 8.520979f, -1.943947f,
 0.078843f, 5.762167f, -2.076185f,
 1.558033f, 5.572424f, -1.872588f,
 1.056770f, 6.018668f, 0.560231f,
 0.078843f, 5.641511f, 0.440994f,
 0.078843f, 10.745238f, 0.903216f,
 1.085087f, 10.770204f, 0.615901f,
 1.085087f, 10.921548f, -1.125809f,
 0.078843f, 10.954778f, -1.508218f,
 0.078843f, 11.941592f, 1.278928f,
 1.491354f, 11.992050f, 0.698242f,
 1.491354f, 12.137848f, -0.979636f,
 0.078843f, 12.195168f, -1.639285f,
 0.078843f, 13.689572f, 1.181820f,
 1.031165f, 13.492540f, 0.930287f,
 1.031165f, 13.657309f, -0.965919f,
 0.078843f, 13.899157f, -1.230132f,
 1.071704f, 3.431042f, -0.164717f,
 2.099027f, 3.405692f, -0.195648f,
 2.123213f, 2.957366f, 0.975078f,
 1.095890f, 2.982716f, 1.006010f,
 0.733039f, -0.025459f, -2.883671f,
 2.545638f, -0.025459f, -2.883671f,
 2.545638f, 1.291012f, -0.735739f,
 0.733078f, 1.291012f, -0.735739f,
 0.778096f, -0.015118f, 1.648377f,
 2.416366f, -0.015118f, 1.648377f,
 2.244411f, 1.218862f, 0.306239f,
 0.998903f, 1.218862f, 0.306239f,
 3.614192f, 8.270540f, 0.872871f,
 2.454488f, 8.298807f, 1.770028f,
 3.343295f, 9.752503f, 0.416286f,
 2.366402f, 9.759771f, 1.755386f,
 3.564099f, 7.778834f, 2.885253f,
 3.462077f, 8.327184f, 2.529470f,
 4.088089f, 8.109745f, 3.245010f,
 4.013131f, 8.512630f, 2.983607f,
 2.054986f, 7.893433f, 4.403101f,
 1.833360f, 9.084634f, 3.630215f,
 2.864586f, 8.404713f, 4.958952f,
 2.681463f, 9.388971f, 4.320337f,
 1.158786f, 8.336891f, 5.343561f,
 0.937160f, 9.528092f, 4.570675f,
 1.968386f, 8.848170f, 5.899410f,
 1.785263f, 9.832428f, 5.260795f,
 0.078843f, 1.374928f, -4.382862f,
 0.078843f, 7.464554f, -3.367929f,
 3.985019f, 7.464556f, -2.939423f,
 6.554797f, 1.452697f, -4.886775f,
 -2.416360f, 8.362769f, 1.356700f,
 -2.667250f, 10.216439f, 0.495654f,
 -0.808397f, 13.492540f, 0.930287f,
 -0.808432f, 13.657309f, -0.965919f,
 -2.017656f, 10.077158f, -2.514781f,
 -2.416360f, 8.520979f, -1.943947f,
 -0.620411f, -0.015118f, 6.352583f,
 -2.258681f, -0.015118f, 6.352583f,
 -2.086726f, 1.218862f, 5.010445f,
 -0.841217f, 1.218862f, 5.010445f,
 -1.137706f, 4.771268f, -1.505163f,
 -1.167602f, 6.629929f, 0.006818f,
 -0.927402f, 10.770204f, 0.615901f,
 -0.927402f, 10.921548f, -1.125809f,
 -1.333669f, 11.992050f, 0.698242f,
 -1.333669f, 12.137848f, -0.979636f,
 -2.013442f, 4.172230f, 1.220161f,
 -0.998833f, 4.259010f, 1.361687f,
 -2.215667f, 4.765840f, 2.305939f,
 -1.201058f, 4.852621f, 2.447465f,
 -2.387953f, -0.025459f, 1.820535f,
 -0.575354f, -0.025459f, 1.820535f,
 -2.387953f, 1.291012f, 3.968467f,
 -0.575393f, 1.291012f, 3.968467f,
 -2.536362f, 9.187588f, -2.704613f,
 -2.630504f, 8.221869f, -0.594134f,
 -2.667175f, 10.108473f, -1.979010f,
 -2.830954f, 9.592101f, -0.361680f,
 -3.531774f, 7.302543f, -2.106045f,
 -3.284548f, 7.845912f, -1.820902f,
 -4.195589f, 7.522484f, -1.949619f,
 -4.013945f, 7.921711f, -1.740119f,
 -3.349882f, 5.818800f, -0.569867f,
 -2.812820f, 6.999185f, 0.049557f,
 -4.375522f, 6.158624f, -0.328177f,
 -3.931762f, 7.133944f, 0.183637f,
 -2.768322f, 6.345849f, 1.255985f,
 -3.305384f, 5.165464f, 0.636561f,
 -4.331024f, 5.505288f, 0.878250f,
 -3.887264f, 6.480609f, 1.390063f,
 -3.728272f, 7.056489f, -2.532432f,
 -6.068281f, 1.278036f, -0.114359f,
 5.603018f, 4.370850f, -4.002985f,
 0.078843f, 4.419741f, -3.644298f,
 -5.237312f, 4.048651f, -1.358157f,
 3.602179f, 8.595522f, -2.864687f,
 0.078843f, 9.586023f, -2.769940f,
 -3.436197f, 7.164267f, -2.526387f,
 2.055986f, 8.364717f, 1.752113f,
 1.056770f, 6.018668f, 0.560231f,
 1.056770f, 6.018668f, 0.560231f,
 0.078843f, 5.641511f, 0.440994f,
 2.818147f, 10.605585f, -1.529004f,
 2.818147f, 10.605585f, -1.529004f,
 1.085087f, 10.921548f, -1.125809f,
 2.818147f, 10.605585f, -1.529004f,
 0.078843f, 10.493659f, -1.946869f,
 1.085087f, 10.921548f, -1.125809f,
 1.085087f, 10.921548f, -1.125809f,
 0.078843f, 10.493659f, -1.946869f,
 0.078843f, 10.954778f, -1.508218f,
 0.078843f, 10.745238f, 0.903216f,
 1.085087f, 10.770204f, 0.615901f,
 1.085087f, 10.770204f, 0.615901f,
 1.085087f, 10.921548f, -1.125809f,
 1.491354f, 12.137848f, -0.979636f,
 1.085087f, 10.770204f, 0.615901f,
 1.085087f, 10.770204f, 0.615901f,
 1.491354f, 12.137848f, -0.979636f,
 1.491354f, 11.992050f, 0.698242f,
 1.491354f, 12.137848f, -0.979636f,
 1.491354f, 11.992050f, 0.698242f,
 1.491354f, 11.992050f, 0.698242f,
 0.078843f, 5.762167f, -2.076185f,
 1.558033f, 5.572424f, -1.872588f,
 1.558033f, 5.572424f, -1.872588f,
 1.558033f, 5.572424f, -1.872588f,
 1.056770f, 6.018668f, 0.560231f,
 2.099027f, 3.405692f, -0.195648f,
 2.099027f, 3.405692f, -0.195648f,
 1.056770f, 6.018668f, 0.560231f,
 0.078843f, 5.641511f, 0.440994f,
 1.095890f, 2.982716f, 1.006010f,
 1.056770f, 6.018668f, 0.560231f,
 1.056770f, 6.018668f, 0.560231f,
 1.095890f, 2.982716f, 1.006010f,
 0.078843f, 5.762167f, -2.076185f,
 2.099027f, 3.405692f, -0.195648f,
 2.099027f, 3.405692f, -0.195648f,
 2.545638f, -0.025459f, -2.883671f,
 1.095890f, 2.982716f, 1.006010f,
 0.733078f, 1.291012f, -0.735739f,
 0.733078f, 1.291012f, -0.735739f,
 2.545638f, -0.025459f, -2.883671f,
 0.733039f, -0.025459f, -2.883671f,
 0.733039f, -0.025459f, -2.883671f,
 2.545638f, -0.025459f, -2.883671f,
 2.416366f, -0.015118f, 1.648377f,
 2.416366f, -0.015118f, 1.648377f,
 2.244411f, 1.218862f, 0.306239f,
 2.545638f, 1.291012f, -0.735739f,
 0.733078f, 1.291012f, -0.735739f,
 0.733078f, 1.291012f, -0.735739f,
 0.778096f, -0.015118f, 1.648377f,
 0.733078f, 1.291012f, -0.735739f,
 0.733078f, 1.291012f, -0.735739f,
 0.778096f, -0.015118f, 1.648377f,
 0.998903f, 1.218862f, 0.306239f,
 2.055986f, 8.364717f, 1.752113f,
 2.574045f, 8.520979f, -1.943947f,
 2.454488f, 8.298807f, 1.770028f,
 2.574045f, 8.520979f, -1.943947f,
 3.614192f, 8.270540f, 0.872871f,
 2.454488f, 8.298807f, 1.770028f,
 2.818147f, 10.605585f, -1.529004f,
 3.343295f, 9.752503f, 0.416286f,
 2.574045f, 8.520979f, -1.943947f,
 2.574045f, 8.520979f, -1.943947f,
 3.343295f, 9.752503f, 0.416286f,
 3.614192f, 8.270540f, 0.872871f,
 2.366402f, 9.759771f, 1.755386f,
 2.818147f, 10.605585f, -1.529004f,
 2.818147f, 10.605585f, -1.529004f,
 2.366402f, 9.759771f, 1.755386f,
 3.343295f, 9.752503f, 0.416286f,
 2.055986f, 8.364717f, 1.752113f,
 2.366402f, 9.759771f, 1.755386f,
 2.366402f, 9.759771f, 1.755386f,
 2.055986f, 8.364717f, 1.752113f,
 2.454488f, 8.298807f, 1.770028f,
 3.614192f, 8.270540f, 0.872871f,
 3.614192f, 8.270540f, 0.872871f,
 3.564099f, 7.778834f, 2.885253f,
 3.564099f, 7.778834f, 2.885253f,
 3.564099f, 7.778834f, 2.885253f,
 2.054986f, 7.893433f, 4.403101f,
 1.833360f, 9.084634f, 3.630215f,
 2.054986f, 7.893433f, 4.403101f,
 2.054986f, 7.893433f, 4.403101f,
 2.864586f, 8.404713f, 4.958952f,
 2.054986f, 7.893433f, 4.403101f,
 2.054986f, 7.893433f, 4.403101f,
 2.681463f, 9.388971f, 4.320337f,
 2.864586f, 8.404713f, 4.958952f,
 2.864586f, 8.404713f, 4.958952f,
 2.681463f, 9.388971f, 4.320337f,
 1.833360f, 9.084634f, 3.630215f,
 1.833360f, 9.084634f, 3.630215f,
 0.078843f, 10.493659f, -1.946869f,
 2.818147f, 10.605585f, -1.529004f,
 2.818147f, 10.605585f, -1.529004f,
 -2.416360f, 8.362769f, 1.356700f,
 -1.167602f, 6.629929f, 0.006818f,
 -1.167602f, 6.629929f, 0.006818f,
 0.078843f, 5.641511f, 0.440994f,
 -2.017656f, 10.077158f, -2.514781f,
 -2.017656f, 10.077158f, -2.514781f,
 0.078843f, 10.493659f, -1.946869f,
 0.078843f, 10.493659f, -1.946869f,
 0.078843f, 10.954778f, -1.508218f,
 0.078843f, 10.745238f, 0.903216f,
 -0.927402f, 10.770204f, 0.615901f,
 -0.927402f, 10.770204f, 0.615901f,
 -1.333669f, 11.992050f, 0.698242f,
 -1.333669f, 12.137848f, -0.979636f,
 -0.927402f, 10.770204f, 0.615901f,
 -0.927402f, 10.770204f, 0.615901f,
 -1.333669f, 12.137848f, -0.979636f,
 -0.927402f, 10.921548f, -1.125809f,
 -0.927402f, 10.921548f, -1.125809f,
 -0.927402f, 10.921548f, -1.125809f,
 -1.333669f, 11.992050f, 0.698242f,
 -1.333669f, 11.992050f, 0.698242f,
 -1.333669f, 12.137848f, -0.979636f,
 0.078843f, 5.762167f, -2.076185f,
 -1.137706f, 4.771268f, -1.505163f,
 -1.137706f, 4.771268f, -1.505163f,
 -1.137706f, 4.771268f, -1.505163f,
 -2.013442f, 4.172230f, 1.220161f,
 -1.167602f, 6.629929f, 0.006818f,
 -1.167602f, 6.629929f, 0.006818f,
 -2.013442f, 4.172230f, 1.220161f,
 -1.167602f, 6.629929f, 0.006818f,
 -1.167602f, 6.629929f, 0.006818f,
 0.078843f, 5.641511f, 0.440994f,
 -1.201058f, 4.852621f, 2.447465f,
 0.078843f, 5.641511f, 0.440994f,
 0.078843f, 5.641511f, 0.440994f,
 0.078843f, 5.762167f, -2.076185f,
 -2.387953f, -0.025459f, 1.820535f,
 -2.013442f, 4.172230f, 1.220161f,
 -2.013442f, 4.172230f, 1.220161f,
 -1.201058f, 4.852621f, 2.447465f,
 -0.575393f, 1.291012f, 3.968467f,
 -0.575393f, 1.291012f, 3.968467f,};

static float VertArrayB[] = new float[]{
 -0.620411f, -0.015118f, 6.352583f,
 -2.258681f, -0.015118f, 6.352583f,
 -0.575354f, -0.025459f, 1.820535f,
 -0.575354f, -0.025459f, 1.820535f,
 -2.258681f, -0.015118f, 6.352583f,
 -2.387953f, -0.025459f, 1.820535f,
 -2.387953f, -0.025459f, 1.820535f,
 -2.258681f, -0.015118f, 6.352583f,
 -2.387953f, 1.291012f, 3.968467f,
 -2.387953f, 1.291012f, 3.968467f,
 -2.258681f, -0.015118f, 6.352583f,
 -2.086726f, 1.218862f, 5.010445f,
 -2.387953f, 1.291012f, 3.968467f,
 -2.086726f, 1.218862f, 5.010445f,
 -0.575393f, 1.291012f, 3.968467f,
 -0.575393f, 1.291012f, 3.968467f,
 -2.086726f, 1.218862f, 5.010445f,
 -0.841217f, 1.218862f, 5.010445f,
 -0.841217f, 1.218862f, 5.010445f,
 -0.620411f, -0.015118f, 6.352583f,
 -0.575393f, 1.291012f, 3.968467f,
 -0.575393f, 1.291012f, 3.968467f,
 -0.620411f, -0.015118f, 6.352583f,
 -0.575354f, -0.025459f, 1.820535f,
 -2.416360f, 8.362769f, 1.356700f,
 -2.630504f, 8.221869f, -0.594134f,
 -2.416360f, 8.520979f, -1.943947f,
 -2.630504f, 8.221869f, -0.594134f,
 -2.536362f, 9.187588f, -2.704613f,
 -2.416360f, 8.520979f, -1.943947f,
 -2.416360f, 8.520979f, -1.943947f,
 -2.536362f, 9.187588f, -2.704613f,
 -2.017656f, 10.077158f, -2.514781f,
 -2.536362f, 9.187588f, -2.704613f,
 -2.667175f, 10.108473f, -1.979010f,
 -2.017656f, 10.077158f, -2.514781f,
 -2.667175f, 10.108473f, -1.979010f,
 -2.830954f, 9.592101f, -0.361680f,
 -2.017656f, 10.077158f, -2.514781f,
 -2.017656f, 10.077158f, -2.514781f,
 -2.830954f, 9.592101f, -0.361680f,
 -2.667250f, 10.216439f, 0.495654f,
 -2.667250f, 10.216439f, 0.495654f,
 -2.630504f, 8.221869f, -0.594134f,
 -2.416360f, 8.362769f, 1.356700f,
 -2.630504f, 8.221869f, -0.594134f,
 -3.284548f, 7.845912f, -1.820902f,
 -2.536362f, 9.187588f, -2.704613f,
 -3.531774f, 7.302543f, -2.106045f,
 -4.195589f, 7.522484f, -1.949619f,
 -2.536362f, 9.187588f, -2.704613f,
 -2.536362f, 9.187588f, -2.704613f,
 -4.195589f, 7.522484f, -1.949619f,
 -2.667175f, 10.108473f, -1.979010f,
 -2.667175f, 10.108473f, -1.979010f,
 -4.013945f, 7.921711f, -1.740119f,
 -2.830954f, 9.592101f, -0.361680f,
 -2.830954f, 9.592101f, -0.361680f,
 -4.013945f, 7.921711f, -1.740119f,
 -2.630504f, 8.221869f, -0.594134f,
 -2.630504f, 8.221869f, -0.594134f,
 -4.013945f, 7.921711f, -1.740119f,
 -3.284548f, 7.845912f, -1.820902f,
 -3.531774f, 7.302543f, -2.106045f,
 -3.349882f, 5.818800f, -0.569867f,
 -4.195589f, 7.522484f, -1.949619f,
 -4.195589f, 7.522484f, -1.949619f,
 -3.349882f, 5.818800f, -0.569867f,
 -4.375522f, 6.158624f, -0.328177f,
 -3.349882f, 5.818800f, -0.569867f,
 -3.305384f, 5.165464f, 0.636561f,
 -2.812820f, 6.999185f, 0.049557f,
 -2.812820f, 6.999185f, 0.049557f,
 -3.305384f, 5.165464f, 0.636561f,
 -2.768322f, 6.345849f, 1.255985f,
 -4.331024f, 5.505288f, 0.878250f,
 -3.305384f, 5.165464f, 0.636561f,
 -4.375522f, 6.158624f, -0.328177f,
 -4.375522f, 6.158624f, -0.328177f,
 -3.305384f, 5.165464f, 0.636561f,
 -3.349882f, 5.818800f, -0.569867f,
 -3.887264f, 6.480609f, 1.390063f,
 -4.331024f, 5.505288f, 0.878250f,
 -3.931762f, 7.133944f, 0.183637f,
 -3.931762f, 7.133944f, 0.183637f,
 -4.331024f, 5.505288f, 0.878250f,
 -4.375522f, 6.158624f, -0.328177f,
 -2.812820f, 6.999185f, 0.049557f,
 -2.768322f, 6.345849f, 1.255985f,
 -3.931762f, 7.133944f, 0.183637f,
 -3.931762f, 7.133944f, 0.183637f,
 -2.768322f, 6.345849f, 1.255985f,
 -3.887264f, 6.480609f, 1.390063f,
 0.078843f, 10.493659f, -1.946869f,
 0.078843f, 9.586023f, -2.769940f,
 -2.017656f, 10.077158f, -2.514781f,
 -2.017656f, 10.077158f, -2.514781f,
 0.078843f, 9.586023f, -2.769940f,
 -3.436197f, 7.164267f, -2.526387f,};

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
 0.962340f, 0.570236f,
 0.920320f, 0.547872f,
 0.964229f, 0.507208f,
 0.964229f, 0.507208f,
 0.920320f, 0.547872f,
 0.925476f, 0.499804f,
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
 0.674193f, 0.681378f,
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
 0.108145f, 0.061199f,};

static float[] TextArrayB = new float[]{
 0.602870f, 0.274197f,
 0.602871f, 0.326231f,
 0.458925f, 0.272771f,
 0.458925f, 0.272771f,
 0.602871f, 0.326231f,
 0.458927f, 0.330342f,
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
 0.788493f, 0.832655f,
 0.809815f, 0.854360f,
 0.819562f, 0.990842f,
 0.809815f, 0.854360f,
 0.832127f, 0.948011f,
 0.819562f, 0.990842f,
 0.964216f, 0.855555f,
 0.925462f, 0.862950f,
 0.962341f, 0.792524f,
 0.925462f, 0.862950f,
 0.920318f, 0.814883f,
 0.962341f, 0.792524f,
 0.920318f, 0.814883f,
 0.836659f, 0.814916f,
 0.962341f, 0.792524f,
 0.962341f, 0.792524f,
 0.836659f, 0.814916f,
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
 0.200327f, 0.935933f,
 0.249424f, 0.933539f,
 0.201459f, 0.877993f,
 0.201459f, 0.877993f,
 0.249424f, 0.933539f,
 0.249217f, 0.874910f,
 0.301860f, 0.930908f,
 0.249424f, 0.933539f,
 0.302124f, 0.983361f,
 0.302124f, 0.983361f,
 0.249424f, 0.933539f,
 0.249642f, 0.985999f,
 0.302065f, 0.877358f,
 0.301860f, 0.930908f,
 0.353274f, 0.877965f,
 0.353274f, 0.877965f,
 0.301860f, 0.930908f,
 0.352586f, 0.930336f,
 0.250990f, 0.823806f,
 0.249217f, 0.874910f,
 0.302280f, 0.822266f,
 0.302280f, 0.822266f,
 0.249217f, 0.874910f,
 0.302065f, 0.877358f,
 0.739076f, 0.221742f,
 0.789643f, 0.221742f,
 0.739076f, 0.301810f,
 0.739076f, 0.301810f,
 0.789643f, 0.221742f,
 0.789643f, 0.334905f,};

static float[][] NormArray = new float[][]{
{ 0.066461f, -0.343156f, 0.936924f},
{ -0.099224f, 0.284541f, 0.953515f},
{ -0.067455f, -0.190038f, 0.979457f},
{ -0.211758f, 0.448982f, 0.868086f},
{ 0.223208f, 0.971111f, 0.084384f},
{ 0.223208f, 0.971112f, 0.084384f},
{ 0.223208f, 0.971112f, 0.084384f},
{ 0.223208f, 0.971111f, 0.084384f},
{ 0.141326f, 0.177318f, -0.973954f},
{ 0.136564f, 0.059618f, -0.988836f},
{ 0.137571f, 0.172566f, -0.975344f},
{ 0.133189f, 0.036161f, -0.990431f},
{ 0.000000f, -0.946364f, 0.323104f},
{ 0.000000f, -0.960351f, 0.278793f},
{ 0.000000f, 0.736146f, 0.676823f},
{ 0.000000f, 0.736147f, 0.676822f},
{ 0.129701f, -0.069713f, -0.989100f},
{ 0.127062f, -0.071043f, -0.989347f},
{ 0.894016f, -0.435091f, 0.106915f},
{ 0.970695f, -0.185787f, 0.152425f},
{ 0.909991f, -0.375224f, 0.176417f},
{ 0.971501f, -0.094306f, 0.217469f},
{ -0.003930f, -0.252668f, 0.967545f},
{ -0.057639f, -0.161987f, 0.985108f},
{ -0.094063f, 0.885666f, 0.454695f},
{ 0.222081f, 0.522540f, 0.823184f},
{ 0.479315f, 0.845559f, 0.235133f},
{ 0.325982f, 0.927157f, 0.184705f},
{ 0.318040f, 0.929730f, 0.185617f},
{ 0.197785f, 0.976566f, 0.084858f},
{ 0.041085f, 0.864532f, -0.500896f},
{ 0.123999f, 0.809523f, -0.573843f},
{ 0.055202f, 0.856123f, -0.513815f},
{ 0.285686f, 0.660510f, -0.694341f},
{ 0.269493f, -0.288535f, 0.918760f},
{ 0.349558f, -0.215778f, 0.911729f},
{ 0.336915f, -0.096433f, 0.936584f},
{ 0.381376f, -0.099649f, 0.919033f},
{ 0.949115f, -0.313746f, -0.027263f},
{ 0.949115f, -0.313746f, -0.027263f},
{ 0.949115f, -0.313746f, -0.027263f},
{ 0.949115f, -0.313746f, -0.027263f},
{ 0.350681f, -0.098408f, -0.931310f},
{ 0.387636f, 0.068754f, -0.919245f},
{ 0.403393f, -0.049654f, -0.913679f},
{ 0.424392f, 0.062785f, -0.903299f},
{ 0.336388f, 0.005138f, 0.941710f},
{ 0.265332f, 0.053481f, 0.962673f},
{ 0.956829f, 0.289561f, 0.025161f},
{ 0.956829f, 0.289561f, 0.025161f},
{ 0.956829f, 0.289561f, 0.025161f},
{ 0.956829f, 0.289561f, 0.025161f},
{ 0.381537f, 0.169937f, -0.908598f},
{ 0.312578f, 0.221779f, -0.923639f},
{ 0.026731f, -0.627010f, -0.778552f},
{ 0.016207f, -0.625694f, -0.779900f},
{ -0.013569f, -0.621586f, -0.783228f},
{ -0.038891f, -0.617644f, -0.785496f},
{ 0.952265f, 0.294878f, 0.078988f},
{ 0.954229f, 0.285351f, 0.089560f},
{ -0.005911f, -0.223842f, 0.974607f},
{ 0.014881f, -0.439384f, 0.898176f},
{ -0.914013f, -0.405219f, -0.019423f},
{ -0.978412f, -0.203671f, -0.035054f},
{ -0.915431f, -0.400632f, -0.038486f},
{ -0.986041f, -0.161279f, -0.041390f},
{ -0.008384f, 0.618747f, -0.785545f},
{ -0.005052f, 0.617941f, -0.786209f},
{ -0.000925f, 0.616931f, -0.787017f},
{ 0.000000f, 0.616703f, -0.787196f},
{ 0.995964f, 0.085077f, -0.028598f},
{ 0.997814f, 0.056350f, -0.034537f},
{ 0.000638f, -0.716613f, 0.697471f},
{ 0.000000f, -0.716354f, 0.697737f},
{ -0.996685f, 0.077241f, -0.025558f},
{ -0.998007f, 0.053813f, -0.032964f},
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
{ -0.160039f, -0.985029f, -0.064077f},
{ -0.080124f, -0.994849f, -0.062092f},
{ -0.076175f, -0.996450f, -0.035850f},
{ -0.081345f, -0.995514f, -0.048325f},
{ 0.957508f, -0.055799f, -0.282957f},
{ 0.945583f, 0.030255f, -0.323972f},
{ 0.953541f, -0.019444f, -0.300634f},
{ 0.937914f, 0.066566f, -0.340419f},
{ 0.524166f, 0.800425f, 0.290811f},
{ 0.404943f, 0.868274f, 0.286568f},
{ 0.489526f, -0.110955f, 0.864901f},
{ 0.157682f, -0.037402f, 0.986781f},
{ 0.435637f, -0.099034f, 0.894658f},
{ -0.043692f, 0.007378f, 0.999018f},
{ -0.708141f, -0.472293f, -0.524857f},
{ -0.683050f, -0.675728f, -0.277190f},
{ 0.974990f, 0.120736f, -0.186596f},
{ 0.671895f, -0.731882f, 0.113602f},
{ 0.978476f, 0.080483f, -0.190020f},
{ 0.473927f, -0.873286f, 0.112984f},
{ 0.970072f, 0.023687f, -0.241661f},
{ 0.798346f, 0.596867f, 0.079958f},
{ -0.601153f, -0.028241f, 0.798635f},
{ -0.589996f, 0.669243f, 0.451685f},
{ -0.605091f, -0.032961f, 0.795474f},
{ -0.121792f, 0.961847f, -0.244984f},
{ -0.632337f, -0.501022f, -0.590870f},
{ -0.632337f, -0.501022f, -0.590870f},
{ 0.302923f, -0.879280f, 0.367566f},
{ 0.302923f, -0.879280f, 0.367566f},
{ 0.763101f, 0.445658f, 0.468045f},
{ 0.763101f, 0.445658f, 0.468045f},
{ 0.763101f, 0.445658f, 0.468045f},
{ 0.763101f, 0.445658f, 0.468045f},
{ 0.082424f, 0.872601f, -0.481429f},
{ 0.079589f, 0.872285f, -0.482477f},
{ 0.741601f, 0.456760f, 0.491322f},
{ 0.741601f, 0.456761f, 0.491322f},
{ 0.741601f, 0.456761f, 0.491322f},
{ 0.741601f, 0.456761f, 0.491322f},
{ -0.154211f, 0.828857f, -0.537787f},
{ -0.154211f, 0.828857f, -0.537787f},
{ -0.154211f, 0.828857f, -0.537787f},
{ -0.154211f, 0.828857f, -0.537787f},
{ -0.741600f, -0.456761f, -0.491323f},
{ -0.741601f, -0.456761f, -0.491323f},
{ -0.741601f, -0.456761f, -0.491322f},
{ -0.741601f, -0.456761f, -0.491322f},
{ -0.012725f, -0.909039f, 0.416516f},
{ -0.012725f, -0.909039f, 0.416516f},
{ -0.012725f, -0.909039f, 0.416516f},
{ -0.012725f, -0.909039f, 0.416516f},
{ 0.664467f, -0.315827f, -0.677301f},
{ 0.664467f, -0.315827f, -0.677301f},
{ 0.664467f, -0.315827f, -0.677301f},
{ 0.664467f, -0.315827f, -0.677301f},
{ 0.085242f, 0.669310f, -0.738077f},
{ 0.138059f, 0.593833f, -0.792655f},
{ 0.082871f, 0.437620f, -0.895333f},
{ 0.115518f, 0.344485f, -0.931657f},
{ 0.089407f, 0.151688f, -0.984376f},
{ -0.011331f, 0.240811f, -0.970506f},
{ -0.018010f, 0.212576f, -0.976979f},
{ -0.069974f, 0.271472f, -0.959899f},
{ -0.287114f, -0.323640f, 0.901567f},
{ -0.263504f, 0.345785f, 0.900555f},
{ -0.284127f, -0.161833f, 0.945030f},
{ -0.368646f, 0.401180f, 0.838543f},
{ -0.238670f, 0.967455f, 0.084066f},
{ -0.238671f, 0.967455f, 0.084067f},
{ -0.238676f, 0.967453f, 0.084069f},
{ -0.238680f, 0.967452f, 0.084070f},
{ 0.226847f, 0.166562f, -0.959582f},
{ -0.063079f, -0.093037f, -0.993663f},
{ -0.008244f, -0.167250f, -0.985880f},
{ -0.125164f, -0.205749f, -0.970568f},
{ 0.000000f, -0.946364f, 0.323103f},
{ 0.000000f, 0.736147f, 0.676822f},
{ 0.000000f, -0.960351f, 0.278792f},
{ 0.000000f, 0.736147f, 0.676822f},
{ -0.379222f, -0.066274f, -0.922929f},
{ -0.184070f, -0.138751f, -0.973071f},
{ -0.995364f, -0.069820f, 0.066148f},
{ -0.972322f, -0.233619f, 0.003475f},
{ -0.887608f, -0.437475f, 0.144107f},
{ -0.820964f, -0.570325f, -0.027337f},
{ -0.206118f, -0.194397f, 0.959023f},
{ -0.126355f, 0.261045f, 0.957022f},
{ -0.159401f, 0.764434f, 0.624685f},
{ -0.250502f, 0.727981f, 0.638194f},
{ -0.307426f, 0.948000f, 0.082376f},
{ -0.442746f, 0.892417f, -0.086996f},
{ -0.501994f, 0.861618f, -0.074940f},
{ -0.457790f, 0.882667f, -0.106427f},
{ -0.037409f, 0.866658f, -0.497499f},
{ -0.054050f, 0.856824f, -0.512768f},
{ -0.083231f, 0.838272f, -0.538862f},
{ -0.285686f, 0.660510f, -0.694341f},
{ -0.269494f, -0.288535f, 0.918760f},
{ -0.342724f, -0.093063f, 0.934815f},
{ -0.349558f, -0.215778f, 0.911729f},
{ -0.381421f, -0.092440f, 0.919768f},
{ -0.949115f, -0.313746f, -0.027263f},
{ -0.949115f, -0.313746f, -0.027263f},
{ -0.949115f, -0.313746f, -0.027263f},
{ -0.949115f, -0.313746f, -0.027263f},
{ -0.424433f, 0.071321f, -0.902646f},
{ -0.393699f, 0.072286f, -0.916393f},
{ -0.403392f, -0.049654f, -0.913679f},
{ -0.350681f, -0.098408f, -0.931310f},
{ -0.283283f, 0.053197f, 0.957560f},
{ -0.343829f, 0.014371f, 0.938922f},
{ -0.944819f, 0.326362f, 0.028376f},
{ -0.944822f, 0.326352f, 0.028366f},
{ -0.944821f, 0.326356f, 0.028370f},
{ -0.944825f, 0.326345f, 0.028358f},
{ -0.389682f, 0.179521f, -0.903283f},
{ -0.333029f, 0.220150f, -0.916856f},
{ 0.572740f, -0.801704f, -0.170995f},
{ 0.250860f, -0.950754f, -0.182035f},
{ 0.529372f, -0.830352f, -0.174013f},
{ 0.108721f, -0.977648f, -0.179956f},
{ -0.976557f, 0.111993f, -0.183833f},
{ -0.979591f, 0.029857f, -0.198771f},
{ -0.160816f, 0.590715f, 0.790692f},
{ -0.034900f, 0.606131f, 0.794599f},
{ 0.986651f, 0.097390f, 0.130518f},
{ 0.991233f, -0.095044f, 0.091780f},
{ 0.793293f, -0.608665f, 0.014590f},
{ 0.778531f, -0.626886f, -0.030049f},
{ 0.145219f, -0.091156f, -0.985191f},
{ 0.019035f, -0.135165f, -0.990640f},
{ 0.081309f, -0.113764f, -0.990175f},
{ 0.000000f, -0.141584f, -0.989926f},
{ -0.997436f, 0.061015f, -0.037396f},
{ -0.999830f, 0.015601f, -0.009791f},
{ -0.020980f, 0.398559f, 0.916903f},
{ 0.000000f, 0.392741f, 0.919649f},
{ 0.998653f, 0.051179f, -0.008522f},
{ 0.996195f, 0.074312f, -0.045528f},
{ 0.000000f, -0.999997f, 0.002282f},
{ 0.000000f, -0.999997f, 0.002282f},
{ -0.997819f, 0.017447f, 0.063662f},
{ -0.862197f, 0.423114f, 0.278552f},
{ 0.000000f, 0.997611f, 0.069077f},
{ 0.000000f, 0.997611f, 0.069077f},
{ 0.000000f, 0.997611f, 0.069078f},
{ 0.000000f, 0.997611f, 0.069079f},
{ 0.867985f, 0.428427f, 0.251102f},
{ 0.998095f, 0.044185f, 0.043053f},
{ 0.737915f, -0.674119f, -0.032313f},
{ 0.737586f, -0.664362f, -0.120794f},
{ -0.825328f, -0.509310f, -0.243796f},
{ 0.725689f, -0.648531f, -0.229745f},
{ 0.808013f, -0.374005f, -0.455231f},
{ 0.573386f, -0.163001f, -0.802907f},
{ -0.003346f, 0.210563f, -0.977575f},
{ -0.548854f, 0.467861f, -0.692724f},
{ -0.566434f, 0.800681f, 0.195097f},
{ -0.836905f, 0.544570f, -0.055075f},
{ -0.929776f, -0.189551f, 0.315574f},
{ -0.985526f, -0.094906f, 0.140470f},
{ -0.986394f, -0.092449f, 0.135943f},
{ -0.990128f, -0.080815f, 0.114524f},
{ 0.869927f, -0.442625f, -0.217507f},
{ 0.926077f, -0.304177f, -0.223290f},
{ -0.336256f, -0.412855f, -0.846453f},
{ -0.472917f, -0.379478f, -0.795202f},
{ -0.656432f, 0.351447f, -0.667520f},
{ -0.677552f, 0.393395f, -0.621420f},
{ -0.842058f, 0.495258f, -0.213678f},
{ -0.852167f, 0.523004f, -0.016692f},
{ -0.594024f, -0.218252f, 0.774275f},
{ -0.184162f, 0.481735f, 0.856747f},
{ -0.571985f, -0.291291f, 0.766800f},
{ 0.157255f, 0.488761f, 0.858128f},
{ 0.910963f, -0.237498f, -0.337256f},
{ 0.910963f, -0.237498f, -0.337256f},
{ -0.374488f, -0.688698f, -0.620849f},
{ -0.374488f, -0.688698f, -0.620849f},
{ -0.927550f, 0.330262f, 0.174866f},
{ -0.927550f, 0.330262f, 0.174865f},
{ -0.927550f, 0.330262f, 0.174865f},
{ -0.927550f, 0.330262f, 0.174865f},
{ 0.152032f, 0.914871f, 0.374029f},
{ 0.154990f, 0.914096f, 0.374709f},
{ -0.926984f, 0.314461f, 0.204485f},
{ -0.926984f, 0.314461f, 0.204485f},
{ -0.926984f, 0.314461f, 0.204485f},
{ -0.926984f, 0.314461f, 0.204485f},
{ 0.373696f, 0.821332f, 0.431006f},
{ 0.373696f, 0.821332f, 0.431005f},
{ 0.373696f, 0.821332f, 0.431005f},
{ 0.373697f, 0.821332f, 0.431005f},
{ 0.926984f, -0.314460f, -0.204486f},
{ 0.926984f, -0.314460f, -0.204486f},
{ 0.926984f, -0.314461f, -0.204486f},
{ 0.926984f, -0.314461f, -0.204486f},
{ -0.160597f, -0.870391f, -0.465433f},
{ -0.160597f, -0.870391f, -0.465434f},
{ -0.160597f, -0.870391f, -0.465434f},
{ -0.160597f, -0.870391f, -0.465433f},
{ -0.047003f, 0.480842f, -0.875547f},
{ -0.047003f, 0.480842f, -0.875547f},
{ -0.047003f, 0.480842f, -0.875547f},
{ -0.047004f, 0.480842f, -0.875547f},
{ 0.067060f, 0.670243f, -0.739106f},
{ -0.151258f, 0.303803f, -0.940651f},
{ -0.094347f, 0.111235f, -0.989306f},
{ -0.188245f, 0.234242f, -0.953779f},
{ -0.232890f, 0.159758f, -0.959291f},
{ -0.355959f, 0.120829f, -0.926657f},
{ -0.354563f, -0.118548f, -0.927487f},
{ -0.502852f, -0.142257f, -0.852586f},
{ -0.065633f, 0.243713f, -0.967624f},
{ -0.077962f, 0.265598f, -0.960926f},
{ -0.448108f, 0.112343f, -0.886892f},
{ -0.557323f, -0.195146f, -0.807037f}};

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
3, 108, 13,
13, 109, 110,
111, 112, 113,
114, 115, 116,
117, 118, 16,
16, 119, 17,
120, 121, 122,
123, 124, 125,
15, 19, 14,
14, 19, 18,
17, 21, 16,
16, 21, 20,
126, 22, 127,
128, 22, 21,
18, 19, 22,
22, 19, 23,
129, 130, 24,
24, 131, 25,
132, 133, 134,
135, 136, 26,
137, 138, 139,
140, 141, 26,
142, 24, 11,
11, 24, 27,
24, 25, 28,
28, 25, 29,
26, 30, 143,
144, 30, 145,
146, 31, 26,
26, 31, 30,
27, 24, 147,
148, 24, 28,
149, 33, 150,
151, 33, 32,
152, 30, 153,
154, 30, 155,
156, 157, 34,
34, 158, 35,
28, 159, 160,
161, 162, 163,
164, 165, 166,
167, 168, 169,
170, 171, 172,
173, 174, 175,
3, 176, 177,
178, 179, 180,
3, 181, 182,
183, 184, 185,
40, 41, 36,
37, 36, 41,
38, 42, 186,
187, 42, 188,
42, 38, 43,
38, 39, 43,
37, 41, 39,
39, 41, 43,
41, 40, 45,
45, 40, 44,
42, 46, 189,
190, 46, 191,
43, 47, 42,
42, 47, 46,
43, 41, 47,
47, 41, 45,
192, 49, 193,
194, 49, 48,
195, 196, 50,
50, 197, 48,
198, 199, 51,
51, 200, 50,
201, 51, 202,
203, 51, 49,
49, 51, 48,
48, 51, 50,
204, 205, 102,
102, 206, 101,
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
61, 67, 207,
56, 208, 0,
0, 209, 210,
12, 68, 2,
2, 68, 57,
68, 69, 57,
57, 69, 211,
212, 69, 213,
214, 69, 215,
216, 16, 217,
218, 16, 70,
219, 220, 221,
222, 223, 224,
71, 19, 225,
226, 19, 15,
20, 58, 16,
16, 58, 70,
58, 59, 227,
228, 59, 229,
71, 59, 19,
19, 59, 23,
230, 73, 231,
232, 73, 72,
233, 234, 235,
236, 237, 74,
74, 75, 238,
239, 75, 240,
241, 73, 242,
243, 73, 244,
73, 77, 72,
72, 77, 76,
245, 78, 246,
247, 78, 74,
74, 78, 75,
75, 78, 79,
248, 249, 73,
73, 250, 77,
83, 81, 57,
80, 85, 84,
86, 87, 82,
89, 88, 85,
85, 88, 84,
86, 90, 87,
87, 90, 91,
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
96, 103, 53,
103, 102, 53, };

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
90, 91, 92,
93, 94, 95,
96, 97, 98,};

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


//Vertices: 350  Texture Co-ords: 202  Normals: 304  Texture: walk Faces: 196 Smooth Groups: 94 sucess: 82 Doubles: 114 Redos needed: 147 Correct: 96