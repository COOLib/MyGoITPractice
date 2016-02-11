public class Main {

    public static void main(String[] args) {

        Main main = new Main();

        String a = "asdffdsta";
        Character c = main.find(a);
        System.out.println(c);

    }


    public Character find(String s) {

        if (s.length() == 1) {
            return s.charAt(0);
        }

        char[] charArray = s.toCharArray();
        char[] tempArr = new char[charArray.length];
        int newLength = 0;
        int k = 0;

        outer:
        for (int i = 0; i < charArray.length - 1; i++) {

            for (int j = 0; j < charArray.length; j++) {

                if (charArray[i] == charArray[j] && i != j) {
                    continue outer;
                }
            }
            tempArr[k] = charArray[i];
            k++;
            newLength++;
        }

        if (newLength == 0) {
            return null;
        }

        return tempArr[0];
    }
}
