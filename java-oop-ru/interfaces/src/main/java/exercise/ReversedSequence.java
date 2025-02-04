package exercise;

// BEGIN
class ReversedSequence implements CharSequence {

    String reversed;

    ReversedSequence(String text) {
        reversed = new StringBuilder(text).reverse().toString();
    }

    @Override
    public int length() {
        return reversed.length();
    }

    @Override
    public char charAt(int i) {
        return reversed.charAt(i);
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        if (reversed == null) {
            return "";
        }
        return reversed.substring(i, i1);
    }

    @Override
    public String toString() {
        if (reversed == null) {
            return "";
        }
        return reversed;
    }
}
// END
