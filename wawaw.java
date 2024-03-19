public class wawaw {

    public int max(int data[]) {                                // 1
        int highest=data[0];                                    // 1
        for(int i=1;i<data.length;i++) {                        // 2n+2
            if(highest<data[i]) {                               // 1
                highest=data[i];                                // n
            }
            return highest;                                     // 1
        }
    }                                                           /* t(n) = 3n + 6
                                                                   t(n) = 3(2) + 6
                                                                   t(n) = 12
                                                                */

    public int reverse(int num) {                               // 1
        int rev=0;                                              // 1
        for(;num!=0;) {                                         // n + 1
            int lastDigit = num % 10;                           // 3
            rev = rev * 10 + lastDigit;                         // 4
            num/= 10;                                           // 2
        }
        return rev;                                             // 1

    }                                                           /* t(n) = 
                                                                   t(n) = 
                                                                   t(n) = 
                                                                */

    public int reverseS(int num) {                              // 1
        String rev="", val=num+"";                              // 3
        for(int i=val.length()-1;i>=0;i--){                     // 2n+2
            rev+=val.charAt(i);                                 // n
        }
        return Integer.parseInt(rev);                           // 1
    }
}                                                              
