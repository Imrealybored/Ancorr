package ancorr.model.vendor;

import java.sql.Date;

public class VendorContract
{
    private int vendorContractId;
    private int vendorId;
    private String contractDesc;
    private Date contractStartDate;
    private Date contractEndDate;
    private int vendorStatCode;

    public int getVendorContractId()
    {
        return vendorContractId;
    }

    public void setVendorContractId(int vendorContractId)
    {
        this.vendorContractId = vendorContractId;
    }

    public int getVendorId()
    {
        return vendorId;
    }

    public void setVendorId(int vendorId)
    {
        this.vendorId = vendorId;
    }

    public String getContractDesc()
    {
        return contractDesc;
    }

    public void setContractDesc(String contractDesc)
    {
        this.contractDesc = contractDesc;
    }

    public Date getContractStartDate()
    {
        return contractStartDate;
    }

    public void setContractStartDate(Date contractStartDate)
    {
        this.contractStartDate = contractStartDate;
    }

    public Date getContractEndDate()
    {
        return contractEndDate;
    }

    public void setContractEndDate(Date contractEndDate)
    {
        this.contractEndDate = contractEndDate;
    }

    public int getVendorStatCode()
    {
        return vendorStatCode;
    }

    public void setVendorStatCode(int vendorStatCode)
    {
        this.vendorStatCode = vendorStatCode;
    }
}
