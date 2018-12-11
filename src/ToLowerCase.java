public class ToLowerCase {
    public static void main(String[] args) {
        String str = "HelLo";
        int i = str.length()-1;
        while (i>=0){
            if (65<=(int)str.charAt(i) && (int)str.charAt(i)<=90){
                str = str.replace(str.charAt(i),(char)((int)str.charAt(i)+32));
            }
            i--;
        }
        System.out.println(str);
    }
}
