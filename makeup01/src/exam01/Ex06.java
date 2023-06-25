package exam01;

public class Ex06 {
    public static void main(String[] args) {
        Student s1 = new Student(1000, "학생1", "과목1");
        Student s2 = new Student(1001,"학생2","과목2");

        s1.showInfo();
        s2.showInfo();

        System.out.println("s1 :" + System.identityHashCode(s1));
        System.out.println("s2 :" + System.identityHashCode(s2));

        System.out.println(s1 == s2);

        Student s3 = s2; //s3은 s2의 주소값을 복사

        s3.id = 1002;
        s2.name = "학생3";

        System.out.println("------s3------------");
        s3.showInfo();

        System.out.println("---------s2--------");
        s2.showInfo();

        s1 = null;
    }
}
