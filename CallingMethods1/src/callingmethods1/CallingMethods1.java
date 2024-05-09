
package callingmethods1;


public class CallingMethods1 {
    
    public static int Subtract(int a , int b , int c)
    {
        int Difference = a - b - c;
        return Difference;
            
    }

   
    public static void main(String[] args) {
        
      // Introducing new variables method
                
                
      int x = 80;
      int y = 20;
      int z = 10;
      
      
      int total;
        total = Subtract(x,y,z);
      
      System.out.println(total);
        
    }
}

