
import java.util.Scanner;
	public class Dop {
	Scanner scanner = new Scanner(System.in);
		public int getInt(){
			System.out.println("Enter choice");
			int num;
			if(scanner.hasNextInt()){
				num = scanner.nextInt();
			} else {
				System.out.println("Error");
				scanner.next();//рекурсия
				num = getInt();
        }
			return num;
		}
	}