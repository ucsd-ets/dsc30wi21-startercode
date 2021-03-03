import java.util.*;

@SuppressWarnings("rawtypes")
public class HashTable<K, D> {

    protected class TableEntry<K, D> {
        private K key;
        private D data;

        public TableEntry(K key, D data) {
            this.key = key;
            this.data = data;
        }

        @Override
        public boolean equals(Object obj) {
            if ((obj == null) || !(obj instanceof TableEntry))
                return false;
            return key.equals(((TableEntry<?, ?>) obj).key);
        }

        @Override
        public int hashCode() {
            return key.hashCode();
        }
    }

    private LinkedList<TableEntry<K, D>>[] table;
    private int nElems;


    @SuppressWarnings("unchecked")
    public HashTable(int capacity) {
        /* TODO */
    }

    public boolean insert(K key, D data) {
        /* TODO */
        return false;
    }

    public boolean update(K key, D newData) {
        /* TODO */
        return false;
    }

    public boolean delete(K key) {
        /* TODO */
        return false;
    }

    public D lookup(K key) {
        /* TODO */
        return null;
    }

    public int size() {
        /* TODO */
        return -1;
    }

    public int capacity() {
        /* TODO */
        return -1;
    }

    private int hashValue(K key) {
        /* TODO */
        return -1;
    }

    @SuppressWarnings("unchecked")
    private void rehash() {
        /* TODO */
    }

}
