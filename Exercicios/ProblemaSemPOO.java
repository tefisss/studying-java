/*Resolvendo um problema em JAVA sem POO:
Programa que lê medidas de dois triângulos e mostra o valor das àreas desses triângulos, 
em seguida diz qual o triângulo com a maior área*/

import java.util.Scanner;

public class ProblemaSemPOO {

	public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Insira as medidas do triângulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Insira as medidas do triângulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(p* ( p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2;
        double areaY = Math.sqrt(p* ( p - yA) * (p - yB) * (p - yC));

        System.out.printf("Area do triangulo X: %.3f%n", areaX);
        System.out.printf("Area do triangulo Y: %.3f%n", areaY);

        if(areaX > areaY) {
            System.out.println("X tem a maior área");
        }else{
            System.out.println("Y tem a maior área");
        }

        sc.close();
    }
}