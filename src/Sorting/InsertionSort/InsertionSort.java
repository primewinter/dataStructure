package Sorting.InsertionSort;

public class InsertionSort {
	
	/* [삽입 정렬]
	 * 기준 인덱스의 값을 이전 인덱스의 값들과 비교하여 기준값이 더 작으면 이전값을 뒤로 한 칸씩 옮기고 그 자리에 기준값을 삽입한다.
	 * 앞으로 한 칸 전진한 기준값을 다시 그 이전값들과 비교하여 기준값이 작으면 자리를 바꾸는 것을 반복한다.
	 * [시간복잡도] 최선의 경우 : O(n) / 최악의 경우 : O(n^2)
	 */
	
	static void insertionSort(int[] arr) {
		int temp = 0;
        int j = 0;
        int count = 1; // 출력을 위한 변수
        
        for(int i = 1; i < arr.length; i++){
            temp = arr[i]; // 기준값
            for(j=i-1; j>=0 && temp<arr[j]; j--){
            	// 기준값이 작다면 이전값보다 작다면 이전값의 위치를 한 칸 뒤로 밀어낸다.
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
