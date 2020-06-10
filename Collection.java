package collection;

public class Collection {

    public static void main(String[] args) {
        LinkedList<Integer> h = new LinkedList<Integer>();
        LinkedList<Integer> h2 = new LinkedList<Integer>();
        ArrayList<Integer> s1 = new ArrayList<Integer>();
        ArrayList<Integer> s2 = new ArrayList<Integer>();
        hashSet<Double> s3 = new hashSet<Double>();
        hashSet<Double> s4 = new hashSet<Double>();
        
    
        //Array list fonk denemeleri
   
        s1.add(5);
        s1.add(6);
        s3.add(7.0);
        s3.add(8.0);
        s3.add(9.0);
 
        System.out.println("s1 contains 5: "+s1.contains(5));
        
        s2.add(10);
        s2.addAll(s1);
        s2.remove(10);
        System.out.println("s2 size: "+s2.size());
        
        System.out.println("s2 contains s1: "+s2.containsAll(s1));
        System.out.println("s1 isempty: "+s1.isEmpty());
        System.out.println("s1 size: "+s1.size());
        s1.clear();
        System.out.println("s1 size after clear: "+s1.isEmpty());
        
        //s3 set eleman ekleme

        s3.add(2.5);
        s3.add(3.5);
        s3.add(4.5);
        System.out.println("s3 size: "+s3.size());

        //s4 setine ayni elemani ekleme denemesi

        s4.addAll(s3);
        System.out.println("s4 ayni eleman ekleme oncesi size: "+s4.size());        
        s4.add(2.5);     

        System.out.println("s4 ayni eleman ekleme sonrasi size: "+s4.size());

        s4.remove(2.5);
        

        System.out.println("s4 eleman silme sonrasi size: "+s4.size());
        
        s3.removeAll(s4);
        System.out.println("s4 den s3 silme sonrasi size: "+s4.size());

        s4.retainAll(s3);
        System.out.println("s4 kesisim s3 sonrasi size: "+s4.size());
        
        //Linked List deneme
        
        h.add(5);
        h.add(3);
        h.remove(3);
        System.out.println("out element: "+h.poll());
        System.out.println("size queue:"+h.size());
        h2.offer(7);
        h2.offer(8);
        h.add(4);
        h.addAll(h2);
        System.out.println("ekleme sonrasi size queue:"+h.size());        
        h.retainAll(h2);
        System.out.println("h kesisim h2 size: "+h.size());
        
        try{
        System.out.println("iterator of s3 next: "+s3.iterator().next());
        s3.iterator().remove();        
        
        }
        catch(Exception e){
            System.out.println("Exception:"+e);
        }
        try{
        
        System.out.println("iterator of h next: "+h.iterator().next());
             
        
        }
        catch(Exception e){
            System.out.println("Exception:"+e);
        }
        try{
  
        System.out.println("iterator of s2 next: "+s2.iterator().next());
        
        }
        catch(Exception e){
            System.out.println("Exception:"+e);
        }
        
        h.clear();
        h2.clear();
        s1.clear();
        s2.clear();
        s3.clear();
        s4.clear();

        System.out.println("Sizes after clear: h size:"+h.size()+" h2 size:"+h2.size()+" s1 size:"+s1.size()+" s2 size:"+s2.size()+" s2 size:"+s3.size()+" s4 size:"+s4.size());
        
        
    }
    
}
