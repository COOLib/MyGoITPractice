
public class Main {

    public String add(String a, String b) {

        if (a == null) {
            return b;
        } else if (b == null) {
            return a;
        } else if (a == null && b == null) {
            return null;
        } else {
            String newA = a.toLowerCase();
            String newB = b.toLowerCase();
            String myResStr;
            boolean isOneAdd = false;
            int i = 0;
            int loops;
            int numsQuantity = 9;
            int base = 36;
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
                    ch = newA.charAt(a.length() - i);
                }

                if (i > b.length()) {
                    ch1 = '0';
                } else {
                    ch1 = newB.charAt(b.length() - i);
                }

                int k;
                int m;

                if (ch > '9') {
                    k = numsQuantity + ch - ('a' - 1);
                } else {
                    k = ch - '0';
                }

                if (ch1 > '9') {
                    m = numsQuantity + ch1 - ('a' - 1);
                } else {
                    m = ch1 - '0';
                }

                int res;
                char myRes = 0;

                if (isOneAdd) {
                    res = k + m + 1;
                } else {
                    res = k + m;
                }

                if (loops > 1 && (res / base == 1)) {
                    if (res % base > 9) {
                        myRes = (char) (res % base + ('a' - 1) - numsQuantity);
                        myResStr = String.valueOf(myRes);
                        isOneAdd = true;
                    } else {
                        myResStr = String.valueOf(res % base);
                        isOneAdd = true;
                    }
                } else if (loops == 1 && res / base == 1) {
                    if (res % base > 9) {
                        myRes = (char) (res % base + ('a' - 1) - numsQuantity);
                        myResStr = myRes + String.valueOf(1);
                    } else {
                        myRes = (char) (res % base + '0');
                        myResStr = myRes + String.valueOf(1);
                    }
                } else {
                    if (res > 9) {
                        myRes = (char) (res + ('a' - 1) - numsQuantity);
                        myResStr = String.valueOf(myRes);
                        isOneAdd = false;
                    } else {
                        myRes = (char) (res + '0');
                        myResStr = String.valueOf(myRes);
                        isOneAdd = false;
                    }
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
