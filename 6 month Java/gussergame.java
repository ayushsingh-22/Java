import java.util.*;
class game
{
    Scanner sc = new Scanner (System.in);
    int gusser, umpire, p1,p2,p3;

    public void games()
    {
        System.out.print("Tell secreat number to umpire (under 0 - 10) = ");
        gusser = sc.nextInt();
        umpire = gusser;

        System.out.print("Tell secreat number to umpire (under 0 - 10) by player 1 = ");
        p1  =  sc.nextInt();
        System.out.print("Tell secreat number to umpire (under 0 - 10) by player 2  = ");
        p2 =  sc.nextInt();
        System.out.print("Tell secreat number to umpire (under 0 - 10) by player 3 = ");
        p3 =  sc.nextInt();

        if (p1 == umpire && p2 == umpire && p3 == umpire)
        {
             System.out.println();
            System.out.println("Congo!! you all win the game.");
        }

        else if (p1 == umpire && p2 != umpire && p3 != umpire)
        {
             System.out.println();
            System.out.println("Congo!! Player 1 win the match😊😊");
        }

         else if (p3 == umpire)
        {
             System.out.println();
            System.out.println("Congo!! Player 3 win the match😊😊");
        }

         else if (p2 == umpire )
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
