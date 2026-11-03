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
Player player=new Player("Arin",new Weapon("Iron Sword",25));
int damage=player.attack();
goblin.takeDamage(damage);

System.out.println("Goblin health after attack: "+goblin.getHealth());
System.out.println("Goblin alive: "+goblin.isAlive());

while (goblin.isAlive()) {
    int nextDamage = player.attack();
    goblin.takeDamage(nextDamage);

    System.out.println("Goblin health: " + goblin.getHealth());
}
if(!goblin.isAlive()){
    goblinQuest.completeObjective();
}
goblinQuest.completeObjective();
goblinQuest.completeQuest();
System.out.println("Final Quest Status: "+goblinQuest.getStatus());
    }
}
