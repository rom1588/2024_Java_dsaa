public class PostPlus{
	private Post post;
	public PostPlus(Post post){
		this.post = post;
	}
	@Override
	public String toString(){
		return this.post.getCode() + " " + this.post.getAddress();
	}
}