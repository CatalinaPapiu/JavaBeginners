package basic.classes.model;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    // fields/attributes
    private List<String> elements;

    // constructors
    public Stack() {
        elements = new ArrayList<String>();
    }

    // methods

    private int getIndexOfLastElement() {
        if (elements.isEmpty()) {
            return -1;
        } else {
            return elements.size() - 1;
        }
    }

    public void push(String value) {
        System.out.println("Push: " + value);
        elements.add(value);
    }

    public String pop() {
        String value = peek();
        if (value != null) {
            elements.remove(getIndexOfLastElement());
        }
        System.out.println("Pop: " + value);
        return value;
    }

    public String peek() {
        if (isEmpty()) {
            // System.out.println("Peek: null");
            return null;
        } else {
            String value = elements.get(getIndexOfLastElement());
            // System.out.println("Peek: " + value);
            return value;
        }
    }

    public Boolean isEmpty() { // 3 possible values : Boolean.TRUE, Boolean.FALSE, null
        if (elements == null) {
            //System.out.println("isEmpty(): null");
            return null;
        } else {
            //System.out.println("isEmpty(): " + (elements.size() == 0));
            return elements.size() == 0;
        }
    }
}
