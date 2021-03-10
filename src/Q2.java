
public class Q2 {

	public static void main(String[] args) {

		int i, index=0;
		
		String s1="welcome to city bangkok, have a nice trip";
		String arr1[]= s1.split(" ");
		
		for(i=0; i<arr1.length; i++)
			{
			if(arr1[i].equals("city"))
				index=i;
			}
		String s2= arr1[index+1];
		String arr2[]= s2.split(",");
		System.out.print(arr2[0]);
	}

}
