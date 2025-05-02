package p1;

public class AdvancedPrimitiveTypes {
	public static void main(String[] args) {
	double d=100.04;
	long l=(long)d;
	int i=(int)l;
	System.out.println("double value:"+d);
	System.out.println("long value after casting:"+l);//print
	System.out.println("float value after casting:"+i);
	byte b=42;
	char c='a';
	short s=1024;;
	int result=b+c+s;
	System.out.println("result of automatic typepromotion:"+result);//gfdhtr
	}

}
