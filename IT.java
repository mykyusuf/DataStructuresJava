package collection;

import java.util.Vector;

public interface IT<T> {
    public boolean hasNext();
    public T next() throws Exception;
    public void remove();

}
