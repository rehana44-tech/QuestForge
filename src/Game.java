public class Game {

    public static void main(String[] args) {
  Enemy enemy1=new Goblin("Goblin" , 60);
  Enemy enemy2= new Dragon("Smaug",200);

  enemy1.makeSound();
  enemy2.makeSound();
  ((FireBreather) enemy2).breatheFire();
    }
}
