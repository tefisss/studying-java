## For
Repete um bloco de comando PARA um certo intervalo de valor
- Usado quando sabemos a quantidade de repetições, excelente em contagens regressivas ou progressivas.

### Sintaxe

```java
for (inicio; condição; incremento){
    <comando 1>
    <comando 3>
}
``` 
- início: executa somente na primeira vez, é como começa o loop
- condição: se...
    - V = executa e volta
    - F = pula fora
- incremento: executa toda vez depois de voltar

```java

    int N = sc.nextInt();
    int soma = 0;

    for(int i = 0; i < N; i++){
        int x = sc.nextInt();
    }

    System.out.println(soma);

    sc.close();
``` 
