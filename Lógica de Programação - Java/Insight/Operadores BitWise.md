## Operadores Bitwise

Se aplicam em programação de baixo nível, como um arduíno por exemplo.

- **&** = Operação "E" bit a bit
- **|** = Operação "OU" bit a bit
- **^** = Operação "OU exclusivo" bit a bit

A diferença do | para o ^ é que o | é verdadeiro se as duas condições forem verdadeiras.

```java
int n1 = 89;
        int n2 = 60;

        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);
```

### Verificar bits

Para verificar um bit específico em um número, criamos uma "máscara" com 0 em todos os bits, exceto no bit que queremos checar. 
Depois, realizamos a operação & entre o número original e a máscara. Se o resultado dessa operação for 0, significa que o bit que estamos verificando era 0 no número original. Caso contrário, significa que o bit era 1 no número original.

```java
int mask = 0b100000;
        int n = sc.nextInt();

        if((n & mask) != 0){
            System.out.println("O 6º bit é verdadeiro");
        }else{
            System.out.println("O 6º bit é falso");
        }
```
