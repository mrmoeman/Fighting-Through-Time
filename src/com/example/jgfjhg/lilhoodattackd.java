package com.example.jgfjhg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;
import android.graphics.Bitmap;
import android.opengl.GLUtils;

class lilhoodattackd {

static String TextureName = "attack";

static int Vertices = 314;

static int VertTexts = 199;

static int Normals = 344;

static int Faces = 196;

static int FacesB = 21;

static int SmoothGroups = 91;

static float VertArray[] = new float[]{
 1.134513f, 1.359526f, 4.436326f,
 -0.395594f, 10.358315f, 4.520680f,
 0.840004f, 1.835430f, 3.953048f,
 -0.517771f, 9.820710f, 4.027901f,
 0.325099f, 6.323190f, 4.561822f,
 0.748526f, 6.385890f, 5.553665f,
 0.477185f, 5.428751f, 4.553438f,
 0.900611f, 5.491451f, 5.545281f,
 0.835239f, 0.773277f, 3.519799f,
 0.617432f, 2.037683f, 3.525225f,
 -0.874636f, 10.829314f, 3.614064f,
 -0.662320f, 9.564096f, 3.595774f,
 0.319480f, 7.875549f, 5.166296f,
 0.009023f, 7.634760f, 4.361602f,
 0.988324f, 3.941979f, 5.129423f,
 0.613242f, 4.081256f, 4.328292f,
 1.076997f, 7.841406f, 1.353736f,
 3.123350f, 7.663096f, 1.249864f,
 1.401850f, 7.649323f, -2.013573f,
 2.983157f, 7.539810f, -1.515328f,
 1.356958f, 4.110906f, 0.824048f,
 0.552945f, 4.103752f, 0.483013f,
 1.940802f, 4.103484f, -1.012963f,
 2.387085f, 4.072248f, -0.211077f,
 1.488502f, 7.082453f, 0.990382f,
 0.768479f, 7.124276f, 0.761924f,
 1.275336f, 6.975421f, -1.292996f,
 2.125503f, 6.950021f, -0.944202f,
 1.391425f, 10.946129f, 1.193266f,
 1.666047f, 10.693359f, 1.301705f,
 1.908219f, 10.337083f, -1.381650f,
 1.611201f, 10.467339f, -1.360255f,
 0.131159f, 5.444960f, 0.353971f,
 1.982391f, 5.531852f, -0.849151f,
 2.357012f, 5.538884f, -0.166978f,
 0.603237f, 5.460860f, 0.959658f,
 1.582779f, 1.814690f, 1.872759f,
 0.291666f, 1.395397f, 1.078388f,
 2.422458f, 1.999861f, -2.034006f,
 2.868242f, 1.569671f, -0.240724f,
 2.302520f, 6.414219f, -1.759471f,
 3.016236f, 6.054254f, 0.533770f,
 2.747344f, 0.691321f, -3.226689f,
 3.895844f, 0.747718f, 3.075835f,
 1.030669f, 10.744010f, 1.237519f,
 1.267612f, 10.388150f, -1.446364f,
 0.216897f, 4.099997f, -0.432376f,
 0.034383f, 5.429291f, -0.407226f,
 1.411110f, 5.538885f, -1.377677f,
 1.126242f, 4.139394f, -1.397825f,
 0.150960f, 7.158782f, 0.323773f,
 -0.910006f, 7.984625f, 0.842414f,
 -0.244138f, 7.797083f, -1.841350f,
 0.379562f, 7.089203f, -1.120577f,
 -0.356346f, 1.487609f, -0.669202f,
 1.043319f, 2.033170f, -2.667356f,
 -0.491947f, 6.426754f, -1.638253f,
 -0.807953f, 0.744882f, -3.525094f,
 3.621006f, 3.634015f, 1.451730f,
 2.289232f, 3.582159f, -2.739950f,
 -0.678188f, 3.611462f, -2.868353f,
 0.767312f, 5.609388f, 2.773115f,
 0.705390f, 5.992404f, 2.767225f,
 1.120136f, 5.676115f, 2.716768f,
 1.029492f, 6.120099f, 2.714324f,
 0.483809f, 5.380522f, 4.397306f,
 0.307079f, 6.081117f, 4.395279f,
 1.104687f, 5.497945f, 4.298150f,
 0.908196f, 6.276876f, 4.295897f,
 0.486599f, 5.383502f, 5.184000f,
 0.309869f, 6.084097f, 5.181973f,
 1.107481f, 5.500925f, 5.084843f,
 0.910989f, 6.279859f, 5.082590f,
 1.141680f, 5.901232f, 0.671070f,
 1.514318f, 5.712940f, 0.196369f,
 1.750438f, 6.253748f, 0.101141f,
 1.419268f, 6.638408f, 0.687866f,
 -1.681443f, 6.230159f, -0.320059f,
 -1.380782f, 6.232054f, -0.145520f,
 -1.757783f, 6.577805f, -0.393727f,
 -1.280516f, 6.577599f, -0.092639f,
 -1.755372f, 5.966959f, 1.321895f,
 -1.041229f, 6.075052f, 1.302233f,
 -1.889712f, 6.578725f, 1.192258f,
 -1.095717f, 6.698904f, 1.170398f,
 -1.740644f, 6.012487f, 2.107142f,
 -1.026500f, 6.120581f, 2.087481f,
 -1.874985f, 6.624257f, 1.977504f,
 -1.080988f, 6.744437f, 1.955644f,
 0.306049f, 5.846361f, -0.445074f,
 1.006163f, 5.877693f, -1.039841f,
 1.199530f, 6.690553f, -1.042901f,
 0.262915f, 6.678904f, -0.431352f,
 2.223930f, 0.610014f, 1.896774f,
 1.090856f, 0.610012f, 1.921705f,
 1.103502f, 0.038443f, 2.496477f,
 2.236577f, 0.038444f, 2.471546f,
 0.932210f, 1.889189f, 0.736691f,
 1.521410f, 1.853851f, 1.088732f,
 1.290758f, 1.878513f, 0.135530f,
 1.879958f, 1.843176f, 0.487571f,
 1.154548f, 0.613665f, 1.238723f,
 2.130258f, 0.613666f, 1.217255f,
 1.133481f, 0.025562f, 0.281244f,
 2.109191f, 0.025562f, 0.259776f,
 1.356762f, 4.110909f, 0.823822f,
 0.552722f, 4.103749f, 0.482800f,
 1.940578f, 4.103502f, -1.013173f,
 2.386858f, 4.072254f, -0.211289f,
 -0.300037f, 0.610014f, -0.873937f,
 0.661097f, 0.610013f, -0.273354f,
 0.356442f, 0.038442f, 0.214197f,
 -0.604693f, 0.038443f, -0.386386f,
 0.935352f, 1.649974f, -0.505650f,
 0.373419f, 1.676927f, -0.900420f,
 1.328004f, 1.845543f, -1.051215f,
 0.766072f, 1.872496f, -1.445986f,
 0.955451f, 0.613667f, -0.892932f,
 0.127801f, 0.613668f, -1.410105f,
 1.462961f, 0.025566f, -1.705117f,
 0.635311f, 0.025566f, -2.222291f,
 0.216897f, 4.099997f, -0.432376f,
 0.552945f, 4.103752f, 0.483013f,
 1.940802f, 4.103484f, -1.012963f,
 1.126242f, 4.139394f, -1.397825f,
 1.488502f, 7.082453f, 0.990382f,
 2.125503f, 6.950021f, -0.944202f,
 3.123350f, 7.663096f, 1.249864f,
 3.123350f, 7.663096f, 1.249864f,
 2.125503f, 6.950021f, -0.944202f,
 2.983157f, 7.539810f, -1.515328f,
 1.666047f, 10.693359f, 1.301705f,
 1.666047f, 10.693359f, 1.301705f,
 1.391425f, 10.946129f, 1.193266f,
 2.983157f, 7.539810f, -1.515328f,
 3.123350f, 7.663096f, 1.249864f,
 3.123350f, 7.663096f, 1.249864f,
 1.908219f, 10.337083f, -1.381650f,
 1.908219f, 10.337083f, -1.381650f,
 1.611201f, 10.467339f, -1.360255f,
 1.275336f, 6.975421f, -1.292996f,
 2.125503f, 6.950021f, -0.944202f,
 2.125503f, 6.950021f, -0.944202f,
 0.768479f, 7.124276f, 0.761924f,
 0.768479f, 7.124276f, 0.761924f,
 1.488502f, 7.082453f, 0.990382f,
 1.356958f, 4.110906f, 0.824048f,
 0.552945f, 4.103752f, 0.483013f,
 0.552945f, 4.103752f, 0.483013f,
 1.940802f, 4.103484f, -1.012963f,
 2.387085f, 4.072248f, -0.211077f,
 2.387085f, 4.072248f, -0.211077f,
 2.387085f, 4.072248f, -0.211077f,
 1.356958f, 4.110906f, 0.824048f,
 2.868242f, 1.569671f, -0.240724f,
 2.868242f, 1.569671f, -0.240724f,
 1.356958f, 4.110906f, 0.824048f,
 1.488502f, 7.082453f, 0.990382f,
 1.488502f, 7.082453f, 0.990382f,
 2.125503f, 6.950021f, -0.944202f,
 1.275336f, 6.975421f, -1.292996f,
 2.125503f, 6.950021f, -0.944202f,
 2.125503f, 6.950021f, -0.944202f,
 1.126242f, 4.139394f, -1.397825f,
 1.126242f, 4.139394f, -1.397825f,
 1.411110f, 5.538885f, -1.377677f,
 -0.910006f, 7.984625f, 0.842414f,
 -0.244138f, 7.797083f, -1.841350f,
 0.150960f, 7.158782f, 0.323773f,
 0.150960f, 7.158782f, 0.323773f,
 -0.244138f, 7.797083f, -1.841350f,
 0.379562f, 7.089203f, -1.120577f,
 1.391425f, 10.946129f, 1.193266f,
 1.030669f, 10.744010f, 1.237519f,
 1.030669f, 10.744010f, 1.237519f,
 -0.910006f, 7.984625f, 0.842414f,
 -0.910006f, 7.984625f, 0.842414f,
 -0.244138f, 7.797083f, -1.841350f,
 1.267612f, 10.388150f, -1.446364f,
 1.267612f, 10.388150f, -1.446364f,
 1.611201f, 10.467339f, -1.360255f,
 1.275336f, 6.975421f, -1.292996f,
 1.275336f, 6.975421f, -1.292996f,
 0.379562f, 7.089203f, -1.120577f,
 0.768479f, 7.124276f, 0.761924f,
 0.150960f, 7.158782f, 0.323773f,
 0.150960f, 7.158782f, 0.323773f,
 0.216897f, 4.099997f, -0.432376f,
 0.552945f, 4.103752f, 0.483013f,
 0.552945f, 4.103752f, 0.483013f,
 1.940802f, 4.103484f, -1.012963f,
 1.126242f, 4.139394f, -1.397825f,
 1.126242f, 4.139394f, -1.397825f,
 1.126242f, 4.139394f, -1.397825f,
 1.126242f, 4.139394f, -1.397825f,
 0.216897f, 4.099997f, -0.432376f,
 0.150960f, 7.158782f, 0.323773f,
 0.379562f, 7.089203f, -1.120577f,
 0.379562f, 7.089203f, -1.120577f,
 1.411110f, 5.538885f, -1.377677f,
 1.275336f, 6.975421f, -1.292996f,
 1.275336f, 6.975421f, -1.292996f,
 0.379562f, 7.089203f, -1.120577f,
 1.514318f, 5.712940f, 0.196369f,
 1.514318f, 5.712940f, 0.196369f,
 0.767312f, 5.609388f, 2.773115f,
 0.767312f, 5.609388f, 2.773115f,
 0.767312f, 5.609388f, 2.773115f,
 0.483809f, 5.380522f, 4.397306f,
 1.107481f, 5.500925f, 5.084843f,
 0.483809f, 5.380522f, 4.397306f,
 0.483809f, 5.380522f, 4.397306f,
 1.107481f, 5.500925f, 5.084843f,
 0.486599f, 5.383502f, 5.184000f,
 1.107481f, 5.500925f, 5.084843f,
 1.107481f, 5.500925f, 5.084843f,
 0.910989f, 6.279859f, 5.082590f,
 0.910989f, 6.279859f, 5.082590f,
 0.910989f, 6.279859f, 5.082590f,
 -1.681443f, 6.230159f, -0.320059f,
 1.006163f, 5.877693f, -1.039841f,
 1.006163f, 5.877693f, -1.039841f,
 -1.755372f, 5.966959f, 1.321895f,
 -1.681443f, 6.230159f, -0.320059f,
 -1.681443f, 6.230159f, -0.320059f,
 -1.740644f, 6.012487f, 2.107142f,
 -1.874985f, 6.624257f, 1.977504f,
 -1.755372f, 5.966959f, 1.321895f,
 -1.755372f, 5.966959f, 1.321895f,
 -1.874985f, 6.624257f, 1.977504f,
 -1.874985f, 6.624257f, 1.977504f,
 -1.874985f, 6.624257f, 1.977504f,
 -1.080988f, 6.744437f, 1.955644f,
 -1.080988f, 6.744437f, 1.955644f,
 -1.080988f, 6.744437f, 1.955644f,
 1.940578f, 4.103502f, -1.013173f,
 1.290758f, 1.878513f, 0.135530f,
 1.290758f, 1.878513f, 0.135530f,
 1.356762f, 4.110909f, 0.823822f,
 1.356762f, 4.110909f, 0.823822f,
 1.521410f, 1.853851f, 1.088732f,
 1.290758f, 1.878513f, 0.135530f,
 1.133481f, 0.025562f, 0.281244f,
 1.133481f, 0.025562f, 0.281244f,
 2.109191f, 0.025562f, 0.259776f,
 1.521410f, 1.853851f, 1.088732f,
 2.130258f, 0.613666f, 1.217255f,
 2.130258f, 0.613666f, 1.217255f,
 2.109191f, 0.025562f, 0.259776f,
 2.130258f, 0.613666f, 1.217255f,
 1.154548f, 0.613665f, 1.238723f,};

static float VertArrayB[] = new float[]{
 2.223930f, 0.610014f, 1.896774f,
 1.154548f, 0.613665f, 1.238723f,
 1.090856f, 0.610012f, 1.921705f,
 1.133481f, 0.025562f, 0.281244f,
 1.103502f, 0.038443f, 2.496477f,
 1.154548f, 0.613665f, 1.238723f,
 1.154548f, 0.613665f, 1.238723f,
 1.103502f, 0.038443f, 2.496477f,
 1.090856f, 0.610012f, 1.921705f,
 1.133481f, 0.025562f, 0.281244f,
 2.109191f, 0.025562f, 0.259776f,
 1.103502f, 0.038443f, 2.496477f,
 2.109191f, 0.025562f, 0.259776f,
 2.130258f, 0.613666f, 1.217255f,
 2.236577f, 0.038444f, 2.471546f,
 2.236577f, 0.038444f, 2.471546f,
 2.130258f, 0.613666f, 1.217255f,
 2.223930f, 0.610014f, 1.896774f,
 1.940802f, 4.103484f, -1.012963f,
 1.328004f, 1.845543f, -1.051215f,
 1.126242f, 4.139394f, -1.397825f,
 1.126242f, 4.139394f, -1.397825f,
 1.328004f, 1.845543f, -1.051215f,
 0.766072f, 1.872496f, -1.445986f,
 1.126242f, 4.139394f, -1.397825f,
 0.766072f, 1.872496f, -1.445986f,
 0.216897f, 4.099997f, -0.432376f,
 0.216897f, 4.099997f, -0.432376f,
 0.766072f, 1.872496f, -1.445986f,
 0.373419f, 1.676927f, -0.900420f,
 1.328004f, 1.845543f, -1.051215f,
 1.462961f, 0.025566f, -1.705117f,
 0.766072f, 1.872496f, -1.445986f,
 0.766072f, 1.872496f, -1.445986f,
 1.462961f, 0.025566f, -1.705117f,
 0.635311f, 0.025566f, -2.222291f,
 0.635311f, 0.025566f, -2.222291f,
 0.127801f, 0.613668f, -1.410105f,
 0.766072f, 1.872496f, -1.445986f,
 0.766072f, 1.872496f, -1.445986f,
 0.127801f, 0.613668f, -1.410105f,
 0.373419f, 1.676927f, -0.900420f,
 0.127801f, 0.613668f, -1.410105f,
 -0.300037f, 0.610014f, -0.873937f,
 0.955451f, 0.613667f, -0.892932f,
 0.955451f, 0.613667f, -0.892932f,
 -0.300037f, 0.610014f, -0.873937f,
 0.661097f, 0.610013f, -0.273354f,
 0.661097f, 0.610013f, -0.273354f,
 0.356442f, 0.038442f, 0.214197f,
 0.955451f, 0.613667f, -0.892932f,
 0.955451f, 0.613667f, -0.892932f,
 0.356442f, 0.038442f, 0.214197f,
 1.462961f, 0.025566f, -1.705117f,
 1.462961f, 0.025566f, -1.705117f,
 0.356442f, 0.038442f, 0.214197f,
 0.635311f, 0.025566f, -2.222291f,
 0.635311f, 0.025566f, -2.222291f,
 -0.604693f, 0.038443f, -0.386386f,
 0.127801f, 0.613668f, -1.410105f,
 0.127801f, 0.613668f, -1.410105f,
 -0.604693f, 0.038443f, -0.386386f,
 -0.300037f, 0.610014f, -0.873937f,};

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
 0.713420f, 0.251201f,
 0.646986f, 0.253990f,
 0.646986f, 0.253990f,
 0.421917f, 0.253517f,
 0.421917f, 0.253517f,
 0.488118f, 0.253991f,
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
 0.488118f, 0.253991f,
 0.488118f, 0.253991f,
 0.646986f, 0.253990f,
 0.486458f, 0.473726f,
 0.521629f, 0.472552f,
 0.521629f, 0.472552f,
 0.196441f, 0.009203f,
 0.196441f, 0.009203f,
 0.202748f, 0.118745f,
 0.797056f, 0.429455f,
 0.994106f, 0.429455f,
 0.830235f, 0.468993f,
 0.830235f, 0.468993f,
 0.994106f, 0.429455f,
 0.950447f, 0.468993f,
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
 0.713420f, 0.251201f,
 0.783665f, 0.253088f,
 0.421917f, 0.253517f,
 0.355716f, 0.253071f,
 0.355716f, 0.253071f,
 0.681239f, 0.772821f,
 0.626105f, 0.796095f,
 0.626105f, 0.796095f,
 0.763113f, 0.594129f,
 0.761869f, 0.653963f,
 0.761869f, 0.653963f,
 0.761869f, 0.653963f,
 0.761869f, 0.653963f,
 0.681239f, 0.772821f,
 0.355716f, 0.253071f,
 0.193085f, 0.250798f,
 0.193085f, 0.250798f,
 0.202748f, 0.118745f,
 0.486458f, 0.473726f,
 0.486458f, 0.473726f,
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
{ -0.904581f, -0.157523f, 0.396131f},
{ -0.904581f, -0.157523f, 0.396131f},
{ -0.904581f, -0.157523f, 0.396131f},
{ -0.904581f, -0.157523f, 0.396131f},
{ -0.904581f, -0.157523f, 0.396131f},
{ -0.904581f, -0.157523f, 0.396131f},
{ -0.904581f, -0.157523f, 0.396131f},
{ -0.904581f, -0.157523f, 0.396131f},
{ -0.904581f, -0.157523f, 0.396131f},
{ -0.904581f, -0.157524f, 0.396131f},
{ -0.904581f, -0.157523f, 0.396132f},
{ -0.904581f, -0.157523f, 0.396132f},
{ -0.904581f, -0.157524f, 0.396131f},
{ -0.904581f, -0.157524f, 0.396131f},
{ -0.904581f, -0.157524f, 0.396131f},
{ -0.904581f, -0.157523f, 0.396132f},
{ 0.691232f, 0.718702f, -0.075265f},
{ 0.672870f, 0.735811f, -0.076339f},
{ 0.424775f, 0.901274f, -0.085277f},
{ 0.394950f, 0.914687f, -0.085802f},
{ -0.370824f, -0.295487f, 0.880441f},
{ -0.690115f, -0.019022f, 0.723450f},
{ -0.482140f, -0.274358f, 0.832027f},
{ -0.788502f, -0.012726f, 0.614900f},
{ 0.876285f, -0.029003f, -0.480920f},
{ 0.874479f, 0.030841f, -0.484083f},
{ 0.817300f, -0.050368f, -0.574007f},
{ 0.873892f, 0.030199f, -0.485181f},
{ 0.708675f, -0.006681f, 0.705503f},
{ 0.610095f, 0.116625f, 0.783698f},
{ 0.589293f, 0.139573f, 0.795772f},
{ 0.522044f, 0.208390f, 0.827070f},
{ -0.399487f, -0.009486f, 0.916690f},
{ -0.133805f, -0.293383f, 0.946585f},
{ -0.063572f, -0.458779f, 0.886274f},
{ 0.008578f, -0.428017f, 0.903730f},
{ 0.136364f, -0.784325f, -0.605177f},
{ 0.160023f, -0.773058f, -0.613819f},
{ 0.169463f, -0.768381f, -0.617149f},
{ 0.240800f, -0.729608f, -0.640069f},
{ 0.306707f, -0.937366f, 0.165156f},
{ 0.479254f, -0.875156f, 0.066465f},
{ 0.385876f, -0.914486f, 0.121715f},
{ 0.570098f, -0.821540f, 0.007725f},
{ 0.051355f, 0.007613f, 0.998651f},
{ -0.071888f, 0.033035f, 0.996866f},
{ 0.047116f, 0.008492f, 0.998853f},
{ -0.301808f, 0.079669f, 0.950034f},
{ 0.930565f, 0.360621f, -0.063257f},
{ 0.914938f, 0.403398f, -0.012573f},
{ 0.917859f, 0.396346f, -0.021089f},
{ 0.901104f, 0.432948f, 0.023841f},
{ 0.306748f, 0.162693f, -0.937783f},
{ 0.302776f, 0.163703f, -0.938897f},
{ 0.203616f, 0.187562f, -0.960917f},
{ 0.027963f, 0.223786f, -0.974237f},
{ 0.375126f, -0.099625f, -0.921605f},
{ 0.501552f, -0.108143f, -0.858342f},
{ -0.367561f, 0.356205f, 0.859079f},
{ -0.472559f, 0.292193f, 0.831451f},
{ -0.543204f, 0.243458f, 0.803528f},
{ -0.562951f, 0.228889f, 0.794164f},
{ 0.808769f, 0.396163f, -0.434682f},
{ 0.917422f, 0.271526f, -0.290880f},
{ 0.950746f, 0.213718f, -0.224515f},
{ 0.962852f, 0.187425f, -0.194389f},
{ 0.705417f, 0.127367f, 0.697255f},
{ 0.791501f, 0.234175f, 0.564525f},
{ 0.807915f, 0.258599f, 0.529528f},
{ 0.830778f, 0.296765f, 0.470891f},
{ 0.524787f, -0.301575f, 0.796022f},
{ 0.810809f, 0.017547f, 0.585047f},
{ 0.750899f, -0.069894f, 0.656708f},
{ 0.911077f, 0.303264f, 0.279231f},
{ 0.229763f, 0.835474f, -0.499192f},
{ 0.702470f, 0.655153f, -0.278047f},
{ 0.681352f, 0.670793f, -0.292911f},
{ 0.826204f, 0.536159f, -0.172976f},
{ 0.954722f, 0.093319f, -0.282486f},
{ 0.948235f, 0.113772f, -0.296490f},
{ 0.939612f, 0.168830f, -0.297700f},
{ 0.971428f, 0.057351f, -0.230299f},
{ -0.497453f, 0.843873f, -0.201043f},
{ -0.218511f, 0.964002f, -0.151501f},
{ -0.473799f, 0.858249f, -0.197288f},
{ -0.187467f, 0.971456f, -0.145358f},
{ -0.907786f, -0.253319f, 0.334296f},
{ -0.962551f, -0.075743f, 0.260306f},
{ -0.932982f, -0.224129f, 0.281623f},
{ -0.989739f, -0.065151f, 0.127173f},
{ 0.677362f, 0.081990f, -0.731066f},
{ 0.502600f, -0.034022f, -0.863849f},
{ 0.539014f, 0.057566f, -0.840327f},
{ 0.423411f, -0.073186f, -0.902977f},
{ -0.723459f, -0.086374f, -0.684942f},
{ -0.644779f, 0.040403f, -0.763300f},
{ -0.636865f, 0.051665f, -0.769242f},
{ -0.578165f, 0.129285f, -0.805612f},
{ -0.576753f, -0.166670f, 0.799736f},
{ -0.268435f, -0.674110f, 0.688127f},
{ -0.475389f, -0.445948f, 0.758377f},
{ -0.223451f, -0.707876f, 0.670061f},
{ -0.220172f, -0.692861f, -0.686636f},
{ -0.154058f, -0.748020f, -0.645548f},
{ -0.161795f, -0.741974f, -0.650613f},
{ -0.134655f, -0.762719f, -0.632556f},
{ -0.642627f, -0.758753f, -0.106420f},
{ -0.664709f, -0.740767f, -0.097087f},
{ -0.650476f, -0.752491f, -0.103141f},
{ -0.707240f, -0.702648f, -0.078088f},
{ 0.098775f, 0.041385f, 0.994249f},
{ -0.122904f, 0.037745f, 0.991701f},
{ -0.242070f, 0.034959f, 0.969629f},
{ -0.246707f, 0.034839f, 0.968464f},
{ -0.798890f, 0.583027f, -0.147833f},
{ -0.809837f, 0.556274f, -0.186343f},
{ -0.812286f, 0.549368f, -0.195924f},
{ -0.822109f, 0.516250f, -0.240049f},
{ -0.084394f, 0.198105f, -0.976541f},
{ 0.027256f, 0.204001f, -0.978591f},
{ -0.079369f, 0.198425f, -0.976897f},
{ 0.192397f, 0.208041f, -0.959011f},
{ -0.022094f, 0.056750f, -0.998144f},
{ -0.183891f, 0.040513f, -0.982111f},
{ -0.924940f, 0.172244f, 0.338848f},
{ -0.922145f, 0.166780f, 0.349046f},
{ -0.923219f, 0.168851f, 0.345191f},
{ -0.921724f, 0.165978f, 0.350536f},
{ 0.393389f, 0.472785f, -0.788492f},
{ 0.380616f, 0.467783f, -0.797691f},
{ 0.386388f, 0.470054f, -0.793570f},
{ 0.378342f, 0.466883f, -0.799298f},
{ -0.814363f, 0.322778f, -0.482315f},
{ -0.795720f, 0.300369f, -0.525936f},
{ -0.779596f, 0.282249f, -0.559076f},
{ -0.714981f, 0.217137f, -0.664571f},
{ -0.977774f, 0.134047f, -0.161213f},
{ -0.858447f, -0.041195f, -0.511245f},
{ -0.788672f, -0.096910f, -0.607128f},
{ -0.548130f, -0.231425f, -0.803739f},
{ -0.031842f, 0.603783f, -0.796512f},
{ -0.041432f, 0.624324f, -0.780066f},
{ -0.034911f, 0.610402f, -0.791322f},
{ -0.059660f, 0.662198f, -0.746950f},
{ -0.039489f, 0.327066f, -0.944176f},
{ 0.040756f, 0.274077f, -0.960844f},
{ 0.003506f, 0.364132f, -0.931341f},
{ 0.044159f, 0.309431f, -0.949896f},
{ 0.964017f, 0.103255f, -0.244970f},
{ 0.983785f, -0.007163f, -0.179210f},
{ 0.066352f, 0.198184f, -0.977917f},
{ 0.084965f, 0.178514f, -0.980262f},
{ 0.150063f, 0.040711f, 0.987838f},
{ 0.150061f, 0.040711f, 0.987838f},
{ 0.150061f, 0.040711f, 0.987838f},
{ 0.150059f, 0.040711f, 0.987838f},
{ -0.645901f, -0.732029f, -0.216667f},
{ -0.956920f, -0.202182f, -0.208389f},
{ -0.677085f, -0.702822f, -0.218165f},
{ -0.964819f, -0.159200f, -0.209237f},
{ 0.916383f, -0.375827f, 0.137828f},
{ 0.279545f, -0.960111f, -0.006510f},
{ 0.902916f, -0.407983f, 0.135252f},
{ 0.177200f, -0.982684f, -0.054155f},
{ 0.897954f, 0.331401f, 0.289572f},
{ 0.901545f, 0.324115f, 0.286646f},
{ 0.964230f, 0.217783f, 0.151102f},
{ 0.967648f, 0.207538f, 0.143477f},
{ -0.931472f, 0.352777f, -0.088932f},
{ -0.918508f, 0.384639f, -0.091633f},
{ -0.539890f, 0.833253f, -0.119200f},
{ -0.370874f, 0.920674f, -0.121706f},
{ -0.951228f, -0.233067f, -0.202101f},
{ -0.949964f, -0.240213f, -0.199665f},
{ 0.167933f, -0.979782f, -0.108749f},
{ 0.167933f, -0.979782f, -0.108749f},
{ 0.969710f, 0.239490f, 0.048037f},
{ 0.968376f, 0.244425f, 0.050039f},
{ -0.330519f, 0.934788f, -0.130108f},
{ -0.326487f, 0.936096f, -0.130886f},
{ -0.969619f, -0.244581f, 0.004365f},
{ -0.969619f, -0.244581f, 0.004365f},
{ -0.969619f, -0.244581f, 0.004365f},
{ -0.969619f, -0.244580f, 0.004365f},
{ 0.186301f, -0.982488f, 0.003060f},
{ 0.186300f, -0.982488f, 0.003060f},
{ 0.186301f, -0.982488f, 0.003060f},
{ 0.186300f, -0.982488f, 0.003060f},
{ 0.969619f, 0.244581f, -0.004370f},
{ 0.969619f, 0.244581f, -0.004370f},
{ 0.969619f, 0.244581f, -0.004370f},
{ 0.969619f, 0.244581f, -0.004370f},
{ -0.310026f, 0.950725f, -0.002500f},
{ -0.310027f, 0.950725f, -0.002501f},
{ -0.310027f, 0.950725f, -0.002502f},
{ -0.310028f, 0.950724f, -0.002503f},
{ -0.004302f, 0.206398f, 0.978459f},
{ -0.004302f, 0.206398f, 0.978459f},
{ -0.004302f, 0.206398f, 0.978459f},
{ -0.004302f, 0.206398f, 0.978459f},
{ 0.001342f, -0.999557f, 0.029731f},
{ -0.034543f, -0.996222f, -0.079684f},
{ -0.198942f, -0.940594f, -0.275146f},
{ -0.198987f, -0.938055f, -0.283649f},
{ -0.668242f, -0.291759f, -0.684346f},
{ -0.555259f, -0.200526f, -0.807141f},
{ -0.218184f, 0.038571f, -0.975145f},
{ -0.215900f, 0.047688f, -0.975250f},
{ -0.050979f, 0.996951f, -0.059084f},
{ -0.019855f, 0.999758f, 0.009424f},
{ -0.050897f, 0.997251f, -0.053855f},
{ -0.047434f, 0.998665f, 0.020451f},
{ 0.720632f, -0.304432f, 0.622905f},
{ 0.699414f, -0.151597f, 0.698455f},
{ 0.176147f, -0.018391f, 0.984192f},
{ 0.173235f, -0.007256f, 0.984854f},
{ 0.144408f, -0.979550f, -0.140097f},
{ 0.140900f, -0.979923f, -0.141060f},
{ -0.969843f, -0.230039f, -0.080542f},
{ -0.969843f, -0.230039f, -0.080542f},
{ -0.120747f, 0.990981f, -0.058117f},
{ -0.151214f, 0.985835f, -0.072557f},
{ 0.976147f, 0.014551f, -0.216623f},
{ 0.973791f, 0.037651f, -0.224308f},
{ 0.150898f, -0.987051f, 0.054401f},
{ 0.150899f, -0.987051f, 0.054399f},
{ 0.150899f, -0.987051f, 0.054399f},
{ 0.150899f, -0.987051f, 0.054397f},
{ -0.977607f, -0.208232f, 0.030409f},
{ -0.977607f, -0.208232f, 0.030409f},
{ -0.977607f, -0.208232f, 0.030409f},
{ -0.977607f, -0.208232f, 0.030409f},
{ -0.150898f, 0.987051f, -0.054401f},
{ -0.150898f, 0.987051f, -0.054403f},
{ -0.150898f, 0.987051f, -0.054403f},
{ -0.150899f, 0.987051f, -0.054405f},
{ 0.996351f, 0.082068f, -0.023448f},
{ 0.996351f, 0.082067f, -0.023447f},
{ 0.996351f, 0.082067f, -0.023447f},
{ 0.996351f, 0.082067f, -0.023446f},
{ 0.015509f, 0.709165f, 0.704872f},
{ 0.015508f, 0.709165f, 0.704872f},
{ 0.015508f, 0.709165f, 0.704872f},
{ 0.015508f, 0.709165f, 0.704872f},
{ -0.390468f, 0.038542f, 0.919809f},
{ -0.479872f, 0.057365f, 0.875461f},
{ -0.408687f, 0.042342f, 0.911692f},
{ -0.509058f, 0.063613f, 0.858379f},
{ -0.726327f, -0.135744f, -0.673812f},
{ -0.770273f, -0.159099f, -0.617549f},
{ -0.736530f, -0.141043f, -0.661537f},
{ -0.842775f, -0.201635f, -0.499072f},
{ 0.770252f, -0.455433f, -0.446423f},
{ 0.742943f, -0.449605f, -0.495874f},
{ 0.561348f, -0.395413f, -0.727005f},
{ 0.462684f, -0.359307f, -0.810446f},
{ 0.708682f, 0.059259f, 0.703035f},
{ 0.725582f, 0.065835f, 0.684979f},
{ 0.787921f, 0.091492f, 0.608942f},
{ 0.853406f, 0.121741f, 0.506831f},
{ -0.486357f, 0.245295f, 0.838622f},
{ -0.095204f, 0.147231f, 0.984510f},
{ -0.286364f, 0.198084f, 0.937421f},
{ 0.021855f, 0.113664f, 0.993279f},
{ -0.813201f, -0.330337f, -0.479147f},
{ -0.967290f, -0.099394f, -0.233389f},
{ -0.995533f, 0.028782f, -0.089917f},
{ -0.996196f, 0.082304f, -0.028634f},
{ 0.504910f, -0.110180f, -0.856111f},
{ 0.325374f, -0.026331f, -0.945219f},
{ 0.073199f, 0.082758f, -0.993878f},
{ -0.021834f, 0.121613f, -0.992337f},
{ 0.778845f, 0.429709f, 0.456892f},
{ 0.981872f, 0.188588f, -0.019039f},
{ 0.929581f, 0.308752f, 0.201373f},
{ 0.984800f, 0.137501f, -0.106124f},
{ 0.000117f, 0.999986f, 0.005359f},
{ 0.000117f, 0.999986f, 0.005359f},
{ 0.000117f, 0.999986f, 0.005359f},
{ 0.000117f, 0.999986f, 0.005359f},
{ -0.998203f, 0.058303f, -0.013848f},
{ -0.999277f, 0.023725f, -0.029705f},
{ -0.998653f, 0.048538f, -0.018332f},
{ -0.988988f, -0.115249f, -0.092846f},
{ 0.000128f, -0.999983f, 0.005816f},
{ 0.000129f, -0.999983f, 0.005816f},
{ 0.000129f, -0.999983f, 0.005816f},
{ 0.000129f, -0.999983f, 0.005817f},
{ 0.996628f, 0.058303f, -0.057740f},
{ 0.996880f, 0.048537f, -0.062240f},
{ 0.997003f, 0.023725f, -0.073629f},
{ 0.983947f, -0.115249f, -0.136257f},
{ -0.373616f, 0.709163f, 0.597912f},
{ -0.373616f, 0.709163f, 0.597912f},
{ -0.373616f, 0.709163f, 0.597912f},
{ -0.373616f, 0.709163f, 0.597912f},
{ -0.570369f, -0.191149f, 0.798837f},
{ -0.691921f, -0.223434f, 0.686529f},
{ -0.880305f, -0.269815f, 0.390208f},
{ -0.902307f, -0.274537f, 0.332372f},
{ 0.723905f, -0.157787f, 0.671614f},
{ 0.753505f, -0.177919f, 0.632911f},
{ 0.730614f, -0.162270f, 0.663228f},
{ 0.826980f, -0.233107f, 0.511629f},
{ 0.421516f, -0.099127f, -0.901387f},
{ 0.532010f, -0.080571f, -0.842896f},
{ 0.443275f, -0.095684f, -0.891264f},
{ 0.570941f, -0.073340f, -0.817709f},
{ -0.724445f, 0.129486f, -0.677062f},
{ -0.782974f, 0.087228f, -0.615908f},
{ -0.737268f, 0.120712f, -0.664729f},
{ -0.819908f, 0.057070f, -0.569643f},
{ -0.509746f, -0.273291f, 0.815764f},
{ -0.522791f, -0.280508f, 0.804988f},
{ -0.533477f, -0.286422f, 0.795842f},
{ -0.557964f, -0.299982f, 0.773748f},
{ 0.827864f, -0.182204f, 0.530512f},
{ 0.788641f, -0.162307f, 0.593045f},
{ 0.804992f, -0.170434f, 0.568278f},
{ 0.781505f, -0.158826f, 0.603344f},
{ 0.555273f, 0.317373f, -0.768731f},
{ 0.512812f, 0.306034f, -0.802102f},
{ 0.538008f, 0.312825f, -0.782744f},
{ 0.504864f, 0.303856f, -0.807951f},
{ -0.678149f, 0.325058f, -0.659129f},
{ -0.698385f, 0.336095f, -0.631901f},
{ -0.748152f, 0.363518f, -0.555088f},
{ -0.806603f, 0.396481f, -0.438399f},
{ -0.002841f, 0.999986f, 0.004549f},
{ -0.002841f, 0.999986f, 0.004548f},
{ -0.002841f, 0.999986f, 0.004548f},
{ -0.002841f, 0.999986f, 0.004548f},
{ 0.897492f, -0.115248f, 0.425707f},
{ 0.874062f, 0.023725f, 0.485235f},
{ 0.867712f, 0.048538f, 0.494692f},
{ 0.865033f, 0.058303f, 0.498316f},
{ -0.003082f, -0.999983f, 0.004932f},
{ -0.003083f, -0.999983f, 0.004932f},
{ -0.003082f, -0.999983f, 0.004932f},
{ -0.003083f, -0.999983f, 0.004932f},
{ -0.827088f, 0.058303f, -0.559040f},
{ -0.819290f, 0.023726f, -0.572889f},
{ -0.825005f, 0.048538f, -0.563037f},
{ -0.776056f, -0.115249f, -0.620044f}};

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
34, 23, 33,
33, 23, 22,
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
140, 141, 33,
33, 142, 34,
32, 35, 143,
144, 35, 145,
146, 147, 36,
36, 148, 37,
149, 150, 38,
38, 151, 39,
152, 153, 154,
155, 156, 36,
35, 34, 157,
158, 34, 159,
160, 161, 40,
40, 162, 41,
40, 41, 59,
59, 41, 58,
28, 31, 44,
44, 31, 45,
21, 32, 46,
46, 32, 47,
33, 22, 48,
48, 22, 49,
46, 47, 163,
164, 47, 165,
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
33, 48, 181,
182, 48, 183,
184, 185, 32,
32, 186, 47,
187, 54, 188,
189, 54, 37,
190, 38, 191,
192, 38, 55,
55, 54, 193,
194, 54, 195,
196, 197, 47,
47, 198, 199,
40, 56, 200,
201, 56, 202,
40, 59, 56,
56, 59, 60,
59, 58, 42,
42, 58, 43,
60, 59, 57,
57, 59, 42,
69, 71, 70,
70, 71, 72,
74, 61, 73,
73, 61, 62,
75, 63, 203,
204, 63, 205,
75, 76, 63,
63, 76, 64,
76, 73, 64,
64, 73, 62,
62, 61, 66,
66, 61, 65,
63, 67, 206,
207, 67, 208,
63, 64, 67,
67, 64, 68,
64, 62, 68,
68, 62, 66,
66, 65, 70,
70, 65, 69,
67, 209, 210,
211, 212, 213,
67, 68, 214,
215, 68, 216,
68, 66, 217,
218, 66, 70,
88, 87, 86,
86, 87, 85,
78, 77, 89,
89, 77, 90,
219, 79, 220,
221, 79, 91,
91, 79, 92,
92, 79, 80,
80, 78, 92,
92, 78, 89,
82, 81, 78,
78, 81, 77,
222, 83, 223,
224, 83, 79,
79, 83, 80,
80, 83, 84,
80, 84, 78,
78, 84, 82,
82, 86, 81,
81, 86, 85,
225, 226, 227,
228, 229, 83,
83, 230, 84,
84, 231, 232,
84, 233, 82,
82, 234, 86,
93, 94, 96,
96, 94, 95,
106, 97, 105,
105, 97, 98,
107, 99, 106,
106, 99, 97,
235, 108, 236,
237, 108, 100,
108, 238, 100,
100, 239, 240,
97, 101, 98,
98, 101, 102,
97, 99, 101,
101, 99, 103,
241, 100, 242,
243, 100, 244,
245, 246, 100,
100, 247, 248,
249, 250, 93,
95, 104, 96,
109, 112, 110,
110, 112, 111,
114, 113, 121,
121, 113, 122,
122, 113, 123,
123, 113, 115,
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


//Vertices: 314  Texture Co-ords: 199  Normals: 344  Texture: attack Faces: 196 Smooth Groups: 91 sucess: 100 Doubles: 96 Redos needed: 126 Correct: 99