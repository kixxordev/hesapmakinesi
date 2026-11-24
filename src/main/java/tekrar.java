
import java.util.Scanner;

    public class tekrar {
        
       /* 
        public static void main(String[] args) {
            tekrarCls();
        }
        */
        
        public static boolean tekrarSor() {
      
        Scanner girdi = new Scanner(System.in);
            
            System.out.println("Tamam, islemin bitmis olabilir. Ama bu bir son degildir belki de..");
            System.out.print("Tekrar bir islem yapmak ister misin? Evet veya hayir olarak cevapla: ");
            String karar = girdi.next().toLowerCase();
            
            boolean kabul = false;
            
            switch (karar) {
                case "evet" ->  {
                    kabul = true;
                    break;
                }
                
                case "hayır" ->  { 
                        kabul = false;
                        break;
                }
                
                default -> { 
                    System.out.println("Gecersiz bir mesaj girdigin icin islem sonlandirildi.");
                    System.exit(0);
                }
                           
            }
                
            return kabul;
    
            }
        
        
        public static boolean tekrarCls() {
            
            boolean kabul = tekrarSor();
            
            if (kabul == true) {
                
                Main.main();
                
                return true;
                
            } else {
                
                System.out.println("Olsun.. Yine bekleriz...");
                System.exit(0);
                
                return false;
             
            }
                
        
    }
        
    }
