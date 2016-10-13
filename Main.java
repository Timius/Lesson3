/**
 * Created by User on 12.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        double n = 874.32;
        double i;
        i = n * 100;
        int s1 = (int)i/10000;
        i-=s1*10000;
        int s2 = (int)i/1000;
        i = i-s2*1000;  //для разнообразия другим способом вычил
        int s3 = (int)i/100;
        i-=s3*100;
        int s4 = (int)i/10;
        i-=s4*10;
        int s5 = (int)i;
        int s = s1+s2+s3+s4+s5;
        System.out.println("Сумма цифр числа n = " + s);

        int max = Math.max(s5,(Math.max(s4,Math.max(s3,(Math.max(s1,s2))))));
        System.out.println("Max цифра числа n = " + max);
        int min = Math.min(s5,(Math.min(s4,Math.min(s3,(Math.min(s1,s2))))));
        System.out.println("Min цифра числа n = " + min);
    }
}
