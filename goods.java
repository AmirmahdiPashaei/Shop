import java.util.Scanner;

public class goods {

   public static goods [] index=new goods[1];
   public static boolean istemp=false;
   public static goods [] temp;
   private static Scanner input=new Scanner(System.in) ;

private String name;
private int price;
private int numbers;

 public goods(String name , int numbers , int price){
    this.name=name;
    this.numbers=numbers;
    this.price=price;
 }

 public String getName() {
     return name;
 }

 public int getNumbers() {
     return numbers;
 }

 public int getPrice() {
     return price;
 }

 public void finalize() throws Throwable {
    System.out.println("The Dummy Object Has Removed");
        }

 public static void creategoods(String name, int numbers, int price) {
    for(int i=0;i<index.length;i++){
        if(index[index.length-1]!=null){
           temp=index;
          index=new goods[temp.length+1];
          istemp=true;
          System.gc();
          break;
        }
    }
    if(istemp){
        for(int i=0;i<temp.length;i++){
         index[i]=temp[i];
        }
        istemp=false;
    }
    if(!istemp){

        for(int i =0;i<index.length;i++){
            if(index[i]==null){
    index[i]=new goods(name ,numbers,price);
       break;            
}
    
    }

    }
}

public static void seegoods() {
    
    for(int i=0;i<index.length;i++)
    {
                    if(index[i]!=null)
                    {
                        System.out.println("┌────────────────────────────────────────────────────");
                        System.out.print("| Name :"+index[i].name+" | ");
                        System.out.print("inventory :"+index[i].numbers+" | ");
                        System.out.println("Price :"+index[i].price+"  ");
                        System.out.println("└────────────────────────────────────────────────────");

                        System.out.println("──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
                    }
    }
    Preesanykeytocontinue();
}


public static void Preesanykeytocontinue() 
{
    //the code was used to this web site
    //https://linustechtips.com/topic/113581-press-any-key-to-continue-in-java/
    System.out.println("\n Press Any Key to continue...");
    try{System.in.read();}catch(Exception e){e.printStackTrace();}
    System.out.print("\033[H\033[2J");
}

public static void editgoods() {
    String Good;
    System.out.print("\033[H\033[2J");
    System.out.print("Enter Name Good To Edit That :");
    Good=input.next();
            for(int i=0;i<index.length;i++){
                            if(index[i].name.equals(Good))
                            {
                                int choice;
                                System.out.print("\033[H\033[2J");
                                System.out.println(" Good Founded \n");

                                System.out.println("1) Edit Name");
                                System.out.println("2) Edit Be have");
                                System.out.println("3) Edit Price \n");
                                System.out.print("What Want you to Edit :");
                                choice=input.nextInt();
                                System.out.print("\033[H\033[2J");

                                        switch(choice){
                                           case 1:
                                                System.out.print("Enter New Name:");
                                                index[i].name=input.next();
                                                System.out.print("The Name of "+Good+" Cheanged To "+index[i].name);
                                                Preesanykeytocontinue();
                                           break;

                                            case 2:
                                                System.out.print("Enter New Be have:");
                                                index[i].numbers=input.nextInt();
                                                System.out.print("The Inventory of "+Good+" Cheanged To "+index[i].numbers);
                                                Preesanykeytocontinue();
                                            break;

                                            case 3:
                                                System.out.print("Enter New Price:");
                                                index[i].price=input.nextInt();
                                                System.out.print("The Price of "+Good+" Cheanged To "+index[i].price);
                                                Preesanykeytocontinue();
                                            break;
                                                      }                   
                                                         break;
                                                   }
                                                System.out.println("not found "+Good);
                                          }

}

public static void deletegoods() {
    String Good;
    String sure;
    System.out.print("\033[H\033[2J");
    System.out.print("Enter Name Good To Delete That :");
    Good=input.next();
        for(int i=0;i<index.length;i++){
                        if(index[i].name.equals(Good))
                        {
                            System.out.println("The Goods is Founded !");
                            System.out.println("Are You Sure About that? yes/no");
                            sure=input.next();
                                                if(sure.equals("yes"))
                                                {
                                                    index[i]=null;
                                                    System.out.println("The Goods Was Deleted !");
                                                    Preesanykeytocontinue();
                                                }

                                                else if(sure.equals("no"))
                                                {
                                                    break;
                                                }
                        return;
                        } 

            System.out.println(" Goods Not Founded !");
            
  }

}


}