package TaskTwo;

public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe("The Green Dragon");
        Cafe cafe1 = new Cafe("Den Gyldne Globus");

        cafe.loadMenuData("src/TaskTwo/coffees.txt");
        cafe1.loadMenuData("src/TaskTwo/globus.txt");

        printMenu(cafe);
        System.out.println("");
        printMenu(cafe1);
        }

        public static void printMenu(Cafe cafe){
            //If coffeeMenu is public we can use the below syntax "cafe.coffeeMenu.size()" and cafe.coffeeMenu.get(i)
        /*for (int i = 0; i < cafe.coffeeMenu.size(); i++) {
            System.out.println(cafe.coffeeMenu.get(i));*/

            //If it is private we can use the below syntax
            for (int i = 0; i < cafe.getMenu().size(); i++) {
                System.out.println(cafe.getMenu().get(i));
            }
        }
    }
