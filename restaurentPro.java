import java.util.Scanner;
import java.util.ArrayList;
class FoodOrder{

    int[] menuPlan;
    double billAmount=0;        

    int[] foodItemID = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        String[] foodName = { "Water Bottel 1ltr", "Water Bottel 0.5ltr", "Veg Grill Sandwich", "Veg Cheese Grill Sandwich",
            "Plain Uttapam", "Onion Uttapam", "Sada Dosa", "Masala Dosa", "Chana Masala", "Butter Roti", "Plain Rice",
            "Tava Pulav", "Pav Bhaji", "Extra Pav", "Vanilla Ice Cream" };
        double[] foodItemPrice = { 25.00, 10.00, 125.00, 225.00, 150.00, 175.00, 100.00, 150.00, 225.00, 35.00, 75.00,
            225.00, 150.00, 25.00, 50.00 };


    double CalculateBillAmount(int[]menuPlan){
        for(int i=0;i<menuPlan.length;i+=2){
            System.out.println("menu id: "+menuPlan[i]+" quantity: "+menuPlan[i+1]);
            for(int j=0;j<menuPlan.length;j++)
            {
                if(menuPlan[i]==this.foodItemID[j]){
                    System.out.println("Item Name: "+foodName[j] + "    Item Price: "+foodItemPrice[j]);
                    billAmount+= menuPlan[i+1] * foodItemPrice[j];
                }
            }

        }
        
         return this.billAmount;
    }
}
public class restaurentPro{
    public static int[] foodPlan;
    public static void main(String[] args) {
        FoodOrder order1= new FoodOrder();
        int menu;
        char choice = 'Y';
        Scanner sc=new Scanner(System.in);
        int index=0;
        do{
            System.out.println("\n1. place order\n2. Edit Bill Status\n3. Check today's collection");
            System.out.println("\n\nEnter your Choice ");
            menu=sc.nextInt();

            switch (menu){
                case 1:
                System.out.println("Enter order details");
                do{
                    System.out.println("Enter ItemId: ");
                    foodPlan[index]=sc.nextInt();
                    index++;

                    System.out.println("Enter Quantity\n: ");
                    foodPlan[index]=sc.nextInt();
                    index++;

                    System.out.println("\n\nDo you want to add another item? Y/N");
                    choice =sc.next().charAt(0);
                }
                while(choice =='Y' || choice == 'y');
                    System.out.println("The total bill is: "+order1.CalculateBillAmount(foodPlan));
                    break;
                case 2:
                System.out.println("Enter the order Id: ");
                break;

                case 3:
                    System.out.println("Today's collection is: ");
                    break;

                case 4:
                    break;
            }
            System.out.println("\n Press 'Y' to continue: ");
            choice = sc.next().charAt(0);
        }
            while(choice=='Y'||choice=='y');
            sc.close();

        
    }
}

