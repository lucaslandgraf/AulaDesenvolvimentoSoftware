# 🚀 Repositório: Disciplina de Desenvolvimento de Software (Java/Eclipse)

Olá! Este repositório contém os materiais e exercícios desenvolvidos para a disciplina de **Desenvolvimento de Software**, com foco na linguagem **Java** e utilizando a IDE **Eclipse**.

O conteúdo está organizado em pastas que representam as aulas ou tópicos de estudo, conforme a progressão das atividades realizadas. O principal objetivo aqui é documentar o aprendizado dos conceitos de **Programação Orientada a Objetos (POO)** em Java.

## 📚 Sobre o Projeto

| Característica | Detalhe |
| :--- | :--- |
| **Linguagem Principal** | Java |
| **IDE Utilizada** | Eclipse |
| **Foco** | Programação Orientada a Objetos (POO), Estruturas de Dados Básicas e Conceitos Fundamentais. |

## 📂 Estrutura do Repositório

As pastas foram nomeadas com base nas datas das aulas ou no tópico de estudo/exercício. Dentro de cada pasta, você encontrará os arquivos `.java` com os códigos desenvolvidos e exemplos práticos.

| Pasta | Tópicos e Conteúdo Principal |
| :--- | :--- |
| `Estudos - Conceitos de Java` | Fundamentos da linguagem, `main`, `Scanner`, operadores (`+`, ternário `? :`), estruturas condicionais (`switch`). |
| `Aula - 140325` | Classes e Objetos - Básico: Criação de classes simples (`Carro`) com atributos públicos e métodos, interação inicial com `JOptionPane`. |
| `Aula - 190325` | Encapsulamento (Getters e Setters): Refatoração da classe `Carro` para usar atributos `private` e métodos de acesso (Getters e Setters). |
| `Aula - 240325` | Construtores (`Carro`): Implementação de construtores (vazio e com parâmetros) para a classe `Carro`. |
| `Estudos GetSet` | Exemplo de encapsulamento com a classe `Pessoa` (`GetNome`, `SetNome`, etc.). |
| `Aula - 280325` | Exercícios de Repetição: Uso de laços `for`, `while` e `do-while` para calcular tabuadas e processar arrays (`exercicio1`, `exercicio2` e `exercicio3`). |
| `Exercícios Sorteáveis 1` | Implementação de uma calculadora (`Calculadora`) utilizando métodos e construtores. |
| `Aula - 310325` | Herança - Básico: Classes `Animal`, `Peixe` e `Passaro`. Exemplo inicial de polimorfismo através da sobrescrita de métodos (`mover()`). |
| `Aula - 040425` | Classes Abstratas: Implementação de classes abstratas (`Forma2D`) e concretas (`Retangulo`, `Circulo`, `Triangulo`) com métodos abstratos (`calculaArea()`). |
| `Estudos - ArrayList / Aula - 190525 / Aula - 020625` | `ArrayList`: Uso básico (adicionar, remover, buscar, tamanho), conceitos de conjuntos (`contains`, `indexOf`), e ordenação/busca com `Collections.sort()` e `Collections.binarySearch()`. |
| `Aula - 050525` | Herança, Composição, e Coleções: Classes `Produto`, `Alimento`, `Eletronico`, e `Venda` (composição), demonstrando a relação "tem-um" (`Venda` tem uma lista de `Produtos`). |
| `Aula - 120525` | Sobrescrita de Método (`@Override`): Implementação de classes de conta (`Conta` e `ContaCorrente`) com sobrescrita dos métodos `atualizaSaldo()` e `depositar()`. |
| `Aula - 160525` | Classes e Atributos `static` e `final`: Uso de `static` (variáveis de classe, contagem de instâncias - `qtd` em `Pessoa`) e `final` (métodos, classes). |
| `Aula - 060625` | Interfaces: Definição e implementação de interfaces (`Veiculo`, `Animal`) por classes concretas (`Carro`, `Bicicleta`, `Caminhao`, `Dog`, `Cat`). |
| `Aula - 230525 / Correção Prova1` | Tratamento de Exceções: Uso de `try-catch-finally`, exceções verificadas (`throws IOException`), e criação de exceções personalizadas. |

## ⚙️ Como Executar os Códigos

Para rodar os projetos em Java:

1.  **Instale o Java Development Kit (JDK):** Certifique-se de ter uma versão compatível do JDK instalada em sua máquina.
2.  **Use o Eclipse:** A maioria dos projetos foram desenvolvidos e testados na IDE Eclipse.
3.  **Crie um novo projeto Java no Eclipse.**
4.  **Crie os *packages* (pacotes) e as classes correspondentes** (ex: `App.java`, `Carro.java`, etc.) dentro do seu projeto, copiando o código-fonte das respectivas pastas.

> **Nota:** Devido à forma como as aulas foram organizadas, pode ser necessário recriar a estrutura de pacotes (como `aula19`) e classes em seu ambiente Eclipse para que as referências de importação funcionem corretamente.

## 💡 Conceitos Principais Abordados

Durante a disciplina, foram explorados os pilares da **Programação Orientada a Objetos (POO)**:

*   **Classes e Objetos:** Definição de moldes (`class`) e suas instâncias (`new Carro()`).
*   **Encapsulamento:** Proteção de dados através de atributos `private` e acesso via *Getters* e *Setters*.
*   **Herança:** Reutilização de código através da extensão de classes (`extends`). Ex: `Peixe extends Animal`.
*   **Polimorfismo:** Capacidade de um objeto assumir diferentes formas, manifestada pela sobrescrita de métodos (`@Override`) e o uso de **Interfaces**.
*   **Estruturas de Dados:** Uso da classe `ArrayList` para coleções dinâmicas de objetos.
*   **Exceções:** Mecanismos de `try-catch-finally` para tratamento de erros em tempo de execução.
