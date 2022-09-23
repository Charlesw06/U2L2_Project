public class U2L2Runner {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(150, 200);
        Rectangle square = new Rectangle(100);
        Rectangle rectDefault = new Rectangle();

        rect1.setWidth(125);
        square.setWidth(125);
        square.setLength(125);
        rectDefault.setWidth(125);

        int perimRect1 = (2 * rect1.getLength()) + (2 * rect1.getWidth());
        int perimSquare = (4 * square.getLength());
        int perimRectDefault = (2 * rectDefault.getLength()) + (2 * rectDefault.getWidth());
        int perimSum = perimRect1 + perimRectDefault + perimSquare;

        int areaRect1 = rect1.calculateArea();
        int areaSquare = square.calculateArea();
        int areaRectDefault = rectDefault.calculateArea();
        int areaSum = areaRect1 + areaRectDefault + areaSquare;

        System.out.println("The total length that needs fencing is " + perimSum + " feet.");
        System.out.println("The total area that needs seeding is " + areaSum + " square feet.");
    }
}
