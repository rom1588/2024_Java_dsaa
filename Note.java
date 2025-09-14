public class Note{
	private Paper[] papers = new Paper[10];
	public Note() {
		for(int i = 0; i < this.papers.length; i++){
			Paper paper = new Paper();
			this.papers[i] = paper;
		}
	}
	public Paper get(int index){
		return this.papers[index];
	}
	public int size(){
		return this.papers.length;
	}
}