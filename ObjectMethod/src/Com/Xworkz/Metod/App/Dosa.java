package Com.Xworkz.Metod.App;

public class Dosa {
		private String name;
		private String material;
		private String type;
		private double price;
		private String shape;

		@Override
		public String toString() {
			return( " name: " + this.name + " material: " + this.material + " type:" + this.type + " price: " + this.price + " shape: " + this.shape );
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getMaterial() {
			return material;
		}

		public void setMaterial(String material) {
			this.material = material;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public String getShape() {
			return shape;
		}

		public void setShape(String shape) {
			this.shape = shape;
		}

}
