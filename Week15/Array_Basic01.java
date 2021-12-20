package Week15;

public class Array_Basic01 {
    public static void main(String[] args) {
        //การประกาศตัวแปรแบบarray
        //แบบที่1 : ประกาศแบบกำหนดสมาชิก
        int [] number = {1,2,3,55,66,99,77,15};

        int size = number.length;

        System.out.println(size);
        System.out.println(number.length); //หาความยาวของอาเรย์
        System.out.println(number[4]); //การเข้าถึงของตัวแปร

        //การเปลี่ยนค่าข้อมูลในตัวแปร
        number[4]= 88;
        System.out.println(number[4]);


        //a.length();

        //แบบที่2 : ประกาศแบบกำหนดขนาด
        
       // char [] alphabet; //ประกาศอาเรย์
       // alphabet =new char [26];     //สร้างอาเรย์
        char [] alphabet = new char[26];
        alphabet[0] ='a';
        alphabet[1] ='b';
        alphabet[2] ='c';

        System.out.println(alphabet[2]);
        System.out.println(alphabet[26]);
        System.out.println(alphabet.length);

        int []num = new int [10];
        System.out.println(num[9]);




        //char [] alphabet = {'a','b','c'}



    }
}
