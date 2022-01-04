import java.util.Scanner;

public class decToHexa {
    public decToHexa(){

    }
    public void dec(){
        int rem;
        Scanner scan = new Scanner(System.in);
        char[] hexa = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String hexaValue = "";
        System.out.println("Enter a number: ");
        int userNum = scan.nextInt();

        while(userNum > 0){
            rem = userNum % 16;
            hexaValue = hexa[rem] + hexaValue;
            userNum = userNum/16;
        }
        System.out.println("Hexa Value is: " + hexaValue);
    }
}
