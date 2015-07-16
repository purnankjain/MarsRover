import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by purnankj on 16/07/15.
 */
public class MarsRover {
    public static void main(String args[]){

        MarsRover mr = new MarsRover();
        String str = "";
        str = mr.readLine("Plateau Values : ");
        Plateau p = new Plateau(str);

        CommandController cmd = new CommandController(p);
        cmd.startController();
    }

    public String readLine(String pStatement){
        String str = "";
        BufferedReader bf = new BufferedReader( new InputStreamReader (System.in));
        System.out.println(pStatement);

        try{
            str = bf.readLine();
        }
        catch(Exception e){

        }
return  str;
    }

}
