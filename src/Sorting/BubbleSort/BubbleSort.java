package Sorting.BubbleSort;

public class BubbleSort {
	
	// 버블정렬 : 두 인접한 원소를 검사하여 정렬하는 방법
	void bubbleSort(int[] arr) {
		int temp = 0;
		// 1부터 비교를 시작하여 n-1개, n-2개, ..., 1개씩 비교를 반복
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				// 앞의 원소가 더 크면 자리를 바꾼다
				if(arr[j]>arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
