package homework2;

import java.util.ArrayList;
import java.util.List;

interface Component {
    void operation();
}

class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("Leaf " + name + " operation");
    }
}

class Composite implements Component {
    private List<Component> children = new ArrayList<>();
    private String name;

    public Composite(String name) {
        this.name = name;
    }

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    public List<Component> getChildren() {
        return children;
    }

    @Override
    public void operation() {
        System.out.println("Composite " + name + " operation start");
        for (Component child : children) {
            child.operation();
        }
        System.out.println("Composite " + name + " operation end");
    }
}

public class hw2 {
    public static void main(String[] args) {
        Leaf leaf1 = new Leaf("A");
        Leaf leaf2 = new Leaf("B");
        Leaf leaf3 = new Leaf("C");

        Composite composite1 = new Composite("X");
        Composite composite2 = new Composite("Y");

        composite1.add(leaf1);
        composite1.add(leaf2);

        composite2.add(leaf3);
        composite2.add(composite1);

        composite2.operation();
    }
}

