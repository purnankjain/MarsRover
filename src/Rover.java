/**
 * Created by purnankj on 16/07/15.
 */
public class Rover {
    int x,y,direction;
    String sDirection;

    public Rover(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        sDirection = updateSDir();
    }

    public String updateSDir(){
        switch (direction){
            case 1 : return "N";
            case 2 : return "W";
            case 3 : return "S";
            case 4 : return "E";
            default: ;
        }
        return " ";
    }

    public void moveRover(Plateau p){
        switch(direction){
            case 1 : if(p.y2 == y){
                System.out.println("Unable to move there");
            }
            else{
                y++;
            }
                break;
            case 2 : if(p.x1 == x){
                System.out.println("Unable to move there");
            }
            else{
                x--;
            }
                break;
            case 3 : if(p.y1 == y){
                System.out.println("Unable to move there");
            }
            else{
                y--;
            }
                break;
            case 4 : if(p.x2 == x){
                System.out.println("Unable to move there");
            }
            else{
                x++;
            }
                break;
            default:break;
        }
    }

    public void performCommand(String cmd, Plateau p){
        switch(cmd){
            case "L" : direction = ((direction + 1)%4) + 1;
                break;

            case "R" : direction = ((direction - 1)%4) + 1;
                break;

            case "M" : moveRover(p);
                break;
            default:;
        }
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

    public String getsDirection() {
        return sDirection;
    }
}
