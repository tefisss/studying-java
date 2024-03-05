## Sintaxe IF-ELSE

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
```
## Expressão Condicional Ternária
Estrutura opcional ao if-else quando se deseja decidir um valor com base em uma condição

### Sintaxe
```java
(condição) ? valor_se_V : valor_se_F
```

**Exemplo**
```java
// usando o IF-ELSE normalmente
double preco = 34.5;
double desconto; 
if(preco < 20.0){
    desconto = preco * 0.1;
}else{
    desconto = preco * 0.5;
}
// usando a expressão ternária
double preco = 34.5;
double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.5;
```


