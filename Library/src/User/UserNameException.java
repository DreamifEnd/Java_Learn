package User;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuyan
 * Date: 2023-01-10
 * Time: 18:11
 */
public class UserNameException extends RuntimeException {
    public UserNameException(String me) {
        super(me);
    }
}
