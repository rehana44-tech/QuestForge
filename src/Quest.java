public class Quest {
    private String name;
    private String description;
    private QuestStatus status;
    public Quest(String name,String description){
        this.name=name;
        this.description=description;
        this.status=QuestStatus.NOT_STARTED;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public QuestStatus getStatus(){
        return status;
    }
    public void startQuest(){
        if(status==QuestStatus.NOT_STARTED){
            status=QuestStatus.IN_PROGRESS;
            System.out.println(name + " quest started !");
        }
        else{
            System.out.println("Quest cannot be started");
        }
    }
    public void completeQuest(){
        if(status==QuestStatus.IN_PROGRESS){
            status=QuestStatus.COMPLETED;
            System.out.println(name + " quest completed !");
        }
        else{
            System.out.println("Quest cannot be completed");
        }
    }
}
