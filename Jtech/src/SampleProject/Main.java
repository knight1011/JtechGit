package SampleProject;

public class Main {

    public static void main(String[] args) {

        System.out.println("加減算処理\n");

        Arithmetic am = new Arithmetic();
        System.out.println("足し算をします\n");
        int ans = am.add(100, 200);
        System.out.println("答えは" + ans + "です");
        
        System.out.println("");

        System.out.println("引き算をします\n");
        ans = am.add(300, 200);
        System.out.println("答えは" + ans + "です");

    }
}