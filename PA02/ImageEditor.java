/*
    Name: TODO
    PID:  TODO
 */

/**
 * TODO
 * @author TODO
 * @since  TODO
 */
public class ImageEditor {

    /* static constants, feel free to add more if you need */
    private static final int MAX_PIXEL_VALUE      = 255;
    private static final int STACKS_INIT_CAPACITY = 30;

    /* instance variables, feel free to add more if you need */
    private int[][] image;
    private IntStack undo;
    private IntStack redo;

    ImageEditor(int[][] image) {
        /* TODO */
    }

    int[][] getImage() {
        /* TODO */
        return null;
    }

    public void scale(int i, int j, double scaleFactor) {
        /* TODO */
    }

    public void assign(int i, int j, int color) {
        /* TODO */
    }

    public void delete(int i, int j) {
        /* TODO */
    }

    public boolean undo() {
        /* TODO */
        return false;
    }

    public boolean redo() {
        /* TODO */
        return false;
    }
}
