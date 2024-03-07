package TaskTwo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Cafe {
    private ArrayList<String> coffeeMenu = new ArrayList<>();

    public void loadMenuData() {
        File file = new File("src/TaskTwo/coffees.txt");
        try{
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                coffeeMenu.add(scanner.nextLine());
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found. Check path and filename");
        }
    }

    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }
}
