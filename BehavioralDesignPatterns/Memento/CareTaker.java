package BehavioralDesignPatterns.Memento;

import java.util.Stack;

public class CareTaker {

    private Stack<EditorMemento> history=new Stack<>();

    public void saveState(TextEditor text){
        history.push(text.save());
    }

    public void undo(TextEditor editor){
         if(!history.isEmpty()){
             history.pop();
             editor.restore(history.peek());
         }
    }
}
