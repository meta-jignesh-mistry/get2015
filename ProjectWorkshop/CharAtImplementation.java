package CharAt;

public class CharAtImplementation{

	private final char value[];

	public CharAtImplementation() {
		this.value = new char[0];
	}

	public CharAtImplementation(original) {
		this.value = original.value;
	}

	public char charAt(int index) {
		if ((index < 0) || (index >= value.length)) {
			throw new StringIndexOutOfBoundsException(index);
		}
		return value[index];
	}

	public static void main(String[] args) {
		String str = "hello";
		System.out.println(str.charAt(1));
	}

}
