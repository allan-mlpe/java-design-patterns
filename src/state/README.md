# Padrão State

[Padrão Comportamental]

<h3>Contexto</h3>

- Criamos objetos que representam vários estados (por meio da implementação de uma interface, por exemplo), e um objeto de contexto, cujo comportamento varia conforme seu objeto de estado muda.

- Lançamos mão de hook classes e delegamos um comportamento esperado para elas. 

<h3>Aplicabilidade</h3>

- Uma abstração e sua implementação devem ser definidas e estendidas independentemente uma da outra.

- Evitar cadeias de estruturas de decisão que variam o comportamento a ser executado de acordo com o estado de um objeto. 

<h3>Consequênicas</h3>

- :heavy_check_mark: Melhoria da extensibilidade da aplicação.

- :heavy_check_mark: Desacoplamento entre as abstrações e suas implementações.

- :heavy_check_mark: Interface e implementação podem variar independentemente.

- :x: Aumento da complexidade.

- :x: Pode ter efeito negativo na performance.