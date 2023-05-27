package j2os;

public class Main {
    public static void main(String[] args) {
        StandardTozihat tozihat = (StandardTozihat) Tozihat.class.getAnnotations() [0];
        System.out.println(tozihat.developerName());
        System.out.println(tozihat.tarikhTolid());
        System.out.println(tozihat.checkShode());
        System.out.println(tozihat.value());
    }
}
