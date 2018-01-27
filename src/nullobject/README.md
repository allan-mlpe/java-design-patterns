# Padrão Null Object*

*este padrão não faz parte do GoF.

[Padrão Comportamental]

<h3>Contexto</h3>

- Representação de objetos que "não existem" ou são nulos.

- Uma nova subclasse é criada para representar objetos vazios ou que ainda não possuem valores válidos ou com valores padrões. 

<h3>Aplicabilidade</h3>

- Utilizamos esse padrão quando precisamos criar/representar objetos "vazios". Por exemplo: um carrinho de compras vazio, sem itens, sem valor total, etc.

<h3>Consequências</h3>

- :heavy_check_mark: Reduz ou até elimina a necessidade checagem da nulidade de um objeto (`(obj == null) { ... }`).

- :x: Introdução de uma classe a mais com responsabilidade de "não realizar nada".