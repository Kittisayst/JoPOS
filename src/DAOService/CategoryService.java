package DAOService;

import DAOModel.CategoryDAO;
import Model.CategoryModel;
import java.sql.ResultSet;
import java.util.List;

public class CategoryService {

    private CategoryDAO dAO = new CategoryDAO();

    public int create(CategoryModel data) {
        return dAO.create(data);
    }

    public CategoryModel read(int id) {
        return dAO.read(id);
    }

    public int update(CategoryModel data) {
        return dAO.update(data);
    }

    public int delete(int id) {
        return dAO.delete(id);
    }

    public List<CategoryModel> getAll() {
        return dAO.getAll();
    }

}
