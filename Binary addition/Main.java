public class Main {

    public static void main(String[] args) {

        Main main = new Main();

        String a = "10001";
        String b = "1010";
        String s = main.add(a, b);
        System.out.println(s);
    }


    String add(String a, String b) {

        if (a == null) {
            return b;
        } else if (b == null) {
            return a;
        } else if (a == null && b == null) {
            return null;
        } else {
            String myResStr;
            boolean isOneAdd = false;
            int i = 0;
            int loops;
            int base = 2;
            StringBuilder reverseResult = new StringBuilder();

            if (a.length() > b.length()) {
                loops = a.length();
            } else {
                loops = b.length();
            }

            while (loops > 0) {
                i++;
                char ch;
                char ch1;

                if (i > a.length()) {
                    ch = '0';
                } else {
                    ch = a.charAt(a.length() - i);
                }

                if (i > b.length()) {
                    ch1 = '0';
                } else {
                    ch1 = b.charAt(b.length() - i);
                }

                int k = ch - '0';
                int m = ch1 - '0';
                int res;

                if (isOneAdd) {
                    res = k + m + 1;
                } else {
                    res = k + m;
                }

                char myRes = 0;

                if (loops > 1 && res / base == 1) {
                        myRes = (char) (res % base + '0');
                        myResStr = String.valueOf(myRes);
                        isOneAdd = true;
                } else if (loops == 1 && res / base == 1) {
                        myRes = (char) (res % base + '0');
                        myResStr = String.valueOf(myRes) + String.valueOf(1);
                } else {
                    myRes = (char) (res + '0');
                    myResStr = String.valueOf(myRes);
                    isOneAdd = false;
                }
                reverseResult.append(myResStr);
                loops--;
            }
            StringBuilder totalResult = new StringBuilder();
            totalResult.append(reverseResult.reverse());
            String total = totalResult.toString();

            return total;
        }
    }
}
