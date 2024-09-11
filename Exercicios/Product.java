

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double TotalValueInStock(){
        return price * quantity;
    }

    public void AddProducts(int quantity){
        this.quantity += quantity;  //this significa autoreferência da classe, garantindo que não se refere aos parâmetros que recebe
    }

    public void RemoveProducts(int quantity){
        this.quantity -= quantity;
    }
}
