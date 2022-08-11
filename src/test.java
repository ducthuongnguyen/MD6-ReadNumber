import java.util.HashMap;

class test {
    public static void main(String[] args) {
        numberToString(12);
    }

    static String numberToString(Integer a) {
        String result = "";
        Integer integer = Integer.valueOf(a);
        String[] numArray = integer.toString().split("");
        for (String s : numArray) {
            System.out.println(s);
        }
        if (numArray.length == 1) {
            result += numberMap.get(numArray[0]);
        }
        if (numArray.length == 2) {
            if (numArray[0].equals("1")) {
                result = "muoi " + numberMap.get(numArray[1]);
            }
//            else if (numArray[1].equals("0")) {
//                result = numberMap.get(numArray[0]) + " muoi ";
//            }
        else {
                result = numberMap.get(numArray[0]) + " muoi " + numberMap.get(numArray[1]);
            }
        }

        System.out.println(result);
        return result;
    }

    public static HashMap<String, String> numberMap = new HashMap<String, String>() {
        {
            put("0", "khong");
            put("1", "mot");
            put("2", "hai");
            put("3", "ba");
            put("4", "bon");
            put("5", "nam");
            put("6", "sau");
            put("7", "bay");
            put("8", "tam");
            put("9", "chin");
        }
    };


    public static HashMap<String, String> subMap = new HashMap<String, String>() {
        {
            put("2", "muoi");
            put("3", "tram");
            put("4", "nghin");
            put("5", "muoi");
            put("6", "tram");
            put("7", "trieu");
            put("8", "muoi");
            put("9", "tram");
            put("10", "ty");
            put("11", "muoi");
            put("12", "tram");
            put("13", "nghin");
            put("14", "muoi");
            put("15", "tram");
        }
    };
}
