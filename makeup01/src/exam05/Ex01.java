package exam05;

public class Ex01 {
    public static void main(String[] args) {
//        JoinService service = new JoinService();

        JoinService service1 = JoinService.getInstance();
        JoinService service2 = JoinService.getInstance();
        System.out.println(service1 == service2);

    }
}
