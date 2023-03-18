package con.ani.solutions.funifc;

@FunctionalInterface
public interface CompletionCallback {
    void complete(String taskName);
}
