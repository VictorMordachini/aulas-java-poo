# Aulas e Projetos de Programação Orientada a Objetos com Java

![Java](https://img.shields.io/badge/Java-21+-blue.svg) ![Maven](https://img.shields.io/badge/Maven-4.0.0-red.svg)

Este repositório é uma coleção abrangente de exemplos de código, exercícios e projetos práticos focados nos conceitos fundamentais e avançados da **Programação Orientada a Objetos (POO)** utilizando a linguagem Java. O objetivo é servir como um material de estudo e consulta, demonstrando a aplicação de cada pilar da POO em cenários distintos.

---

## 📚 Tópicos e Conceitos Abordados

O repositório está organizado em pacotes, onde cada um representa uma aula ou um conceito específico.

### `aula01_introducaoPOO`
* **Conceitos:** Classes, Objetos, Atributos, Métodos e Construtores.
* **Exemplos Práticos:**
    * `concessionaria`: Demonstração da criação de objetos `Carro` com seus respectivos atributos e ações.
    * `gerenciamento_de_alunos`: Um programa interativo para cadastrar alunos e verificar sua aprovação, aplicando os conceitos básicos de POO.

### `aula02_colecoes`
* **Conceitos:** Uso de `ArrayList` e outras estruturas de coleções para gerenciar múltiplos objetos.
* **Exemplos Práticos:**
    * `gerenciador_de_tarefas`: Criação de uma lista de tarefas interativa, permitindo adicionar, listar, concluir e remover itens.

### `aula03_encapsulamento`
* **Conceitos:** Modificadores de acesso (`public`, `private`), Getters e Setters para proteger e validar os dados dos objetos.
* **Exemplos Práticos:**
    * `conta_bancaria_com_operacoes_simples`: Implementação de uma `ContaBancaria` com saldo protegido, onde as operações de saque e depósito são controladas por métodos que validam as regras de negócio.

### `aula04_heranca`
* **Conceitos:** Criação de hierarquias de classes (superclasses e subclasses) para reutilização de código.
* **Exemplos Práticos:**
    * `sistema_de_funcionarios`: A classe `Professor` herda atributos de `Funcionario`, especializando o comportamento.
    * `controle_de_estoque`: Classes `Alimento` e `Eletronico` estendem uma classe base `Produto`.

### `aula05_polimorfismo`
* **Conceitos:** Sobrescrita de métodos (`@Override`) e Sobrecarga de métodos para permitir que objetos de diferentes classes respondam à mesma mensagem de formas distintas.
* **Exemplos Práticos:**
    * `sistema_de_relatorios`: Classes `PDF`, `CSV` e `JSON` herdam de `Relatorio` e implementam o método `gerarRelatorio` de maneira específica.
    * `calculadora`: Demonstração de sobrecarga com múltiplos métodos `somar` que aceitam diferentes tipos e quantidades de parâmetros.

### `aula06_abstracao`
* **Conceitos:** Uso de Classes Abstratas e Interfaces para definir contratos e comportamentos genéricos.
* **Exemplos Práticos:**
    * `classe_abstrata/animal`: A classe `Animal` define métodos abstratos (`fazerSom`) e concretos (`dormir`), forçando as subclasses `Cachorro` e `Gato` a implementarem suas próprias versões do som.
    * `exemplo_interface/aparelho_eletronico`: A interface `AparelhoEletronico` define um contrato que `Televisao` e `Computador` devem seguir.

### `aula07_mvc`
* **Conceitos:** Implementação do padrão de arquitetura **Model-View-Controller (MVC)** para organizar o código de forma desacoplada.
* **Exemplos Práticos:**
    * `crud_usuario`: Um sistema de CRUD de usuários (Operador e Supervisor) onde a lógica de dados (`DAO`), a lógica de negócio (`Controller`) e a interface com o usuário (`View`) são separadas.

### `aula08_projeto_mqtt_mysql_websocket`
* **Conceitos:** Um projeto mais complexo que integra diferentes tecnologias para criar um sistema de controle de acesso.
* **Funcionalidades:**
    * **MQTT:** Recebe dados de um tópico (simulando uma leitura de cartão RFID).
    * **WebSocket:** Notifica clientes (como um painel de professor) em tempo real sobre eventos, como o atraso de um aluno.
    * **Persistência de Dados:** Usa tanto arquivos **JSON** quanto um banco de dados **MySQL** para armazenar e gerenciar os dados de alunos, professores e horários.

---

## 🛠️ Tecnologias Adicionais

Além do Java puro, este repositório utiliza:

* **Maven:** Para gerenciamento de dependências do projeto.
* **Gson:** Biblioteca do Google para manipulação de JSON, usada na persistência de dados.
* **MySQL Connector/J:** Driver para conexão com banco de dados MySQL.
* **Eclipse Paho:** Cliente MQTT para comunicação com o broker.
* **Jetty:** Servidor web para a implementação do WebSocket.

---

## 🏃‍♀️ Como Utilizar

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/victormordachini/aulas-java-poo.git](https://github.com/victormordachini/aulas-java-poo.git)
    cd aulas-java-poo
    ```

2.  **Abra o projeto** em sua IDE de preferência (IntelliJ, Eclipse, etc.).

3.  **Navegue pelos pacotes:** Cada pacote `com.senai.aulaXX` contém uma ou mais classes `Main.java` que podem ser executadas individualmente para testar os exemplos e exercícios daquela aula.

4.  **Execute a classe `Main`** do exemplo que deseja estudar. A maioria dos exemplos é interativa e rodará diretamente no console.
