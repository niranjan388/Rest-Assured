package POJO;

import java.util.List;

public class CreateProjectWithArray 
{
  String createdBy;
 String projectName;
 String status;
 int[]  teamSize;
 
 
 public CreateProjectWithArray() 
 {
 }
public CreateProjectWithArray(String createdBy, String projectName, String status, int[] i) 
{

	this.createdBy = createdBy;
	this.projectName = projectName;
	this.status = status;
	this.teamSize = i;
}


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
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public int[] getTeamSize() {
	return teamSize;
}

public void setTeamSize(int[] teamSize) {
	this.teamSize = teamSize;
}
 
 
 
 
}
