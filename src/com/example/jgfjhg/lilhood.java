package com.example.jgfjhg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;
import android.graphics.Bitmap;
import android.opengl.GLUtils;

class lilhood {

static String TextureName = "LittleRedRobynHood.mtl";

static int Vertices = 314;

static int VertTexts = 196;

static int Normals = 340;

static int Faces = 192;

static int FacesB = 21;

static int SmoothGroups = 89;

static float VertArray[] = new float[]{
 1.012864f, 8.621241f, 0.911271f,
 3.046172f, 8.621241f, 0.601748f,
 1.012864f, 8.621241f, -2.314020f,
 3.046172f, 8.621241f, -2.314020f,
 1.893034f, 4.906085f, 0.124271f,
 1.012864f, 4.906085f, 0.533527f,
 1.012864f, 4.906085f, -1.555356f,
 1.893034f, 4.906085f, -1.270358f,
 1.893034f, 7.934207f, 0.403594f,
 1.012864f, 7.934207f, 0.533527f,
 1.012864f, 7.904825f, -1.787100f,
 1.893034f, 7.934207f, -1.523424f,
 1.012864f, 11.745533f, 0.964763f,
 1.374729f, 11.511826f, 0.964763f,
 1.230942f, 11.511826f, -1.986593f,
 1.012864f, 11.745533f, -1.986593f,
 1.012864f, 6.277716f, 0.632844f,
 1.012864f, 6.261997f, -1.581237f,
 1.781063f, 6.277716f, -1.457249f,
 1.781063f, 6.277716f, 0.421556f,
 2.536697f, 2.400439f, 0.465837f,
 1.012864f, 2.400441f, 1.324741f,
 1.012864f, 2.400319f, -2.454751f,
 2.536697f, 2.400439f, -2.037659f,
 1.012864f, 7.058763f, -2.165322f,
 3.409092f, 7.088143f, -1.933578f,
 1.012864f, 1.300484f, -2.718114f,
 5.153345f, 1.329861f, -2.486370f,
 0.650999f, 11.511826f, 0.964763f,
 0.794786f, 11.511826f, -1.986593f,
 0.132695f, 4.906085f, 0.124271f,
 0.244665f, 6.277717f, 0.421556f,
 0.244665f, 6.277717f, -1.457249f,
 0.132695f, 4.906085f, -1.270358f,
 0.132695f, 7.934208f, 0.403594f,
 -1.020443f, 8.621243f, 0.601748f,
 -1.020443f, 8.621243f, -2.314020f,
 0.132695f, 7.934208f, -1.523424f,
 -0.510968f, 2.400442f, 0.465837f,
 -0.510968f, 2.400442f, -2.037659f,
 -1.383364f, 7.088145f, -1.933578f,
 -3.127616f, 1.329868f, -2.486370f,
 -0.593553f, 1.231742f, 0.649356f,
 0.539795f, 1.231740f, 0.649356f,
 0.539795f, 0.660171f, 1.224267f,
 -0.593553f, 0.660172f, 1.224267f,
 0.639828f, 2.474202f, -0.160892f,
 -0.047441f, 2.474202f, -0.160892f,
 0.639828f, 2.474202f, -0.860938f,
 -0.047441f, 2.474202f, -0.860938f,
 0.461095f, 1.235394f, -0.032059f,
 -0.514852f, 1.235395f, -0.032059f,
 0.461095f, 0.647291f, -0.989770f,
 -0.514852f, 0.647291f, -0.989770f,
 0.132695f, 4.906085f, 0.124271f,
 1.012864f, 4.906085f, 0.533527f,
 1.012864f, 4.906085f, -1.555356f,
 0.132695f, 4.906085f, -1.270358f,
 2.618968f, 1.231743f, 0.649356f,
 1.485619f, 1.231741f, 0.649356f,
 1.485619f, 0.660172f, 1.224267f,
 2.618968f, 0.660172f, 1.224267f,
 1.385586f, 2.474203f, -0.160892f,
 2.072855f, 2.474203f, -0.160892f,
 1.385586f, 2.474203f, -0.860938f,
 2.072855f, 2.474203f, -0.860938f,
 1.564320f, 1.235394f, -0.032059f,
 2.540266f, 1.235395f, -0.032059f,
 1.564320f, 0.647291f, -0.989770f,
 2.540266f, 0.647292f, -0.989770f,
 1.892720f, 4.906085f, 0.124271f,
 1.012550f, 4.906085f, 0.533527f,
 1.012550f, 4.906085f, -1.555356f,
 1.892720f, 4.906085f, -1.270358f,
 3.623899f, 6.482409f, -0.717728f,
 3.623899f, 6.482409f, -0.307131f,
 3.648369f, 6.844422f, -0.739169f,
 3.648369f, 6.844422f, -0.282661f,
 5.133874f, 5.799741f, -0.874853f,
 5.133874f, 5.799741f, -0.152308f,
 5.176936f, 6.436790f, -0.912583f,
 5.176936f, 6.436790f, -0.109247f,
 5.901751f, 5.628657f, -0.874853f,
 5.901751f, 5.628657f, -0.152308f,
 5.944812f, 6.265710f, -0.912583f,
 5.944812f, 6.265710f, -0.109245f,
 1.696171f, 6.685239f, -0.037249f,
 1.696171f, 6.685239f, -0.991622f,
 1.753049f, 7.526684f, -1.041457f,
 1.753049f, 7.526684f, 0.019628f,
 -1.628504f, 6.482409f, -0.717728f,
 -1.628504f, 6.482409f, -0.307131f,
 -1.652975f, 6.844422f, -0.739169f,
 -1.652975f, 6.844422f, -0.282661f,
 -3.138480f, 5.799741f, -0.874853f,
 -3.138480f, 5.799741f, -0.152308f,
 -3.181541f, 6.436790f, -0.912583f,
 -3.181541f, 6.436790f, -0.109247f,
 -3.906356f, 5.628657f, -0.874853f,
 -3.906356f, 5.628657f, -0.152308f,
 -3.949417f, 6.265710f, -0.912583f,
 -3.949417f, 6.265710f, -0.109245f,
 0.299223f, 6.685239f, -0.037249f,
 0.299223f, 6.685239f, -0.991622f,
 0.242346f, 7.526684f, -1.041457f,
 0.242346f, 7.526684f, 0.019628f,
 5.228494f, 5.984134f, -5.077353f,
 5.228495f, 5.984133f, 4.050984f,
 4.729014f, 5.802339f, -4.563303f,
 4.729014f, 5.802338f, 3.536935f,
 5.309362f, 6.013568f, -0.047299f,
 6.324480f, 6.383040f, -0.047298f,
 5.309362f, 6.013568f, -0.954614f,
 6.324480f, 6.383039f, -0.954614f,
 4.295531f, 5.644564f, -5.613587f,
 4.288951f, 5.642169f, -4.330566f,
 4.295532f, 5.644563f, 4.587218f,
 4.288947f, 5.642167f, 3.304199f,
 5.502491f, 6.083860f, 3.026414f,
 4.874101f, 5.855145f, 2.640877f,
 5.502491f, 6.083861f, -4.046669f,
 4.874101f, 5.855145f, -3.661131f,
 1.893034f, 7.934207f, 0.403594f,
 1.893034f, 7.934207f, -1.523424f,
 3.046172f, 8.621241f, 0.601748f,
 3.046172f, 8.621241f, 0.601748f,
 1.893034f, 7.934207f, -1.523424f,
 3.046172f, 8.621241f, -2.314020f,
 1.374729f, 11.511826f, 0.964763f,
 1.374729f, 11.511826f, 0.964763f,
 1.012864f, 11.745533f, 0.964763f,
 3.046172f, 8.621241f, -2.314020f,
 3.046172f, 8.621241f, 0.601748f,
 3.046172f, 8.621241f, 0.601748f,
 1.012864f, 11.745533f, -1.986593f,
 1.230942f, 11.511826f, -1.986593f,
 1.230942f, 11.511826f, -1.986593f,
 1.893034f, 7.934207f, -1.523424f,
 1.012864f, 7.904825f, -1.787100f,
 1.012864f, 7.904825f, -1.787100f,
 1.012864f, 7.934207f, 0.533527f,
 1.012864f, 7.934207f, 0.533527f,
 1.893034f, 7.934207f, 0.403594f,
 1.012864f, 4.906085f, 0.533527f,
 1.893034f, 4.906085f, 0.124271f,
 1.893034f, 4.906085f, 0.124271f,
 1.012864f, 4.906085f, -1.555356f,
 1.893034f, 4.906085f, -1.270358f,
 1.893034f, 4.906085f, -1.270358f,
 1.893034f, 4.906085f, 0.124271f,
 1.893034f, 4.906085f, -1.270358f,
 1.893034f, 4.906085f, -1.270358f,
 2.536697f, 2.400439f, -2.037659f,
 1.893034f, 7.934207f, 0.403594f,
 1.893034f, 7.934207f, 0.403594f,
 1.893034f, 7.934207f, -1.523424f,
 1.012864f, 7.904825f, -1.787100f,
 1.893034f, 7.934207f, -1.523424f,
 1.893034f, 7.934207f, -1.523424f,
 0.244665f, 6.277717f, -1.457249f,
 0.244665f, 6.277717f, -1.457249f,
 0.132695f, 4.906085f, -1.270358f,
 0.132695f, 7.934208f, 0.403594f,
 -1.020443f, 8.621243f, 0.601748f,
 0.132695f, 7.934208f, -1.523424f,
 0.132695f, 7.934208f, -1.523424f,
 -1.020443f, 8.621243f, 0.601748f,
 -1.020443f, 8.621243f, -2.314020f,
 1.012864f, 11.745533f, 0.964763f,
 0.650999f, 11.511826f, 0.964763f,
 0.650999f, 11.511826f, 0.964763f,
 -1.020443f, 8.621243f, 0.601748f,
 -1.020443f, 8.621243f, 0.601748f,
 -1.020443f, 8.621243f, -2.314020f,
 1.012864f, 11.745533f, -1.986593f,
 0.794786f, 11.511826f, -1.986593f,
 0.794786f, 11.511826f, -1.986593f,
 1.012864f, 7.904825f, -1.787100f,
 1.012864f, 7.904825f, -1.787100f,
 0.132695f, 7.934208f, -1.523424f,
 1.012864f, 7.934207f, 0.533527f,
 1.012864f, 7.934207f, 0.533527f,
 0.132695f, 7.934208f, 0.403594f,
 0.132695f, 4.906085f, 0.124271f,
 0.132695f, 4.906085f, 0.124271f,
 1.012864f, 4.906085f, 0.533527f,
 1.012864f, 4.906085f, -1.555356f,
 0.132695f, 4.906085f, -1.270358f,
 0.132695f, 4.906085f, -1.270358f,
 0.132695f, 4.906085f, -1.270358f,
 0.132695f, 4.906085f, -1.270358f,
 0.132695f, 4.906085f, 0.124271f,
 0.132695f, 7.934208f, 0.403594f,
 0.244665f, 6.277717f, -1.457249f,
 0.244665f, 6.277717f, -1.457249f,
 0.132695f, 7.934208f, 0.403594f,
 0.132695f, 7.934208f, -1.523424f,
 1.012864f, 7.904825f, -1.787100f,
 0.132695f, 7.934208f, -1.523424f,
 0.132695f, 7.934208f, -1.523424f,
 1.012864f, 4.906085f, -1.555356f,
 0.639828f, 2.474202f, -0.860938f,
 0.639828f, 2.474202f, -0.860938f,
 0.132695f, 4.906085f, 0.124271f,
 0.132695f, 4.906085f, 0.124271f,
 -0.047441f, 2.474202f, -0.160892f,
 0.639828f, 2.474202f, -0.860938f,
 0.461095f, 0.647291f, -0.989770f,
 0.461095f, 0.647291f, -0.989770f,
 -0.514852f, 0.647291f, -0.989770f,
 -0.514852f, 0.647291f, -0.989770f,
 -0.514852f, 1.235395f, -0.032059f,
 -0.514852f, 1.235395f, -0.032059f,
 -0.047441f, 2.474202f, -0.160892f,
 -0.514852f, 1.235395f, -0.032059f,
 0.461095f, 1.235394f, -0.032059f,
 0.461095f, 1.235394f, -0.032059f,
 0.539795f, 1.231740f, 0.649356f,
 0.539795f, 0.660171f, 1.224267f,
 0.539795f, 0.660171f, 1.224267f,
 0.461095f, 0.647291f, -0.989770f,
 -0.514852f, 0.647291f, -0.989770f,
 -0.593553f, 0.660172f, 1.224267f,
 -0.514852f, 1.235395f, -0.032059f,
 -0.514852f, 1.235395f, -0.032059f,
 -0.593553f, 0.660172f, 1.224267f,
 -0.593553f, 1.231742f, 0.649356f,
 1.012550f, 4.906085f, -1.555356f,
 1.385586f, 2.474203f, -0.860938f,
 1.385586f, 2.474203f, -0.860938f,
 1.892720f, 4.906085f, 0.124271f,
 1.892720f, 4.906085f, 0.124271f,
 2.072855f, 2.474203f, -0.160892f,
 1.385586f, 2.474203f, -0.860938f,
 1.564320f, 0.647291f, -0.989770f,
 1.564320f, 0.647291f, -0.989770f,
 2.540266f, 0.647292f, -0.989770f,
 2.072855f, 2.474203f, -0.160892f,
 2.540266f, 1.235395f, -0.032059f,
 2.540266f, 1.235395f, -0.032059f,
 2.540266f, 0.647292f, -0.989770f,
 2.540266f, 1.235395f, -0.032059f,
 1.564320f, 1.235394f, -0.032059f,
 1.564320f, 1.235394f, -0.032059f,
 1.485619f, 0.660172f, 1.224267f,
 1.485619f, 0.660172f, 1.224267f,
 1.485619f, 1.231741f, 0.649356f,
 1.564320f, 0.647291f, -0.989770f,
 2.540266f, 0.647292f, -0.989770f,
 2.540266f, 1.235395f, -0.032059f,
 2.618968f, 0.660172f, 1.224267f,};

static float VertArrayB[] = new float[]{
 2.618968f, 0.660172f, 1.224267f,
 2.540266f, 1.235395f, -0.032059f,
 2.618968f, 1.231743f, 0.649356f,
 1.753049f, 7.526684f, -1.041457f,
 3.648369f, 6.844422f, -0.739169f,
 1.696171f, 6.685239f, -0.991622f,
 1.696171f, 6.685239f, -0.991622f,
 3.648369f, 6.844422f, -0.739169f,
 3.623899f, 6.482409f, -0.717728f,
 3.648369f, 6.844422f, -0.739169f,
 5.176936f, 6.436790f, -0.912583f,
 3.623899f, 6.482409f, -0.717728f,
 3.623899f, 6.482409f, -0.717728f,
 5.176936f, 6.436790f, -0.912583f,
 5.133874f, 5.799741f, -0.874853f,
 5.176936f, 6.436790f, -0.912583f,
 5.944812f, 6.265710f, -0.912583f,
 5.133874f, 5.799741f, -0.874853f,
 5.133874f, 5.799741f, -0.874853f,
 5.944812f, 6.265710f, -0.912583f,
 5.901751f, 5.628657f, -0.874853f,
 5.176936f, 6.436790f, -0.912583f,
 5.176936f, 6.436790f, -0.109247f,
 5.944812f, 6.265710f, -0.912583f,
 5.944812f, 6.265710f, -0.912583f,
 5.176936f, 6.436790f, -0.109247f,
 5.944812f, 6.265710f, -0.109245f,
 5.176936f, 6.436790f, -0.109247f,
 5.133874f, 5.799741f, -0.152308f,
 5.944812f, 6.265710f, -0.109245f,
 5.944812f, 6.265710f, -0.109245f,
 5.133874f, 5.799741f, -0.152308f,
 5.901751f, 5.628657f, -0.152308f,
 -1.628504f, 6.482409f, -0.717728f,
 -1.652975f, 6.844422f, -0.739169f,
 0.299223f, 6.685239f, -0.991622f,
 0.299223f, 6.685239f, -0.991622f,
 -1.652975f, 6.844422f, -0.739169f,
 0.242346f, 7.526684f, -1.041457f,
 -3.138480f, 5.799741f, -0.874853f,
 -3.181541f, 6.436790f, -0.912583f,
 -1.628504f, 6.482409f, -0.717728f,
 -1.628504f, 6.482409f, -0.717728f,
 -3.181541f, 6.436790f, -0.912583f,
 -1.652975f, 6.844422f, -0.739169f,
 -3.906356f, 5.628657f, -0.874853f,
 -3.949417f, 6.265710f, -0.912583f,
 -3.138480f, 5.799741f, -0.874853f,
 -3.138480f, 5.799741f, -0.874853f,
 -3.949417f, 6.265710f, -0.912583f,
 -3.181541f, 6.436790f, -0.912583f,
 -3.181541f, 6.436790f, -0.912583f,
 -3.949417f, 6.265710f, -0.912583f,
 -3.181541f, 6.436790f, -0.109247f,
 -3.181541f, 6.436790f, -0.109247f,
 -3.949417f, 6.265710f, -0.912583f,
 -3.949417f, 6.265710f, -0.109245f,
 -3.181541f, 6.436790f, -0.109247f,
 -3.949417f, 6.265710f, -0.109245f,
 -3.138480f, 5.799741f, -0.152308f,
 -3.138480f, 5.799741f, -0.152308f,
 -3.949417f, 6.265710f, -0.109245f,
 -3.906356f, 5.628657f, -0.152308f,};

static float[] TextArray = new float[]{
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
 0.235118f, 0.593559f,
 0.254307f, 0.942159f,
 0.294779f, 0.942745f,
 0.212156f, 0.971357f,
 0.866076f, 0.817884f,
 0.323010f, 0.761275f,
 0.284589f, 0.761755f,
 0.184288f, 0.761519f,
 0.213615f, 0.713385f,
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
 0.061848f, 0.115790f,
 0.102082f, 0.138981f,
 0.061822f, 0.541474f,
 0.102062f, 0.518290f,
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
 0.265372f, 0.485186f,
 0.252709f, 0.471616f,
 0.252709f, 0.471616f,
 0.646986f, 0.253990f,
 0.713420f, 0.251201f,
 0.713420f, 0.251201f,
 0.421917f, 0.253517f,
 0.421917f, 0.253517f,
 0.488118f, 0.253991f,
 0.626105f, 0.796095f,
 0.570051f, 0.817057f,
 0.570051f, 0.817057f,
 0.763113f, 0.594129f,
 0.763113f, 0.533977f,
 0.763113f, 0.533977f,
 0.570051f, 0.817057f,
 0.430492f, 0.784985f,
 0.430492f, 0.784985f,
 0.333532f, 0.938934f,
 0.488118f, 0.253991f,
 0.488118f, 0.253991f,
 0.646986f, 0.253990f,
 0.486458f, 0.473726f,
 0.521629f, 0.472552f,
 0.521629f, 0.472552f,
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
 0.265372f, 0.485186f,
 0.278034f, 0.471616f,
 0.278034f, 0.471616f,
 0.713420f, 0.251201f,
 0.713420f, 0.251201f,
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
 0.243427f, 0.503536f,
 0.282801f, 0.532520f,
 0.282801f, 0.532520f,
 0.276453f, 0.593558f,
 0.866074f, 0.988875f,
 0.914161f, 0.988875f,
 0.914161f, 0.988875f,
 0.292918f, 0.942560f,
 0.321245f, 0.970722f,
 0.321245f, 0.970722f,
 0.914163f, 0.817885f,
 0.243427f, 0.503536f,
 0.344702f, 0.504178f,
 0.282801f, 0.532520f,
 0.282801f, 0.532520f,
 0.344702f, 0.504178f,
 0.316375f, 0.532340f,
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
 0.914161f, 0.988875f,
 0.914161f, 0.988875f,
 0.321245f, 0.970722f,
 0.321245f, 0.970722f,
 0.292918f, 0.942560f,
 0.914163f, 0.817885f,
 0.243427f, 0.503536f,
 0.282801f, 0.532520f,
 0.344702f, 0.504178f,};

static float[] TextArrayB = new float[]{
 0.344702f, 0.504178f,
 0.282801f, 0.532520f,
 0.316375f, 0.532340f,
 0.132879f, 0.967236f,
 0.125636f, 0.888754f,
 0.167610f, 0.967103f,
 0.167610f, 0.967103f,
 0.125636f, 0.888754f,
 0.147867f, 0.883841f,
 0.125636f, 0.888754f,
 0.126707f, 0.803332f,
 0.147867f, 0.883841f,
 0.147867f, 0.883841f,
 0.126707f, 0.803332f,
 0.154473f, 0.803332f,
 0.126707f, 0.803332f,
 0.127330f, 0.767704f,
 0.154473f, 0.803332f,
 0.154473f, 0.803332f,
 0.127330f, 0.767704f,
 0.154669f, 0.767704f,
 0.126707f, 0.803332f,
 0.089227f, 0.803332f,
 0.127330f, 0.767704f,
 0.127330f, 0.767704f,
 0.089227f, 0.803332f,
 0.090776f, 0.767704f,
 0.089227f, 0.803332f,
 0.061668f, 0.803332f,
 0.090776f, 0.767704f,
 0.090776f, 0.767704f,
 0.061668f, 0.803332f,
 0.063216f, 0.767704f,
 0.147867f, 0.883841f,
 0.125636f, 0.888754f,
 0.167610f, 0.967103f,
 0.167610f, 0.967103f,
 0.125636f, 0.888754f,
 0.132879f, 0.967236f,
 0.154473f, 0.803332f,
 0.126707f, 0.803332f,
 0.147867f, 0.883841f,
 0.147867f, 0.883841f,
 0.126707f, 0.803332f,
 0.125636f, 0.888754f,
 0.154669f, 0.767704f,
 0.127330f, 0.767704f,
 0.154473f, 0.803332f,
 0.154473f, 0.803332f,
 0.127330f, 0.767704f,
 0.126707f, 0.803332f,
 0.126707f, 0.803332f,
 0.127330f, 0.767704f,
 0.089227f, 0.803332f,
 0.089227f, 0.803332f,
 0.127330f, 0.767704f,
 0.090776f, 0.767704f,
 0.089227f, 0.803332f,
 0.090776f, 0.767704f,
 0.061668f, 0.803332f,
 0.061668f, 0.803332f,
 0.090776f, 0.767704f,
 0.063216f, 0.767704f,};

static float[][] NormArray = new float[][]{
{ 0.542341f, 0.839743f, -0.026423f},
{ 0.711081f, 0.703103f, -0.003134f},
{ 0.552942f, 0.832842f, -0.025093f},
{ 0.731132f, 0.682236f, 0.000000f},
{ 0.416192f, -0.160025f, 0.895085f},
{ 0.277197f, -0.031595f, 0.960294f},
{ 0.374326f, -0.134751f, 0.917454f},
{ 0.265195f, 0.000067f, 0.964195f},
{ 0.160391f, -0.075770f, -0.984141f},
{ 0.213579f, -0.079428f, -0.973692f},
{ 0.265241f, -0.079824f, -0.960872f},
{ 0.306385f, -0.103916f, -0.946219f},
{ 0.996685f, 0.081362f, 0.000000f},
{ 0.996685f, 0.081362f, 0.000000f},
{ 0.996685f, 0.081362f, 0.000000f},
{ 0.996685f, 0.081362f, 0.000000f},
{ 0.165900f, -0.154367f, 0.973986f},
{ 0.141583f, -0.296526f, 0.944472f},
{ 0.131110f, -0.475022f, 0.870152f},
{ 0.132545f, -0.473597f, 0.870711f},
{ 0.000000f, -0.754813f, -0.655940f},
{ 0.037567f, -0.733197f, -0.678978f},
{ 0.061425f, -0.718522f, -0.692786f},
{ 0.252639f, -0.573275f, -0.779442f},
{ 0.511837f, -0.859083f, 0.000000f},
{ 0.511837f, -0.859083f, 0.000000f},
{ 0.511837f, -0.859083f, 0.000000f},
{ 0.511837f, -0.859083f, 0.000000f},
{ 0.150389f, -0.037109f, 0.987930f},
{ 0.090926f, -0.029804f, 0.995412f},
{ 0.147828f, -0.036796f, 0.988328f},
{ -0.011055f, -0.017118f, 0.999792f},
{ 0.846862f, 0.531813f, 0.000000f},
{ 0.855750f, 0.516883f, -0.022906f},
{ 0.854246f, 0.519525f, -0.018901f},
{ 0.862632f, 0.504083f, -0.042027f},
{ 0.111009f, 0.103585f, -0.988406f},
{ 0.033174f, 0.110021f, -0.993376f},
{ 0.000647f, 0.112506f, -0.993651f},
{ 0.000000f, 0.112554f, -0.993646f},
{ 0.288263f, -0.057668f, -0.955813f},
{ 0.257170f, -0.073914f, -0.963535f},
{ 0.405336f, 0.275271f, 0.871739f},
{ 0.466544f, 0.243507f, 0.850318f},
{ 0.441947f, 0.256578f, 0.859564f},
{ 0.476928f, 0.237861f, 0.846146f},
{ 0.291524f, 0.323154f, -0.900325f},
{ 0.271644f, 0.331618f, -0.903459f},
{ 0.254187f, 0.338877f, -0.905843f},
{ 0.248119f, 0.341363f, -0.906592f},
{ 0.968553f, 0.248807f, 0.000000f},
{ 0.968553f, 0.248807f, 0.000000f},
{ 0.968553f, 0.248807f, 0.000000f},
{ 0.968553f, 0.248807f, 0.000000f},
{ 0.997723f, -0.067441f, 0.000000f},
{ 0.997723f, -0.067441f, 0.000000f},
{ 0.997723f, -0.067441f, 0.000000f},
{ 0.997723f, -0.067441f, 0.000000f},
{ 0.251513f, 0.394996f, -0.883583f},
{ 0.096937f, 0.523300f, -0.846617f},
{ 0.115132f, 0.509495f, -0.852737f},
{ 0.074467f, 0.539892f, -0.838434f},
{ 0.094670f, 0.095131f, -0.990953f},
{ 0.074524f, 0.103590f, -0.991824f},
{ 0.061229f, 0.109137f, -0.992139f},
{ 0.054741f, 0.111834f, -0.992218f},
{ -0.731132f, 0.682236f, 0.000000f},
{ -0.711081f, 0.703103f, -0.003134f},
{ -0.552943f, 0.832841f, -0.025093f},
{ -0.542341f, 0.839743f, -0.026423f},
{ -0.265195f, 0.000067f, 0.964195f},
{ -0.277197f, -0.031595f, 0.960294f},
{ -0.374325f, -0.134751f, 0.917455f},
{ -0.416191f, -0.160024f, 0.895085f},
{ -0.160391f, -0.075770f, -0.984141f},
{ -0.265241f, -0.079824f, -0.960872f},
{ -0.213579f, -0.079428f, -0.973692f},
{ -0.306385f, -0.103916f, -0.946219f},
{ -0.996685f, 0.081362f, 0.000000f},
{ -0.996685f, 0.081362f, 0.000000f},
{ -0.996685f, 0.081362f, 0.000000f},
{ -0.996685f, 0.081362f, 0.000000f},
{ -0.165900f, -0.154367f, 0.973986f},
{ -0.131110f, -0.475022f, 0.870152f},
{ -0.141583f, -0.296526f, 0.944472f},
{ -0.132545f, -0.473596f, 0.870711f},
{ -0.252639f, -0.573275f, -0.779441f},
{ -0.037567f, -0.733197f, -0.678978f},
{ -0.061425f, -0.718522f, -0.692786f},
{ -0.000001f, -0.754813f, -0.655940f},
{ -0.511837f, -0.859082f, 0.000000f},
{ -0.511837f, -0.859082f, 0.000000f},
{ -0.511837f, -0.859082f, 0.000000f},
{ -0.511837f, -0.859082f, 0.000000f},
{ 0.011055f, -0.017118f, 0.999792f},
{ -0.090926f, -0.029804f, 0.995412f},
{ -0.147828f, -0.036796f, 0.988328f},
{ -0.150389f, -0.037109f, 0.987930f},
{ -0.862632f, 0.504084f, -0.042027f},
{ -0.855749f, 0.516883f, -0.022906f},
{ -0.854246f, 0.519525f, -0.018901f},
{ -0.846862f, 0.531813f, 0.000000f},
{ -0.111009f, 0.103585f, -0.988406f},
{ -0.000647f, 0.112506f, -0.993651f},
{ -0.033174f, 0.110021f, -0.993376f},
{ 0.000000f, 0.112554f, -0.993646f},
{ -0.257169f, -0.073914f, -0.963536f},
{ -0.288262f, -0.057668f, -0.955813f},
{ -0.476927f, 0.237861f, 0.846146f},
{ -0.466544f, 0.243507f, 0.850318f},
{ -0.441947f, 0.256578f, 0.859564f},
{ -0.405336f, 0.275271f, 0.871739f},
{ -0.291524f, 0.323154f, -0.900325f},
{ -0.254187f, 0.338877f, -0.905843f},
{ -0.271644f, 0.331618f, -0.903459f},
{ -0.248118f, 0.341363f, -0.906592f},
{ -0.968553f, 0.248807f, 0.000000f},
{ -0.968553f, 0.248807f, 0.000000f},
{ -0.968553f, 0.248807f, 0.000000f},
{ -0.968553f, 0.248807f, 0.000000f},
{ -0.997723f, -0.067441f, 0.000000f},
{ -0.997723f, -0.067441f, 0.000000f},
{ -0.997723f, -0.067441f, 0.000000f},
{ -0.997723f, -0.067441f, 0.000000f},
{ -0.251513f, 0.394995f, -0.883584f},
{ -0.115131f, 0.509495f, -0.852737f},
{ -0.096937f, 0.523300f, -0.846617f},
{ -0.074466f, 0.539892f, -0.838434f},
{ -0.094671f, 0.095131f, -0.990953f},
{ -0.061229f, 0.109137f, -0.992139f},
{ -0.074524f, 0.103590f, -0.991824f},
{ -0.054741f, 0.111834f, -0.992218f},
{ 0.000001f, 0.709164f, 0.705043f},
{ 0.000001f, 0.709164f, 0.705043f},
{ 0.000001f, 0.709164f, 0.705043f},
{ 0.000001f, 0.709164f, 0.705043f},
{ 0.000000f, -0.116462f, 0.993195f},
{ -0.121294f, -0.140516f, 0.982621f},
{ -0.368157f, -0.183650f, 0.911446f},
{ -0.413888f, -0.190687f, 0.890132f},
{ 0.988439f, -0.151621f, -0.000000f},
{ 0.988439f, -0.151621f, -0.000000f},
{ 0.988439f, -0.151621f, -0.000000f},
{ 0.988439f, -0.151620f, 0.000000f},
{ -0.300577f, -0.218962f, -0.928283f},
{ -0.081043f, -0.181884f, -0.979975f},
{ -0.264630f, -0.213509f, -0.940417f},
{ 0.000000f, -0.166019f, -0.986123f},
{ -0.997268f, 0.073870f, 0.000000f},
{ -0.997268f, 0.073870f, 0.000000f},
{ -0.997268f, 0.073870f, 0.000000f},
{ -0.997268f, 0.073870f, 0.000000f},
{ 0.000000f, 0.103439f, 0.994636f},
{ 0.000000f, 0.103439f, 0.994636f},
{ 0.000000f, 0.103439f, 0.994636f},
{ 0.000000f, 0.103439f, 0.994636f},
{ 0.989752f, -0.142800f, 0.000000f},
{ 0.992773f, -0.107373f, 0.053600f},
{ 0.992191f, -0.119706f, 0.035041f},
{ 0.992876f, -0.101534f, 0.062349f},
{ 0.000000f, 0.070345f, -0.997523f},
{ 0.000000f, 0.070345f, -0.997523f},
{ 0.000000f, 0.070344f, -0.997523f},
{ 0.000000f, 0.070345f, -0.997523f},
{ -0.954119f, 0.255159f, -0.156686f},
{ -0.953527f, 0.269154f, -0.135435f},
{ -0.949743f, 0.301120f, -0.085526f},
{ -0.935618f, 0.353015f, 0.000000f},
{ 0.000001f, 0.999986f, 0.005361f},
{ 0.000001f, 0.999986f, 0.005361f},
{ 0.000001f, 0.999986f, 0.005361f},
{ 0.000001f, 0.999986f, 0.005361f},
{ 0.986707f, -0.115248f, -0.114578f},
{ 0.998382f, 0.023725f, -0.051679f},
{ 0.998008f, 0.048537f, -0.040295f},
{ 0.997657f, 0.058303f, -0.035802f},
{ -0.000000f, -0.999983f, 0.005817f},
{ -0.000001f, -0.999983f, 0.005818f},
{ -0.000001f, -0.999983f, 0.005817f},
{ -0.000001f, -0.999983f, 0.005818f},
{ -0.997657f, 0.058303f, -0.035803f},
{ -0.998382f, 0.023725f, -0.051680f},
{ -0.998008f, 0.048538f, -0.040296f},
{ -0.986706f, -0.115249f, -0.114579f},
{ -0.000001f, 0.709164f, 0.705043f},
{ -0.000001f, 0.709164f, 0.705043f},
{ -0.000001f, 0.709164f, 0.705043f},
{ -0.000001f, 0.709165f, 0.705043f},
{ 0.413888f, -0.190687f, 0.890132f},
{ 0.121294f, -0.140516f, 0.982621f},
{ 0.368157f, -0.183650f, 0.911445f},
{ 0.000000f, -0.116462f, 0.993195f},
{ -0.988439f, -0.151621f, -0.000000f},
{ -0.988439f, -0.151621f, -0.000000f},
{ -0.988439f, -0.151621f, -0.000000f},
{ -0.988439f, -0.151620f, 0.000000f},
{ 0.300577f, -0.218962f, -0.928283f},
{ 0.264630f, -0.213509f, -0.940417f},
{ 0.081043f, -0.181884f, -0.979975f},
{ 0.000000f, -0.166019f, -0.986123f},
{ 0.997268f, 0.073870f, 0.000000f},
{ 0.997268f, 0.073870f, 0.000000f},
{ 0.997268f, 0.073870f, 0.000000f},
{ 0.997268f, 0.073870f, 0.000000f},
{ 0.000000f, 0.103439f, 0.994636f},
{ -0.000000f, 0.103439f, 0.994636f},
{ -0.000000f, 0.103439f, 0.994636f},
{ -0.000000f, 0.103439f, 0.994636f},
{ -0.989752f, -0.142800f, 0.000000f},
{ -0.992191f, -0.119706f, 0.035041f},
{ -0.992773f, -0.107373f, 0.053600f},
{ -0.992876f, -0.101534f, 0.062349f},
{ 0.000000f, 0.070345f, -0.997523f},
{ 0.000000f, 0.070344f, -0.997523f},
{ 0.000000f, 0.070344f, -0.997523f},
{ 0.000000f, 0.070344f, -0.997523f},
{ 0.935618f, 0.353015f, 0.000000f},
{ 0.953527f, 0.269154f, -0.135435f},
{ 0.949743f, 0.301120f, -0.085526f},
{ 0.954119f, 0.255159f, -0.156686f},
{ -0.000001f, 0.999986f, 0.005361f},
{ -0.000002f, 0.999986f, 0.005361f},
{ -0.000002f, 0.999986f, 0.005361f},
{ -0.000002f, 0.999986f, 0.005361f},
{ -0.997657f, 0.058303f, -0.035802f},
{ -0.998382f, 0.023725f, -0.051679f},
{ -0.998008f, 0.048537f, -0.040295f},
{ -0.986707f, -0.115248f, -0.114579f},
{ 0.000001f, -0.999983f, 0.005818f},
{ 0.000001f, -0.999983f, 0.005817f},
{ 0.000001f, -0.999983f, 0.005817f},
{ 0.000001f, -0.999983f, 0.005817f},
{ 0.997657f, 0.058304f, -0.035802f},
{ 0.998008f, 0.048538f, -0.040296f},
{ 0.998382f, 0.023726f, -0.051680f},
{ 0.986706f, -0.115250f, -0.114579f},
{ 0.997723f, -0.067438f, 0.000000f},
{ 0.997723f, -0.067439f, 0.000000f},
{ 0.997723f, -0.067440f, 0.000000f},
{ 0.997723f, -0.067441f, 0.000000f},
{ -0.104640f, -0.994510f, 0.000000f},
{ -0.236706f, -0.971581f, 0.000000f},
{ -0.104640f, -0.994510f, 0.000000f},
{ -0.247365f, -0.968922f, 0.000000f},
{ 0.133374f, -0.067575f, -0.988759f},
{ 0.052223f, -0.062558f, -0.996674f},
{ 0.133374f, -0.067575f, -0.988759f},
{ -0.006044f, -0.058713f, -0.998257f},
{ 0.338696f, 0.940896f, 0.000000f},
{ 0.338696f, 0.940896f, 0.000000f},
{ 0.310165f, 0.950683f, 0.000000f},
{ 0.299781f, 0.954008f, 0.000000f},
{ 0.130441f, -0.075639f, 0.988567f},
{ 0.130441f, -0.075639f, 0.988567f},
{ 0.049500f, -0.070689f, 0.996269f},
{ -0.008596f, -0.066860f, 0.997725f},
{ -0.411959f, -0.911202f, 0.000000f},
{ -0.411959f, -0.911202f, 0.000000f},
{ -0.125785f, -0.050177f, -0.990788f},
{ -0.125785f, -0.050178f, -0.990788f},
{ 0.257671f, 0.966233f, 0.000000f},
{ 0.257671f, 0.966233f, 0.000000f},
{ -0.127865f, -0.058281f, 0.990078f},
{ -0.127865f, -0.058281f, 0.990078f},
{ -0.217469f, -0.976067f, 0.000000f},
{ -0.217469f, -0.976067f, 0.000000f},
{ -0.217469f, -0.976067f, 0.000000f},
{ -0.217470f, -0.976067f, 0.000000f},
{ -0.012976f, -0.058243f, -0.998218f},
{ -0.012976f, -0.058243f, -0.998218f},
{ -0.012976f, -0.058243f, -0.998218f},
{ -0.012976f, -0.058243f, -0.998218f},
{ 0.217465f, 0.976068f, 0.000000f},
{ 0.217465f, 0.976068f, 0.000000f},
{ 0.217465f, 0.976068f, 0.000000f},
{ 0.217465f, 0.976068f, 0.000000f},
{ -0.014804f, -0.066437f, 0.997681f},
{ -0.014804f, -0.066438f, 0.997681f},
{ -0.014804f, -0.066438f, 0.997681f},
{ -0.014803f, -0.066439f, 0.997681f},
{ -0.997723f, -0.067440f, 0.000000f},
{ -0.997723f, -0.067441f, 0.000000f},
{ -0.997723f, -0.067441f, 0.000000f},
{ -0.997723f, -0.067441f, 0.000000f},
{ 0.247365f, -0.968922f, 0.000000f},
{ 0.236707f, -0.971581f, 0.000000f},
{ 0.104640f, -0.994510f, 0.000000f},
{ 0.104640f, -0.994510f, 0.000000f},
{ 0.006044f, -0.058713f, -0.998257f},
{ -0.052223f, -0.062558f, -0.996674f},
{ -0.133374f, -0.067575f, -0.988759f},
{ -0.133374f, -0.067575f, -0.988759f},
{ -0.338696f, 0.940896f, 0.000000f},
{ -0.310165f, 0.950683f, 0.000000f},
{ -0.338696f, 0.940896f, 0.000000f},
{ -0.299781f, 0.954008f, 0.000000f},
{ -0.130441f, -0.075639f, 0.988567f},
{ -0.049500f, -0.070689f, 0.996270f},
{ -0.130441f, -0.075639f, 0.988567f},
{ 0.008596f, -0.066860f, 0.997725f},
{ 0.411959f, -0.911202f, 0.000000f},
{ 0.411959f, -0.911202f, 0.000000f},
{ 0.125785f, -0.050178f, -0.990788f},
{ 0.125785f, -0.050178f, -0.990788f},
{ -0.257671f, 0.966233f, 0.000000f},
{ -0.257671f, 0.966233f, 0.000000f},
{ 0.127865f, -0.058281f, 0.990078f},
{ 0.127866f, -0.058281f, 0.990078f},
{ 0.217469f, -0.976067f, 0.000000f},
{ 0.217470f, -0.976067f, 0.000000f},
{ 0.217470f, -0.976067f, 0.000000f},
{ 0.217470f, -0.976067f, 0.000000f},
{ 0.012976f, -0.058243f, -0.998218f},
{ 0.012976f, -0.058243f, -0.998218f},
{ 0.012976f, -0.058243f, -0.998218f},
{ 0.012976f, -0.058243f, -0.998218f},
{ -0.217465f, 0.976068f, 0.000000f},
{ -0.217465f, 0.976068f, 0.000000f},
{ -0.217465f, 0.976068f, 0.000000f},
{ -0.217465f, 0.976068f, 0.000000f},
{ 0.014804f, -0.066437f, 0.997681f},
{ 0.014804f, -0.066438f, 0.997681f},
{ 0.014804f, -0.066438f, 0.997681f},
{ 0.014803f, -0.066439f, 0.997681f},
{ 0.342020f, -0.939693f, -0.000000f},
{ 0.342020f, -0.939693f, -0.000000f},
{ 0.342020f, -0.939693f, -0.000000f},
{ 0.342020f, -0.939693f, -0.000000f},
{ 0.342019f, -0.939693f, 0.000000f},
{ 0.342019f, -0.939693f, 0.000000f},
{ 0.342020f, -0.939693f, 0.000001f},
{ 0.342020f, -0.939693f, -0.000000f},
{ 0.342020f, -0.939693f, 0.000000f},
{ 0.342021f, -0.939692f, -0.000000f},
{ 0.342020f, -0.939693f, 0.000000f},
{ 0.342021f, -0.939692f, -0.000000f},
{ 0.342019f, -0.939693f, -0.000001f},
{ 0.342019f, -0.939693f, -0.000001f},
{ 0.342020f, -0.939693f, -0.000000f},
{ 0.342020f, -0.939693f, -0.000000f}};

static int[] FaceArray = new int[]{
13, 14, 12,
12, 14, 15,
4, 19, 5,
5, 19, 16,
17, 18, 6,
6, 18, 7,
7, 18, 4,
4, 18, 19,
9, 8, 0,
0, 8, 1,
3, 11, 2,
2, 11, 10,
122, 123, 124,
125, 126, 127,
1, 128, 0,
0, 129, 130,
131, 14, 132,
133, 14, 13,
134, 135, 2,
3, 2, 136,
137, 18, 138,
139, 18, 17,
16, 19, 140,
141, 19, 142,
143, 21, 144,
145, 21, 20,
146, 147, 22,
22, 148, 23,
149, 20, 150,
151, 20, 152,
19, 18, 153,
154, 18, 155,
156, 157, 24,
24, 158, 25,
24, 25, 26,
26, 25, 27,
15, 29, 12,
12, 29, 28,
16, 31, 5,
5, 31, 30,
17, 6, 32,
32, 6, 33,
31, 159, 30,
30, 160, 161,
9, 0, 34,
34, 0, 35,
10, 37, 2,
2, 37, 36,
162, 163, 164,
165, 166, 167,
168, 169, 0,
0, 170, 35,
28, 29, 171,
172, 29, 173,
174, 2, 175,
36, 176, 2,
17, 32, 177,
178, 32, 179,
16, 180, 31,
31, 181, 182,
38, 21, 183,
184, 21, 185,
186, 22, 187,
188, 22, 39,
39, 38, 189,
190, 38, 191,
31, 192, 193,
194, 195, 196,
197, 24, 198,
199, 24, 40,
24, 26, 40,
40, 26, 41,
42, 45, 43,
43, 45, 44,
47, 46, 54,
54, 46, 55,
55, 46, 56,
56, 46, 48,
200, 201, 57,
57, 202, 49,
57, 49, 203,
204, 49, 205,
51, 50, 47,
47, 50, 46,
46, 50, 48,
48, 50, 52,
206, 207, 49,
49, 208, 209,
210, 211, 49,
49, 212, 213,
214, 42, 215,
216, 42, 43,
217, 218, 50,
50, 219, 52,
220, 44, 53,
53, 44, 45,
221, 222, 223,
224, 225, 226,
58, 59, 61,
61, 59, 60,
71, 62, 70,
70, 62, 63,
71, 72, 62,
62, 72, 64,
227, 73, 228,
229, 73, 65,
73, 230, 65,
65, 231, 232,
62, 66, 63,
63, 66, 67,
62, 64, 66,
66, 64, 68,
233, 65, 234,
235, 65, 236,
237, 238, 65,
65, 239, 240,
241, 242, 58,
58, 243, 59,
68, 244, 66,
66, 245, 246,
247, 69, 60,
60, 69, 61,
248, 249, 250,
82, 84, 83,
83, 84, 85,
87, 74, 86,
86, 74, 75,
88, 89, 76,
76, 89, 77,
89, 86, 77,
77, 86, 75,
75, 74, 79,
79, 74, 78,
76, 77, 80,
80, 77, 81,
77, 75, 81,
81, 75, 79,
79, 78, 83,
83, 78, 82,
101, 100, 99,
99, 100, 98,
91, 90, 102,
102, 90, 103,
104, 92, 105,
105, 92, 93,
105, 93, 102,
102, 93, 91,
91, 95, 90,
90, 95, 94,
92, 96, 93,
93, 96, 97,
93, 97, 91,
91, 97, 95,
95, 99, 94,
94, 99, 98,
119, 110, 118,
118, 110, 111,
113, 111, 112,
112, 111, 110,
106, 120, 108,
108, 120, 121,
106, 108, 114,
114, 108, 115,
107, 116, 109,
109, 116, 117,
108, 109, 115,
115, 109, 117,
107, 109, 118,
118, 109, 119,
121, 120, 112,
112, 120, 113, };

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


//Vertices: 314  Texture Co-ords: 196  Normals: 340  Texture: LittleRedRobynHood.mtl Faces: 192 Smooth Groups: 89 sucess: 96 Doubles: 96 Redos needed: 129 Correct: 96