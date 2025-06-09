package java_with_dsa;
import java.util.*;
public class BFS {

	public static void main(String[] args) {
		Map<String,List<String>> house=new HashMap<>();
		house.put("livingroom", Arrays.asList("kitchen","bedroom","studyroom"));
		house.put("kitchen", Arrays.asList("bedroom"));
		house.put("bedroom", Arrays.asList("balcony"));
		house.put("studyroom",new ArrayList<String>());
		house.put("bathroom",new ArrayList<String>());
		house.put("balcony",new ArrayList<String>());
		
		System.out.println("Explore the house using bfs starting from living room.");
		bfs(house,"livingroom");
	}
	public static void bfs(Map<String,List<String>> house,String startroom) {
		
		Queue<String> q=new LinkedList<String>();
		Set<String> v=new HashSet<String>();
		q.add(startroom);
		v.add(startroom);
		while(!q.isEmpty()) {
			String croom=q.poll();
			System.out.println("visited "+croom);
			for(String n:house.get(croom)) {
				if(!v.contains(n)) {
					q.add(n);
					v.add(n);
				}
			}
		}
	}
}
