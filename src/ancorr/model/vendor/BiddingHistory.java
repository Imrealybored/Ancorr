package ancorr.model.vendor;

public class BiddingHistory
{
    private int biddingHistoryId;
    private int vendorId;
    private String materialDesc;
    private double totalCost;

    public int getBiddingHistoryId()
    {
        return biddingHistoryId;
    }

    public void setBiddingHistoryId(int biddingHistoryId)
    {
        this.biddingHistoryId = biddingHistoryId;
    }

    public int getVendorId()
    {
        return vendorId;
    }

    public void setVendorId(int vendorId)
    {
        this.vendorId = vendorId;
    }

    public String getMaterialDesc()
    {
        return materialDesc;
    }

    public void setMaterialDesc(String materialDesc)
    {
        this.materialDesc = materialDesc;
    }

    public double getTotalCost()
    {
        return totalCost;
    }

    public void setTotalCost(double totalCost)
    {
        this.totalCost = totalCost;
    }
}
