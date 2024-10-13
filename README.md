# Projeto API de livros com Spring Boot 
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/nathan00pdl/Projeto2_Java_Spring/blob/main/LICENSE) 

# Sobre o projeto
Trata-se de um projeto básico para fins de estudo pessoal no que diz respeito ao funcionamento e, principalmente, a implementação de uma API (Application Programming Interface) de livros.

Inicialmente, acompanhei a construção desse projeto com base no vídeo https://www.youtube.com/watch?v=MuF_jkfdqUo da desenvolvedora Fernanda Kipper, no entanto a requisição do JSON contendo as informações dos livros foi feita por parte de serviços de nuvem da AWS, sendo assim optei por fazer algo mais simples, sendo um acesso de dados local.

Em suma, a API retorna uma lista de livros de programação, em que ss dados desses livros são derivados de um arquivo JSON armazenado em uma pasta local. Em vez de buscar informações de uma API externa ou serviço na nuvem, a aplicação lê o arquivo JSON local, converte-o para uma lista de objetos Java e disponibiliza esses dados através de um endpoint da API.

# Estruturação do projeto 
## Implementação por camadas
###Book
- Book
- BookController
- BookService
  
## Requisições web
- Insomnia
- testes de requisições com método GET



# Autor

Nathan Paiva de Lacerda

https://www.linkedin.com/in/nathan-paiva-636336236

