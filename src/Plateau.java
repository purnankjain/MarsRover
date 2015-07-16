/**
 * Created by purnankj on 16/07/15.
 */
public class Plateau {
    int x1,x2,y1,y2;

    public Plateau(String s){
        parseString(s);
    }

    public Plateau(int y2, int x2) {
        x1 = y1 = 0;
        this.y2 = y2;
        this.x2 = x2;
    }

    private void parseString(String str){
        String[] pos = str.split(" ");

        x2 = Integer.parseInt(pos[0]);
        y2 = Integer.parseInt(pos[1]);


    }


}
