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
  inventory.showItems();

  inventory.removeItem("Health Potion");
  inventory.showItems();
  System.out.println("Total items: " + inventory.getItemCount());
  System.out.println("Has Iron Sword ?"+inventory.hasItem("Iron Sword"));
    System.out.println("Has Magic Wand ?"+inventory.hasItem("Magic Wand"));
  inventory.removeItem("Magic Wand");

    }
}
