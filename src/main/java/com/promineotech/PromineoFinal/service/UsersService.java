

@Service
public class UsersService {
	
	@Autowired
	UserRepository repo;
	
	public User getUser(Long id) {
		return repo.findOne(id);
	}
	
	public Iterable<User> getUsers() {
		return repo.findAll();
	}
	
	public User getUserByClassId(Long class_Id) {
		return repo.findAll(class_Id);
	}
	
	public User getUserById(Long id) {
		return repo.findOne(id);
	}
	
	public void deleteUser(Long id) {
		repo.delete(id);
	}
	
	public User updateUser(Long id, User user) {
		User foundUser = repo.findOne(id);
		if (foundUser != null) {
			foundUser.setFirstName(user.getFirstName());		
			foundUser.setLastName(user.getLastName());
			foundUser.setClassId(user.getClassId());
			repo.save(foundUser);
		}
		return foundUser;
	}
	
	public User addUser(User user) {
		return repo.save(user);
	}
	
}
