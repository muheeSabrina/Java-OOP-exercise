package week3.exercises;
public class Week3main {
    public static void main(String[] args) {

        BookShop bs1 = new BookShop(111);
        bs1.setTitle("C++");
        bs1.setAuthor("H Schidit");
        BookShop bs2 = new BookShop(112);
        bs2.setTitle("Python");
        bs2.setAuthor("Eric ");
        BookShop bs3 = new BookShop(113);
        bs3.setTitle("Java");

        bs3.setAuthor("Oracle");
        System.out.print(  bs1.toString());
        System.out.print(bs2.toString());
        System.out.print(bs3.toString());

    }
}
