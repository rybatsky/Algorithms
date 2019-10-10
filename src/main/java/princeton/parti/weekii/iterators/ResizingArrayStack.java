package princeton.parti.weekii.iterators;


import java.util.Iterator;


public class ResizingArrayStack<Item> implements Iterable<Item>
{
    private Item[] stack;

    private int N = 0;


    public ResizingArrayStack()
    {
        this.stack = (Item[]) new Object[1];
    }


    public Iterator<Item> iterator()
    {
        return new ReverseArrayIterator();
    }


    public boolean isEmpty()
    {
        return N == 0;
    }


    public void push(Item item)
    {
        if (N == stack.length)
        {
            resize(2 * stack.length);
        }
        stack[N++] = item;
    }


    public Item pop()
    {
        final Item item = stack[--N];
        stack[N] = null;
        if (N > 0 && N == stack.length / 4)
        {
            resize(stack.length / 2);
        }
        return item;
    }


    private void resize(int capacity)
    {
        Item[] copy = (Item[]) new String[capacity];
        for (int i = 0; i <= N; i++)
        {
            copy[i] = stack[i];
        }
        stack = copy;
    }


    private class ReverseArrayIterator implements Iterator<Item>
    {
        private int i = N;


        public boolean hasNext()
        {
            return i > 0;
        }


        public Item next()
        {
            return stack[--i];
        }


        public void remove()
        {
            throw new UnsupportedOperationException("Remove is not supported");
        }
    }
}
