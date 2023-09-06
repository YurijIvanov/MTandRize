import java.util.Scanner;

public class Player{
    private String name;

    private int side;
    Player(String name,int side){
        this.name=name;
        this.side=side;
    }

    public int[] move(){
        int col, row;
        Scanner scan = new Scanner(System.in);
        System.out.println("Get row");
        if (scan.hasNextInt()) {
            row = scan.nextInt();
        } else {
            return move();
        }

        System.out.println("Get сol");
        if (scan.hasNextInt()) {
            col = scan.nextInt();
        }else{
            return move();
        }
        int mas[]={col, row};
        return mas;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
