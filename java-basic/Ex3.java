import java.util.Scanner;
class Ex3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a, b, c = 0;
        System.out.println("첫번쨰 숫자 ! ");
        a = scanner.nextInt();
        System.out.println("두번째 숫자 ! ");
        b = scanner.nextInt();
        String op = "";
        System.out.println("연산종류를 선택하세요 + , - , * , / ");
        op = scanner.next();
        if(op.equals("+")){
            c = a + b;
            System.out.print(String.format("%d + %d = %d", a, b, c));
        }else if(op.equals("-")){
            c = a - b;
            System.out.print(String.format("%d - %d = %d", a, b, c));
        }else if(op.equals("*")){
            c = a * b;
            System.out.print(String.format("%d x %d = %d", a, b, c));
        }else if(op.equals("/")){
            c = a / b;
            System.out.print(String.format("%d / %d = %d", a, b, c));
        }
    }
}