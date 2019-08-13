import java.util.Scanner;
import java.util.Random;
class RockPaSc{
    public static void main(String[] args){
        System.out.println("가위바위보 게임.");
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("1.가위, 2.바위, 3.보");
        //컴퓨터가 가위를 냈다.
        int rps = 0;
        rps = ran.nextInt(3)+1;
        System.out.println(String.format("랜덤으로 나온 수 %d", rps));
        String dap = "";
        if(rps==1){
            dap = "가위";
        }else if(rps==2){
            dap = "바위";
        }else if(rps==3){
            dap = "보";
        }
        System.out.println("가위바위보 중 선택 [  ]");
        String answer = "";
        answer = scan.next();
        if(answer.equals(dap)){
            System.out.println("이겼습니다.");
        }else if(!answer.equals(dap)){
            System.out.println("졌습니다.");
        }else{
            System.out.println("잘못 입력했습니다.");
        }
    }
}