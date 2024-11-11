public class ArrayAverage{
public static void main(String[] args) {
	
int [] values = new int[5];
values[0] = 22;
values[1] = 13;
values[2] = 33;
values[3] = 26;
values[4] = 49;

int sum = 0;

for(int number = 0; number < values.length; number++)sum += values[number];
	int average = sum/values.length;
	System.out.print("The average is " + average);
}
}