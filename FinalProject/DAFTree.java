import java.util.*;

@SuppressWarnings("rawtypes")
public class DAFTree<K extends Comparable<? super K>, D> implements Iterable {

    private DAFNode<K, D> root;

    protected class DAFNode<K extends Comparable<? super K>, D> {
        K key;
        D data;
        int count; // duplicate counter
        DAFNode<K, D> left, right;

        public DAFNode(K key, D data) {
            /* TODO */
        }

        public DAFNode(K key, D data, int nCopy) {
            /* TODO */
        }
    }

    public DAFTree() {
        /* TODO */
    }

    public int size() {
        /* TODO */
        return -1;
    }

    public int nUniqueKeys() {
        /* TODO */
        return -1;
    }

    public DAFNode<K, D> insert(K key, D data, int nCopy) {
        /* TODO */
        return null;
    }

    public DAFNode<K, D> insertDuplicate(K key, int nCopy) {
        /* TODO */
        return null;
    }

    public DAFNode<K, D> lookup(K key) {
        /* TODO */
        return null;
    }

    public DAFNode<K, D> updateData(K key, D newData) {
        /* TODO */
        return null;
    }

    public DAFNode<K, D> remove(K key, int nCopy) {
        /* TODO */
        return null;
    }

    public DAFNode<K, D> findExtreme(boolean isMax) {
        /* TODO */
        return null;
    }

    public class DAFTreeIterator implements Iterator<K> {

        Stack<DAFNode<K, D>> stack;

        public DAFTreeIterator() {
            /* TODO */
        }

        public boolean hasNext() {
            /* TODO */
            return false;
        }

        public K next() {
            /* TODO */
            return null;
        }
    }

    public Iterator<K> iterator() {
        /* TODO */
        return null;
    }

}
