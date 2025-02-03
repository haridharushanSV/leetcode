// class Solution {
//     public int getLucky(String s, int k) {
//         int [] a=new int[s.length()];
//         String str="";
//         for(int i=0;i<s.length();i++){
//         a[i] = s.charAt(i) - 'a'+1;
//         str=str+a[i];
//         }
//            System.out.println(str);
//     int j=0,sum1=0;  
//  for(int o=0;o<k;o++){
    
//      for(j=0;j<str.length();j++){
//   int dig = Integer.parseInt(String.valueOf(str.charAt(j)));
//   sum1 =sum1+dig;
//        System.out.println(sum1); 
//      }}
//     }
//     return sum1;
//     }
// }
class Solution {
    public int getLucky(String s, int k) {
        int[] a = new int[s.length()];
        String str = "";
        
        // Convert each character to its corresponding number
        for (int i = 0; i < s.length(); i++) {
            a[i] = s.charAt(i) - 'a' + 1;
            str += a[i]; // Append number as string
        }
        System.out.println(str);
      
        int sum1 = 0;
        
        // Perform transformation k times
        for (int o = 0; o < k; o++) {
            sum1 = 0; // Reset sum1 for each iteration
            for (int j = 0; j < str.length(); j++) {
                int dig = str.charAt(j) - '0'; // Convert character to digit
                sum1 += dig;
            }
            str = Integer.toString(sum1); // Update str with new sum as a string
        }
        
        return sum1; // Return final transformed number
    }
}
