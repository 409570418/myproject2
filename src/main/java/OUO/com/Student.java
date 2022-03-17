package OUO.com;

public class Student {
    String name;
    int english;
    int math;

    public Student(String name){
        this.name =name;
    }
    public Student(String name,int english,int math){
        this(name);
        //this.name=name;
        this.english = english;
        this.math = math;

    }
    public Student(){

    }
    public void print(){
        int average=(english+math)/2;
        System.out.println(name+"\t"+english+"\t"+math+"\t"+average);
        if (average<60){
            System.out.println("*");
        }
        System.out.println();
    }
       public int average(){
        return (english+math)/2;
    }
}

