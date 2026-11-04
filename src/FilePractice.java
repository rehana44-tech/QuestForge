import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FilePractice {
    public static void main(String[] args) throws IOException{
        FileWriter writer =new FileWriter("savegame.txt");
        writer.write("Player: Arin\n");
        writer.write("Health: 75\n");
        writer.write("Weapon: Iron Sword\n");

        writer.close();
        FileReader reader= new FileReader("savegame.txt");
       int character;

while ((character = reader.read()) != -1) {
    System.out.print((char) character);
}
reader.close();
    }
}
