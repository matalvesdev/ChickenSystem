# Projeto - Controle de Galinheiro (Java Time)

Este é um sistema simples que desenvolvi para calcular a produção diária e mensal de ovos em uma fazenda. O objetivo é registrar os dados dos galinheiros e facilitar o cálculo da produção total de ovos. Com este projeto, pude praticar conceitos como modelagem com UML, manipulação de datas com `LocalDateTime` e aplicar boas práticas de programação orientada a objetos em Java.

## Objetivos do Projeto

Durante o desenvolvimento, trabalhei nos seguintes tópicos:

- **Estruturação do Projeto**: 
  - Organizei a classe que representa um galinheiro.
  - Elaborei o diagrama de classes UML para a classe `Galinheiro`.

- **Classe Galinheiro**:
  - **Atributos** que implementei:
    - `nome` — Nome do galinheiro.
    - `qtdGalinhas` — Quantidade de galinhas no galinheiro.
    - `ovosPorDiaPorGalinha` — Quantidade de ovos que cada galinha produz por dia.
    - `dataHoraCriacao` — Data e hora em que o galinheiro foi registrado no sistema (utilizando `LocalDateTime`).

- **Introdução ao LocalDateTime**:
  - Usei o `LocalDateTime` para representar data e hora.
  - Utilizei o método `LocalDateTime.now()` para capturar o momento de criação do galinheiro.

- **Implementação do Código**:
  - Criei a classe Java `Galinheiro` com os atributos definidos.
  - Implementei métodos para calcular:
    - Produção diária de ovos.
    - Produção mensal de ovos.

## Exemplo de Classe Galinheiro em Java

```java
import java.time.LocalDateTime;

public class Galinheiro {
    private String nome;
    private int qtdGalinhas;
    private int ovosPorDiaPorGalinha;
    private LocalDateTime dataHoraCriacao;

    public Galinheiro(String nome, int qtdGalinhas, int ovosPorDiaPorGalinha) {
        this.nome = nome;
        this.qtdGalinhas = qtdGalinhas;
        this.ovosPorDiaPorGalinha = ovosPorDiaPorGalinha;
        this.dataHoraCriacao = LocalDateTime.now();
    }

    public int producaoDiaria() {
        return qtdGalinhas * ovosPorDiaPorGalinha;
    }

    // Considerando um mês padrão de 30 dias
    public int producaoMensal() {
        return producaoDiaria() * 30;
    }

    // Getters e Setters omitidos para brevidade
}
```

## Como Funciona

- Ao criar uma instância de `Galinheiro`, a data e hora de criação são automaticamente registradas.
- Os métodos `producaoDiaria()` e `producaoMensal()` facilitam o cálculo da produção de ovos, conforme os dados registrados.

## Aprendizados

Ao concluir este projeto, aprendi a:
- Modelar sistemas simples usando UML.
- Trabalhar com datas e horas em Java usando `LocalDateTime`.
- Implementar boas práticas de programação orientada a objetos.

## Licença

Este projeto foi desenvolvido para fins educacionais.
