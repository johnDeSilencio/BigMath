import static org.junit.Assert.*;
import static org.junit.Test.*;
import BigMath.BigMath;
import java.math.BigDecimal;

public class BigMathTest {
    
    @Test
    public void testSqrt() {
        testSqrtWithPreciseDigits(5);
        testSqrtWithPreciseDigits(10);
        testSqrtWithPreciseDigits(50);
        testSqrtWithPreciseDigits(100);
        testSqrtWithPreciseDigits(1000);
        testSqrtWithPreciseDigits(5000);
    }

    public void testSqrtWithPreciseDigits(int numberOfDigits) {
        String sqrtTwo = "1.41421356237309504880168872420969807856967187537694807317667973799073247846210703885038753432764157273501384623091229702492483605585073721264412149709993583141322266592750559275579995050115278206057147010955997160597027453459686201472851741864088919860955232923048430871432145083976260362799525140798968725339654633180882964062061525835239505474575028775996172983557522033753185701135437460340849884716038689997069900481503054402779031645424782306849293691862158057846311159666871301301561856898723723528850926486124949771542183342042856860601468247207714358548741556570696776537202264854470158588016207584749226572260020855844665214583988939443709265918003113882464681570826301005948587040031864803421948972782906410450726368813137398552561173220402450912277002269411275736272804957381089675040183698683684507257993647290607629969413804756548237289971803268024744206292691248590521810044598421505911202494413417285314781058036033710773091828693147101711116839165817268894197587165821521282295184884720896946338628915628827659526351405422676532396946175112916024087155101351504553812875600526314680171274026539694702403005174953188629256313851881634780015693691768818523786840522878376293892143006558695686859645951555016447245098368960368873231143894155766510408839142923381132060524336294853170499157717562285497414389991880217624309652065642118273167262575395947172559346372386322614827426222086711558395999265211762526989175409881593486400834570851814722318142040704265090565323333984364578657967965192672923998753666172159825788602633636178274959942194037777536814262177387991945513972312740668983299898953867288228563786977496625199665835257761989393228453447356947949629521688914854925389047558288345260965240965428893945386466257449275563819644103169798330618520193793849400571563337205480685405758679996701213722394758214263065851322174088323829472876173936474678374319600015921888073478576172522118674904249773669292073110963697216089337086611567345853348332952546758516447107578486024636008344491148185876555542864551233142199263113325179706084365597043528564100879185007603610091594656706768836055717400767569050961367194013249356052401859991050621081635977264313806054670102935699710424251057817495310572559349844511269227803449135066375687477602831628296055324224269575345290288387684464291732827708883180870253398523381227499908123718925407264753678503048215918018861671089728692292011975998807038185433325364602110822992792930728717807998880991767417741089830608003263118164279882311715436386966170299993416161487868601804550555398691311518601038637532500455818604480407502411951843056745336836136745973744239885532851793089603738989151731958741344288178421250219169518755934443873961893145499999061075870490902608835176362247497578588583680374579311573398020999866221869499225959132764236194105921003280261498745665996888740679561673918595728886424734635858868644968223860069833526427990562831656139139425576490620651860216472630333629750756978706066068564981600927187092921531323682813569889370974165044745909605374727965244770940992412387106144705439867436473384774548191008728862221495895295911878921491798339810837882781530655623158103606486758730360145022732088293513413872276841766784369052942869849083845574457940959862607424995491680285307739893829603621335398753205091998936075139064444957684569934712763645071632791547015977335486389394232572775400382602747856741725809514163071595978498180094435603793909855901682721540345815815210049366629534488271072923966023216382382666126268305025727811694510353793715688233659322978231929860646797898640920856095581426143636310046155943325504744939759339991254195323009321753044765339647066276116617535187546462096763455873861648801988484974792640450654448969100407942118169257968575637848814989864168549949163576144840470210339892153423770372333531156459443897036531667219490493518829058063074013468626416724701106534634939164071462855679801779338144240452691370666097776387848662380033923243704741153318725319060191659964553811578884138084332321053376746181217801429609283241136275254088737290512940733947943306194395693670207942951587822834932193166641113015495946983789776743444353933770995713498840789085081589236607008865810547094979046572298888089246128281601313370102908029099974564784958154561464871551639050241985790613109345878330620026220737247167668545549990499408571080992575992889323661543827195500578162513303815314657790792686850080698442847915242427544102680575632156532206188575122511306393702536292716196825125919202521605870118959673224423926742373449076464672737534796459881914980793171800242385545388603836831080077918246646275411744425001872777951816438345146346129902076334301796855438563166772351838933666704222211093914493028796381283988931173130843004212555018549850652945563776603146125590910461138476828235959247722862904264273616326458544339287726386034314980489639736332975488592568114929683612672589857383321643666348702347730261010613050729861153412994880877447311122954265275165366591173014236062652586907719821703709810464436047722673928298741525930695620638471082740821849067372330587430297092428994817392440786937528440104439904852087885191419354151290068173517030693869705900474251576552480784473621441050162008454441222559562029847259403528019067980680983003964539856859304586252606377974535599277472990648887454512424960763780108639001910580928747647207511092386059501954322816020887962151623385216128752285180252928761832570371728574067639449098254644221846543088066105802015847284067126302545937989065081685713716566859413005331970365964033766741461049563765103083661348931094780268129355733189055197052018451503996909866315251241161119259405528085649893195898345623319836834948808061715624391128663127978483719789533690152776005498055166350197855571101405552976338412750446860464766318326611651820675012047669910987219104447440326894364159594279219944235537187042995592403140917128481585438660053857135836398163094524075570093251682434416824083619792733728252154622469615332170268299509790890345948588783494396162043584224973971871139589273050921970549171769616004455808994278788803691694328945951472267229261248506961731638094108218600452861026965475763043102560271523139694821355198214097165490973199928349256740974903922971263486934145749331980417180761119639022786640759224341677624662362389131102703433045763681411283213263085822394562195980866129399962012341561763181743124200890149838485604808798646083935964923665142968125773143229145687168276219961182782695315749838026246517590541039761812876042163861345022132627277566124411336107751955577495086563606737866506231856406991228018757417854946612532759976979605977605907564891066610158384172028185304321190446577525542775437987260548817361982675816862832952607899322266836028385135122810593185910286415081570563197173151831362502435904146321223921766339826893682531505300598915470290953719326620734112349474336788469020139049784285216341442921458955828784766939464642678122190497856363552633682780518600986992489377860023987691698076566219438985443708059464333623338105874581623547560013659243524265714308346554576800237081467573252547025507476374716350678515991736937932510326827606286459146182047214863703707719269268236233347203792459646918105261391530862802914409654825638730927304265446629290458960637519187114693453619733247895727070315309309019211991999936157650035039840540674253879275279227247335667706078379113844889362613676570602636003151329520953952028548973844862561349244147086070866026763499787934208758361219471169942238484825959143045281070626015089691353030177200627170544020906695149152745977197059476954740952102878725578568800221937177435";
        String approximateSqrtTwo = BigMath.sqrt(new BigDecimal(2), numberOfDigits).toString();
        assertEquals(sqrtTwo, approximateSqrtTwo);
    }
}