import java.util.Scanner;
class WhereLive{
    public static void main(String[] args){
        System.out.println("어디 살아요?");
        String where = "";
        Scanner scanner = new Scanner(System.in);
        where = scanner.next();
        System.out.println(String.format("나는 %s 에 산다", where));
    }
}