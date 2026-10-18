public class Player{
    private String name;
    public Player(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        if(!name.isBlank()&&name!=null){
            this.name=name;
        }
    }
    void introduce(){
        System.out.println("I am "+name+", an adventurer!");
    }
}