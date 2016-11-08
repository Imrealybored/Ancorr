package ancorr.view.contact;

import ancorr.controller.MainApplication;
import ancorr.model.contact.Address;
import ancorr.model.contact.Contact;

import javax.swing.*;

public class ContactView
{
    private JPanel mainPanel;
    private JTextField emailField;
    private JTextField phoneField;
    private AddressView addressView;

    private Contact contact;

    public ContactView(Contact contact)
    {
        this.contact = contact;
    }

    private void createUIComponents()
    {
        Address address = MainApplication.getDatabaseAccess().getAddress(contact.addressId);
        addressView = new AddressView(address);
    }

    public JPanel getMainPanel()
    {
        return mainPanel;
    }
}
