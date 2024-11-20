import java.util.Arrays;
public class Pixel{
public static void main(String[] args){

	int[] values = {15,25,55,75,90,105,125,155,165,300};
		for(int count = 0;count < values.length; count++){
			if (values[count] >= 0 && values[count] <= 20)
				values[count] = 10;

			else if (values[count] >= 21 && values[count] <= 40)
				values[count] = 30;

			else if (values[count] >= 41 && values[count] <= 60)
				values[count] = 50;

			else if (values[count] >= 61 && values[count] <= 80)
				values[count] = 70;
			
			else if (values[count] >= 81 && values[count] <= 100)
				values[count] = 90;
	
			else if (values[count] >= 101 && values[count] <= 120)
				values[count] = 110;

			else if (values[count] >= 121 && values[count] <= 140)
				values[count] = 130;
	
			else if (values[count] >= 141 && values[count] <= 150)
				values[count] = 170;

			else if (values[count] >= 161)
				values[count] = 190;
				
			
}

	System.out.print(Arrays.toString(values));
}
}
	
	