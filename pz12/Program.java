package pz12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Shape {
    private String type;
    private int x;
    private int y;

    public Shape(String type, int x, int y) {
        this.type = type;
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return type + " at (" + x + "," + y + ")";
    }
}

class DrawingMemento {
    private final List<Shape> shapesState;

    public DrawingMemento(List<Shape> shapes) {
        this.shapesState = new ArrayList<>(shapes);
    }

    public List<Shape> getShapesState() {
        return shapesState;
    }
}

class Drawing {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public DrawingMemento save() {
        return new DrawingMemento(shapes);
    }

    public void restore(DrawingMemento memento) {
        shapes = new ArrayList<>(memento.getShapesState());
    }

    public void printShapes() {
        if (shapes.isEmpty()) {
            System.out.println("Рисунок пуст.");
        } else {
            System.out.println("Текущие фигуры:");
            for (int i = 0; i < shapes.size(); i++) {
                System.out.println((i + 1) + ". " + shapes.get(i));
            }
        }
    }
}

class Caretaker {
    private List<DrawingMemento> history = new ArrayList<>();
    private int currentIndex = -1;
    private Drawing drawing;

    public Caretaker(Drawing drawing) {
        this.drawing = drawing;
        saveState(); // сохранить начальное состояние
    }

    public void saveState() {
        // Удаляем возможные "будущие" состояния, если были undone действия
        while (history.size() > currentIndex + 1) {
            history.remove(history.size() - 1);
        }
        history.add(drawing.save());
        currentIndex++;
    }

    public void undo() {
        if (currentIndex > 0) {
            currentIndex--;
            drawing.restore(history.get(currentIndex));
            System.out.println("Отмена выполнена.");
        } else {
            System.out.println("Нечего отменять.");
        }
    }

    public void redo() {
        if (currentIndex < history.size() - 1) {
            currentIndex++;
            drawing.restore(history.get(currentIndex));
            System.out.println("Возврат выполнен.");
        } else {
            System.out.println("Нечего возвращать.");
        }
    }
}

public class Program {
    private static Drawing drawing = new Drawing();
    private static Caretaker caretaker = new Caretaker(drawing);
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Рисователь фигур с Undo/Redo (без Stack) ===");

        boolean running = true;
        while (running) {
            System.out.println("\n1 - Добавить фигуру");
            System.out.println("2 - Отменить (Undo)");
            System.out.println("3 - Вернуть (Redo)");
            System.out.println("4 - Показать фигуры");
            System.out.println("0 - Выход");
            System.out.print("Выберите действие: ");

            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    addShape();
                    break;
                case "2":
                    caretaker.undo();
                    break;
                case "3":
                    caretaker.redo();
                    break;
                case "4":
                    drawing.printShapes();
                    break;
                case "0":
                    running = false;
                    break;
                default:
                    System.out.println("Некорректный ввод.");
            }
        }
        System.out.println("Спасибо за использование!");
    }

    private static void addShape() {
        System.out.print("Введите тип фигуры: ");
        String type = scanner.nextLine();
        System.out.print("Введите X: ");
        int x = readInt();
        System.out.print("Введите Y: ");
        int y = readInt();

        Shape shape = new Shape(type, x, y);
        drawing.addShape(shape);
        caretaker.saveState();
        System.out.println("Фигура добавлена: " + shape);
    }

    private static int readInt() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Пожалуйста, введите число: ");
            }
        }
    }
}

