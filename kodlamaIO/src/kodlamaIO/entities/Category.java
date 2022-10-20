package kodlamaIO.entities;

public class Category extends MainWindow{
	
	private int cagegoryId;
	private String categoryName;

	public Category(int cagegoryId, String categoryName) {
		
		this.cagegoryId = cagegoryId;
		this.categoryName = categoryName;
	}

	public int getCagegoryId() {
		return cagegoryId;
	}

	public void setCagegoryId(int cagegoryId) {
		this.cagegoryId = cagegoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	

	

}
