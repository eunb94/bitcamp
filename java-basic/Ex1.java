import java.util.Scanner;
class Ex1 {
    public static void main(String[] args){
        System.out.print("1+1이 뭐예요?");
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        System.out.println("1+1은" + number + "입니다.");
        System.out.println("왜 그런가요?");
        int a = 0;
        int b = 0;
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println(a +" 더하기 "+ b +"는 2이기 때문 입니다.");
    }
}