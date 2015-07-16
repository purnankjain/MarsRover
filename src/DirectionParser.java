/**
 * Created by purnankj on 16/07/15.
 */
public class DirectionParser {
    String toParse;
    int dir;

    public DirectionParser(String toParse) {
        this.toParse = toParse;
        dir = 0;
    }

    public void parse(){
        switch(toParse){
            case "N" : dir = 1;
                break;
            case "W" : dir = 2;
                break;
            case "S" : dir = 3;
                break;
            case "E" : dir = 4;
                break;
            default: ;
        }
    }

    public int getDir() {
        return dir;
    }
}
