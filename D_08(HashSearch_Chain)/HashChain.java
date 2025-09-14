public class HashChain{
	private LinkBucket[] table;
	public HashChain(int size){
		this.table = new LinkBucket[size];
		for(int i = 0; i < size; i++){
			this.table[i] = new LinkBucket(null, "dummy");//dummy
		}
	}
	public void put(String key, Object data){
		int index = HashUtils.hash(this.table.length, key);
		LinkBucket linkBucket = this.table[index];//dummy
		while(linkBucket.getNext() != null){
			linkBucket = linkBucket.getNext();
		}
		linkBucket.setNext(new LinkBucket(key, data));
	}
	public Object get(String key){
		int index = HashUtils.hash(this.table.length, key);
		LinkBucket dummy = this.table[index];//dummy
		LinkBucket linkBucket = dummy.getNext();
		while(linkBucket != null){
			if(key.equals(linkBucket.getKey())){
				return linkBucket.getData();
			}
			linkBucket = linkBucket.getNext();
		}
		return null;
	}
	public void printTable(){
		for(int i = 0; i < this.table.length; i++){
			LinkBucket dummy = this.table[i];//dummy
			LinkBucket linkBucket = dummy.getNext();
			if(linkBucket != null){
				String s = i + ":" + linkBucket.getAllString();
				System.out.println(s);
			}
		}
	}
	public Object remove(String key){
		int index = HashUtils.hash(this.table.length, key);
		LinkBucket preLinkBucket = this.table[index];//dummy
		LinkBucket linkBucket = preLinkBucket.getNext();
	while(linkBucket != null){
		if(key.equals(linkBucket.getKey())){
			return linkBucket.getData();
		}
		preLinkBucket = linkBucket;
		linkBucket = linkBucket.getNext();
	}
	return null;
	}
}