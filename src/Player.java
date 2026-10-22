public class Player{
    private String name;
    private int health;
    private Weapon weapon;
    public Player(String name,Weapon weapon){
        this.name=name;
        this.health=100;
        this.weapon=weapon;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        if(!name.isBlank()&&name!=null){
            this.name=name;
        }
    }
    public int getHealth(){
        return health;
    }
    public Weapon getWeapon(){
        return weapon;
    }
    public int attack(){
        System.out.println(name+ " attacks with "+weapon.getName()+"!");
        return weapon.getDamage();
    }
    public void takeDamage(int damage){
        if(damage<=0){
            System.out.println("Damage must be positive");
            return ;
        }
        health=health-damage;
        if(health<0){
            health=0;
        }
    }
    public boolean isAlive(){
        return health>0;
    }
    void introduce(){
        System.out.println("I am "+name+", an adventurer!");
    }
}