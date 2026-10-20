public class Game {
    public static void main(String[] args) {
        Player player1=new Player("Arin");
        System.out.println("Player: "+player1.getName());
        System.out.println("Starting health: "+player1.getHealth());
        player1.takeDamage(30);
        System.out.println("Health after attack: "+player1.getHealth());
        System.out.println("Is player alive? "+player1.isAlive());
        
    }
}
