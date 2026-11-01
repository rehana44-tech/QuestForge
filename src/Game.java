public class Game {

    public static void main(String[] args) {
  Enemy enemy1=new Goblin("Goblin" , 60);
  Enemy enemy2=new Dragon("Smaug",200);
  FireBreather creature= new Dragon("Smaug",200);

  enemy1.makeSound();
  enemy2.makeSound();
  creature.breatheFire();
  Inventory inventory= new Inventory();
  inventory.addItem("Iron Sword");
  inventory.addItem("Health Potion");
  inventory.addItem("Wooden Shield");
  inventory.addItem("Magic Wand");
 inventory.addItem("Steel Armor");
 inventory.addItem("Golden Bow");
 inventory.addItem("");
  inventory.addItem(" ");

  inventory.showItems();


System.out.println("\n--- QUEST SYSTEM ---");

Quest goblinQuest = new Quest(
    "Defeat the Goblin",
    "Defeat one Goblin to protect the village."
);

System.out.println("Quest: " + goblinQuest.getName());
System.out.println("Status: " + goblinQuest.getStatus());

goblinQuest.startQuest();

// Try completing the quest without completing its objective
goblinQuest.completeQuest();

// Now complete the objective
goblinQuest.completeObjective();

// Try completing the quest again
goblinQuest.completeQuest();

System.out.println("Final Status: " + goblinQuest.getStatus());


    }
}
