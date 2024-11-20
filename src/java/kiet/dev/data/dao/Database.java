package kiet.dev.data.dao;

import kiet.dev.data.impl.CategoryImpl;
import kiet.dev.data.impl.OrderImpl;
import kiet.dev.data.impl.OrderItemImpl;
import kiet.dev.data.impl.ProductImpl;
import kiet.dev.data.impl.UserImpl;

public class Database extends DatabaseDao {

    @Override
    public ProductDao getProductDao() {
        // TODO Auto-generated method stub
        return new ProductImpl();
    }

    @Override
    public CategoryDao getCategoryDao() {
        // TODO Auto-generated method stub
        return new CategoryImpl();
    }

    @Override
    public OrderItemDao getOrderItemDao() {
        // TODO Auto-generated method stub
        return new OrderItemImpl();
    }

    @Override
    public OrderDao getOrderDao() {
        // TODO Auto-generated method stub
        return new OrderImpl();
    }

    @Override
    public UserDAO getUserDao() {
        // TODO Auto-generated method stub
        return new UserImpl();
    }

}
