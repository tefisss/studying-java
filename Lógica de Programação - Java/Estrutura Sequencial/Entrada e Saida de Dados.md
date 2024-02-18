# Saída de Dados em Java

### Texto ou variável básica
- Sem quebra de linha no fim

```java
System.out.print("texto");

int x = 22; 

System.out.print(x);
```

- Com quebra de linha no fim

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

O código abaixo utiliza o ___Locale__ e o __DecimalFormat__ para garantir que números decimais sejam lidos e exibidos corretamente, independentemente da configuração de idioma da IDE

```java
Scanner sc = new Scanner(System.in).useLocale(Locale.forLanguageTag("pt-BR")); // Define o Scanner para usar o padrão brasileiro, para que números decimais sejam lidos com vírgula.
DecimalFormat df = new DecimalFormat("#,##0.00"); //Define o DecimalFormat para formatar números com vírgula como separador decimal e duas casas decimais.
System.out.println("Informe o número de horas trabalhadas: ");
hora = sc.nextDouble();
System.out.println("Informe o valor que recebe por hora: ");
salHora = sc.nextDouble();

double salarioTotal = hora * salHora;

System.out.println("Salário: " + df.format(salarioTotal)); //  assegura que o número será exibido com vírgula como separador decimal e duas casas decimais
```


### Concatenação 

```java
int x = 22;

System.out.println("Texto tal" + x + "Texto tal tal"); \\ utilizando o println

float 2.22222;

System.out.printf("Texto tal %.2f tal tal tal\n", x); \\ utilizando o printf
```

# Entrada de Dados em Java

### Na entrada de dados, criamos uma variavel do tipo "Scanner" da seguinte forma: 

```java
import java.util.Scanner; // necessário colocar no inicio do programa

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); // associa o objeto Scanner ao console
        String x;

        System.out.println("Digite:");
        x = sc.next(); // forma de receber a STRING
        System.out.println("Você digitou " + x);

        sc.close(); // função que desaloca/encerra o que foi criado
        }
    }
```

- Pra fazer o mesmo processo com **números inteiros**, apenas substituimos o __sc.next();__ por **sc.nextInt();**
- Pra fazer o mesmo processo com **números decimais**, apenas substituimos o **sc.next();** por **sc.nextDouble();**
    - Novamente, se quisermos utilizar o ponto como separador precisamos utilizar a função **Locale.setDefault(Locale.US);**
- Pra fazer o mesmo processo com um **caractere**, apenas acrescentamos o **sc.next();** como **sc.next().charAt(0);**
- Para lermos um texto **até a quebra de linha**, utilizado o **sc.nextLine();**
    - Quando lemos inicialmente um inteiro usando **sc.nextInt()** e depois uma linha inteira usando **sc.nextLine()**, pode ser necessário adicionar sc.nextLine() mais uma vez logo após a leitura do inteiro. Pois o programa pode interpretar o "enter" após inserir o número inteiro como uma quebra de linha para a próxima entrada de informação.
