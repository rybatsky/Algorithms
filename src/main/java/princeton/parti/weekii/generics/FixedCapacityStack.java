package princeton.parti.weekii.generics;


public class FixedCapacityStack<Item>
{
    private Item[] stack;
    private int N = 0;


    public FixedCapacityStack(int capacity)
    {
        this.stack = (Item[]) new Object[capacity];
    }


    public boolean isEmpty()
    {
        return N == 0;
    }


    public void push(Item item)
    {
        stack[N++] = item;
    }


    public Item pop()
    {
        final Item item = stack[--N];
        stack[N] = null;
        return item;
    }
}
