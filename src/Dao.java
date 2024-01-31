import java.sql.Connection;
import java.util.logging.Logger;
public interface Dao<T> 
{
	public static Connection connection = Bddconnection.getconnection();
	public static final Logger logger = logger.getLogger(Dao.class.getName());
}
