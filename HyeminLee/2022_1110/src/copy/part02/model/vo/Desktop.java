package copy.part02.model.vo;

public class Desktop extends Electronic {

	
	public static final String CPU = "intel";
	private String graphic;
	
	public Desktop() {}

	public Desktop(String brand,String name,int price,String graphic) {
		super(brand, name, price);
		this.graphic = graphic;
	}

	public String getGraphic() {
		return graphic;
	}

	public void setGraphic(String graphic) {
		this.graphic = graphic;
	}
	
	
//----------------------------- static은 입력받으면 수정불가능 하니 get만??
	public static String getCpu() {
		return CPU;
	}

	@Override
	public String toString() {
		return super.toString()+", graphic : " + graphic;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
