# Padrão Observer

[Padrão Comportamental]

<h3>Contexto</h3>

- Definição de dependência de um para muitos (1 para M), de modo que quando um objeto mudar de estado, todos os seus dependentes (ou observadores) serão notificados e atualizados.

- Esta dependência, contudo, não significa forte acoplamento entre as classes do projeto.

- Chamamos de `SUBJECT` o objeto que "publica" suas atualizações de estado. E de `OBSERVERS` os objetos que recebem as atualizações do SUBJECT.

<h3>Aplicabilidade</h3>

- Vários objetos dependem do estado de um objeto específico. 

<h3>Consequênicas</h3>

- :heavy_check_mark: Reduz o acoplamento entre as classes do projeto.

- :heavy_check_mark: Favorece a extensibilidade do código caso um novo observador precise ser adicionado.

- :x: Pode levar a problemas de falta de memória e outros problemas de performance devido a inclusão/exclusão de observers e pela troca de mensagens entre subjects e observers.