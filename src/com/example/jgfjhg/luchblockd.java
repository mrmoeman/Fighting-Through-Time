package com.example.jgfjhg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;
import android.graphics.Bitmap;
import android.opengl.GLUtils;

class luchblockd {

static String TextureName = "block";

static int Vertices = 341;

static int VertTexts = 202;

static int Normals = 304;

static int Faces = 196;

static int FacesB = 30;

static int SmoothGroups = 94;

static float VertArray[] = new float[]{
 0.351967f, 8.429381f, 0.946855f,
 2.035607f, 8.576645f, 0.461091f,
 -0.384477f, 10.216678f, 0.462695f,
 2.119754f, 10.243737f, 0.692778f,
 -0.005604f, 10.592187f, -3.056657f,
 2.663432f, 10.407714f, -3.194364f,
 -0.346719f, 8.306336f, -3.160601f,
 2.169977f, 8.275961f, -3.245047f,
 -0.270134f, 5.515234f, -2.717020f,
 1.412504f, 5.548016f, -2.661512f,
 0.920601f, 5.780098f, -0.195395f,
 0.152110f, 5.616814f, -0.234654f,
 -0.022792f, 10.546401f, -0.195909f,
 0.985910f, 10.581906f, -0.473328f,
 1.002010f, 10.913268f, -2.189836f,
 -0.000502f, 11.005178f, -2.572450f,
 -0.003722f, 11.697055f, 0.302143f,
 1.413878f, 11.780639f, -0.262086f,
 1.429388f, 12.099857f, -1.915686f,
 0.023253f, 12.252247f, -2.573844f,
 0.029083f, 13.445350f, 0.387296f,
 0.979528f, 13.257408f, 0.122076f,
 0.997056f, 13.618163f, -1.746693f,
 0.051379f, 13.904226f, -1.989756f,
 0.988425f, 3.247745f, -1.158952f,
 2.016248f, 3.245400f, -1.182775f,
 2.041444f, 2.721055f, -0.044088f,
 1.013621f, 2.723399f, -0.020265f,
 0.733040f, -0.025459f, -4.076114f,
 2.545638f, -0.025459f, -4.076114f,
 2.545638f, 1.291012f, -1.928182f,
 0.733078f, 1.291012f, -1.928182f,
 0.778096f, -0.015118f, 0.455934f,
 2.416366f, -0.015118f, 0.455934f,
 2.244411f, 1.218862f, -0.886205f,
 0.998903f, 1.218862f, -0.886205f,
 3.384857f, 9.354511f, 1.510952f,
 2.388903f, 8.989770f, 0.433954f,
 3.633617f, 10.075674f, 0.255961f,
 2.393476f, 10.098484f, 0.015438f,
 1.942218f, 10.287400f, 2.669342f,
 2.156977f, 10.347391f, 2.046480f,
 2.116163f, 10.971071f, 2.795163f,
 2.273952f, 11.015146f, 2.337531f,
 -0.175999f, 10.557989f, 2.483984f,
 0.290534f, 10.688305f, 1.130915f,
 0.092757f, 11.614308f, 2.678385f,
 0.478241f, 11.721985f, 1.560381f,
 -1.425469f, 10.970510f, 2.092901f,
 -0.958936f, 11.100826f, 0.739833f,
 -1.156712f, 12.026827f, 2.287303f,
 -0.771228f, 12.134504f, 1.169299f,
 0.078843f, 0.291823f, -4.553558f,
 0.080096f, 7.452762f, -3.944557f,
 4.632588f, 7.464556f, -3.606183f,
 6.565892f, 0.265169f, -2.762995f,
 -2.196082f, 8.407174f, 0.846865f,
 -2.615342f, 10.177676f, -0.117490f,
 -0.859671f, 13.292430f, 0.111586f,
 -0.842178f, 13.653186f, -1.757183f,
 -2.281921f, 9.950094f, -3.412664f,
 -2.749749f, 8.273977f, -2.408133f,
 -0.620411f, -0.015118f, 5.269588f,
 -2.258681f, -0.015118f, 5.269588f,
 -2.086726f, 1.218862f, 3.927450f,
 -0.841217f, 1.218862f, 3.927450f,
 -1.391886f, 4.663243f, -1.999258f,
 -1.151813f, 6.546507f, -0.506078f,
 -1.026182f, 10.620220f, -0.484804f,
 -1.010083f, 10.951582f, -2.201312f,
 -1.410587f, 11.834422f, -0.278196f,
 -1.395077f, 12.153640f, -1.931795f,
 -2.008597f, 4.247099f, 0.716997f,
 -0.986518f, 4.308534f, 0.809591f,
 -2.140644f, 4.683497f, 1.885031f,
 -1.118565f, 4.744931f, 1.977624f,
 -2.387953f, -0.025459f, 0.737540f,
 -0.575354f, -0.025459f, 0.737540f,
 -2.387953f, 1.291012f, 2.885472f,
 -0.575393f, 1.291012f, 2.885472f,
 -3.899545f, 8.693637f, -0.302014f,
 -1.841689f, 8.682422f, -0.015389f,
 -3.789512f, 9.957133f, -1.042574f,
 -1.967415f, 9.947203f, -0.788786f,
 -2.830006f, 8.803923f, 1.643228f,
 -2.791081f, 9.025679f, 1.021146f,
 -2.991367f, 9.464701f, 1.868680f,
 -2.962769f, 9.627629f, 1.411621f,
 -0.783544f, 8.773468f, 2.280005f,
 -0.698988f, 9.255195f, 0.928628f,
 -1.032856f, 9.794416f, 2.628344f,
 -0.962990f, 10.192454f, 1.511737f,
 0.630982f, 9.540331f, 1.113487f,
 0.546426f, 9.058604f, 2.464864f,
 0.297112f, 10.079552f, 2.813203f,
 0.366979f, 10.477590f, 1.696596f,
 -3.723738f, 7.508965f, -3.523185f,
 -6.074132f, 0.249999f, -1.779296f,
 5.602639f, 3.291321f, -3.105236f,
 0.085103f, 4.360815f, -4.129765f,
 -5.267658f, 3.251162f, -2.285716f,
 3.916079f, 8.763133f, -3.565230f,
 0.074941f, 9.622747f, -3.558088f,
 -3.464998f, 7.686217f, -3.746443f,
 2.035607f, 8.576645f, 0.461091f,
 0.920601f, 5.780098f, -0.195395f,
 0.920601f, 5.780098f, -0.195395f,
 0.152110f, 5.616814f, -0.234654f,
 2.663432f, 10.407714f, -3.194364f,
 2.663432f, 10.407714f, -3.194364f,
 -0.005604f, 10.592187f, -3.056657f,
 -0.005604f, 10.592187f, -3.056657f,
 -0.022792f, 10.546401f, -0.195909f,
 0.985910f, 10.581906f, -0.473328f,
 0.985910f, 10.581906f, -0.473328f,
 1.002010f, 10.913268f, -2.189836f,
 1.429388f, 12.099857f, -1.915686f,
 0.985910f, 10.581906f, -0.473328f,
 0.985910f, 10.581906f, -0.473328f,
 1.429388f, 12.099857f, -1.915686f,
 1.413878f, 11.780639f, -0.262086f,
 -0.000502f, 11.005178f, -2.572450f,
 1.002010f, 10.913268f, -2.189836f,
 1.002010f, 10.913268f, -2.189836f,
 1.429388f, 12.099857f, -1.915686f,
 1.413878f, 11.780639f, -0.262086f,
 1.413878f, 11.780639f, -0.262086f,
 -0.270134f, 5.515234f, -2.717020f,
 1.412504f, 5.548016f, -2.661512f,
 1.412504f, 5.548016f, -2.661512f,
 1.412504f, 5.548016f, -2.661512f,
 0.920601f, 5.780098f, -0.195395f,
 2.016248f, 3.245400f, -1.182775f,
 2.016248f, 3.245400f, -1.182775f,
 0.920601f, 5.780098f, -0.195395f,
 0.152110f, 5.616814f, -0.234654f,
 1.013621f, 2.723399f, -0.020265f,
 0.920601f, 5.780098f, -0.195395f,
 0.920601f, 5.780098f, -0.195395f,
 1.013621f, 2.723399f, -0.020265f,
 -0.270134f, 5.515234f, -2.717020f,
 2.016248f, 3.245400f, -1.182775f,
 2.016248f, 3.245400f, -1.182775f,
 2.545638f, -0.025459f, -4.076114f,
 1.013621f, 2.723399f, -0.020265f,
 0.733078f, 1.291012f, -1.928182f,
 0.733078f, 1.291012f, -1.928182f,
 2.545638f, -0.025459f, -4.076114f,
 0.733040f, -0.025459f, -4.076114f,
 0.733040f, -0.025459f, -4.076114f,
 2.545638f, -0.025459f, -4.076114f,
 2.416366f, -0.015118f, 0.455934f,
 2.416366f, -0.015118f, 0.455934f,
 2.244411f, 1.218862f, -0.886205f,
 2.545638f, 1.291012f, -1.928182f,
 0.733078f, 1.291012f, -1.928182f,
 0.733078f, 1.291012f, -1.928182f,
 0.778096f, -0.015118f, 0.455934f,
 0.733078f, 1.291012f, -1.928182f,
 0.733078f, 1.291012f, -1.928182f,
 0.778096f, -0.015118f, 0.455934f,
 0.998903f, 1.218862f, -0.886205f,
 3.384857f, 9.354511f, 1.510952f,
 2.169977f, 8.275961f, -3.245047f,
 2.035607f, 8.576645f, 0.461091f,
 2.169977f, 8.275961f, -3.245047f,
 2.663432f, 10.407714f, -3.194364f,
 3.633617f, 10.075674f, 0.255961f,
 2.169977f, 8.275961f, -3.245047f,
 2.169977f, 8.275961f, -3.245047f,
 3.633617f, 10.075674f, 0.255961f,
 3.384857f, 9.354511f, 1.510952f,
 2.663432f, 10.407714f, -3.194364f,
 2.663432f, 10.407714f, -3.194364f,
 3.633617f, 10.075674f, 0.255961f,
 2.035607f, 8.576645f, 0.461091f,
 2.388903f, 8.989770f, 0.433954f,
 3.384857f, 9.354511f, 1.510952f,
 3.384857f, 9.354511f, 1.510952f,
 1.942218f, 10.287400f, 2.669342f,
 2.393476f, 10.098484f, 0.015438f,
 2.388903f, 8.989770f, 0.433954f,
 2.393476f, 10.098484f, 0.015438f,
 2.393476f, 10.098484f, 0.015438f,
 1.942218f, 10.287400f, 2.669342f,
 1.942218f, 10.287400f, 2.669342f,
 -0.175999f, 10.557989f, 2.483984f,
 0.290534f, 10.688305f, 1.130915f,
 -0.175999f, 10.557989f, 2.483984f,
 -0.175999f, 10.557989f, 2.483984f,
 0.092757f, 11.614308f, 2.678385f,
 -0.175999f, 10.557989f, 2.483984f,
 -0.175999f, 10.557989f, 2.483984f,
 0.478241f, 11.721985f, 1.560381f,
 0.092757f, 11.614308f, 2.678385f,
 0.092757f, 11.614308f, 2.678385f,
 0.478241f, 11.721985f, 1.560381f,
 0.290534f, 10.688305f, 1.130915f,
 0.290534f, 10.688305f, 1.130915f,
 -0.005604f, 10.592187f, -3.056657f,
 2.663432f, 10.407714f, -3.194364f,
 2.663432f, 10.407714f, -3.194364f,
 -2.196082f, 8.407174f, 0.846865f,
 -1.151813f, 6.546507f, -0.506078f,
 -1.151813f, 6.546507f, -0.506078f,
 0.152110f, 5.616814f, -0.234654f,
 -2.281921f, 9.950094f, -3.412664f,
 -2.281921f, 9.950094f, -3.412664f,
 -0.005604f, 10.592187f, -3.056657f,
 -0.005604f, 10.592187f, -3.056657f,
 -0.022792f, 10.546401f, -0.195909f,
 -1.026182f, 10.620220f, -0.484804f,
 -1.026182f, 10.620220f, -0.484804f,
 -1.410587f, 11.834422f, -0.278196f,
 -1.395077f, 12.153640f, -1.931795f,
 -1.026182f, 10.620220f, -0.484804f,
 -1.026182f, 10.620220f, -0.484804f,
 -1.395077f, 12.153640f, -1.931795f,
 -1.010083f, 10.951582f, -2.201312f,
 -1.010083f, 10.951582f, -2.201312f,
 -1.010083f, 10.951582f, -2.201312f,
 -0.000502f, 11.005178f, -2.572450f,
 -1.410587f, 11.834422f, -0.278196f,
 -1.410587f, 11.834422f, -0.278196f,
 -1.395077f, 12.153640f, -1.931795f,
 -0.270134f, 5.515234f, -2.717020f,
 -1.391886f, 4.663243f, -1.999258f,
 -1.391886f, 4.663243f, -1.999258f,
 -1.391886f, 4.663243f, -1.999258f,
 -2.008597f, 4.247099f, 0.716997f,
 -1.151813f, 6.546507f, -0.506078f,
 -1.151813f, 6.546507f, -0.506078f,
 -2.008597f, 4.247099f, 0.716997f,
 -1.151813f, 6.546507f, -0.506078f,
 -1.151813f, 6.546507f, -0.506078f,
 0.152110f, 5.616814f, -0.234654f,
 -1.118565f, 4.744931f, 1.977624f,
 0.152110f, 5.616814f, -0.234654f,
 0.152110f, 5.616814f, -0.234654f,
 -0.270134f, 5.515234f, -2.717020f,
 -2.387953f, -0.025459f, 0.737540f,
 -2.008597f, 4.247099f, 0.716997f,
 -2.008597f, 4.247099f, 0.716997f,
 -1.118565f, 4.744931f, 1.977624f,
 -0.575393f, 1.291012f, 2.885472f,
 -0.575393f, 1.291012f, 2.885472f,
 -0.575354f, -0.025459f, 0.737540f,
 -0.575354f, -0.025459f, 0.737540f,
 -2.387953f, -0.025459f, 0.737540f,
 -2.387953f, -0.025459f, 0.737540f,
 -2.258681f, -0.015118f, 5.269588f,};

static float VertArrayB[] = new float[]{
 -2.387953f, 1.291012f, 2.885472f,
 -2.258681f, -0.015118f, 5.269588f,
 -2.086726f, 1.218862f, 3.927450f,
 -2.387953f, 1.291012f, 2.885472f,
 -2.086726f, 1.218862f, 3.927450f,
 -0.575393f, 1.291012f, 2.885472f,
 -0.575393f, 1.291012f, 2.885472f,
 -2.086726f, 1.218862f, 3.927450f,
 -0.841217f, 1.218862f, 3.927450f,
 -0.841217f, 1.218862f, 3.927450f,
 -0.620411f, -0.015118f, 5.269588f,
 -0.575393f, 1.291012f, 2.885472f,
 -0.575393f, 1.291012f, 2.885472f,
 -0.620411f, -0.015118f, 5.269588f,
 -0.575354f, -0.025459f, 0.737540f,
 -2.749749f, 8.273977f, -2.408133f,
 -2.196082f, 8.407174f, 0.846865f,
 -3.899545f, 8.693637f, -0.302014f,
 -2.196082f, 8.407174f, 0.846865f,
 -1.841689f, 8.682422f, -0.015389f,
 -3.899545f, 8.693637f, -0.302014f,
 -3.899545f, 8.693637f, -0.302014f,
 -3.789512f, 9.957133f, -1.042574f,
 -2.749749f, 8.273977f, -2.408133f,
 -2.749749f, 8.273977f, -2.408133f,
 -3.789512f, 9.957133f, -1.042574f,
 -2.281921f, 9.950094f, -3.412664f,
 -2.281921f, 9.950094f, -3.412664f,
 -3.789512f, 9.957133f, -1.042574f,
 -2.615342f, 10.177676f, -0.117490f,
 -2.615342f, 10.177676f, -0.117490f,
 -1.841689f, 8.682422f, -0.015389f,
 -2.196082f, 8.407174f, 0.846865f,
 -1.841689f, 8.682422f, -0.015389f,
 -2.791081f, 9.025679f, 1.021146f,
 -3.899545f, 8.693637f, -0.302014f,
 -2.830006f, 8.803923f, 1.643228f,
 -2.991367f, 9.464701f, 1.868680f,
 -3.899545f, 8.693637f, -0.302014f,
 -3.899545f, 8.693637f, -0.302014f,
 -2.991367f, 9.464701f, 1.868680f,
 -3.789512f, 9.957133f, -1.042574f,
 -2.991367f, 9.464701f, 1.868680f,
 -2.962769f, 9.627629f, 1.411621f,
 -3.789512f, 9.957133f, -1.042574f,
 -3.789512f, 9.957133f, -1.042574f,
 -2.962769f, 9.627629f, 1.411621f,
 -1.967415f, 9.947203f, -0.788786f,
 -1.967415f, 9.947203f, -0.788786f,
 -2.962769f, 9.627629f, 1.411621f,
 -1.841689f, 8.682422f, -0.015389f,
 -1.841689f, 8.682422f, -0.015389f,
 -2.962769f, 9.627629f, 1.411621f,
 -2.791081f, 9.025679f, 1.021146f,
 -0.783544f, 8.773468f, 2.280005f,
 -1.032856f, 9.794416f, 2.628344f,
 -2.830006f, 8.803923f, 1.643228f,
 -2.830006f, 8.803923f, 1.643228f,
 -1.032856f, 9.794416f, 2.628344f,
 -2.991367f, 9.464701f, 1.868680f,
 0.546426f, 9.058604f, 2.464864f,
 0.630982f, 9.540331f, 1.113487f,
 -0.783544f, 8.773468f, 2.280005f,
 -0.783544f, 8.773468f, 2.280005f,
 0.630982f, 9.540331f, 1.113487f,
 -0.698988f, 9.255195f, 0.928628f,
 -1.032856f, 9.794416f, 2.628344f,
 0.297112f, 10.079552f, 2.813203f,
 -0.783544f, 8.773468f, 2.280005f,
 -0.783544f, 8.773468f, 2.280005f,
 0.297112f, 10.079552f, 2.813203f,
 0.546426f, 9.058604f, 2.464864f,
 -0.962990f, 10.192454f, 1.511737f,
 0.366979f, 10.477590f, 1.696596f,
 -1.032856f, 9.794416f, 2.628344f,
 -1.032856f, 9.794416f, 2.628344f,
 0.366979f, 10.477590f, 1.696596f,
 0.297112f, 10.079552f, 2.813203f,
 0.630982f, 9.540331f, 1.113487f,
 0.366979f, 10.477590f, 1.696596f,
 -0.698988f, 9.255195f, 0.928628f,
 -0.698988f, 9.255195f, 0.928628f,
 0.366979f, 10.477590f, 1.696596f,
 -0.962990f, 10.192454f, 1.511737f,
 -0.005604f, 10.592187f, -3.056657f,
 0.074941f, 9.622747f, -3.558088f,
 -2.281921f, 9.950094f, -3.412664f,
 -2.281921f, 9.950094f, -3.412664f,
 0.074941f, 9.622747f, -3.558088f,
 -3.464998f, 7.686217f, -3.746443f,};

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
{ 0.288486f, -0.244944f, 0.925623f},
{ 0.059837f, 0.340136f, 0.938470f},
{ 0.121183f, -0.079487f, 0.989442f},
{ -0.076840f, 0.503192f, 0.860752f},
{ 0.240331f, 0.952672f, 0.186162f},
{ 0.240331f, 0.952672f, 0.186162f},
{ 0.240331f, 0.952672f, 0.186162f},
{ 0.240331f, 0.952672f, 0.186162f},
{ -0.049075f, 0.035092f, -0.998178f},
{ -0.040050f, -0.066722f, -0.996967f},
{ -0.038721f, 0.044822f, -0.998244f},
{ -0.021444f, -0.076749f, -0.996820f},
{ 0.000000f, -0.946364f, 0.323104f},
{ 0.000000f, -0.960351f, 0.278793f},
{ 0.000000f, 0.736146f, 0.676823f},
{ 0.000000f, 0.736147f, 0.676822f},
{ -0.009461f, -0.183880f, -0.982903f},
{ 0.035602f, -0.155905f, -0.987130f},
{ 0.921661f, -0.382605f, 0.064457f},
{ 0.983475f, -0.132832f, 0.123018f},
{ 0.939841f, -0.318013f, 0.124768f},
{ 0.979568f, -0.032587f, 0.198456f},
{ 0.088455f, -0.198571f, 0.976087f},
{ -0.014787f, -0.167414f, 0.985776f},
{ -0.032444f, 0.946276f, 0.321728f},
{ 0.104446f, 0.865163f, 0.490493f},
{ 0.276251f, 0.956872f, 0.089896f},
{ 0.322572f, 0.941897f, 0.093691f},
{ 0.321454f, 0.940579f, 0.109446f},
{ 0.096501f, 0.977121f, 0.189533f},
{ 0.043373f, 0.919382f, -0.390967f},
{ 0.100852f, 0.889057f, -0.446549f},
{ 0.057652f, 0.912491f, -0.405013f},
{ 0.303057f, 0.723482f, -0.620266f},
{ 0.257120f, -0.387459f, 0.885305f},
{ 0.337849f, -0.316556f, 0.886369f},
{ 0.328351f, -0.198680f, 0.923424f},
{ 0.372421f, -0.202611f, 0.905677f},
{ 0.943382f, -0.327231f, -0.054322f},
{ 0.943382f, -0.327231f, -0.054322f},
{ 0.943382f, -0.327231f, -0.054322f},
{ 0.943382f, -0.327231f, -0.054322f},
{ 0.355932f, -0.007825f, -0.934479f},
{ 0.396183f, 0.153679f, -0.905219f},
{ 0.409259f, 0.037707f, -0.911639f},
{ 0.432424f, 0.150385f, -0.889041f},
{ 0.329069f, -0.098987f, 0.939103f},
{ 0.258896f, -0.051836f, 0.964513f},
{ 0.961759f, 0.267114f, 0.060586f},
{ 0.961759f, 0.267114f, 0.060586f},
{ 0.961759f, 0.267114f, 0.060586f},
{ 0.961759f, 0.267114f, 0.060586f},
{ 0.390940f, 0.256567f, -0.883934f},
{ 0.323649f, 0.310502f, -0.893778f},
{ 0.038235f, -0.551407f, -0.833359f},
{ 0.028658f, -0.550349f, -0.834443f},
{ 0.005886f, -0.547627f, -0.836702f},
{ -0.020682f, -0.544083f, -0.838776f},
{ 0.942891f, 0.316184f, 0.104809f},
{ 0.944047f, 0.307015f, 0.120486f},
{ 0.013254f, -0.334830f, 0.942185f},
{ 0.013467f, -0.538247f, 0.842680f},
{ -0.906547f, -0.386354f, 0.170011f},
{ -0.978594f, -0.199995f, 0.048545f},
{ -0.921519f, -0.370587f, 0.116052f},
{ -0.987296f, -0.151494f, -0.047914f},
{ -0.015768f, 0.665941f, -0.745838f},
{ -0.009563f, 0.664631f, -0.747110f},
{ -0.001681f, 0.662928f, -0.748681f},
{ 0.000000f, 0.662559f, -0.749010f},
{ 0.992684f, 0.113130f, -0.042199f},
{ 0.997126f, 0.064595f, -0.039590f},
{ 0.002276f, -0.797301f, 0.603578f},
{ 0.000000f, -0.796542f, 0.604583f},
{ -0.997768f, 0.064052f, -0.018878f},
{ -0.999283f, 0.032279f, -0.019766f},
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
{ -0.218404f, -0.873047f, 0.435991f},
{ 0.228398f, -0.943153f, 0.241448f},
{ 0.344018f, -0.925390f, 0.159075f},
{ 0.760150f, -0.644820f, 0.079875f},
{ 0.935777f, -0.209876f, -0.283325f},
{ 0.888738f, -0.433652f, -0.148627f},
{ 0.932697f, -0.246651f, -0.263133f},
{ 0.864971f, -0.489637f, -0.109911f},
{ 0.172570f, 0.983805f, -0.048442f},
{ 0.044789f, 0.992529f, -0.113495f},
{ 0.243861f, -0.145563f, 0.958824f},
{ 0.565264f, -0.048641f, 0.823475f},
{ 0.867926f, 0.085294f, 0.489315f},
{ 0.928785f, 0.127527f, 0.347986f},
{ -0.414861f, -0.908327f, 0.053227f},
{ -0.209196f, -0.963859f, -0.164962f},
{ 0.849966f, 0.366100f, 0.378851f},
{ 0.402342f, -0.049880f, 0.914130f},
{ 0.847172f, 0.341552f, 0.406992f},
{ 0.166365f, -0.219258f, 0.961378f},
{ 0.565575f, 0.824692f, -0.002778f},
{ 0.823012f, 0.463465f, 0.328409f},
{ -0.993100f, -0.037807f, -0.111005f},
{ -0.547731f, 0.354158f, -0.758000f},
{ -0.993387f, -0.014326f, -0.113916f},
{ 0.006897f, 0.398536f, -0.917127f},
{ -0.114013f, -0.984385f, -0.134119f},
{ -0.114013f, -0.984385f, -0.134119f},
{ -0.105631f, -0.153926f, 0.982420f},
{ -0.105631f, -0.153926f, 0.982420f},
{ 0.287514f, 0.938832f, 0.189554f},
{ 0.287513f, 0.938832f, 0.189554f},
{ 0.287513f, 0.938832f, 0.189554f},
{ 0.287513f, 0.938832f, 0.189554f},
{ 0.464348f, 0.268652f, -0.843924f},
{ 0.463288f, 0.266963f, -0.845041f},
{ 0.257101f, 0.949456f, 0.180091f},
{ 0.257101f, 0.949456f, 0.180091f},
{ 0.257101f, 0.949456f, 0.180091f},
{ 0.257101f, 0.949456f, 0.180091f},
{ 0.324621f, 0.090676f, -0.941488f},
{ 0.324621f, 0.090676f, -0.941488f},
{ 0.324621f, 0.090676f, -0.941488f},
{ 0.324622f, 0.090676f, -0.941487f},
{ -0.257100f, -0.949456f, -0.180091f},
{ -0.257100f, -0.949456f, -0.180091f},
{ -0.257100f, -0.949456f, -0.180091f},
{ -0.257100f, -0.949456f, -0.180090f},
{ -0.373232f, -0.297342f, 0.878798f},
{ -0.373232f, -0.297342f, 0.878798f},
{ -0.373232f, -0.297342f, 0.878798f},
{ -0.373232f, -0.297341f, 0.878798f},
{ 0.914165f, -0.285538f, 0.287700f},
{ 0.914165f, -0.285538f, 0.287700f},
{ 0.914165f, -0.285538f, 0.287700f},
{ 0.914165f, -0.285538f, 0.287700f},
{ -0.014161f, 0.458446f, -0.888610f},
{ 0.051095f, 0.276215f, -0.959737f},
{ 0.028442f, 0.250833f, -0.967612f},
{ 0.063761f, 0.127168f, -0.989830f},
{ 0.062330f, 0.097216f, -0.993310f},
{ 0.141759f, -0.039275f, -0.989122f},
{ 0.162581f, 0.051942f, -0.985327f},
{ 0.220308f, -0.022415f, -0.975173f},
{ -0.124177f, -0.236557f, 0.963650f},
{ -0.112474f, 0.441862f, 0.890004f},
{ -0.119755f, -0.065554f, 0.990637f},
{ -0.225229f, 0.507106f, 0.831935f},
{ -0.221520f, 0.957863f, 0.182832f},
{ -0.221522f, 0.957862f, 0.182833f},
{ -0.221526f, 0.957861f, 0.182834f},
{ -0.221530f, 0.957860f, 0.182836f},
{ 0.148184f, 0.022845f, -0.988696f},
{ -0.177194f, -0.182882f, -0.967035f},
{ -0.112112f, -0.278272f, -0.953937f},
{ -0.282622f, -0.288084f, -0.914950f},
{ 0.000000f, -0.946364f, 0.323103f},
{ 0.000000f, 0.736147f, 0.676822f},
{ 0.000000f, -0.960351f, 0.278792f},
{ 0.000000f, 0.736147f, 0.676822f},
{ -0.448013f, -0.152301f, -0.880959f},
{ -0.325928f, -0.200978f, -0.923785f},
{ -0.972849f, -0.054355f, 0.224969f},
{ -0.961484f, -0.220248f, 0.164438f},
{ -0.844992f, -0.426713f, 0.322341f},
{ -0.806368f, -0.569232f, 0.160454f},
{ -0.028131f, -0.083172f, 0.996138f},
{ 0.011283f, 0.294783f, 0.955498f},
{ -0.055127f, 0.904630f, 0.422619f},
{ -0.124908f, 0.879516f, 0.459183f},
{ -0.224342f, 0.957234f, 0.182684f},
{ -0.498289f, 0.864741f, -0.062700f},
{ -0.405569f, 0.913056f, 0.042931f},
{ -0.439319f, 0.892048f, -0.106062f},
{ -0.152514f, 0.834369f, -0.529686f},
{ -0.159671f, 0.829069f, -0.535864f},
{ -0.174230f, 0.817940f, -0.548286f},
{ -0.268203f, 0.734360f, -0.623525f},
{ -0.281761f, -0.377198f, 0.882231f},
{ -0.352010f, -0.180526f, 0.918422f},
{ -0.359850f, -0.303164f, 0.882383f},
{ -0.390105f, -0.182363f, 0.902531f},
{ -0.954474f, -0.291092f, -0.065146f},
{ -0.954474f, -0.291092f, -0.065146f},
{ -0.954474f, -0.291092f, -0.065146f},
{ -0.954474f, -0.291092f, -0.065146f},
{ -0.416118f, 0.173948f, -0.892518f},
{ -0.385539f, 0.173364f, -0.906259f},
{ -0.397222f, 0.053171f, -0.916181f},
{ -0.345293f, 0.005528f, -0.938479f},
{ -0.289576f, -0.041142f, 0.956270f},
{ -0.350326f, -0.076456f, 0.933502f},
{ -0.938863f, 0.339579f, 0.056765f},
{ -0.938867f, 0.339571f, 0.056754f},
{ -0.938865f, 0.339574f, 0.056758f},
{ -0.938870f, 0.339564f, 0.056745f},
{ -0.378835f, 0.280151f, -0.882043f},
{ -0.321912f, 0.320469f, -0.890883f},
{ 0.519100f, -0.835454f, -0.180419f},
{ 0.203492f, -0.967281f, -0.151518f},
{ 0.473926f, -0.862526f, -0.177318f},
{ 0.071643f, -0.988234f, -0.135136f},
{ -0.977734f, 0.159796f, -0.136019f},
{ -0.984959f, 0.092534f, -0.145923f},
{ -0.108020f, 0.520871f, 0.846774f},
{ 0.007379f, 0.548690f, 0.835993f},
{ 0.994319f, 0.051397f, 0.093206f},
{ 0.984821f, -0.166195f, 0.050058f},
{ 0.729750f, -0.681265f, -0.057813f},
{ 0.713165f, -0.694816f, -0.092875f},
{ 0.088707f, 0.024969f, -0.995745f},
{ 0.011612f, -0.000912f, -0.999932f},
{ 0.049626f, 0.011845f, -0.998698f},
{ 0.000000f, -0.004808f, -0.999988f},
{ -0.997326f, 0.062314f, -0.038192f},
{ -0.999667f, 0.023646f, -0.010308f},
{ -0.015190f, 0.259400f, 0.965651f},
{ 0.000000f, 0.254211f, 0.967149f},
{ 0.998612f, 0.051451f, -0.011258f},
{ 0.996268f, 0.073599f, -0.045091f},
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
{ -0.215284f, -0.973554f, 0.076458f},
{ -0.470998f, -0.711963f, 0.520835f},
{ -0.189753f, -0.971100f, 0.144769f},
{ -0.136851f, 0.093312f, 0.986187f},
{ -0.877772f, -0.183050f, -0.442729f},
{ -0.866287f, -0.148072f, -0.477097f},
{ -0.848770f, -0.103660f, -0.518502f},
{ -0.840777f, -0.085697f, -0.534556f},
{ -0.088726f, 0.995635f, 0.028969f},
{ -0.032010f, 0.963026f, 0.267499f},
{ -0.722254f, -0.411650f, -0.555782f},
{ -0.761911f, -0.427444f, -0.486604f},
{ -0.744755f, -0.420713f, -0.518017f},
{ -0.776646f, -0.433078f, -0.457455f},
{ 0.161414f, -0.985951f, -0.042962f},
{ 0.154987f, -0.933587f, -0.323101f},
{ -0.572317f, -0.386518f, 0.723227f},
{ -0.689093f, -0.236578f, 0.684968f},
{ -0.924666f, 0.225672f, 0.306701f},
{ -0.921166f, 0.253361f, 0.295401f},
{ -0.468004f, 0.841276f, 0.270607f},
{ -0.159510f, 0.969906f, 0.183955f},
{ 0.835448f, 0.344756f, 0.427985f},
{ 0.570300f, 0.701714f, -0.427031f},
{ 0.836087f, 0.329812f, 0.438385f},
{ 0.431187f, 0.566665f, -0.702117f},
{ 0.088549f, -0.939981f, -0.329536f},
{ 0.088550f, -0.939981f, -0.329536f},
{ -0.280971f, -0.370653f, 0.885252f},
{ -0.280971f, -0.370653f, 0.885252f},
{ -0.272852f, 0.911474f, 0.307842f},
{ -0.272852f, 0.911474f, 0.307842f},
{ -0.272852f, 0.911474f, 0.307842f},
{ -0.272852f, 0.911474f, 0.307842f},
{ -0.094873f, 0.508493f, -0.855824f},
{ -0.093499f, 0.506820f, -0.856966f},
{ -0.240462f, 0.918966f, 0.312539f},
{ -0.240461f, 0.918966f, 0.312539f},
{ -0.240461f, 0.918966f, 0.312539f},
{ -0.240461f, 0.918966f, 0.312539f},
{ 0.058836f, 0.335194f, -0.940310f},
{ 0.058835f, 0.335194f, -0.940310f},
{ 0.058835f, 0.335194f, -0.940310f},
{ 0.058835f, 0.335194f, -0.940310f},
{ 0.240461f, -0.918966f, -0.312539f},
{ 0.240461f, -0.918966f, -0.312539f},
{ 0.240461f, -0.918966f, -0.312539f},
{ 0.240461f, -0.918966f, -0.312539f},
{ -0.004491f, -0.529160f, 0.848510f},
{ -0.004491f, -0.529160f, 0.848510f},
{ -0.004491f, -0.529160f, 0.848510f},
{ -0.004491f, -0.529160f, 0.848510f},
{ -0.972539f, -0.193229f, -0.129733f},
{ -0.972539f, -0.193229f, -0.129733f},
{ -0.972539f, -0.193229f, -0.129733f},
{ -0.972539f, -0.193229f, -0.129733f},
{ 0.009105f, 0.459998f, -0.887873f},
{ -0.031047f, 0.238140f, -0.970735f},
{ -0.034532f, 0.187477f, -0.981662f},
{ -0.057758f, -0.070311f, -0.995852f},
{ -0.084081f, 0.102254f, -0.991199f},
{ -0.286754f, 0.022575f, -0.957738f},
{ -0.260754f, -0.144714f, -0.954497f},
{ -0.362105f, -0.057077f, -0.930388f},
{ 0.215377f, 0.073550f, -0.973757f},
{ 0.265900f, -0.024350f, -0.963693f},
{ -0.357677f, 0.067564f, -0.931398f},
{ -0.410400f, -0.043419f, -0.910871f}};

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
162, 37, 163,
164, 165, 37,
166, 167, 168,
169, 170, 171,
3, 39, 172,
173, 39, 174,
175, 37, 3,
3, 37, 39,
176, 36, 41,
41, 36, 40,
38, 42, 177,
178, 42, 179,
180, 43, 38,
38, 43, 42,
181, 41, 182,
183, 41, 43,
41, 40, 45,
45, 40, 44,
42, 46, 184,
185, 46, 186,
43, 47, 42,
42, 47, 46,
43, 41, 47,
47, 41, 45,
187, 49, 188,
189, 49, 48,
190, 191, 50,
50, 192, 48,
193, 194, 51,
51, 195, 50,
196, 51, 197,
198, 51, 49,
49, 51, 48,
48, 51, 50,
199, 200, 102,
102, 201, 101,
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
61, 67, 202,
56, 203, 0,
0, 204, 205,
12, 68, 2,
2, 68, 57,
68, 69, 57,
57, 69, 206,
207, 69, 208,
209, 69, 15,
210, 16, 211,
212, 16, 70,
213, 214, 215,
216, 217, 218,
71, 19, 219,
220, 19, 221,
20, 58, 16,
16, 58, 70,
58, 59, 222,
223, 59, 224,
71, 59, 19,
19, 59, 23,
225, 73, 226,
227, 73, 72,
228, 229, 230,
231, 232, 74,
74, 75, 233,
234, 75, 235,
236, 73, 237,
238, 73, 239,
73, 77, 72,
72, 77, 76,
240, 78, 241,
242, 78, 74,
74, 78, 75,
75, 78, 79,
243, 244, 73,
73, 245, 77,
62, 63, 246,
247, 63, 248,
249, 250, 78,
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


//Vertices: 341  Texture Co-ords: 202  Normals: 304  Texture: block Faces: 196 Smooth Groups: 94 sucess: 78 Doubles: 118 Redos needed: 147 Correct: 117