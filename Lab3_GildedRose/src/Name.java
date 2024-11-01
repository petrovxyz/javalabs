public class Name {
    private final String value;

    public Name(String value) {
        this.value = value;
    }

    public boolean equals(String otherName) {
        return value.equals(otherName);
    }

    @Override
    public String toString() {
        return value;
    }
}