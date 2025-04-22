package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamApi_Usage {

	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		users.add(new User(1, "burak"));
		users.add(new User(2, "ceren"));
		users.add(new User(3, "kenan"));
		users.add(new User(4, "semih"));
		users.add(new User(5, "erkan"));
		users.add(new User(6, "mert"));
		users.add(new User(7, "kaan"));

		users.stream()
		.forEach(user -> {
			System.out.println(user.toString());
			user.talk();
		});
		
		System.out.println();
		
		users.stream()
		.forEach(User :: talk); // method reference (class içindeki methoda referans yoluyla erişilir)
		
		System.out.println();
		
		// burada stream altındaki filter methodunu kullandık
		// filtre içinde uygulanmışon şartın sayısını bulmak için count methodunu kullandık.
		// count() metodu bize long veri tipinde bir değre döndürücek. 
 		long count = users.stream().filter(user -> user.id>5).count();
		System.out.println("id değeri 5 üzeri olan user sayısı : " + count);
	
		System.out.println();
		
		// eğer filtre işleminde sonra filtreye uyan bilgileri kullanmak için collect() metdou kullanırız.
		List<User> filteredUsers =  users.stream()
		.filter(user -> user.id>5)
		.collect(Collectors.toList());
		
		filteredUsers.stream()
		.forEach(User :: talk);
		
		System.out.println();
		
		// map() -> dönüştürme 
		List<User> mappedUsers =  users.stream()
		.map(user -> new User(user.id + 100, user.name))
		.collect(Collectors.toList());
		
		mappedUsers.stream()
		.forEach(user -> System.out.println(user.toString()));
		
		System.out.println();
		
		// list yapısından map oluşturma
		Map<Integer, String> listToMap =  users.stream()
		.collect(Collectors.toMap(user -> user.id, user -> user.name));
 	
		listToMap.forEach((key , value) -> System.out.println(key + " : "+ value));
	
	}

}








