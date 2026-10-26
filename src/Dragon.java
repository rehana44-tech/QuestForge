public class Dragon extends Enemy implements FireBreather{
    public Dragon(String name,int health){
        super(name, health);
    }
    @Override
    public void breatheFire(){
        System.out.println(getName()+" breathes fire !");
    }
    @Override 
    public void makeSound(){
        System.out.println(getName()+ " roars!");
    }
}
