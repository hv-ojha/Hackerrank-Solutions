

//Write your code here
class Calculator
{
    int power(int n, int p) throws Exception{
        if(n < 0 || p < 0)
            throw new Exception("n and p should be non-negative");
        int res=1;
        while(p!=0)
        {
            res*=n;
            p--;
        }
        return res;
    }
}


