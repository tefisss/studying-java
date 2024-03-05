## Variáveis em Java

tipo | nome = valor inicial

```java
int idade = 18;
double altura = 1.50;
```

#### Restrições para nomes de variáveis
- Não pode começar com dígitos. Usar letras ou _
- Não usar acento ou til
- Não tem espaço

### Convenções

- Camel Case: lastName
    - pacotes, atributos, métodos, variáveis e parâmetros
- Pascal Case: ProductService
    - classes

### Tipos primitivos em Java

| Tipo       | Descrição                 |
|------------|---------------------------|
| byte 8 bits|Númericos inteiros         |
| short  16  |Númericos inteiros         |
| int    32  |Númericos inteiros         |
| long   64  |Númericos inteiros         |
| float  32  |Numéricos c ponto flutuante|
| double 64  |Numéricos c ponto flutuante|
| char   16  |Um caractere unicode       |
| boolean  1 |Valor verdade              |

**String** = seria uma cadeia de caracteres

### Funções interessantes de strings

```java
String original = "teste TESTE test TEST       ";
        String s01 = original.toLowerCase(); // letras minúsculas
        String s02 = original.toUpperCase(); // letras maiúsculas
        String s03 = original.trim(); // remove espaços antes ou depois
        String s04 = original.substring(2); // só imprime a partir do caractere que indicarmos, no caso o 3.
        String s05 = original.substring(2, 9); // vai recortar a partir do 2 até o 9
        String s06 = original.replace('e', 'x'); // substitui um char pelo outro
        String s07 = original.replace("es", "xy"); // substitui uma sequência de strings por outra
        int i = original.indexOf("te"); // saber a primeira ocorrência
        int j = original.lastIndexOf("st"); // saber a última occorência
```

### Operação SPLIT

Função que serve pra recortar strings.
Criamos um vetor de strings onde cada parte recortada será uma posição do vetor, definimos também um separador conforme o exemplo abaixo: 

```java
        String s = "arroz feijão ovo";
        String[] vect = s.split(" "); // definindo o separador das strings que serão armazenadas como parte do vetor criado

        System.out.println(vect[0]); // arroz
        System.out.println(vect[1]); // feijão
        System.out.println(vect[2]); // ovo

```


