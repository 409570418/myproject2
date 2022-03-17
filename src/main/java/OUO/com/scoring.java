package OUO.com;

public class scoring {
    public static void main(String[] args) {
        Student samy = new Student("Samy",25,88);
        Student hank = new Student("Hank",90,10);
        GraduateStudent jane=
                new GraduateStudent("Jane",60,70,85);
 //       samy.name="Samy";

        samy.print();
        hank.print();
        jane.print();


    }
}
