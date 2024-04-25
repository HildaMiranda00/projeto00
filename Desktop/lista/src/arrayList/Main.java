package arrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList array = new ArrayList();
		array.add(10);
		array.add(35, 5);
		array.remove(0);
		array.add("Little miss sunshine");
		System.out.println("Array Size: " + array.getSize());
		System.out.println("Array Length: " + array.length());
		array.add("oi");
		array.add(":)");
		for (int i = 0; i < 50; i++) {
			array.add(Math.random());
		}
		System.out.println("Array Length: " + array.length());
		System.out.println("Elementos no array:");
		for (int i = 0; i < array.length(); i++) {
			if(array.get(i) != null) {
			System.out.println(array.get(i));
			}
		}
		System.out.println("Array Size: " + array.getSize());
		System.out.println("Array Length: " + array.length());
	}
}
