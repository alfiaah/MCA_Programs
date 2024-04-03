import java.awt.*;
import java.awt.event.*;

public class ListExample extends Frame implements ItemListener {
    List list;

    public ListExample() {
        setTitle("List Example");
        setSize(300, 200);

        list = new List(4, false); // 4 visible rows, single selection mode
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");

        list.addItemListener(this);

        setLayout(new FlowLayout());
        add(list);

        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        String selectedItem = list.getSelectedItem();
        System.out.println("Selected Item: " + selectedItem);
    }

    public static void main(String[] args) {
        new ListExample();
    }
}
