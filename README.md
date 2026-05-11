# Lunar

Lunar é uma CLI simples de utilitários feita em Java. No momento, o foco do
projeto é converter números entre bases numéricas, como decimal, binária, octal,
hexadecimal e bases personalizadas.

## Como instalar

- Baixe o instalador `lunar-x.x.x.exe` disponível nos releases deste repositório.
- Execute-o e siga as instruções para instalar o programa.
- Adicione o caminho do executável ao `PATH` do sistema (caminho provável: `C:\Program Files\lunar`).

## Requisitos para compilar

- Java 21 ou superior
- Maven 3.x

## Como compilar

Na raiz do projeto, execute:

```bash
mvn package
```

O arquivo `.jar` será gerado em:

```bash
target/lunar-x.x.x.jar
```

## Como usar

Execute a CLI com:

```bash
java -jar target/lunar-x.x.x.jar <comando> [opções]
```

Se você configurar um alias ou script chamado `lunar`, os exemplos também podem
ser usados neste formato:

```bash
lunar <comando> [opções]
```

## Comandos

```text
--convert    Converte números entre bases.
--help       Mostra a mensagem de ajuda.
--version    Mostra a versão atual do Lunar.
```

## Bases suportadas

```text
--bin        Base 2.
--oct        Base 8.
--dec        Base 10.
--hex        Base 16.
--base <n>   Base numérica personalizada.
```

## Sintaxe de conversão

Converter um valor decimal para outra base:

```bash
lunar --convert <valor-decimal> <destino>
```

Converter informando a base de origem:

```bash
lunar --convert <origem> <valor> <destino>
```

Converter a partir de uma base personalizada:

```bash
lunar --convert --base <base-origem> <valor> <destino>
```

O destino pode ser `--bin`, `--oct`, `--dec`, `--hex` ou `--base <n>`.

## Exemplos

Decimal para binário:

```bash
lunar --convert 42 --bin
```

Binário para decimal:

```bash
lunar --convert --bin 101010 --dec
```

Hexadecimal para decimal:

```bash
lunar --convert --hex FF --dec
```

Base personalizada para hexadecimal:

```bash
lunar --convert --base 3 102 --hex
```

Decimal para uma base personalizada:

```bash
lunar --convert --dec 255 --base 16
```

## Desenvolvimento

Rodar os testes:

```bash
mvn test
```

Gerar o pacote:

```bash
mvn package
```
