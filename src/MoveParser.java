/**
 * Created by purnankj on 16/07/15.
 */
public class MoveParser {
    String toParse;
    int index,cmdLength;

    public MoveParser(String toParse) {
        this.toParse = toParse;
        index = 0;
        cmdLength = toParse.length();
    }

    public String nextMove(){
        String str = toParse.substring(index,index+1);
        index++;
        return str;
    }

    public boolean isNextCommand(){
        if(index < cmdLength){
            return true;
        }
        else{
            return false;
        }
    }

}
