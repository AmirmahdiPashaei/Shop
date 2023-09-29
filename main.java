import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int mainnum=0;
        Scanner input = new Scanner(System.in);

        String name;
        int numbers;
        int price;
        while(true){
        System.out.println("1) Enter New Goods");
        System.out.println("2) See All Goods");
        System.out.println("3) Edit a Goods");
        System.out.println("4) Delete a Goods");
        System.out.println("5) Aboute this Programer");
        System.out.println("6) Exit");

        System.out.print("What Want you do : ");
         mainnum=input.nextInt();



        switch(mainnum){
               case 1:
                    //clear outpot box
                    System.out.print("\033[H\033[2J");

                    //get good name
                    System.out.print("Name Of Goods :");
                    name=input.next();
                    System.out.print("\033[H\033[2J");

                    //get good be haves
                    System.out.print("Be Have Of Goods :");
                    numbers=input.nextInt();
                    System.out.print("\033[H\033[2J");

                    //get good price
                    System.out.print("Price Of Goods :");
                    price=input.nextInt();
                    System.out.print("\033[H\033[2J");
                    goods.creategoods(name,numbers,price);
                    System.out.println();

                break;


                case 2:
                    System.out.print("\033[H\033[2J");
                    goods.seegoods();
                break;



                case 3:
                    System.out.print("\033[H\033[2J");
                    goods.editgoods();
                break;


                case 4:
                    System.out.print("\033[H\033[2J");
                    goods.deletegoods();
                break;


                case 5:
                    System.out.print("\033[H\033[2J");
                    System.out.println("Hi Im AmirMahdi Pashaei \n This is my First Program \n Thanks for See that <3");
                    System.out.println("Wherever other codes are used, the source is written above the code");
                    goods.Preesanykeytocontinue();
                    break;

                case 6:
                    System.out.print("\033[H\033[2J");
                    System.out.println("see you soon <3");
                return;


            }
        }
    }

    
    
}