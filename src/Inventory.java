import java.util.ArrayList;
public class Inventory {
    private final int maxCapacity=5;
    private ArrayList<String> items=new ArrayList<>();
    public void addItem(String item){
        if(item==null||item.isBlank()){
            System.out.println("Item name cannot be empty");
            return;
        }
        if(items.size()<maxCapacity){
        items.add(item);
        System.out.println(item+" added to inventory");
        }
        else{
            System.out.println("Inventory is full");
        }
    }
    public void showItems(){
        System.out.println("Your Inventory: ");
        for(String item: items){
            System.out.println("- "+item);
        }
    }
    public void removeItem(String item){
        if(items.remove(item)){
            System.out.println(item+" removed from Inventory");
        }
        else{
            System.out.println(item+" not found");
        }
    }
    public boolean hasItem(String item){
        return items.contains(item);
    }
    public int getItemCount(){
        return items.size();
    }
}
