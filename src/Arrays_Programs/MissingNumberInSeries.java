package Arrays_Programs;

public class MissingNumberInSeries {

	public static void main(String[] args) {
		
		int[] series= {1,2,3,4,5,6,7,8};
		int[] missingNumberSeries= {1,2,3,5,6,7,8};
		
		int seriesSum=0;
		int missingNumberSeriesSum=0;
		for(int i=0;i<series.length;i++)
		{
			seriesSum=seriesSum+series[i];
		}
		System.out.println("Series Sum is : "+seriesSum);
		
		for(int i=0;i<missingNumberSeries.length;i++)
		{
			missingNumberSeriesSum=missingNumberSeriesSum+missingNumberSeries[i];
		}
		System.out.println("Missing Number Sum is : "+missingNumberSeriesSum);
		
		int missingNumber=seriesSum-missingNumberSeriesSum;
		
		System.out.println("Missing Number is : "+missingNumber);

	}

}
