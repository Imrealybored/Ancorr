package ancorr.view.client;

import ancorr.controller.MainApplication;
import ancorr.model.client.Client;
import ancorr.model.contact.Contact;
import ancorr.view.contact.ContactView;

import javax.swing.*;

public class ClientView
{
    private JPanel mainPanel;
    private JPanel clientTabPannel;
    private JTextField fristNameField;
    private JTextField lastNameField;
    private JComboBox statusComboBox;
    private JPanel billTabPanel;
    private JPanel contactTabPanel;
    private JButton confirmButton;
    private JButton cancelButton;

    private MainApplication mainApplication;
    private Client client;

    public ClientView(MainApplication mainApplication, Client client)
    {
        this.mainApplication = mainApplication;
        this.client = client;

        if(this.client == null)
        {
            this.client = new Client();
        }
    }

    public JPanel getMainPanel()
    {
        return mainPanel;
    }

    private void createUIComponents()
    {
        billTabPanel = new ClientBillListView(mainApplication.getDatabaseAccess().getClientBills(client)).getMainPanel();
        Contact contact = mainApplication.getDatabaseAccess().getContact(client.contactId);
        contactTabPanel = new ContactView(contact).getMainPanel();
    }
}
