import java.util.Arrays;

class AsciiCharSequence implements CharSequence {

    private final byte[] value;

    AsciiCharSequence(byte[] value) {
        this.value = value.clone();
    }

    @Override
    public int length() {
        return value.length;
    }

    @Override
    public char charAt(int i) {
        return (char) value[i];
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        final byte[] copy = new byte[value.length];
        System.arraycopy(value, 0, copy, 0, value.length);
        return new AsciiCharSequence(copy);
    }
    // implementation

    @Override
    public String toString() {
        return new String(value);
    }

}