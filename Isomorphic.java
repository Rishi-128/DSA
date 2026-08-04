import java.util.HashSet;
public class Isomorphic {
    public static void main(String[] args) {
        String s1 = "paper";
        String s2 = "tatle";
        HashSet<Character> c1 = new HashSet<>();
         HashSet<Character> c2 = new HashSet<>();
        for(char ch : s1.toCharArray()){
            c1.add(ch);
        }
          for(char ch : s2.toCharArray()){
            c2.add(ch);
        }
        System.out.println(c1);
        System.out.println(c1.size());
        System.out.println(c1.size()==c2.size());
    }
}
