

class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName, String lastName, int id, int[] scores)
    {
        super(firstName, lastName, id);
        this.testScores=scores;
    }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    char calculate()
    {
        int sum=0,per=0;
        for(int i=0;i<this.testScores.length;i++)
            sum+=this.testScores[i];
        per=sum/this.testScores.length;
        if(per>=90)
            return 'O';
        else if(per>=80)
            return 'E';
        else if(per>=70)
            return 'A';
        else if(per>=55)
            return 'P';
        else if(per>=40)
            return 'D';
        else
            return 'T';
    }
}

