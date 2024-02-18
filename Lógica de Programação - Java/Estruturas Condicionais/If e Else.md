### Conceito da Estrutura Condicional
Estrutura de controle que define que um certo bloco de comandos só é executado dependendo de uma condição

### Sintaxe

```java
if(<condição>){
    <comando 1>
    <comando 2>
} 
else {
    <comando 3>
    <comando 4>
}
```

- V executa o IF e F executa o ELSE

O **else if** pode ser usado no encadeamento de estruturas condicionais, funcionaria assim:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Que horas são?");
        int hora = sc.nextInt();

        if(hora < 12){
            System.out.println("Bom dia");
        } else if(hora <18){
            System.out.println("Boa tarde");
        }else{
            System.out.println("Boa noite");
        }

        sc.close();
        }
    }
```