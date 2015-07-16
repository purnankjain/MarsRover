/**
 * Created by purnankj on 16/07/15.
 */
public class PositionParser {
    String toParse;
    int x,y,direction;

    public PositionParser(String toParse) {
        this.toParse = toParse;
        x = y = direction = 0;
    }

    public void parseString(){
        String[] str = toParse.split(" ");

        x = Integer.parseInt(str[0]);
        y = Integer.parseInt(str[1]);

        DirectionParser dp = new DirectionParser(str[2]);
        dp.parse();
        direction = dp.getDir();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDirection() {
        return direction;
    }
}
