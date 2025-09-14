public class HashOpenAddress{
	private Bucket[] table;
	public HashOpenAddress(int size){
		this.table = new Bucket[size];
		for(int i = 0; i < size; i++){
			this.table[i] = new Bucket();
		}
	}
	public int rehash(int value){
		return (value + 1) % this.table.length;
	}
	public void put(String key, Object data){
		int index = HashUtils.hash(this.table.length, key);
		for(int i = 0; i < this.table.length; i++){
			Bucket bucket = this.table[index];
			if(!bucket.isUse()){
				bucket.setKeyData(key, data);
				return;
			}
			index = this.rehash(index);
		}
	}
	public Bucket getBucket(String key){
		int index = HashUtils.hash(this.table.length, key);
		for(int i = 0; i < this.table.length; i++){
			Bucket bucket = this.table[index];
			if(bucket.isUse() && key.equals(bucket.getKey())){
				return bucket;
			}else if(bucket.isEmpty()){
				return null;
			}
			index = this.rehash(index);
		}
		return null;
	}
	public Object get(String key){
		Bucket bucket = this.getBucket(key);
		if(bucket != null){
			return bucket.getData();
		}
		return null;
	}
	public Object remove(String key){
		Bucket bucket = this.getBucket(key);
		if(bucket != null){
			bucket.remove();
			return bucket.getData();
		}
		return null;
	}
	public void printTable(){
		for(int i = 0; i < this.table.length; i++){
			Bucket bucket = this.table[i];
			if(bucket.isUse()){
				String s = bucket.getString();
				System.out.println(i + ":USE:" + s);
			}else if(bucket.isRemoved()){
				System.out.println(i + ":REMOVED:");
			}else if(bucket.isEmpty()){
				//System.out.println(i + ":EMPTY:")
			}
		}
	}
}