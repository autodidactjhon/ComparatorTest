
import java.util.*;

/*
Los comparadores se utilizan para comparar dos objetos. En este desafío, creará un comparador y lo usará para ordenar una Array.

La clase Player recibe 2 parametros: name de tipo String y un score de tipo int.

Dado un array de n cantidad de objetos de tipo Player, escriba un comparador que los ordene de manera decreciente (mayor a menor)
de acuerdo al score; Si 2 o más players tienen el mismo score, debe ordenarlos de manera alfabética por el name. 

Para hacer esto, debe crear una clase Checker que implemente la interfaz Comparator, luego escribir un método int compare(Player a, Player b) 
implementando el método Comparator.compare(T o1, T o2).

Consideraciones:
    0 <= score <= 1000
    2 players pueden tener el mismo nombre
    Los nombres de los jugadores están formados por letras minúsculas.
*/

// Write your Checker class here

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class ComparatorTest {

    public static void main(String[] args) {

        Player[] player = new Player[5];
        
        player[0] = new Player("amy", 100);
        player[1] = new Player("david", 100);
        player[2] = new Player("robert", 50);
        player[3] = new Player("mark", 60);
        player[4] = new Player("luis", 75);        
        
        //Checker checker = new Checker();
     
        //Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
        
        /*Output expected*/        
        /* amy 100
           david 100
           luis 75
           mark 60
           robert 50 */
    }
}
