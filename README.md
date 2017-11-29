# Projeto Nervouse Desktop

Projeto de finalização do módulo de Orientação a Objetos do curso Fábrica de Programador da High Tech Cursos

http://fabricadeprogramador.com.br

## Sobre o projeto
O projeto Nervouse é uma aplicação **desktop** para gerenciamento de vendas. **O projeto ainda está em desenvolvimento e inicialmente trabalha com os dados em memório (sem banco de dados)**.

## Tecnologias
O projeto foi feito em Java com a API JavaFX para criação das interfaces gráficas do sistema.

## Arquitetura
O projeto foi dividido em quatro camadas: **model**, **service**, **controller** e **view**

### Model
A camadas **model** contém as classes que representam os objetos da regra de negócio (ex. Cliente, Venda, Vendedor, Produto, etc.).

### Service
A camadas **service** contém as classes que possuem os algoritmos que garantem o fluxo e as regras de negócios do sistema.

### Controller
A camadas **model** contém as classes que fazem o gerenciamento das telas do sistema. São as classes controller de fornecem as ações das telas, não deixando-as apenas estáticas.

### View
A camadas **model** contém os arquivos FXML que são arquivos de formato XML que criam o layout das telas da aplicação. Nesta camada estão presentes, também, classes de carregameto das telas. Essas classes executáveis carregam os arquivos FXML e fazem a renderização das mesmas.

## Execução

### Eclipse/IntelliJ/Netbeans
Execute a classe `br.com.nervouse.view.ClienteView`
