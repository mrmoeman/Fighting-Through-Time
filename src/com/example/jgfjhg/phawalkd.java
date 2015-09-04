package com.example.jgfjhg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;
import android.graphics.Bitmap;
import android.opengl.GLUtils;

class phawalkd {

static String TextureName = "walk";

static int Vertices = 344;

static int VertTexts = 191;

static int Normals = 106;

static int Faces = 196;

static int FacesB = 31;

static int SmoothGroups = 2;

static float VertArray[] = new float[]{
 1.253206f, 7.409902f, 1.381043f,
 0.868666f, 9.052651f, 1.745701f,
 0.764446f, 8.768037f, 0.352252f,
 0.820442f, 7.880433f, 0.001979f,
 0.491709f, 9.119040f, 1.786660f,
 0.408353f, 9.171926f, 0.330062f,
 0.380701f, 7.724942f, -0.126109f,
 0.422931f, 7.389598f, 1.363631f,
 0.009626f, 7.317763f, 1.628182f,
 -0.042195f, 9.259254f, 1.869652f,
 -0.006456f, 9.323833f, 0.356473f,
 0.045245f, 7.736308f, -0.219764f,
 -0.030501f, 9.532252f, 1.132881f,
 0.479363f, 9.444826f, 1.122908f,
 0.872474f, 9.097548f, 1.547992f,
 0.921707f, 7.458982f, 1.120974f,
 0.416466f, 7.461648f, 1.043891f,
 0.021075f, 7.452305f, 1.034154f,
 0.428931f, 7.111527f, 1.500113f,
 0.765435f, 7.113032f, 1.536935f,
 0.425774f, 6.778676f, 1.434578f,
 0.774203f, 6.772304f, 1.507801f,
 1.217694f, 7.350510f, -0.045489f,
 0.771669f, 7.176447f, 0.986142f,
 0.029473f, 7.196688f, 0.938404f,
 0.053380f, 7.345915f, -0.175550f,
 0.700363f, 4.277358f, 0.108029f,
 0.684600f, 4.277358f, 0.804733f,
 0.033961f, 4.277366f, 0.976895f,
 0.033961f, 4.277366f, -0.297162f,
 0.972507f, 6.295516f, 1.131151f,
 0.996786f, 6.316788f, -0.021791f,
 0.033081f, 6.488426f, -0.172517f,
 0.035139f, 6.385598f, 1.371735f,
 1.092266f, -0.025743f, -1.639498f,
 2.274398f, -0.061061f, 0.352667f,
 1.032845f, -0.088741f, 1.607185f,
 -0.798447f, 0.025163f, -1.313802f,
 1.453515f, 6.928579f, 0.142584f,
 1.412200f, 6.379164f, 0.598121f,
 0.932404f, 6.085843f, 0.378320f,
 0.976659f, 6.722814f, -0.145245f,
 1.821895f, 5.627944f, -1.212933f,
 1.920306f, 5.611358f, -0.866071f,
 1.652020f, 5.656018f, -0.728403f,
 1.538445f, 5.677664f, -1.128934f,
 1.409788f, 3.696422f, -1.476737f,
 1.613924f, 3.657616f, -0.756832f,
 1.094103f, 3.813643f, -0.502785f,
 0.865365f, 3.860589f, -1.310171f,
 0.694455f, 2.158445f, 1.659833f,
 1.650791f, 2.239109f, 1.044506f,
 1.032606f, 2.195181f, -0.300849f,
 -0.171009f, 2.125231f, -0.093927f,
 -0.931279f, 9.054929f, 1.503571f,
 -0.882047f, 7.416362f, 1.076553f,
 -0.745860f, 7.843424f, -0.036594f,
 -0.749123f, 8.732273f, 0.314978f,
 -0.411830f, 9.152547f, 0.309864f,
 -0.534560f, 9.420869f, 1.097938f,
 -0.293501f, 7.709012f, -0.142713f,
 -0.374315f, 7.442963f, 1.024417f,
 -0.393093f, 7.370317f, 1.343536f,
 -1.223252f, 7.351387f, 1.320056f,
 -0.935087f, 9.010032f, 1.701280f,
 -0.564156f, 9.094092f, 1.760658f,
 -0.730272f, 7.077691f, 1.500100f,
 -0.392669f, 7.092114f, 1.479880f,
 -0.370584f, 6.759859f, 1.414967f,
 -0.721504f, 6.736963f, 1.470967f,
 -0.712388f, 7.141382f, 0.949595f,
 -1.114839f, 7.295396f, -0.102932f,
 -2.000264f, 3.975681f, 2.538121f,
 -2.398168f, 4.573146f, 2.752945f,
 -1.947413f, 4.953221f, 2.859994f,
 -1.500595f, 4.284493f, 2.615955f,
 -0.902728f, 6.294263f, 1.133546f,
 -0.930008f, 6.315500f, -0.019331f,
 -0.616678f, 4.277358f, 0.804733f,
 -0.632440f, 4.277358f, 0.108029f,
 -0.372483f, 2.073164f, 2.038107f,
 -1.033010f, 2.043534f, 0.769665f,
 -1.500528f, 6.924644f, 0.616573f,
 -1.147122f, 6.585211f, 0.096027f,
 -1.256662f, 6.667263f, 1.105284f,
 -0.844685f, 6.278334f, 0.504602f,
 -2.226339f, 5.205760f, 0.883939f,
 -2.035035f, 4.917055f, 0.782329f,
 -2.003371f, 5.393438f, 0.973304f,
 -1.781977f, 5.061051f, 0.853734f,
 -0.688349f, -0.071984f, 2.106983f,
 -1.945805f, -0.015570f, 0.180645f,
 1.284668f, 4.413998f, -0.627905f,
 1.665512f, 4.350603f, -0.823331f,
 1.525814f, 4.374146f, -1.315719f,
 1.123444f, 4.444726f, -1.196478f,
 -1.959633f, 5.048730f, 2.225073f,
 -1.645354f, 4.576892f, 2.055336f,
 -2.004582f, 4.372482f, 1.953973f,
 -2.276147f, 4.782314f, 2.098214f,
 -0.304216f, 4.305545f, -5.375025f,
 -0.469484f, 3.551748f, -5.296520f,
 3.716318f, 5.080535f, 3.993299f,
 2.874597f, 3.100331f, 4.324995f,
 2.695262f, 4.450169f, 2.328069f,
 2.529995f, 3.696371f, 2.406574f,
 0.764446f, 8.768037f, 0.352252f,
 0.764446f, 8.768037f, 0.352252f,
 0.872474f, 9.097548f, 1.547992f,
 0.820442f, 7.880433f, 0.001979f,
 0.380701f, 7.724942f, -0.126109f,
 0.764446f, 8.768037f, 0.352252f,
 0.764446f, 8.768037f, 0.352252f,
 0.380701f, 7.724942f, -0.126109f,
 0.380701f, 7.724942f, -0.126109f,
 -0.042195f, 9.259254f, 1.869652f,
 -0.042195f, 9.259254f, 1.869652f,
 0.491709f, 9.119040f, 1.786660f,
 0.491709f, 9.119040f, 1.786660f,
 0.872474f, 9.097548f, 1.547992f,
 0.872474f, 9.097548f, 1.547992f,
 0.491709f, 9.119040f, 1.786660f,
 0.868666f, 9.052651f, 1.745701f,
 1.253206f, 7.409902f, 1.381043f,
 0.868666f, 9.052651f, 1.745701f,
 0.868666f, 9.052651f, 1.745701f,
 0.416466f, 7.461648f, 1.043891f,
 0.422931f, 7.389598f, 1.363631f,
 0.422931f, 7.389598f, 1.363631f,
 0.009626f, 7.317763f, 1.628182f,
 0.422931f, 7.389598f, 1.363631f,
 0.428931f, 7.111527f, 1.500113f,
 0.428931f, 7.111527f, 1.500113f,
 0.425774f, 6.778676f, 1.434578f,
 0.425774f, 6.778676f, 1.434578f,
 0.425774f, 6.778676f, 1.434578f,
 0.774203f, 6.772304f, 1.507801f,
 1.253206f, 7.409902f, 1.381043f,
 0.765435f, 7.113032f, 1.536935f,
 0.765435f, 7.113032f, 1.536935f,
 0.774203f, 6.772304f, 1.507801f,
 0.416466f, 7.461648f, 1.043891f,
 0.771669f, 7.176447f, 0.986142f,
 0.380701f, 7.724942f, -0.126109f,
 0.380701f, 7.724942f, -0.126109f,
 0.771669f, 7.176447f, 0.986142f,
 1.217694f, 7.350510f, -0.045489f,
 0.029473f, 7.196688f, 0.938404f,
 0.416466f, 7.461648f, 1.043891f,
 0.416466f, 7.461648f, 1.043891f,
 0.029473f, 7.196688f, 0.938404f,
 0.771669f, 7.176447f, 0.986142f,
 0.045245f, 7.736308f, -0.219764f,
 0.380701f, 7.724942f, -0.126109f,
 0.053380f, 7.345915f, -0.175550f,
 0.053380f, 7.345915f, -0.175550f,
 0.380701f, 7.724942f, -0.126109f,
 1.217694f, 7.350510f, -0.045489f,
 0.972507f, 6.295516f, 1.131151f,
 0.684600f, 4.277358f, 0.804733f,
 0.700363f, 4.277358f, 0.108029f,
 0.684600f, 4.277358f, 0.804733f,
 0.684600f, 4.277358f, 0.804733f,
 1.650791f, 2.239109f, 1.044506f,
 0.033961f, 4.277366f, 0.976895f,
 0.684600f, 4.277358f, 0.804733f,
 0.684600f, 4.277358f, 0.804733f,
 0.700363f, 4.277358f, 0.108029f,
 0.033961f, 4.277366f, -0.297162f,
 0.033961f, 4.277366f, -0.297162f,
 1.217694f, 7.350510f, -0.045489f,
 0.771669f, 7.176447f, 0.986142f,
 0.771669f, 7.176447f, 0.986142f,
 0.771669f, 7.176447f, 0.986142f,
 0.972507f, 6.295516f, 1.131151f,
 0.972507f, 6.295516f, 1.131151f,
 0.972507f, 6.295516f, 1.131151f,
 0.996786f, 6.316788f, -0.021791f,
 0.932404f, 6.085843f, 0.378320f,
 0.996786f, 6.316788f, -0.021791f,
 0.932404f, 6.085843f, 0.378320f,
 1.217694f, 7.350510f, -0.045489f,
 0.996786f, 6.316788f, -0.021791f,
 0.996786f, 6.316788f, -0.021791f,
 0.932404f, 6.085843f, 0.378320f,
 1.652020f, 5.656018f, -0.728403f,
 1.652020f, 5.656018f, -0.728403f,
 1.652020f, 5.656018f, -0.728403f,
 1.284668f, 4.413998f, -0.627905f,
 1.284668f, 4.413998f, -0.627905f,
 1.650791f, 2.239109f, 1.044506f,
 2.274398f, -0.061061f, 0.352667f,
 2.274398f, -0.061061f, 0.352667f,
 -0.931279f, 9.054929f, 1.503571f,
 -0.749123f, 8.732273f, 0.314978f,
 -0.749123f, 8.732273f, 0.314978f,
 -0.745860f, 7.843424f, -0.036594f,
 -0.749123f, 8.732273f, 0.314978f,
 -0.293501f, 7.709012f, -0.142713f,
 -0.293501f, 7.709012f, -0.142713f,
 -0.749123f, 8.732273f, 0.314978f,
 -0.293501f, 7.709012f, -0.142713f,
 -0.564156f, 9.094092f, 1.760658f,
 -0.042195f, 9.259254f, 1.869652f,
 -0.042195f, 9.259254f, 1.869652f,
 -0.935087f, 9.010032f, 1.701280f,
 -0.564156f, 9.094092f, 1.760658f,
 -0.931279f, 9.054929f, 1.503571f,
 -0.931279f, 9.054929f, 1.503571f,
 -0.564156f, 9.094092f, 1.760658f,
 -0.935087f, 9.010032f, 1.701280f,
 -0.935087f, 9.010032f, 1.701280f,
 -1.223252f, 7.351387f, 1.320056f,
 0.009626f, 7.317763f, 1.628182f,
 -0.393093f, 7.370317f, 1.343536f,
 -0.393093f, 7.370317f, 1.343536f,
 -0.374315f, 7.442963f, 1.024417f,
 -0.393093f, 7.370317f, 1.343536f,
 -0.392669f, 7.092114f, 1.479880f,
 -0.392669f, 7.092114f, 1.479880f,
 -0.370584f, 6.759859f, 1.414967f,
 -0.370584f, 6.759859f, 1.414967f,
 -0.370584f, 6.759859f, 1.414967f,
 -0.721504f, 6.736963f, 1.470967f,
 -0.721504f, 6.736963f, 1.470967f,
 -0.730272f, 7.077691f, 1.500100f,
 -0.730272f, 7.077691f, 1.500100f,
 -1.223252f, 7.351387f, 1.320056f,
 -1.114839f, 7.295396f, -0.102932f,
 -0.712388f, 7.141382f, 0.949595f,
 -0.293501f, 7.709012f, -0.142713f,
 -0.293501f, 7.709012f, -0.142713f,
 -0.712388f, 7.141382f, 0.949595f,
 -0.374315f, 7.442963f, 1.024417f,
 -0.712388f, 7.141382f, 0.949595f,
 0.029473f, 7.196688f, 0.938404f,
 -0.374315f, 7.442963f, 1.024417f,
 -0.374315f, 7.442963f, 1.024417f,
 0.029473f, 7.196688f, 0.938404f,
 0.045245f, 7.736308f, -0.219764f,
 0.053380f, 7.345915f, -0.175550f,
 -0.293501f, 7.709012f, -0.142713f,
 -0.293501f, 7.709012f, -0.142713f,
 0.053380f, 7.345915f, -0.175550f,
 -1.114839f, 7.295396f, -0.102932f,
 -0.902728f, 6.294263f, 1.133546f,
 -0.616678f, 4.277358f, 0.804733f,
 -0.632440f, 4.277358f, 0.108029f,
 -0.616678f, 4.277358f, 0.804733f,
 -0.616678f, 4.277358f, 0.804733f,
 -0.372483f, 2.073164f, 2.038107f,};

static float VertArrayB[] = new float[]{
 -0.616678f, 4.277358f, 0.804733f,
 -0.372483f, 2.073164f, 2.038107f,
 0.033961f, 4.277366f, 0.976895f,
 0.033961f, 4.277366f, 0.976895f,
 -0.372483f, 2.073164f, 2.038107f,
 0.694455f, 2.158445f, 1.659833f,
 0.033961f, 4.277366f, -0.297162f,
 -0.171009f, 2.125231f, -0.093927f,
 -0.632440f, 4.277358f, 0.108029f,
 -0.632440f, 4.277358f, 0.108029f,
 -0.171009f, 2.125231f, -0.093927f,
 -1.033010f, 2.043534f, 0.769665f,
 -1.147122f, 6.585211f, 0.096027f,
 -1.500528f, 6.924644f, 0.616573f,
 -1.114839f, 7.295396f, -0.102932f,
 -1.114839f, 7.295396f, -0.102932f,
 -1.500528f, 6.924644f, 0.616573f,
 -0.712388f, 7.141382f, 0.949595f,
 -1.500528f, 6.924644f, 0.616573f,
 -1.256662f, 6.667263f, 1.105284f,
 -0.712388f, 7.141382f, 0.949595f,
 -0.712388f, 7.141382f, 0.949595f,
 -1.256662f, 6.667263f, 1.105284f,
 -0.902728f, 6.294263f, 1.133546f,
 -1.256662f, 6.667263f, 1.105284f,
 -0.844685f, 6.278334f, 0.504602f,
 -0.902728f, 6.294263f, 1.133546f,
 -0.902728f, 6.294263f, 1.133546f,
 -0.844685f, 6.278334f, 0.504602f,
 -0.930008f, 6.315500f, -0.019331f,
 -0.844685f, 6.278334f, 0.504602f,
 -1.147122f, 6.585211f, 0.096027f,
 -0.930008f, 6.315500f, -0.019331f,
 -0.930008f, 6.315500f, -0.019331f,
 -1.147122f, 6.585211f, 0.096027f,
 -1.114839f, 7.295396f, -0.102932f,
 -2.226339f, 5.205760f, 0.883939f,
 -2.003371f, 5.393438f, 0.973304f,
 -1.500528f, 6.924644f, 0.616573f,
 -1.500528f, 6.924644f, 0.616573f,
 -2.003371f, 5.393438f, 0.973304f,
 -1.256662f, 6.667263f, 1.105284f,
 -1.959633f, 5.048730f, 2.225073f,
 -2.003371f, 5.393438f, 0.973304f,
 -2.276147f, 4.782314f, 2.098214f,
 -2.276147f, 4.782314f, 2.098214f,
 -2.003371f, 5.393438f, 0.973304f,
 -2.226339f, 5.205760f, 0.883939f,
 -1.945805f, -0.015570f, 0.180645f,
 -0.688349f, -0.071984f, 2.106983f,
 -1.033010f, 2.043534f, 0.769665f,
 -1.033010f, 2.043534f, 0.769665f,
 -0.688349f, -0.071984f, 2.106983f,
 -0.372483f, 2.073164f, 2.038107f,
 1.525814f, 4.374146f, -1.315719f,
 1.613924f, 3.657616f, -0.756832f,
 1.409788f, 3.696422f, -1.476737f,
 1.123444f, 4.444726f, -1.196478f,
 1.525814f, 4.374146f, -1.315719f,
 0.865365f, 3.860589f, -1.310171f,
 0.865365f, 3.860589f, -1.310171f,
 1.525814f, 4.374146f, -1.315719f,
 1.409788f, 3.696422f, -1.476737f,
 1.284668f, 4.413998f, -0.627905f,
 1.123444f, 4.444726f, -1.196478f,
 1.094103f, 3.813643f, -0.502785f,
 1.094103f, 3.813643f, -0.502785f,
 1.123444f, 4.444726f, -1.196478f,
 0.865365f, 3.860589f, -1.310171f,
 -1.645354f, 4.576892f, 2.055336f,
 -1.947413f, 4.953221f, 2.859994f,
 -1.500595f, 4.284493f, 2.615955f,
 -1.645354f, 4.576892f, 2.055336f,
 -1.500595f, 4.284493f, 2.615955f,
 -2.004582f, 4.372482f, 1.953973f,
 -2.004582f, 4.372482f, 1.953973f,
 -1.500595f, 4.284493f, 2.615955f,
 -2.000264f, 3.975681f, 2.538121f,
 -2.276147f, 4.782314f, 2.098214f,
 -2.004582f, 4.372482f, 1.953973f,
 -2.398168f, 4.573146f, 2.752945f,
 -2.398168f, 4.573146f, 2.752945f,
 -2.004582f, 4.372482f, 1.953973f,
 -2.000264f, 3.975681f, 2.538121f,
 -2.276147f, 4.782314f, 2.098214f,
 -2.398168f, 4.573146f, 2.752945f,
 -1.959633f, 5.048730f, 2.225073f,
 -0.304216f, 4.305545f, -5.375025f,
 -0.469484f, 3.551748f, -5.296520f,
 2.695262f, 4.450169f, 2.328069f,
 2.695262f, 4.450169f, 2.328069f,
 -0.469484f, 3.551748f, -5.296520f,
 2.529995f, 3.696371f, 2.406574f,};

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
 0.704988f, 0.396285f,
 0.745360f, 0.396794f,
 0.745360f, 0.396794f,
 0.088712f, 0.357626f,
 0.134506f, 0.357626f,
 0.134506f, 0.357626f,
 0.134506f, 0.357626f,
 0.177173f, 0.357626f,
 0.177173f, 0.357626f,
 0.008494f, 0.357626f,
 0.049042f, 0.357626f,
 0.008494f, 0.403165f,
 0.049042f, 0.357626f,
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
 0.900004f, 0.283013f,};

static float[] TextArrayB = new float[]{
 0.277434f, 0.584799f,
 0.230576f, 0.348630f,
 0.340575f, 0.584800f,
 0.340575f, 0.584800f,
 0.230576f, 0.348630f,
 0.340574f, 0.348630f,
 0.745360f, 0.396794f,
 0.745360f, 0.248156f,
 0.785732f, 0.396285f,
 0.785732f, 0.396285f,
 0.745360f, 0.248156f,
 0.817124f, 0.248044f,
 0.137216f, 0.949583f,
 0.176724f, 0.949583f,
 0.137216f, 0.995122f,
 0.137216f, 0.995122f,
 0.176724f, 0.949583f,
 0.176724f, 0.995122f,
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
 0.091983f, 0.949583f,
 0.137216f, 0.949583f,
 0.091983f, 0.995122f,
 0.091983f, 0.995122f,
 0.137216f, 0.949583f,
 0.137216f, 0.995122f,
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
{ 0.953532f, 0.296841f, -0.051605f},
{ 0.844121f, -0.204273f, -0.495714f},
{ 0.908636f, 0.225143f, -0.351698f},
{ 0.873743f, -0.190747f, -0.447424f},
{ 0.369051f, 0.560983f, -0.741013f},
{ 0.531414f, 0.844633f, -0.064765f},
{ 0.498319f, 0.325024f, -0.803765f},
{ 0.546102f, -0.790257f, -0.277970f},
{ 0.500783f, -0.173191f, 0.848069f},
{ 0.394999f, -0.119301f, 0.910902f},
{ 0.172130f, -0.298383f, 0.938797f},
{ 0.211909f, 0.123270f, 0.969484f},
{ -0.029562f, 0.239769f, 0.970380f},
{ -0.012179f, -0.426956f, 0.904190f},
{ 0.002312f, 0.673012f, -0.739628f},
{ -0.024799f, 0.998491f, 0.048997f},
{ 0.018690f, 0.224487f, -0.974298f},
{ 0.427707f, 0.160601f, 0.889536f},
{ -0.778730f, 0.086732f, 0.621335f},
{ 0.414286f, -0.753872f, -0.509945f},
{ -0.183219f, -0.721578f, -0.667650f},
{ 0.016942f, -0.969956f, 0.242691f},
{ 0.480622f, 0.565534f, 0.670204f},
{ 0.555610f, 0.620804f, -0.553082f},
{ -0.031186f, 0.339083f, 0.940239f},
{ 0.034348f, -0.012951f, -0.999326f},
{ 0.357967f, -0.592821f, -0.721403f},
{ 0.576569f, -0.773445f, 0.263345f},
{ -0.911363f, -0.299174f, -0.282687f},
{ -0.536838f, -0.442973f, 0.718039f},
{ -0.001419f, -0.033028f, 0.999453f},
{ 0.730711f, -0.117408f, 0.672515f},
{ 0.667232f, -0.053364f, -0.742936f},
{ 0.004946f, 0.026030f, -0.999649f},
{ 0.862891f, 0.146847f, 0.483586f},
{ 0.866383f, 0.042390f, -0.497577f},
{ -0.048227f, -0.005957f, -0.998819f},
{ 0.027285f, 0.142230f, 0.989458f},
{ 0.556880f, 0.380291f, -0.738420f},
{ 0.917456f, 0.311737f, 0.247172f},
{ 0.409244f, 0.196917f, 0.890923f},
{ -0.456377f, 0.305317f, -0.835764f},
{ 0.870149f, 0.491844f, -0.030505f},
{ 0.851361f, -0.140414f, 0.505438f},
{ -0.565484f, -0.821548f, 0.072714f},
{ -0.616532f, 0.417543f, -0.667492f},
{ 0.987427f, 0.067397f, 0.142988f},
{ 0.599339f, 0.312217f, -0.737098f},
{ -0.618191f, -0.595163f, 0.513440f},
{ -0.843449f, 0.282167f, -0.457139f},
{ 0.931985f, -0.124144f, 0.340576f},
{ 0.591282f, -0.001954f, -0.806462f},
{ -0.470070f, 0.257030f, 0.844376f},
{ -0.889165f, 0.364999f, -0.275975f},
{ 0.520982f, -0.002149f, 0.853565f},
{ 0.970738f, 0.238981f, -0.023562f},
{ 0.400694f, 0.488833f, -0.774911f},
{ -0.421191f, 0.546358f, -0.723941f},
{ -0.962785f, 0.251562f, -0.098799f},
{ -0.899847f, 0.182412f, -0.396235f},
{ -0.808127f, -0.243313f, -0.536404f},
{ -0.840695f, -0.231257f, -0.489645f},
{ -0.566859f, 0.818683f, -0.091814f},
{ -0.358217f, 0.543799f, -0.758923f},
{ -0.472958f, 0.302073f, -0.827685f},
{ -0.493855f, -0.814829f, -0.303580f},
{ -0.264929f, 0.112004f, 0.957741f},
{ -0.433261f, -0.138871f, 0.890505f},
{ -0.203831f, -0.307267f, 0.929538f},
{ -0.533164f, -0.197622f, 0.822607f},
{ -0.478053f, 0.139199f, 0.867231f},
{ -0.352649f, -0.771993f, -0.528835f},
{ 0.742257f, 0.122669f, 0.658792f},
{ 0.249699f, -0.711348f, -0.656989f},
{ -0.555478f, 0.652513f, -0.515433f},
{ -0.365117f, 0.677324f, 0.638687f},
{ -0.266311f, -0.948154f, 0.173443f},
{ 0.865255f, -0.218553f, 0.451185f},
{ -0.781821f, -0.171661f, 0.599407f},
{ 0.207483f, 0.560427f, 0.801793f},
{ -0.722391f, -0.158915f, 0.672977f},
{ -0.676334f, -0.112190f, -0.728001f},
{ -0.838341f, -0.052576f, -0.542605f},
{ -0.842931f, 0.094530f, 0.529652f},
{ -0.967329f, 0.246665f, 0.058577f},
{ -0.354413f, 0.198543f, 0.913768f},
{ -0.601764f, -0.131492f, -0.787775f},
{ -0.839959f, 0.534880f, -0.091505f},
{ -0.183568f, 0.075305f, 0.980118f},
{ 0.704759f, -0.709307f, -0.014120f},
{ -0.362465f, -0.594807f, -0.717512f},
{ -0.876001f, 0.069814f, -0.477230f},
{ 0.119568f, 0.402361f, 0.907639f},
{ 0.940900f, -0.323033f, -0.101769f},
{ -0.993346f, 0.097407f, -0.061454f},
{ -0.331660f, -0.827702f, -0.452670f},
{ 0.263709f, 0.943369f, 0.201279f},
{ 0.988294f, 0.049980f, -0.144142f},
{ -0.420400f, 0.126025f, 0.898544f},
{ -0.900875f, 0.433274f, -0.026416f},
{ -0.898806f, 0.235560f, 0.369674f},
{ -0.895817f, 0.284648f, 0.341301f},
{ -0.866851f, 0.396574f, 0.302158f},
{ -0.864303f, 0.414990f, 0.284188f},
{ -0.907186f, 0.235226f, 0.348830f},
{ -0.907186f, 0.235226f, 0.348830f}};

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
22, 31, 25,
25, 31, 32,
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
167, 52, 168,
169, 52, 53,
170, 171, 38,
38, 172, 39,
173, 174, 39,
39, 175, 40,
176, 177, 178,
179, 41, 180,
181, 38, 182,
183, 38, 41,
39, 43, 38,
38, 43, 42,
40, 44, 39,
39, 44, 43,
184, 41, 185,
186, 41, 45,
38, 42, 41,
41, 42, 45,
43, 93, 42,
42, 93, 94,
43, 44, 93,
93, 44, 92,
187, 45, 188,
189, 45, 95,
42, 94, 45,
45, 94, 95,
50, 36, 51,
51, 36, 35,
190, 191, 52,
52, 192, 34,
52, 34, 53,
53, 34, 37,
54, 57, 55,
55, 57, 56,
193, 59, 194,
195, 59, 58,
196, 197, 198,
199, 200, 58,
55, 56, 61,
61, 56, 60,
65, 64, 62,
62, 64, 63,
9, 65, 8,
8, 65, 62,
58, 59, 10,
10, 59, 12,
10, 11, 58,
58, 11, 201,
202, 203, 59,
59, 204, 12,
205, 206, 207,
208, 209, 59,
54, 55, 210,
211, 55, 212,
66, 69, 67,
67, 69, 68,
213, 214, 17,
17, 215, 216,
63, 66, 62,
62, 66, 67,
217, 218, 61,
61, 219, 220,
61, 221, 55,
55, 222, 223,
224, 225, 55,
55, 226, 227,
228, 229, 230,
231, 232, 233,
234, 235, 236,
237, 238, 17,
239, 240, 241,
242, 243, 244,
72, 75, 73,
73, 75, 74,
76, 33, 70,
70, 33, 24,
25, 32, 71,
71, 32, 77,
79, 78, 77,
77, 78, 245,
32, 29, 77,
77, 29, 79,
246, 28, 76,
76, 28, 33,
247, 81, 248,
249, 81, 250,
87, 86, 83,
83, 86, 82,
84, 88, 85,
85, 88, 89,
85, 89, 83,
83, 89, 87,
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


//Vertices: 344  Texture Co-ords: 191  Normals: 106  Texture: walk Faces: 196 Smooth Groups: 2 sucess: 89 Doubles: 107 Redos needed: 145 Correct: 83