package Week17;

public class Method_ex01 {
    public static void main(String[] args) {
        //method แบบที่ 1 ไม่มีการส่งค่าจาก method main และไม่มีการคืนค่าจาก method ลูก
        
        openFile();
        playFile();
        pauseFile();
        closeFile();
    
        


    }
    public static void openFile (){
        System.out.println("Open file..................");
    } 
    public static void playFile (){
        System.out.println("Play Misic..................");
    } 
    public static void pauseFile (){
        System.out.println("Stop Misic..................");
    } 
    public static void closeFile (){
        System.out.println("Exit Misic..................");
    } 


    // static void showName(){
    //     System.out.println("Narongsak...........................");


    // }
}
