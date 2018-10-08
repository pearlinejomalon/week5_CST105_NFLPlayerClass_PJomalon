public class Player {
	
	//declare global instance variables
	public String name; 
	public String teamName;
	public String type; 
	public String position;
	public int age;
	public int yearsPro;
	public int careerTD;
	public int careerReceptions;
	public int careerTackles;
	public int careerInterceptions;
	
	public Player () { } //empty constructor
	
	//player constructor that accepts all parameters
	public Player(String nameIn, String teamNameIn, String typeIn, String positionIn, int ageIn, int yearsProIn, int careerTDIn, int careerReceptionsIn, int careerTacklesIn, int careerInterceptionsIn) {
		name = nameIn;
		teamName = teamNameIn;
		type = typeIn;
		position = positionIn;
		age = ageIn;
		yearsPro = yearsProIn;
		careerTD = careerTDIn;
		careerReceptions = careerReceptionsIn;
		careerTackles = careerTacklesIn;
		careerInterceptions = careerInterceptionsIn;
	}
	
	//getters and setters for all parameters
		public void setName(String nameIn) {
			this.name = nameIn;
		}
		public String getName() {
			return this.name;
		}
		
		public void setTeamName (String teamNameIn) {
			this.teamName = teamNameIn;
		}
		public String getTeamName() {
			return this.teamName;
		}
		
		public void setType(String typeIn) {
			this.type = typeIn;
		}
		public String getType() {
			return this.type;
		}
		
		public void setPosition(String positionIn) {
			this.position = positionIn;
		}
		public String getPosition() {
			return this.position;
		}
		
		public void setAge(int ageIn) {
			this.age = ageIn;
		}
		public int getAge() {
			return this.age;
		}
		
		public void setYearsPro(int yearsProIn) {
			this.yearsPro = yearsProIn;
		}
		public int getYearsPro() {
			return this.yearsPro;
		}
		
		public void setCareerTD(int careerTDIn) {
			this.careerTD = careerTDIn;
		}
		public int getCareerTD() {
			return this.careerTD;
		}
		
		public void setCareerReceptions(int careerReceptionsIn) {
			this.careerReceptions = careerReceptionsIn;
		}
		public int getCareerReceptions() {
			return this.careerReceptions;
		}
		
		public void setCareerTackles(int careerTacklesIn) {
			this.careerTackles = careerTacklesIn;
		}
		public int getCareerTackles() {
			return this.careerTackles;
		}
		
		public void setCareerInterceptions(int careerInterceptionsIn) {
			this.careerInterceptions = careerInterceptionsIn;
		}
		public int getCareerInterceptions() {
			return this.careerInterceptions;
		}
		
		
		public static void main(String[] args) {  //main method to test constructors, getters and setters
			
			Player jedelman = new Player("Julian Edelman ", "New England Patriots ",  "Offense", "WR", 35, 10, 75, 500, 0, 0);
			System.out.println("Player Name: " + jedelman.getName());
			System.out.println("Team Name: " + jedelman.getTeamName());
			System.out.println("Player Type: " + jedelman.getType());
			System.out.println("Position: " + jedelman.getPosition());
			System.out.println("Age: " + jedelman.getAge());
			System.out.println("Years in Pro: " + jedelman.getYearsPro());
			System.out.println("Career TDs: " + jedelman.getCareerTD());
			System.out.println("Career Receptions: " + jedelman.getCareerReceptions());
			System.out.println("Career Tackles: " + jedelman.getCareerTackles());
			System.out.println("Career Interceptions: " + jedelman.getCareerInterceptions());
			
		}
	
}
