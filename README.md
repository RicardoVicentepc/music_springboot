# Projeto com Spring Boot utilizando o padrão de projeto Strategy

Este projeto foi desenvolvido utilizando o Spring Boot e implementando o padrão de projeto Strategy. O objetivo do projeto é fornecer uma aplicação para gerenciar músicas, permitindo aos usuários executar diferentes operações com base em estratégias específicas.

## Tecnologias Utilizadas

O projeto utiliza as seguintes tecnologias e bibliotecas:

- **Spring Boot**: Framework para criação de aplicativos Java baseados em Spring de forma rápida e fácil.
- **Spring Data JPA**: Biblioteca que simplifica a implementação de camadas de persistência em aplicativos Java.
- **Bean Validation (javax.validation)**: Framework de validação de dados para aplicativos Java.
- **H2 Database**: Banco de dados em memória para desenvolvimento e testes.
  
## Padrão de Projeto Strategy

O padrão de projeto Strategy foi utilizado para oferecer uma solução flexível e extensível para definir e executar diferentes estratégias de negócio para o gerenciamento de músicas. Com esse padrão, é possível encapsular algoritmos específicos em classes separadas e permitir que eles sejam trocados dinamicamente conforme necessário.

## Funcionalidades

O projeto permite realizar as seguintes operações:

- **Cadastrar uma música**: Permite inserir uma nova música no sistema, fornecendo informações como nome, álbum, data de lançamento, nota e ranking.
- **Buscar músicas por nota**: Permite buscar músicas com uma nota maior que um valor especificado.
- **Buscar músicas por ranking**: Permite buscar músicas com um ranking superior a um determinado número.

## Configuração do Banco de Dados

O projeto utiliza o banco de dados H2 em memória para facilitar o desenvolvimento e os testes. Não é necessária nenhuma configuração adicional para utilizar o banco de dados.

## Executando o Projeto

Para executar o projeto localmente, siga as etapas abaixo:

1. Certifique-se de ter o JDK e o Maven instalados em sua máquina.
2. Clone o repositório do projeto.
3. Navegue até o diretório raiz do projeto.
4. Execute o comando `mvn spring-boot:run` para iniciar o aplicativo.

Após seguir essas etapas, o aplicativo estará acessível localmente em [http://localhost:8080](http://localhost:8080).

## Contribuindo

Contribuições são bem-vindas! Se você quiser contribuir com este projeto, sinta-se à vontade para abrir uma issue ou enviar uma solicitação pull request.

Este README foi criado com base nas tecnologias utilizadas, padrão de projeto Strategy e funcionalidades disponíveis no projeto. Se precisar de mais alguma informação, não hesite em entrar em contato!



## Teste via postman
[Musicas.postman_collection.json](https://github.com/RicardoVicentepc/music_springboot/files/14818774/Musicas.postman_collection.json)
