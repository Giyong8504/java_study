package exam01;

public class Student {
     int id; //학번
     String name; //이름
     String subject; //전공과목

     public Student() {
          //객체가 만들어지고 나서 할 작업..
          //주로 객체 생성이후 멤버 변수 초기화
          id = 1000;
          name = "이름1";
          subject = "과목1l";
     }

     public Student(int _id,String _name, String _subject) {
          id = _id;
          name = _name;
          subject = _subject;
     }

     void study(){
          System.out.println(name + "이 " + subject + "를 공부한다.");

     }
     void showInfo() {
          System.out.println("id= "+ id +", name=" +name + ", subject=" + subject);
     }
}
