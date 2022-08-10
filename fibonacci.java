import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a=0,c,b=1;

        for(int i=2;i<10;i++)
        {
            c=a+b;
            System.out.print(a+" + "+b+" = "+c+"\n");
            a=b;
            b=c;
        }
        System.out.println();
        }
}
