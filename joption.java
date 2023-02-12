public class joption {
    public static void main(String[] args) {
        //input mmmmm
        // output MmMmMmMm
        // String a = "mmmmmm";
        // for(int i=0; i<=a.length();i++){
        //     char c = a.charAt(i);
        //     if(i%2==0){
        //         c = Character.toUpperCase(c);
        //         System.out.print(c);
        //     }
        //     else{
        //         System.out.print(a.charAt(i));
        //     }
        // }



        // 14ab is a string take 1 4 as a integer and ascii value of a and b , add them up
        String  a = "14ab";
        int sum = 0;
        for(int i=0;i<a.length(); i++){
            if(Character.isDigit(a.charAt(i))){
                int s = a.charAt(i)-48;
                // System.out.println(s);
                sum+=s;
            }
            else{
                int sc = (int)a.charAt(i);
                int sd=0;
                while (sc!=0){
                    if((sc%10)>sd){
                        sd = sc%10;
                    }
                    sc=sc/10;        
                    // System.out.println(sd);
                }
                sum+=sd;
            }
        }System.out.println(sum);  
       
    }
    
}
