package zuoye;

public class No_1 {

	public static void main(String[] args) {
	int i,j,k;
	char n=49;
	for(i=1;i<=9;i++)
	{
		for(j=1;j<=9-i;j++) System.out.print(" ");
		for(k=1;k<=i*2-1;k++) System.out.print(n);
		System.out.println();
		n++;
	}
	n=72;
	for(i=1;i<=8;i++)
	{
		for(j=1;j<=i;j++) System.out.print(" ");
		for(k=1;k<=(8-i)*2+1;k++) System.out.print(n);
		System.out.println();
		n--;
	}
	
	}

}
