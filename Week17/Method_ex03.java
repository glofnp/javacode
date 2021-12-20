package Week17;

public class Method_ex03 {
      //แบบที่3 ไม่มีการรับค่าที่ส่งมาจาก main progarm แต่ลุกส่งค่าคืนให้แม่
    public static void main(String[] args) {
        int  phone = getPhoneNumber();
        System.out.println(getPhoneNumber());
        
        int lucky = 999;
        int newphone = phone+lucky;
        System.out.println(newphone);
     }
 
     static int getPhoneNumber(){
         return 982466872;
     }
    
    }

