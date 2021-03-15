class Number1 implements Iterator, Container {
    private int value;
    private int index;

    public Number1(int v) {
        value = v;
        index = 0;
    }

    public String convertToString() {
        return Integer.toString(value);
    }

    public void update(int v) {
        value = v;
    }

    public Iterator iterator() {
        return new Number1(this.value);
    }

    public boolean hasNext() {
        String v = this.convertToString();
        return index < v.length();
    }

    public Object next() {
        String v = this.convertToString();
        Character c = v.charAt(index++);
        return Integer.parseInt("" + c);
    }
}


