package race;

	public class Player1{
		private String name;
		private int recode;
		
		public void setName(String name){
			this.name = name;
		}
		public String getName() {
			return this.name;
		}
		public void setRecode(int record) {
			this.recode = record;
		}
		public int getRecode() {
			return this.recode;
		}
		void printStates() {
			System.out.println("이름:"+name+"기록:"+recode+"초");
		}
	}
	