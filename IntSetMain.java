package main;

import abstractions.IntSet;

public class Main {
       private static int a[]={1,2,3,3,2,3};

       public static void main(String[] args) {
               /* Part 1 */
		IntSet set=new IntSet();
		for (int i=0; i<a.length;++i)
		{
				set.insert(a[i]);
				System.out.println(set);

		}
		System.out.println("In the end, set contains "+set.size()+" elements.");

               /* Part 2 */
		System.out.println("In the array a, the following integers are duplicated:");
		IntSet dupSet=new IntSet();
		
		IntSet printSet=new IntSet();
		
		for (int i=0; i<a.length;++i)
		{
			if (dupSet.contains(a[i]) && !printSet.contains(a[i])){
				
			   System.out.print(a[i]+" ");
			   printSet.insert(a[i]);
            }
			dupSet.insert(a[i]);

		}
	        System.out.println();
	}
}

/*
 main
 import IntSet
 Part 1 & Part 2
 static & array
 System.out.print and println
 */
