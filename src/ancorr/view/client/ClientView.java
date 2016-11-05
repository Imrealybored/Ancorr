package ancorr.view.client;

import ancorr.controller.MainApplication;
import ancorr.model.client.Client;

import javax.swing.*;

public class ClientView
{
    private JTabbedPane tabbedPane1;
    private JPanel mainPanel;
    private JPanel clientBillsPanel;

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
        ClientBillListView view = new ClientBillListView(mainApplication.getDatabaseAccess().getClientBills(client));
        clientBillsPanel = view.getMainPanel();
    }
}
