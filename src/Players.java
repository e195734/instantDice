import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Players {
    Map<Integer, Player> PlayerList = new HashMap<Integer, Player>();
    Players(){
        var temp = new Player("桐生一馬",10,13,17,11,9,13,10,7,13,17);
        this.PlayerList.put(temp.getId(),  temp);
    }
}
