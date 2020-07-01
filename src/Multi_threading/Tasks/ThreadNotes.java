package Multi_threading.Tasks;

import java.util.ArrayList;

public class ThreadNotes {
    public static void main(String[] args) {

    }

    public static class Note {
        public final ArrayList<String> notes = new ArrayList<String>();

        public void addNote(int index, String note) {
            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
            synchronized(notes) {
                notes.add(index, note);
            }
            System.out.println("Уже добавлена заметка [" + note + "]");
        }

        public void removeNote(int index) {
            System.out.println("Сейчас будет удалена заметка с позиции " + index);
            String note = notes.get(index);
            synchronized(notes) {
                notes.remove(index);
            }
            System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
        }
    }
}
