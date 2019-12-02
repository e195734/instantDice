import java.util.Random;

public class Dice {
    public static int run(String type){
        Random random = new Random();
        int sum = 0;
        String[] temp = type.split("d");
        for (int i = 0; i < Integer.parseInt(temp[0]); i++){
            sum += random.nextInt(Integer.parseInt(temp[1]));
        }
        return sum;
    }

    public static int run(){
        return run("1d100");
    }
}
