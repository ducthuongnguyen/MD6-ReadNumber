import java.util.ArrayList;
import java.util.Arrays;

public class demo {
    public static final String KHONG = "khong";
    public static final String MOT = "mot";
    public static final String HAI = "hai";
    public static final String BA = "ba";
    public static final String BON = "bon";
    public static final String NAM = "nam";
    public static final String SAU = "sau";
    public static final String BAY = "bay";
    public static final String TAM = "tam";
    public static final String CHIN = "chin";
    public static final String LAM = "lam";
    public static final String LE = "le";
    public static final String MUOI = "muoi";
//    public static final String MUOIF = "mười";
//    public static final String MOTS = "mot";
    public static final String TRAM = "tram";
    public static final String NGHIN = "nghin";
    public static final String TRIEU = "trieu";
    public static final String TY = "ty";


    public static final String [] number = {KHONG, MOT, HAI, BA,
            BON, NAM, SAU, BAY, TAM, CHIN};

    public static ArrayList<String> numberToString(String a)
    {
        ArrayList<String> result = new ArrayList<String>();
        ArrayList<String> List_Num = Split(a, 3);
        while (List_Num.size() != 0)
        {
            switch (List_Num.size() % 3) {
                case 1:
                    result.addAll(read_3num(List_Num.get(0)));
                    break;
                case 2:
                    ArrayList<String> nghin = read_3num(List_Num.get(0));
                    if(!nghin.isEmpty()){
                        result.addAll(nghin);
                        result.add(NGHIN);
                    }
                    break;
                case 0:
                    ArrayList<String> trieu = read_3num(List_Num.get(0));
                    if(!trieu.isEmpty()) {
                        result.addAll(trieu);
                        result.add(TRIEU);
                    }
                    break;
            }
            if (List_Num.size() == (List_Num.size() / 3) * 3 + 1 && List_Num.size() != 1) result.add(TY);
            List_Num.remove(0);
        }
        return result;
    }
    public static ArrayList<String> read_3num(String a)
    {
        ArrayList<String> result = new ArrayList<String>();
        int num = -1;
        try{ num = Integer.parseInt(a); } catch(Exception ex){}
        if (num == 0) return result;
        int hang_tram = -1;
        try{ hang_tram = Integer.parseInt(a.substring(0, 1)); } catch(Exception ex){}
        int hang_chuc = -1;
        try{ hang_chuc = Integer.parseInt(a.substring(1, 2)); } catch(Exception ex){}
        int hang_dv = -1;
        try{ hang_dv = Integer.parseInt(a.substring(2, 3)); } catch(Exception ex){}
        if (hang_tram != -1){
            result.add(number[hang_tram]);
            result.add(TRAM);
        }
        switch (hang_chuc)
        {
            case -1:
                break;
//            case 1:
//                result.add(MUOIF);
//                break;
            case 0:
                if (hang_dv != 0) result.add(LE);
                break;
            default:
                result.add(number[hang_chuc]);
                result.add(MUOI);
                break;
        }
        switch (hang_dv)
        {
            case -1:
                break;
//            case 1:
//                if ((hang_chuc != 0) && (hang_chuc != 1) && (hang_chuc != -1))
//                    result.add(MOTS);
//                else result.add(number[hang_dv]);
//                break;
            case 5:
                if ((hang_chuc != 0) && (hang_chuc != -1))
                    result.add(LAM);
                else result.add(number[hang_dv]);
                break;
            case 0:
                if (result.isEmpty()) result.add(number[hang_dv]);
                break;
            default:
                result.add(number[hang_dv]);
                break;
        }
        return result;
    }

    public static ArrayList<String> Split(String str, int chunkSize)    {
        int du = str.length() % chunkSize;
        if (du != 0)
            for (int i = 0; i < (chunkSize - du); i++) str = "#" + str;
        return splitStringEvery(str, chunkSize);
    }

    public static ArrayList<String> splitStringEvery(String s, int interval) {
        ArrayList<String> arrList = new ArrayList<String>();
        int arrayLength = (int) Math.ceil(((s.length() / (double) interval)));
        String[] result = new String[arrayLength];
        int j = 0;
        int lastIndex = result.length - 1;
        for (int i = 0; i < lastIndex; i++) {
            result[i] = s.substring(j, j + interval);
            j += interval;
        }
        result[lastIndex] = s.substring(j);
        arrList.addAll(Arrays.asList(result));
        return arrList;
    }

    public static void main(String[] args) {
        ArrayList<String> kq = numberToString("90");
        for (int i = 0; i < kq.size(); i++) {
            System.out.print(kq.get(i)+ " ");
        }
    }
}
