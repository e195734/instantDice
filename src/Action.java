import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Action{
    Players players = new Players();
    Scanner scanner = new Scanner(System.in);
    String getText() {
        System.out.println("plz enter cmd.");
        String inputData = scanner.nextLine();
        return inputData;
    }
    void mainAction(){
        String text = getText();
        String[] dataList = text.split(" ");
        if(dataList[0] == "ADD"){
            //ADD();
        }
        if(dataList[0].equals("STR")){
            List<Player> targetPlayer = new ArrayList<Player>();
            String diceType = "1d18";
            if (dataList.length >= 2){
                //targetPlayerに対象のプレイヤー入れる
                String[] temp = dataList[1].split(",");
                for (String idStr : temp){
                    targetPlayer.add(players.PlayerList.get(Integer.parseInt(idStr)));
                }
            }else{
                targetPlayer = new ArrayList<>(players.PlayerList.values());
            }
            if (dataList.length == 3){
                diceType = dataList[2];
            }
            for (Player player : targetPlayer){
                int result = Dice.run(diceType);
                System.out.println("dice: "+result+", target: "+player.getSTR());
                if (player.getSTR() >= result){
                    System.out.println(player.getName()+": 成功");
                }else{
                    System.out.println(player.getName()+": 失敗");
                }
            }
        }
        if(dataList[0].equals("CON")){

        }
        if(dataList[0].equals("POW")){

        }
        if(dataList[0].equals("DEX")){

        }
        if(dataList[0].equals("APP")){

        }
        if(dataList[0].equals("SIZ")) {

        }
        if(dataList[0] == "INT"){

        }
        if(dataList[0] == "EDU"){

        }
        if(dataList[0] == "HP"){

        }
        if(dataList[0] == "MP"){

        }
        if(dataList[0] == "SAN"){

        }
        if(dataList[0] == "IDEA"){

        }
        if(dataList[0] == "LUCK"){

        }
        if(dataList[0] == "KNOWLEDGE"){

        }
    }

    /*List<Integer> getData(String type){
        for(Player i:players.getPlayerData()){
            i.
        }
    }*/

    /*void ADD(){
        System.out.println("名前,STR,CON,POW,DEX,APP,SIZ,INT,EDU,HP,MP で入力してください");
        String data = getText();
        String[] dataList = data.split(",");
        //PlayerList.add(Player dataList[0] = new Player());
    }*/
}