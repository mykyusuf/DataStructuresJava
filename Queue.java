package collection;

import java.util.Vector;

public interface Queue<T> extends Coll<T> {
    public IT iterator();
    public void add(T e);
    public void addAll(Coll<T> c);
    public void clear();
    public boolean contains(T e);
    public boolean containsAll(Coll<T> c);
    public  boolean isEmpty();
    public Vector<T> getVect();
    public void remove(T e);
    public void removeAll(Coll<T> c);
    public void retainAll(Coll<T> c);
    public int size();
}
