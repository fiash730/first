class Student {
    String name;
    private  int sex;
    private  int sex1;
    private  int sex3;

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSex1() {
        return sex1;
    }

    public void setSex1(int sex1) {
        this.sex1 = sex1;
    }

    public int getSex3() {
        return sex3;
    }

    public void setSex3(int sex3) {
        this.sex3 = sex3;
    }

    public int getSex2() {
        return sex2;
    }

    public void setSex2(int sex2) {
        this.sex2 = sex2;
    }

    private  int sex2;




    static int num =1;
     boolean isFee = false;

     void fees(){
        isFee = true;
      }

}





public class Main {

    public static void main(String[] args) {
       Student s1 = new Student();
       s1.name = "zhangsan";
       s1.isFee = true;
        System.out.println(s1.num);



    }
}
