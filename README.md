# CatálogoLivros
Trabalho: ELICITAÇÃO E PROGRAMAÇÃO

Professor: Hudson Neves

Membros da equipe:

Danilo Marques de Sousa - 0028249,
Israel Roberto Pinheiro - 0026780,
Jefter Samuel Rocha  - Alves 0028515,
João Gabriel Lopes Liborio- 0027035,
Matheus Henrique Brito de Jesus - 0026897, e
Nathan de Aguiar Carvalho Leite - 0026776


Catálogo de Livros

Sobre o projeto e funcionamento

O Catálogo de Livros é uma aplicação desenvolvida em Java para o gerenciamento simples de livros por meio do console. O projeto foi desenvolvido com o objetivo de colocar em prática conceitos de Programação Orientada a Objetos (POO), utilizando uma estrutura simples, organizada e de fácil compreensão.

Ao iniciar a aplicação, o usuário encontra um menu interativo com as opções disponíveis no sistema: cadastrar, listar, buscar, remover, atualizar ou sair. O menu permanece sendo apresentado após cada operação, permitindo que o usuário realize várias ações durante a mesma execução. Esse controle é realizado por meio de uma estrutura "do while", que mantém o programa funcionando enquanto a opção escolhida for diferente de "0".

Os livros são armazenados temporariamente em uma "ArrayList<Livro>". A classe "Livro" representa cada livro cadastrado e possui os atributos título, autor e ano de publicação. Quando o usuário realiza um cadastro, o sistema recebe essas informações por meio do "Scanner", cria um novo objeto "Livro" e adiciona esse objeto à "ArrayList".

As funcionalidades do sistema são organizadas em métodos dentro da classe "Main". O "switch" identifica a opção escolhida no menu e chama o método responsável por executar a operação correspondente. Dessa forma, o código fica dividido em partes menores, facilitando sua organização e compreensão.

Funcionalidades

- Cadastrar livro: solicita o título, autor e ano de publicação, cria um objeto "Livro" e adiciona o livro à lista.
- Listar livros: percorre a "ArrayList" e apresenta todos os livros cadastrados, identificados por um número.
- Buscar livro: permite informar o título completo ou apenas uma parte dele. O sistema percorre a lista e apresenta os livros que possuem o texto informado no título.
- Remover livro: apresenta os livros cadastrados e permite selecionar um deles pelo número. Após verificar se a posição existe, o livro é removido da lista.
- Atualizar livro: permite selecionar um livro pelo número e substituir suas informações por novos dados.
- Sair: encerra a execução do programa.

![Alt text](https://github.com/Israel320/CatalogoLivros/blob/8f40438956abd99efa1d9fe95e8ffd7bf5cff04d/Captura%20de%20tela%202026-09-14%20091619.png)
  
O sistema também possui validações de entrada. O método "lerTexto()" impede que campos obrigatórios, como título e autor, sejam deixados vazios. O método "lerInteiro()" verifica se o usuário informou um número válido, evitando erros quando são digitados outros tipos de valores. Já o método "lerAno()" verifica se o ano informado está dentro do intervalo definido pelo sistema. As operações de remoção e atualização também verificam se a posição escolhida realmente existe na lista.

Quando o usuário escolhe a opção "0 - Sair", a condição do "do while" deixa de ser verdadeira, encerrando o menu. Em seguida, o "Scanner" é fechado por meio de "scanner.close()" e o método "main" chega ao final, encerrando a aplicação.

Os dados são armazenados somente em memória utilizando uma "ArrayList". Por isso, os livros permanecem disponíveis enquanto o programa estiver em execução, mas não são salvos permanentemente. Ao encerrar a aplicação, os dados cadastrados são perdidos.

Tecnologias utilizadas

- Java SE 21
- Eclipse
- "ArrayList"
- "Scanner"
- Programação Orientada a Objetos (POO)
- Git e GitHub

Estrutura do projeto

"Livro.java"

É a classe responsável por representar um livro. Ela possui os atributos:

- título;
- autor;
- ano de publicação.

Os atributos são privados ("private"), seguindo o conceito de encapsulamento. O acesso e a alteração dos dados são realizados por meio de getters e setters.

"Main.java"

É a classe responsável pela execução e controle do sistema. Nela estão o menu principal, as operações do catálogo, as validações de entrada e a interação com o usuário pelo console.

Como executar

1. Abra o projeto no Eclipse.
2. Certifique-se de que o Java SE 21 está configurado.
3. Localize a classe "Main.java".
4. Execute o método "main".
5. O menu será apresentado no console.
6. Digite o número correspondente à operação desejada.

Exemplo de utilização

===== CATÁLOGO DE LIVROS =====

1 - Cadastrar livro

2 - Listar livros

3 - Buscar livro

4 - Remover livro

5 - Atualizar livro

0 - Sair

Escolha uma opção:

Após escolher uma opção, o sistema solicita as informações necessárias e apresenta o resultado diretamente no console.

Objetivo do projeto

O projeto busca colocar em prática conceitos fundamentais de Java e POO, principalmente classes, objetos, encapsulamento, métodos, construtores, "ArrayList", estruturas de repetição, estruturas condicionais e tratamento de entradas inválidas.

