import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;
import edu.princeton.cs.algs4.Queue;

public class Queue1
{
	public static void main(String[] args)
	{
	In in = new In();
    Queue<Integer> q = new Queue<Integer>();
    while (!in.isEmpty())
        q.enqueue(in.readInt());

    int N = q.size();
    int[] a = new int[N];
    for (int i = 0; i<N; i++)
        a[i] = q.dequeue();
    for (int i=0; i<a.length; i++)
        System.out.println(a[i]);
	}

}