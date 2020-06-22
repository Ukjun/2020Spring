package com.kita.first.mission;

public class GreatMission3 {
	public static void main(String[] args) {
		int[][]arr = {
					{90,100,88,77},
					{34,99,45,88,54},
					{98,65,87,42},
					{67,32,56,49}
					}; //int[][] = new int[3][3]; 영어 수학 국어점수
		String[] str = {"영어","수학","국어","사회"};
		//int []allsum = new int[arr.length];
		//double []allavg = new double[arr.length];
		int max_sum=0;
		double max_avg=0;
		for(int i=0; i<arr.length;i++) {
			int sum=0;
			double avg =0;
			for(int j=0; j<arr[i].length; j++) {
				sum += arr[i][j];
			}
			avg = (double)sum/arr[i].length;
			System.out.printf("%s합계: %d 평균: %.1f\n",str[i],sum,avg);
			max_sum+=sum;
			max_avg+=avg;
			//allsum[i] = sum;
			//allavg[i] = avg;
		}
		/*for(int i=0; i<arr.length; i++) {
			max_sum+=allsum[i];
			max_avg+=allavg[i];
		}*/
		max_avg = max_avg/arr.length;
		System.out.printf("전체합계 : %d 평균 : %.1f",max_sum,max_avg);
	}
}
