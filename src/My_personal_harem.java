import java.util.Iterator;
import java.util.LinkedList;

public class My_personal_harem implements Iterable<Female_boobs>{

    private LinkedList<Female_boobs> my_femaile = new LinkedList<Female_boobs>();

    public My_personal_harem(Female_boobs femaile) {
        my_femaile.add(femaile);
    }

    public My_personal_harem() {
    }

    public void addfemale(Female_boobs female){
        my_femaile.add(female);
    }

    public Female_boobs getMy_femaile(Integer index) {
        return my_femaile.get(index);
    }

    @Override
    public Iterator<Female_boobs> iterator() {
        return new Harem_Iterator();
    }


    protected class Harem_Iterator implements Iterator<Female_boobs>{
        private int index = 0;

    @Override
    public boolean hasNext() {
        return  index<my_femaile.size();
    }

    @Override
    public Female_boobs next() {
        return my_femaile.get(index++);
    }
}


}
