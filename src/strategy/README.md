# Padrão Strategy

[Padrão Comportamental]

<h3>Contexto</h3>

- Geralmente utilizado para encapsular uma família de algoritmos, de forma que seja possível trocar o algoritmo em tempo de execução. 

- Cria uma interface que representa um comportamento que varia (um método, por exemplo) e compõe a classe com implementações dessa interface.

<h3>Aplicabilidade</h3>

- Classes similares com comportamentos específicos diferentes.

- Necessidade de troca de algoritmo em tempo de execução do programa.

- Muitos condicionais, aninhados ou não, para escolher entre comportamentos diferentes.

<h3>Consequências</h3>

- :heavy_check_mark: Evita a duplicação de código.

- :heavy_check_mark: Remove fluxos condicionais.

- :heavy_check_mark: Torna possível a mudança de comportamento em tempo de execução.

- :x: Aumenta o número de classes.

- :x: Introduz complexidade ao código, uma vez que aumenta o número de classes para serem gerenciadas.