/**
 * @ClassName Main2
 * @Description TODO
 * @Author jingpeipei
 * @Date 2018/8/30 19:59
 */
import java.util.Scanner;

public class Main2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long HP = sc.nextLong();
        long nAttack = sc.nextLong();
        long bAttack = sc.nextLong();

        if (bAttack <= (nAttack << 1))
            System.out.println((int)Math.ceil((float)HP / nAttack));
        else{
            if ((HP % bAttack) == 0)
                System.out.println((HP / bAttack) << 1);
            else if ((HP % bAttack) > nAttack)
                System.out.println((HP / bAttack + 1) << 1);
            else
                System.out.println((HP / bAttack) << 1 + 1);
        }
    }

}
