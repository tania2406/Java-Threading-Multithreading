// extending Thread class 
// implementing Runnable interface

class jk extends Thread
{ /*jk()
{ start();
}*/
public void run()
{ 
    try
   { for(int x=1;x<=5;x++)
      {  System.out.println(x);
        Thread.sleep(2000);
        
     }
       }
    catch(Exception ee)
    { 
        
    }
    }
        }
public class Thread1 {
    public static void main(String args[])
    { jk j=new jk();
     j.start();// start is ghost function.
    }
}
