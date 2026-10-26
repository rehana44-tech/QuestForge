public class Goblin extends Enemy{
    public Goblin(String name,int health){
        super(name,health);
    }
    @Override 
    public void makeSound(){
        System.out.println(getName()+ " growls !");
    }
    
}
