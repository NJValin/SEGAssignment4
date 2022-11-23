public class Thread2 extends java.lang.Thread {
    @Override
public void run() {
    for (int i =50; i>0;i--) {
        System.out.println(i);
    }
}
}