import java.util.ArrayList;

public class Bear {
    private String name;
    private ArrayList<Salmon> stomach;

    public Bear(String name){
        this.name = name;
        this.stomach = new ArrayList<>();
    }

    public int foodCount(){
        return stomach.size();
    }

    public void eatFishFromRiver(River riverToFishFrom){
        Salmon fishedSalmon = riverToFishFrom.removeFish();
        stomach.add(fishedSalmon);
    }

    public void sleep(){
        stomach.remove(0);
    }

}