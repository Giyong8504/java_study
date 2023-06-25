package exam05;

public class JoinService {
    private static JoinService instance; //정의만함.  // this 가 없으니 얘도 static으로 해야함.

    private JoinService(){}
    public static JoinService getInstance() { // static으로 해야함.
        synchronized (JoinService.instance) { //쓰레드 안정성을 위해 필요한 부분.
            if (instance == null) {
                instance = new JoinService();
            }
            return instance;
        }
    }
}
