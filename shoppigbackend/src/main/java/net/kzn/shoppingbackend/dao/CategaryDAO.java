package net.kzn.shoppingbackend.dao;

import java.util.List;

import net.kzn.shoppingbackend.dto.Category;

public interface CategaryDAO {
	
	List<Category> list();
	Category get(int id);

}
