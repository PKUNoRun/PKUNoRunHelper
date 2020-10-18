package com.pkunorun.pkunorunhelper;

import java.util.ArrayList;
import java.util.List;

public class Record {
    public static String A_Loop_GPS_JSON = "400m.250p.54.pkurunner.json";
    public static float Distance_Per_Loop = 0.45f;
    private static final List<LatitudeLongitudeItem> oneCircle = new ArrayList<LatitudeLongitudeItem>() {
        {
            add(new LatitudeLongitudeItem(39.9878930992251, 116.31275393507501));
            add(new LatitudeLongitudeItem(39.987877034107946, 116.31275787121162));
            add(new LatitudeLongitudeItem(39.98786189587606, 116.31275499378225));
            add(new LatitudeLongitudeItem(39.98784701244487, 116.31275912029979));
            add(new LatitudeLongitudeItem(39.987824664926045, 116.3127610714635));
            add(new LatitudeLongitudeItem(39.987804762941835, 116.3127603976012));
            add(new LatitudeLongitudeItem(39.987787144745845, 116.31276184834093));
            add(new LatitudeLongitudeItem(39.98777603747929, 116.31276368067158));
            add(new LatitudeLongitudeItem(39.98776934274656, 116.31276686630442));
            add(new LatitudeLongitudeItem(39.987768880061154, 116.3127653331318));
            add(new LatitudeLongitudeItem(39.98775799160118, 116.31276647408548));
            add(new LatitudeLongitudeItem(39.98774493269005, 116.31276315602434));
            add(new LatitudeLongitudeItem(39.98772991073608, 116.31276813425668));
            add(new LatitudeLongitudeItem(39.987715512207046, 116.31277506653812));
            add(new LatitudeLongitudeItem(39.98770314219317, 116.31278109724269));
            add(new LatitudeLongitudeItem(39.98768982577828, 116.31278347039677));
            add(new LatitudeLongitudeItem(39.987673949502565, 116.31278598351472));
            add(new LatitudeLongitudeItem(39.98765858045474, 116.31278738679648));
            add(new LatitudeLongitudeItem(39.987642912365324, 116.31278659949348));
            add(new LatitudeLongitudeItem(39.987630849873696, 116.31279119732803));
            add(new LatitudeLongitudeItem(39.98761561679905, 116.31279453423541));
            add(new LatitudeLongitudeItem(39.98759998099655, 116.3127915662432));
            add(new LatitudeLongitudeItem(39.98758071381584, 116.31279363804076));
            add(new LatitudeLongitudeItem(39.98756041709926, 116.31278450693725));
            add(new LatitudeLongitudeItem(39.987535591453614, 116.31277609673334));
            add(new LatitudeLongitudeItem(39.98751897148007, 116.31277075379246));
            add(new LatitudeLongitudeItem(39.98750061760707, 116.31276895784318));
            add(new LatitudeLongitudeItem(39.98748250905066, 116.3127759598046));
            add(new LatitudeLongitudeItem(39.987465617581016, 116.31278125845758));
            add(new LatitudeLongitudeItem(39.987451632561886, 116.31277870150852));
            add(new LatitudeLongitudeItem(39.9874410248372, 116.31278600502412));
            add(new LatitudeLongitudeItem(39.9874275061571, 116.31279282719777));
            add(new LatitudeLongitudeItem(39.98740945651578, 116.31279345621506));
            add(new LatitudeLongitudeItem(39.98739082501979, 116.31279303302054));
            add(new LatitudeLongitudeItem(39.987372347959145, 116.31279515501922));
            add(new LatitudeLongitudeItem(39.98735661686243, 116.31280638587995));
            add(new LatitudeLongitudeItem(39.98734429214715, 116.31280971109634));
            add(new LatitudeLongitudeItem(39.98733816411084, 116.31281098291439));
            add(new LatitudeLongitudeItem(39.987328980187264, 116.3128146892996));
            add(new LatitudeLongitudeItem(39.9873188888494, 116.31281415695291));
            add(new LatitudeLongitudeItem(39.987305700175064, 116.3128152274772));
            add(new LatitudeLongitudeItem(39.987291758871315, 116.31281480487131));
            add(new LatitudeLongitudeItem(39.98728017352066, 116.31280625603877));
            add(new LatitudeLongitudeItem(39.98726989071813, 116.31279914028434));
            add(new LatitudeLongitudeItem(39.98725615753981, 116.31279763550475));
            add(new LatitudeLongitudeItem(39.9872414802865, 116.31279955757326));
            add(new LatitudeLongitudeItem(39.987223541574366, 116.31280071768423));
            add(new LatitudeLongitudeItem(39.98720762769643, 116.31279886191786));
            add(new LatitudeLongitudeItem(39.98719197773539, 116.31279925074763));
            add(new LatitudeLongitudeItem(39.98717451872911, 116.31280023055213));
            add(new LatitudeLongitudeItem(39.987153885190565, 116.31280442649728));
            add(new LatitudeLongitudeItem(39.98713324124375, 116.3128141336467));
            add(new LatitudeLongitudeItem(39.98711505429452, 116.31282205747979));
            add(new LatitudeLongitudeItem(39.987096837414875, 116.31283002139205));
            add(new LatitudeLongitudeItem(39.98708104244965, 116.31283902772915));
            add(new LatitudeLongitudeItem(39.98706786800837, 116.31285401656504));
            add(new LatitudeLongitudeItem(39.98705202159636, 116.31286219120857));
            add(new LatitudeLongitudeItem(39.987035213033245, 116.31287489494757));
            add(new LatitudeLongitudeItem(39.98702421877757, 116.31289567585517));
            add(new LatitudeLongitudeItem(39.98701432476587, 116.31291656713483));
            add(new LatitudeLongitudeItem(39.98699927270678, 116.31292721692783));
            add(new LatitudeLongitudeItem(39.98698500672295, 116.31294133388099));
            add(new LatitudeLongitudeItem(39.98697098073467, 116.31295544084826));
            add(new LatitudeLongitudeItem(39.986956465305894, 116.31296987843194));
            add(new LatitudeLongitudeItem(39.986944335637624, 116.31298756293319));
            add(new LatitudeLongitudeItem(39.986932083034255, 116.31300356399603));
            add(new LatitudeLongitudeItem(39.986920326174435, 116.3130171101241));
            add(new LatitudeLongitudeItem(39.98690678739229, 116.3130295938678));
            add(new LatitudeLongitudeItem(39.98689763272436, 116.31304433276085));
            add(new LatitudeLongitudeItem(39.98688831207335, 116.31306137633636));
            add(new LatitudeLongitudeItem(39.98688046403966, 116.31307988308626));
            add(new LatitudeLongitudeItem(39.986876767966905, 116.31310514413977));
            add(new LatitudeLongitudeItem(39.98687106290205, 116.3131252945291));
            add(new LatitudeLongitudeItem(39.98686079542388, 116.31314989343322));
            add(new LatitudeLongitudeItem(39.986858889076515, 116.31316921262172));
            add(new LatitudeLongitudeItem(39.986854232114965, 116.31318824087982));
            add(new LatitudeLongitudeItem(39.98684858067278, 116.31320472382409));
            add(new LatitudeLongitudeItem(39.98683984383498, 116.31322391191219));
            add(new LatitudeLongitudeItem(39.9868398522135, 116.31324015508869));
            add(new LatitudeLongitudeItem(39.98685084937632, 116.31325553738787));
            add(new LatitudeLongitudeItem(39.98685242456377, 116.31326993687946));
            add(new LatitudeLongitudeItem(39.98685730683067, 116.31328256329186));
            add(new LatitudeLongitudeItem(39.98686130149626, 116.3132958706661));
            add(new LatitudeLongitudeItem(39.98686584838728, 116.31331211337971));
            add(new LatitudeLongitudeItem(39.98686700716253, 116.3133284972699));
            add(new LatitudeLongitudeItem(39.98687179501637, 116.31335003190297));
            add(new LatitudeLongitudeItem(39.98687527438965, 116.31337257782425));
            add(new LatitudeLongitudeItem(39.986878959501415, 116.31339274854693));
            add(new LatitudeLongitudeItem(39.98688105284868, 116.31341751924421));
            add(new LatitudeLongitudeItem(39.98688637970345, 116.31344985622464));
            add(new LatitudeLongitudeItem(39.98689076796314, 116.31348298485659));
            add(new LatitudeLongitudeItem(39.98691380498138, 116.31350960062774));
            add(new LatitudeLongitudeItem(39.98691564163416, 116.3135304138734));
            add(new LatitudeLongitudeItem(39.98692362508823, 116.31355505524276));
            add(new LatitudeLongitudeItem(39.98693872532481, 116.3135493642188));
            add(new LatitudeLongitudeItem(39.986948919342616, 116.31355701179557));
            add(new LatitudeLongitudeItem(39.98696236795533, 116.3135786881616));
            add(new LatitudeLongitudeItem(39.98697663564893, 116.31359993312934));
            add(new LatitudeLongitudeItem(39.986987749119975, 116.31361304152655));
            add(new LatitudeLongitudeItem(39.98698888846838, 116.3136294768796));
            add(new LatitudeLongitudeItem(39.987000234921024, 116.313638597008));
            add(new LatitudeLongitudeItem(39.987015845011134, 116.31364969172321));
            add(new LatitudeLongitudeItem(39.98703159143593, 116.31365869216137));
            add(new LatitudeLongitudeItem(39.9870521233656, 116.31366501771252));
            add(new LatitudeLongitudeItem(39.987067503116944, 116.31367592201448));
            add(new LatitudeLongitudeItem(39.9870823156945, 116.3136884495793));
            add(new LatitudeLongitudeItem(39.987092495395094, 116.31369944341891));
            add(new LatitudeLongitudeItem(39.98709942856878, 116.31371249107038));
            add(new LatitudeLongitudeItem(39.98711052356355, 116.31372077947601));
            add(new LatitudeLongitudeItem(39.98712274935672, 116.31372379720352));
            add(new LatitudeLongitudeItem(39.98713319613221, 116.31372741594224));
            add(new LatitudeLongitudeItem(39.98714543751821, 116.31373062021486));
            add(new LatitudeLongitudeItem(39.98715684147322, 116.31373530742849));
            add(new LatitudeLongitudeItem(39.98716891849932, 116.31374072828797));
            add(new LatitudeLongitudeItem(39.98717088036862, 116.31373821310485));
            add(new LatitudeLongitudeItem(39.98718520269653, 116.31374020694073));
            add(new LatitudeLongitudeItem(39.98719059255305, 116.31374276796769));
            add(new LatitudeLongitudeItem(39.98720167123558, 116.31374152806258));
            add(new LatitudeLongitudeItem(39.98721986605382, 116.31373815341198));
            add(new LatitudeLongitudeItem(39.987240210643776, 116.31373759866116));
            add(new LatitudeLongitudeItem(39.987253947953, 116.31373674657915));
            add(new LatitudeLongitudeItem(39.987267308201424, 116.31373757790695));
            add(new LatitudeLongitudeItem(39.98728229517504, 116.31373650552925));
            add(new LatitudeLongitudeItem(39.98730003370358, 116.3137352551845));
            add(new LatitudeLongitudeItem(39.9873161093151, 116.31373438129749));
            add(new LatitudeLongitudeItem(39.987331302833134, 116.31373233489251));
            add(new LatitudeLongitudeItem(39.98734397185758, 116.31373148473442));
            add(new LatitudeLongitudeItem(39.987355032943945, 116.31372684686407));
            add(new LatitudeLongitudeItem(39.98736846143683, 116.31372867614293));
            add(new LatitudeLongitudeItem(39.98738174521113, 116.31372581988955));
            add(new LatitudeLongitudeItem(39.98739714448307, 116.31372234853244));
            add(new LatitudeLongitudeItem(39.98741007530724, 116.31371981880004));
            add(new LatitudeLongitudeItem(39.98742102680679, 116.31371471970428));
            add(new LatitudeLongitudeItem(39.98743648782353, 116.31370924039368));
            add(new LatitudeLongitudeItem(39.987451314176745, 116.31370681727756));
            add(new LatitudeLongitudeItem(39.987465552316735, 116.31370542620633));
            add(new LatitudeLongitudeItem(39.9874806890872, 116.31370323360247));
            add(new LatitudeLongitudeItem(39.98749365530914, 116.31369507848854));
            add(new LatitudeLongitudeItem(39.98750596512621, 116.31368898753003));
            add(new LatitudeLongitudeItem(39.98751905378201, 116.31368791697307));
            add(new LatitudeLongitudeItem(39.98753305178962, 116.31368645572826));
            add(new LatitudeLongitudeItem(39.98755042193937, 116.31368613725134));
            add(new LatitudeLongitudeItem(39.987567092552624, 116.31368609926238));
            add(new LatitudeLongitudeItem(39.9875867851179, 116.31368710379168));
            add(new LatitudeLongitudeItem(39.987604903155706, 116.31369126460145));
            add(new LatitudeLongitudeItem(39.98761787164848, 116.31369010384425));
            add(new LatitudeLongitudeItem(39.987632731941524, 116.31368992534006));
            add(new LatitudeLongitudeItem(39.98764669912184, 116.31368799312476));
            add(new LatitudeLongitudeItem(39.987662415688476, 116.31368567032719));
            add(new LatitudeLongitudeItem(39.98767866102895, 116.31368263613605));
            add(new LatitudeLongitudeItem(39.98769114273511, 116.313677617401));
            add(new LatitudeLongitudeItem(39.98770468077708, 116.31367618616046));
            add(new LatitudeLongitudeItem(39.98771931956727, 116.31367515588067));
            add(new LatitudeLongitudeItem(39.98773505460674, 116.31367766299722));
            add(new LatitudeLongitudeItem(39.9877559960986, 116.31367802636711));
            add(new LatitudeLongitudeItem(39.98777856851866, 116.31367888094942));
            add(new LatitudeLongitudeItem(39.98779848214793, 116.31368048674015));
            add(new LatitudeLongitudeItem(39.987815647967096, 116.3136834048798));
            add(new LatitudeLongitudeItem(39.987830546910104, 116.31368815649844));
            add(new LatitudeLongitudeItem(39.987845923726766, 116.31368598396666));
            add(new LatitudeLongitudeItem(39.987848523375185, 116.31368002205734));
            add(new LatitudeLongitudeItem(39.98785179162798, 116.31367324856718));
            add(new LatitudeLongitudeItem(39.987842094464504, 116.31365798603576));
            add(new LatitudeLongitudeItem(39.98784471325526, 116.31365153312511));
            add(new LatitudeLongitudeItem(39.98785986155602, 116.31365591401112));
            add(new LatitudeLongitudeItem(39.98787628314371, 116.31365643714223));
            add(new LatitudeLongitudeItem(39.98789270042596, 116.31365450523597));
            add(new LatitudeLongitudeItem(39.9879076960333, 116.31365165125997));
            add(new LatitudeLongitudeItem(39.98792466664197, 116.31365160328818));
            add(new LatitudeLongitudeItem(39.987942910290194, 116.31365325897104));
            add(new LatitudeLongitudeItem(39.98796102003193, 116.3136526900733));
            add(new LatitudeLongitudeItem(39.98797830664726, 116.31365035745407));
            add(new LatitudeLongitudeItem(39.98799500346691, 116.31364815502813));
            add(new LatitudeLongitudeItem(39.98800608536272, 116.31364897810535));
            add(new LatitudeLongitudeItem(39.988020496393645, 116.31364923042888));
            add(new LatitudeLongitudeItem(39.98803616158964, 116.31364612602336));
            add(new LatitudeLongitudeItem(39.98805389325113, 116.3136409576431));
            add(new LatitudeLongitudeItem(39.98807064930059, 116.31363831432064));
            add(new LatitudeLongitudeItem(39.988087090084, 116.31363267481314));
            add(new LatitudeLongitudeItem(39.98810232348875, 116.31362855827868));
            add(new LatitudeLongitudeItem(39.98811629151884, 116.3136214053586));
            add(new LatitudeLongitudeItem(39.98812844483778, 116.31361160678674));
            add(new LatitudeLongitudeItem(39.98814208741141, 116.31360134745879));
            add(new LatitudeLongitudeItem(39.988153541238596, 116.31358614773005));
            add(new LatitudeLongitudeItem(39.98816463769798, 116.31357816275093));
            add(new LatitudeLongitudeItem(39.98817582943883, 116.31356748225994));
            add(new LatitudeLongitudeItem(39.98818758057239, 116.31355644110234));
            add(new LatitudeLongitudeItem(39.98819630772819, 116.3135489067549));
            add(new LatitudeLongitudeItem(39.98820376253294, 116.31354005955902));
            add(new LatitudeLongitudeItem(39.98821104605047, 116.31353048084452));
            add(new LatitudeLongitudeItem(39.988219921074055, 116.31352172401525));
            add(new LatitudeLongitudeItem(39.98822937447286, 116.31351202533067));
            add(new LatitudeLongitudeItem(39.98823759355809, 116.31349989150551));
            add(new LatitudeLongitudeItem(39.98824402857174, 116.31348547278054));
            add(new LatitudeLongitudeItem(39.9882515311237, 116.31346962125996));
            add(new LatitudeLongitudeItem(39.98825810113155, 116.31345804838773));
            add(new LatitudeLongitudeItem(39.98826266023689, 116.31344029260967));
            add(new LatitudeLongitudeItem(39.98827092730334, 116.31342699643032));
            add(new LatitudeLongitudeItem(39.98827396930074, 116.31341092391861));
            add(new LatitudeLongitudeItem(39.988274764169375, 116.31338511120342));
            add(new LatitudeLongitudeItem(39.98827871379571, 116.31336765599181));
            add(new LatitudeLongitudeItem(39.98828487079056, 116.31335435956849));
            add(new LatitudeLongitudeItem(39.98828855304278, 116.31333840740844));
            add(new LatitudeLongitudeItem(39.98829319617946, 116.3133229363579));
            add(new LatitudeLongitudeItem(39.98829552484524, 116.31330495990132));
            add(new LatitudeLongitudeItem(39.98829699435656, 116.31328748436782));
            add(new LatitudeLongitudeItem(39.9883005187906, 116.31327277475015));
            add(new LatitudeLongitudeItem(39.98830436019424, 116.31325632161486));
            add(new LatitudeLongitudeItem(39.98830637765801, 116.31323765373307));
            add(new LatitudeLongitudeItem(39.988305226712534, 116.31321996746652));
            add(new LatitudeLongitudeItem(39.9883040312372, 116.31319968590219));
            add(new LatitudeLongitudeItem(39.9883018759914, 116.31317955453318));
            add(new LatitudeLongitudeItem(39.98829832328385, 116.31316090602431));
            add(new LatitudeLongitudeItem(39.98829647855288, 116.31314105528394));
            add(new LatitudeLongitudeItem(39.98829404665112, 116.31311710611787));
            add(new LatitudeLongitudeItem(39.98828988771233, 116.31309489028303));
            add(new LatitudeLongitudeItem(39.98829090273932, 116.31307493909844));
            add(new LatitudeLongitudeItem(39.98828852287381, 116.31305221208916));
            add(new LatitudeLongitudeItem(39.98828206251863, 116.31303500595729));
            add(new LatitudeLongitudeItem(39.98827308214679, 116.31301779976667));
            add(new LatitudeLongitudeItem(39.98826678184424, 116.31297235388618));
            add(new LatitudeLongitudeItem(39.98826776981186, 116.31295418575655));
            add(new LatitudeLongitudeItem(39.988260043756456, 116.31293941471178));
            add(new LatitudeLongitudeItem(39.98826011016271, 116.31292610637293));
            add(new LatitudeLongitudeItem(39.988259273061, 116.3129108038658));
            add(new LatitudeLongitudeItem(39.98823907794416, 116.31289662372842));
            add(new LatitudeLongitudeItem(39.98822825709786, 116.31288490853277));
            add(new LatitudeLongitudeItem(39.988216133931834, 116.31287189052634));
            add(new LatitudeLongitudeItem(39.98820199976124, 116.31285834119086));
            add(new LatitudeLongitudeItem(39.98818812418738, 116.31284972191958));
            add(new LatitudeLongitudeItem(39.98817380363797, 116.312843998484));
            add(new LatitudeLongitudeItem(39.98816861809955, 116.31283542915291));
            add(new LatitudeLongitudeItem(39.98814222287895, 116.3128270700995));
            add(new LatitudeLongitudeItem(39.98812412483393, 116.31281712761468));
            add(new LatitudeLongitudeItem(39.98811912464338, 116.31281162454614));
            add(new LatitudeLongitudeItem(39.988103742076, 116.31280051035351));
            add(new LatitudeLongitudeItem(39.98809902503668, 116.31279681098835));
            add(new LatitudeLongitudeItem(39.98808293305849, 116.31279030574696));
            add(new LatitudeLongitudeItem(39.988076847506736, 116.31279174633163));
            add(new LatitudeLongitudeItem(39.98806885562653, 116.31278534105758));
            add(new LatitudeLongitudeItem(39.988041186968256, 116.31276377957242));
            add(new LatitudeLongitudeItem(39.98803448913473, 116.31276666912607));
            add(new LatitudeLongitudeItem(39.988029840050235, 116.31276753905879));
            add(new LatitudeLongitudeItem(39.988017377593526, 116.31276116690342));
            add(new LatitudeLongitudeItem(39.98801334613636, 116.31275740579398));
            add(new LatitudeLongitudeItem(39.987997724195915, 116.31274740399665));
            add(new LatitudeLongitudeItem(39.98797328913101, 116.31275057864153));
            add(new LatitudeLongitudeItem(39.98795957317161, 116.31275122229727));
            add(new LatitudeLongitudeItem(39.98794357317161, 116.31275222229727));
            add(new LatitudeLongitudeItem(39.98792916161092, 116.3127545696661));
        }

        ;
    };

    public float duration = 0;
    public int step = 0;
    public List<LatitudeLongitudeItem> detail;

    public float distance;
    public float pace;
    public float stride_frequency;

    private static float __point_delta() {
        return (float) ((Math.random() - 0.5) * 2 * 0.000015);
    }

    private static float __pace_delta() {
        return (float) ((Math.random() - 0.5) * 2 * 0.1);
    }

    private static float __stride_frequency_delta() {
        return (float) ((Math.random() - 0.5) * 2 * 15);
    }

    private void __point_generator(List<LatitudeLongitudeItem> points_per_loop) throws Exception {
        int points_num_per_loop = (int) (0.4 * pace * 60);
        if (points_num_per_loop > points_per_loop.size()) {
            throw new Exception(String.format("'pace' should be more than %.2f (min/km) !", ((float) points_per_loop.size() / 0.4 / 60)));
        }
        float total_loop = (float) (((float) distance) / 0.4);
        float current_loop = 0f;
        while (current_loop < total_loop) {

            points_num_per_loop = (int) (0.4 * (pace + __pace_delta()) * 60);
            for (int i = 0; i < (points_num_per_loop); i++) {
                int idx = (int) (Math.floor(((float) i) / points_num_per_loop * points_per_loop.size()));
                LatitudeLongitudeItem point = new LatitudeLongitudeItem(points_per_loop.get(idx).latitude + __point_delta(), points_per_loop.get(idx).longitude + __point_delta());
                detail.add(point);

                current_loop += 1. / points_num_per_loop;
                if (current_loop >= total_loop) {
                    // necessary
                    break;
                }
            }
        }
    }

    private void __build() throws Exception {

        this.duration = (int) (
                this.distance
                * this.Distance_Per_Loop
                / 0.4
                * (this.pace + this.__pace_delta())
                * 60
        );
        this.step = (int) (
                (this.stride_frequency + this.__stride_frequency_delta()) * this.duration / 60
        );
        this.__point_generator(oneCircle);
    }

    public Record(float distance, float pace, float stride_frequency) throws Exception {
        this.detail = new ArrayList<>();
        this.distance = distance;
        this.pace = pace;
        this.stride_frequency = stride_frequency;
        this.__build();
    }
}
