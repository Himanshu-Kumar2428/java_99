package UNIT_3;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
//        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size :");
        int a[]=new int[sc.nextInt()];

        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+ " ");
        }

    }
}
