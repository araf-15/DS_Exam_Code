
public class Application {
	public static void main(String[] args){
		
		User user = new User();
		user.userName = "Araf";
		user.email = "araf@gmail.com";
		user.address = "Mirpur";
		user.password ="123";
		
		UserRepository repo = new UserRepository();
		repo.addUser(user);
		repo.removeUser(user);
		repo.getUser(1);
		repo.UpdateUser(user);
		
		
	}
}
