public class D3_1{
	public static void main(String[] args){
		PhoneBook phoneBook = new PhoneBook();
		phoneBook.add(new Phone("Nancy","1234"));
		phoneBook.add(new Phone("Tom","5678"));
		phoneBook.add(new Phone("Ann","9012"));
		
		
		String key = "Tom";
		Phone phone = search(phoneBook, key);
		print(phone);
	}
	public static Phone search(PhoneBook phoneBook, String key){
		int size = phoneBook.size();
		for(int i = 0; i < size; i++){
			Phone phone = phoneBook.get(i);
			String name = phone.getName();
			if(name.equals(key)){
				return phone;
			}
		}
		return null;
	}
	public static void print(Phone phone){
		System.out.print("name:" + phone.getName() + " ");
		System.out.println("number:" + phone.getNumber());
	}
}