package princeton.parti.weeki.unionfind;


import java.io.BufferedInputStream;
import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        final Scanner scanner = new Scanner(new BufferedInputStream(System.in));

        final int N = scanner.nextInt();

        final QuickFindUF uf = new QuickFindUF(N);

        while (scanner.hasNext())
        {
            final int p = scanner.nextInt();

            final int q = scanner.nextInt();

            if(!uf.connected(p,q))
            {
                uf.union(p, q);

                System.out.println(p + " " + q);
            }
        }
    }
}
