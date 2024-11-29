<div align="center">
  
  # Formação Java Developer DIO
</div>

## Desafio 2: Controle de Fluxo 

Neste projeto, o objetivo é exercitar o conteúdo aprendido no módulo de **'Escopo e Estruturas de Controle em Java'**, criando um sistema que interaja com o terminal para realizar operações baseadas em dois parâmetros passados pelo usuário.

## Funcionalidade

O sistema recebe **dois números inteiros** via terminal. A partir desses números, é calculada a quantidade de interações que um loop `for` deve realizar. A cada iteração, uma mensagem será impressa no console. 

**Exemplo:**
Se os números fornecidos forem **12** e **30**, o sistema fará um loop com **18 interações** (resultado de `30 - 12`), e imprimirá as mensagens:

```
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
...
```

E assim por diante, até o número 18.

## Validação de Parâmetros

Se o **primeiro número** for **maior** que o **segundo** ou ambos os números forem iguais, o sistema lançará uma **exceção personalizada** chamada `ParametrosInvalidosException`, com a mensagem:
```
O segundo parâmetro deve ser maior que o primeiro
```


Essa validação garante que os parâmetros passados sejam lógicos para o funcionamento do programa.

## Estrutura do Projeto

O projeto foi estruturado da seguinte forma:

1. `public class Contador`: Essa classe é responsável por realizar toda a lógica do programa, ou seja, ela recebe os parâmetros, calcula o número de interações e imprime as mensagens no console.

2. `class ParametrosInvalidosException extends Exception`: Essa é uma exceção personalizada que é lançada quando o primeiro parâmetro é maior que o segundo. Ela contém a mensagem de erro que será mostrada ao usuário.
