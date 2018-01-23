# Padrão State

[Padrão Comportamental]

<h3>Contexto</h3>

- Criamos objetos que representam vários estados (por meio da implementação de uma interface, por exemplo), e um objeto de contexto, cujo comportamento varia conforme seu objeto de estado muda.

- Lançamos mão de hook classes e delegamos um comportamento esperado para elas. 

<h3>Aplicabilidade</h3>

- Permitir que um objeto altere o seu comportamento quando o seu estado interno é alterado.

- Evitar cadeias de estruturas de decisão que variam o comportamento a ser executado de acordo com o estado de um objeto. 

<h3>Consequênicas</h3>

- :heavy_check_mark: Facilita a inclusão de novos estados. Torna a manutenção, modificação e extensão do código mais fácil.

- :heavy_check_mark: Objetos de estado podem ser compartilhados.

- :heavy_check_mark: Melhora a coesão, uma vez que os comportamentos específicos são incluídos nas classes concretas que representam os estados.

- :x: Aumento da complexidade, devido ao aumento do número de classes.