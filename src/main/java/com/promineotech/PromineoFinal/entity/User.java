

@Entity
public class User {

	private Long id;
	private Long class_Id;
	private String firstName;
	private String lastName;
	
	
	@Id
	@GeneratedValue(stategy=GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Long getClass_Id() {
		return class_Id; 
	}
	
	public void setClass_Id(Long class_Id) {
		this.class_Id = class_Id;
	}

}
