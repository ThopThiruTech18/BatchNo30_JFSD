package in.thiru.intermediatelevel;

public class Example03 {

	public static void main(String[] args) {

		String name = "2hello1"; // aeiou 26-(5,21)
		int vowelCount = 0;
		int consonentCount = 0;
		int digitscount = 0;

		for (int i = 0; i <= name.length() - 1; i++) {

			if (name.charAt(i) >= 'a' && name.charAt(i) <= 'z') {

				if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
						|| name.charAt(i) == 'u') {

					vowelCount++;

				} else {
					consonentCount++;

				}
			} else {
				digitscount++;
			}
		}

		System.out.println("Vowel Count : " + vowelCount);
		System.out.println("Consonents Count : " + consonentCount);
		System.out.println("digits Count : " + digitscount);

	}

}
