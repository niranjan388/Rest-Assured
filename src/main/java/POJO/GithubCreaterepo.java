package POJO;

public class GithubCreaterepo
{
	String name;
	String description;
	String homepage;
	public GithubCreaterepo(String name, String description, String homepage) {
		super();
		this.name = name;
		this.description = description;
		this.homepage = homepage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	

}