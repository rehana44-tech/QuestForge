import java.util.Scanner;
public class Game {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

    System.out.println("===== QUESTFORGE =====");
    System.out.println("1. New Game");
    System.out.println("2. Load Game");
    System.out.println("3. Exit");

    System.out.print("Choose an option: ");
    int choice = scanner.nextInt();

    switch (choice) {
    case 1:{
         startNewGame();
        break;
    }
    case 2:{
        System.out.println("Loading saved game...");
        break;
    }
    case 3:{
        System.out.println("Exiting QuestForge. Goodbye!");
        break;
    }
    default:
        System.out.println("Invalid choice! Please select 1, 2, or 3.");
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
}
