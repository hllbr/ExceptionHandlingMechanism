
import jdk.nashorn.internal.ir.TryNode;


public class Main {
    public static void main(String[] args) {
        /*
        exception hata örnekleri 
        
        String s = null ;
        System.out.println(s.length());//NullPointerException
        
        int b = 12/0;//ArithmeticException
        
        String s = "a12";
        int i = Integer.parseInt(s);//NumberFormatException
        */
       //Try-Catch ile Hata Yakalama
        System.out.println("Bu alan aktif çalışma satıları arasındadır.(1)");
        //int a = 30/0;//Uncheck exception hatası bizim tarafımızdan öngörülmesi gereken hata sınıfında
       // int [] b = {1,2,3,4,5};
     //   System.out.println(b[6]);
        System.out.println("**************************************************");
        System.out.println("**************************************************");

     try{
         int a = 30/0;
     }catch(ArithmeticException e){
         System.out.println("bir sayı sıfıra bölünemez ");
     }//exception class diğer hata classları için bir super classtır.
        System.out.println("**************************************************");
        System.out.println("**************************************************");

        try {//Array Hatası yerine bu şekildede tanımlayabiliriz.
            
            int [] b = {1,2,3,4,5,6};
            System.out.println(b[8]);
        } catch (Exception e) {
            System.out.println("mevcut olmayan bir indexi size getiremeyiz.");
        }
        System.out.println("**************************************************");
        System.out.println("**************************************************");

        try{
            int [] c = {1,2,3,4,5};
            System.out.println(c[58]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("böyle biğr indesx hafızada mevcut değil...");
        }

        System.out.println("Bu alan aktif çalışma satıları arasındadır.(2)");
        try {
            int K = 58/0;
        } catch (RuntimeException e) {
        e.printStackTrace();
        }
        System.out.println("bu alan aktif olarak çalışıyor....");
        
       //Cstch blokları özelden genele doğru yazılmalıdır.
       
        
    
    
    
    
    
    
    
    
    
    }
    
    
}
