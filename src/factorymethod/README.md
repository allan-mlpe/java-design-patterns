# Padrão Factory Method

[Padrão de Criação]

<h3>Contexto</h3>

- Uma dependência é definida e utilizada pela superclasse, mas a criação da dependência é delegada para uma subclasse.

- Define uma interface para criar um objeto, mas deixa que as subclasses definam que classe será instanciada.  

<h3>Aplicabilidade</h3>

- Uma classe não pode antecipar a classe de objetos que deve criar.

- É desejável que as subclasses definam que os objetos que lhes são necessários.

<h3>Consequências</h3>

- :heavy_check_mark: Permite que uma classe adie a instanciação das subclasses.

- :heavy_check_mark: Oferece flexibilidade, uma vez que dá às subclasses um hook para prover tipos específicos de um dado objeto.

- :x: Pode ser necessária a criação subclasses apenas com a responsabilidade de criar uma classe concreta de um dado objeto.