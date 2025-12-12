import java.util.HashMap;

public class AuthService {
  private HashMap<String, User> users = new HashMap<>();

  public boolean register(String username, String password, String email) {
    if (user.containsKey(username)) {
      return false;
    }
    User user = new User(username, password, email);
    users.put(username, user);
    return true;
  }

public boolean login(String username, String password) {
  if (!users.containsKey(username)) {
    return false;
  }
  User user = users.get(username);
  return user.getPassword().equals(password);
}
}
