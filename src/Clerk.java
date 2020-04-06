import java.lang.Math;
import java.util.Scanner;
public class Clerk {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Client c1 = new Client();
        System.out.printf("Ready to register...\nInform name: ");
        c1.name = scan.next();
        System.out.printf("Already done, inform cpf: ");
        c1.cpf = scan.nextInt();
        System.out.println("==========================================");
        double code = Math.random()*10*c1.cpf;
        System.out.println("Given code is 2020"+ code);
        Personal p1 = new Personal("John");
        p1.train(c1.name, c1.cpf);
    }
    public void train(){


        System.out.println("User settings: ");
        System.out.println("Name: ");
    }
}
