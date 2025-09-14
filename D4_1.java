public class D4_1{
	public static void main(String[] args){
		PostList postList = new PostList();
		postList.add(new Post(120, "Tokyo"));//0
		postList.add(new Post(270, "Chiba"));//1
		postList.add(new Post(350, "Saitama"));//2
		postList.add(new Post(400, "Yamanashi"));//3
		postList.add(new Post(600, "Kyoto"));//4
		postList.add(new Post(700, "Okinawa"));//5
		
		
		int key = 270;
		Post post = search(postList, key);
		print(post);
	}
	public static Post search(PostList postList, int key){
		int low = 0;
		int high = postList.size() -1;
		while (low <= high){
			int middle = (low + high) / 2;
			//System.out.println("middle:" + nuddle);
			Post post = postList.get(middle);
			int code = post.getCode();
			if(key == code){
				return post;
			}else if(key < code){
				high = middle - 1;
			}else{ //key > code
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