package package_odev2;

public class Instructor extends User {
	
	private String instructorCertification;
	private String twitterUserName;
	private String youtubeUserName;
	
	public String getInstructorCertifications() {
		return instructorCertification;
	}
	public void setInstructorCertifications(String instructorCertification) {
		this.instructorCertification = instructorCertification;
	}
	
	public String getTwitterUserName() {
		return twitterUserName;
	}
	public void setTwitterUserName(String twitterUserName) {
		this.twitterUserName = twitterUserName;
	}
	
	public String getYoutubeUserName() {
		return youtubeUserName;
	}
	public void setYoutubeUserName(String youtubeUserName) {
		this.youtubeUserName = youtubeUserName;
	}
	
	

}
