# ComparatorTest

Los comparadores se utilizan para comparar dos objetos. En este desafío, creará un comparador y lo usará para ordenar una Array.

La clase Player recibe 2 parametros: name de tipo String y un score de tipo integer.

Dado un array de n cantidad de objetos de tipo Player, escriba un comparador que los ordene de manera decreciente (mayor a menor) de acuerdo al score; Si 2 o más players tienen el mismo score, debe ordenarlos de manera alfabética por el name. 

Para hacer esto, debe crear una clase Checker que implemente la interfaz Comparator, luego escribir un método int compare(Player a, Player b) implementando el método Comparator.compare(T o1, T o2).

Consideraciones:

  0 <= score <= 1000  
  2 players pueden tener el mismo nombre  
  Los nombres de los jugadores están formados por letras minúsculas.
