import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Player X move first:");
        System.out.println("Set X player name:");
        Player X =new Player (scan.nextLine(),1);
        System.out.println("Set O player name:");
        Player O =new Player (scan.nextLine(),2);
        System.out.println();
        GameField field = new GameField();
        field.print_field();
        for(;field.getNum_step()!=9;) {
            if(field.getNum_step()==8){
                System.out.print("");
            }
            field.step(X);
            field.print_field();
            if(field.check_field(X,O)){
                break;
            }
            field.increaseNum_step();
            field.step(O);
            field.print_field();
            if(field.check_field(X,O)){
                break;
            }
            field.increaseNum_step();
        }
        scan.close();
    }
}