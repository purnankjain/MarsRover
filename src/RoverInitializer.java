import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by purnankj on 16/07/15.
 */
public class RoverInitializer {

    Rover r1;
    String commandToFollow;

    public RoverInitializer() {
        getRoverPosition();
    }

    public void getRoverPosition(){
        String str = readLine("Position : ");

        PositionParser p = new PositionParser(str);
        p.parseString();

        r1 = new Rover(p.getX(),p.getY(),p.getDirection());
    }

    public Rover getR1() {
        return r1;
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
