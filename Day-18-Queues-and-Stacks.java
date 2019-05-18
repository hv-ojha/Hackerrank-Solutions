

//import sun.misc.Queue;

public class Solution {
    // Write your code here.
    Stack<Character> s=new Stack<>();
    Queue<Character> q=new LinkedList<>();
    void pushCharacter(char c)
    {
        s.push(c);
    }
    void enqueueCharacter(char c)
    {
        q.add(c);
    }
    char popCharacter()
    {
        return s.pop();
    }
    char dequeueCharacter()
    {
        return q.remove();
    }

