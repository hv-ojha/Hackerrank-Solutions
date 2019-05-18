
class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int sum=0;
        for(int i=n;i>0;i--)
        {
            if(n%i==0)
                sum+=i;
        }
        return sum;
    }
}

