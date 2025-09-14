public class D4_2{
	public static void main(String[] args){
		PostList postList = new PostList();
		
		postList.add(new Post(270, "Chiba"));//0
		postList.add(new Post(600, "Kyoto"));//1
		postList.add(new Post(700, "Okinawa"));//2
		postList.add(new Post(350, "Saitama"));//3
		postList.add(new Post(120, "Tokyo"));//4
		postList.add(new Post(400, "Yamanashi"));//5
		
		
		String key = "Tokyo";
		Post post = search(postList, key);
		print(post);
	}
	public static Post search(PostList postList, String key){
		int low = 0;
		int high = postList.size() -1;
		while (low <= high){
			int middle = (low + high) / 2;
			//System.out.println("middle:" + nuddle);
			Post post = postList.get(middle);
			String address = post.getAddress();
			if(key.compareTo(address) == 0){
				return post;
			}else if(key.compareTo(address) < 0){
				high = middle - 1;
			}else{ //key.compareTo(address) > 0
				low = middle + 1;
			}
		}
		return null;
	}
	public static void print(Post post){
		System.out.print("code:" + post.getCode() + " ");
		System.out.println("address:" + post.getAddress());
	}
}