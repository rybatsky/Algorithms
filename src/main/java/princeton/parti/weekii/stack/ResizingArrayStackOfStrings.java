package princeton.parti.weekii.stack;


public class ResizingArrayStackOfStrings
{
    private String[] stack;

    private int N = 0;


    public ResizingArrayStackOfStrings()
    {
        this.stack = new String[1];
    }


    public boolean isEmpty()
    {
        return N == 0;
    }


    public void push(String item)
    {
        if (N == stack.length)
        {
            resize(2 * stack.length);
        }
        stack[N++] = item;
    }


    public String pop()
    {
        final String item = stack[--N];
        stack[N] = null;
        if (N > 0 && N == stack.length / 4)
        {
            resize(stack.length / 2);
        }
        return item;
    }


    private void resize(int capacity)
    {
        String[] copy = new String[capacity];
        for (int i = 0; i <= N; i++)
        {
            copy[i] = stack[i];
        }
        stack = copy;
    }
}
