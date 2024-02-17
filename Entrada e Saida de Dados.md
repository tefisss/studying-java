# Entrada de Dados

## Na entrada de dados, criamos uma variavel do tipo "Scanner" da seguinte forma: 

```java
import java.util.Scanner; // necessário colocar no inicio do programa

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); \\ associa o objeto Scanner ao console
        String x;

        System.out.println("Digite:");
        x = sc.next(); // forma de receber a STRING
        System.out.println("Você digitou " + x);

        sc.close(); // função que desaloca/encerra o que foi criado
        }
    }
```

- Pra fazer o mesmo processo com números inteiros, apenas substituimos o __sc.next();__ por **sc.nextInt();**
- Pra fazer o mesmo processo com números decimais, apenas substituimos o **sc.next();** por **sc.nextDouble();**
- Pra fazer o mesmo processo com um caractere, apenas acrescentamos o **sc.next();** como **sc.next().charAt(0);**

Para os números decimais, é válido ressaltar que o separador varia da localidade do sistema. No meu caso, está no modo brasileiro onde o separador utilizado é a vírgula. Se quisermos utilizar o ponto como separador, precisamos utilizar a função **Locale.setDefault(Locale.US);**