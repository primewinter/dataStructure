package Sorting.BubbleSort;

public class BubbleSort {
	
	// �������� : �� ������ ���Ҹ� �˻��Ͽ� �����ϴ� ���
	void bubbleSort(int[] arr) {
		int temp = 0;
		// 1���� �񱳸� �����Ͽ� n-1��, n-2��, ..., 1���� �񱳸� �ݺ�
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				// ���� ���Ұ� �� ũ�� �ڸ��� �ٲ۴�
				if(arr[j]>arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
