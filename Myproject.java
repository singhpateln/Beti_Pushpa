import java.util.*;
class Myproject
{
	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a no.");
		int r = s.nextInt();
		
		double a;
		a=3.14*r*r;
		System.out.println("Area of Circle is "+a);
	}
}
class swap  // Three Number
{    
    public static void main(String[] args)
	{
     Scanner s = new Scanner(System.in);
     System.out.println("Enter Value a");
     int a = s.nextInt();
	 System.out.println("Enter Value b");
	 int b = s.nextInt();
	 System.out.println("Enter Value c");
	 int c = s.nextInt();
	 int d;
	 
	 d = a;
	 a = c;
	 c = b;
	 b = d;
	 System.out.println("a is "+a+" b is "+b+" and c is "+c );
	}
	 
}
class greater    // Three Number
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Value a");
        int a = s.nextInt();
	    System.out.println("Enter Value b");
	    int b = s.nextInt();
		System.out.println("Enter Value c");
	    int c = s.nextInt();
		
		if(a>b && a>c)
		{
			
			System.out.println(a+" is greater than "+b+" and "+c);
			
			
		}
		else if(b>a && b>c)
		{
			
				System.out.println(b+" is greater than "+a+" and "+c);
			
		}
		else if(c>a && c>b)
		{
			
				System.out.println(c+" is greater than "+a+" and "+b);
			
		}
		else
		{
		    System.out.println("All the Value of a "+a+" , b "+ b+" and c "+c+ " is equal");	
		}
	}
}
class ascending
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Value a");
        int a = s.nextInt();
	    System.out.println("Enter Value b");
	    int b = s.nextInt();
		System.out.println("Enter Value c");
	    int c = s.nextInt();
		
		if(a>b && a>c)
		{  
			if(b>c)
			{
				System.out.println(c+"<"+b+">"+a);
			}
			else
			{
				System.out.println(b+">"+c+">"+a);	
			}
		}
		else if(b>a && b>c )
			
		{
			if(a>c)
			{
				System.out.println(c+"<"+a+"<"+b);
			}
			else
			{
				System.out.println(a+"<"+c+"<"+b);	
			}
		}
		else if(c>a && c>b)
		{
			if(a>b)
			{
				System.out.println(b+"<"+a+"<"+c);
			}
			else
			{
				System.out.println(a+"<"+b+"<"+c);	
			}
		}
	}
}
class digit  // Digit Three Places
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Three Digit Number");
        int a = s.nextInt();
        
		int b = a/100;
		int c = a%100;
		int d = c/10;
		int e = c%10;
		
		System.out.println(a+" is\n Hundrad place is "+b+"\n Tens place is "+d+"\n Once places is "+e);

	}
}
class percentage // Two Number percentage
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
        System.out.println("Enter Value a");
        int a = s.nextInt();
	    System.out.println("Enter Value b");		
		
	    int b = s.nextInt();
		
		float c = b-a;
		c = c/b;
		c = c*100;
		System.out.println(a+" is "+c+"% of "+b);
	}
}
class calculator // calculator
{
    public static void main(String[] args)
	{   
	    System.out.println("Welcome to calculator");
		
		System.out.println("Press One to Addition");
	    System.out.println("Press Two to Subtraction");
		System.out.println("Press Three to Multiplication");
		System.out.println("Press four to Division");
	    Scanner s = new Scanner(System.in);		
	    int n = s.nextInt();

        switch(n)
        {
			case 1:
			      System.out.println(" Two Number For Adding\n ");
				  Scanner sc = new Scanner(System.in);
				  int s1 = sc.nextInt();
				 // int[] a = new int[s1];
				  
				  while(s1 != 0;)
				  {
					  
					 s1= s1+s1;
					 
					System.out.println("Addition is "+a2);  
				  }
				  
				  /*int b = sc.nextInt();
				  
				  int c = a+b;
				  System.out.println("Addition is "+c);
				  */break;
				  
			case 2:
			      System.out.println("Enter Two Number For Subtracting\n First A");
				  Scanner sc1 = new Scanner(System.in);
				  int x = sc1.nextInt();
				  System.out.println("Enter Second Value");
				  int y = sc1.nextInt();
				  
				  int z = x-y;
				  z = -(z);
				  System.out.println("Subtraction is "+z);
				  break;
		    case 3:
			      System.out.println("Enter Two Number For Multiplication\n First A");
				  Scanner sc2 = new Scanner(System.in);
				  int p = sc2.nextInt();
				  System.out.println("Enter Second Value");
				  int q = sc2.nextInt();
				  
				  int r = p*q;
				  
				  System.out.println("Multiplication is "+r);
				  break;
           case 4:
			      System.out.println("Enter Two Number For Division\n First A");
				  Scanner sc3= new Scanner(System.in);
				  float m = sc3.nextInt();
				  System.out.println("Enter Second Value");
				  float n1 = sc3.nextInt();
				  
				  float o = m/n1;
				  
				  System.out.println("Division is "+o);
				  break;				  
		   default :
                  System.out.println("Out of Range Number ");		   
			
		}		
	}	
}