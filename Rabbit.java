package text;

import java.util.Scanner;
public class Rabbit {
    public  int add(int n) {
        if(n==1||n==2) {
            return  1;
        }else {
            return add(n-1)+add(n-2);
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
        Rabbit r=new Rabbit();
        int number=in.nextInt();
        System.out.println("第"+number+"个月的兔子数为：");
        System.out.print(r.add(number));
    }
}
