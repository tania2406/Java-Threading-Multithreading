// multiple threading with runnable 
class aq implements Runnable
{ String msg;
 aq(String m)
 { msg = m;
 
 }
 public void run()
 { try
 { for(int x=1;x<=5;x++)
 { System.out.println(msg);
 Thread.sleep(1000);
         }
     }
 catch(Exception ee)
 {
     
 }
     }
}
public class Mul_thread2 {
    public static void main(String args[])throws Exception
    { aq a=new aq("ramesh");
    aq b=new aq("john");
    aq c=new aq("harish");
    Thread t=new Thread(a);
    Thread t1=new Thread(b);
    Thread t2=new Thread(c);
    t.start();
    t.join();
    t1.start();
    t1.join();
    t2.start();
    }
}
