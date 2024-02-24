## While
Repete o bloco de comandos __ENQUANTO__ a condição for verdadeira
- A ideia seria usar quando não se sabe previamente a quantidade de repetições que será realizada.

### Sintaxe
```java
while(condicão){
    <comando 1>
    <comando 2>
}
```

- Condição V: executa e volta
- Condição F: pula fora do loop

```java
int x = sc.nextInt();
        int soma = 0;

        while (x != 0){
            soma += x;
            x = sc.nextInt();
        }
        System.out.println(soma);

        sc.close();
```