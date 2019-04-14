package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dao.CategaryDAO;
import net.kzn.shoppingbackend.dto.Category;

@Repository("categaryDAO")
public class categaryDAOImpl implements CategaryDAO {
	
	private static List<Category> categories=new ArrayList<>();
	
	static{
		Category category=new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is description for Television");
		category.setImageUrl("CAT_1.png");
		categories.add(category);
		
		//second Category
		category=new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is description for Mobile");
		category.setImageUrl("CAT_2.png");
		categories.add(category);
		
		//3rd category
		category=new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is description for Laptop");
		category.setImageUrl("CAT_3.png");
		categories.add(category);
	}

	public List<Category> list() {
		return categories;
	}

	@Override
	public Category get(int id) {
		for(Category category:categories){
			if(category.getId() == id){
				return category;
			}
		}
		return null;
	}

}
