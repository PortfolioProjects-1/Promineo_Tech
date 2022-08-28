package arrays;

import java.util.Arrays;

public class ArrayStuff {
public static void main(String[] args) {
	new ArrayStuff().run();
}

private void run() {
	int bob = 5;
//	testArrayLength(bob);
//	testArrayInt();
	testIntArray();
}

private void testIntArray() {
	int[] arr = {8, 7, 14, 9, 8, 42, 26};
//	System.out.println(addFirstAndLast(arr));
	loopThru(arr);
}

private void loopThru(int[] arr) {
	StringBuilder builder = new StringBuilder();
	for(int value : arr) {
		builder.append(value).append(", ");
		//System.out.println(value);
	}
	
}

private int addFirstAndLast(int[] arr) {
	return arr[0] + arr[arr.length - 1];
}

private void testArrayInt() {
	String[] names = {"Paul", "Sarah", "Kaitlin", "Abdulah", "Babbit"};
	String[] newNames = Arrays.copyOf(names, names.length + 1);
	newNames[newNames.length - 1] = "Ralph";
	System.out.println(Arrays.toString(names));
	

}

private void testArrayLength(int length) {
	String[] names = new String[length];
	names[0] = "Paul";
	names[1] = "Sarah";
	names[3] = "Abdulah";
	names[4] = "Babbit";
	
	System.out.println("first=" + names[0] + ", last=" + (names[names.length - 1]));
			
	
	
}


}
