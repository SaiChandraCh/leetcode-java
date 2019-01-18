import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Problem_888 {
    public static void main(String[] args) {
        Problem_888 problem_888 = new Problem_888();
        problem_888.fairCandySwap(new int[]{54584,65173,37342,519,65313,19124,86258,71740,16574,69619,53310,40026,27768,37800,35319,79873,4125,43812,68025,53064,5259,29519,75796,82105,16166,48376,9993,65131,27970,8958,36907,27934,44189,89298,87433,41553,99068,76004,43933,62373,828,9857,44616,49638,87872,49391,90764,79559,68497,10771,22174,5187,82529,12549,73059,63719,86656,62413,99187,90643,65773,21024,56366,14922,56613,36835,57353,53783,98270,66302,72531,61130,62042,46198,58258,20567,87874,86185,35149,81347,2351,29006,38437,17489,54651,76092,56585,53029,14997,72250,4649,1404,91750,87807,44881,50580,54852,55027,77212,4436,5732,21443,75219,32763,78209,7604,54513,89993,4605,25988,38546,72720,93532,23396,56935,41276,29187,26937,21975,79263,75587,39940,22498,97170,90800,76282,15154,2243,5480,95275,96417,54327,82999,58000,8992,67798,49952,80171,78280,70352,71062,8886,28824,40931,97983,14841,64826,57439,71908,44095,64156,21027,19621,17140,77965,83737,75825,51972,54332,56277,86698,43248,18377,12212,63337,60038,61233,66695,74734,25767,1719,41110,88459,70369,82186,16155,57035,10838,10559,8864,55650,10230,32484,83081,29619,49788,25283,82134,96662,12263,46594,84072,76120,19179,99716,29495,37520,3797,46616,92913,33813,68948,48185,80105,8318,5598,16214,67286,46558,45420,69734,21436,96442,96126,24002,47682,22612,74749,89212,88444,39510,66288,96398,18732,87890,23058,38105,47352,63167,91218,23230,23580,7673,33453,13439,67346,35886,65721,79398,12765,18151,21126,44514,33875,35275,20942,47021,60597,69183,22913,71794,66869,25708,45891,99571,95359,84390,52296,41147,1112,1372,380,71777,69407,71622,41307,63909,610,85073,79825,99210,98102,68775,8601,71314,19492,87931,68392,98383,30784,71238,48749,40610,17480,81630,98876,57108,39083,86093,89955,11755,5936,29616,27452,17780,14402,4451,48516,91265,53114,78658,2741,36377,76633,98911,51573,85740,80962,4078,98581,84515,65504,79770,99704,90961,97623,32640,69544,78911,85770,57030,52833,23559,1608,79294,63383,6603,37396,41868,826,37407,63544,72455,48733,90258,61471,83674,12912,7386,57162,60878,588,63210,28453,66357,34131,30321,44073,95004,9572,47533,44161,86494,97501,72005,6193,14333,14794,39850,24795,4647,86861,76452,24594,67316,95264,67720,9476,51269,33592,82066,66305,24829,94538,20152,15965,9539,60852,73884,69731,53278,51917,45775,33147,9751,53879,89706,79096,24343,98484,24440,39060,47459,48302,65414,88205,69471,81566,67746,14497,82890,33854,45131,13435,26337,63133,6821,2235,13089,32835,11502,14318,36654,65544,76190,53020,88494,96128,36514,98956,73625,49173,47861,22252,88971,71620,48092,64081,21462,37581,53116,78005,72853,45428,4060,14110,1073,22134,69880,20386,90676,5432,53904,33927,35584,91137,1515,98281,76142,626,63569,61254,13936,38109,79678,10042,58860,45451,32333,69691,73644,53127,11031,27093,34801,27522,60819,86968,56626,93707,62999,46004,28286,4754,79691,44116,24791,44339,62683,83754,15884,19645,51599,14245,32189,6158,88284,30301,93361,44663,51366,81108,5499,64752,74958,589,62556,46290,81049,69139,71046,98794,76955,16650,94347,47218,98493,30143,25797,13723,66408,82761,74430,4837,72895,82265,55786,42500,34910,40903,28792,93065,80609,1818,35465,46181,9538,91054,91309,15115,98114,50956,45476,79972,84960,85142,94495,76792,11203,60626,82299,88720,56749,85035,88714,86389,91460,46828,58033,80166,72214,36769,33646,88487,30799,69365,41381,18652,92335,88638,32739,2050,65630,70594,99789,37351,41848,33801,45102,30988,74855,5587,51959,11656,13038,29770,22134,10193,45712,47316,39945,60672,8985,88525,76583,19134,84755,48670,75520,1484,2702,50353,78951,14981,56276,83466,55477,84080,52441,87436,38268,49194,3675,78949,76224,35309,64491,46707,9991,80682,85316,48232,71132,35559,17771,31350,26223,63113,23315,25030,50629,18544,54072,49667,41281,82314,65783,65901,11048,20415,85555,98789,56353,4695,48137,25072,93175,94497,67624,70967,32650,21761,62775,79667,89450,89655,88349,55237,17181,13815,79943,75166,95262,73771,97641,31313,68732,63372,94534,8256,35576,37299,56867,92778,82707,31882,77238,33702,55214,91225,32553,70842,9777,2731,20969,7630,88399,99004,8124,14414,16842,283,29891,18892,97941,89701,57458,99366,9670,48477,36241,13525,44144,25290,16966,23248,51284,87816,84624,3699,61591,91127,8225,14811,78808,24739,1254,9963,33212,1251,28538,76510,31559,26962,43408,52360,83519,99404,83040,90103,80071,41408,87093,76099,24612,88643,19287,86311,15128,65206,27392,94456,17352,57526,83650,2239,45827,84130,22843,6058,11678,37019,80685,8541,1537,86889,23063,88664,81003,55327,98280,44413,26522,32136,66111,25859,4351,27565,66601,34069,52692,92917,49760,99830,91136,83593,45491,3337,28985,88946,62485,53941,30802,9846,71366,12486,56058,83354,51932,60091,77075,21347,37373,91706,51054,15578,73967,2815,75527,25905,55599,81029,14180,84929,15831,49984,12534,20697,15500,68761,26044,3219,72937,98735,27299,7041,6282,78893,60560,11035,7618,59365,57811,98891,98917,43377,16654,28027,83942,43470,4981,68255,28436,78179,41243,85922,30800,76071,87575,99097,12177,24961,24837,53498,1667,10903,53206,86943,88614,64958,85040,5786,28524,92680,19058,44293,97656,84454,7366,50884,23819,91924,89018,30991,60694,80433,22732,66678,47592,99689,18630,38208,49958,95222,97089,83180,13989,77720,12800,52315,71066,26244,66273,5386,17262,43201,69683,66102,23307,34313,64704,25082,93953,11419,20208,85995,51643,870,44611,43638,86628,78764,56329,68340,40113,67941,44178,7436,70911,60919,90350,1306,1765,38368,72177,50573,34255,87293,24353,37577,16536,74997,23927,80087,35942,92488,85298,27702,79335,28606,93917,7642,24827,75104,36854,77240,3272,70231,96932,45182,84947,86716,6280,11833,97539,60443,23275,66580,32686,85578,59262,86061,89504,5645,57740,95608,45577,54385,2204,12347,90867,26294,55653,89739,61724,40290,43409,75602,55463,82944,72776,42380,78616,93655,6536,25280,86101,56253,32120,22920,53448,95195,81397,14216,32933,67424,21148,17109,48846,77777,6884,48441,15895,55766,45154,16448,34901,88813,78481,1130,84835,26853,6669,70400,65953,7743,76868,38700,22616,1764}
                ,new int[]{13089,4873,37279,55824,61266,95756,4090,17084,22752,36277,80912,41931,91086,95308,47589,18554,87609,13758,23866,45191,53340,87041,51562,86344,34267,71236,80537,47106,28112,52160,97577,45156,84959,22580,46386,74269,99176,40121,91030,78849,32445,34150,97885,7636,44489,38422,61718,80659,59381,82083,31455,14630,17735,23437,51843,31400,73899,51982,1334,30703,21622,84526,43638,26601,16004,90226,42865,801,24695,58928,76195,13149,76372,6682,43970,31364,68991,47690,51668,95658,32312,57894,55161,34725,60675,87509,37495,28836,22850,15621,13186,83132,5176,61144,74261,33179,14262,96448,52968,95027,54437,54253,23924,45256,98881,14626,35333,50408,6881,65625,39898,43005,56998,35129,23250,8915,84273,81229,12834,49018,82694,84637,75100,74057,20976,94196,33290,87012,22747,6436,88068,46273,80310,44143,57638,11730,53962,1067,78752,23942,80803,91567,53942,88485,86338,69981,15099,48319,52336,15470,59590,91994,31990,21706,42653,30364,11557,18916,26564,20319,58964,70802,26037,1961,85958,11320,66890,63787,62340,63064,93922,18799,95278,52467,25538,12304,49382,57722,54507,50663,46486,4726,90171,31591,46638,48118,41344,84140,83073,63331,59261,97852,78478,34753,607,92650,11887,4544,62085,76040,36167,25432,98360,74043,5579,85561,72012,54155,46159,21655,45921,75287,49981,71163,33768,97756,89207,76261,475,57115,60649,6201,16517,21324,53840,82168,34099,27347,75989,74503,4491,61515,94249,94487,54165,50628,60432,11467,93916,26695,1725,39791,85693,38038,50948,38055,9185,77022,58353,43297,38089,89737,47296,25080,13559,22772,25255,69931,46867,81484,18597,21584,18192,13519,89862,24352,17229,73358,91024,49190,54435,8037,1869,27736,43948,24311,63027,57811,44752,89374,93511,42132,96690,6785,48508,40336,73981,4506,79309,21151,90029,35090,3652,64228,97220,82492,68567,18020,85886,3721,11913,7182,19030,36174,51049,78883,5297,3883,57241,77170,35187,49706,14774,88583,33879,3485,68520,15552,5217,34341,85822,66047,84989,6191,95981,49373,59588,94790,96157,96155,31962,32253,95884,75247,34844,673,25377,9174,59084,88248,33952,60507,86360,53438,44236,24574,77882,85489,15093,21380,96312,50316,36725,99288,97841,28421,58522,25618,92598,92389,13444,17926,60859,82617,97515,74991,68031,88102,16426,32705,4507,5136,74352,97170,26700,92002,15368,9897,77329,77318,31617,89587,40302,74886,49430,19335,44953,17380,51522,89300,6749,97275,63312,73172,86208,53759,82515,65539,45573,22976,19580,65661,68298,18989,75422,42392,75000,40089,55421,4477,81492,43492,13221,66498,15140,80032,23474,56092,13962,88136,63328,63308,40862,31170,41610,54425,80871,2111,43138,39095,22028,59111,81297,86166,45401,27165,91967,76453,66649,90987,1183,16564,93016,72387,2946,62366,42101,89120,64466,7448,41896,86446,77456,72395,74730,70261,82047,97152,29431,61706,4875,63981,38002,4629,63235,20470,36370,95744,61313,67831,97150,87910,75853,26112,10955,95496,72067,72745,33240,14147,99156,84344,52743,5872,58724,65288,71002,28929,40944,28782,64046,53776,33077,18134,39596,30363,4073,99425,32787,59125,82057,56332,35883,92669,97382,14232,63485,8937,10197,85544,92646,36702,97950,21126,60909,77810,99419,42998,11628,9312,80701,93338,86274,85058,18214,95769,96851,82760,95558,60799,77936,53875,96367,60773,82519,98780,11131,83808,42727,23505,81655,50534,28075,83506,71021,39980,93814,38837,52463,63331,611,18816,65488,31676,10733,70520,88491,30202,83086,78311,55771,12452,54641,98067,51659,31339,587,32983,12397,25815,91522,41528,90695,32956,54819,38730,29962,52885,41459,55808,41576,48678,50123,51438,44582,8538,44451,23921,97511,37375,76449,70354,87132,68031,59725,15264,20313,5541,15765,87132,47444,62853,82616,5043,58143,40898,67171,75943,51041,505,4604,15514,38169,99289,17034,73219,80173,88845,18843,8620,12366,14403,17187,22491,82333,36756,16449,39987,40618,15714,17281,93351,55865,20224,63665,51730,29641,82247,3616,12244,71429,75875,67957,66551,15818,92545,86805,76215,29567,33351,80497,84962,86169,86655,25908,93670,60431,25171,40286,22990,21031,7440,45139,27774,11053,78420,20012,78110,24796,48513,19810,91447,27674,31123,7213,77485,33618,74577,67092,28237,12491,25911,80084,95008,47020,84487,57980,90987,92008,8326,45272,54354,13256,68002,7130,93818,5492,20109,80166,82810,50556,51559,37054,92513,48383,65262,56591,8602,96032,18766,76364,96550,75969,1296,91225,96403,29405,59281,47913,40614,91985,66909,73893,86349,23110,8434,41448,54926,89765,69435,34285,88166,45782,32009,26805,51758,63679,86229,49259,54405,34072,68446,35536,37210,28980,60962,21687,92152,28286,52558,2546,33416,91541,81014,18347,73463,68535,43680,31477,95065,2787,33135,67849,77746,46608,53490,52652,5752,16689,91400,76995,43028,18261,50733,43799,49457,37462,31243,31800,16098,73283,48218,64785,43340,93663,43606,33228,13362,32672,63206,59249,34982,26192,1220,67547,56471,73297,87426,42449,66724,88944,89181,91928,96974,29813,84139,31139,40720,16361,2839,40552,76615,42324,49446,99815,29506,94718,70991,65703,99428,21364,18224,43669,34897,73309,45108,57286,13834,97349,29128,54804,4779,65841,38651,44537,67584,19515,65377,55563,50502,69657,64164,10523,85576,90120,41199,52998,10803,21671,80059,85088,72989,55570,18867,13320,84053,1799,72881,57521,27489,16877,14991,30111,276,84159,9167,84121,67351,31458,69153,49353,59450,58304,8961,91592,8531,85630,96622,52408,69058,51169,24265,73300,60850,86434,89741,4399,6712,44865,7609,70921,77061,43018,37635,95790,70966,65140,21922,18125,65305,39880,87670,51516,3058,74396,57199,18843,44859,97683,76292,44087,21215,56500,11182,62179,63565,64995,38563,53673,34917,45345,96751,44440,65076,90458,4651,7549,37556,14921,8452,59755,74539,70396,63277,63024,34693,3728,61304,28857,82189,76336,14346,77405,43945,65919,66847,92780,33004,70717,63652,62998,44939,16592,95955,63886,67896,16247,37284,63762,44368,70837,51688,12575,32473,72985,54280,79513,49802,64724,71394,28572,48834,26880,63022,93368,12258,86010,16868,3448,1920,37261,5044,34821,55832,25329,57754,81328,94921,81553,25720,53963,64513,77393,7537,82445,37419,27923,22608,882,1588});
    }
//    public  int[] fairCandySwap(int[] A, int[] B) {
//        int lengthA=A.length,lengthB=B.length;
//        int[] tempA,tempB;
//        int temp,sumA,sumB;
//        for (int i = 0; i < lengthB; i++) {
//            tempB= Arrays.copyOf(B,lengthB);
//            temp=tempB[i];
//            for (int j = 0; j < lengthA; j++) {
//                tempA=Arrays.copyOf(A,lengthA);
//                tempB[i]=tempA[j];
//                tempA[j]=temp;
//                sumA=sum(tempA);
//                sumB=sum(tempB);
//                if(sumA==sumB){
//                    System.out.println(tempB[i]+", "+tempA[j]);
//                    return new int[]{tempB[i],tempA[j]};
//                }
//            }
//        }
//        return null;
//    }
    public  int[] fairCandySwap(int[] A, int[] B) {
        int sumA= sum(A),sumB = sum(B),diff=sumA>sumB?sumA-sumB:sumB-sumA;
        for (int a: A) {
            for (int b: B) {
                if(a-b == diff/2 || b-a == diff/2 || a-b == diff/2 - 0.5 || b-a == diff/2 - 0.5 || a-b == diff/2 + 0.5 || b-a == diff/2 + 0.5){
                    if(sumA > sumB && a > b || sumB > sumA && b > a){
                        System.out.println(a+", "+b);
                        return new int[]{a,b};
                    }else{
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public static int sum(int[] nums) {
        int sum =0;
        for (int a:nums) {
            sum = sum + a;
        }
        return sum;
    }
}