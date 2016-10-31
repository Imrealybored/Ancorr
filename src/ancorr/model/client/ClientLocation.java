package ancorr.model.client;

import ancorr.model.location.City;
import ancorr.model.location.Country;
import ancorr.model.location.StateOrProvince;
import ancorr.model.location.ZipCode;

/**
 * Created by fihgu on 10/31/2016.
 */
public class ClientLocation
{
    private int clientLocationId;
    private int clientId;
    private String address;
    private City city;
    private Country country;
    private StateOrProvince stateOrProvince;
    private ZipCode postalCode;
}
