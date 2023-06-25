package exam06;

public class Ex03 {
    public static void main(String[] args) {
        A a = new C(); // C,B,A

        A ad = new D(); // D, A

        if(ad instanceof C){
            C c1 = (C)ad;
        }

    }
}
