/**
 * @ClassName T4
 * @Description TODO
 * @Author jingpeipei
 * @Date 2018/8/30 20:18
 */

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class T4 {
    private static ArrayList<String> list = new ArrayList<>();
    private static ArrayList<Character> word = new ArrayList<>();
    private static StringBuilder sb = new StringBuilder();
    private static int L;
    public static void helper(int n, int l, ArrayList<String> s){
        if (l == L) {
            if (!s.contains(sb)){
                list.add(sb.toString());
                return;
            }
        }
        //StringBuilder sb = new StringBuilder();
        for (int i=l; i<L; i++) {
            for (int j=0; j<n; j++) {
                sb.append(s.get(j).charAt(i));
            }
        }
        helper(n,l+1,s);
        sb.deleteCharAt(sb.length()-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        L = in.nextInt();
        //int i = 0;
        //String[] str = new String[n];
        ArrayList<String> str = new ArrayList<>();
        for (int i=0; i<n; i++){
            str.add(in.next());
        }
        helper(n,0,str);
        if (list.size() == 0)
            System.out.println("-");
        else {
            Object[] arr = list.toArray();
            Arrays.sort(arr);
            System.out.println(arr[0]);
        }
        /*List<char[]> list = new ArrayList();
        for (int i=0; i<n; i++){
            list.add(str[i].toCharArray());
        }
        StringBuffer sb = new StringBuffer();
        char[] indexch = list.get(0);
        int indexint = -1;
        int count = 0;
        out: for (int i=0; i<n; i++){
            for (int j=0; j<L; j++){
                if(list.get(i)[j]<indexch[j]){
                    if(i==indexint){
                        count++;
                    }
                    indexint = i;
                    //sb.append(list.get(i)[j]);
                    indexch[j] = list.get(i)[j];
                }
            }

        }
        for (char s : indexch) {
            sb.append(s);
        }
        if(count == L){
            System.out.println("-");
        }else {
            System.out.println(sb.toString());
        }*/


    }
}