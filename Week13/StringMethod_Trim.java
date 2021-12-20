package Week13;

public class StringMethod_Trim {
    public static void main(String[] args) {
        String fullname = "   Narongsak pankerdpon   ";


        int count = fullname.length();
        System.out.println(count);
        System.out.println("before=>"+fullname);

        //.trim() ตัดช่องว่างของหน้าหลังออก
        String result = fullname.trim();
        System.out.println("after==>"+result);
        System.out.println(result.length());


        //.indexOf()  แสดงผลตำแหน่งที่ของอักษร
        System.out.println(fullname.indexOf("sa", 8));

        //.toUppercase()   .tolowerCase()
        System.out.println(result.length());
        System.out.println(result.toLowerCase());

        // .substring() การตัดค่าที่ต้องการ
        String uni ="Nakhon Pathom Rajabhat University";
        System.out.println(uni.substring(5,10));

    }
}
