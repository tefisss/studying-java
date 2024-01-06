## Variáveis em Java

| tipo | nome | = | valor inicial |

```java
int idade = 18;
double altura = 1.50;
```

### Tipos primitivos em Java

| Tipo       | Descrição                 |
|------------|---------------------------|
| byte 8 bits|Númericos inteiros         |
| short  16  |                           |
| int    32  |                           |
| long   64  |                           |
| float  32  |Numéricos c ponto flutuante|
| double 64  |                           |
| char   16  |Um caractere unicode       |
| boolean  1 |Valor verdade              |

String seria uma cadeia de caracteres.

## Saída de dados em Java

### Texto ou variável básica
Sem quebra de linha no fim

```java
System.out.print("texto");

int x = 22; 

System.out.print(x);
```

Com quebra de linha no fim

```java
System.out.println("texto");

int x = 22;

System.out.println(x);
```

### Conteúdo de variável com ponto flutuante

```java
double x = 2.2222
System.out.printf("%.2f\n", x); \\ o \n define a quebra de linha
```

Por padrão, a língua portuguesa utiliza a vírgula como separador. Se quiser utilizar o ponto como separador, precisaria utilizar o comando **LOCALE**. Funciona assim: 

```java 
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		double x = 2.222222; 
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f\n", x);
		
	}

}
```

### Concatenação 

```java
int x = 22;

System.out.println("Texto tal" + x + "Texto tal tal"); \\ utilizando o println

float 2.22222;

System.out.printf("Texto tal %.2f tal tal tal\n", x); \\ utilizando o printf
```