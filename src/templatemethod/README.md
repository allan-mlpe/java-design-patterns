# Padrão Template Method

[Padrão Comportamental]

<h3>Contexto</h3>

- Define um "esqueleto" de um algoritmo, delegando um ou mais passos do mesmo para as subclasses.

- As subclasses devem redefinir certos passos do algoritmo sem alterar a estrutura do mesmo.

- Requer uma superclasse/classe abstrata, uma vez que as partes fixas do algoritmo estarão presente na mesma, tendo as subclasses a responsabilidades de implementar os métodos abstratos.

<h3>Aplicabilidade</h3>

- Quando temos um algoritmo que possuem uma parte invariante, tendo apenas um ou mais passos que podem variar independentemente da parte fixa.

<h3>Consequências</h3>

- :heavy_check_mark: Evita a duplicação de código e confere maior flexibidade.

- :x: O debug pode se tornar confuso e a manutenção mais custosa.