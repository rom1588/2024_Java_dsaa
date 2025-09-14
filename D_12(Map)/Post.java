public class Post{
	private int code;
	private String address;
	public Post(int code, String address){
		this.code = code;
		this.address = address;
	}
	public void setCode(int code){
		this.code = code;
	}
	public int getCode(){
		return this.code;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return this.address;
	}
}