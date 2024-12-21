//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Firma company = Utils.initData();
        String title = "Panel administracyjny firmy"+company.getName();
        System.out.println("-".repeat(title.length()));
        System.out.println(title);
        System.out.println("-".repeat(title.length()));
    }
    boolean done= false;
        while(!done) {
            try {
                Scanner input = new Scanner(System.in);

                System.out.print("Wybierz operacje, którą chcesz wykonać");
                System.out.println("----------------");
                System.out.println("Wybierz 3 jeśli chcesz zwolnić pracownika");
                System.out.println("Wybierz 2 jeśli chcesz dodać pracownika");
                System.out.println("Wybierz 1 jeśli chcesz wyświetlić listę pracowników");
                System.out.println("Wybierz 0 aby opuścić program");


                switch () {
                    case 0:
                        done=true;;
                        break;
                    case 1:
                        company.employees.get(i).toString();
                        break;
                    default:
                        System.out.println("Prosimy wybrać numer operacji");
                }
                done = true;
            }catch(InputMismatchException e){
                System.out.println("Proszę podać liczbę całkowitą");
            }
        }
    Scanner input = new Scanner(System.in);

    static String inputString()
    static int input(String message) {

            Scanner input = new Scanner(System.in);
            System.out.print(message);
            return input.nextInt();
}
