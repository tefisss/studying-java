#Métodos

Uma forma bem mais prática de processar a área é, acrescentando também o método desse cálculo na classe de triângulos.

```java
public class Triangulo{
    public double ladoA;
    public double ladoB;
    public double ladoC;

    public double area(){
        double p = (a+b+c) / 2;
        return Math.sqrt(p* (p-a) * (p-b) * (p-c));
    }
}
```

No programa ele seria utilizado dessa forma:

```java
public class Program{
    public static void mains(String[] args){
        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Insira as medidas do triângulo X: ");
        x.a = sc.nextDouble(); // pra acessar os atributos do objeto, é só usar o . 
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();
    }
}
```

