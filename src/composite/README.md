# Padrão Composite

[Padrão Estrutural]

<h3>Contexto</h3>

- Composição de objetos em estruturas de árvore para representar hierarquias parte-todo.

- Objetos primitivos podem ser compostos em objetos mais complexos, que, por sua vez, podem ser compostos, e assim sucessivamente, de forma recursiva.

- Utiliza o conceito de composição recursiva.

- Às classes abstratas (ou interfaces) damos os nomes de `Component` e `Composite`.

- Às classes concretas damos os nomes de `Leaf` e `ConcreteComposite`.

<h3>Aplicabilidade</h3>

- Quando queremos representar objetos que podem ser compostos por outros objetos do mesmo tipo.

- Quando desejamos que os clientes sejam capazes de ignorar as diferenças entre composições de objetos e objetos individuais, tornando-os, assim, mais simples.

<h3>Consequências</h3>

- :heavy_check_mark: Permite a construção de elementos complexos a partir de elementos simples.

- :heavy_check_mark: Permite aos clientes tratar objetos individuais e composições de objetos de maneira uniforme.

- :x: Em alguns casos é difícil restringir os componentes da árvore para apenas tipos específicos.

- :x: Pode ser necessária a verificação de potenciais composições inválidas em tempo de execução.