public class StringBui {
    public static void main(String[]args) {
        StringBuilder sb = new StringBuilder("hello");

        for (int i = 0; i<sb.length()/2; i++){

            int front = i;
            int back = sb.length()-1;

            int frontChar = sb.charAt(front);
            int backChar = sb.charAt(back);

            sb.setCharAt(front,(char) backChar);
            sb.setCharAt(back, (char) frontChar);
        }

        System.out.println(sb);
        
    }
}
