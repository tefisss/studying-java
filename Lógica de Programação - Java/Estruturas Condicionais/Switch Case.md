## Sintaxe

```java
switch (expressão) {
    case valor1:
        <comando 1>
        <comando 2>
        break;
    case valor2:
        <comando 3>
        <comando 4>
        break;
    default:
        <comando 5>
        break;
}
```

Pode ser mais viável em alguns casos de encadeamento do que o else if, funcionaria assim:

```java
        System.out.println("Digite um número de 1 a 7");
        int x = sc.nextInt();
        String dia;

        switch(x){
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terça";
            (...)
            default:
                System.out.println("Valor inválido");
        }

        System.out.println("Dia da semana: " + dia);
        sc.close();
```