package collection;

import java.util.Vector;

public class hashSet<T> implements Set<T>{

    /*
    hashsetAdd: eleman collectionda yoksa ekler
    */
    public void add(T e){
        int var=0;
        for(int i=0; i<data.size(); i++){            
            if(data.get(i).equals(e)){
                var=1;
            }
        }
        if(var==0){
            data.addElement(e);
            size++;
        }
    }
     /*
    hashsetAddAll: collection collectionda yoksa ekler
    */
    public void addAll(Coll<T> c){
        int var=0;
        for(int i=0; i<c.getVect().size(); i++){
            for(int j=0;j<data.size();j++){

                if(data.get(j).equals(c.getVect().get(i))){
                    var=1;
                }
                
            }
            if(var==0){
                    data.addElement(c.getVect().get(i));
                    size++;
                }
                var=0;
            
        }
    }
    public void clear(){
        data.clear();
        size=0;
    }
    public boolean contains(T e){
        for(int i=0;i<data.size();i++){
            if(data.get(i).equals(e)){
                return true;
            }
        }
        return false;
    }
    public boolean containsAll(Coll<T> c){
        int total=0;
        for(int i=0;i<data.size();i++){
            for(int j=0;j<c.size();j++){
                if(data.get(i)==c.getVect().get(j)){
                    total++;
                }
            }
            
        }
        if(total==c.size()){
            return true;
        }
        return false;
    }
    public  boolean isEmpty(){
        if(data.isEmpty()){
            return true;
        }
        return false;
    }
    public Vector<T> getVect(){
        return data;
    }
    public void remove(T e){
        for(int i=0;i<data.size();i++){
            System.out.println(data.get(i)+" "+e);
            if(data.get(i).equals(e)){
                
                data.remove(i);
                size--;
            }
        }
    }
    public void removeAll(Coll<T> c){
        for(int i=0;i<data.size();i++){
            for(int j=0;j<c.size();j++){
                if(data.get(i)==c.getVect().get(j)){
                    data.remove(i);
                    size--;
                }

            }
            
        }
    }
    public void retainAll(Coll<T> c){
        Vector<T> t = new Vector<T>();
        for(int i=0;i<data.size();i++){
            for(int j=0;j<c.getVect().size();j++){
                if(data.get(i)==c.getVect().get(j)){
                    t.addElement(c.getVect().get(j));
                }
            }
            
        }
        data.clear();
        size=0;
        for(int i=0;i<t.size();i++){
            data.addElement(t.get(i));
            size++;
        }
    }
    public int size(){
        return size;
    }
    
    
    public IT<T> iterator() {
        IT<T> it = new IT<T>() {

            @Override
            public boolean hasNext() {
                return currentIndex < size && data.get(currentIndex) != null;
            }

            @Override
            public T next() throws Exception{
                if(hasNext()){
                return data.get(currentIndex++);
                }
                throw new Exception();
            }

            @Override
            public void remove() {
                data.remove(currentIndex-1);
                size--;
            }
        };
        return it;
    }
    private int currentIndex = 0;
    private Vector<T> data=new Vector<T>();
    private int size=0;
    private IT<T> it;

    
}
