package collectiondemos;


import java.util.Scanner;

class card{

    public static void creaditcard(int cardnum)
    {
        if(cardnum == 3)
        {
            System.out.println("American Express");
        }
        else if(cardnum == 4)
        {
            System.out.println("visa");
        }
        else if (cardnum == 5)
        {
            System.out.println("MasterCard");
        }
    }

}

public class checkCard {
    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();


    }
}
