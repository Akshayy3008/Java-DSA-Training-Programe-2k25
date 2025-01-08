class ReverseString {
        public static void main(String args[]){
            String str1 = "Hello World";
            char [] str = str1.toCharArray();
            int start =0,end=str.length-1;
            while(start < end){
                char temp = str[start];
                str[start] = str[end];
                str[end] = temp;
                start++;
                end--;
            }
            String rev = new String(str);
            System.out.println(rev);
        }
}