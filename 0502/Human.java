public abstract class Human implements Walkable, Eatable{
		String name = "unknown";

		public void setName(String name) {
				this.name = name;
		}

		public void walk(){
				System.out.println(this.name + "は歩きました");
		}
		
		public void eat(){
				System.out.println(this.name + "は食べました");
		}

		abstract public void specialSkill();
}

