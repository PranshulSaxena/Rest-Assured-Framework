package pojoClassForBDD;

public class ProjectDetailsPojo {
	
	//Declare variabes globally
	String createdBy;
	String projectName;
	String Status;
	int teamSize;

	//Create an empty constructor for reading data(i.e Deserialization)
	public ProjectDetailsPojo()
	{
		
	}
	
	//Create a constructor for initializing global variables
	public ProjectDetailsPojo(String createdby, String projectname, String status, int teamsize) {
		super();
		createdBy = createdby;
		projectName = projectname;
		Status = status;
		teamSize = teamsize;
	}

	// Getters and Setters
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	
	
}
