# Programação Orientada a Objetos com Java (POO)

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![VS Code](https://img.shields.io/badge/VS_Code-007ACC?style=for-the-badge&logo=visual-studio-code&logoColor=white)
![IFPI](https://img.shields.io/badge/IFPI-Campus_Floriano-green?style=for-the-badge)

**Instituto Federal de Educação, Ciência e Tecnologia do Piauí (IFPI) — Campus Floriano**  
**Curso Técnico em Informática Integrado ao Ensino Médio**  
**Turma:** 4202  
**Disciplina:** Programação Orientada a Objetos (POO)  
**Docente:** Prof. Ronaldo Pereira Barbosa ([@profRonaldoIFPI](https://github.com/profRonaldoIFPI))  

</div>

---

## 📌 Sobre o Repositório

Este repositório centraliza os materiais pedagógicos, códigos-fonte desenvolvidos durante as aulas práticas de laboratório, listas de exercícios, atividades avaliativas, apresentações teóricas e livros de referência da disciplina de **Programação Orientada a Objetos com Java**, ofertada para a **Turma 4202** do **Curso Técnico em Informática Integrado ao Ensino Médio** do **IFPI Campus Floriano**.

O objetivo da disciplina é capacitar os alunos na compreensão e aplicação dos princípios fundamentais do paradigma orientado a objetos, desenvolvendo aplicações robustas, organizadas e manuteníveis na linguagem Java.

---

## 📚 Conteúdo Programático

A disciplina contempla os seguintes pilares teóricos e práticos:

1. **Introdução à Linguagem Java**:
   - Estrutura de programas Java, compilação e execução via JVM;
   - Tipos de dados primitivos, operadores lógicos e condicionais;
   - Estruturas de controle de fluxo (decisão e repetição);
   - Sub-rotinas (métodos estáticos) e manipulação de vetores (*arrays*).
2. **Fundamentos da Orientação a Objetos**:
   - O conceito de Classe, Atributo, Método e Instanciação de Objetos;
   - Métodos Construtores e inicialização de instâncias.
3. **Encapsulamento e Modificadores de Acesso**:
   - Ocultamento de informação (`private`, `public`, `protected`);
   - Métodos de acesso (*getters*) e modificadores (*setters*);
   - Validações de integridade e regras de negócio.
4. **Relacionamentos e Herança**:
   - Associação entre classes;
   - Reuso de código e hierarquias de generalização/especialização (`extends`);
   - Palavras-chave `super` e `this`.
5. **Polimorfismo e Coleções**:
   - Sobrescrita de métodos (`@Override`);
   - Chamada polimórfica e ligação tardia (*late binding*);
   - Manipulação de coleções dinâmicas com `java.util.ArrayList`.
6. **Classes Abstratas e Interfaces**:
   - Contratos de métodos e classes incompletas (`abstract`);
   - Criação e implementação de interfaces (`interface`, `implements`).
7. **Tratamento de Exceções**:
   - Robustez de software e captura de falhas (`try`, `catch`, `finally`);
   - Lançamento e propagação de exceções (`throw`, `throws`);
   - Hierarquia de exceções (`Throwable`, `Exception`, `RuntimeException`, `IllegalArgumentException`).

---

## 🗂️ Estrutura do Repositório

O repositório está organizado em módulos que separam as atividades práticas, os códigos das aulas expositivas de laboratório, materiais de referência e apresentações teóricas:

```
.
├── Atividade_5/                                  # Atividade prática: Herança e Polimorfismo (Funcionário e Vendedor)
├── Atividade_7/                                  # Atividade prática: Classes Abstratas e Interfaces (Lista 7)
│   ├── Lista Exercícios 7-...pdf
│   └── PartePraticaLista7/                       # Código-fonte: Questões Q1 (Veículos) e Q2 (Contas e Tributos)
├── Atividade_8_Tratamento de Excecoes/           # Atividade prática: Tratamento de Exceções (Lista 8)
│   ├── Lista Exercícios 8 -...pdf
│   ├── Hierarquia da exceções[Q6].png
│   └── src/                                      # Código-fonte: Validador de Idade e App de testes
├── Aula_0409_Classes Abstratas e Interfaces/     # Aula prática: Classes Abstratas (Formas2d, Círculo, Quadrado)
├── Aula_2310_Tratamento-de-excecoes/             # Aula prática: Validação e lançamento de exceções (Pessoa)
├── Referencias/                                  # Livros e materiais bibliográficos de apoio em PDF
├── Slides das aulas/                             # Apresentações teóricas das aulas em PDF
├── Lista Exercícios 5 - Herança e Polimorfismo.pdf # PDF de apoio da Lista 5
└── README.md                                     # Documentação principal do repositório
```

### 📝 Atividades Práticas e Listas

- **[Atividade_5](./Atividade_5)**: Herança e polimorfismo aplicados a cálculo de folha de pagamento (`Funcionario`, `Vendedor`), sobrescrita do método `calcularPagamento()` e diagrama de classes.
- **[Atividade_7](./Atividade_7)**: Lista de exercícios sobre Classes Abstratas e Interfaces com duas implementações práticas em `PartePraticaLista7`:
  - **Q1**: Hierarquia de veículos (`Veiculo`, `CarroDePasseio`).
  - **Q2**: Sistema bancário e tributário implementando interfaces (`Conta`, `ContaCorrente`, `Tributalvel`, `Auditavel`).
- **[Atividade_8_Tratamento de Excecoes](./Atividade_8_Tratamento%20de%20Excecoes)**: Prática e resolução da Lista 8 sobre tratamento de exceções em Java, cobrindo validações de regras com `IllegalArgumentException` (`ValidadorIdade`, `TestaIdade`) e diagrama da hierarquia de exceções.
- **[Lista Exercícios 5 - Herança e Polimorfismo.pdf](./Lista%20Exercícios%205%20-%20Herança%20e%20Polimorfismo.pdf)**: Enunciado teórico e prático para fixação de herança e polimorfismo.

### 💻 Aulas Práticas (Laboratório)

- **[Aula_0409_Classes Abstratas e Interfaces](./Aula_0409_Classes%20Abstratas%20e%20Interfaces)**: Definição de classes e métodos abstratos para formas bidimensionais (`Formas2d`), subclasses concretas (`Quadrado`, `Circulo`) e iteração polimórfica com `ArrayList`.
- **[Aula_2310_Tratamento-de-excecoes](./Aula_2310_Tratamento-de-excecoes)**: Exemplo prático de validação de atributos com lançamento de exceções no método modificador (`Pessoa.setIdade() throws IllegalArgumentException`).

### 📑 Slides Teóricos

Localizados no diretório [`Slides das aulas/`](./Slides%20das%20aulas):

- `Aula 1 - Introdução à Java.pdf`
- `Aula 1.1 - Dominando_o_Tipo_Boolean.pdf`
- `Aula 2 - Java_Decision_Logic.pdf`
- `Aula 2.2 - Mastering_Java_Functions.pdf`
- `Aula 3 - Java_Loops_and_Arrays.pdf`
- `Aula 4 - Java_OOP_Fundamentals.pdf`
- `Aula 5 - Java_Classes_and_Objects.pdf`
- `Aula 5.1 - Java_Object_Creation.pdf`
- `Aula 6 - Java_Encapsulation_Architecture.pdf`
- `Aula 8 - Polimorfismo.pdf`
- `Aula 8.1 - Arrays, ArrayList e polimorfismo.pdf`
- `Aula 9 - Classes Abstratas e Interfaces.pdf`
- `Aula 10 - Tratamento_de_Exceções.pdf`

### 📖 Bibliografia e Referências

Localizados no diretório [`Referencias/`](./Referencias):

- *Java Para Iniciantes: Crie, Compile E Execute Programas* (6ª Ed.) — Herbert Schildt (2015)
- *Java: Como Programar* — Paul Deitel & Harvey Deitel (2016)
- *Programação Orientada a Objetos com Java* (2016)
- *Princípios de Análise e Projeto de Sistemas com UML* — Eduardo Bezerra (2018)

---

## 🛠️ Requisitos e Ambiente de Desenvolvimento

Para compilar e executar os projetos disponíveis neste repositório:

- **JDK (Java Development Kit)**: Versão 17 ou superior instalada (recomendado JDK 21).
- **IDE / Editor**: [Visual Studio Code](https://code.visualstudio.com/) com a extensão **[Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)** da Microsoft.
- **Git**: Para clonagem e versionamento de código.

### Como Executar uma Atividade ou Aula no VS Code

1. Clone o repositório em seu ambiente local:

   ```bash
   git clone https://github.com/profRonaldoIFPI/POO_4202_2026.git
   ```

2. Abra a pasta do repositório no VS Code:

   ```bash
   code POO_4202_2026
   ```

3. Navegue até o arquivo principal (`App.java` ou classe de teste) do projeto desejado (ex.: `Atividade_5/src/App.java` ou `Atividade_8_Tratamento de Excecoes/src/App.java`).
4. Clique no botão **Run** acima do método `main`, ou pressione `F5` para depuração.

---

## 👨‍🏫 Docente Responsável

- **Professor:** Ronaldo Pires Borges
- **Instituição:** Instituto Federal de Educação, Ciência e Tecnologia do Piauí (IFPI) — Campus Floriano
- **GitHub:** [@profRonaldoIFPI](https://github.com/profRonaldoIFPI)
