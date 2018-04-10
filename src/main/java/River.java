import java.util.ArrayList;

public class River {

    private ArrayList<Salmon> salmons;

    public River(){
        this.salmons = new ArrayList<>();
    }

    public void addFish(Salmon fishToAdd){
        salmons.add(fishToAdd);
    }

    public int fishCount(){
        return salmons.size();
    }

    public Salmon removeFish(){
        return salmons.remove(0);
    }
}
