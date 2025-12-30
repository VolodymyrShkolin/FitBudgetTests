package constants;

public final class Folders {
    private Folders() {
        throw new AssertionError("Cannot instantiate constants class");
    }

    public static final String downloadsFolder = System.getProperty("user.dir") + "\\src\\test\\java\\downloads";
}
