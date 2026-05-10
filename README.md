# Lunar

Lunar e um CLI simples de utilitarios feito em Java. No momento, o foco do
projeto e converter numeros entre bases numericas, como decimal, binario, octal,
hexadecimal e bases personalizadas.

## Requisitos

- Java 21 ou superior
- Maven 3.x

## Como compilar

Na raiz do projeto, execute:

```bash
mvn package
```

O arquivo `.jar` sera gerado em:

```bash
target/lunar-x.x.x.jar
```

## Como usar

Execute o CLI com:

```bash
java -jar target/lunar-x.x.x.jar <comando> [opcoes]
```

Se voce configurar um alias ou script chamado `lunar`, os exemplos tambem podem
ser usados neste formato:

```bash
lunar <comando> [opcoes]
```

## Comandos

```text
--convert    Converte numeros entre bases.
--help       Mostra a mensagem de ajuda.
--version    Mostra a versao atual do Lunar.
```

## Bases suportadas

```text
--bin        Base 2.
--oct        Base 8.
--dec        Base 10.
--hex        Base 16.
--base <n>   Base numerica personalizada.
```

## Sintaxe de conversao

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

Decimal para binario:

```bash
lunar --convert 42 --bin
```

Binario para decimal:

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
## COMO INSTALAR

baixe o instalador lunar-2.5.3.exe na pasta /instalador
adicione o caminho do executavel ao PATH do sistema (caminho provavel: C:\Program Files\lunar)
