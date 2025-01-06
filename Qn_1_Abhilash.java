class Fact_rec{
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }
    public static void main(String args[]){
        int num=4;
        int fact=factorial(num);
            System.out.println("factorial of "+num+" is "+fact);
    }
}
