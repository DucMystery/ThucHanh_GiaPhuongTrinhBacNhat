import java.util.Scanner;

public class solve {
    public static void main(String[] args){
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");

        Scanner scanner = new Scanner(System.in);

        System.out.println("a:");
        double a = scanner.nextDouble();
        System.out.println("b:");
        double b = scanner.nextDouble();
        System.out.println("c:");
        double c = scanner.nextDouble();

        if (a!=0){
            double answer = (c-b)/a;
            System.out.println("Answer : "+answer);
        }else if (a==0){
            System.out.println("Phuuong trinh vo nghiem!");
        }else if ((b-c)==0){
            System.out.println("Phuuong trinh vo so nghiem!");
        }

    }
}
