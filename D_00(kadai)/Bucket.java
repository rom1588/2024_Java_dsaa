public class Bucket{
	private String key;
	private Object data;
	private BucketStatus status = BucketStatus.EMPTY;
	public Bucket(){
	
	}
	public void setKeyData(String key, Object data){
		this.key = key;
		this.data = data;
		this.status = BucketStatus.USE;
	}
	public String getKey(){
		return this.key;
	}
	public Object getData(){
		return this.data;
	}
	public boolean isEmpty(){
		return this.status == BucketStatus.EMPTY;
	}
	public boolean isUse(){
		return this.status == BucketStatus.USE;
	}
	public boolean isRemoved(){
		return this.status == BucketStatus.REMOVED;
	}
	public void remove(){
		this.status = BucketStatus.REMOVED;
	}
	public String getString(){
		return this.key + " " + this.data.toString();
	}
}