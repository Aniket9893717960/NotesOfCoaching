class NewThread implements Runnable
{
String name;
Thread t;
NewThread(String threadName){
name = threadName;
t = new Thread(this,name);
System.out.println("New thread:"+t);
t.start();
}
public void run()
{
try
{
for(int i=1;i<=5;i++)
{
System.out.println(name +": "+i);
Thread.sleep(20);
}
}
catch(InterruptedException e){
System.out.println(name +"Interrupted.");
}
System.out.println(name+"exiting");
}
}
class DemoJoin
{
public static void main(String args[]){
NewThread ob1 = new NewThread("one");
NewThread ob2 = new NewThread("two");
NewThread ob3 = new NewThread("three");
System.out.println("Thread one is alive: "+ob1.t.isAlive());
System.out.println("Thread two is alive: "+ob2.t.isAlive());
System.out.println("Thread three is alive: "+ob3.t.isAlive());

try
{
System.out.println("Waiting for thread to finish.");
ob1.t.join();
ob2.t.join();
ob3.t.join();
}

catch(InterruptedException e)
{
System.out.println("Main thread Interrupted");
}
System.out.println("Thread one is alive: "+ob1.t.isAlive());
System.out.println("Thread two is alive: "+ob2.t.isAlive());
System.out.println("Thread three is alive: "+ob3.t.isAlive());
System.out.println("Main thread exiting.");
}
}