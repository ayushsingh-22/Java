import java.util.*;
public class conditionalprac
{
    public static void main(String[] args) 
    {
        
        // If student have 33 in each subject and 40 overall then pass
        
        Scanner sc=new Scanner(System.in);
        // float phy, chem, math, total;
        // System.out.print("Enter physics = ");
        // phy=sc.nextFloat();
        // System.out.print("Enter chemistry = ");
        // chem=sc.nextFloat();
        // System.out.print("Enter math = ");
        // math=sc.nextFloat();

        // total=(phy+chem+math)/3;

        // if(phy>=33&&chem>=33&&math>=33)
        // {
        //     if(total>=40)
        //     {System.out.printf("Congrats! You are passed with %.2f%%",total );}
        //     else
        //     {System.out.printf("Sorry! Next time study hard.");}  
        // }
        //  else
        //     {System.out.printf("Sorry! Next time study harder.");}


        // calculate tax oaid by individual as per slab;

        float amount;

        System.out.print("Enter your annual income = ");
        int income = sc.nextInt();

        if(income<=250000)
        {System.out.println("Congrats! Enjoy your income without deduction.");}
       else if (income > 250000 && income <= 500000)
        {
            amount=(5.0f*income)/100;
            System.out.printf("Amount pay as tax for %d is %.2f",income,amount);
        }
        else if (income > 500000 && income <= 1000000)
        {
            amount=(20.0f*income)/100;
             System.out.printf("Amount pay as tax for %d is %.2f",income,amount);
        }
        else if (income > 1000000)
        {
            amount=(30.0f*income)/100;
            System.out.printf("Amount pay as tax for %d is %.2f",income,amount);
        }
        else {System.out.println("Invalid input.");}

    }
}