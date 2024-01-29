
//get detail
//print detail
//calculate detail
import java.util.*;

import javax.lang.model.util.ElementScanner6;

import org.omg.PortableInterceptor.NON_EXISTENT;

class GetDetail {
    int javaM;
    int cM;
    int osM;
    int nwM;

    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("^_^ It is a Result ^_^");

        System.out.println("Enter a name : ");
        String nm = sc.nextLine();

    }
}

class PrintDetail extends GetDetail {
    void printData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a marks of JAVA : ");
        javaM = sc.nextInt();
        System.out.println("Enter a marks of C# : ");
        cM = sc.nextInt();
        System.out.println("Enter a marks of OS : ");
        osM = sc.nextInt();
        System.out.println("Enter a marks of N/W : ");
        nwM = sc.nextInt();
        int sum = javaM + cM + osM + nwM;
        System.out.println("Your total is : " + sum);
        int avg = sum / 4;
        System.out.println("Your avrage is : " + avg);
        if (avg <= 100 && avg > 80) {
            System.out.println("Great : A -> Successfully Pass, Nice...!");
        } else if (avg <= 80 && avg > 60) {
            System.out.println("Great : B -> Successfully Pass, Nice...!");
        } else if (avg <= 60 && avg > 40) {
            System.out.println("Great : C -> Successfully Pass, Nice...!");
        } else if (avg <= 40) {
            System.out.println("Successfully Fail, Nice...!");
        } else {
            System.out.println("Yours university....?");
        }
    }
}

public class Result {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        PrintDetail pd = new PrintDetail();
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            pd.getData();
            pd.printData();
        }
    }
}
