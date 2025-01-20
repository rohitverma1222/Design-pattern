package BehavioralDesignPatterns.Memento;

public class TextEditorMain {
    public static void main(String[] args) {
        TextEditor editor=new TextEditor();
        CareTaker careTaker=new CareTaker();

        editor.write("Hello");
        careTaker.saveState(editor);

        editor.write("Hello Everyone");
        careTaker.saveState(editor);

        careTaker.undo(editor);

        System.out.println(editor.getContent());
    }

}
