
    
    Difference(int[] a)
    {
        this.elements = a;
        this.maximumDifference = -9999999;
    }
	// Add your code here
    void computeDifference()
    {
        int sum=0;
        for(int i=0;i<this.elements.length-1;i++)
        {
            for(int j=i;j<this.elements.length;j++)
            {
                sum=this.elements[i]-this.elements[j];
                if(sum<0)
                    sum=-sum;
                if(sum>this.maximumDifference)
                    this.maximumDifference=sum;
            }
        }
    }

