package q316;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String s="cbacdcbc"; 
        // Output: "acdb"
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicateLetters(s));
    }
}
