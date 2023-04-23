public class Main {
    public static void main(String[] args) {
        String str = "abbcddeffg";
        char[] ch = str.toCharArray();
        String result = "";
        for (int i = 0; i < ch.length - 1; i++) {
            if (ch[i] != ch[i + 1]) {
                result += ch[i];
            }
        }
        System.out.println(result);
    }
}