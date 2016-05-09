import java.util.ArrayList;

public class Report1 {
		public static void main(String[] args) {
				ArrayList<Human> humanArray = new ArrayList<Human>();
				Human humans[] = {
						new Takahashi("高橋"),
						new Sugawara("菅原"), 
						new Kawamura("川村"),
						new Sasama("笹間")
				};

				for(int i = 0; i < 4; i++) {
						humanArray.add(humans[i]);
				}

				for(int i = 0; i < 4; i++){
						humanArray.get(i).eat();
						humanArray.get(i).specialSkill();
				}
		}
}
