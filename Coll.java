package collection;

import java.util.Vector;
/*
Ana interface Coll. Buradan Set Queue ve List turetiliyor
*/
public interface Coll<T> {
    
    /*It: Iterator return eder*/
    public IT iterator();
    /*
    add: Belirli elementi collectiona ekler
    */
    public void add(T e);
    /*
    addAll: Belirli collectionu asil collectiona ekler
    */
    public void addAll(Coll<T> c);
    /*
    clear: collectionu temizler
    */
    public void clear();
    /*
    contains: belirli eleman collectionda varsa true
    */
    public boolean contains(T e);
    /*
    containsAll: Belirli collectionu asil collectionda arar
    */
    public boolean containsAll(Coll<T> c);
    /*
    isEmpty: Collection bossa true
    */
    public  boolean isEmpty();
    /*
    getVect: elemanlari tutan vector return eder
    */
    public Vector<T> getVect();
    /*
    remove: belirli elemani siler
    */
    public void remove(T e);
    /*
    removeAll: belirli collectionu siler
    */
    public void removeAll(Coll<T> c);
    /*
    retainAll: Belirli collection ile asil collection kesisimi
    */
    public void retainAll(Coll<T> c);
    /*
    size: boyutunu return eder;
    */
    public int size();
    
}
