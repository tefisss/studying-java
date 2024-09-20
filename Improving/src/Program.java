
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            Product product = new Product();
            
            System.out.println("Enter product data: ");
            System.out.print("Name: ");
            product.name = sc.nextLine(); //guarda o campo name dentro do produto
            System.out.print("Price: ");
            product.price = sc.nextDouble();
            System.out.print("Quantity in stock: ");
            product.quantity = sc.nextInt();
            
            System.out.println(product.name + ", " + product.price + ", " + product.quantity);
        }
    }
}

