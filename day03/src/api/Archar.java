package api;

public class Archar {

		String name;
		String power;
		public Archar(String name, String power) {
			super();
			this.name = name;
			this.power = power;
		}
		
		public boolean equals(Object obj) {
			Archar temp = (Archar) obj;
			if(name == temp.name && power == temp.power) {
				return true;
			}
			else {
				return false;
			}
		}
}
