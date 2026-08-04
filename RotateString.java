class Solution{
    public static Boolean rotate(String s, String g){
        String s1,s2;
        int len = s.length();
        if(s.length()!=g.length())
            return false;
        for(int i=0;i<len;i++){
            if(s.equals(g))
                return true;
            else{
                s1 = s.substring(1,len);
                 System.out.println(s1);
                s2 = s.substring(0,1);
                 System.out.println(s2);
                s = s1.concat(s2);
            }
            System.out.println(s);
            
        }
        return false;

    }
}
public class RotateString {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String s= "dawhwh";
        String goal = "hdawhw";
        System.out.println(obj.rotate(s,goal));
    }
}
