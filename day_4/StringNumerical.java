package day_4;

public class StringNumerical {
	public static void main(String[] args) {
		String s = "A1B2C3D4";
        String emp= "";

        for (int i = 0; i<s.length(); i += 2) {
            char letter=s.charAt(i);
            int count = Character.getNumericValue(s.charAt(i + 1));

            for (int j = 0; j < count; j++) {
                emp+= letter;
            }
        }

        System.out.println(emp);
  
		// TODO Auto-generated method stub

	}

}
