package ancorr.model.inventory;

/**
 * material that the company have in stock
 */
public class MaterialStock
{
    public Integer id;
    public Integer warehouseID;
    public Integer materialTypeId;

    public Double originalQuantity;
    public Double quantity;
}
