public class Substring {
    public static void main(String[] args) {
        System.out.println(firstPartOfString("long"));
        System.out.println(firstPartOfString("hi"));
    }
    
    public static String firstPartOfString(String string) {
        if (string.length() > 3) {
            return string.substring(0,3);
        } else {
            return string;
        }
    }
}
