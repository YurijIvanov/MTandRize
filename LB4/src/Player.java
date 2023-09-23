import java.util.Scanner;

public class Player{
    private String name;
    private String password;
    private int side;
    Player(int side){
        this.side=side;
    }

    public int[] move(){
        int col, row;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение строки: ");
        if (scan.hasNextInt()) {
            row = scan.nextInt();
        } else {
            return move();
        }

        System.out.println("Введите значение столбца: ");
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
