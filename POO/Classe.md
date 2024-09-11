# Classe

### É um **tipo estruturado** com membros que podem ser
 - Atributos (campos)
 - Métodos (funções)
 - Construtores
 - Sobrecarga
 - Encapsulamento
 - Herança
 - Polimorfismo

No ProblemaSemPOO, calculamos a área de dois triângulos por meio de variáveis como xA, xB, xC, yA, yB e yC. Porém 
com POO, podemos criar um objeto triângulo, já que ambos teriam os mesmos dados. Então é só instanciá-los no programa 
com o "tipo" triângulo. Funciona assim: 

```java
public class Triangulo{
    public double ladoA;
    public double ladoB;
    public double ladoC;
}
```

### Esse objeto será instanciado assim:

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
    }
}
```

