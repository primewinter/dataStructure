package Sorting.InsertionSort;

public class InsertionSort {
	
	/* [���� ����]
	 * ���� �ε����� ���� ���� �ε����� ����� ���Ͽ� ���ذ��� �� ������ �������� �ڷ� �� ĭ�� �ű�� �� �ڸ��� ���ذ��� �����Ѵ�.
	 * ������ �� ĭ ������ ���ذ��� �ٽ� �� ��������� ���Ͽ� ���ذ��� ������ �ڸ��� �ٲٴ� ���� �ݺ��Ѵ�.
	 * [�ð����⵵] �ּ��� ��� : O(n) / �־��� ��� : O(n^2)
	 */
	
	static void insertionSort(int[] arr) {
		int temp = 0;
        int j = 0;
        int count = 1; // ����� ���� ����
        
        for(int i = 1; i < arr.length; i++){
            temp = arr[i]; // ���ذ�
            for(j=i-1; j>=0 && temp<arr[j]; j--){
            	// ���ذ��� �۴ٸ� ���������� �۴ٸ� �������� ��ġ�� �� ĭ �ڷ� �о��.
                arr[j+1] = arr[j];
                print(arr, count);
                count++;
            }
            arr[j+1] = temp;
            print(arr, count);
            count++;
        }
	}
	
	static void print(int[] arr, int count) {
		System.out.print(count+" : [");
		for(int n:arr) {
			System.out.print(n+" ");
		}
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		int[] arr = {3,4,1,9,7,5};
		insertionSort(arr);
	}

}
