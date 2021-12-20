package Week13;

public class StringMethod_StartEnd {
    public static void main(String[] args) {
       String fullname = "นายสมชาย เข็มขัด";
       
       //หาตำแหน่งของคำ  .startsWith()
       boolean result = fullname.startsWith("นาย");


       if (result) {
           System.out.println(fullname + " เป็นเพศชาย ");
       } else {
           System.out.println(fullname+ "เพศหญิง");
       }

       // หาตำแหน่งของคำจากด้านหลัง  .endsWith()
       String code = "356278TH";
       
       boolean result1 =code.endsWith("TH");
       if (result) {
        System.out.println("สินค้า" +code + " มาจากประเทศไทย ");
    } else {
        System.out.println("สินค้า"+ code + "ไม่ได้มาจากประเทศไทย");
    }
       
      
    }
}
