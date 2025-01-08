public class Palindrome {
    public static void main(String[] var0) {
        String var1 = "Hello World";
        char[] var2 = var1.toCharArray();
        int var3 = 0;
  
        for(int var4 = var2.length - 1; var3 < var4; --var4) {
           char var5 = var2[var3];
           var2[var3] = var2[var4];
           var2[var4] = var5;
           ++var3;
        }
  
        String var6 = new String(var2);
        System.out.println(var6);
        if(str.equals(rev)){
            System.out.println("Palindrome");
    
        }
        else{
            System.out.println("not a Palindrome");
        }
     }
}
