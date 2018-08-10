public class HW7 {
    public static void main(String[] args) {
        System.out.println("List of cats:");
        Cat[] x = {new Cat("Matroskin", 17), new Cat("Kyzya", 20), new Cat("Kot", 15)};
        Bowl bowl = new Bowl(40);
        for (Cat c : x) {
            System.out.println(c);
        }
        System.out.println("\n" + bowl);
        System.out.println("increase food by 60");
        bowl.increaseFood(60);
        System.out.println(bowl);
        System.out.println("Cats take food:");
        for (Cat c : x) {
            c.eat(bowl);
            System.out.println(c);
            System.out.println(bowl);
        }
    }
}
