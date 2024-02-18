## Operações básicas

```java
        int a = 10;
        int b = 5;
        
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int resto = a % b;
``` 

## Funções matemáticas

| Exemplo           | Significado               |
|-------------------|---------------------------|
|A = Math.sqrt(x);  |A = raiz quadrada de x     |
|A = Math.pow(x, y);|A = x elevado a y          |
|A = Math.abs(x);   |A = valor absoluto de x    |

```java
        public class Main {
    public static void main(String[] args) {

        double x = 9.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.pow(x, y);
        C = Math.abs(z); // valor absoluto é o valor sem o sinal -, caso seja negativo

        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println("Valor absoluto de " + z + " = " + C);
        }
    }
``` 