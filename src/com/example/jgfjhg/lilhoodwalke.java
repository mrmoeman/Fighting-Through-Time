package com.example.jgfjhg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;
import android.graphics.Bitmap;
import android.opengl.GLUtils;

class lilhoodwalke {

static String TextureName = "walk";

static int Vertices = 344;

static int VertTexts = 215;

static int Normals = 360;

static int Faces = 212;

static int FacesB = 31;

static int SmoothGroups = 92;

static float VertArray[] = new float[]{
 5.090983f, 0.883121f, -1.971000f,
 1.294013f, 6.745537f, 3.906214f,
 4.587354f, 1.420826f, -2.034312f,
 1.218026f, 6.622975f, 3.180968f,
 3.045633f, 4.079924f, 1.331399f,
 3.634624f, 3.658069f, 2.132711f,
 3.423034f, 3.497227f, 0.747231f,
 4.012025f, 3.075371f, 1.548543f,
 4.772708f, 0.926455f, -3.052710f,
 4.235212f, 1.753173f, -2.231842f,
 0.529641f, 7.477633f, 3.515004f,
 1.059498f, 6.656386f, 2.683743f,
 2.756895f, 4.815869f, 2.797775f,
 2.360280f, 5.033568f, 2.024988f,
 4.416634f, 2.253277f, 0.228714f,
 3.859654f, 2.718577f, -0.295847f,
 5.090983f, 0.883121f, -1.971000f,
 1.294013f, 6.745537f, 3.906214f,
 4.587354f, 1.420826f, -2.034312f,
 1.218026f, 6.622975f, 3.180968f,
 3.045633f, 4.079924f, 1.331399f,
 3.634624f, 3.658069f, 2.132711f,
 3.423034f, 3.497227f, 0.747231f,
 4.012025f, 3.075371f, 1.548543f,
 4.772708f, 0.926455f, -3.052710f,
 4.235212f, 1.753173f, -2.231842f,
 0.529641f, 7.477633f, 3.515004f,
 1.059498f, 6.656386f, 2.683743f,
 2.756895f, 4.815869f, 2.797775f,
 2.360280f, 5.033568f, 2.024988f,
 4.416634f, 2.253277f, 0.228714f,
 3.859654f, 2.718577f, -0.295847f,
 0.520685f, 7.860254f, 1.449332f,
 2.573786f, 7.892875f, 1.567048f,
 1.219111f, 8.006393f, -1.863075f,
 2.741321f, 8.007264f, -1.197005f,
 1.667100f, 4.219386f, 0.259801f,
 0.772455f, 4.111658f, 0.607705f,
 0.814132f, 4.501682f, -1.403236f,
 1.694302f, 4.447590f, -1.123418f,
 1.565922f, 7.189393f, 1.073902f,
 0.681271f, 7.173455f, 1.084964f,
 1.089907f, 7.260916f, -1.217358f,
 1.896143f, 7.287240f, -0.776476f,
 0.515904f, 10.982562f, 1.572151f,
 0.802984f, 10.749063f, 1.691026f,
 1.364811f, 10.662489f, -0.966572f,
 1.054962f, 10.760628f, -0.969142f,
 0.814132f, 5.483347f, 1.061212f,
 0.814132f, 5.837860f, -1.171294f,
 1.582332f, 5.829760f, -1.046577f,
 1.582332f, 5.507733f, 0.851933f,
 2.418351f, 1.896676f, 0.787131f,
 0.809425f, 1.582340f, 0.572285f,
 0.809163f, 2.238732f, -2.545999f,
 2.344639f, 2.074894f, -2.033179f,
 0.814132f, 6.650232f, -1.663874f,
 2.363379f, 6.663966f, -0.921752f,
 0.814132f, 0.870550f, -3.664017f,
 4.774895f, 0.882503f, -2.924701f,
 0.176231f, 10.742990f, 1.558606f,
 0.732900f, 10.656367f, -1.100081f,
 -0.092664f, 4.147273f, 0.247002f,
 0.045933f, 5.507734f, 0.851934f,
 0.045933f, 5.829761f, -1.046577f,
 -0.066037f, 4.447590f, -1.123418f,
 -0.169402f, 7.178479f, 0.834684f,
 -1.404816f, 7.854333f, 0.726453f,
 -0.442163f, 7.976426f, -1.869607f,
 0.173903f, 7.270555f, -1.140348f,
 -0.727810f, 1.714495f, -0.625270f,
 -0.669679f, 2.154155f, -2.393678f,
 -1.582096f, 6.178113f, -1.512923f,
 -3.326348f, 0.882509f, -2.695060f,
 3.955949f, 3.763729f, -2.158969f,
 0.814132f, 3.743169f, -2.968032f,
 -2.454222f, 3.763734f, -1.904713f,
 2.753408f, 4.660926f, -0.371681f,
 2.664013f, 4.965841f, 0.046397f,
 3.029015f, 4.886386f, -0.444624f,
 2.887274f, 5.264855f, 0.083844f,
 3.245286f, 3.490691f, 0.705052f,
 2.962799f, 3.929090f, 1.205130f,
 3.730283f, 3.887441f, 0.576691f,
 3.416209f, 4.374860f, 1.132685f,
 3.587011f, 3.064834f, 1.271421f,
 3.304524f, 3.503234f, 1.771499f,
 4.072011f, 3.461587f, 1.143058f,
 3.757936f, 3.949007f, 1.699053f,
 1.497440f, 5.964158f, 0.443658f,
 1.497440f, 6.055972f, -0.497652f,
 1.554317f, 6.885864f, -0.475700f,
 1.554317f, 6.795162f, 0.587139f,
 -0.788204f, 4.667526f, -0.522967f,
 -0.739796f, 4.719112f, -0.116042f,
 -1.086690f, 4.848351f, -0.421377f,
 -1.014816f, 4.934678f, 0.030467f,
 -1.113018f, 3.037371f, -0.611526f,
 -0.845064f, 3.017187f, 0.059194f,
 -1.638276f, 3.355576f, -0.432753f,
 -1.340362f, 3.333135f, 0.312963f,
 -1.383647f, 2.303709f, -0.525487f,
 -1.115694f, 2.283525f, 0.145233f,
 -1.908909f, 2.621916f, -0.346713f,
 -1.610993f, 2.599475f, 0.399004f,
 0.100491f, 5.964225f, 0.443986f,
 0.100491f, 6.055074f, -0.497500f,
 0.043614f, 6.885001f, -0.476403f,
 0.043614f, 6.795173f, 0.587110f,
 2.420236f, 0.954285f, 0.295925f,
 1.286887f, 0.954284f, 0.295924f,
 1.286887f, 0.218974f, 0.637296f,
 2.420236f, 0.218976f, 0.637297f,
 1.229370f, 2.090039f, 0.326769f,
 1.911591f, 2.140544f, 0.260723f,
 1.144813f, 2.480408f, -0.248145f,
 1.827034f, 2.530913f, -0.314192f,
 1.365588f, 1.193712f, -0.342053f,
 2.341534f, 1.193713f, -0.342052f,
 1.365588f, 0.973700f, -1.444173f,
 2.341534f, 0.973701f, -1.444173f,
 1.666787f, 4.219381f, 0.259791f,
 0.772140f, 4.111639f, 0.607701f,
 0.839399f, 4.452708f, -1.380550f,
 1.706395f, 4.388514f, -1.116724f,
 -0.789357f, 0.595542f, -0.321851f,
 0.343952f, 0.598519f, -0.312877f,
 0.341197f, -0.000161f, 0.233740f,
 -0.792112f, -0.003138f, 0.224766f,
 0.446094f, 1.902786f, -1.146738f,
 -0.241110f, 1.901473f, -1.156066f,
 0.455605f, 1.897557f, -1.846700f,
 -0.231599f, 1.896244f, -1.856028f,
 0.270546f, 0.634886f, -0.993923f,
 -0.705367f, 0.632323f, -1.001650f,
 0.279767f, 0.093748f, -1.978889f,
 -0.696145f, 0.091184f, -1.986617f,
 -0.092664f, 4.147273f, 0.247002f,
 0.772455f, 4.111658f, 0.607705f,
 0.839711f, 4.452691f, -1.380554f,
 -0.048138f, 4.435190f, -1.108745f,
 1.565922f, 7.189393f, 1.073902f,
 1.896143f, 7.287240f, -0.776476f,
 2.573786f, 7.892875f, 1.567048f,
 2.573786f, 7.892875f, 1.567048f,
 1.896143f, 7.287240f, -0.776476f,
 2.741321f, 8.007264f, -1.197005f,
 0.802984f, 10.749063f, 1.691026f,
 0.802984f, 10.749063f, 1.691026f,
 0.515904f, 10.982562f, 1.572151f,
 2.741321f, 8.007264f, -1.197005f,
 2.573786f, 7.892875f, 1.567048f,
 2.573786f, 7.892875f, 1.567048f,
 1.364811f, 10.662489f, -0.966572f,
 1.364811f, 10.662489f, -0.966572f,
 1.054962f, 10.760628f, -0.969142f,
 1.896143f, 7.287240f, -0.776476f,
 1.089907f, 7.260916f, -1.217358f,
 1.089907f, 7.260916f, -1.217358f,
 1.565922f, 7.189393f, 1.073902f,
 1.565922f, 7.189393f, 1.073902f,
 0.681271f, 7.173455f, 1.084964f,
 1.667100f, 4.219386f, 0.259801f,
 0.772455f, 4.111658f, 0.607705f,
 0.772455f, 4.111658f, 0.607705f,
 0.814132f, 4.501682f, -1.403236f,
 1.694302f, 4.447590f, -1.123418f,
 1.694302f, 4.447590f, -1.123418f,
 1.694302f, 4.447590f, -1.123418f,
 1.667100f, 4.219386f, 0.259801f,
 2.344639f, 2.074894f, -2.033179f,
 2.344639f, 2.074894f, -2.033179f,
 1.667100f, 4.219386f, 0.259801f,
 1.896143f, 7.287240f, -0.776476f,
 1.896143f, 7.287240f, -0.776476f,
 1.565922f, 7.189393f, 1.073902f,
 1.896143f, 7.287240f, -0.776476f,
 1.089907f, 7.260916f, -1.217358f,
 1.089907f, 7.260916f, -1.217358f,
 0.045933f, 5.829761f, -1.046577f,
 0.045933f, 5.829761f, -1.046577f,
 -0.066037f, 4.447590f, -1.123418f,
 -0.169402f, 7.178479f, 0.834684f,
 -1.404816f, 7.854333f, 0.726453f,
 0.173903f, 7.270555f, -1.140348f,
 0.173903f, 7.270555f, -1.140348f,
 -1.404816f, 7.854333f, 0.726453f,
 -0.442163f, 7.976426f, -1.869607f,
 0.515904f, 10.982562f, 1.572151f,
 0.176231f, 10.742990f, 1.558606f,
 0.176231f, 10.742990f, 1.558606f,
 -1.404816f, 7.854333f, 0.726453f,
 -1.404816f, 7.854333f, 0.726453f,
 -0.442163f, 7.976426f, -1.869607f,
 0.732900f, 10.656367f, -1.100081f,
 0.732900f, 10.656367f, -1.100081f,
 1.054962f, 10.760628f, -0.969142f,
 1.089907f, 7.260916f, -1.217358f,
 0.173903f, 7.270555f, -1.140348f,
 0.173903f, 7.270555f, -1.140348f,
 0.681271f, 7.173455f, 1.084964f,
 0.681271f, 7.173455f, 1.084964f,
 -0.169402f, 7.178479f, 0.834684f,
 -0.092664f, 4.147273f, 0.247002f,
 -0.092664f, 4.147273f, 0.247002f,
 0.772455f, 4.111658f, 0.607705f,
 0.814132f, 4.501682f, -1.403236f,
 -0.066037f, 4.447590f, -1.123418f,
 -0.066037f, 4.447590f, -1.123418f,
 -0.066037f, 4.447590f, -1.123418f,
 -0.066037f, 4.447590f, -1.123418f,
 -0.092664f, 4.147273f, 0.247002f,
 -0.169402f, 7.178479f, 0.834684f,
 0.045933f, 5.829761f, -1.046577f,
 0.045933f, 5.829761f, -1.046577f,
 -0.169402f, 7.178479f, 0.834684f,
 0.173903f, 7.270555f, -1.140348f,
 1.089907f, 7.260916f, -1.217358f,
 0.173903f, 7.270555f, -1.140348f,
 0.173903f, 7.270555f, -1.140348f,
 1.497440f, 6.055972f, -0.497652f,
 1.497440f, 6.055972f, -0.497652f,
 2.753408f, 4.660926f, -0.371681f,
 2.753408f, 4.660926f, -0.371681f,
 2.753408f, 4.660926f, -0.371681f,
 3.245286f, 3.490691f, 0.705052f,
 4.072011f, 3.461587f, 1.143058f,
 3.245286f, 3.490691f, 0.705052f,
 3.245286f, 3.490691f, 0.705052f,
 4.072011f, 3.461587f, 1.143058f,
 3.587011f, 3.064834f, 1.271421f,
 4.072011f, 3.461587f, 1.143058f,
 4.072011f, 3.461587f, 1.143058f,
 3.757936f, 3.949007f, 1.699053f,
 3.757936f, 3.949007f, 1.699053f,
 3.757936f, 3.949007f, 1.699053f,
 -0.788204f, 4.667526f, -0.522967f,
 0.100491f, 6.055074f, -0.497500f,
 0.100491f, 6.055074f, -0.497500f,
 -1.113018f, 3.037371f, -0.611526f,
 -0.788204f, 4.667526f, -0.522967f,
 -0.788204f, 4.667526f, -0.522967f,
 -1.383647f, 2.303709f, -0.525487f,
 -1.908909f, 2.621916f, -0.346713f,
 -1.113018f, 3.037371f, -0.611526f,
 -1.113018f, 3.037371f, -0.611526f,
 -1.908909f, 2.621916f, -0.346713f,
 -1.908909f, 2.621916f, -0.346713f,
 -1.908909f, 2.621916f, -0.346713f,
 -1.610993f, 2.599475f, 0.399004f,
 -1.610993f, 2.599475f, 0.399004f,};

static float VertArrayB[] = new float[]{
 -0.845064f, 3.017187f, 0.059194f,
 -1.610993f, 2.599475f, 0.399004f,
 -1.115694f, 2.283525f, 0.145233f,
 0.839399f, 4.452708f, -1.380550f,
 1.706395f, 4.388514f, -1.116724f,
 1.144813f, 2.480408f, -0.248145f,
 1.144813f, 2.480408f, -0.248145f,
 1.706395f, 4.388514f, -1.116724f,
 1.827034f, 2.530913f, -0.314192f,
 1.706395f, 4.388514f, -1.116724f,
 1.666787f, 4.219381f, 0.259791f,
 1.827034f, 2.530913f, -0.314192f,
 1.827034f, 2.530913f, -0.314192f,
 1.666787f, 4.219381f, 0.259791f,
 1.911591f, 2.140544f, 0.260723f,
 1.144813f, 2.480408f, -0.248145f,
 1.827034f, 2.530913f, -0.314192f,
 1.365588f, 0.973700f, -1.444173f,
 1.365588f, 0.973700f, -1.444173f,
 1.827034f, 2.530913f, -0.314192f,
 2.341534f, 0.973701f, -1.444173f,
 1.911591f, 2.140544f, 0.260723f,
 2.341534f, 1.193713f, -0.342052f,
 1.827034f, 2.530913f, -0.314192f,
 1.827034f, 2.530913f, -0.314192f,
 2.341534f, 1.193713f, -0.342052f,
 2.341534f, 0.973701f, -1.444173f,
 2.341534f, 1.193713f, -0.342052f,
 1.365588f, 1.193712f, -0.342053f,
 2.420236f, 0.954285f, 0.295925f,
 2.420236f, 0.954285f, 0.295925f,
 1.365588f, 1.193712f, -0.342053f,
 1.286887f, 0.954284f, 0.295924f,
 1.365588f, 0.973700f, -1.444173f,
 1.286887f, 0.218974f, 0.637296f,
 1.365588f, 1.193712f, -0.342053f,
 1.365588f, 1.193712f, -0.342053f,
 1.286887f, 0.218974f, 0.637296f,
 1.286887f, 0.954284f, 0.295924f,
 1.365588f, 0.973700f, -1.444173f,
 2.341534f, 0.973701f, -1.444173f,
 1.286887f, 0.218974f, 0.637296f,
 2.341534f, 0.973701f, -1.444173f,
 2.341534f, 1.193713f, -0.342052f,
 2.420236f, 0.218976f, 0.637297f,
 2.420236f, 0.218976f, 0.637297f,
 2.341534f, 1.193713f, -0.342052f,
 2.420236f, 0.954285f, 0.295925f,
 0.839711f, 4.452691f, -1.380554f,
 0.455605f, 1.897557f, -1.846700f,
 -0.048138f, 4.435190f, -1.108745f,
 -0.048138f, 4.435190f, -1.108745f,
 0.455605f, 1.897557f, -1.846700f,
 -0.231599f, 1.896244f, -1.856028f,
 -0.231599f, 1.896244f, -1.856028f,
 -0.241110f, 1.901473f, -1.156066f,
 -0.048138f, 4.435190f, -1.108745f,
 -0.048138f, 4.435190f, -1.108745f,
 -0.241110f, 1.901473f, -1.156066f,
 -0.092664f, 4.147273f, 0.247002f,
 0.455605f, 1.897557f, -1.846700f,
 0.279767f, 0.093748f, -1.978889f,
 -0.231599f, 1.896244f, -1.856028f,
 -0.231599f, 1.896244f, -1.856028f,
 0.279767f, 0.093748f, -1.978889f,
 -0.696145f, 0.091184f, -1.986617f,
 -0.696145f, 0.091184f, -1.986617f,
 -0.705367f, 0.632323f, -1.001650f,
 -0.231599f, 1.896244f, -1.856028f,
 -0.231599f, 1.896244f, -1.856028f,
 -0.705367f, 0.632323f, -1.001650f,
 -0.241110f, 1.901473f, -1.156066f,
 -0.705367f, 0.632323f, -1.001650f,
 -0.789357f, 0.595542f, -0.321851f,
 0.270546f, 0.634886f, -0.993923f,
 0.270546f, 0.634886f, -0.993923f,
 -0.789357f, 0.595542f, -0.321851f,
 0.343952f, 0.598519f, -0.312877f,
 0.343952f, 0.598519f, -0.312877f,
 0.341197f, -0.000161f, 0.233740f,
 0.270546f, 0.634886f, -0.993923f,
 0.270546f, 0.634886f, -0.993923f,
 0.341197f, -0.000161f, 0.233740f,
 0.279767f, 0.093748f, -1.978889f,
 0.279767f, 0.093748f, -1.978889f,
 0.341197f, -0.000161f, 0.233740f,
 -0.696145f, 0.091184f, -1.986617f,
 -0.696145f, 0.091184f, -1.986617f,
 -0.792112f, -0.003138f, 0.224766f,
 -0.705367f, 0.632323f, -1.001650f,
 -0.705367f, 0.632323f, -1.001650f,
 -0.792112f, -0.003138f, 0.224766f,
 -0.789357f, 0.595542f, -0.321851f,};

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
 0.254307f, 0.942159f,
 0.294779f, 0.942745f,
 0.212156f, 0.971357f,
 0.866076f, 0.817884f,
 0.323010f, 0.761275f,
 0.284589f, 0.761755f,
 0.184288f, 0.761519f,
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
 0.521629f, 0.472552f,
 0.486458f, 0.473726f,
 0.486458f, 0.473726f,
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
 0.761869f, 0.653963f,
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
 0.090776f, 0.767704f,};

static float[] TextArrayB = new float[]{
 0.061668f, 0.803332f,
 0.090776f, 0.767704f,
 0.063216f, 0.767704f,
 0.176118f, 0.713420f,
 0.213615f, 0.713385f,
 0.194413f, 0.593584f,
 0.194413f, 0.593584f,
 0.213615f, 0.713385f,
 0.235118f, 0.593559f,
 0.213615f, 0.713385f,
 0.310668f, 0.713380f,
 0.235118f, 0.593559f,
 0.235118f, 0.593559f,
 0.310668f, 0.713380f,
 0.276453f, 0.593558f,
 0.194413f, 0.593584f,
 0.235118f, 0.593559f,
 0.203156f, 0.503563f,
 0.203156f, 0.503563f,
 0.235118f, 0.593559f,
 0.243427f, 0.503536f,
 0.276453f, 0.593558f,
 0.282801f, 0.532520f,
 0.235118f, 0.593559f,
 0.235118f, 0.593559f,
 0.282801f, 0.532520f,
 0.243427f, 0.503536f,
 0.866074f, 0.988875f,
 0.914161f, 0.988875f,
 0.862196f, 0.955301f,
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
 0.235118f, 0.593559f,
 0.276453f, 0.593558f,
 0.213615f, 0.713385f,
 0.213615f, 0.713385f,
 0.276453f, 0.593558f,
 0.310668f, 0.713380f,
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
{ -0.727811f, -0.659584f, 0.187722f},
{ -0.727811f, -0.659585f, 0.187723f},
{ -0.727811f, -0.659585f, 0.187722f},
{ -0.727811f, -0.659585f, 0.187723f},
{ -0.727811f, -0.659584f, 0.187722f},
{ -0.727811f, -0.659585f, 0.187722f},
{ -0.727811f, -0.659584f, 0.187722f},
{ -0.727811f, -0.659585f, 0.187723f},
{ -0.727811f, -0.659584f, 0.187722f},
{ -0.727811f, -0.659585f, 0.187723f},
{ -0.727810f, -0.659585f, 0.187723f},
{ -0.727810f, -0.659585f, 0.187723f},
{ -0.727811f, -0.659585f, 0.187721f},
{ -0.727810f, -0.659585f, 0.187722f},
{ -0.727811f, -0.659585f, 0.187722f},
{ -0.727810f, -0.659585f, 0.187723f},
{ -0.727811f, -0.659584f, 0.187722f},
{ -0.727811f, -0.659585f, 0.187723f},
{ -0.727811f, -0.659585f, 0.187722f},
{ -0.727811f, -0.659585f, 0.187723f},
{ -0.727811f, -0.659584f, 0.187722f},
{ -0.727811f, -0.659585f, 0.187722f},
{ -0.727811f, -0.659584f, 0.187722f},
{ -0.727811f, -0.659585f, 0.187723f},
{ -0.727811f, -0.659584f, 0.187722f},
{ -0.727811f, -0.659585f, 0.187723f},
{ -0.727810f, -0.659585f, 0.187723f},
{ -0.727810f, -0.659585f, 0.187723f},
{ -0.727811f, -0.659585f, 0.187721f},
{ -0.727810f, -0.659585f, 0.187722f},
{ -0.727811f, -0.659585f, 0.187722f},
{ -0.727810f, -0.659585f, 0.187723f},
{ 0.614318f, 0.786650f, 0.061611f},
{ 0.594446f, 0.801909f, 0.059794f},
{ 0.332405f, 0.942465f, 0.035583f},
{ 0.301539f, 0.952893f, 0.032704f},
{ 0.375216f, -0.366603f, 0.851361f},
{ 0.287602f, -0.230301f, 0.929649f},
{ 0.342110f, -0.350949f, 0.871662f},
{ 0.218918f, -0.187503f, 0.957558f},
{ 0.160578f, 0.057799f, -0.985329f},
{ 0.255629f, 0.052486f, -0.965349f},
{ 0.265240f, 0.104000f, -0.958557f},
{ 0.306385f, 0.077565f, -0.948742f},
{ 0.996349f, 0.078902f, 0.032611f},
{ 0.997445f, 0.068621f, 0.019867f},
{ 0.997614f, 0.066762f, 0.017564f},
{ 0.998089f, 0.060921f, 0.010334f},
{ 0.015471f, -0.175511f, 0.984356f},
{ 0.012197f, -0.344740f, 0.938619f},
{ -0.021611f, -0.513670f, 0.857716f},
{ -0.039907f, -0.534592f, 0.844167f},
{ 0.282942f, -0.709240f, -0.645696f},
{ 0.306039f, -0.694979f, -0.650649f},
{ 0.315223f, -0.689121f, -0.652493f},
{ 0.384020f, -0.641649f, -0.663940f},
{ 0.553331f, -0.831157f, 0.054797f},
{ 0.630181f, -0.776231f, 0.018380f},
{ 0.593216f, -0.804224f, 0.036303f},
{ 0.650787f, -0.759218f, 0.008025f},
{ -0.055835f, -0.077824f, 0.995402f},
{ -0.180206f, -0.064509f, 0.981511f},
{ -0.060142f, -0.077386f, 0.995186f},
{ -0.407536f, -0.036516f, 0.912459f},
{ 0.888009f, 0.454056f, 0.072615f},
{ 0.862609f, 0.490338f, 0.124397f},
{ 0.867154f, 0.484404f, 0.115742f},
{ 0.841909f, 0.514976f, 0.161208f},
{ 0.385157f, 0.276092f, -0.880584f},
{ 0.381240f, 0.276807f, -0.882063f},
{ 0.282988f, 0.292757f, -0.913352f},
{ 0.106870f, 0.312702f, -0.943820f},
{ 0.477434f, 0.059663f, -0.876640f},
{ 0.399722f, 0.028203f, -0.916203f},
{ 0.312951f, 0.305397f, 0.899330f},
{ 0.099569f, 0.153623f, 0.983100f},
{ -0.061592f, 0.035034f, 0.997486f},
{ -0.129314f, -0.015774f, 0.991478f},
{ 0.297439f, 0.429850f, -0.852502f},
{ 0.312242f, 0.422784f, -0.850740f},
{ 0.323547f, 0.417282f, -0.849231f},
{ 0.327733f, 0.415221f, -0.848636f},
{ 0.968289f, 0.242744f, 0.059090f},
{ 0.958130f, 0.285902f, 0.015725f},
{ 0.956101f, 0.292914f, 0.008567f},
{ 0.951821f, 0.306605f, -0.005502f},
{ 0.978312f, -0.204222f, -0.034640f},
{ 0.991253f, -0.114070f, 0.066370f},
{ 0.991638f, -0.092902f, 0.089576f},
{ 0.984480f, -0.013490f, 0.174978f},
{ 0.407178f, 0.485554f, -0.773591f},
{ 0.396700f, 0.450116f, -0.800016f},
{ 0.391435f, 0.432955f, -0.811990f},
{ 0.388375f, 0.423154f, -0.818600f},
{ 0.397680f, 0.375557f, -0.837143f},
{ 0.279350f, 0.447136f, -0.849725f},
{ 0.246995f, 0.339453f, -0.907615f},
{ 0.206168f, 0.359712f, -0.910001f},
{ -0.560885f, 0.805947f, -0.189360f},
{ -0.303245f, 0.947776f, -0.098804f},
{ -0.539439f, 0.822166f, -0.181792f},
{ -0.274005f, 0.957641f, -0.088570f},
{ -0.264223f, -0.157167f, 0.951570f},
{ -0.289505f, -0.167650f, 0.942380f},
{ -0.342984f, -0.332198f, 0.878639f},
{ -0.373276f, -0.344915f, 0.861219f},
{ -0.144376f, 0.054434f, -0.988025f},
{ -0.265240f, 0.104000f, -0.958557f},
{ -0.193920f, 0.046878f, -0.979897f},
{ -0.306385f, 0.077565f, -0.948742f},
{ -0.995416f, 0.094296f, 0.015995f},
{ -0.995992f, 0.088989f, 0.009030f},
{ -0.995876f, 0.090117f, 0.010510f},
{ -0.996726f, 0.080837f, -0.001651f},
{ -0.275339f, -0.177487f, 0.944821f},
{ -0.290847f, -0.461297f, 0.838220f},
{ -0.302754f, -0.293905f, 0.906620f},
{ -0.314425f, -0.440050f, 0.841126f},
{ -0.070694f, -0.646054f, -0.760011f},
{ -0.003778f, -0.697981f, -0.716107f},
{ -0.011538f, -0.692286f, -0.721531f},
{ 0.015602f, -0.711829f, -0.702179f},
{ -0.468088f, -0.875196f, -0.122167f},
{ -0.509457f, -0.844164f, -0.166855f},
{ -0.555635f, -0.802044f, -0.219078f},
{ -0.584224f, -0.771182f, -0.252906f},
{ -0.012107f, -0.039321f, 0.999153f},
{ -0.230597f, -0.064358f, 0.970919f},
{ -0.345766f, -0.076764f, 0.935176f},
{ -0.350213f, -0.077231f, 0.933481f},
{ -0.836572f, 0.513156f, -0.191879f},
{ -0.840449f, 0.489057f, -0.233385f},
{ -0.841115f, 0.482842f, -0.243700f},
{ -0.842604f, 0.453052f, -0.291141f},
{ -0.001208f, 0.276479f, -0.961019f},
{ 0.108752f, 0.293418f, -0.949778f},
{ 0.003762f, 0.277320f, -0.960770f},
{ 0.269501f, 0.311785f, -0.911131f},
{ -0.083932f, -0.015986f, -0.996343f},
{ -0.105098f, -0.025492f, -0.994135f},
{ -0.616554f, -0.118126f, 0.778400f},
{ -0.590074f, -0.106029f, 0.800356f},
{ -0.521652f, -0.075695f, 0.849794f},
{ -0.385415f, -0.018553f, 0.922557f},
{ -0.297345f, 0.430904f, -0.852002f},
{ -0.142617f, 0.495364f, -0.856898f},
{ -0.218074f, 0.465887f, -0.857551f},
{ -0.116964f, 0.504570f, -0.855411f},
{ -0.970370f, 0.240021f, 0.027776f},
{ -0.970258f, 0.240284f, 0.029367f},
{ -0.970114f, 0.240615f, 0.031372f},
{ -0.969920f, 0.241043f, 0.033977f},
{ -0.991534f, -0.128019f, -0.021715f},
{ -0.995684f, -0.049194f, -0.078701f},
{ -0.994724f, -0.017922f, -0.101011f},
{ -0.982941f, 0.076415f, -0.167295f},
{ -0.060250f, 0.606745f, -0.792610f},
{ -0.134013f, 0.554720f, -0.821174f},
{ -0.144307f, 0.546992f, -0.824606f},
{ -0.157939f, 0.536578f, -0.828938f},
{ -0.136823f, 0.405466f, -0.903812f},
{ -0.269502f, 0.267619f, -0.925067f},
{ -0.226311f, 0.325843f, -0.917938f},
{ -0.262527f, 0.277225f, -0.924244f},
{ 0.205467f, 0.266712f, -0.941620f},
{ 0.174232f, 0.298878f, -0.938251f},
{ -0.256146f, 0.274279f, -0.926909f},
{ -0.215136f, 0.318371f, -0.923232f},
{ 0.552036f, -0.447115f, 0.703807f},
{ 0.552036f, -0.447116f, 0.703807f},
{ 0.552036f, -0.447116f, 0.703807f},
{ 0.552035f, -0.447116f, 0.703807f},
{ -0.662645f, -0.745396f, -0.072704f},
{ -0.675435f, -0.736880f, -0.028215f},
{ -0.819383f, -0.564379f, 0.100442f},
{ -0.868870f, -0.469586f, 0.156695f},
{ 0.052012f, 0.022844f, -0.998385f},
{ 0.069988f, -0.313607f, -0.946970f},
{ 0.045227f, 0.013937f, -0.998880f},
{ 0.102877f, -0.417808f, -0.902692f},
{ 0.761812f, 0.645452f, 0.055083f},
{ 0.814243f, 0.570051f, -0.109779f},
{ 0.767638f, 0.640340f, 0.026394f},
{ 0.833493f, 0.530038f, -0.156041f},
{ 0.161398f, -0.178629f, 0.970589f},
{ 0.160114f, -0.181058f, 0.970351f},
{ -0.160479f, 0.012800f, 0.986956f},
{ -0.330902f, 0.200229f, 0.922178f},
{ -0.907166f, -0.406305f, -0.109389f},
{ -0.897810f, -0.416999f, -0.141595f},
{ 0.276831f, -0.585033f, -0.762300f},
{ 0.276831f, -0.585033f, -0.762300f},
{ 0.855378f, 0.517755f, -0.016086f},
{ 0.849857f, 0.526694f, 0.018341f},
{ -0.492099f, 0.575030f, 0.653590f},
{ -0.476545f, 0.590557f, 0.651266f},
{ -0.811459f, -0.582098f, 0.051920f},
{ -0.811460f, -0.582098f, 0.051920f},
{ -0.811460f, -0.582098f, 0.051920f},
{ -0.811460f, -0.582097f, 0.051920f},
{ 0.341845f, -0.640397f, -0.687775f},
{ 0.341845f, -0.640397f, -0.687774f},
{ 0.341845f, -0.640397f, -0.687774f},
{ 0.341845f, -0.640397f, -0.687774f},
{ 0.811457f, 0.582101f, -0.051923f},
{ 0.811457f, 0.582101f, -0.051923f},
{ 0.811457f, 0.582101f, -0.051923f},
{ 0.811457f, 0.582101f, -0.051924f},
{ -0.445290f, 0.565716f, 0.694034f},
{ -0.445290f, 0.565715f, 0.694034f},
{ -0.445290f, 0.565714f, 0.694034f},
{ -0.445291f, 0.565713f, 0.694035f},
{ -0.470437f, -0.867467f, 0.161836f},
{ -0.470437f, -0.867467f, 0.161835f},
{ -0.470437f, -0.867467f, 0.161835f},
{ -0.470436f, -0.867467f, 0.161834f},
{ 0.838520f, -0.542352f, -0.052335f},
{ 0.922764f, -0.379297f, -0.068124f},
{ 0.838823f, -0.542048f, -0.050603f},
{ 0.949540f, -0.281167f, -0.138991f},
{ -0.248014f, 0.129950f, -0.960001f},
{ -0.221241f, 0.117024f, -0.968172f},
{ -0.091172f, 0.026899f, -0.995472f},
{ -0.083789f, 0.019584f, -0.996291f},
{ -0.920021f, 0.368464f, 0.133399f},
{ -0.910023f, 0.409431f, 0.065003f},
{ -0.873626f, 0.484843f, 0.041291f},
{ -0.873677f, 0.484781f, 0.040947f},
{ -0.192181f, -0.179338f, 0.964834f},
{ 0.218439f, -0.242969f, 0.945119f},
{ -0.175928f, -0.196822f, 0.964526f},
{ 0.368902f, -0.146907f, 0.917785f},
{ 0.925959f, -0.153594f, -0.344977f},
{ 0.914659f, -0.162133f, -0.370287f},
{ -0.263104f, 0.104527f, -0.959088f},
{ -0.263104f, 0.104527f, -0.959088f},
{ -0.876127f, 0.320991f, 0.359674f},
{ -0.891571f, 0.309498f, 0.330624f},
{ 0.486312f, 0.059118f, 0.871783f},
{ 0.485133f, 0.059818f, 0.872392f},
{ 0.862632f, -0.359888f, -0.355453f},
{ 0.862632f, -0.359888f, -0.355453f},
{ 0.862632f, -0.359888f, -0.355453f},
{ 0.862632f, -0.359888f, -0.355453f},
{ -0.318712f, 0.006410f, -0.947830f},
{ -0.318712f, 0.006410f, -0.947830f},
{ -0.318712f, 0.006410f, -0.947830f},
{ -0.318712f, 0.006410f, -0.947830f},
{ -0.862630f, 0.359893f, 0.355452f},
{ -0.862630f, 0.359892f, 0.355453f},
{ -0.862630f, 0.359892f, 0.355452f},
{ -0.862630f, 0.359892f, 0.355453f},
{ 0.428704f, -0.052365f, 0.901926f},
{ 0.428705f, -0.052366f, 0.901926f},
{ 0.428704f, -0.052366f, 0.901926f},
{ 0.428705f, -0.052367f, 0.901926f},
{ -0.000001f, 0.421089f, 0.907019f},
{ -0.000001f, 0.421089f, 0.907019f},
{ -0.000001f, 0.421089f, 0.907019f},
{ -0.000001f, 0.421089f, 0.907019f},
{ 0.366875f, -0.046139f, 0.929125f},
{ 0.186404f, -0.007389f, 0.982446f},
{ 0.326571f, -0.037378f, 0.944433f},
{ 0.095496f, 0.011692f, 0.995361f},
{ -0.979706f, -0.189391f, -0.065630f},
{ -0.978625f, -0.201167f, -0.042715f},
{ -0.979514f, -0.192122f, -0.060341f},
{ -0.975521f, -0.219831f, -0.005789f},
{ 0.227555f, -0.458117f, -0.859271f},
{ 0.190804f, -0.452654f, -0.871033f},
{ 0.033888f, -0.422307f, -0.905819f},
{ -0.059033f, -0.399134f, -0.914990f},
{ 0.995933f, 0.081380f, 0.038657f},
{ 0.995986f, 0.085186f, 0.027477f},
{ 0.994677f, 0.101126f, -0.019780f},
{ 0.990941f, 0.116664f, -0.066530f},
{ 0.120935f, -0.581779f, 0.804306f},
{ 0.032274f, -0.549929f, 0.834588f},
{ 0.059140f, -0.560137f, 0.826286f},
{ 0.000000f, -0.537031f, 0.843562f},
{ -0.984840f, -0.171076f, 0.028687f},
{ -0.984722f, -0.171261f, 0.031500f},
{ -0.984637f, -0.171386f, 0.033417f},
{ -0.984600f, -0.171438f, 0.034224f},
{ -0.120976f, 0.606230f, -0.786035f},
{ -0.079269f, 0.600742f, -0.795503f},
{ -0.018968f, 0.590879f, -0.806537f},
{ -0.000000f, 0.587309f, -0.809363f},
{ 0.928911f, 0.355228f, 0.104580f},
{ 0.931864f, 0.359554f, -0.048491f},
{ 0.933318f, 0.358856f, 0.011842f},
{ 0.930393f, 0.359472f, -0.071760f},
{ -0.000001f, 0.936239f, 0.351363f},
{ -0.000001f, 0.936239f, 0.351364f},
{ -0.000001f, 0.936239f, 0.351363f},
{ -0.000001f, 0.936239f, 0.351364f},
{ -0.997657f, 0.067094f, -0.013394f},
{ -0.998382f, 0.040155f, -0.040264f},
{ -0.998008f, 0.059489f, -0.020991f},
{ -0.986706f, -0.068432f, -0.147402f},
{ 0.000000f, -0.940108f, -0.340877f},
{ 0.000001f, -0.940108f, -0.340876f},
{ 0.000001f, -0.940108f, -0.340876f},
{ 0.000001f, -0.940108f, -0.340876f},
{ 0.997657f, 0.067095f, -0.013394f},
{ 0.998008f, 0.059490f, -0.020991f},
{ 0.998382f, 0.040156f, -0.040264f},
{ 0.986706f, -0.068433f, -0.147403f},
{ -0.007618f, 0.674266f, 0.738449f},
{ -0.007618f, 0.674267f, 0.738449f},
{ -0.007618f, 0.674267f, 0.738449f},
{ -0.007618f, 0.674266f, 0.738449f},
{ -0.010504f, -0.529319f, 0.848358f},
{ -0.095009f, -0.541503f, 0.835313f},
{ -0.306453f, -0.554154f, 0.773951f},
{ -0.339780f, -0.553659f, 0.760271f},
{ 0.988369f, -0.151893f, 0.007380f},
{ 0.988384f, -0.151624f, 0.010344f},
{ 0.988372f, -0.151849f, 0.007873f},
{ 0.988390f, -0.151238f, 0.014560f},
{ -0.289817f, 0.213762f, -0.932905f},
{ -0.064228f, 0.266884f, -0.961586f},
{ -0.252759f, 0.223572f, -0.941344f},
{ 0.012487f, 0.281499f, -0.959480f},
{ -0.996993f, 0.076196f, -0.014116f},
{ -0.996978f, 0.076213f, -0.015082f},
{ -0.996956f, 0.076235f, -0.016331f},
{ -0.996952f, 0.076239f, -0.016551f},
{ -0.008182f, 0.123723f, 0.992283f},
{ -0.009476f, 0.123207f, 0.992336f},
{ -0.011134f, 0.122545f, 0.992400f},
{ -0.013705f, 0.121519f, 0.992495f},
{ 0.990682f, -0.135421f, 0.014473f},
{ 0.992638f, -0.106387f, 0.057887f},
{ 0.992272f, -0.116404f, 0.042976f},
{ 0.992701f, -0.101539f, 0.065079f},
{ 0.013401f, 0.071782f, -0.997330f},
{ 0.008670f, 0.070450f, -0.997478f},
{ 0.011320f, 0.071196f, -0.997398f},
{ 0.007714f, 0.070180f, -0.997505f},
{ -0.954829f, 0.256577f, -0.149902f},
{ -0.954181f, 0.268820f, -0.131433f},
{ -0.950953f, 0.296227f, -0.089098f},
{ -0.939629f, 0.341853f, -0.015322f},
{ -0.003047f, 0.998555f, 0.053651f},
{ -0.003048f, 0.998555f, 0.053651f},
{ -0.003048f, 0.998555f, 0.053651f},
{ -0.003048f, 0.998555f, 0.053651f},
{ 0.987910f, -0.106984f, -0.112195f},
{ 0.998678f, 0.028818f, -0.042566f},
{ 0.998141f, 0.053050f, -0.030001f},
{ 0.997725f, 0.062586f, -0.025044f},
{ 0.002961f, -0.999093f, -0.042486f},
{ 0.002961f, -0.999093f, -0.042486f},
{ 0.002961f, -0.999093f, -0.042486f},
{ 0.002961f, -0.999093f, -0.042485f},
{ -0.997519f, 0.057343f, -0.040843f},
{ -0.998016f, 0.023571f, -0.058377f},
{ -0.997806f, 0.047806f, -0.045806f},
{ -0.985434f, -0.112171f, -0.127821f}};

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
29, 20, 28,
28, 20, 21,
23, 21, 22,
22, 21, 20,
31, 18, 30,
30, 18, 16,
16, 18, 24,
24, 18, 25,
17, 26, 19,
19, 26, 27,
18, 19, 25,
25, 19, 27,
29, 28, 19,
19, 28, 17,
31, 30, 22,
22, 30, 23,
44, 45, 47,
47, 45, 46,
36, 51, 37,
37, 51, 48,
49, 50, 38,
38, 50, 39,
39, 50, 36,
36, 50, 51,
41, 40, 32,
32, 40, 33,
35, 43, 34,
34, 43, 42,
141, 142, 143,
144, 145, 146,
33, 147, 32,
32, 148, 149,
150, 46, 151,
152, 46, 45,
35, 34, 153,
154, 34, 155,
156, 50, 157,
158, 50, 49,
51, 159, 48,
48, 160, 161,
162, 163, 52,
52, 164, 53,
165, 166, 54,
54, 167, 55,
168, 169, 170,
171, 172, 52,
50, 173, 51,
51, 174, 175,
176, 57, 177,
178, 57, 56,
56, 57, 75,
75, 57, 74,
44, 47, 60,
60, 47, 61,
48, 63, 37,
37, 63, 62,
49, 38, 64,
64, 38, 65,
63, 179, 62,
62, 180, 181,
41, 32, 66,
66, 32, 67,
42, 69, 34,
34, 69, 68,
182, 183, 184,
185, 186, 187,
188, 189, 32,
32, 190, 67,
60, 61, 191,
192, 61, 193,
68, 194, 34,
34, 195, 196,
197, 49, 198,
199, 49, 64,
48, 200, 63,
63, 201, 202,
70, 53, 203,
204, 53, 205,
206, 54, 207,
208, 54, 71,
71, 70, 209,
210, 70, 211,
63, 212, 213,
214, 215, 216,
217, 56, 218,
219, 56, 72,
56, 75, 72,
72, 75, 76,
75, 74, 58,
58, 74, 59,
75, 58, 76,
76, 58, 73,
85, 87, 86,
86, 87, 88,
89, 90, 78,
78, 90, 77,
91, 79, 220,
221, 79, 222,
92, 80, 91,
91, 80, 79,
92, 89, 80,
80, 89, 78,
77, 81, 78,
78, 81, 82,
79, 83, 223,
224, 83, 225,
79, 80, 83,
83, 80, 84,
80, 78, 84,
84, 78, 82,
82, 81, 86,
86, 81, 85,
83, 226, 227,
228, 229, 230,
83, 84, 231,
232, 84, 233,
84, 82, 234,
235, 82, 86,
104, 103, 102,
102, 103, 101,
105, 94, 106,
106, 94, 93,
236, 95, 237,
238, 95, 107,
95, 96, 107,
107, 96, 108,
108, 96, 105,
105, 96, 94,
94, 98, 93,
93, 98, 97,
239, 99, 240,
241, 99, 95,
99, 100, 95,
95, 100, 96,
96, 100, 94,
94, 100, 98,
98, 102, 97,
97, 102, 101,
242, 243, 244,
245, 246, 99,
99, 247, 100,
100, 248, 249,
100, 250, 98,
109, 110, 112,
112, 110, 111,
122, 113, 121,
121, 113, 114,
123, 115, 122,
122, 115, 113,
113, 117, 114,
114, 117, 118,
113, 115, 117,
117, 115, 119,
111, 120, 112,
125, 128, 126,
126, 128, 127,
130, 129, 137,
137, 129, 138,
138, 129, 139,
139, 129, 131,
134, 133, 130,
130, 133, 129,
129, 133, 131,
131, 133, 135,
136, 127, 128,};

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


//Vertices: 344  Texture Co-ords: 215  Normals: 360  Texture: walk Faces: 212 Smooth Groups: 92 sucess: 116 Doubles: 96 Redos needed: 110 Correct: 85