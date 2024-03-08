package TaskTwo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Cafe {
    private ArrayList<String> menuList = new ArrayList<>();
    String name;

    public Cafe(String name){
        this.name = name;
    }

    public void loadMenuData(String path) {
        File file = new File(path);
        try{
            Scanner scanner = new Scanner(file);
            scanner.nextLine(); //Skip header
            String dotSpace = ".....";

            while(scanner.hasNextLine()){
                String[] line = scanner.nextLine().split(",");   //Putting our elements in our menu into an Array.
                String name = line[0];
                int price = Integer.parseInt(line[1].trim());
                menuList.add(name + dotSpace + price);
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found. Check path and filename");
        }
    }
    public ArrayList<String> getMenu() {
        return menuList;
    }


}
