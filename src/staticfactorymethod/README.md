# Padrão Static Factory Method*

*este padrão não faz parte do GoF.

[Padrão de Criação]

<h3>Contexto</h3>

- Utilizado para simplificar a criação de objetos, trocando o construtor padrão pela utilização de um método estático. 

- Ajuda a solucionar os seguintes problemas com o uso de contrutores:
    * Falta de semântica explícita na passagem dos parâmetros na inicialização dos objetos.
    
    * Impossibilidade da existência de construtores com assinaturas iguais, mas comportamentos desejados diferentes.
    
    * Custo computacional envolvido na operação de criação de um novo objeto sem quando da invocação do `new`.
    
    * Impossibilidade de resgatar a mesma instância do objeto, como quando utilizamos o padrão `Singleton`.
    
    * Impossibilidade de obter objetos de subclasses.
    
    * Aumento do acoplamento entre classes.

<h3>Aplicabilidade</h3>

- Classes que podem assumir comportamentos diferentes a depender dos parâmetros passados para o construtor padrão.

<h3>Consequências</h3>

- :heavy_check_mark: Fornece descrições explícitas acerca da finalidade da instância criada.

- :heavy_check_mark: Reduz o acoplamento entre as classes.

- :x: Pode aumentar consideravelmente o número de métodos na classe a depender dos comportamentos esperados.