package ancorr.view;

import javax.swing.*;
import java.util.List;

public abstract class ListView<T>
{
    protected JList list;
    private JPanel mainPanel;
    private JButton createButton;
    private JButton editButton;
    private JButton deleteButton;

    protected List<T> itemList;

    public ListView(List<T> itemList)
    {
        this.itemList = itemList;
        this.update();

        createButton.addActionListener(e ->
        {
            onCreate();
        });

        editButton.addActionListener(e ->
        {
            onEdit();
        });

        deleteButton.addActionListener(e ->
        {
            onDelete();
        });
    }

    public JPanel getMainPanel()
    {
        return mainPanel;
    }

    public T getSelectedItem()
    {
        Object obj = list.getSelectedValue();

        if(obj != null)
        {
            return (T)obj;
        }
        else
        {
            return null;
        }
    }

    public void update()
    {
        this.list.setListData(this.itemList.toArray());
    }

    public abstract void onCreate();
    public abstract void onEdit();
    public abstract void onDelete();
}
