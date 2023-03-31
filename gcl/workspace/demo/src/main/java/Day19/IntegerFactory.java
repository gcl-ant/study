package Day19;

@FunctionalInterface
public interface IntegerFactory<T extends String> {
   Integer createInteger(T t);
}
