package OUO.com;

public class test1 {
    public static void main(String[] args) {
        int[] englishs = { 80, 70, 60, 50, 40};
        int[] math = { 99, 88, 44, 77, 88};
        String[] name ={"samy","lucy","jane","rose","mina"};
        for (int i = 0; i < 5; i++) {
            if(i!=1){
                System.out.println(name[i]+"\t"+englishs[i]+"\t"+math[i]+"\t"+(englishs[i]+math[i])/2);
            }

        }
    }
}
