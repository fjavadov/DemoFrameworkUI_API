package api_automation.RequestBuilder;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class APIRequestBuilder {
	
	@JsonPropertyOrder({"name","email","gender","location"})
	private String name;
	private String email;
	private String gender;
	private String location;
	
	public String getName() {return name;	}

	public void setName(String name) {this.name = name;	}

	public String getEmail() {return email;	}

	public void setEmail(String email) {this.email = email;	}

	public String getGender() {return gender;	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String status) {
		this.location = status;
	}
}