package com.example.jgfjhg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;
import android.graphics.Bitmap;
import android.opengl.GLUtils;

class luchwalke {

static String TextureName = "walk";

static int Vertices = 345;

static int VertTexts = 202;

static int Normals = 304;

static int Faces = 196;

static int FacesB = 31;

static int SmoothGroups = 94;

static float VertArray[] = new float[]{
 0.078843f, 9.276783f, 1.882418f,
 2.045653f, 9.252621f, 1.384799f,
 -0.565265f, 11.110319f, 1.441432f,
 1.864924f, 11.079326f, 2.088011f,
 0.078843f, 11.432873f, -1.946869f,
 2.816144f, 11.342703f, -1.312203f,
 0.078843f, 9.521288f, -2.278678f,
 2.574045f, 9.460193f, -1.943947f,
 0.078843f, 6.701381f, -2.076185f,
 1.509131f, 6.339177f, -1.853406f,
 1.100631f, 7.065973f, 0.527207f,
 0.078843f, 6.580724f, 0.440994f,
 0.078843f, 11.684452f, 0.903216f,
 1.085087f, 11.709418f, 0.615901f,
 1.085087f, 11.860762f, -1.125809f,
 0.078843f, 11.893991f, -1.508218f,
 0.078843f, 12.880806f, 1.278928f,
 1.491354f, 12.931264f, 0.698242f,
 1.491354f, 13.077062f, -0.979636f,
 0.078843f, 13.134382f, -1.639285f,
 0.078843f, 14.628786f, 1.181820f,
 1.031165f, 14.431754f, 0.930287f,
 1.031165f, 14.596523f, -0.965919f,
 0.078843f, 14.838371f, -1.230132f,
 1.000440f, 4.172165f, -0.026723f,
 2.025809f, 4.129602f, 0.034906f,
 1.948955f, 4.089349f, 1.285768f,
 0.923586f, 4.131913f, 1.224138f,
 0.706535f, 0.075892f, -1.386941f,
 2.499403f, 0.075892f, -1.653662f,
 2.815468f, 1.392362f, 0.470888f,
 1.022639f, 1.392362f, 0.737604f,
 1.417987f, 0.086233f, 3.089143f,
 3.038423f, 0.086233f, 2.848074f,
 2.670846f, 1.320212f, 1.545848f,
 1.438895f, 1.320212f, 1.729123f,
 2.563049f, 10.591699f, -0.905488f,
 2.412659f, 9.178024f, 1.079377f,
 3.073128f, 11.088506f, 0.183457f,
 2.505816f, 10.433291f, 1.547014f,
 3.383007f, 8.733264f, -0.970336f,
 3.166816f, 9.035161f, -0.422798f,
 4.052974f, 8.753381f, -0.716896f,
 3.894133f, 8.975193f, -0.314607f,
 2.987294f, 6.663902f, -0.575913f,
 2.517652f, 7.319727f, 0.613524f,
 4.022440f, 6.694983f, -0.184329f,
 3.634388f, 7.236874f, 0.798470f,
 2.817865f, 5.443831f, 0.029905f,
 2.348223f, 6.099656f, 1.219341f,
 3.853011f, 5.474914f, 0.421487f,
 3.464958f, 6.016804f, 1.404287f,
 0.078843f, 1.697955f, -3.524950f,
 0.078843f, 8.403768f, -3.367929f,
 3.985019f, 8.403770f, -1.440219f,
 6.570219f, 2.246756f, 0.802044f,
 -2.416360f, 9.301983f, 1.356700f,
 -2.667250f, 11.155653f, 0.495654f,
 -0.808397f, 14.431754f, 0.930287f,
 -0.808432f, 14.596523f, -0.965919f,
 -2.014557f, 10.825478f, -2.460550f,
 -2.416360f, 9.460193f, -1.943947f,
 -0.889424f, 0.587220f, 2.229727f,
 -2.524316f, 0.587220f, 2.124590f,
 -2.285759f, 2.082373f, 1.094435f,
 -1.042818f, 2.082373f, 1.174367f,
 -1.325477f, 6.196687f, -1.841824f,
 -0.997873f, 7.259922f, 0.376267f,
 -0.927402f, 11.709418f, 0.615901f,
 -0.927402f, 11.860762f, -1.125809f,
 -1.333669f, 12.931264f, 0.698242f,
 -1.333669f, 13.077062f, -0.979636f,
 -2.007629f, 4.955277f, 0.430444f,
 -1.009287f, 4.848488f, 0.651579f,
 -2.306336f, 4.509109f, 1.563532f,
 -1.307993f, 4.402319f, 1.784667f,
 -2.369220f, 1.557746f, -2.301503f,
 -0.560358f, 1.557746f, -2.185178f,
 -2.522081f, 2.378271f, 0.075486f,
 -0.713258f, 2.378271f, 0.191809f,
 -2.940833f, 9.524349f, -2.199340f,
 -2.855281f, 9.196361f, -0.203901f,
 -2.692814f, 10.893608f, -1.981250f,
 -2.876553f, 10.675189f, -0.242088f,
 -4.376987f, 8.367658f, -1.367994f,
 -3.974906f, 8.640263f, -0.918890f,
 -4.899353f, 8.818089f, -1.173730f,
 -4.603933f, 9.018378f, -0.843763f,
 -5.114673f, 6.621529f, -0.367357f,
 -4.241212f, 7.213720f, 0.608248f,
 -5.921766f, 7.317477f, -0.067205f,
 -5.200048f, 7.806788f, 0.738912f,
 -4.689309f, 6.321959f, 1.550727f,
 -5.562770f, 5.729768f, 0.575122f,
 -6.369862f, 6.425716f, 0.875274f,
 -5.648144f, 6.915027f, 1.681390f,
 -3.437903f, 8.241636f, -3.168911f,
 -6.078133f, 0.968157f, -2.772418f,
 5.619378f, 5.156084f, -0.111354f,
 0.078843f, 5.358955f, -3.644298f,
 -5.276251f, 4.012536f, -2.823275f,
 3.609604f, 9.230431f, -1.731214f,
 0.078843f, 10.525237f, -2.769940f,
 -3.453109f, 8.262653f, -3.180304f,
 2.045653f, 9.252621f, 1.384799f,
 1.100631f, 7.065973f, 0.527207f,
 1.100631f, 7.065973f, 0.527207f,
 0.078843f, 6.580724f, 0.440994f,
 2.816144f, 11.342703f, -1.312203f,
 2.816144f, 11.342703f, -1.312203f,
 1.085087f, 11.860762f, -1.125809f,
 2.816144f, 11.342703f, -1.312203f,
 0.078843f, 11.432873f, -1.946869f,
 1.085087f, 11.860762f, -1.125809f,
 1.085087f, 11.860762f, -1.125809f,
 0.078843f, 11.432873f, -1.946869f,
 0.078843f, 11.893991f, -1.508218f,
 0.078843f, 11.684452f, 0.903216f,
 1.085087f, 11.709418f, 0.615901f,
 1.085087f, 11.709418f, 0.615901f,
 1.085087f, 11.860762f, -1.125809f,
 1.491354f, 13.077062f, -0.979636f,
 1.085087f, 11.709418f, 0.615901f,
 1.085087f, 11.709418f, 0.615901f,
 1.491354f, 13.077062f, -0.979636f,
 1.491354f, 12.931264f, 0.698242f,
 1.491354f, 13.077062f, -0.979636f,
 1.491354f, 12.931264f, 0.698242f,
 1.491354f, 12.931264f, 0.698242f,
 0.078843f, 6.701381f, -2.076185f,
 1.509131f, 6.339177f, -1.853406f,
 1.509131f, 6.339177f, -1.853406f,
 1.509131f, 6.339177f, -1.853406f,
 1.100631f, 7.065973f, 0.527207f,
 2.025809f, 4.129602f, 0.034906f,
 2.025809f, 4.129602f, 0.034906f,
 1.100631f, 7.065973f, 0.527207f,
 0.078843f, 6.580724f, 0.440994f,
 0.923586f, 4.131913f, 1.224138f,
 1.100631f, 7.065973f, 0.527207f,
 1.100631f, 7.065973f, 0.527207f,
 0.923586f, 4.131913f, 1.224138f,
 0.078843f, 6.701381f, -2.076185f,
 2.025809f, 4.129602f, 0.034906f,
 2.025809f, 4.129602f, 0.034906f,
 2.499403f, 0.075892f, -1.653662f,
 0.923586f, 4.131913f, 1.224138f,
 1.022639f, 1.392362f, 0.737604f,
 1.022639f, 1.392362f, 0.737604f,
 2.499403f, 0.075892f, -1.653662f,
 0.706535f, 0.075892f, -1.386941f,
 0.706535f, 0.075892f, -1.386941f,
 2.499403f, 0.075892f, -1.653662f,
 3.038423f, 0.086233f, 2.848074f,
 3.038423f, 0.086233f, 2.848074f,
 2.670846f, 1.320212f, 1.545848f,
 2.815468f, 1.392362f, 0.470888f,
 1.022639f, 1.392362f, 0.737604f,
 1.022639f, 1.392362f, 0.737604f,
 1.417987f, 0.086233f, 3.089143f,
 1.022639f, 1.392362f, 0.737604f,
 1.022639f, 1.392362f, 0.737604f,
 1.417987f, 0.086233f, 3.089143f,
 1.438895f, 1.320212f, 1.729123f,
 2.045653f, 9.252621f, 1.384799f,
 2.574045f, 9.460193f, -1.943947f,
 2.412659f, 9.178024f, 1.079377f,
 2.574045f, 9.460193f, -1.943947f,
 2.563049f, 10.591699f, -0.905488f,
 2.412659f, 9.178024f, 1.079377f,
 2.574045f, 9.460193f, -1.943947f,
 2.816144f, 11.342703f, -1.312203f,
 2.563049f, 10.591699f, -0.905488f,
 2.563049f, 10.591699f, -0.905488f,
 2.816144f, 11.342703f, -1.312203f,
 2.816144f, 11.342703f, -1.312203f,
 2.045653f, 9.252621f, 1.384799f,
 2.045653f, 9.252621f, 1.384799f,
 2.412659f, 9.178024f, 1.079377f,
 3.073128f, 11.088506f, 0.183457f,
 2.563049f, 10.591699f, -0.905488f,
 2.563049f, 10.591699f, -0.905488f,
 3.383007f, 8.733264f, -0.970336f,
 2.505816f, 10.433291f, 1.547014f,
 3.073128f, 11.088506f, 0.183457f,
 3.073128f, 11.088506f, 0.183457f,
 2.505816f, 10.433291f, 1.547014f,
 3.383007f, 8.733264f, -0.970336f,
 3.383007f, 8.733264f, -0.970336f,
 2.987294f, 6.663902f, -0.575913f,
 2.987294f, 6.663902f, -0.575913f,
 2.517652f, 7.319727f, 0.613524f,
 2.517652f, 7.319727f, 0.613524f,
 2.987294f, 6.663902f, -0.575913f,
 4.022440f, 6.694983f, -0.184329f,
 4.022440f, 6.694983f, -0.184329f,
 4.022440f, 6.694983f, -0.184329f,
 3.634388f, 7.236874f, 0.798470f,
 3.634388f, 7.236874f, 0.798470f,
 3.634388f, 7.236874f, 0.798470f,
 2.517652f, 7.319727f, 0.613524f,
 2.517652f, 7.319727f, 0.613524f,
 0.078843f, 11.432873f, -1.946869f,
 2.816144f, 11.342703f, -1.312203f,
 2.816144f, 11.342703f, -1.312203f,
 -2.416360f, 9.301983f, 1.356700f,
 -0.997873f, 7.259922f, 0.376267f,
 -0.997873f, 7.259922f, 0.376267f,
 0.078843f, 6.580724f, 0.440994f,
 -2.014557f, 10.825478f, -2.460550f,
 -2.014557f, 10.825478f, -2.460550f,
 0.078843f, 11.432873f, -1.946869f,
 0.078843f, 11.432873f, -1.946869f,
 0.078843f, 11.893991f, -1.508218f,
 0.078843f, 11.684452f, 0.903216f,
 -0.927402f, 11.709418f, 0.615901f,
 -0.927402f, 11.709418f, 0.615901f,
 -1.333669f, 12.931264f, 0.698242f,
 -1.333669f, 13.077062f, -0.979636f,
 -0.927402f, 11.709418f, 0.615901f,
 -0.927402f, 11.709418f, 0.615901f,
 -1.333669f, 13.077062f, -0.979636f,
 -0.927402f, 11.860762f, -1.125809f,
 -0.927402f, 11.860762f, -1.125809f,
 -0.927402f, 11.860762f, -1.125809f,
 -1.333669f, 12.931264f, 0.698242f,
 -1.333669f, 12.931264f, 0.698242f,
 -1.333669f, 13.077062f, -0.979636f,
 0.078843f, 6.701381f, -2.076185f,
 -1.325477f, 6.196687f, -1.841824f,
 -1.325477f, 6.196687f, -1.841824f,
 -1.325477f, 6.196687f, -1.841824f,
 -2.007629f, 4.955277f, 0.430444f,
 -0.997873f, 7.259922f, 0.376267f,
 -0.997873f, 7.259922f, 0.376267f,
 -2.007629f, 4.955277f, 0.430444f,
 -0.997873f, 7.259922f, 0.376267f,
 -0.997873f, 7.259922f, 0.376267f,
 0.078843f, 6.580724f, 0.440994f,
 -1.307993f, 4.402319f, 1.784667f,
 0.078843f, 6.580724f, 0.440994f,
 0.078843f, 6.580724f, 0.440994f,
 0.078843f, 6.701381f, -2.076185f,
 -2.369220f, 1.557746f, -2.301503f,
 -2.007629f, 4.955277f, 0.430444f,
 -2.007629f, 4.955277f, 0.430444f,
 -1.307993f, 4.402319f, 1.784667f,
 -0.713258f, 2.378271f, 0.191809f,
 -0.713258f, 2.378271f, 0.191809f,
 -0.560358f, 1.557746f, -2.185178f,
 -0.560358f, 1.557746f, -2.185178f,
 -2.369220f, 1.557746f, -2.301503f,};

static float VertArrayB[] = new float[]{
 -2.369220f, 1.557746f, -2.301503f,
 -2.524316f, 0.587220f, 2.124590f,
 -2.522081f, 2.378271f, 0.075486f,
 -2.522081f, 2.378271f, 0.075486f,
 -2.524316f, 0.587220f, 2.124590f,
 -2.285759f, 2.082373f, 1.094435f,
 -2.522081f, 2.378271f, 0.075486f,
 -2.285759f, 2.082373f, 1.094435f,
 -0.713258f, 2.378271f, 0.191809f,
 -0.713258f, 2.378271f, 0.191809f,
 -2.285759f, 2.082373f, 1.094435f,
 -1.042818f, 2.082373f, 1.174367f,
 -1.042818f, 2.082373f, 1.174367f,
 -0.889424f, 0.587220f, 2.229727f,
 -0.713258f, 2.378271f, 0.191809f,
 -0.713258f, 2.378271f, 0.191809f,
 -0.889424f, 0.587220f, 2.229727f,
 -0.560358f, 1.557746f, -2.185178f,
 -2.416360f, 9.301983f, 1.356700f,
 -2.855281f, 9.196361f, -0.203901f,
 -2.416360f, 9.460193f, -1.943947f,
 -2.416360f, 9.460193f, -1.943947f,
 -2.855281f, 9.196361f, -0.203901f,
 -2.940833f, 9.524349f, -2.199340f,
 -2.940833f, 9.524349f, -2.199340f,
 -2.692814f, 10.893608f, -1.981250f,
 -2.416360f, 9.460193f, -1.943947f,
 -2.416360f, 9.460193f, -1.943947f,
 -2.692814f, 10.893608f, -1.981250f,
 -2.014557f, 10.825478f, -2.460550f,
 -2.692814f, 10.893608f, -1.981250f,
 -2.876553f, 10.675189f, -0.242088f,
 -2.014557f, 10.825478f, -2.460550f,
 -2.014557f, 10.825478f, -2.460550f,
 -2.876553f, 10.675189f, -0.242088f,
 -2.667250f, 11.155653f, 0.495654f,
 -2.667250f, 11.155653f, 0.495654f,
 -2.855281f, 9.196361f, -0.203901f,
 -2.416360f, 9.301983f, 1.356700f,
 -2.855281f, 9.196361f, -0.203901f,
 -3.974906f, 8.640263f, -0.918890f,
 -2.940833f, 9.524349f, -2.199340f,
 -4.376987f, 8.367658f, -1.367994f,
 -4.899353f, 8.818089f, -1.173730f,
 -2.940833f, 9.524349f, -2.199340f,
 -2.940833f, 9.524349f, -2.199340f,
 -4.899353f, 8.818089f, -1.173730f,
 -2.692814f, 10.893608f, -1.981250f,
 -2.692814f, 10.893608f, -1.981250f,
 -4.603933f, 9.018378f, -0.843763f,
 -2.876553f, 10.675189f, -0.242088f,
 -2.876553f, 10.675189f, -0.242088f,
 -4.603933f, 9.018378f, -0.843763f,
 -2.855281f, 9.196361f, -0.203901f,
 -2.855281f, 9.196361f, -0.203901f,
 -4.603933f, 9.018378f, -0.843763f,
 -3.974906f, 8.640263f, -0.918890f,
 -4.376987f, 8.367658f, -1.367994f,
 -5.114673f, 6.621529f, -0.367357f,
 -4.899353f, 8.818089f, -1.173730f,
 -4.899353f, 8.818089f, -1.173730f,
 -5.114673f, 6.621529f, -0.367357f,
 -5.921766f, 7.317477f, -0.067205f,
 -5.114673f, 6.621529f, -0.367357f,
 -5.562770f, 5.729768f, 0.575122f,
 -4.241212f, 7.213720f, 0.608248f,
 -4.241212f, 7.213720f, 0.608248f,
 -5.562770f, 5.729768f, 0.575122f,
 -4.689309f, 6.321959f, 1.550727f,
 -6.369862f, 6.425716f, 0.875274f,
 -5.562770f, 5.729768f, 0.575122f,
 -5.921766f, 7.317477f, -0.067205f,
 -5.921766f, 7.317477f, -0.067205f,
 -5.562770f, 5.729768f, 0.575122f,
 -5.114673f, 6.621529f, -0.367357f,
 -5.648144f, 6.915027f, 1.681390f,
 -6.369862f, 6.425716f, 0.875274f,
 -5.200048f, 7.806788f, 0.738912f,
 -5.200048f, 7.806788f, 0.738912f,
 -6.369862f, 6.425716f, 0.875274f,
 -5.921766f, 7.317477f, -0.067205f,
 -4.241212f, 7.213720f, 0.608248f,
 -4.689309f, 6.321959f, 1.550727f,
 -5.200048f, 7.806788f, 0.738912f,
 -5.200048f, 7.806788f, 0.738912f,
 -4.689309f, 6.321959f, 1.550727f,
 -5.648144f, 6.915027f, 1.681390f,
 0.078843f, 11.432873f, -1.946869f,
 0.078843f, 10.525237f, -2.769940f,
 -2.014557f, 10.825478f, -2.460550f,
 -2.014557f, 10.825478f, -2.460550f,
 0.078843f, 10.525237f, -2.769940f,
 -3.453109f, 8.262653f, -3.180304f,};

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
 0.964229f, 0.507208f,
 0.962340f, 0.570236f,
 0.925476f, 0.499804f,
 0.925476f, 0.499804f,
 0.962340f, 0.570236f,
 0.962340f, 0.570236f,
 0.788493f, 0.530101f,
 0.788493f, 0.530101f,
 0.809816f, 0.508397f,
 0.545151f, 0.038998f,
 0.490977f, 0.038998f,
 0.490977f, 0.038998f,
 0.490977f, 0.146332f,
 0.605984f, 0.038998f,
 0.545151f, 0.038998f,
 0.545151f, 0.038998f,
 0.605984f, 0.038998f,
 0.490977f, 0.146332f,
 0.490977f, 0.146332f,
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
 0.788493f, 0.832655f,
 0.809815f, 0.854360f,
 0.819562f, 0.990842f,
 0.819562f, 0.990842f,
 0.809815f, 0.854360f,
 0.832127f, 0.948011f,
 0.925462f, 0.862950f,
 0.920318f, 0.814883f,
 0.964216f, 0.855555f,
 0.964216f, 0.855555f,
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
{ 0.221623f, -0.387642f, 0.894772f},
{ -0.015196f, 0.201893f, 0.979290f},
{ 0.017152f, -0.190882f, 0.981463f},
{ -0.211758f, 0.448982f, 0.868086f},
{ 0.223208f, 0.971112f, 0.084384f},
{ 0.223208f, 0.971112f, 0.084384f},
{ 0.223208f, 0.971112f, 0.084384f},
{ 0.223208f, 0.971112f, 0.084384f},
{ 0.225442f, 0.283777f, -0.932012f},
{ 0.168877f, 0.093014f, -0.981238f},
{ 0.169179f, 0.212566f, -0.962390f},
{ 0.134280f, 0.031332f, -0.990448f},
{ 0.047544f, -0.946364f, 0.319585f},
{ 0.041024f, -0.960352f, 0.275757f},
{ 0.099593f, 0.736146f, 0.669455f},
{ 0.099593f, 0.736146f, 0.669455f},
{ 0.132390f, -0.072606f, -0.988535f},
{ 0.135947f, -0.070959f, -0.988172f},
{ 0.894613f, -0.431768f, 0.115083f},
{ 0.977924f, -0.151800f, 0.143603f},
{ 0.911873f, -0.362584f, 0.192404f},
{ 0.976267f, -0.092579f, 0.195786f},
{ 0.068689f, -0.225411f, 0.971839f},
{ -0.035597f, -0.101675f, 0.994181f},
{ -0.094063f, 0.885666f, 0.454695f},
{ 0.222080f, 0.522540f, 0.823184f},
{ 0.459168f, 0.854424f, 0.243154f},
{ 0.315159f, 0.940047f, 0.130329f},
{ 0.370294f, 0.915316f, 0.158364f},
{ 0.293893f, 0.952250f, 0.082745f},
{ 0.166654f, 0.775816f, -0.608552f},
{ 0.209576f, 0.737990f, -0.641442f},
{ 0.173504f, 0.770047f, -0.613941f},
{ 0.285687f, 0.660510f, -0.694341f},
{ 0.269494f, -0.288535f, 0.918760f},
{ 0.349558f, -0.215778f, 0.911729f},
{ 0.336915f, -0.096433f, 0.936584f},
{ 0.381376f, -0.099649f, 0.919033f},
{ 0.949115f, -0.313746f, -0.027263f},
{ 0.949115f, -0.313746f, -0.027263f},
{ 0.949115f, -0.313746f, -0.027263f},
{ 0.949115f, -0.313746f, -0.027263f},
{ 0.350681f, -0.098408f, -0.931310f},
{ 0.387636f, 0.068754f, -0.919245f},
{ 0.403392f, -0.049654f, -0.913679f},
{ 0.424392f, 0.062785f, -0.903299f},
{ 0.336388f, 0.005138f, 0.941710f},
{ 0.265332f, 0.053481f, 0.962673f},
{ 0.956829f, 0.289561f, 0.025161f},
{ 0.956829f, 0.289561f, 0.025161f},
{ 0.956829f, 0.289561f, 0.025161f},
{ 0.956829f, 0.289561f, 0.025161f},
{ 0.381537f, 0.169937f, -0.908598f},
{ 0.312578f, 0.221779f, -0.923639f},
{ -0.041874f, -0.638184f, -0.768745f},
{ -0.032762f, -0.639660f, -0.767959f},
{ -0.002228f, -0.644206f, -0.764849f},
{ 0.018958f, -0.646996f, -0.762258f},
{ 0.960843f, 0.277002f, -0.007095f},
{ 0.955197f, 0.288063f, 0.067958f},
{ -0.078030f, 0.068847f, 0.994571f},
{ 0.017100f, -0.068109f, 0.997531f},
{ -0.934926f, -0.354436f, -0.016989f},
{ -0.982158f, -0.188046f, 0.002212f},
{ -0.935331f, -0.352802f, -0.026197f},
{ -0.982801f, -0.172493f, -0.065935f},
{ 0.069854f, 0.309854f, -0.948215f},
{ -0.020228f, 0.336770f, -0.941370f},
{ -0.113430f, 0.361516f, -0.925440f},
{ -0.136867f, 0.367236f, -0.920003f},
{ 0.980176f, 0.101554f, -0.170120f},
{ 0.965569f, 0.130948f, -0.224787f},
{ 0.105081f, -0.232610f, 0.966877f},
{ 0.142702f, -0.243976f, 0.959225f},
{ -0.990807f, 0.010115f, 0.134901f},
{ -0.990173f, 0.013048f, 0.139239f},
{ 0.000336f, -0.999997f, 0.002257f},
{ 0.000336f, -0.999997f, 0.002257f},
{ 0.996325f, 0.017446f, -0.083858f},
{ 0.893800f, 0.423114f, 0.148648f},
{ 0.010165f, 0.997611f, 0.068326f},
{ 0.010165f, 0.997611f, 0.068326f},
{ 0.010165f, 0.997611f, 0.068326f},
{ 0.010165f, 0.997611f, 0.068325f},
{ -0.980895f, 0.044185f, 0.189453f},
{ -0.821587f, 0.428427f, 0.376092f},
{ -0.280521f, -0.954194f, -0.104030f},
{ 0.995946f, -0.077328f, 0.045947f},
{ -0.216872f, -0.941764f, -0.256995f},
{ 0.948991f, -0.292228f, -0.118404f},
{ 0.953525f, -0.198655f, 0.226552f},
{ 0.951327f, -0.307184f, 0.024783f},
{ 0.949291f, -0.314224f, 0.010516f},
{ 0.881129f, -0.417352f, -0.222327f},
{ 0.656451f, 0.658603f, 0.367851f},
{ 0.821873f, 0.298341f, 0.485302f},
{ 0.433018f, -0.286202f, 0.854742f},
{ 0.503404f, -0.307159f, 0.807612f},
{ 0.449040f, -0.291077f, 0.844771f},
{ 0.565218f, -0.324496f, 0.758440f},
{ -0.902649f, -0.237978f, -0.358595f},
{ -0.940714f, -0.072785f, -0.331301f},
{ 0.678594f, 0.494246f, -0.543352f},
{ 0.503281f, 0.103262f, -0.857930f},
{ 0.657173f, 0.472371f, -0.587358f},
{ 0.354617f, -0.042738f, -0.934034f},
{ 0.898101f, 0.266444f, 0.349888f},
{ 0.929115f, 0.315491f, 0.192902f},
{ 0.628010f, -0.312171f, 0.712848f},
{ 0.604119f, -0.384522f, 0.697985f},
{ 0.133058f, -0.027376f, 0.990730f},
{ -0.166559f, -0.146490f, 0.975089f},
{ -0.906863f, 0.095165f, -0.410541f},
{ -0.906862f, 0.095166f, -0.410541f},
{ 0.349803f, -0.239516f, -0.905688f},
{ 0.349803f, -0.239516f, -0.905688f},
{ 0.940620f, 0.071884f, 0.331763f},
{ 0.940620f, 0.071884f, 0.331763f},
{ 0.940620f, 0.071884f, 0.331763f},
{ 0.940620f, 0.071884f, 0.331763f},
{ -0.094599f, 0.542348f, 0.834811f},
{ -0.098101f, 0.541526f, 0.834941f},
{ 0.937005f, 0.042069f, 0.346775f},
{ 0.937005f, 0.042069f, 0.346775f},
{ 0.937005f, 0.042069f, 0.346775f},
{ 0.937005f, 0.042069f, 0.346775f},
{ -0.326785f, 0.456334f, 0.827630f},
{ -0.326785f, 0.456334f, 0.827630f},
{ -0.326785f, 0.456334f, 0.827630f},
{ -0.326785f, 0.456334f, 0.827630f},
{ -0.937004f, -0.042068f, -0.346776f},
{ -0.937004f, -0.042068f, -0.346776f},
{ -0.937004f, -0.042068f, -0.346776f},
{ -0.937004f, -0.042068f, -0.346775f},
{ 0.112630f, -0.454408f, -0.883645f},
{ 0.112630f, -0.454408f, -0.883645f},
{ 0.112630f, -0.454408f, -0.883645f},
{ 0.112630f, -0.454408f, -0.883645f},
{ 0.138160f, 0.889366f, -0.435821f},
{ 0.138160f, 0.889366f, -0.435821f},
{ 0.138160f, 0.889366f, -0.435821f},
{ 0.138160f, 0.889366f, -0.435821f},
{ 0.190338f, 0.659474f, -0.727231f},
{ 0.358801f, 0.345104f, -0.867275f},
{ 0.333839f, 0.347855f, -0.876098f},
{ 0.405250f, 0.129500f, -0.904987f},
{ 0.415876f, 0.134046f, -0.899488f},
{ 0.516516f, -0.057992f, -0.854311f},
{ 0.515669f, -0.010849f, -0.856719f},
{ 0.548654f, -0.069861f, -0.833126f},
{ -0.222692f, -0.252644f, 0.941584f},
{ -0.263504f, 0.345785f, 0.900555f},
{ -0.284527f, -0.063654f, 0.956553f},
{ -0.368646f, 0.401180f, 0.838543f},
{ -0.238670f, 0.967455f, 0.084066f},
{ -0.238672f, 0.967455f, 0.084067f},
{ -0.238676f, 0.967453f, 0.084069f},
{ -0.238680f, 0.967452f, 0.084070f},
{ 0.188693f, 0.167948f, -0.967568f},
{ -0.041476f, -0.032235f, -0.998619f},
{ -0.015637f, -0.162677f, -0.986556f},
{ -0.127879f, -0.149244f, -0.980496f},
{ -0.006937f, -0.994141f, 0.107873f},
{ -0.052629f, 0.572260f, 0.818382f},
{ -0.003903f, -0.998149f, 0.060694f},
{ -0.052629f, 0.572260f, 0.818382f},
{ -0.139344f, -0.070925f, -0.987701f},
{ -0.133240f, -0.073588f, -0.988348f},
{ -0.977377f, -0.094057f, 0.189441f},
{ -0.976644f, -0.207109f, 0.057205f},
{ -0.891515f, -0.432414f, 0.134977f},
{ -0.827008f, -0.561546f, -0.026917f},
{ -0.130794f, -0.208067f, 0.969330f},
{ -0.047467f, 0.019926f, 0.998674f},
{ -0.159401f, 0.764434f, 0.624685f},
{ -0.250502f, 0.727981f, 0.638194f},
{ -0.307426f, 0.948000f, 0.082376f},
{ -0.478277f, 0.867631f, -0.135898f},
{ -0.484065f, 0.868573f, -0.106124f},
{ -0.470394f, 0.864980f, -0.174753f},
{ -0.102898f, 0.824819f, -0.555955f},
{ -0.114987f, 0.816166f, -0.566260f},
{ -0.136021f, 0.800404f, -0.583825f},
{ -0.285687f, 0.660511f, -0.694341f},
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
{ 0.222831f, -0.845427f, -0.485385f},
{ 0.090184f, -0.871232f, -0.482517f},
{ 0.195993f, -0.851972f, -0.485521f},
{ 0.011577f, -0.878972f, -0.476734f},
{ -0.940563f, 0.322883f, -0.105302f},
{ -0.948875f, 0.283671f, -0.138445f},
{ -0.224620f, -0.090852f, 0.970202f},
{ -0.106502f, -0.063938f, 0.992255f},
{ 0.970393f, -0.125351f, 0.206458f},
{ 0.963776f, -0.252534f, 0.085804f},
{ 0.845406f, -0.533685f, -0.021643f},
{ 0.845110f, -0.533980f, -0.025595f},
{ 0.229681f, 0.653259f, -0.721456f},
{ 0.069885f, 0.627053f, -0.775835f},
{ 0.160214f, 0.644090f, -0.747984f},
{ 0.050220f, 0.622598f, -0.780929f},
{ -0.990544f, 0.096883f, -0.097144f},
{ -0.992512f, 0.086944f, -0.085799f},
{ -0.083903f, -0.613045f, 0.785580f},
{ -0.050010f, -0.626690f, 0.777663f},
{ 0.996125f, 0.050667f, 0.071894f},
{ 0.997655f, 0.049755f, 0.046999f},
{ 0.013743f, -0.976802f, -0.213705f},
{ 0.013743f, -0.976802f, -0.213705f},
{ -0.999983f, 0.004844f, 0.003143f},
{ -0.883748f, 0.352818f, 0.307423f},
{ -0.018181f, 0.959032f, 0.282715f},
{ -0.018181f, 0.959032f, 0.282715f},
{ -0.018181f, 0.959032f, 0.282715f},
{ -0.018181f, 0.959032f, 0.282715f},
{ 0.844514f, 0.363945f, 0.392862f},
{ 0.992517f, 0.035362f, 0.116877f},
{ 0.379824f, -0.923998f, -0.044290f},
{ 0.418974f, -0.903095f, -0.094240f},
{ 0.033322f, -0.989362f, -0.141605f},
{ 0.364393f, -0.918407f, -0.154100f},
{ 0.443096f, 0.062184f, -0.894315f},
{ -0.392787f, -0.099547f, -0.914226f},
{ -0.032197f, -0.032207f, -0.998962f},
{ -0.580858f, -0.132926f, -0.803078f},
{ -0.412057f, 0.908146f, 0.074024f},
{ -0.689339f, 0.720672f, -0.073779f},
{ -0.960862f, -0.006670f, 0.276947f},
{ -0.962312f, -0.004731f, 0.271907f},
{ -0.962236f, -0.004833f, 0.272173f},
{ -0.962564f, -0.004390f, 0.271020f},
{ 0.654160f, -0.721100f, -0.228232f},
{ 0.717466f, -0.651339f, -0.246984f},
{ -0.469526f, -0.170924f, -0.866216f},
{ -0.509666f, -0.128878f, -0.850665f},
{ -0.511342f, 0.206653f, -0.834160f},
{ -0.514453f, 0.224982f, -0.827479f},
{ -0.653076f, 0.745687f, 0.132070f},
{ -0.677987f, 0.731960f, 0.067587f},
{ -0.345299f, 0.019262f, 0.938295f},
{ 0.181281f, 0.371922f, 0.910391f},
{ -0.342017f, -0.017430f, 0.939532f},
{ 0.177711f, 0.101150f, 0.978871f},
{ 0.765518f, -0.531341f, -0.362847f},
{ 0.765519f, -0.531341f, -0.362847f},
{ -0.519011f, -0.249274f, -0.817612f},
{ -0.519011f, -0.249274f, -0.817612f},
{ -0.712551f, 0.660336f, 0.237126f},
{ -0.712551f, 0.660335f, 0.237126f},
{ -0.712551f, 0.660335f, 0.237126f},
{ -0.712551f, 0.660335f, 0.237126f},
{ 0.464714f, 0.609893f, 0.641928f},
{ 0.461860f, 0.610506f, 0.643403f},
{ -0.723918f, 0.638886f, 0.260322f},
{ -0.723918f, 0.638886f, 0.260322f},
{ -0.723918f, 0.638886f, 0.260322f},
{ -0.723918f, 0.638886f, 0.260322f},
{ 0.607769f, 0.412056f, 0.678842f},
{ 0.607769f, 0.412056f, 0.678842f},
{ 0.607769f, 0.412056f, 0.678842f},
{ 0.607769f, 0.412056f, 0.678842f},
{ 0.723917f, -0.638886f, -0.260323f},
{ 0.723918f, -0.638886f, -0.260323f},
{ 0.723918f, -0.638886f, -0.260323f},
{ 0.723918f, -0.638885f, -0.260323f},
{ -0.433610f, -0.542519f, -0.719482f},
{ -0.433610f, -0.542519f, -0.719482f},
{ -0.433610f, -0.542519f, -0.719482f},
{ -0.433610f, -0.542519f, -0.719482f},
{ 0.315000f, 0.659618f, -0.682407f},
{ 0.315000f, 0.659618f, -0.682407f},
{ 0.315000f, 0.659618f, -0.682407f},
{ 0.315000f, 0.659618f, -0.682407f},
{ -0.013135f, 0.671697f, -0.740709f},
{ -0.062183f, 0.378089f, -0.923679f},
{ -0.087065f, 0.352925f, -0.931592f},
{ -0.077491f, 0.293763f, -0.952732f},
{ -0.063404f, 0.167638f, -0.983808f},
{ -0.127709f, -0.002696f, -0.991808f},
{ -0.126016f, 0.021568f, -0.991794f},
{ -0.134167f, -0.002460f, -0.990956f},
{ 0.541167f, -0.037799f, -0.840065f},
{ 0.557505f, -0.077299f, -0.826567f},
{ -0.139022f, -0.021507f, -0.990056f},
{ -0.123159f, 0.015864f, -0.992260f}};

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
173, 174, 38,
175, 3, 38,
38, 3, 39,
3, 176, 39,
39, 177, 178,
37, 36, 41,
41, 36, 40,
179, 42, 180,
181, 42, 182,
183, 43, 184,
185, 43, 42,
186, 37, 43,
43, 37, 41,
40, 44, 41,
41, 44, 45,
42, 46, 187,
188, 46, 189,
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
199, 51, 200,
201, 51, 49,
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
212, 69, 213,
214, 16, 215,
216, 16, 70,
217, 218, 219,
220, 221, 222,
71, 19, 223,
224, 19, 15,
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
89, 88, 85,
85, 88, 84,
86, 90, 87,
87, 90, 91,
91, 89, 87,
87, 89, 85,
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
103, 102, 96,
102, 53, 96, };

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


//Vertices: 345  Texture Co-ords: 202  Normals: 304  Texture: walk Faces: 196 Smooth Groups: 94 sucess: 80 Doubles: 116 Redos needed: 148 Correct: 107