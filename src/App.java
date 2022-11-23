public class App extends java.lang.Thread {
    public static void main(String[] args) throws Exception {
        Thread1 t1 = new Thread1();
        t1.start();
        Thread2 t2 = new Thread2();
        t2.start();
    }
    
    
    

}
