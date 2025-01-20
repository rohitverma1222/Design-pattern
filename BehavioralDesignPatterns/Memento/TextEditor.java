package BehavioralDesignPatterns.Memento;

public class TextEditor {

    private String content;

    public EditorMemento save(){
        return new EditorMemento(content);
    }

    public void restore(EditorMemento memento){
        content = memento.getContent();
    }

    public void write(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
