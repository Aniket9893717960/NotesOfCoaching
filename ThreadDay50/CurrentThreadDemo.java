public class CurrentThreadDemo {
    public static void main(String[] args) {
        //MAin method is also a Thread 
        Thread t = Thread.currentThread();
        System.out.println("Current Thread: "+t);
        t.setName("My Thread");
        System.out.println("After name change: "+t);
        try {
            {
                for(int i=1;i<=5;i++){
                    System.out.println(i);
                    t.sleep(2000);
                }
            }
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println("Main Thread interrupted");
        }
        System.out.println("BYE");
    }a
}
