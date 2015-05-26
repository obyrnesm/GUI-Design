package abstractions;

public class IntSet {
private int elems[]; 
private int index; 
private static int initialSize=2;

public IntSet() {
	elems=new int[initialSize];
	index=0;
}

/**
 * @return set elements as array
 */
public int[] elements() {
	int a[] = new int[index];
	System.arraycopy(elems,0, a, 0, index);
	return a;
}

/**
 * @return the number of integers in set
 */
public int size() {
	return index;
}
/**
 * @param x the integer to be checked
 * @return true if x is in this set
 */
public boolean contains(int x) {
	return getIndex(x)>-1;
}
/**
 * @param x the integer to be inserted
 * EFFECTS: if x is in the set, nothing happens;
 *          otherwise, x is added into this set.
 */
public void insert(int x) {
	int xIndex = getIndex(x);
	if (xIndex<0) {
           growSize();  elems[index++]=x;
	}
}
private int getIndex(int x) {
	for (int i=0; i<index; ++i) {
		if (elems[i]==x) { return i;
		}
	}
	return -1;
}
private void growSize() {
	if (index==elems.length) {
	int tmp[]=new int[elems.length*2];
	System.arraycopy(elems,0,tmp,0,elems.length);	elems = tmp;
	}
}

/**
 * @param x the integer to be removed
 * EFFECTS: removes x from this set if it is in it.
 */
public void remove(int x) {
	int xIndex = getIndex(x);
	if (xIndex<0) {	return;
	}
	for (int i=xIndex; i<index-1;++i) {
		elems[i]=elems[i+1];
	}
	--index;
}

// return a string representation suitable for printing.
public String toString() {
	String tmp="{";
	for (int i=0; i<index-1;++i) {
		tmp += elems[i]+",";
	}
	if (index>0) {
		tmp += elems[index-1];
	}
	tmp+="}"; return tmp;
}
}
