import java.util.*;
class game
{
    Scanner sc = new Scanner (System.in);
    int gusser, umpire, player1,player2,player3;

    public void games()
    {
        System.out.print("Tell secreat number to umpire (under 0 - 10) = ");
        gusser = sc.nextInt();
        umpire = gusser;

        System.out.print("Tell secreat number to umpire (under 0 - 10) by player 1 = ");
        player1  =  sc.nextInt();
        System.out.print("Tell secreat number to umpire (under 0 - 10) by player 2  = ");
        player2 =  sc.nextInt();
        System.out.print("Tell secreat number to umpire (under 0 - 10) by player 3 = ");
        player3 =  sc.nextInt();

        if (player1 == umpire && player2 == umpire && player3 == umpire)
        {
             System.out.println();
            System.out.println("Congo!! you all win the game.");
        }

        else if (player1 == umpire && player2 != umpire && player3 != umpire)
        {
             System.out.println();
            System.out.println("Congo!! Player 1 win the match😊😊");
        }

         else if (player3 == umpire)
        {
             System.out.println();
            System.out.println("Congo!! Player 3 win the match😊😊");
        }

         else if (player2 == umpire )
        {
             System.out.println();
            System.out.println("Congo!! Player 2 win the match😊😊");
        }

        else  
        {
             System.out.println();
            System.out.println("Next time better luck 😊😊");
        }
    }
}



public class gussergame 
{
    public static void main(String[] args) 
    {
        game gm = new game();
        gm.games(); 
    }

}
