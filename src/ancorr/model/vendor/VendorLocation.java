package ancorr.model.vendor;

import ancorr.model.location.City;
import ancorr.model.location.Country;
import ancorr.model.location.StateOrProvince;
import ancorr.model.location.ZipCode;

/**
 * Created by fihgu on 10/31/2016.
 */
public class VendorLocation
{
    private int VendorLocationID;
    private String VendorAddress;
    private City city;
    private ZipCode zipCode;
    private StateOrProvince stateOrProvince;
    private int vendorID;
    private Country country;
}
