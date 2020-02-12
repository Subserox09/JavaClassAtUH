import java.util.Scanner;
public class HomeWork1 {

   public static void mainMenu(double[] orderCost){
       Scanner scnr = new Scanner(System.in);


       do {
           System.out.println("Please select a menu item from the list below:");
           System.out.println("1 – View item menu");
           System.out.println("2 – Pay total due");
           System.out.println("3 – Add $5 in credit");
           System.out.println("4 – Clear order");


           int x = scnr.nextInt();

           if(x<1 || x>4){
               System.out.println("Please enter a valid option!");
               System.out.println();
           }
           if(x==1){
                itemCosts(orderCost);
           }
           if(x==2){
               
           }
          }while(true);
       }

    public static void itemCosts(double[] orderCost){
       Scanner des = new Scanner(System.in);
        orderCost[0] = (19.99);
        orderCost[1] = (29.49);
        orderCost[2] = (15.79);
        orderCost[3] = (24.99);
        orderCost[4] = (24.99);
        double temp = 0.00;
        do{
           System.out.println("(1) Toaster: $19.99");
           System.out.println("(2) Coffee maker: $29.49");
           System.out.println("(3) Waffle maker: $15.79");
           System.out.println ("(4) Blender: $24.99");
           System.out.println("(5) Kettle: $24.99");
           System.out.println ("(6) Go to the main menu");
           System.out.println("Your current total is: $" + temp);
           int r = des.nextInt();


           if(r ==1){
               System.out.println("You have added a Toaster to your order.");
               System.out.println();
               temp = temp + orderCost[0];
           }
           if(r==2){
               System.out.println("You have added a Coffee maker to your order.");
               System.out.println();
               temp = temp + orderCost[1];
           }
           if(r==3){
               System.out.println("You have added a Waffle maker to your order.");
               System.out.println();
               temp = temp + orderCost[2];
           }
           if(r==4){
               System.out.println("You have added a Blender to your order.");
               System.out.println();
               temp = temp + orderCost[3];
           }
           if(r==5){
               System.out.println("You have added a Kettle to your order.");
               System.out.println();
               temp = temp + orderCost[4];
           }
           if(r==6){
               System.out.println();
               mainMenu(orderCost);
           }
           if(r<1 || r>6){
               System.out.println("Invalid item number please try again");
           }

       }while(true);
    }


    public static void main(String[] args){
     double[] orderCost = new double[5];

     mainMenu(orderCost);



    }
}
