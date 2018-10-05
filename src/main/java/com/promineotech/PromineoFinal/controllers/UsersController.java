

@RestController
public class UsersController {

	 
	
	@Autowired
	UsersService service;
	
	@RequestMapping("/users") 										//Retrieve all users
	public Iterable<User> getUsers() {
		return service.getUsers();
	}
	
	@RequestMapping(value="/users/{class_Id}") 						//Retrieve all users of a specific class/cohort
	public User getUserByClassId(@PathVariable Long class_Id) {
		return service.getUserByClassId(class_Id);
	}
	
	@RequestMapping(value="/users/{id}") 								//Retrieve user by a specific user id
	public User getUserById(@PathVariable Long id) {
		return service.getUserById(id);
	}
	
	@RequestMapping(value="/users/{id}", method=RequestMethod.PUT)  	//Update a specific user by user id
	public User updateUser(@PathVariable Long id) {
		return service.updateUser(id);
	}
	
	@RequestMapping(value="/users/{id}", method=RequestMethod.DELETE)  //Delete a specific user by user id
	public User deleteUser(@PathVariable Long id) {
		return service.deleteUser(id);
	}
	
	@RequestMapping(value="/users", method=RequestMethod.POST)  	 //Create a new user
	public User addUser(@RequestBody String firstName, String lastName) {
		return service.addUser(firstName, lastName);
	}
}
