/*
	 * number types - byte,short,int,long
	 * float types - float and double
	 * char - char
	 * boolean - true or false
	 *
	 */
public class TypeCastingDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte i=11;
		byte j=2;
		
		System.out.println("Addition ...:"+(i+j));
		System.out.println("Substraction ...:"+(i-j));
		System.out.println("Multiplication ...:"+(i*j));
		System.out.println("Division ..**QUOTIENT**.:"+(i/j));
		System.out.println("Division..**Reminder**"+(i%j));//% symbol is called MOD
		
		//++ this is equivalent to x=x+1;
		int x=10;
		//x=x+1;
		System.out.println(x++);//here the value is first printed then incremented - post increment
		System.out.println(x);
		
		x=10;
		System.out.println(++x);//here the value is first incremented then printed - pre increment
		System.out.println(x);
		
		x=10;
		System.out.println(x--);//here the value is first printed then decremented - post decrement
		System.out.println(x);
		
		x=10;
		System.out.println(--x);//here the value is first decremented then printed - pre decrement
		System.out.println(x);
		
		//x=x+2; x=x+5;
		
		x=10;
		//x=x+5;
		x+=5;
		System.out.println(x);
		
		x=10;
		//x=x*5;
		x*=5;
		System.out.println(x);
		
		x=10;
		//x=x-5;
		x-=5;
		System.out.println(x);
		
		x=10;
		//x=x/5;
		x/=5;//this will give you the quotient
		System.out.println(x);
		
		x=11;
		//x=x%2;//this prin
		x=x%2;//this will give the reminder
		System.out.println(x);
	}

}
