
import java.util.*;
class Test{
	public static void main(String argc[]){
	Scanner s=new Scanner(System.in);
	int n = s.nextInt();
	if(judgeSquareSum(n))
		System.out.println("Yes");
	else
		System.out.println("No");
}
public static boolean judgeSquareSum(int n){
	for (int i = 1; i * i <= n; i++){
		int count = 0;
		if (n % i == 0){
			while (n % i == 0){
				count++;
				n /= i;
			}
		if (i % 4 == 3 && count % 2 != 0)
			return false;
		}
	}
	return n % 4 != 3;
}
}
