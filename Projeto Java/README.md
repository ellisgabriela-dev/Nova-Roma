# Sistema de Cadastro - Produtos e Clientes

Projeto Java em terminal com SQLite, mantendo a organização em camadas:
`Menu -> Service -> Repository -> Banco de dados`.

## Funcionalidades

- Cadastrar, listar e excluir produtos.
- Cadastrar, listar e excluir clientes (nome, telefone e e-mail).
- Os registros são armazenados no arquivo `estoque.db`, criado automaticamente.

## Organização

- `src/database`: conexão e criação das tabelas SQLite.
- `src/model`: classes Produto e Cliente.
- `src/repository`: interfaces e implementações SQLite.
- `src/service`: regras/serviços.
- `src/view`: menu do terminal.
- `src/utils`: leitura dos dados digitados.

## Dependência

O projeto utiliza o driver JDBC do SQLite (`sqlite-jdbc`). Adicione o arquivo JAR do driver ao classpath antes de executar. O driver não está incluído neste ZIP.

## Compilação e execução

Com o JAR do SQLite JDBC salvo na pasta `lib`:

**Windows (Prompt de Comando):**
```bat
mkdir out
javac -encoding UTF-8 -cp "lib\\sqlite-jdbc.jar" -d out src\\App.java src\\database\\*.java src\\model\\*.java src\\repository\\*.java src\\service\\*.java src\\utils\\*.java src\\view\\*.java
java -cp "out;lib\\sqlite-jdbc.jar" App
```

**Linux/macOS:**
```bash
mkdir -p out
javac -encoding UTF-8 -cp "lib/sqlite-jdbc.jar" -d out $(find src -name "*.java")
java -cp "out:lib/sqlite-jdbc.jar" App
```

O menu exibido será:
```text
==================================================
   SISTEMA DE CADASTRO [Banco: SQLite]
==================================================
1. Cadastrar Produto
2. Listar Produtos
3. Excluir Produto
--------------------------------------------------
4. Cadastrar Cliente
5. Listar Clientes
6. Excluir Cliente
--------------------------------------------------
0. Sair
--------------------------------------------------
Escolha uma opção:
```
