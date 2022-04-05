public class BoxShop {
    public static void main(String[] args) {
        Box b1 = new Box(3,4,5);
        Box b2 = new Box(2.5,3.6,4);
        Box b3 = new Box(3,4,5);

        double box_length = b1.getLength();
       // System.out.println("the length of the 1st box is:");
        b3.setHeight(15);

        String str = b2.toString();
        System.out.println(str);
    }
}
