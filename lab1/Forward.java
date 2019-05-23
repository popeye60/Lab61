class Forward extends SoccerPlayer {
	int id;
	
	public Forward(String name,int id) {
		super(name);
		this.id = id;
	}
	public void display() {
		System.out.println(this.getName() + " " +this.id + " "  );
	}
}
