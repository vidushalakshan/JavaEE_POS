package dao.custom;

import dao.crudDAO;
import entity.customer;

import javax.json.JsonArrayBuilder;

public interface customerDAO extends crudDAO<customer,String> {
    JsonArrayBuilder loadCusID();

    JsonArrayBuilder loadSelectCusDetails(String id);
}
