package Week17;

public class Method_ex02 {
    //method แบบที่ 2 มีการรับค่าที่ส่งมากจาก main program แต่ไม่มีการรับค่าออก
    public static void main(String[] args) {
        display("ดีใจจัง เรียนใกล้จบแล้ว");
        display("ไปตลาดให้หน่อยลูก");
        fullname("Suda","Maneenuch");
    }

    static void display (String x){
      System.out.println(x);
    }
    static void fullname (String fname,String Lname){
        System.out.println(fname + "  " + Lname);
      }
}
