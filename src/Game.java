import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Game {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Player player = null;
      boolean running = true;

while (running) {
    System.out.println("===== QUESTFORGE =====");
   System.out.println("1. New Game");
System.out.println("2. Load Game");
System.out.println("3. Save Game");
System.out.println("4. Exit");

    System.out.print("Choose an option: ");
    int choice = scanner.nextInt();
    switch (choice) {
    case 1:{
          player=startNewGame();
        break;
    }
    case 2:{
        player = loadGame();
          if (player != null) {
        System.out.println("Game loaded successfully!");
        System.out.println("Player: " + player.getName());
        System.out.println("Health: " + player.getHealth());
        System.out.println("Weapon: " + player.getWeapon().getName());
    }
        break;
    }
    case 3: {
    if (player != null) {
        saveGame(player);
    } else {
        System.out.println("No active game to save!");
    }
    break;
}
    case 4:{
        System.out.println("Exiting QuestForge. Goodbye!");
        running=false;
        break;
    }
    default:
        System.out.println("Invalid choice! Please select 1, 2,3 or 4.");
}
}
    scanner.close();

    }
    public static Player startNewGame(){
        Player player = new Player("Arin", new Weapon("Iron Sword", 25));

    System.out.println("New game started!");
    System.out.println("Player: " + player.getName());
    System.out.println("Health: " + player.getHealth());
    System.out.println("Weapon: " + player.getWeapon().getName());

    Inventory inventory = new Inventory();

   inventory.addItem("Iron Sword");
   inventory.addItem("Health Potion");
   inventory.addItem("Wooden Shield");

   inventory.showItems();

   System.out.println("\n--- QUEST SYSTEM ---");

Goblin goblin = new Goblin("Goblin", 60);

Quest goblinQuest = new Quest(
    "Defeat the Goblin",
    "Defeat one Goblin to protect the village."
);

System.out.println("Quest: " + goblinQuest.getName());
System.out.println("Description: " + goblinQuest.getDescription());
System.out.println("Status: " + goblinQuest.getStatus());

goblinQuest.startQuest();

   System.out.println("Goblin health: " + goblin.getHealth());
System.out.println("Goblin alive: " + goblin.isAlive());

int damage = player.attack();
goblin.takeDamage(damage);

System.out.println("Goblin health after attack: " + goblin.getHealth());
System.out.println("Goblin alive: " + goblin.isAlive());

while (goblin.isAlive()) {
    int nextDamage = player.attack();
    goblin.takeDamage(nextDamage);

    System.out.println("Goblin health: " + goblin.getHealth());
}

if (!goblin.isAlive()) {
    goblinQuest.completeObjective();
}

goblinQuest.completeQuest();

System.out.println("Final Quest Status: " + goblinQuest.getStatus());
return player;    
}
public static Player loadGame() {

    System.out.println("Loading saved game...");
    String loadedName = "";
    int loadedHealth = 0;
    String loadedWeapon = "";
    int loadedDamage = 0;

    try {
    FileReader fileReader = new FileReader("savegame.txt");
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    String line = bufferedReader.readLine();
    loadedName=line.substring(8);
    line = bufferedReader.readLine();
    loadedHealth = Integer.parseInt(line.substring(8));
    line = bufferedReader.readLine();
    loadedWeapon = line.substring(8);
    line = bufferedReader.readLine();
    loadedDamage = Integer.parseInt(line.substring(8));
    bufferedReader.close();

    Weapon weapon = new Weapon(loadedWeapon, loadedDamage);
    Player loadedPlayer = new Player(loadedName, weapon);
    loadedPlayer.setHealth(loadedHealth);
    return loadedPlayer;
}
catch (IOException e) {
    System.out.println("No saved game found!");
    return null;
}


}
public static void saveGame(Player player) {
try {
    FileWriter writer = new FileWriter("savegame.txt");
    writer.write("Player: " + player.getName() + "\n");
    writer.write("Health: " + player.getHealth() + "\n");
    writer.write("Weapon: " + player.getWeapon().getName() + "\n");
    writer.write("Damage: " + player.getWeapon().getDamage() + "\n");
    writer.close();
System.out.println("Game saved successfully!");
}
catch (IOException e) {
    System.out.println("Error saving game!");
}
}
}
