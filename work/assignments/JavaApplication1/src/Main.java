/**
 *
 * @author 20-12S18028 Alda Lumban Gaol
 * @author 20-12S18060 Elsaday Bakara
 */
public class Main {
    public static void main(String[] _args) {
       
    System.out.println("Hello, world!");
    
    int gear = 1;
    boolean result = true;
    char capitalC = 'C';
    byte b = 100;
    
    System.out.println(gear + ", " + result + ", " + capitalC + ", " + b);
    
    gear++;
    result = !result;
    capitalC += 4;
    
     System.out.println(gear + ", " + result + ", " + capitalC + ", " + b);
    
     //26 in hexadecimal and binary
     int hexVal = 0x1a;
     int binVal = 0b11010;
     
     System.out.println(hexVal + ", " + binVal);
     
     String name = "Wiro Sableng";
     Short gearObject = 1;
     Boolean resultObj = true;
     
     System.out.println(name + ", " + gearObject + ", " + resultObj);
     
     name = name.toUpperCase();
     gearObject++;
     resultObj = (result == false) || !resultObj;
     
     System.out.println(name + ", " + gearObject + ", " + resultObj);
     
     int[][] numbers = new int[10][10];
     
     for (int i = 0; i < numbers.length; i++){
         for (int j = 0; j < numbers[i].length; ++j){
             numbers[i][j] = i + j;
         }
     }
     for (int i = 0; i < numbers.length; ++i){
         for (int j = 0; j < numbers[i].length; ++j){
             System.out.print(numbers[i][j] + " ");
         }
        System.out.println();
     }
    } 
   
}

    

