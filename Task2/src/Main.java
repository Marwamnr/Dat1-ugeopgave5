
public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        Cafe.loadMenuData();

        for (int i = 0; i < cafe.getCoffeeMenu().size(); i++) {
            System.out.println(cafe.getCoffeeMenu().get(i));
        }
    }
}

