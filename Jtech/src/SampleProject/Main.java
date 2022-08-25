package SampleProject;

public class Main {

    public static void main(String[] args) {

	Arithmetic am = new Arithmetic();
        System.out.println("足し算をします\n");
	int ans = am.add(100, 200);
        System.out.println("答えは" + ans + "です");
    }
}