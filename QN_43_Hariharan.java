class main
{
	public static void main (String[] abcd)
	{
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if((year%4==0&&year%100!=0)||(year%400==0)){
		    System.out.print("Leap Year");
		}
		else{
		    System.out.print("Not a Leap Year");
		}
	}
}
