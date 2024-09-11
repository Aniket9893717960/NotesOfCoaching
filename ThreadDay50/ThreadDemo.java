class NewThread implements Runnable
{
Thread t;
NewThread()
{
t= new Thread(this, "My Thread");
System.out.println("My Thread: "+t);
t.start();
}
public void run(){
try 
{
for(int i=1;i<=5;i++)
{
System.out.println("My Thread:"+i);
t.sleep(1000);
}
}
catch(InterruptedException e)
{
System.out.println("My Thread interrupted.");
}
System.out.println("Exiting My THread.");
}
}
class ThreadDemo
{
public static void main(String args[]){
NewThread ob1 = new NewThread();
try
{
for(int i=1;i<=5;i++){
System.out.println("Main Thread: "+i);
Thread.sleep(1000);
}
}
catch(InterruptedException e){
System.out.println("Main Thread interrupted.");
}
}
}
