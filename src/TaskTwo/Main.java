package TaskTwo;

public class Main {
    public static void main(String[] args) {
        Cafe TheGreenDragon = new Cafe();

        TheGreenDragon.loadMenuData();
        //If coffeeMenu is public we can use the below syntax "TheGreenDragon.coffeeMenu.size()" and TheGreenDragon.coffeeMenu.get(i)
        /*for (int i = 0; i < TheGreenDragon.coffeeMenu.size(); i++) {
            System.out.println(TheGreenDragon.coffeeMenu.get(i));*/

            //If it is private we can use the below syntax
            for (int i = 0; i < TheGreenDragon.getCoffeeMenu().size(); i++) {
                System.out.println(TheGreenDragon.getCoffeeMenu().get(i));
            }

        }
    }
