package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO {
    public ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException ;

    public boolean saveItem(ItemDTO item) throws SQLException, ClassNotFoundException;

    public boolean updateItem(ItemDTO item) throws SQLException, ClassNotFoundException;

    public boolean findExistingItem(String code) throws SQLException, ClassNotFoundException ;
    public void deleteItem(String code) throws SQLException, ClassNotFoundException ;

    public String generateId() throws SQLException, ClassNotFoundException;
    public ItemDTO searchItem(String newItemCode) throws SQLException, ClassNotFoundException ;
    public boolean existItem(String code) throws SQLException, ClassNotFoundException ;
}
