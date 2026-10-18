public class Game {
    public static void main(String[] args) {
        Player player1=new Player("Arin");
        Player player2=new Player("Luna");
        player1.introduce();
        player2.introduce();
        player1.setName("Mira");
        System.out.println("Updated name: "+player1.getName());
        player1.setName("");
        System.out.println("Name after invalid update: "+player1.getName());

    }
}
