import java.lang.Math;
import java.util.Scanner;
public class Personal {
    String name;
    double ra;
    public Personal(String name){
        System.out.println("Personal 1");
    }
    public void train(String n, int cpf){
        Scanner s = new Scanner(System.in);
        System.out.printf("What is your bodytype? ");
        Client c2 = new Client(s.next(), n);
        System.out.println("=================================\nYour name is "+n);
        System.out.println("Your code is "+ Math.random()*10*cpf);
        System.out.println("Fine!");
    }
}
