class Defense extends SoccerPlayer {
	int id;
	
	public Defense(String name,int id) {
		super(name);
		this.id = id;
	}
	public void display() {
		System.out.println(this.getName() + " " +this.id + " "  );
	}
}
