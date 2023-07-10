package java_concepts_revision;

public class java {

	public static void main(String[] args) {
		//String builder concept//
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("hello ");
		sb1.append(" how ");
		sb1.append(" is your ");
		sb1.append("day going");
		
		String introduction = sb1.toString();
		System.out.println(introduction);
		
		// now we can simplify this concept and its syntax//
		
		String zoo = "animals";
		StringBuilder sb2 = new StringBuilder("The ");
		sb2.append(zoo).append(" destroyed ").append(" the zoo bars ");
		System.out.println(sb2);
		
		// java has only one operator called ternary operator //
		// if first is false second is put and inverse is for true//
		/* Ternary operator has syntax
		 * system out(false ? "yes":"no");
		 * no will be print in case of false*/
		
		System.out.println(true ? "yes":"no");
		int value = 40;
		value = value <60?	60 : value;
		System.out.println(value);
		
		// now we find max and mini values in an array //
		 int [] values = { 7 ,78, 56, 23, 667, 12};
		 int max = Integer.MIN_VALUE;
		 for(int valuesnew:values) {
			max = valuesnew>max ? valuesnew:max;
			 
				 
		 }
		System.out.println(max);
		
		// now we find minimum value in anarray//
		
		 int [] values1 = {7 ,78, 56, 23, 667};
		 int min = Integer.MAX_VALUE;
		 for(int valuesnew:values1) {
			min = valuesnew<min ? valuesnew: min;
			
			 }
		 System.out.println(min);
				 
		 }
		
		
		 	
	}


