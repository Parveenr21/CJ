package CollectionFramework;

import java.util.Arrays;


//this has compareTo overriden for Arrays.sort which uses compareTo method for sorting
//this has overriden equals.. becaue we are using .equals to compare object..
//otherwise compareTo can also work

public class UserMetaData implements Comparable<UserMetaData>{

	private int tuid;
	private int gpid;
	private int tpid;
	private int percode;
	private int comcode;

	private String first_name;
	private String last_name;
	private String email;
	private String [] roles;
	private String status;
	private String parent_account_id;
	private String account_id;
	private String login;
//	protected final static Logger logger=Logger.getLogger(BaseTestClass.class);



	public UserMetaData(int tuid, int gpid, int tpid, int percode, int comcode,String first_name, String last_name,
			String email, String profile_status, String parent_account_id, String [] roles, String account_id, String login ){

		this.tuid=tuid;
		this.gpid=gpid;
		this.tpid=tpid;
		this.percode=percode;
		this.comcode=comcode;

		this.first_name=first_name;
		this.last_name=last_name;
		this.email=email;
		this.status=status;
		this.parent_account_id=parent_account_id;

		this.roles=roles;
		this.account_id=account_id;
		this.login=login;


	}




	public UserMetaData(int tuid, int gpid, int tpid, 
			String status, String account_id, String login , String parent_account_id, String firstName, String lastname ){

		this.tuid=tuid;
		this.gpid=gpid;
		this.tpid=tpid;

		this.status=status;
		this.parent_account_id=parent_account_id;
		this.account_id=account_id;
		this.login=login;
		this.first_name=firstName;
		this.last_name=lastname;
	}


	public UserMetaData(String status, String parent_account_id) {
		this.status = status;
		this.parent_account_id = parent_account_id;
	}




	public int getTUID()
	{

		return this.tuid;

	}









	
	
	

	



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((account_id == null) ? 0 : account_id.hashCode());
		result = prime * result + comcode;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result
				+ ((first_name == null) ? 0 : first_name.hashCode());
		result = prime * result + gpid;
		result = prime * result
				+ ((last_name == null) ? 0 : last_name.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime
				* result
				+ ((parent_account_id == null) ? 0 : parent_account_id
						.hashCode());
		result = prime * result + percode;
		result = prime * result + Arrays.hashCode(roles);
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + tpid;
		result = prime * result + tuid;
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserMetaData other = (UserMetaData) obj;
		if (account_id == null) {
			if (other.account_id != null)
				return false;
		} else if (!account_id.equals(other.account_id))
			return false;
		if (comcode != other.comcode)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (first_name == null) {
			if (other.first_name != null)
				return false;
		} else if (!first_name.equals(other.first_name))
			return false;
		if (gpid != other.gpid)
			return false;
		if (last_name == null) {
			if (other.last_name != null)
				return false;
		} else if (!last_name.equals(other.last_name))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (parent_account_id == null) {
			if (other.parent_account_id != null)
				return false;
		} else if (!parent_account_id.equals(other.parent_account_id))
			return false;
		if (percode != other.percode)
			return false;
		if (!Arrays.equals(roles, other.roles))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (tpid != other.tpid)
			return false;
		if (tuid != other.tuid)
			return false;
		return true;
	}




	public int compareTo(UserMetaData other) {

		//ascending sort


		//logger.info("sorting on the basis of TUID asc");

		return this.tuid - other.getTUID();
	}




}