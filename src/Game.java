
public class Game {

    public static void main(String[] args) {
        Dragon dragon = new Dragon("Smaug", 200);

        System.out.println("Enemy: " + dragon.getName());
        System.out.println("Starting health: " + dragon.getHealth());

        dragon.breatheFire();

        dragon.takeDamage(50);

        System.out.println("Health after attack: " + dragon.getHealth());
        System.out.println("Is the Dragon alive? " + dragon.isAlive());
    }
}
