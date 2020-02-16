import java.util.Scanner;
public class HomeWork1 {
    public static double temp = 0.00;  //this holds the value of accumulated item costs
    public static double budget = 100.00;  //this is the starting amount of money a user will have to buy goods
    public static Scanner scnr = new Scanner(System.in);
    public static int x;

   public static void mainMenu(double[] orderCost){



       do {
           System.out.println("Please select a menu item from the list below:");
           System.out.println("1 – View item menu");
           System.out.println("2 – Pay total due");
           System.out.println("3 – Add $5 in credit");
           System.out.println("4 – Clear order");


            x = scnr.nextInt();

           if(x<1 || x>4){
               System.out.println("Please enter a valid option!");
               System.out.println();
           }
           if(x==1){
                itemCosts(orderCost);
           }else if(x==2){
               payTotalDue(orderCost);
           }else if(x==3){
                Credit(orderCost);
           }else if(x==4){
               clearOrder(orderCost);
           }
          }while(true);
       }

    public static void itemCosts(double[] orderCost){

        orderCost[0] = (19.99);
        orderCost[1] = (29.49);
        orderCost[2] = (15.79);
        orderCost[3] = (24.99);
        orderCost[4] = (24.99);

        do{
            System.out.println("What would you like to add to your order?");
           System.out.println("(1) Toaster: $19.99");
           System.out.println("(2) Coffee maker: $29.49");
           System.out.println("(3) Waffle maker: $15.79");
           System.out.println ("(4) Blender: $24.99");
           System.out.println("(5) Kettle: $24.99");
           System.out.println ("(6) Go to the main menu");
           System.out.printf("Your current total is: $" +"%.2f%n", temp);
           x = scnr.nextInt();


           if(x ==1){
               System.out.println("You have added a Toaster to your order.");
               temp = temp + orderCost[0];
           }
           if(x==2){
               System.out.println("You have added a Coffee maker to your order.");
               temp = temp + orderCost[1];
           }
           if(x==3){
               System.out.println("You have added a Waffle maker to your order.");
               temp = temp + orderCost[2];
           }
           if(x==4){
               System.out.println("You have added a Blender to your order.");
               temp = temp + orderCost[3];
           }
           if(x==5){
               System.out.println("You have added a Kettle to your order.");
               temp = temp + orderCost[4];
           }
           if(x==6){
               mainMenu(orderCost);
           }
           if(x<1 || x>6){
               System.out.println("Invalid item number please try again");
           }

       }while(true);
    }

    public static void payTotalDue(double[] paying){

       double discount = temp * .2;
       double tax;
       double totalCost =0;
       double checkTemp = 0;
        if(temp < 50){
            tax =temp * .085;
            System.out.printf("Your total due is: $" + "%.2f%n", temp);
            totalCost = temp + tax;
            System.out.printf("Thank you!  Your change is: $" + "%.2f",(budget - totalCost));
            System.out.println();
            System.out.println("Your items will be on their way soon!");
            System.exit(0);
        }else if(temp >= 50 && temp<100){
            totalCost = temp;

            System.out.printf("Your total due is: $" + "%.2f%n", totalCost);
            totalCost = totalCost - discount;
            tax = totalCost * .085;
            totalCost = totalCost + tax;
            System.out.printf("Thank you! You saved: $" + "%.2f", discount);
            System.out.printf(" Your change is: $" + "%.2f%n",(budget - totalCost));
            System.out.println("Your items will be on their way soon!");
            System.exit(0);

        }else if(temp >= 100){
            totalCost = temp;
            tax = .085;

            double checkValidity = (totalCost -discount) + ((totalCost -discount)*tax);

            if(budget< checkValidity){//still need to work on this part since there are some more scenarios to think about here
                System.out.println("Insufficient funds!");
                mainMenu(paying);
            }

            System.out.printf("Your total due is: $"+ "%.2f%n",  totalCost);
            totalCost = temp - discount;
            tax = totalCost * .085;
            totalCost = totalCost + tax;
            System.out.printf("Thank you! You saved: $" + "%.2f", discount);
            System.out.printf(" Your change is: $" + "%.2f%n",(budget - totalCost));
            System.out.println("Your items will be on their way soon!");
            System.exit(0);

        }


    }

    public static void Credit(double[] credit){
       budget = budget + 5;
       System.out.printf("Credit available: $" +"%.2f%n", budget);

    }

    public static void clearOrder(double[] order){
        temp = 0.00;
        System.out.printf("Current order balance has been cleared. Current due: $" +"%.2f%n", temp);
    }
    public static void main(String[] args){
     double[] orderCost = new double[5];

     mainMenu(orderCost);

    }
}
