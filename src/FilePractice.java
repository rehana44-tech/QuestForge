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
        writer.write("Damage: " + player.getWeapon().getDamage() + "\n");
        writer.close();
        FileReader reader= new FileReader("savegame.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
String line;
int loadedHealth = 0;
String loadedName="";
String loadedWeapon="";
int loadedDamage=0;
while ((line = bufferedReader.readLine()) != null) {

    System.out.println(line);

    if (line.startsWith("Health: ")) {
        String savedHealth = line.substring(8);

        loadedHealth = Integer.parseInt(savedHealth);
    }
    if(line.startsWith("Player: ")){
        loadedName=line.substring(8);
        
    }
    if (line.startsWith("Weapon: ")) {
    loadedWeapon = line.substring(8);
}
    if (line.startsWith("Damage: ")) {
    String savedDamage = line.substring(8);
    loadedDamage = Integer.parseInt(savedDamage);
}
}

bufferedReader.close();

Weapon loadedWeaponObject= new Weapon(loadedWeapon,loadedDamage);
Player loadedPlayer = new Player(loadedName, loadedWeaponObject);
System.out.println("Loaded player's weapon: " + loadedPlayer.getWeapon().getName());
System.out.println("New player's health before loading: " + loadedPlayer.getHealth());

loadedPlayer.setHealth(loadedHealth);

System.out.println("New player's health after loading: " + loadedPlayer.getHealth());
System.out.println("Loaded name: " + loadedPlayer.getName());
System.out.println("Loaded weapon: " + loadedWeapon);
System.out.println("Loaded damage: " + loadedDamage);
System.out.println("Loaded weapon damage: " + loadedPlayer.getWeapon().getDamage());
    }
}
