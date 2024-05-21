

public class Mul_thread 
{
 public static void main(String args[])
 { Thread t=Thread.currentThread();
 System.out.println(t);
 t.setName("manohar");
 System.out.println(t);
 System.out.println(t.getId()); // id is always unique.
 System.out.println(t.getPriority()); // priority is always frm 1 to 10
 System.out.println(t.NORM_PRIORITY);
  System.out.println(t.MAX_PRIORITY);
   System.out.println(t.MIN_PRIORITY);
 t.setPriority(9); // we can't set anyone's priority manually.
  System.out.println(t.getPriority());
 }
}
