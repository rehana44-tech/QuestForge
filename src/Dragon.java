public class Dragon extends Enemy{
    public Dragon(String name,int health){
        super(name, health);
    }
    public void breatheFire(){
        System.out.println(getName()+" breathes fire !");
    }
}
