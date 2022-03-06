O desafio foi feito utilizando linguagem 100% JAVA, a IDE utilizada foi o Eclipse.

Questão 1  

O programa pede a entrada pelo usuário de uma lisa com uma quantidade ímpar de elementos, utilizei o loop while pegando o resto da divisão(quando o resto for 0, o número de entradas será par) para caso o usuário entre com um número de elementos pares, o programa retornar a mensagem informando que deve ser digitado um número ímpar. É criado um vetor com os números digitados, após isso, utilizei o comando arrays.sort para ordenar os elementos do vetor em ordem crescente. A lógica da mediana(números ímpares) é o tamanho do vetor acrescido de 1 e divido por 2, dessa forma encontramos o número que está ao centro do vetor e para o System.out fazemos o resultado obtido -1, já que as posições dos vetores começam em 0.

Questão 2

O programa pede a entrada de um vetor com um número n de inteiros e um valor preestabelecido de x. Transformei os valores de entrada em um vetor e o valor de x em uma constante. Utilizei o comando for para fazer a subtração da primeira casa do vetor com as subsequentes e comparar o resultando com a constante x, caso o resultado seja igual,  os pares são salvos e a contagem vai sendo feita para no final printar na tela quantos pares foram comparados.

Questão 3

O programa pede para o usuário digitar uma frase que ele deseja encriptar, após isso, o comando replace é utilizado para retirar os espaços da frase e então tiramos a raiz do tamanho da String que será utilizado para determinar o número de linhas e colunas da matriz. Feito isso, coloquei todos os caracteres do texto em uma lista para facilitar na manipulação dos resultados, utilizando o primeiro comando try fazemos o mapeamento da matriz e em seguida removemos o primeiro elemento da lista. Após isso, com o segundo comando try, fazemos a iteração da matriz de forma inversa(primeiro as colunas) e adicionamos o primeiro elemento de cada coluna, no fim, o texto encriptado é devolvido ao usuário.
