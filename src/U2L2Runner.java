import java.util.Scanner;

public class U2L2Runner {
    public static void main(String[] args) {
        Scanner numLumber = new Scanner(System.in);
        System.out.println("How many pieces of lumber do you need?");
        int lumberNum = numLumber.nextInt();

        Scanner numWindows = new Scanner(System.in);
        System.out.println("How many windows do you need?");
        int windowsNum = numWindows.nextInt();

        Scanner rateOfTax = new Scanner(System.in);
        System.out.println("What is the rate of tax in your area (decimal form)?");
        double taxRate = rateOfTax.nextDouble();

        ConstructionPricer userPrice = new ConstructionPricer(11.50, 25.75, taxRate);
        double costNoTax = userPrice.materialsCost(lumberNum, windowsNum);
        double costWithTax = userPrice.totalWithTax(costNoTax);

        System.out.println("---------------------");
        System.out.println("Total Materials Cost: $" + String.format("%.2f", costNoTax));
        System.out.println("Grand Total With Tax: $" + String.format("%.2f", costWithTax));
    }
}

/*  Code for rectangle Calculator

    public class U2L2Runner {
        public static void main(String[] args) {
             Rectangle rect1 = new Rectangle(150, 200);
             Rectangle square = new Rectangle(100);
             Rectangle rectDefault = new Rectangle();

             rect1.setWidth(125);
             square.setWidth(125);
             square.setLength(125);
             rectDefault.setWidth(125);

             int perimRect1 = rect1.perimeter();
             int perimSquare = square.perimeter();
             int perimRectDefault = rectDefault.perimeter();
             int perimSum = perimRect1 + perimRectDefault + perimSquare;
             int areaRect1 = rect1.calculateArea();
             int areaSquare = square.calculateArea();
             int areaRectDefault = rectDefault.calculateArea();
             int areaSum = areaRect1 + areaRectDefault + areaSquare;

             System.out.println("The total length that needs fencing is " + perimSum + " feet.");
             System.out.println("The total area that needs seeding is " + areaSum + " square feet.");
       }
   }

*/