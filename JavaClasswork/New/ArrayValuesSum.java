public class ArrayValuesSum{
public static void main(String[] args){
 
int [] values = {2,4,6,5};
int sum = 0;
for(int number = 0; number < values.length; number++)sum += values[number];
System.out.print(sum);

}
}