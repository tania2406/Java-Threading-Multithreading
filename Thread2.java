class pk extends Thread
{ void call()
  {start();
  } 
public void run()
{ try 
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
public class Thread2 {
    public static void main(String args[])
    { pk p=new pk();
    p.call();
    }
}
