# DESAFIO DE PROGRAMAÇÃO 02 - ACADEMIA CAPGEMINI
&nbsp;&nbsp;&nbsp;&nbsp;Olá! Seja bem-vindo (a) à terceira etapa do processo de seleção para a Academia Capgemini 2022. O objetivo dessa etapa é testar os seus conhecimentos em lógica de programação. Para isso, preparamos três questões com diferentes níveis de dificuldade. A implementação das questões pode ser feita em qualquer linguagem, porém a utilização de Java será um diferencial.
&nbsp;&nbsp;&nbsp;&nbsp;Obs: Se você já realizou o primeiro desafio, não é necessário a resolução desse segundo desafio. Iremos levar em consideração a resolução do primeiro desafio.
## Questão 01
&nbsp;&nbsp;&nbsp;&nbsp;A mediana de uma lista de números é basicamente o elemento que se encontra no meio da lista após a ordenação. Dada uma lista de números com um número ímpar de elementos, desenvolva um algoritmo que encontre a mediana.
### Exemplo
#### Entrada:
	arr = [9, 2, 1, 4, 6]
#### Saída:
	4
## Questão 02
&nbsp;&nbsp;&nbsp;&nbsp;Dado um vetor de inteiros n e um inteiro qualquer x. Construa um algoritmo que determine o número de elementos pares do vetor que tem uma diferença igual ao valor de x.
### Exemplo
#### Entrada:
    n = [1, 5, 3, 4, 2]
#### Saída:
	3
### Explicação
&nbsp;&nbsp;&nbsp;&nbsp;Existem 3 pares de inteiros no vetor com uma diferença de 2: [5, 3], [4, 2] e [3, 1].

## Questão 03
&nbsp;&nbsp;&nbsp;&nbsp;Um texto precisa ser encriptado usando o seguinte esquema. Primeiro, os espaços são removidos do texto. Então, os caracteres são escritos em um grid, no qual as linhas e colunas tem as seguintes regras:

![raiz de T](https://www.google.com/chart?cht=tx&chf=bg,s,FFFFFF00&chco=000000&chl=%5Csqrt%7BT%7D)<=linha<=coluna<=![raiz de T](https://www.google.com/chart?cht=tx&chf=bg,s,FFFFFF00&chco=000000&chl=%5Csqrt%7BT%7D)
* Considere T, como o tamanho do texto.
* Se certifique de que linhas x colunas >= .
* Se múltiplos grids satisfazem as condições, escolha aquele com a menor área.

&nbsp;&nbsp;&nbsp;&nbsp;Escreva um algoritmo que ao receber uma string s, mostre a mensagem encriptada de acordo com as regras descritas.

### Exemplos
### Exemplo 1
#### Entrada:
	s = tenha um bom dia
#### Saída:
	taoa eum nmd hbi
### Explicação
&nbsp;&nbsp;&nbsp;&nbsp;Depois de remover os espaços, a string tem 13 caracteres.  está entre 3 e 4, então a string é rescrita na forma de um grid com 4 linhas e 4 colunas:

	tenh
	aumb
	omdi
	a
	
&nbsp;&nbsp;&nbsp;&nbsp;O resultado é obtido ao mostrar os caracteres de cada coluna, com um espaço entre as colunas de texto. A mensagem encriptada é obtida ao mostrar os caracteres de cada linha com um espaço entre as colunas.

### Exemplo 2
#### Entrada:
	s = ola mundo
#### Saída:
	omd luo an

### Explicação
&nbsp;&nbsp;&nbsp;&nbsp;Depois de remover os espaços a string tem 8 caracteres.  está entre 2 e 3, então a string é reescrita na forma de um grid com 3 linhas e 3 colunas:

	ola
	mun
	do

## O que será avaliado
* Documentação
* Estrutura do código
* Atendimento aos requisitos
* Testes unitários

## Envio das questões
&nbsp;&nbsp;&nbsp;&nbsp;As soluções para as questões devem ser hospedadas no GitHub e o link do repositório deve ser postado na sua área do candidato a partir do dia 28/02/2022. Para entrar na sua área do candidato acesse: https://capgemini.proway.com.br/inscricao/login.php. O link do repositório deve ser postado no campo “Github para o desafio de programação”. O link deve ser similar a este: https://github.com/nome-de-usuario/repositorio. Lembrando que a data final para postagem do desafio será no dia 06/03/2022. Quanto antes você fizer, maiores as chances de ser selecionado (a) para a próxima etapa. 🚀
&nbsp;&nbsp;&nbsp;&nbsp;O repositório deve conter um arquivo README.md com as instruções de como rodar a aplicação e as tecnologias utilizadas.