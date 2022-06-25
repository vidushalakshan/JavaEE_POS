package bo;

import bo.custom.impl.customerBoImpl;
import bo.custom.impl.itemBoimpl;
import bo.custom.impl.orderBoimpl;
import bo.custom.impl.orderDetailsBoImpl;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory(){

    }

    public static BOFactory BOFactory(){
        if (boFactory == null){
            boFactory=new BOFactory();
        }
        return boFactory;
    }

    public SuperBO getBO(BOType types){
        switch (types){
            case CUSTOMER:
                return new customerBoImpl();
            case ITEM:
                return new itemBoimpl();
            case ORDER:
                return new orderBoimpl();
            case ORDER_DETAILS:
                return (SuperBO) new orderDetailsBoImpl();
            default:
                return null;
        }
    }

    public enum BOType{
        CUSTOMER,ITEM,ORDER,ORDER_DETAILS
    }


}
