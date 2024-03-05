## Do while
- menos utilizada, mas as vezes se encaixa melhor ao problema
- os blocos são executados pelo menos uma vez, pois a condição é **verificada no final**

### Sintaxe

```java
do{
    <comando 1>
    <comando 2>
}while (condição);
```

- Condição V = volta
- Condição F = pula fora

Funcionaria assim:

```java
        char resp;

        do {
            System.out.println("Digite a temperatura em Celsius");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.println("Equivalente em Fahrenheit: " + F);
            System.out.println("Deseja repetir? (s/n): ");
            resp = sc.next().charAt(0);
        }while(resp != 'n');
```