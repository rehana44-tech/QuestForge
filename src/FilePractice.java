import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FilePractice {
    public static void main(String[] args) throws IOException{
        Weapon weapon =new Weapon("Iron Sword",25);
        Player player =new Player("Arin",weapon);
        player.takeDamage(35);
        player.setHealth(45);
        System.out.println("Current health: " + player.getHealth());
        FileWriter writer =new FileWriter("savegame.txt");
        writer.write("Player: " + player.getName() + "\n");
writer.write("Health: " + player.getHealth() + "\n");
writer.write("Weapon: " + player.getWeapon().getName() + "\n");

        writer.close();
        FileReader reader= new FileReader("savegame.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
while ((line = bufferedReader.readLine()) != null) {
    System.out.println(line);
}
bufferedReader.close();

String savedHealth = "45";

int health = Integer.parseInt(savedHealth);

System.out.println("Converted health: " + health);
    }
}
