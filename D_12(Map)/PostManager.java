public class PostManager{
	private Post post;
	public PostManager(Post post){
		this.post = post;
	}
	public String getString(){
		return this.post.getCode() + " " + this.post.getAddress();
	}
}