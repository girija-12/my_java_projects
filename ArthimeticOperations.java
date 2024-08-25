package java_lab;

public class ArthimeticOperations {
	
	public void add(int a, int b)

	{
		int sum=a+b;
		System.out.println("SUM:"+sum);
		}
	public void sub(int a,int b)
	{
		int sub=a-b;
	System.out.println("DIFFERENCE:"+sub);
	}
	public void mul(int a, int b)
	{
		int pro=a*b;
		System.out.println("PRODUCT:"+pro);
	}
	public void div(int a, int b)
	{
		int div=a/b;
		System.out.println("DIVISION:"+div);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a=10, b=2;
	ArthimeticOperations op=new ArthimeticOperations();
		System.out.println("VARIOUS OPERATIONS ON "+a+" AND "+b);
		op.add(a,b);
		op.sub(a,b);
		op.mul(a,b);
		op.div(a,b);

	}

}
