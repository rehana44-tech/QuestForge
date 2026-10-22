public class Game {
    public static void main(String[] args) {
        Weapon sword =new Weapon("Iron Sword",25);
        Player player1=new Player("Arin",sword);
        Enemy goblin=new Enemy("Goblin",60);
        System.out.println("Enemy: "+goblin.getName());
        System.out.println("Starting health: "+goblin.getHealth());
        int damageDealt=player1.attack();
        goblin.takeDamage(damageDealt);
                System.out.println("Damage received: " + damageDealt);
        System.out.println("Remaining health: " + goblin.getHealth());
        
       
    }
}
