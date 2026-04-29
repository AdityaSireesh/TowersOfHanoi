
import java.util.*;
public class TOH
{int n;
 TOH(int num)
 {n=num-1;
 }
 void hanoi()
 {if(n%2==1)
  {AoB(n);
   AoC(1);
   BoC(n);
  }
  else if(n%2==0)
  {AeB(n);
   AoC(1);
   BeC(n);
  }
 }
 void AoB(int n)
 {if(n==1)
   System.out.println("A-->B");
  else if(n==3)
  {System.out.println("A-->B");
   System.out.println("A-->C");
   System.out.println("B-->C");
   System.out.println("A-->B");
   System.out.println("C-->A");
   System.out.println("C-->B");
   System.out.println("A-->B");
  }
  else
  {AeC(n-1);
   AoB(1);
   CeB(n-1);
  }
 }
 void AeB(int n)
 {if(n==2)
  {System.out.println("A-->C");
   System.out.println("A-->B");
   System.out.println("C-->B");
  }
  else
  {AoC(n-1);
   AoB(1);
   CoB(n-1);
  }
 }
 void BoC(int n)
 {if(n==1)
   System.out.println("B-->C");
  else if(n==3)
  {System.out.println("B-->C");
   System.out.println("B-->A");
   System.out.println("C-->A");
   System.out.println("B-->C");
   System.out.println("A-->B");
   System.out.println("A-->C");
   System.out.println("B-->C");
  }
  else
  {BeA(n-1);
   BoC(1);
   AeC(n-1);
  }
 }
 void BeC(int n)
 {if(n==2)
  {System.out.println("B-->A");
   System.out.println("B-->C");
   System.out.println("A-->C");
  }
  else
  {BoA(n-1);
   BoC(1);
   AoC(n-1);
  }
 }
 void AoC(int n)
 {if(n==1)
   System.out.println("A-->C");
  else if(n==3)
  {System.out.println("A-->C");
   System.out.println("A-->B");
   System.out.println("C-->B");
   System.out.println("A-->C");
   System.out.println("B-->A");
   System.out.println("B-->C");
   System.out.println("A-->C");
  }
  else
  {AeB(n-1);
   AoC(1);
   BeC(n-1);
  }
 }
 void AeC(int n)
 {if(n==2)
  {System.out.println("A-->B");
   System.out.println("A-->C");
   System.out.println("B-->C");
  }
  else
  {AoB(n-1);
   AoC(1);
   BoC(n-1);
  }
 }
 void CoB(int n)
 {if(n==1)
   System.out.println("C-->B");
  else if(n==3)
  {System.out.println("C-->B");
   System.out.println("C-->A");
   System.out.println("B-->A");
   System.out.println("C-->B");
   System.out.println("A-->C");
   System.out.println("A-->B");
   System.out.println("C-->B");
  }
  else
  {CeA(n-1);
   CoB(1);
   AeB(n-1);
  }
 }
 void CeB(int n)
 {if(n==2)
  {System.out.println("C-->A");
   System.out.println("C-->B");
   System.out.println("A-->B");
  }
  else
  {CoA(n-1);
   CoB(1);
   AoB(n-1);
  }
 }
 void BoA(int n)
 {if(n==1)
   System.out.println("B-->A");
  else if(n==3)
  {System.out.println("B-->A");
   System.out.println("B-->C");
   System.out.println("A-->C");
   System.out.println("B-->A");
   System.out.println("C-->B");
   System.out.println("C-->A");
   System.out.println("B-->A");
  }
  else
  {BeC(n-1);
   BoA(1);
   CeA(n-1);
  }
 }
 void BeA(int n)
 {if(n==2)
  {System.out.println("B-->C");
   System.out.println("B-->A");
   System.out.println("C-->A");
  }
  else
  {BoC(n-1);
   BoA(1);
   CoA(n-1);
  }
 }
 void CoA(int n)
 {if(n==1)
   System.out.println("C-->A");
  else if(n==3)
  {System.out.println("C-->A");
   System.out.println("C-->B");
   System.out.println("A-->B");
   System.out.println("C-->A");
   System.out.println("B-->C");
   System.out.println("B-->A");
   System.out.println("C-->A");
  }
  else
  {CeB(n-1);
   CoA(1);
   BeA(n-1);
  }
 }
 void CeA(int n)
 {if(n==2)
  {System.out.println("C-->B");
   System.out.println("C-->A");
   System.out.println("B-->A");
  }
  else
  {CoB(n-1);
   CoA(1);
   BoA(n-1);
  }
 }
 public static void main(String args[])
 {Scanner sc=new Scanner(System.in);
  System.out.println("Input the number of rings");
  int num=sc.nextInt();
  if(num==0)
   System.exit(0);
  else if(num==1)
   System.out.println("A-->C");
  TOH toh=new TOH(num);
  toh.hanoi();
 }
}

