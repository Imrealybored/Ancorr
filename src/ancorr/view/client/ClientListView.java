package ancorr.view.client;

import ancorr.model.client.Client;
import ancorr.view.ListView;

import java.util.List;
import ancorr.controller.MainApplication;

public class ClientListView extends ListView<Client>
{
    public ClientListView(List<Client> itemList)
    {
        super(itemList);
    }

    @Override
    public void onCreate()
    {
		ClientView view = new ClientView(null);
		MainApplication.setContent(view.getMainPanel());
    }

    @Override
    public void onEdit()
    {
		ClientView view = new ClientView(this.getSelectedItem());
		MainApplication.setContent(view.getMainPanel());
    }

    @Override
    public void onDelete()
    {
		Client client = this.getSelectedItem();
		
		if(client != null)
		{
			this.itemList.remove(client);
			MainApplication.getDatabaseAccess().deleteClient(client.id);
			this.update();
		}
    }
}
