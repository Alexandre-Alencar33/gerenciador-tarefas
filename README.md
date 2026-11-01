# Gerenciador de Tarefas (Java)

Aplicação de console em Java para gerenciar uma lista de tarefas: adicionar, listar, concluir e remover. Projeto desenvolvido para praticar os fundamentos de Java e de programação orientada a objetos.

## Funcionalidades

- Adicionar tarefas com descrição (o id é gerado automaticamente)
- Listar tarefas com o status de cada uma (`[ ]` pendente, `[x]` concluída)
- Marcar uma tarefa como concluída pelo id
- Remover uma tarefa pelo id
- Tratamento de entradas inválidas (texto no lugar de número, ids inexistentes, opções fora do menu)

## Tecnologias e conceitos praticados

- Java
- Orientação a objetos: classes, encapsulamento (atributos privados, getters e setters)
- Coleções: `ArrayList`
- Entrada de dados com `Scanner`
- Tratamento de exceções (`try/catch` com `NumberFormatException`)
- Estruturas de controle: `while`, `switch`, `for each`

## Estrutura do projeto

```
.
├── Main.java                # Menu interativo e leitura da entrada do usuário
├── Tarefa.java              # Modelo: id, descrição e status de conclusão
└── GerenciadorTarefas.java  # Regras de negócio: adicionar, listar, concluir, remover e buscar
```

## Como executar

Pré-requisito: JDK instalado (versão 8 ou superior).

1. Clone o repositório:

```bash
git clone https://github.com/SEU-USUARIO/NOME-DO-REPOSITORIO.git
cd NOME-DO-REPOSITORIO
```

2. Compile:

```bash
javac *.java
```

3. Execute:

```bash
java Main
```

## Exemplo de uso

```
--- MENU ---
1 - Adicionar tarefa
2 - Listar tarefas
3 - Concluir tarefa
4 - Remover tarefa
0 - Sair
Escolha: 1
Descrição: Estudar Java
Tarefa adicionada com id 1

--- MENU ---
...
Escolha: 3
Id da tarefa: 1
Tarefa 1 concluída.

--- MENU ---
...
Escolha: 2
1 [x] Estudar Java
```

## Limitações atuais

- Os dados ficam apenas em memória: ao encerrar o programa, as tarefas são perdidas.
- Interface somente via terminal.

## Próximos passos

- [ ] Salvar e carregar tarefas em arquivo (texto, CSV ou JSON)
- [ ] Editar a descrição de uma tarefa
- [ ] Adicionar data de criação e prazo
- [ ] Filtrar tarefas por status (pendentes/concluídas)
- [ ] Testes unitários com JUnit
- [ ] Persistência em banco de dados

## Autor

**Alexandre**
Estudante de Análise e Desenvolvimento de Sistemas, em formação na área de TI.

- GitHub: [@Alexandre-Alencar33](https://github.com/Alexandre-Alencar33)
- LinkedIn: [Alexandre Alencar](www.linkedin.com/in/alexandre-alencar-8b6562337)
