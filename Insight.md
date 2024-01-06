# Insight

## Edições

- Java ME (Java Micro Edition) = dispositivos embarcados e móveis
- Java SE (Java Standard Edition) = core - desktops e servidores (MAIS UTILIZADO)
- Java EE (Java Enterprise Edition) = aplicações corporativas

### Modelo de Execução do Java
Abordagem híbrida entre COMPILAÇÃO e INTERPRETAÇÃO.
O código fonte é copilado para Bytecode (representação intermediaria já verificada) que é executado pela **maquina virtual** específica do OS.  

## Estrutura
- **Classe**
- **Pacote** (Package) = Agrupamento lógico de classes relacionadas (tipos de classes).
- **Módulo** = Agrupamento lógico de pacotes relacionados.
- **Aplicação** = O programa em si / agrupamento de módulos.

### Criando uma classe
 - Marcar a opção **public static void main (String[] args)**, é o que torna a classe um programa executável.

## Sintaxe básica
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```