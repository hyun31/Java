package week1one;


public class Employee {
	
		interface EmployeeType{
			public int getAmount();
		}
		class Engineer implements EmployeeType{
			public int getAmount() {
				return  100;
			}
		}
		class Manager implements EmployeeType{
			public int getAmount() {
				return 200;
			}
		}
		class Saleman implements EmployeeType{
			public int getAmount() {
				return 300;
			}
		}
		public class Employee2{
			private EmployeeType type;
			
			public Employee2(EmployeeType type) {
				setType(type);
			}
			public void setType(EmployeeType type) {
				this.type = type;
			}
			public int getAmount() {
				return type.getAmount();
			}
		}
	}

