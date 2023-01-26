import java.util.Scanner;
public class Calcu {





        public static void main(String[] args) {

            Scanner input=new Scanner(System.in);
            double radius,area;
            double pi=3.14;
            System.out.println("enter radius");

            radius=input.nextDouble();
            area=pi*radius*radius;

            System.out.print(area);

        }



    }








