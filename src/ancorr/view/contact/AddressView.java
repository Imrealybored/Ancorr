package ancorr.view.contact;

import ancorr.model.contact.Address;

import javax.swing.*;

public class AddressView
{
    private JPanel mainPanel;
    private JTextField streetField;
    private JComboBox cityComboBox;
    private JComboBox stateOrProvinceComboBox;
    private JComboBox comboBox1;
    private JComboBox comboBox2;

    private Address address;

    public AddressView(Address address)
    {
        this.address = address;
    }

    public JPanel getMainPanel()
    {
        return mainPanel;
    }
}
