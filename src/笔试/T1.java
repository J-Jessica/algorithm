package 笔试;

/**
 * @ClassName T1
 * @Description TODO
 * @Author jingpeipei
 * @Date 2018/9/9 10:04
 */
import java.util.*;
public class T1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(maxLengthNotRepeatSubstring(str));
    }

    public static int maxLengthNotRepeatSubstring(String str) {
        if(str==null || str.isEmpty()){
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int current = 0;

        for(int index=0; index<str.length(); index++){
            if(map.containsKey(str.charAt(index))){
                current = map.get(str.charAt(index)) + 1;
            }
            else{
                if((index-current+1)>maxLength){
                    maxLength=index-current+1;
                }
            }
            map.put(str.charAt(index), index);
        }

        return maxLength;
    }
}
