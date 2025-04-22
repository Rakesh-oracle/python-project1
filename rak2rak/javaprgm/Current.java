public class Current {
    public static void main(String[] args) {
        System.out.println("Let us find current thread");
        Thread t = Thread.currentThread();
        System.out.println("Current Thread ="+t);
        System.out.println("The name of the Thread is :"+t.getName());
}
}