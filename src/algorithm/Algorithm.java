package algorithm;

public abstract class Algorithm{

	final public static int ASC = 1;
	final public static int DESC = -1;
	
    static public void sort( Object arr[], int Order)
    {
    	Object temp;
    	for(int i = arr.length - 1; i > 0; i--)
    	{
    		for(int j = 0; j < i; j++)
    		{
    			MyComparable comp = (MyComparable)arr[j];
    			if ( Order * comp.compareTo(arr[j + 1]) > 0  )
    			{
    				temp = arr[j];
    				arr[j] = arr[j + 1];
    				arr[j + 1] = temp;
    			}
    		}
    	}
    }


    static public void sort( int arr[] ) 
    {
    	int temp;
    	boolean unsorted;
    	for(int i = arr.length - 1; i > 0; i--)
    	{
    		unsorted = false;
    		for(int j = 0; j < i; j++)
    		{
       			if (arr[j] > arr[j + 1])
    			{
    				temp = arr[j];
    				arr[j] = arr[j + 1];
    				arr[j + 1] = temp;
    				unsorted = true;
    			}
    		}
    		if ( !unsorted ) return;
    	}
    }
    
    private static int partition (int p, int r, int A[])
    {
    	int x = A[p];
    	int k = p;
    	int l = r+1;
    	int t;
    	do k++; while ((A[k] <= x) && (k < r));
    	do l--; while (A[l] > x);
    	while (k < l) {
    		t = A[k]; A[k] = A[l]; A[l] = t;
    		do k++; while (A[k] <= x);
    		do l--; while (A[l] > x);
    	}
    	t = A[p]; A[p] = A[l]; A[l] = t;
    	return l;
    }

    public static void qsort(int p, int r, int A[])
    {
    	if (p < r) {
    		int q = partition(p, r, A);
    		qsort (p, q-1, A);
    		qsort(q+1, r, A);
    	}
    }
    
    public static int BinarySearch (int []A, int lo, int hi, int key)
    {
    	int mid;
    	int position = -1; 
    	while (lo <= hi) {
    		mid = (lo + hi) / 2;
    		if (A[mid] > key)
    			hi = mid - 1;
    		else if (A[mid] < key)
    			lo = mid + 1;
    		else {
    			position = mid; 
    			break;
    		}
    	}
    	return position;
    }
}
