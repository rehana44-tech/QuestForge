public class Game {
    public static void main(String[] args) {
        Weapon sword =new Weapon("Iron Sword",25);
        Player player1=new Player("Arin",sword);
        System.out.println("Player: "+player1.getName());
        System.out.println("Weapon:  "+player1.getWeapon().getName());
        System.out.println("Weapon damage:  "+player1.getWeapon().getDamage());
     
    }
}
