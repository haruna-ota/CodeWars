//2020.05/28(Thu)
package mumbling;

import java.util.ArrayList;
import java.util.List;

public class Accumul {
    public static void main(String[] args) {
        String str = "aBcD";
        System.out.println(accum(str));
    }

    public static String accum(String s) {
        // your code
        String[] strings = s.toLowerCase().split("");
        List<String> result = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            String strList = strings[i].toUpperCase();
            for (int j = 0; j < i; j++) {
                strList = strList + strings[i];
            }
            result.add(strList);
        }
        return String.join("-", result);

        //ToDO:Streamバージョンもやる
        //mapを使って変換をかける？
        //文字の数を増やすのと先頭を大文字にする変換の2つが必要
        //メソッドを切ればいける…？
//        return "";
    }
}
