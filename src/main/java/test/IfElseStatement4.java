package test;

public class IfElseStatement4 {

    public static void main(String[] args) {

        int score = 60;

        if(score > 80){
            System.out.println("The student got A+");
        }
        if(score < 80 & score > 65){
            System.out.println("The student got A-");
        } else if (score < 65) {
            System.out.println("The student failed");

        }
    }
}
