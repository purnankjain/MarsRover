import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by purnankj on 16/07/15.
 */
public class CommandController {

    Rover r;
    String commandLine;
    Plateau plateau;

    public CommandController(Plateau plateau) {
        this.plateau = plateau;
    }

    public void startController(){

        RoverInitializer rm;
        rm = new RoverInitializer();

        r  = rm.getR1();
        commandLine = readLine("Enter Commands : ");

        MoveParser mp = new MoveParser(commandLine);

        while(mp.isNextCommand()){
            r.performCommand(mp.nextMove(),plateau);
        }

        System.out.println("Final Position : " + r.getX() + " " + r.getY() + " " + r.getsDirection());
    }

    public String readLine(String pStatement){
        String str = "";
        BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));
        System.out.println(pStatement);

        try{
            str = bf.readLine();
        }
        catch(Exception e){

        }

        return str;
    }

}
